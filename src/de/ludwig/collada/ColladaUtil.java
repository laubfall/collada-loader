package de.ludwig.collada;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.khronos.collada.AnimationType;
import com.khronos.collada.COLLADA;
import com.khronos.collada.GeometryType;
import com.khronos.collada.ImageType;
import com.khronos.collada.VisualSceneType;

public class ColladaUtil {
	public static List<AnimationType> animations(COLLADA collada, String prefix){
		final List<Object> libraries = collada.getLibraryAnimationsOrLibraryAnimationClipsOrLibraryCameras();
		final List<AnimationType> result = new ArrayList<AnimationType>();
		int cnt = 0;
		for(Object obj : libraries){
			if(obj instanceof AnimationType){
				final AnimationType anim = (AnimationType) obj;
				anim.setId(prefix + (cnt++));
				result.add(anim);
			}
		}
		return result;
	}
	
	public static List<ImageType> images(COLLADA collada, String prefix){
		final List<Object> libraries = collada.getLibraryAnimationsOrLibraryAnimationClipsOrLibraryCameras();
		final List<ImageType> result = new ArrayList<ImageType>();
		int cnt = 0;
		for(Object obj : libraries){
			if(obj instanceof AnimationType){
				final ImageType anim = (ImageType) obj;
				anim.setId(prefix + (cnt++));
				result.add(anim);
			}
		}
		return result;
	}
	
	public static List<GeometryType> geometries(COLLADA collada, String prefix){
		final List<Object> libraries = collada.getLibraryAnimationsOrLibraryAnimationClipsOrLibraryCameras();
		final List<GeometryType> result = new ArrayList<GeometryType>();
		int cnt = 0;
		for(Object obj : libraries){
			if(obj instanceof AnimationType){
				final GeometryType anim = (GeometryType) obj;
				anim.setId(prefix + (cnt++));
				result.add(anim);
			}
		}
		return result;
	}
	
	public static List<VisualSceneType> visualScenes(COLLADA collada, String prefix){
		final List<Object> libraries = collada.getLibraryAnimationsOrLibraryAnimationClipsOrLibraryCameras();
		final List<VisualSceneType> result = new ArrayList<VisualSceneType>();
		int cnt = 0;
		for(Object obj : libraries){
			if(obj instanceof AnimationType){
				final VisualSceneType anim = (VisualSceneType) obj;
				anim.setId(prefix + (cnt++));
				result.add(anim);
			}
		}
		return result;
	}
	
//	private Map<String, T> parseLib ( String q, Class<T> classSpec, String prefix ) {
//		
////		var elements = COLLADA.querySelectorAll(q);
////		var lib = {};
////		var i = 0;
////		var elementsLength = elements.length;
////
////		for ( var j = 0; j < elementsLength; j ++ ) {
////
////			var element = elements[j];
////			var daeElement = ( classSpec.newInstance() ).parse( element );
////
////			if ( !daeElement.id || daeElement.id.length == 0 ) daeElement.id = prefix + ( i ++ );
////			lib[ daeElement.id ] = daeElement;
////
////		}
////
////		return lib;
//		final List<Object> libraries = COLLADA.getLibraryAnimationsOrLibraryAnimationClipsOrLibraryCameras();
//		final List<Object> result = new ArrayList<>();
//		for(final Object libObj : libraries){
//			if(libObj.getClass().isAssignableFrom(classSpec)){
//				// TODO
//			}
//		}
//		return null;
//	}
}
