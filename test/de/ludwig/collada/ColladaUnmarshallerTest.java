package de.ludwig.collada;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import com.khronos.collada.COLLADA;

public class ColladaUnmarshallerTest {
	@Test
	public void unmarshall(){
		ColladaUnmarshaller cu = new ColladaUnmarshaller();
		UnmarshallResult result = cu.unmarshal(new File("test/resources/movingcube.dae"));
		COLLADA collada = result.getDoc();
		Assert.assertNotNull(collada.getAsset());
		Assert.assertNotNull(collada);
	}
}
