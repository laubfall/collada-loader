package de.ludwig.collada;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.khronos.collada.COLLADA;

public class ColladaUnmarshaller {

	public COLLADA unmarshal(final File collada) {
		try {
			Unmarshaller u = JAXBContext.newInstance(
					"com.khronos.collada:org.w3.mathml2").createUnmarshaller();

			final COLLADA unmarshal = (COLLADA) u.unmarshal(collada);
			return unmarshal;
		} catch (JAXBException e) {
			throw new ColladaProcessException(e);
		}
	}	
}
