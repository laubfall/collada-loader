package de.ludwig.collada;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Unmarshaller.Listener;

import com.khronos.collada.AssetType;
import com.khronos.collada.COLLADA;

import de.ludwig.collada.base.refine.RefineContext;
import de.ludwig.collada.base.refine.Refiner;
import de.ludwig.collada.structures.Options;

public class ColladaUnmarshaller {

	public UnmarshallResult unmarshal(final File collada) {
		try {
			Unmarshaller u = JAXBContext.newInstance(
					"com.khronos.collada:org.w3.mathml2").createUnmarshaller();
			final RefiningListener refiningListener = new RefiningListener();
			u.setListener(refiningListener);
			final COLLADA unmarshal = (COLLADA) u.unmarshal(collada);
			final UnmarshallResult result = new UnmarshallResult(unmarshal);
			final RefineContext rctx = new RefineContext(new Options());
	
			AssetType asset = unmarshal.getAsset();
			double colladaUnit = asset.getUnit().getMeter();
			char colladaUp = asset.getUpAxis().name().charAt(0);
			rctx.colladaUnit = colladaUnit;
			rctx.colladaUp = colladaUp;
			rctx.init();
			
			for (Refiner ref : refiningListener.objectToRefine) {
				ref.refine(rctx);
			}
			return result;
		} catch (JAXBException e) {
			throw new ColladaProcessException(e);
		}
	}

	private class RefiningListener extends Listener {
		Set<Refiner> objectToRefine = new HashSet<>();

		@Override
		public void afterUnmarshal(Object target, Object parent) {
			final Refiner create = Refiner.create(target);
			if (create != null) {
				objectToRefine.add(create);
			}
		}
	}
	
}
