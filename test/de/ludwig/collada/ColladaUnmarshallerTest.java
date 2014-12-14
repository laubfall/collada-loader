package de.ludwig.collada;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import com.khronos.collada.COLLADA;

public class ColladaUnmarshallerTest {
	@Test
	public void unmarshall(){
		ColladaUnmarshaller cu = new ColladaUnmarshaller();
		COLLADA collada = cu.unmarshal(new File("test/resources/movingcube.dae"));
		Assert.assertNotNull(collada.getAsset());
		Assert.assertNotNull(collada);
	}
}
