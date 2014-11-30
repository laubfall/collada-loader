package de.ludwig.collada;


@Deprecated
public class ColladaLoader {
//
//		private Logger console = null;
//		private com.khronos.collada.COLLADA COLLADA = null;
//		Object3D scene = null;
//		VisualSceneType daeScene;
//
//		ReadyCallback readyCallbackFunc = null;
//
//		SourceType [] sources;
//		private List<ImageType> images;
//		private List<AnimationType> animations;
//		ControllerType [] controllers;
//		private List<GeometryType> geometries;
//		MaterialType [] materials;
//		EffectType [] effects;
//		CameraType [] cameras;
//		LightType [] lights;
//
//		Void animData;
//		
//		// holds some scene urls
//		List<VisualSceneType> visualScenes = new ArrayList<>();
//		Void baseUrl;
//		Void morphs;
//		Void skins;
//
//		private boolean flip_uv = true;
//		private ThreeJSShading preferredShading = ThreeJSShading.SmoothShading;
//
//		// TODO die fliegen hier raus, sind im Unmarshaller untergebracht.
//		Options options = new Options();
//		
//		// In den Unmarshaller gewandert
////		private double colladaUnit = 1.0d;
////		private char colladaUp = 'Y';
////		String upConversion = null;
//		
//		
//
//		private void parse(com.khronos.collada.COLLADA doc, final String url, final ReadyCallback callback ) {
//
//			COLLADA = doc;
//
//			// TODO required?
////			var parts = url.split( '/' );
////			parts.pop();
////			baseUrl = ( parts.length < 1 ? '.' : parts.join( '/' ) ) + '/';
//
////			parseAsset();
////			setUpConversion();
//			images = ColladaUtil.images(COLLADA, "image");
////			images = parseLib( "library_images image", ImageType.class, "image" );
////			materials = parseLib( "library_materials material", MaterialType.class, "material" );
////			effects = parseLib( "library_effects effect", EffectType.class, "effect" );
////			geometries = parseLib( "library_geometries geometry", GeometryType.class, "geometry" );
//			geometries = ColladaUtil.geometries(COLLADA, "geometry");
////			cameras = parseLib( "library_cameras camera", CameraType.class, "camera" );
////			lights = parseLib( "library_lights light", LightType.class, "light" );
////			controllers = parseLib( "library_controllers controller", ControllerType.class, "controller" );
////			animations = parseLib( "library_animations animation", AnimationType.class, "animation" );
//			animations = ColladaUtil.animations(collada, "animation");
////			visualScenes = parseLib( "library_visual_scenes visual_scene", VisualSceneType.class, "visual_scene" );
//			visualScenes = ColladaUtil.visualScenes(COLLADA, "visual_scenes");
//			
//			// TODO
////			morphs = [];
////			skins = [];
//
//			daeScene = parseScene();
//			
//			scene = new Object3D();
//			// TODO providing scene nodes.
////			for ( var i = 0; i < daeScene.nodes.length; i ++ ) {
////				scene.add( createSceneGraph( daeScene.nodes[ i ] ) );
////			}
//			// unit conversion
////			scene.scale.multiplyScalar( colladaUnit );
//
//			createAnimations();
//
//			// TODO fill ParserResult result.
//			final ParserResult result = new ParserResult();
//			if ( callback != null ) {
//				callback.onReady(result);
//			}
//
//			return result;
//
//		}
//
//		private void setPreferredShading (ThreeJSShading shading ) {
//			preferredShading = shading;
//		}
//		
//		// !!! parseLib moved to ColladaUtil !!!
//
//		private VisualSceneType parseScene() {
//		
//			InstanceWithExtraType sceneElement = COLLADA.getScene().getInstanceVisualScene();
//			if(sceneElement == null){
//				return null;
//			}
//			
//			final String url = sceneElement.getUrl();
//			String matcher = (url != null && "".equals(url) == false)?url:"visual_scene0";
//			for(VisualSceneType vst : visualScenes){
//				if(matcher.equals(vst.getId())){
//					return vst;
//				}
//			}
//			
//			return null;
//		}
//
//		private void createAnimations() {
//
//			animData = [];
//
//			// fill in the keys
//			recurseHierarchy( scene );
//
//		}
//
//		private void recurseHierarchy(Object3D node) {
//
//			var n = daeScene.getChildById( node.id, true ),
//			newData = null;
//
//			if ( n && n.keys ) {
//
//				newData = {
//					fps: 60,
//					hierarchy: [ {
//						node: n,
//						keys: n.keys,
//						sids: n.sids
//					} ],
//					node: node,
//					name: 'animation_' + node.name,
//					length: 0
//				};
//
//				animData.push(newData);
//
//				for ( var i = 0, il = n.keys.length; i < il; i++ ) {
//					newData.length = Math.max( newData.length, n.keys[i].time );
//				}
//			} else  {
//				newData = {
//					hierarchy: [ {
//						keys: [],
//						sids: []
//					} ]
//				}
//			}
//
//			for ( var i = 0, il = node.children.length; i < il; i++ ) {
//				var d = recurseHierarchy( node.children[i] );
//				for ( var j = 0, jl = d.hierarchy.length; j < jl; j ++ ) {
//					newData.hierarchy.push( {
//						keys: [],
//						sids: []
//					} );
//				}
//			}
//
//			return newData;
//
//		}
//
//		private AnimationBounds calcAnimationBounds () {
//
//			long start = 1000000;
//			long end = -start;
//			long frames = 0;
//			String ID;
//			
//			for (AnimationType animation : animations) {
//				ID = ID || animation.getId(); 
//				// TODO sampler???
//				for ( int i = 0; i < animation.sampler.length; i ++ ) {
//
//					var sampler = animation.sampler[ i ];
//					
//					sampler.create();
//
//					start = Math.min( start, sampler.startTime );
//					end = Math.max( end, sampler.endTime );
//					frames = Math.max( frames, sampler.input.length );
//
//				}
//
//			}
//
//			final AnimationBounds bounds = new AnimationBounds(start, end, frames, ID);
////			return { start:start, end:end, frames:frames,ID:ID };
//			return bounds;
//		}
//
//		private void createMorph (GeometryType geometry, Object ctrl ) {
//			var morphCtrl = ctrl instanceof InstanceController ? controllers[ ctrl.url ] : ctrl;
//			if ( !morphCtrl || !morphCtrl.morph ) {
//				console.log("could not find morph controller!");
//				return;
//
//			}
//
//			var morph = morphCtrl.morph;
//
//			for ( var i = 0; i < morph.targets.length; i ++ ) {
//
//				var target_id = morph.targets[ i ];
//				var daeGeometry = geometries[ target_id ];
//
//				if ( !daeGeometry.mesh ||
//					 !daeGeometry.mesh.primitives ||
//					 !daeGeometry.mesh.primitives.length ) {
//					 continue;
//				}
//
//				var target = daeGeometry.mesh.primitives[ 0 ].geometry;
//
//				if ( target.vertices.length === geometry.vertices.length ) {
//
//					geometry.morphTargets.push( { name: "target_1", vertices: target.vertices } );
//
//				}
//
//			}
//
//			geometry.morphTargets.push( { name: "target_Z", vertices: geometry.vertices } );
//
//		}
//
//		function createSkin ( geometry, ctrl, applyBindShape ) {
//
//			var skinCtrl = controllers[ ctrl.url ];
//
//			if ( !skinCtrl || !skinCtrl.skin ) {
//
//				console.log( "could not find skin controller!" );
//				return;
//
//			}
//
//			if ( !ctrl.skeleton || !ctrl.skeleton.length ) {
//
//				console.log( "could not find the skeleton for the skin!" );
//				return;
//
//			}
//
//			var skin = skinCtrl.skin;
//			var skeleton = daeScene.getChildById( ctrl.skeleton[ 0 ] );
//			var hierarchy = [];
//
//			applyBindShape = applyBindShape !== undefined ? applyBindShape : true;
//
//			var bones = [];
//			geometry.skinWeights = [];
//			geometry.skinIndices = [];
//
//			//createBones( geometry.bones, skin, hierarchy, skeleton, null, -1 );
//			//createWeights( skin, geometry.bones, geometry.skinIndices, geometry.skinWeights );
//
//			/*
//			geometry.animation = {
//				name: 'take_001',
//				fps: 30,
//				length: 2,
//				JIT: true,
//				hierarchy: hierarchy
//			};
//			*/
//
//			if ( applyBindShape ) {
//
//				for ( var i = 0; i < geometry.vertices.length; i ++ ) {
//
//					geometry.vertices[ i ].applyMatrix4( skin.bindShapeMatrix );
//
//				}
//
//			}
//
//		}
//
//		function setupSkeleton ( node, bones, frame, parent ) {
//
//			node.world = node.world || new THREE.Matrix4();
//			node.localworld = node.localworld || new THREE.Matrix4();
//			node.world.copy( node.matrix );
//			node.localworld.copy( node.matrix );
//
//			if ( node.channels && node.channels.length ) {
//
//				var channel = node.channels[ 0 ];
//				var m = channel.sampler.output[ frame ];
//
//				if ( m instanceof THREE.Matrix4 ) {
//
//					node.world.copy( m );
//					node.localworld.copy(m);
//					if(frame == 0)
//						node.matrix.copy(m);
//				}
//
//			}
//
//			if ( parent ) {
//
//				node.world.multiplyMatrices( parent, node.world );
//
//			}
//
//			bones.push( node );
//
//			for ( var i = 0; i < node.nodes.length; i ++ ) {
//
//				setupSkeleton( node.nodes[ i ], bones, frame, node.world );
//
//			}
//
//		}
//
//		function setupSkinningMatrices ( bones, skin ) {
//
//			// FIXME: this is dumb...
//			
//			for ( var i = 0; i < bones.length; i ++ ) {
//			
//				var bone = bones[ i ];
//				var found = -1;
//
//				if ( bone.type != 'JOINT' ) continue;
//
//				for ( var j = 0; j < skin.joints.length; j ++ ) {
//
//					if ( bone.sid == skin.joints[ j ] ) {
//
//						found = j;
//						break;
//
//					}
//
//				}
//
//				if ( found >= 0 ) {
//
//					var inv = skin.invBindMatrices[ found ];
//
//					bone.invBindMatrix = inv;
//					bone.skinningMatrix = new THREE.Matrix4();
//					bone.skinningMatrix.multiplyMatrices(bone.world, inv); // (IBMi * JMi)
//					bone.animatrix = new THREE.Matrix4();
//
//					bone.animatrix.copy(bone.localworld);
//					bone.weights = [];
//					for ( var j = 0; j < skin.weights.length; j ++ ) {
//						for (var k = 0; k < skin.weights[ j ].length; k ++ ) {
//							var w = skin.weights[ j ][ k ];
//							if ( w.joint == found ) {
//								bone.weights.push( w );
//							}
//						}
//					}
//
//				} else {
//					console.warn( "ColladaLoader: Could not find joint '" + bone.sid + "'." );
//					bone.skinningMatrix = new THREE.Matrix4();
//					bone.weights = [];
//
//				}
//			}
//
//		}
//
//		//Walk the Collada tree and flatten the bones into a list, extract the position, quat and scale from the matrix
//		function flattenSkeleton(skeleton) {
//
//			var list = [];
//			var walk = function(parentid, node, list) {
//
//				var bone = {};
//				bone.name = node.sid;
//				bone.parent = parentid;
//				bone.matrix = node.matrix;
//				var data = [new THREE.Vector3(),new THREE.Quaternion(),new THREE.Vector3()];
//				bone.matrix.decompose(data[0],data[1],data[2]);
//								
//				bone.pos = [data[0].x,data[0].y,data[0].z];
//								
//				bone.scl = [data[2].x,data[2].y,data[2].z];
//				bone.rotq = [data[1].x,data[1].y,data[1].z,data[1].w];
//				list.push(bone);
//
//				for(var i in node.nodes) {
//
//					walk(node.sid,node.nodes[i],list);
//
//				}
//
//			};
//
//			walk(-1,skeleton,list);
//			return list;
//
//		}
//
//		//Move the vertices into the pose that is proper for the start of the animation
//		function skinToBindPose(geometry,skeleton,skinController) {
//
//			var bones = [];
//			setupSkeleton( skeleton, bones, -1 );
//			setupSkinningMatrices( bones, skinController.skin );
//			v = new THREE.Vector3();
//			var skinned = [];
//
//			for(var i =0; i < geometry.vertices.length; i++) {
//
//				skinned.push(new THREE.Vector3());
//
//			}
//
//			for ( i = 0; i < bones.length; i ++ ) {
//
//				if ( bones[ i ].type != 'JOINT' ) continue;
//
//				for ( j = 0; j < bones[ i ].weights.length; j ++ ) {
//
//					w = bones[ i ].weights[ j ];
//					vidx = w.index;
//					weight = w.weight;
//
//					o = geometry.vertices[vidx];
//					s = skinned[vidx];
//					
//					v.x = o.x;
//					v.y = o.y;
//					v.z = o.z;
//
//					v.applyMatrix4( bones[i].skinningMatrix );
//
//					s.x += (v.x * weight);
//					s.y += (v.y * weight);
//					s.z += (v.z * weight);
//				}
//
//			}
//
//			for(var i =0; i < geometry.vertices.length; i++) {
//
//				geometry.vertices[i] = skinned[i];
//
//			}
//
//		}
//
//		function applySkin ( geometry, instanceCtrl, frame ) {
//
//			// TODO: get this from the renderer or options
//			var maxbones = 30;
//			
//			var skinController = controllers[ instanceCtrl.url ];
//
//			frame = frame !== undefined ? frame : 40;
//
//			if ( !skinController || !skinController.skin ) {
//
//				console.log( 'ColladaLoader: Could not find skin controller.' );
//				return;
//
//			}
//
//			if ( !instanceCtrl.skeleton || !instanceCtrl.skeleton.length ) {
//
//				console.log( 'ColladaLoader: Could not find the skeleton for the skin. ' );
//				return;
//
//			}
//
//			var animationBounds = calcAnimationBounds();
//			var skeleton = daeScene.getChildById( instanceCtrl.skeleton[0], true ) ||
//						   daeScene.getChildBySid( instanceCtrl.skeleton[0], true );
//			
//			//flatten the skeleton into a list of bones
//			var bonelist = flattenSkeleton(skeleton);
//			var joints = skinController.skin.joints;
//
//			//sort that list so that the order reflects the order in the joint list
//			var sortedbones = [];
//			for(var i = 0; i < joints.length; i++) {
//				for(var j =0; j < bonelist.length; j++) {
//					if(bonelist[j].name == joints[i]) {
//						sortedbones[i] = bonelist[j];
//					}
//				}
//			}
//
//			//hook up the parents by index instead of name
//			for(var i = 0; i < sortedbones.length; i++) {
//				for(var j =0; j < sortedbones.length; j++) {
//					if(sortedbones[i].parent == sortedbones[j].name) {
//						sortedbones[i].parent = j;
//					}
//				}
//			}
//
//			var i, j, w, vidx, weight;
//			var v = new THREE.Vector3(), o, s;
//
//			// move vertices to bind shape
//			for ( i = 0; i < geometry.vertices.length; i ++ ) {
//						geometry.vertices[i].applyMatrix4( skinController.skin.bindShapeMatrix );
//			}
//
//			var skinIndices = [];
//			var skinWeights = [];
//			var weights = skinController.skin.weights;
//
//			//hook up the skin weights
//			// TODO -  this might be a good place to choose greatest 4 weights
//			for(var i =0; i < weights.length; i++) {
//
//				var indicies = new THREE.Vector4(weights[i][0]?weights[i][0].joint:0,weights[i][1]?weights[i][1].joint:0,weights[i][2]?weights[i][2].joint:0,weights[i][3]?weights[i][3].joint:0);
//				var weight = new THREE.Vector4(weights[i][0]?weights[i][0].weight:0,weights[i][1]?weights[i][1].weight:0,weights[i][2]?weights[i][2].weight:0,weights[i][3]?weights[i][3].weight:0);
//				
//				skinIndices.push(indicies);
//				skinWeights.push(weight);
//
//			}
//
//			geometry.skinIndices = skinIndices;
//			geometry.skinWeights = skinWeights;
//			geometry.bones = sortedbones;
//			// process animation, or simply pose the rig if no animation
//			
//			//create an animation for the animated bones
//			//NOTE: this has no effect when using morphtargets
//			var animationdata = {"name":animationBounds.ID,"fps":30,"length":animationBounds.frames/30,"hierarchy":[]};
//
//			for(var j =0; j < sortedbones.length; j++) {
//
//				animationdata.hierarchy.push({parent:sortedbones[j].parent, name:sortedbones[j].name, keys:[]});
//
//			}
//
//			//if using hardware skinning, move the vertices into the binding pose
//			if(sortedbones.length < maxbones) {
//
//				skinToBindPose(geometry,skeleton,skinController);
//
//			}
//
//			for ( frame = 0; frame < animationBounds.frames; frame ++ ) {
//
//				var bones = [];
//				var skinned = [];
//				// process the frame and setup the rig with a fresh
//				// transform, possibly from the bone's animation channel(s)
//
//				setupSkeleton( skeleton, bones, frame );
//				setupSkinningMatrices( bones, skinController.skin );
//
//				//if using hardware skinning, just hook up the animiation data
//				if(sortedbones.length < maxbones) {
//
//					for(var i = 0; i < bones.length; i ++) {
//
//						for(var j = 0; j < animationdata.hierarchy.length; j ++) {
//
//							if(animationdata.hierarchy[j].name == bones[i].sid) {
//
//								var key = {};
//								key.time = (frame/30);
//								key.matrix = bones[i].animatrix;
//								
//								if(frame == 0)
//									bones[i].matrix = key.matrix;
//								
//								var data = [new THREE.Vector3(),new THREE.Quaternion(),new THREE.Vector3()];
//								key.matrix.decompose(data[0],data[1],data[2]);
//								
//								key.pos = [data[0].x,data[0].y,data[0].z];
//								
//								key.scl = [data[2].x,data[2].y,data[2].z];
//								key.rot = data[1];
//
//								animationdata.hierarchy[j].keys.push(key);
//
//							}
//
//						}
//
//					}
//
//					geometry.animation = animationdata;
//
//				} else {
//
//					// otherwise, process the animation into morphtargets
//					
//					for ( i = 0; i < geometry.vertices.length; i++ ) {
//
//						skinned.push( new THREE.Vector3() );
//
//					}
//
//					for ( i = 0; i < bones.length; i ++ ) {
//
//						if ( bones[ i ].type != 'JOINT' ) continue;
//
//						for ( j = 0; j < bones[ i ].weights.length; j ++ ) {
//
//							w = bones[ i ].weights[ j ];
//							vidx = w.index;
//							weight = w.weight;
//
//							o = geometry.vertices[vidx];
//							s = skinned[vidx];
//
//							v.x = o.x;
//							v.y = o.y;
//							v.z = o.z;
//
//							v.applyMatrix4( bones[i].skinningMatrix );
//
//							s.x += (v.x * weight);
//							s.y += (v.y * weight);
//							s.z += (v.z * weight);
//
//						}
//
//					}
//				geometry.morphTargets.push( { name: "target_" + frame, vertices: skinned } );
//				}
//			}
//		};
//
//		function createSceneGraph ( node, parent ) {
//
//			var obj = new THREE.Object3D();
//			var skinned = false;
//			var skinController;
//			var morphController;
//			var i, j;
//
//			// FIXME: controllers
//
//			for ( i = 0; i < node.controllers.length; i ++ ) {
//
//				var controller = controllers[ node.controllers[ i ].url ];
//
//				switch ( controller.type ) {
//
//					case 'skin':
//
//						if ( geometries[ controller.skin.source ] ) {
//
//							var inst_geom = new InstanceGeometry();
//
//							inst_geom.url = controller.skin.source;
//							inst_geom.instance_material = node.controllers[ i ].instance_material;
//
//							node.geometries.push( inst_geom );
//							skinned = true;
//							skinController = node.controllers[ i ];
//
//						} else if ( controllers[ controller.skin.source ] ) {
//
//							// urgh: controller can be chained
//							// handle the most basic case...
//
//							var second = controllers[ controller.skin.source ];
//							morphController = second;
//						//	skinController = node.controllers[i];
//
//							if ( second.morph && geometries[ second.morph.source ] ) {
//
//								var inst_geom = new InstanceGeometry();
//
//								inst_geom.url = second.morph.source;
//								inst_geom.instance_material = node.controllers[ i ].instance_material;
//								node.geometries.push( inst_geom );
//							}
//						}
//
//						break;
//
//					case 'morph':
//
//						if ( geometries[ controller.morph.source ] ) {
//
//							var inst_geom = new InstanceGeometry();
//
//							inst_geom.url = controller.morph.source;
//							inst_geom.instance_material = node.controllers[ i ].instance_material;
//
//							node.geometries.push( inst_geom );
//							morphController = node.controllers[ i ];
//
//						}
//
//						console.log( 'ColladaLoader: Morph-controller partially supported.' );
//
//					default:
//						break;
//
//				}
//
//			}
//
//			// geometries
//
//			var double_sided_materials = {};
//
//			for ( i = 0; i < node.geometries.length; i ++ ) {
//
//				var instance_geometry = node.geometries[i];
//				var instance_materials = instance_geometry.instance_material;
//				var geometry = geometries[ instance_geometry.url ];
//				var used_materials = {};
//				var used_materials_array = [];
//				var num_materials = 0;
//				var first_material;
//
//				if ( geometry ) {
//
//					if ( !geometry.mesh || !geometry.mesh.primitives )
//						continue;
//
//					if ( obj.name.length == 0 ) {
//
//						obj.name = geometry.id;
//
//					}
//
//					// collect used fx for this geometry-instance
//
//					if ( instance_materials ) {
//
//						for ( j = 0; j < instance_materials.length; j ++ ) {
//
//							var instance_material = instance_materials[ j ];
//							var mat = materials[ instance_material.target ];
//							var effect_id = mat.instance_effect.url;
//							var shader = effects[ effect_id ].shader;
//							var material3js = shader.material;
//
//							if ( geometry.doubleSided ) {
//
//								if ( !( instance_material.symbol in double_sided_materials ) ) {
//
//									var _copied_material = material3js.clone();
//									_copied_material.side = THREE.DoubleSide;
//									double_sided_materials[ instance_material.symbol ] = _copied_material;
//
//								}
//
//								material3js = double_sided_materials[ instance_material.symbol ];
//
//							}
//
//							material3js.opacity = !material3js.opacity ? 1 : material3js.opacity;
//							used_materials[ instance_material.symbol ] = num_materials;
//							used_materials_array.push( material3js );
//							first_material = material3js;
//							first_material.name = mat.name == null || mat.name === '' ? mat.id : mat.name;
//							num_materials ++;
//
//						}
//
//					}
//
//					var mesh;
//					var material = first_material || new THREE.MeshLambertMaterial( { color: 0xdddddd, shading: THREE.FlatShading, side: geometry.doubleSided ? THREE.DoubleSide : THREE.FrontSide } );
//					var geom = geometry.mesh.geometry3js;
//
//					if ( num_materials > 1 ) {
//
//						material = new THREE.MeshFaceMaterial( used_materials_array );
//
//						for ( j = 0; j < geom.faces.length; j ++ ) {
//
//							var face = geom.faces[ j ];
//							face.materialIndex = used_materials[ face.daeMaterial ]
//
//						}
//
//					}
//
//					if ( skinController !== undefined ) {
//
//						
//						applySkin( geom, skinController );
//
//						if(geom.morphTargets.length > 0) {
//
//							material.morphTargets = true;
//							material.skinning = false;
//
//						} else {
//
//							material.morphTargets = false;
//							material.skinning = true;
//
//						}				
//						
//
//						mesh = new THREE.SkinnedMesh( geom, material, false );
//
//
//						//mesh.skeleton = skinController.skeleton;
//						//mesh.skinController = controllers[ skinController.url ];
//						//mesh.skinInstanceController = skinController;
//						mesh.name = 'skin_' + skins.length;
//
//						
//						
//						//mesh.animationHandle.setKey(0);
//						skins.push( mesh );
//
//					} else if ( morphController !== undefined ) {
//
//						createMorph( geom, morphController );
//
//						material.morphTargets = true;
//
//						mesh = new THREE.Mesh( geom, material );
//						mesh.name = 'morph_' + morphs.length;
//
//						morphs.push( mesh );
//
//					} else {
//
//						mesh = new THREE.Mesh( geom, material );
//						// mesh.geom.name = geometry.id;
//
//					}
//
//					// N.B.: TP says this is not a great default behavior. It's a nice
//					// optimization to flatten the hierarchy but this should be done
//					// only if requested by the user via a flag. For now I undid it
//					// and fixed the character animation example that uses it
//					// node.geometries.length > 1 ? obj.add( mesh ) : obj = mesh;
//					obj.add(mesh);
//
//				}
//
//			}
//
//			for ( i = 0; i < node.cameras.length; i ++ ) {
//
//				var instance_camera = node.cameras[i];
//				var cparams = cameras[instance_camera.url];
//
//				var cam = new THREE.PerspectiveCamera(cparams.yfov, parseFloat(cparams.aspect_ratio), 
//						parseFloat(cparams.znear), parseFloat(cparams.zfar));
//
//				obj.add(cam);
//			}
//
//			for ( i = 0; i < node.lights.length; i ++ ) {
//
//				var light = null;
//				var instance_light = node.lights[i];
//				var lparams = lights[instance_light.url];
//
//				if ( lparams && lparams.technique ) {
//
//					var color = lparams.color.getHex();
//					var intensity = lparams.intensity;
//					var distance = 0;
//					var angle = lparams.falloff_angle;
//					var exponent; // Intentionally undefined, don't know what this is yet
//
//					switch ( lparams.technique ) {
//
//						case 'directional':
//
//							light = new THREE.DirectionalLight( color, intensity, distance );
//							light.position.set(0, 0, 1);
//							break;
//
//						case 'point':
//
//							light = new THREE.PointLight( color, intensity, distance );
//							break;
//
//						case 'spot':
//
//							light = new THREE.SpotLight( color, intensity, distance, angle, exponent );
//							light.position.set(0, 0, 1);
//							break;
//
//						case 'ambient':
//
//							light = new THREE.AmbientLight( color );
//							break;
//
//					}
//
//				}
//
//				if (light) {
//					obj.add(light);
//				}
//			}
//
//			obj.name = node.name || node.id || "";
//			obj.id = node.id || "";
//			obj.layer = node.layer || "";
//			obj.matrix = node.matrix;
//			obj.matrix.decompose( obj.position, obj.quaternion, obj.scale );
//
//			if ( options.centerGeometry && obj.geometry ) {
//
//				var delta = THREE.GeometryUtils.center( obj.geometry );
//				delta.multiply( obj.scale );
//				delta.applyQuaternion( obj.quaternion );
//
//				obj.position.sub( delta );
//
//			}
//
//			for ( i = 0; i < node.nodes.length; i ++ ) {
//
//				obj.add( createSceneGraph( node.nodes[i], node ) );
//
//			}
//
//			return obj;
//
//		};
//
//		function getJointId( skin, id ) {
//			for ( var i = 0; i < skin.joints.length; i ++ ) {
//				if ( skin.joints[ i ] == id ) {
//					return i;
//				}
//			}
//		};
//
//		function getLibraryNode( id ) {
//
//	        var nodes = COLLADA.querySelectorAll('library_nodes node');
//
//	        for ( var i = 0; i < nodes.length; i++ ) {
//
//	            var attObj = nodes[i].attributes.getNamedItem('id');
//	            if ( attObj && attObj.value === id ) {
//	                return nodes[i];
//	        }
//	        }
//
//	        return undefined;
//
//		};
//
//		function calcFrameDuration( node ) {
//
//			var minT = 10000000;
//
//			for ( var i = 0; i < node.channels.length; i ++ ) {
//
//				var sampler = node.channels[i].sampler;
//
//				for ( var j = 0; j < sampler.input.length - 1; j ++ ) {
//
//					var t0 = sampler.input[ j ];
//					var t1 = sampler.input[ j + 1 ];
//					minT = Math.min( minT, t1 - t0 );
//
//				}
//			}
//
//			return minT;
//
//		};
//
//		function calcMatrixAt( node, t ) {
//
//			var animated = {};
//
//			var i, j;
//
//			for ( i = 0; i < node.channels.length; i ++ ) {
//
//				var channel = node.channels[ i ];
//				animated[ channel.sid ] = channel;
//
//			}
//
//			var matrix = new THREE.Matrix4();
//
//			for ( i = 0; i < node.transforms.length; i ++ ) {
//
//				var transform = node.transforms[ i ];
//				var channel = animated[ transform.sid ];
//
//				if ( channel !== undefined ) {
//
//					var sampler = channel.sampler;
//					var value;
//
//					for ( j = 0; j < sampler.input.length - 1; j ++ ) {
//
//						if ( sampler.input[ j + 1 ] > t ) {
//
//							value = sampler.output[ j ];
//							//console.log(value.flatten)
//							break;
//
//						}
//
//					}
//					
//					if ( value !== undefined ) {
//						if ( value instanceof THREE.Matrix4 ) {
//							matrix.multiplyMatrices( matrix, value );
//						} else {
//							// FIXME: handle other types
//							matrix.multiplyMatrices( matrix, transform.matrix );
//						}
//					} else {
//						matrix.multiplyMatrices( matrix, transform.matrix );
//					}
//				} else {
//					matrix.multiplyMatrices( matrix, transform.matrix );
//				}
//			}
//
//			return matrix;
//
//		};
//
//		function bakeAnimations ( node ) {
//
//			if ( node.channels && node.channels.length ) {
//
//				var keys = [],
//					sids = [];
//
//				for ( var i = 0, il = node.channels.length; i < il; i++ ) {
//
//					var channel = node.channels[i],
//						fullSid = channel.fullSid,
//						sampler = channel.sampler,
//						input = sampler.input,
//						transform = node.getTransformBySid( channel.sid ),
//						member;
//
//					if ( channel.arrIndices ) {
//
//						member = [];
//
//						for ( var j = 0, jl = channel.arrIndices.length; j < jl; j++ ) {
//
//							member[ j ] = getConvertedIndex( channel.arrIndices[ j ] );
//
//						}
//
//					} else {
//
//						member = getConvertedMember( channel.member );
//
//					}
//
//					if ( transform ) {
//
//						if ( sids.indexOf( fullSid ) === -1 ) {
//
//							sids.push( fullSid );
//
//						}
//
//						for ( var j = 0, jl = input.length; j < jl; j++ ) {
//
//							var time = input[j],
//								data = sampler.getData( transform.type, j, member ),
//								key = findKey( keys, time );
//
//							if ( !key ) {
//
//								key = new Key( time );
//								var timeNdx = findTimeNdx( keys, time );
//								keys.splice( timeNdx == -1 ? keys.length : timeNdx, 0, key );
//
//							}
//
//							key.addTarget( fullSid, transform, member, data );
//
//						}
//
//					} else {
//
//						console.log( 'Could not find transform "' + channel.sid + '" in node ' + node.id );
//
//					}
//
//				}
//
//				// post process
//				for ( var i = 0; i < sids.length; i++ ) {
//
//					var sid = sids[ i ];
//
//					for ( var j = 0; j < keys.length; j++ ) {
//
//						var key = keys[ j ];
//
//						if ( !key.hasTarget( sid ) ) {
//
//							interpolateKeys( keys, key, j, sid );
//
//						}
//
//					}
//
//				}
//
//				node.keys = keys;
//				node.sids = sids;
//
//			}
//
//		};
//
//		function findKey ( keys, time) {
//
//			var retVal = null;
//
//			for ( var i = 0, il = keys.length; i < il && retVal == null; i++ ) {
//
//				var key = keys[i];
//
//				if ( key.time === time ) {
//
//					retVal = key;
//
//				} else if ( key.time > time ) {
//
//					break;
//
//				}
//
//			}
//
//			return retVal;
//
//		};
//
//		function findTimeNdx ( keys, time) {
//
//			var ndx = -1;
//
//			for ( var i = 0, il = keys.length; i < il && ndx == -1; i++ ) {
//
//				var key = keys[i];
//
//				if ( key.time >= time ) {
//
//					ndx = i;
//
//				}
//
//			}
//
//			return ndx;
//
//		};
//
//		function interpolateKeys ( keys, key, ndx, fullSid ) {
//
//			var prevKey = getPrevKeyWith( keys, fullSid, ndx ? ndx-1 : 0 ),
//				nextKey = getNextKeyWith( keys, fullSid, ndx+1 );
//
//			if ( prevKey && nextKey ) {
//
//				var scale = (key.time - prevKey.time) / (nextKey.time - prevKey.time),
//					prevTarget = prevKey.getTarget( fullSid ),
//					nextData = nextKey.getTarget( fullSid ).data,
//					prevData = prevTarget.data,
//					data;
//
//				if ( prevTarget.type === 'matrix' ) {
//
//					data = prevData;
//
//				} else if ( prevData.length ) {
//
//					data = [];
//
//					for ( var i = 0; i < prevData.length; ++i ) {
//
//						data[ i ] = prevData[ i ] + ( nextData[ i ] - prevData[ i ] ) * scale;
//
//					}
//
//				} else {
//
//					data = prevData + ( nextData - prevData ) * scale;
//
//				}
//
//				key.addTarget( fullSid, prevTarget.transform, prevTarget.member, data );
//
//			}
//
//		};
//
//		// Get next key with given sid
//
//		function getNextKeyWith( keys, fullSid, ndx ) {
//
//			for ( ; ndx < keys.length; ndx++ ) {
//
//				var key = keys[ ndx ];
//
//				if ( key.hasTarget( fullSid ) ) {
//
//					return key;
//
//				}
//
//			}
//
//			return null;
//
//		};
//
//		// Get previous key with given sid
//
//		function getPrevKeyWith( keys, fullSid, ndx ) {
//
//			ndx = ndx >= 0 ? ndx : ndx + keys.length;
//
//			for ( ; ndx >= 0; ndx-- ) {
//
//				var key = keys[ ndx ];
//
//				if ( key.hasTarget( fullSid ) ) {
//
//					return key;
//
//				}
//
//			}
//
//			return null;
//
//		};
//
//		// TYPES AHEAD!!!
//
//		Transform.prototype.update = function ( data, member ) {
//
//			var members = [ 'X', 'Y', 'Z', 'ANGLE' ];
//
//			switch ( this.type ) {
//
//				case 'matrix':
//
//					if ( ! member ) {
//
//						this.obj.copy( data );
//
//					} else if ( member.length === 1 ) {
//
//						switch ( member[ 0 ] ) {
//
//							case 0:
//
//								this.obj.n11 = data[ 0 ];
//								this.obj.n21 = data[ 1 ];
//								this.obj.n31 = data[ 2 ];
//								this.obj.n41 = data[ 3 ];
//
//								break;
//
//							case 1:
//
//								this.obj.n12 = data[ 0 ];
//								this.obj.n22 = data[ 1 ];
//								this.obj.n32 = data[ 2 ];
//								this.obj.n42 = data[ 3 ];
//
//								break;
//
//							case 2:
//
//								this.obj.n13 = data[ 0 ];
//								this.obj.n23 = data[ 1 ];
//								this.obj.n33 = data[ 2 ];
//								this.obj.n43 = data[ 3 ];
//
//								break;
//
//							case 3:
//
//								this.obj.n14 = data[ 0 ];
//								this.obj.n24 = data[ 1 ];
//								this.obj.n34 = data[ 2 ];
//								this.obj.n44 = data[ 3 ];
//
//								break;
//
//						}
//
//					} else if ( member.length === 2 ) {
//
//						var propName = 'n' + ( member[ 0 ] + 1 ) + ( member[ 1 ] + 1 );
//						this.obj[ propName ] = data;
//
//					} else {
//
//						console.log('Incorrect addressing of matrix in transform.');
//
//					}
//
//					break;
//
//				case 'translate':
//				case 'scale':
//					if ( Object.prototype.toString.call( member ) === '[object Array]' ) {
//						member = members[ member[ 0 ] ];
//					}
//
//					switch ( member ) {
//						case 'X':
//							this.obj.x = data;
//							break;
//						case 'Y':
//							this.obj.y = data;
//							break;
//						case 'Z':
//
//							this.obj.z = data;
//							break;
//
//						default:
//
//							this.obj.x = data[ 0 ];
//							this.obj.y = data[ 1 ];
//							this.obj.z = data[ 2 ];
//							break;
//
//					}
//
//					break;
//
//				case 'rotate':
//
//					if ( Object.prototype.toString.call( member ) === '[object Array]' ) {
//
//						member = members[ member[ 0 ] ];
//
//					}
//
//					switch ( member ) {
//
//						case 'X':
//
//							this.obj.x = data;
//							break;
//
//						case 'Y':
//
//							this.obj.y = data;
//							break;
//
//						case 'Z':
//
//							this.obj.z = data;
//							break;
//
//						case 'ANGLE':
//
//							this.angle = THREE.Math.degToRad( data );
//							break;
//
//						default:
//
//							this.obj.x = data[ 0 ];
//							this.obj.y = data[ 1 ];
//							this.obj.z = data[ 2 ];
//							this.angle = THREE.Math.degToRad( data[ 3 ] );
//							break;
//
//					}
//					break;
//
//			}
//
//		};
//
//		function Mesh( geometry ) {
//
//			this.geometry = geometry.id;
//			this.primitives = [];
//			this.vertices = null;
//			this.geometry3js = null;
//
//		};
//
//		Mesh.prototype.parse = function( element ) {
//
//			this.primitives = [];
//
//			var i, j;
//
//			for ( i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//
//				switch ( child.nodeName ) {
//
//					case 'source':
//
//						_source( child );
//						break;
//
//					case 'vertices':
//
//						this.vertices = ( new Vertices() ).parse( child );
//						break;
//
//					case 'triangles':
//
//						this.primitives.push( ( new Triangles().parse( child ) ) );
//						break;
//
//					case 'polygons':
//
//						this.primitives.push( ( new Polygons().parse( child ) ) );
//						break;
//
//					case 'polylist':
//
//						this.primitives.push( ( new Polylist().parse( child ) ) );
//						break;
//
//					default:
//						break;
//
//				}
//
//			}
//
//			this.geometry3js = new THREE.Geometry();
//
//			var vertexData = sources[ this.vertices.input['POSITION'].source ].data;
//
//			for ( i = 0; i < vertexData.length; i += 3 ) {
//
//				this.geometry3js.vertices.push( getConvertedVec3( vertexData, i ).clone() );
//
//			}
//
//			for ( i = 0; i < this.primitives.length; i ++ ) {
//
//				var primitive = this.primitives[ i ];
//				// TODO dl wahrscheinlich ist der Aufruf überflüssig
//				// da wir die inputs (die in setVertices befüllt werden)
//				// schon durch das parsen des XML bekommen.
//				primitive.setVertices( this.vertices );
//				this.handlePrimitive( primitive, this.geometry3js );
//
//			}
//
//			this.geometry3js.computeFaceNormals();
//
//			if ( this.geometry3js.calcNormals ) {
//
//				this.geometry3js.computeVertexNormals();
//				delete this.geometry3js.calcNormals;
//
//			}
//
//			// this.geometry3js.computeBoundingBox();
//
//			return this;
//
//		};
//
//		Mesh.prototype.handlePrimitive = function( primitive, geom ) {
//
//			var j, k, pList = primitive.p, inputs = primitive.inputs;
//			var input, index, idx32;
//			var source, numParams;
//			var vcIndex = 0, vcount = 3, maxOffset = 0;
//			var texture_sets = [];
//			
//			for ( j = 0; j < inputs.length; j ++ ) {
//
//				input = inputs[ j ];
//
//				var offset = input.offset + 1;
//				maxOffset = (maxOffset < offset)? offset : maxOffset;
//
//				switch ( input.semantic ) {
//
//					case 'TEXCOORD':
//						texture_sets.push( input.set );
//						break;
//
//				}
//
//			}
//
//			for ( var pCount = 0; pCount < pList.length; ++pCount ) {
//
//				var p = pList[ pCount ], i = 0;
//
//				while ( i < p.length ) {
//
//					var vs = [];
//					var ns = [];
//					var ts = null;
//					var cs = [];
//
//					if ( primitive.vcount ) {
//
//						vcount = primitive.vcount.length ? primitive.vcount[ vcIndex ++ ] : primitive.vcount;
//
//					} else {
//
//						vcount = p.length / maxOffset;
//
//					}
//
//
//					for ( j = 0; j < vcount; j ++ ) {
//
//						for ( k = 0; k < inputs.length; k ++ ) {
//
//							input = inputs[ k ];
//							source = sources[ input.source ];
//
//							index = p[ i + ( j * maxOffset ) + input.offset ];
//							numParams = source.accessor.params.length;
//							idx32 = index * numParams;
//
//							switch ( input.semantic ) {
//
//								case 'VERTEX':
//
//									vs.push( index );
//
//									break;
//
//								case 'NORMAL':
//
//									ns.push( getConvertedVec3( source.data, idx32 ) );
//
//									break;
//
//								case 'TEXCOORD':
//
//									ts = ts || { };
//									if ( ts[ input.set ] === undefined ) ts[ input.set ] = [];
//									// invert the V
//									ts[ input.set ].push( new THREE.Vector2( source.data[ idx32 ], source.data[ idx32 + 1 ] ) );
//
//									break;
//
//								case 'COLOR':
//
//									cs.push( new THREE.Color().setRGB( source.data[ idx32 ], source.data[ idx32 + 1 ], source.data[ idx32 + 2 ] ) );
//
//									break;
//
//								default:
//
//									break;
//
//							}
//
//						}
//
//					}
//
//					if ( ns.length == 0 ) {
//
//						// check the vertices inputs
//						input = this.vertices.input.NORMAL;
//
//						if ( input ) {
//
//							source = sources[ input.source ];
//							numParams = source.accessor.params.length;
//
//							for ( var ndx = 0, len = vs.length; ndx < len; ndx++ ) {
//
//								ns.push( getConvertedVec3( source.data, vs[ ndx ] * numParams ) );
//
//							}
//
//						} else {
//
//							geom.calcNormals = true;
//
//						}
//
//					}
//
//					if ( !ts ) {
//
//						ts = { };
//						// check the vertices inputs
//						input = this.vertices.input.TEXCOORD;
//
//						if ( input ) {
//
//							texture_sets.push( input.set );
//							source = sources[ input.source ];
//							numParams = source.accessor.params.length;
//
//							for ( var ndx = 0, len = vs.length; ndx < len; ndx++ ) {
//
//								idx32 = vs[ ndx ] * numParams;
//								if ( ts[ input.set ] === undefined ) ts[ input.set ] = [ ];
//								// invert the V
//								ts[ input.set ].push( new THREE.Vector2( source.data[ idx32 ], 1.0 - source.data[ idx32 + 1 ] ) );
//
//							}
//
//						}
//
//					}
//
//					if ( cs.length == 0 ) {
//
//						// check the vertices inputs
//						input = this.vertices.input.COLOR;
//
//						if ( input ) {
//
//							source = sources[ input.source ];
//							numParams = source.accessor.params.length;
//
//							for ( var ndx = 0, len = vs.length; ndx < len; ndx++ ) {
//
//								idx32 = vs[ ndx ] * numParams;
//								cs.push( new THREE.Color().setRGB( source.data[ idx32 ], source.data[ idx32 + 1 ], source.data[ idx32 + 2 ] ) );
//
//							}
//
//						}
//
//					}
//
//					var face = null, faces = [], uv, uvArr;
//
//					if ( vcount === 3 ) {
//
//						faces.push( new THREE.Face3( vs[0], vs[1], vs[2], ns, cs.length ? cs : new THREE.Color() ) );
//
//					} else if ( vcount === 4 ) {
//
//						faces.push( new THREE.Face3( vs[0], vs[1], vs[3], [ns[0], ns[1], ns[3]], cs.length ? [cs[0], cs[1], cs[3]] : new THREE.Color() ) );
//						
//						faces.push( new THREE.Face3( vs[1], vs[2], vs[3], [ns[1], ns[2], ns[3]], cs.length ? [cs[1], cs[2], cs[3]] : new THREE.Color() ) );
//
//					} else if ( vcount > 4 && options.subdivideFaces ) {
//
//						var clr = cs.length ? cs : new THREE.Color(),
//							vec1, vec2, vec3, v1, v2, norm;
//
//						// subdivide into multiple Face3s
//
//						for ( k = 1; k < vcount - 1; ) {
//
//							// FIXME: normals don't seem to be quite right
//
//							faces.push( new THREE.Face3( vs[0], vs[k], vs[k+1], [ ns[0], ns[k++], ns[k] ],  clr ) );
//
//						}
//
//					}
//
//					if ( faces.length ) {
//
//						for ( var ndx = 0, len = faces.length; ndx < len; ndx ++ ) {
//
//							face = faces[ndx];
//							face.daeMaterial = primitive.material;
//							geom.faces.push( face );
//
//							for ( k = 0; k < texture_sets.length; k++ ) {
//
//								uv = ts[ texture_sets[k] ];
//
//								if ( vcount > 4 ) {
//
//									// Grab the right UVs for the vertices in this face
//									uvArr = [ uv[0], uv[ndx+1], uv[ndx+2] ];
//
//								} else if ( vcount === 4 ) {
//
//									if ( ndx === 0 ) {
//
//										uvArr = [ uv[0], uv[1], uv[3] ];
//
//									} else {
//
//										uvArr = [ uv[1].clone(), uv[2], uv[3].clone() ];
//
//									}
//
//								} else {
//
//									uvArr = [ uv[0], uv[1], uv[2] ];
//
//								}
//
//								if ( geom.faceVertexUvs[k] === undefined ) {
//
//									geom.faceVertexUvs[k] = [];
//
//								}
//
//								geom.faceVertexUvs[k].push( uvArr );
//
//							}
//
//						}
//
//					} else {
//
//						console.log( 'dropped face with vcount ' + vcount + ' for geometry with id: ' + geom.id );
//
//					}
//
//					i += maxOffset * vcount;
//
//				}
//			}
//
//		};
//
//		function ColorOrTexture () {
//
//			this.color = new THREE.Color();
//			this.color.setRGB( Math.random(), Math.random(), Math.random() );
//			this.color.a = 1.0;
//
//			this.texture = null;
//			this.texcoord = null;
//			this.texOpts = null;
//
//		};
//
//		ColorOrTexture.prototype.isColor = function () {
//			return ( this.texture == null );
//		};
//
//		ColorOrTexture.prototype.isTexture = function () {
//			return ( this.texture != null );
//		};
//
//		ColorOrTexture.prototype.parse = function ( element ) {
//
//			if (element.nodeName == 'transparent') {
//
//				this.opaque = element.getAttribute('opaque');
//
//			}
//			
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'color':
//
//						var rgba = _floats( child.textContent );
//						this.color = new THREE.Color();
//						this.color.setRGB( rgba[0], rgba[1], rgba[2] );
//						this.color.a = rgba[3];
//						break;
//
//					case 'texture':
//
//						this.texture = child.getAttribute('texture');
//						this.texcoord = child.getAttribute('texcoord');
//						// Defaults from:
//						// https://collada.org/mediawiki/index.php/Maya_texture_placement_MAYA_extension
//						this.texOpts = {
//							offsetU: 0,
//							offsetV: 0,
//							repeatU: 1,
//							repeatV: 1,
//							wrapU: 1,
//							wrapV: 1
//						};
//						this.parseTexture( child );
//						break;
//
//					default:
//						break;
//
//				}
//
//			}
//
//			return this;
//
//		};
//
//		ColorOrTexture.prototype.parseTexture = function ( element ) {
//
//			if ( ! element.childNodes ) return this;
//
//			// This should be supported by Maya, 3dsMax, and MotionBuilder
//
//			if ( element.childNodes[1] && element.childNodes[1].nodeName === 'extra' ) {
//
//				element = element.childNodes[1];
//
//				if ( element.childNodes[1] && element.childNodes[1].nodeName === 'technique' ) {
//
//					element = element.childNodes[1];
//
//				}
//
//			}
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//
//				switch ( child.nodeName ) {
//
//					case 'offsetU':
//					case 'offsetV':
//					case 'repeatU':
//					case 'repeatV':
//
//						this.texOpts[ child.nodeName ] = parseFloat( child.textContent );
//
//						break;
//
//					case 'wrapU':
//					case 'wrapV':
//						
//						// some dae have a value of true which becomes NaN via parseInt
//
//						if ( child.textContent.toUpperCase() === 'TRUE' ) {
//						
//							this.texOpts[ child.nodeName ] = 1;
//						
//						} else {
//						
//							this.texOpts[ child.nodeName ] = parseInt( child.textContent );
//						
//						}
//						break;
//
//					default:
//
//						this.texOpts[ child.nodeName ] = child.textContent;
//
//						break;
//
//				}
//
//			}
//
//			return this;
//
//		};
//
//		function Shader ( type, effect ) {
//
//			this.type = type;
//			this.effect = effect;
//			this.material = null;
//
//		};
//
//		Shader.prototype.parse = function ( element ) {
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'ambient':
//					case 'emission':
//					case 'diffuse':
//					case 'specular':
//					case 'transparent':
//
//						this[ child.nodeName ] = ( new ColorOrTexture() ).parse( child );
//						break;
//
//					case 'bump':
//
//						// If 'bumptype' is 'heightfield', create a 'bump' property
//						// Else if 'bumptype' is 'normalmap', create a 'normal' property
//						// (Default to 'bump')
//						var bumpType = child.getAttribute( 'bumptype' );
//						if ( bumpType ) {
//							if ( bumpType.toLowerCase() === "heightfield" ) {
//								this[ 'bump' ] = ( new ColorOrTexture() ).parse( child );
//							} else if ( bumpType.toLowerCase() === "normalmap" ) {
//								this[ 'normal' ] = ( new ColorOrTexture() ).parse( child );
//							} else {
//								console.error( "Shader.prototype.parse: Invalid value for attribute 'bumptype' (" + bumpType + 
//									           ") - valid bumptypes are 'HEIGHTFIELD' and 'NORMALMAP' - defaulting to 'HEIGHTFIELD'" );
//								this[ 'bump' ] = ( new ColorOrTexture() ).parse( child );
//							}
//						} else {
//							console.warn( "Shader.prototype.parse: Attribute 'bumptype' missing from bump node - defaulting to 'HEIGHTFIELD'" );
//							this[ 'bump' ] = ( new ColorOrTexture() ).parse( child );
//						}
//
//						break;
//
//					case 'shininess':
//					case 'reflectivity':
//					case 'index_of_refraction':
//					case 'transparency':
//
//						var f = child.querySelectorAll('float');
//
//						if ( f.length > 0 )
//							this[ child.nodeName ] = parseFloat( f[ 0 ].textContent );
//
//						break;
//
//					default:
//						break;
//
//				}
//
//			}
//
//			this.create();
//			return this;
//
//		};
//
//		Shader.prototype.create = function() {
//
//			var props = {};
//
//			var transparent = false;
//
//			if (this['transparency'] !== undefined && this['transparent'] !== undefined) {
//				// convert transparent color RBG to average value
//				var transparentColor = this['transparent'];
//				var transparencyLevel = (this.transparent.color.r +
//											this.transparent.color.g + 
//											this.transparent.color.b)
//											/ 3 * this.transparency;
//				
//				if (transparencyLevel > 0) {
//					transparent = true;
//					props[ 'transparent' ] = true;
//					props[ 'opacity' ] = 1 - transparencyLevel;
//
//				}
//
//			}
//			
//			var keys = {
//				'diffuse':'map', 
//				'ambient':'lightMap' ,
//				'specular':'specularMap',
//				'emission':'emissionMap',
//				'bump':'bumpMap',
//				'normal':'normalMap'
//				};
//			
//			for ( var prop in this ) {
//
//				switch ( prop ) {
//
//					case 'ambient':
//					case 'emission':
//					case 'diffuse':
//					case 'specular':
//					case 'bump':
//					case 'normal':
//
//						var cot = this[ prop ];
//
//						if ( cot instanceof ColorOrTexture ) {
//
//							if ( cot.isTexture() ) {
//
//								var samplerId = cot.texture;
//								var surfaceId = this.effect.sampler[samplerId];
//
//								if ( surfaceId !== undefined && surfaceId.source !== undefined ) {
//
//									var surface = this.effect.surface[surfaceId.source];
//									var image = images[surface.init_from];
//
//									if (image) {
//
//										var texture = THREE.ImageUtils.loadTexture(baseUrl + image.init_from);
//										texture.wrapS = cot.texOpts.wrapU ? THREE.RepeatWrapping : THREE.ClampToEdgeWrapping;
//										texture.wrapT = cot.texOpts.wrapV ? THREE.RepeatWrapping : THREE.ClampToEdgeWrapping;
//										texture.offset.x = cot.texOpts.offsetU;
//										texture.offset.y = cot.texOpts.offsetV;
//										texture.repeat.x = cot.texOpts.repeatU;
//										texture.repeat.y = cot.texOpts.repeatV;
//										props[keys[prop]] = texture;
//
//										// Texture with baked lighting?
//										if (prop === 'emission') props['emissive'] = 0xffffff;
//
//									}
//
//								}
//
//							} else if ( prop === 'diffuse' || !transparent ) {
//
//								if ( prop === 'emission' ) {
//
//									props[ 'emissive' ] = cot.color.getHex();
//
//								} else {
//
//									props[ prop ] = cot.color.getHex();
//
//								}
//
//							}
//
//						}
//
//						break;
//
//					case 'shininess':
//
//						props[ prop ] = this[ prop ];
//						break;
//
//					case 'reflectivity':
//
//						props[ prop ] = this[ prop ];
//						if( props[ prop ] > 0.0 ) props['envMap'] = options.defaultEnvMap;
//						props['combine'] = THREE.MixOperation;	//mix regular shading with reflective component
//						break;
//
//					case 'index_of_refraction':
//
//						props[ 'refractionRatio' ] = this[ prop ]; //TODO: "index_of_refraction" becomes "refractionRatio" in shader, but I'm not sure if the two are actually comparable
//						if ( this[ prop ] !== 1.0 ) props['envMap'] = options.defaultEnvMap;
//						break;
//
//					case 'transparency':
//						// gets figured out up top
//						break;
//
//					default:
//						break;
//
//				}
//
//			}
//
//			props[ 'shading' ] = preferredShading;
//			props[ 'side' ] = this.effect.doubleSided ? THREE.DoubleSide : THREE.FrontSide;
//
//			switch ( this.type ) {
//
//				case 'constant':
//
//					if (props.emissive != undefined) props.color = props.emissive;
//					this.material = new THREE.MeshBasicMaterial( props );
//					break;
//
//				case 'phong':
//				case 'blinn':
//
//					if (props.diffuse != undefined) props.color = props.diffuse;
//					this.material = new THREE.MeshPhongMaterial( props );
//					break;
//
//				case 'lambert':
//				default:
//
//					if (props.diffuse != undefined) props.color = props.diffuse;
//					this.material = new THREE.MeshLambertMaterial( props );
//					break;
//
//			}
//
//			return this.material;
//
//		};
//
//		function Surface ( effect ) {
//
//			this.effect = effect;
//			this.init_from = null;
//			this.format = null;
//
//		};
//
//		Surface.prototype.parse = function ( element ) {
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'init_from':
//
//						this.init_from = child.textContent;
//						break;
//
//					case 'format':
//
//						this.format = child.textContent;
//						break;
//
//					default:
//
//						console.log( "unhandled Surface prop: " + child.nodeName );
//						break;
//
//				}
//
//			}
//
//			return this;
//
//		};
//
//		function Sampler2D ( effect ) {
//
//			this.effect = effect;
//			this.source = null;
//			this.wrap_s = null;
//			this.wrap_t = null;
//			this.minfilter = null;
//			this.magfilter = null;
//			this.mipfilter = null;
//
//		};
//
//		Sampler2D.prototype.parse = function ( element ) {
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'source':
//
//						this.source = child.textContent;
//						break;
//
//					case 'minfilter':
//
//						this.minfilter = child.textContent;
//						break;
//
//					case 'magfilter':
//
//						this.magfilter = child.textContent;
//						break;
//
//					case 'mipfilter':
//
//						this.mipfilter = child.textContent;
//						break;
//
//					case 'wrap_s':
//
//						this.wrap_s = child.textContent;
//						break;
//
//					case 'wrap_t':
//
//						this.wrap_t = child.textContent;
//						break;
//
//					default:
//
//						console.log( "unhandled Sampler2D prop: " + child.nodeName );
//						break;
//
//				}
//
//			}
//
//			return this;
//
//		};
//
//		function Effect () {
//
//			this.id = "";
//			this.name = "";
//			this.shader = null;
//			this.surface = {};
//			this.sampler = {};
//
//		};
//
//		Effect.prototype.create = function () {
//
//			if ( this.shader == null ) {
//
//				return null;
//
//			}
//
//		};
//
//		Effect.prototype.parse = function ( element ) {
//
//			this.id = element.getAttribute( 'id' );
//			this.name = element.getAttribute( 'name' );
//
//			extractDoubleSided( this, element );
//
//			this.shader = null;
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'profile_COMMON':
//
//						this.parseTechnique( this.parseProfileCOMMON( child ) );
//						break;
//
//					default:
//						break;
//
//				}
//
//			}
//
//			return this;
//
//		};
//
//		Effect.prototype.parseNewparam = function ( element ) {
//
//			var sid = element.getAttribute( 'sid' );
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'surface':
//
//						this.surface[sid] = ( new Surface( this ) ).parse( child );
//						break;
//
//					case 'sampler2D':
//
//						this.sampler[sid] = ( new Sampler2D( this ) ).parse( child );
//						break;
//
//					case 'extra':
//
//						break;
//
//					default:
//
//						console.log( child.nodeName );
//						break;
//
//				}
//
//			}
//
//		};
//
//		Effect.prototype.parseProfileCOMMON = function ( element ) {
//
//			var technique;
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'profile_COMMON':
//
//						this.parseProfileCOMMON( child );
//						break;
//
//					case 'technique':
//
//						technique = child;
//						break;
//
//					case 'newparam':
//
//						this.parseNewparam( child );
//						break;
//
//					case 'image':
//
//						var _image = ( new _Image() ).parse( child );
//						images[ _image.id ] = _image;
//						break;
//
//					case 'extra':
//						break;
//
//					default:
//
//						console.log( child.nodeName );
//						break;
//
//				}
//
//			}
//
//			return technique;
//
//		};
//
//		Effect.prototype.parseTechnique= function ( element ) {
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[i];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'constant':
//					case 'lambert':
//					case 'blinn':
//					case 'phong':
//
//						this.shader = ( new Shader( child.nodeName, this ) ).parse( child );
//						break;
//					case 'extra':
//						this.parseExtra(child);	
//						break;
//					default:
//						break;
//
//				}
//
//			}
//
//		};
//		
//		Effect.prototype.parseExtra = function ( element ) {
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[i];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'technique':
//						this.parseExtraTechnique( child );
//						break;
//					default:
//						break;
//
//				}
//
//			}
//
//		};
//		
//		Effect.prototype.parseExtraTechnique= function ( element ) {
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[i];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'bump':
//						this.shader.parse( element );
//						break;
//					default:
//						break;
//
//				}
//
//			}
//
//		};
//		
//		function Channel( animation ) {
//
//			this.animation = animation;
//			this.source = "";
//			this.target = "";
//			this.fullSid = null;
//			this.sid = null;
//			this.dotSyntax = null;
//			this.arrSyntax = null;
//			this.arrIndices = null;
//			this.member = null;
//
//		};
//
//		Channel.prototype.parse = function ( element ) {
//
//			this.source = element.getAttribute( 'source' ).replace( /^#/, '' );
//			this.target = element.getAttribute( 'target' );
//
//			var parts = this.target.split( '/' );
//
//			var id = parts.shift();
//			var sid = parts.shift();
//
//			var dotSyntax = ( sid.indexOf(".") >= 0 );
//			var arrSyntax = ( sid.indexOf("(") >= 0 );
//
//			if ( dotSyntax ) {
//
//				parts = sid.split(".");
//				this.sid = parts.shift();
//				this.member = parts.shift();
//
//			} else if ( arrSyntax ) {
//
//				var arrIndices = sid.split("(");
//				this.sid = arrIndices.shift();
//
//				for (var j = 0; j < arrIndices.length; j ++ ) {
//
//					arrIndices[j] = parseInt( arrIndices[j].replace(/\)/, '') );
//
//				}
//
//				this.arrIndices = arrIndices;
//
//			} else {
//
//				this.sid = sid;
//
//			}
//
//			this.fullSid = sid;
//			this.dotSyntax = dotSyntax;
//			this.arrSyntax = arrSyntax;
//
//			return this;
//
//		};
//
//		function Sampler ( animation ) {
//
//			this.id = "";
//			this.animation = animation;
//			this.inputs = [];
//			this.input = null;
//			this.output = null;
//			this.strideOut = null;
//			this.interpolation = null;
//			this.startTime = null;
//			this.endTime = null;
//			this.duration = 0;
//
//		};
//
//		Sampler.prototype.parse = function ( element ) {
//
//			this.id = element.getAttribute( 'id' );
//			this.inputs = [];
//
//			for ( var i = 0; i < element.childNodes.length; i ++ ) {
//
//				var child = element.childNodes[ i ];
//				if ( child.nodeType != 1 ) continue;
//
//				switch ( child.nodeName ) {
//
//					case 'input':
//
//						this.inputs.push( (new Input()).parse( child ) );
//						break;
//
//					default:
//						break;
//
//				}
//
//			}
//
//			return this;
//
//		};
//
//		Sampler.prototype.create = function () {
//
//			for ( var i = 0; i < this.inputs.length; i ++ ) {
//
//				var input = this.inputs[ i ];
//				var source = this.animation.source[ input.source ];
//
//				switch ( input.semantic ) {
//
//					case 'INPUT':
//
//						this.input = source.read();
//						break;
//
//					case 'OUTPUT':
//
//						this.output = source.read();
//						this.strideOut = source.accessor.stride;
//						break;
//
//					case 'INTERPOLATION':
//
//						this.interpolation = source.read();
//						break;
//
//					case 'IN_TANGENT':
//
//						break;
//
//					case 'OUT_TANGENT':
//
//						break;
//
//					default:
//
//						console.log(input.semantic);
//						break;
//
//				}
//
//			}
//
//			this.startTime = 0;
//			this.endTime = 0;
//			this.duration = 0;
//
//			if ( this.input.length ) {
//
//				this.startTime = 100000000;
//				this.endTime = -100000000;
//
//				for ( var i = 0; i < this.input.length; i ++ ) {
//
//					this.startTime = Math.min( this.startTime, this.input[ i ] );
//					this.endTime = Math.max( this.endTime, this.input[ i ] );
//
//				}
//
//				this.duration = this.endTime - this.startTime;
//
//			}
//
//		};
//
//		Sampler.prototype.getData = function ( type, ndx, member ) {
//
//			var data;
//
//			if ( type === 'matrix' && this.strideOut === 16 ) {
//
//				data = this.output[ ndx ];
//
//			} else if ( this.strideOut > 1 ) {
//
//				data = [];
//				ndx *= this.strideOut;
//
//				for ( var i = 0; i < this.strideOut; ++i ) {
//
//					data[ i ] = this.output[ ndx + i ];
//
//				}
//
//				if ( this.strideOut === 3 ) {
//
//					switch ( type ) {
//
//						case 'rotate':
//						case 'translate':
//
//							fixCoords( data, -1 );
//							break;
//
//						case 'scale':
//
//							fixCoords( data, 1 );
//							break;
//
//					}
//
//				} else if ( this.strideOut === 4 && type === 'matrix' ) {
//
//					fixCoords( data, -1 );
//
//				}
//
//			} else {
//
//				data = this.output[ ndx ];
//
//				if ( member && type == 'translate' ) {
//					data = getConvertedTranslation( member, data );
//				}
//				
//			}
//
//			return data;
//
//		};
//
//		function Key ( time ) {
//
//			this.targets = [];
//			this.time = time;
//
//		};
//
//		Key.prototype.addTarget = function ( fullSid, transform, member, data ) {
//
//			this.targets.push( {
//				sid: fullSid,
//				member: member,
//				transform: transform,
//				data: data
//			} );
//
//		};
//
//		Key.prototype.apply = function ( opt_sid ) {
//
//			for ( var i = 0; i < this.targets.length; ++i ) {
//
//				var target = this.targets[ i ];
//
//				if ( !opt_sid || target.sid === opt_sid ) {
//
//					target.transform.update( target.data, target.member );
//
//				}
//
//			}
//
//		};
//
//		Key.prototype.getTarget = function ( fullSid ) {
//
//			for ( var i = 0; i < this.targets.length; ++i ) {
//
//				if ( this.targets[ i ].sid === fullSid ) {
//
//					return this.targets[ i ];
//
//				}
//
//			}
//
//			return null;
//
//		};
//
//		Key.prototype.hasTarget = function ( fullSid ) {
//
//			for ( var i = 0; i < this.targets.length; ++i ) {
//
//				if ( this.targets[ i ].sid === fullSid ) {
//
//					return true;
//
//				}
//
//			}
//
//			return false;
//
//		};
//
//		// TODO: Currently only doing linear interpolation. Should support full COLLADA spec.
//		Key.prototype.interpolate = function ( nextKey, time ) {
//
//			for ( var i = 0, l = this.targets.length; i < l; i ++ ) {
//
//				var target = this.targets[ i ],
//					nextTarget = nextKey.getTarget( target.sid ),
//					data;
//
//				if ( target.transform.type !== 'matrix' && nextTarget ) {
//
//					var scale = ( time - this.time ) / ( nextKey.time - this.time ),
//						nextData = nextTarget.data,
//						prevData = target.data;
//
//					if ( scale < 0 ) scale = 0;
//					if ( scale > 1 ) scale = 1;
//
//					if ( prevData.length ) {
//
//						data = [];
//
//						for ( var j = 0; j < prevData.length; ++j ) {
//
//							data[ j ] = prevData[ j ] + ( nextData[ j ] - prevData[ j ] ) * scale;
//
//						}
//
//					} else {
//
//						data = prevData + ( nextData - prevData ) * scale;
//
//					}
//
//				} else {
//
//					data = target.data;
//
//				}
//
//				target.transform.update( data, target.member );
//
//			}
//
//		};
//		
//
//		function _source( element ) {
//
//			var id = element.getAttribute( 'id' );
//
//			if ( sources[ id ] != undefined ) {
//
//				return sources[ id ];
//
//			}
//
//			sources[ id ] = ( new Source(id )).parse( element );
//			return sources[ id ];
//
//		};
//		
//		function getConvertedTranslation( axis, data ) {
//			if ( options.convertUpAxis !== true || colladaUp === options.upAxis ) {
//				return data;
//			}
//
//			switch ( axis ) {
//				case 'X':
//					data = upConversion == 'XtoY' ? data * -1 : data;
//					break;
//				case 'Y':
//					data = upConversion == 'YtoZ' || upConversion == 'YtoX' ? data * -1 : data;
//					break;
//				case 'Z':
//					data = upConversion == 'ZtoY' ? data * -1 : data ;
//					break;
//				default:
//					break;
//			}
//
//			return data;
//		};
//
//		function getConvertedVec3( data, offset ) {
//
//			var arr = [ data[ offset ], data[ offset + 1 ], data[ offset + 2 ] ];
//			fixCoords( arr, -1 );
//			return new THREE.Vector3( arr[ 0 ], arr[ 1 ], arr[ 2 ] );
//
//		};
//
//		function getConvertedIndex( index ) {
//
//			if ( index > -1 && index < 3 ) {
//
//				var members = ['X', 'Y', 'Z'],
//					indices = { X: 0, Y: 1, Z: 2 };
//
//				index = getConvertedMember( members[ index ] );
//				index = indices[ index ];
//
//			}
//
//			return index;
//
//		};
//
//		function getConvertedMember( member ) {
//
//			if ( options.convertUpAxis ) {
//
//				switch ( member ) {
//
//					case 'X':
//
//						switch ( upConversion ) {
//
//							case 'XtoY':
//							case 'XtoZ':
//							case 'YtoX':
//
//								member = 'Y';
//								break;
//
//							case 'ZtoX':
//
//								member = 'Z';
//								break;
//						}
//
//						break;
//
//					case 'Y':
//
//						switch ( upConversion ) {
//
//							case 'XtoY':
//							case 'YtoX':
//							case 'ZtoX':
//
//								member = 'X';
//								break;
//
//							case 'XtoZ':
//							case 'YtoZ':
//							case 'ZtoY':
//
//								member = 'Z';
//								break;
//
//						}
//
//						break;
//
//					case 'Z':
//
//						switch ( upConversion ) {
//
//							case 'XtoZ':
//
//								member = 'X';
//								break;
//
//							case 'YtoZ':
//							case 'ZtoX':
//							case 'ZtoY':
//
//								member = 'Y';
//								break;
//
//						}
//
//						break;
//
//				}
//
//			}
//
//			return member;
//
//		};
//
//		return {
//
//			load: load,
//			parse: parse,
//			setPreferredShading: setPreferredShading,
//			applySkin: applySkin,
//			geometries : geometries,
//			options: options
//
//		};
//
//	};

}
