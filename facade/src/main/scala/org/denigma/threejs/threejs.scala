package org.denigma.threejs

import org.scalajs.dom._
import org.scalajs.dom.raw.{ HTMLCanvasElement, HTMLElement, HTMLImageElement }

import scalajs.js
import scalajs.js.annotation._
import scalajs.js.typedarray._

@js.native
trait WebGLRenderingContext extends js.Object
@js.native
object THREE extends js.Object {
  var REVISION: String = js.native
  var CullFaceNone: CullFace = js.native
  var CullFaceBack: CullFace = js.native
  var CullFaceFront: CullFace = js.native
  var CullFaceFrontBack: CullFace = js.native
  var FrontFaceDirectionCW: FrontFaceDirection = js.native
  var FrontFaceDirectionCCW: FrontFaceDirection = js.native
  var BasicShadowMap: ShadowMapType = js.native
  var PCFShadowMap: ShadowMapType = js.native
  var PCFSoftShadowMap: ShadowMapType = js.native
  var FrontSide: Side = js.native
  var BackSide: Side = js.native
  var DoubleSide: Side = js.native
  var NoShading: Shading = js.native
  var FlatShading: Shading = js.native
  var SmoothShading: Shading = js.native
  var NoColors: Colors = js.native
  var FaceColors: Colors = js.native
  var VertexColors: Colors = js.native
  var NoBlending: Blending = js.native
  var NormalBlending: Blending = js.native
  var AdditiveBlending: Blending = js.native
  var SubtractiveBlending: Blending = js.native
  var MultiplyBlending: Blending = js.native
  var CustomBlending: Blending = js.native
  var AddEquation: BlendingEquation = js.native
  var SubtractEquation: BlendingEquation = js.native
  var ReverseSubtractEquation: BlendingEquation = js.native
  var ZeroFactor: BlendingDstFactor = js.native
  var OneFactor: BlendingDstFactor = js.native
  var SrcColorFactor: BlendingDstFactor = js.native
  var OneMinusSrcColorFactor: BlendingDstFactor = js.native
  var SrcAlphaFactor: BlendingDstFactor = js.native
  var OneMinusSrcAlphaFactor: BlendingDstFactor = js.native
  var DstAlphaFactor: BlendingDstFactor = js.native
  var OneMinusDstAlphaFactor: BlendingDstFactor = js.native
  var DstColorFactor: BlendingSrcFactor = js.native
  var OneMinusDstColorFactor: BlendingSrcFactor = js.native
  var SrcAlphaSaturateFactor: BlendingSrcFactor = js.native
  var MultiplyOperation: Combine = js.native
  var MixOperation: Combine = js.native
  var AddOperation: Combine = js.native
  var UVMapping: MappingConstructor = js.native
  var CubeReflectionMapping: MappingConstructor = js.native
  var CubeRefractionMapping: MappingConstructor = js.native
  var SphericalReflectionMapping: MappingConstructor = js.native
  var SphericalRefractionMapping: MappingConstructor = js.native
  var RepeatWrapping: Wrapping = js.native
  var ClampToEdgeWrapping: Wrapping = js.native
  var MirroredRepeatWrapping: Wrapping = js.native
  var NearestFilter: TextureFilter = js.native
  var NearestMipMapNearestFilter: TextureFilter = js.native
  var NearestMipMapLinearFilter: TextureFilter = js.native
  var LinearFilter: TextureFilter = js.native
  var LinearMipMapNearestFilter: TextureFilter = js.native
  var LinearMipMapLinearFilter: TextureFilter = js.native
  var UnsignedByteType: TextureDataType = js.native
  var ByteType: TextureDataType = js.native
  var ShortType: TextureDataType = js.native
  var UnsignedShortType: TextureDataType = js.native
  var IntType: TextureDataType = js.native
  var UnsignedIntType: TextureDataType = js.native
  var FloatType: TextureDataType = js.native
  var UnsignedShort4444Type: PixelType = js.native
  var UnsignedShort5551Type: PixelType = js.native
  var UnsignedShort565Type: PixelType = js.native
  var AlphaFormat: PixelFormat = js.native
  var RGBFormat: PixelFormat = js.native
  var RGBAFormat: PixelFormat = js.native
  var LuminanceFormat: PixelFormat = js.native
  var LuminanceAlphaFormat: PixelFormat = js.native
  var RGB_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  var RGBA_S3TC_DXT1_Format: CompressedPixelFormat = js.native
  var RGBA_S3TC_DXT3_Format: CompressedPixelFormat = js.native
  var RGBA_S3TC_DXT5_Format: CompressedPixelFormat = js.native
  var Math: Math = js.native
  var LineStrip: LineType = js.native
  var LinePieces: LineType = js.native
  var ShaderChunk: ShaderChunk = js.native
}

@js.native
sealed trait CullFace extends js.Object {
}

@js.native
@JSName("THREE.CullFace")
object CullFace extends js.Object {
  @JSBracketAccess
  def apply(value: CullFace): String = js.native
}

@js.native
sealed trait FrontFaceDirection extends js.Object {
}

@js.native
@JSName("THREE.FrontFaceDirection")
object FrontFaceDirection extends js.Object {
  @JSBracketAccess
  def apply(value: FrontFaceDirection): String = js.native
}

@js.native
sealed trait ShadowMapType extends js.Object {
}

@js.native
@JSName("THREE.ShadowMapType")
object ShadowMapType extends js.Object {
  @JSBracketAccess
  def apply(value: ShadowMapType): String = js.native
}

@js.native
sealed trait Side extends js.Object {
}

@js.native
@JSName("THREE.Side")
object Side extends js.Object {
  @JSBracketAccess
  def apply(value: Side): String = js.native
}

@js.native
sealed trait Shading extends js.Object {
}

@js.native
@JSName("THREE.Shading")
object Shading extends js.Object {
  @JSBracketAccess
  def apply(value: Shading): String = js.native
}

@js.native
sealed trait Colors extends js.Object {
}

@js.native
@JSName("THREE.Colors")
object Colors extends js.Object {
  @JSBracketAccess
  def apply(value: Colors): String = js.native
}

@js.native
sealed trait Blending extends js.Object {
}

@js.native
@JSName("THREE.Blending")
object Blending extends js.Object {
  @JSBracketAccess
  def apply(value: Blending): String = js.native
}

@js.native
sealed trait BlendingEquation extends js.Object {
}

@js.native
@JSName("THREE.BlendingEquation")
object BlendingEquation extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingEquation): String = js.native
}

@js.native
sealed trait BlendingDstFactor extends js.Object {
}

@js.native
@JSName("THREE.BlendingDstFactor")
object BlendingDstFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingDstFactor): String = js.native
}

@js.native
sealed trait BlendingSrcFactor extends js.Object {
}

@js.native
@JSName("THREE.BlendingSrcFactor")
object BlendingSrcFactor extends js.Object {
  @JSBracketAccess
  def apply(value: BlendingSrcFactor): String = js.native
}

@js.native
sealed trait Combine extends js.Object {
}

@js.native
@JSName("THREE.Combine")
object Combine extends js.Object {
  @JSBracketAccess
  def apply(value: Combine): String = js.native
}

@js.native
sealed trait Mapping extends js.Object {
}

@js.native
@JSName("THREE.Mapping")
object Mapping extends js.Object {
  @JSBracketAccess
  def apply(value: Mapping): String = js.native
}

@js.native
trait MappingConstructor extends js.Object {
  /* js.native ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Mapping),List())))) */
}

@js.native
sealed trait Wrapping extends js.Object {
}

@js.native
@JSName("THREE.Wrapping")
object Wrapping extends js.Object {
  @JSBracketAccess
  def apply(value: Wrapping): String = js.native
}

@js.native
sealed trait TextureFilter extends js.Object {
}

@js.native
@JSName("THREE.TextureFilter")
object TextureFilter extends js.Object {
  @JSBracketAccess
  def apply(value: TextureFilter): String = js.native
}

@js.native
sealed trait TextureDataType extends js.Object {
}

@js.native
@JSName("THREE.TextureDataType")
object TextureDataType extends js.Object {
  @JSBracketAccess
  def apply(value: TextureDataType): String = js.native
}

@js.native
sealed trait PixelType extends js.Object {
}

@js.native
@JSName("THREE.PixelType")
object PixelType extends js.Object {
  @JSBracketAccess
  def apply(value: PixelType): String = js.native
}

@js.native
sealed trait PixelFormat extends js.Object {
}

@js.native
@JSName("THREE.PixelFormat")
object PixelFormat extends js.Object {
  @JSBracketAccess
  def apply(value: PixelFormat): String = js.native
}

@js.native
sealed trait CompressedPixelFormat extends js.Object {
}

@js.native
@JSName("THREE.CompressedPixelFormat")
object CompressedPixelFormat extends js.Object {
  @JSBracketAccess
  def apply(value: CompressedPixelFormat): String = js.native
}

@js.native
@JSName("THREE.Camera")
class Camera extends Object3D {
  var matrixWorldInverse: Matrix4 = js.native
  var projectionMatrix: Matrix4 = js.native
  override def lookAt(vector: Vector3): Unit = js.native
  def clone(camera: Camera): Camera = js.native
}

@js.native
@JSName("THREE.CubeCamera")
class CubeCamera(near: Double = js.native, far: Double = js.native, cubeResolution: Double = js.native) extends Object3D {
  var renderTarget: WebGLRenderTargetCube = js.native
  def updateCubeMap(renderer: Renderer, scene: Scene): Unit = js.native
}

@js.native
@JSName("THREE.OrthographicCamera")
class OrthographicCamera(
  var left: Double, var right: Double, var top: Double, var bottom: Double,
  var near: Double = js.native, var far: Double = js.native
) extends Camera {
  var zoom: Double = js.native
  def updateProjectionMatrix(): Unit = js.native
  override def clone(): OrthographicCamera = js.native
}

@js.native
@JSName("THREE.PerspectiveCamera")
class PerspectiveCamera(var fov: Double = js.native, var aspect: Double = js.native, var near: Double = js.native, var far: Double = js.native) extends Camera {
  def setLens(focalLength: Double, frameHeight: Double = js.native): Unit = js.native
  def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def updateProjectionMatrix(): Unit = js.native
  override def clone(): PerspectiveCamera = js.native
}

@js.native
@JSName("THREE.BufferAttribute")
class BufferAttribute(var array: js.Any, var itemSize: Double) extends js.Object {
  var length: Double = js.native
  def set(value: Double): BufferAttribute = js.native
  def setX(index: Double, x: Double): BufferAttribute = js.native
  def setY(index: Double, y: Double): BufferAttribute = js.native
  def setZ(index: Double, z: Double): BufferAttribute = js.native
  def setXY(index: Double, x: Double, y: Double): BufferAttribute = js.native
  def setXYZ(index: Double, x: Double, y: Double, z: Double): BufferAttribute = js.native
  def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): BufferAttribute = js.native
}

@js.native
@JSName("THREE.Int8Attribute")
class Int8Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Uint8Attribute")
class Uint8Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Uint8ClampedAttribute")
class Uint8ClampedAttribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Int16Attribute")
class Int16Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Uint16Attribute")
class Uint16Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Int32Attribute")
class Int32Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Uint32Attribute")
class Uint32Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Float32Attribute")
class Float32Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.Float64Attribute")
class Float64Attribute(data: js.Any, itemSize: Double) extends BufferAttribute(data, itemSize)

@js.native
@JSName("THREE.BufferGeometry")
class BufferGeometry extends Geometry {
  var attributes: js.Array[BufferAttribute] = js.native
  var drawcalls: js.Any = js.native
  var offsets: js.Any = js.native
  def addAttribute(name: String, attribute: BufferAttribute): js.Dynamic = js.native
  def addAttribute(name: String, array: js.Any, itemSize: Double): js.Dynamic = js.native
  def getAttribute(name: String): js.Dynamic = js.native
  def addDrawCall(start: Double, count: Double, index: Double): Unit = js.native
  def fromGeometry(geometry: Geometry, settings: js.Any = js.native): BufferGeometry = js.native
  def computeVertexNormals(): Unit = js.native
  def computeOffsets(indexBufferSize: Double): Unit = js.native
  def merge(): Unit = js.native
  def normalizeNormals(): Unit = js.native
  def reorderBuffers(indexBuffer: Double, indexMap: js.Array[Double], vertexCount: Double): Unit = js.native
  def setIndex( index:js.Array[Int] ): Unit = js.native
  override def clone(): BufferGeometry = js.native
}

@js.native
@JSName("THREE.Clock")
class Clock(var autoStart: Boolean = js.native) extends js.Object {
  var startTime: Double = js.native
  var oldTime: Double = js.native
  var elapsedTime: Double = js.native
  var running: Boolean = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def getElapsedTime(): Double = js.native
  def getDelta(): Double = js.native
}


@js.native
trait EventDispatcher extends js.Object {
  def addEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, Unit]): Unit = js.native
  def dispatchEvent(event: js.Any): Unit = js.native
}

@js.native
@JSName("THREE.Face3")
class Face3(
  var a: Double, var b: Double, var c: Double,
  var vertexNormals: js.Array[Vector3] = js.native, var vertexColors: js.Array[Color] = js.native, var materialIndex: Double  = js.native
) extends js.Object {
  var normal: Vector3 = js.native
  var color: Color = js.native
  var vertexTangents: js.Array[Double] = js.native
  override def clone(): Face3 = js.native
}

@js.native
trait MorphTarget extends js.Object {
  var name: String = js.native
  var vertices: js.Array[Vector3] = js.native
}

@js.native
trait MorphColor extends js.Object {
  var name: String = js.native
  var colors: js.Array[Color] = js.native
}

@js.native
trait MorphNormals extends js.Object {
  var name: String = js.native
  var normals: js.Array[Vector3] = js.native
}

@js.native
trait BoundingBox3D extends js.Object {
  var min: Vector3 = js.native
  var max: Vector3 = js.native
}

@js.native
trait BoundingSphere extends js.Object {
  var radius: Double = js.native
}

@js.native
@JSName("THREE.Geometry")
class Geometry extends js.Object with EventDispatcher {
  var id: Double = js.native
  var uuid: String = js.native
  var name: String = js.native
  var vertices: js.Array[Vector3] = js.native
  var colors: js.Array[Color] = js.native
  var faces: js.Array[Face3] = js.native
  var faceVertexUvs: js.Array[js.Array[js.Array[Vector2]]] = js.native
  var morphTargets: js.Array[MorphTarget] = js.native
  var morphColors: js.Array[MorphColor] = js.native
  var morphNormals: js.Array[MorphNormals] = js.native
  var skinWeights: js.Array[Double] = js.native
  var skinIndices: js.Array[Double] = js.native
  var lineDistances: js.Array[Double] = js.native
  var boundingBox: BoundingBox3D = js.native
  var boundingSphere: BoundingSphere = js.native
  var hasTangents: Boolean = js.native
  var dynamic: Boolean = js.native
  var verticesNeedUpdate: Boolean = js.native
  var elementsNeedUpdate: Boolean = js.native
  var uvsNeedUpdate: Boolean = js.native
  var normalsNeedUpdate: Boolean = js.native
  var tangentsNeedUpdate: Boolean = js.native
  var colorsNeedUpdate: Boolean = js.native
  var lineDistancesNeedUpdate: Boolean = js.native
  var buffersNeedUpdate: Boolean = js.native
  var groupsNeedUpdate: Boolean = js.native
  def applyMatrix(matrix: Matrix4): Unit = js.native
  def center(): Vector3 = js.native
  def computeFaceNormals(): Unit = js.native
  def computeVertexNormals(areaWeighted: Boolean = js.native): Unit = js.native
  def computeMorphNormals(): Unit = js.native
  def computeTangents(): Unit = js.native
  def computeLineDistances(): Unit = js.native
  def computeBoundingBox(): Unit = js.native
  def computeBoundingSphere(): Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix, materialIndexOffset: Double): Unit = js.native
  def mergeVertices(): Double = js.native
  def makeGroups(usesFaceMaterial: Boolean, maxVerticesInGroup: Double): Unit = js.native
  override def clone(): Geometry = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("THREE.Object3D")
class Object3D extends js.Object with EventDispatcher {
  var id: Double = js.native
  var uuid: String = js.native
  var name: String = js.native
  var parent: Object3D = js.native
  var children: js.Array[Object3D] = js.native
  var up: Vector3 = js.native
  var position: Vector3 = js.native
  var rotation: Euler = js.native
  var quaternion: Quaternion = js.native
  var scale: Vector3 = js.native
  var renderDepth: Double = js.native
  var rotationAutoUpdate: Boolean = js.native
  var matrix: Matrix4 = js.native
  var matrixWorld: Matrix4 = js.native
  var matrixAutoUpdate: Boolean = js.native
  var matrixWorldNeedsUpdate: Boolean = js.native
  var visible: Boolean = js.native
  var castShadow: Boolean = js.native
  var receiveShadow: Boolean = js.native
  var frustumCulled: Boolean = js.native
  var userData: js.Any = js.native
  var eulerOrder: String = js.native
  def applyMatrix(matrix: Matrix4): Unit = js.native
  def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
  def setRotationFromEuler(euler: Euler): Unit = js.native
  def setRotationFromMatrix(m: Matrix4): Unit = js.native
  def setRotationFromQuaternion(q: Quaternion): Unit = js.native
  def rotateOnAxis(axis: Vector3, angle: Double): Object3D = js.native
  def rotateX(angle: Double): Object3D = js.native
  def rotateY(angle: Double): Object3D = js.native
  def rotateZ(angle: Double): Object3D = js.native
  def translateOnAxis(axis: Vector3, distance: Double): Object3D = js.native
  def translate(distance: Double, axis: Vector3): Object3D = js.native
  def translateX(distance: Double): Object3D = js.native
  def translateY(distance: Double): Object3D = js.native
  def translateZ(distance: Double): Object3D = js.native
  def localToWorld(vector: Vector3): Vector3 = js.native
  def worldToLocal(vector: Vector3): Vector3 = js.native
  def lookAt(vector: Vector3): Unit = js.native
  def add(`object`: Object3D): Unit = js.native
  def remove(`object`: Object3D): Unit = js.native
  def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def traverse(callback: js.Function1[Object3D, Any]): Unit = js.native
  def getObjectById(id: String, recursive: Boolean): Object3D = js.native
  def getObjectByName(name: String, recursive: Boolean = js.native): Object3D = js.native
  def getChildByName(name: String, recursive: Boolean = js.native): Object3D = js.native
  def updateMatrix(): Unit = js.native
  def updateMatrixWorld(force: Boolean): Unit = js.native
  def updateMatrixWorld(): Unit = js.native
  def clone(`object`: Object3D = js.native, recursive: Boolean = js.native): Object3D = js.native
}

@js.native
@JSName("THREE.Object3D")
object Object3D extends js.Object {
  var DefaultUp: Vector3 = js.native
}

@js.native
trait Intersection extends js.Object {
  var distance: Double = js.native
  var point: Vector3 = js.native
  var face: Face3 = js.native
  var `object`: Object3D = js.native
}

@js.native
trait RaycasterParameters extends js.Object {
  var Sprite: js.Any = js.native
  var Mesh: js.Any = js.native
  var PointCloud: js.Any = js.native
  var LOD: js.Any = js.native
  var Line: js.Any = js.native
}

@js.native
@JSName("THREE.Raycaster")
class Raycaster(origin: Vector3 = js.native, direction: Vector3 = js.native, var near: Double = js.native, var far: Double = js.native) extends js.Object {
  var ray: Ray = js.native
  var params: RaycasterParameters = js.native
  var precision: Double = js.native
  var linePrecision: Double = js.native
  def set(origin: Vector3, direction: Vector3): Unit = js.native
  def setFromCamera(origin: Vector2, camera: Camera): Unit = js.native
  def setFromCamera(origin: Vector3, camera: Camera): Unit = js.native
  def intersectObject(`object`: Object3D, recursive: Boolean = js.native): js.Array[Intersection] = js.native
  def intersectObjects(objects: js.Array[Object3D], recursive: Boolean = js.native): js.Array[Intersection] = js.native
}

@js.native
@JSName("THREE.Light")
class Light(var color: Double = js.native, intensity: Double = js.native) extends Object3D {
  def clone(light: Light): Light = js.native
}

@js.native
@JSName("THREE.AmbientLight")
class AmbientLight(color: Double, intensity: Double = js.native) extends Light(color, intensity) {
  override def clone(): AmbientLight = js.native
}

@js.native
@JSName("THREE.AreaLight")
class AreaLight(color: Double = js.native, intensity: Double = js.native) extends Light(color, intensity) {
  var normal: Vector3 = js.native
  var right: Vector3 = js.native
  var width: Double = js.native
  var height: Double = js.native
  var constantAttenuation: Double = js.native
  var linearAttenuation: Double = js.native
  var quadraticAttenuation: Double = js.native
}

@js.native
@JSName("THREE.DirectionalLight")
class DirectionalLight(color: Double = js.native, intensity: Double = js.native) extends Light(color, intensity) {
  var target: Object3D = js.native

  var onlyShadow: Boolean = js.native
  var shadowCameraNear: Double = js.native
  var shadowCameraFar: Double = js.native
  var shadowCameraLeft: Double = js.native
  var shadowCameraRight: Double = js.native
  var shadowCameraTop: Double = js.native
  var shadowCameraBottom: Double = js.native
  var shadowCameraVisible: Boolean = js.native
  var shadowBias: Double = js.native
  var shadowDarkness: Double = js.native
  var shadowMapWidth: Double = js.native
  var shadowMapHeight: Double = js.native
  var shadowCascade: Boolean = js.native
  var shadowCascadeOffset: Vector3 = js.native
  var shadowCascadeCount: Double = js.native
  var shadowCascadeBias: js.Array[Double] = js.native
  var shadowCascadeWidth: js.Array[Double] = js.native
  var shadowCascadeHeight: js.Array[Double] = js.native
  var shadowCascadeNearZ: js.Array[Double] = js.native
  var shadowCascadeFarZ: js.Array[Double] = js.native
  var shadowCascadeArray: js.Array[DirectionalLight] = js.native
  var shadowMap: RenderTarget = js.native
  var shadowMapSize: Double = js.native
  var shadowCamera: Camera = js.native
  var shadowMatrix: Matrix4 = js.native
  override def clone(): DirectionalLight = js.native
}

@js.native
@JSName("THREE.HemisphereLight")
class HemisphereLight(var skyColor: Double = js.native, var groundColor: Double = js.native, intensity: Double = js.native) extends Light(skyColor, intensity) {
  override def clone(): HemisphereLight = js.native
}

@js.native
@JSName("THREE.PointLight")
class PointLight(color: Double = js.native, intensity: Double = js.native, var distance: Double = js.native) extends Light(color, intensity) {
  override def clone(): PointLight = js.native
}

@js.native
@JSName("THREE.SpotLight")
class SpotLight(
  color: Double = js.native, intensity: Double = js.native, var distance: Double = js.native, var angle: Double = js.native, var exponent: Double = js.native
) extends Light(color,intensity) {
  var target: Object3D = js.native

  var onlyShadow: Boolean = js.native
  var shadowCameraNear: Double = js.native
  var shadowCameraFar: Double = js.native
  var shadowCameraFov: Double = js.native
  var shadowCameraVisible: Boolean = js.native
  var shadowBias: Double = js.native
  var shadowDarkness: Double = js.native
  var shadowMapWidth: Double = js.native
  var shadowMapHeight: Double = js.native
  var shadowMap: RenderTarget = js.native
  var shadowMapSize: Vector2 = js.native
  var shadowCamera: Camera = js.native
  var shadowMatrix: Matrix4 = js.native
  override def clone(): SpotLight = js.native
}

@js.native
trait Progress extends js.Object {
  var total: Double = js.native
  var loaded: Double = js.native
}

@js.native
@JSName("THREE.Loader")
class Loader(var showStatus: Boolean = js.native) extends js.Object {
  var statusDomElement: HTMLElement = js.native
  var onLoadStart: js.Function0[Unit] = js.native
  var onLoadProgress: js.Function0[Unit] = js.native
  var onLoadComplete: js.Function0[Unit] = js.native
  var crossOrigin: String = js.native
  def addStatusElement(): HTMLElement = js.native
  def updateProgress(progress: Progress): Unit = js.native
  def extractUrlBase(url: String): String = js.native
  def initMaterials(materials: js.Array[Material], texturePath: String): js.Array[Material] = js.native
  def needsTangents(materials: js.Array[Material]): Boolean = js.native
  def createMaterial(m: Material, texturePath: String): Boolean = js.native
}

@js.native
@JSName("THREE.Loader")
object Loader extends js.Object {
  var Handlers: LoaderHandler = js.native
}

@js.native
trait LoaderHandler extends js.Object {
  var handlers: js.Array[js.Any] = js.native
  def add(regex: String, loader: Loader): Unit = js.native
  def get(file: String): Loader = js.native
}

@js.native
@JSName("THREE.BufferGeometryLoader")
class BufferGeometryLoader(manager: LoadingManager = js.native) extends js.Object {
  def load(url: String, onLoad: js.Function1[BufferGeometry, Unit], onProgress: js.Function1[js.Any, Unit] = js.native, onError: js.Function1[js.Any, Unit] = js.native): Unit = js.native
  def setCrossOrigin(crossOrigin: String): Unit = js.native
  def parse(json: js.Any): BufferGeometry = js.native
}

@js.native
@JSName("THREE.Cache")
class Cache extends js.Object {
  var files: js.Array[js.Any] = js.native
  def add(key: String, file: js.Any): Unit = js.native
  def get(key: String): js.Dynamic = js.native
  def remove(key: String): Unit = js.native
  def clear(): Unit = js.native
}

@js.native
@JSName("THREE.ImageLoader")
class ImageLoader(manager: LoadingManager = js.native) extends js.Object {
  var crossOrigin: String = js.native
  def load(url: String, onLoad: js.Function1[HTMLImageElement, Unit] = js.native, onProgress: js.Function1[js.Any, Unit] = js.native, onError: js.Function1[js.Any, Unit] = js.native): HTMLImageElement = js.native
  def setCrossOrigin(crossOrigin: String): Unit = js.native
}

@js.native
@JSName("THREE.JSONLoader")
class JSONLoader(showStatus: Boolean = js.native) extends Loader {
  var withCredentials: Boolean = js.native
  def load(url: String, callback: js.Function2[JSonLoaderResultGeometry, js.Array[Material], Unit], texturePath: String = js.native): Unit = js.native
  def loadAjaxJSON(context: JSONLoader, url: String, callback: js.Function2[Geometry, js.Array[Material], Unit], texturePath: String = js.native, callbackProgress: js.Function1[Progress, Unit] = js.native): Unit = js.native
  def parse(json: String, texturePath: String): js.Dynamic = js.native
}

@js.native
trait JSonLoaderResultGeometry extends Geometry {
  var animation: AnimationData = js.native
}

@js.native
@JSName("THREE.LoadingManager")
class LoadingManager(
  var onLoad: js.Function0[Unit] = js.native, var onProgress: js.Function3[String, Double, Double, Unit] = js.native, var onError: js.Function0[Unit] = js.native
) extends js.Object {
  def itemStart(url: String): Unit = js.native
  def itemEnd(url: String): Unit = js.native
}

@js.native
@JSName("THREE.MaterialLoader")
class MaterialLoader(manager: LoadingManager = js.native) extends js.Object {
  def load(url: String, onLoad: js.Function1[Material, Unit]): Unit = js.native
  def setCrossOrigin(crossOrigin: String): Unit = js.native
  def parse(json: js.Any): Material = js.native
}

@js.native
@JSName("THREE.ObjectLoader")
class ObjectLoader(manager: LoadingManager = js.native) extends js.Object {
  def load(url: String, onLoad: js.Function1[Object3D, Unit]): Unit = js.native
  def setCrossOrigin(crossOrigin: String): Unit = js.native
  def parse[T <: Object3D](json: js.Any): T = js.native
  def parseGeometries(json: js.Any): js.Array[js.Any] = js.native
  def parseMaterials(json: js.Any): js.Array[Material] = js.native
  def parseObject[T <: Object3D](data: js.Any, geometries: js.Array[js.Any], materials: js.Array[Material]): T = js.native
}

@js.native
@JSName("THREE.TextureLoader")
class TextureLoader(manager: LoadingManager = js.native) extends js.Object {
  var crossOrigin: String = js.native
  def load(url: String, onLoad: js.Function1[Texture, Unit]): Unit = js.native
  def setCrossOrigin(crossOrigin: String): Unit = js.native
}

@js.native
@JSName("THREE.XHRLoader")
class XHRLoader(manager: LoadingManager = js.native) extends js.Object {
  var responseType: String = js.native
  var crossOrigin: String = js.native
  def load(url: String, onLoad: js.Function1[String, Unit] = js.native, onProgress: js.Function1[js.Any, Unit] = js.native, onError: js.Function1[js.Any, Unit] = js.native): Unit = js.native
  def setResponseType(responseType: String): Unit = js.native
  def setCrossOrigin(crossOrigin: String): Unit = js.native
}

@js.native
trait MaterialParameters extends js.Object {
  var name: String = js.native
  var side: Side = js.native
  var opacity: Double = js.native
  var transparent: Boolean = js.native
  var blending: Blending = js.native
  var blendSrc: BlendingDstFactor = js.native
  var blendDst: BlendingSrcFactor = js.native
  var blendEquation: BlendingEquation = js.native
  var depthTest: Boolean = js.native
  var depthWrite: Boolean = js.native
  var polygonOffset: Boolean = js.native
  var polygonOffsetFactor: Double = js.native
  var polygonOffsetUnits: Double = js.native
  var alphaTest: Double = js.native
  var overdraw: Double = js.native
  var visible: Boolean = js.native
  var needsUpdate: Boolean = js.native
}

@js.native
@JSName("THREE.Material")
class Material extends js.Object with EventDispatcher {
  var id: Double = js.native
  var uuid: String = js.native
  var name: String = js.native
  var side: Side = js.native
  var opacity: Double = js.native
  var transparent: Boolean = js.native
  var blending: Blending = js.native
  var blendSrc: BlendingDstFactor = js.native
  var blendDst: BlendingSrcFactor = js.native
  var blendEquation: BlendingEquation = js.native
  var depthTest: Boolean = js.native
  var depthWrite: Boolean = js.native
  var polygonOffset: Boolean = js.native
  var polygonOffsetFactor: Double = js.native
  var polygonOffsetUnits: Double = js.native
  var alphaTest: Double = js.native
  var overdraw: Double = js.native
  var visible: Boolean = js.native
  var needsUpdate: Boolean = js.native
  def setValues(values: Object): Unit = js.native
  def clone(material: Material): Material = js.native
  def dispose(): Unit = js.native
}

@js.native
trait LineBasicMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var linewidth: Double = js.native
  var linecap: String = js.native
  var linejoin: String = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
}

@js.native
@JSName("THREE.LineBasicMaterial")
class LineBasicMaterial(parameters: LineBasicMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  var linewidth: Double = js.native
  var linecap: String = js.native
  var linejoin: String = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
  override def clone(): LineBasicMaterial = js.native
}

@js.native
trait LineDashedMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var linewidth: Double = js.native
  var scale: Double = js.native
  var dashSize: Double = js.native
  var gapSize: Double = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
}

@js.native
@JSName("THREE.LineDashedMaterial")
class LineDashedMaterial(parameters: LineDashedMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  var linewidth: Double = js.native
  var scale: Double = js.native
  var dashSize: Double = js.native
  var gapSize: Double = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
  override def clone(): LineDashedMaterial = js.native
}

@js.native
trait MeshBasicMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
}

@js.native
@JSName("THREE.MeshBasicMaterial")
class MeshBasicMaterial(parameters: MeshBasicMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  override def clone(): MeshBasicMaterial = js.native
}

@js.native
trait MeshDepthMaterialParameters extends MaterialParameters {
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
}

@js.native
@JSName("THREE.MeshDepthMaterial")
class MeshDepthMaterial(parameters: MeshDepthMaterialParameters = js.native) extends Material {
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  override def clone(): MeshDepthMaterial = js.native
}

@js.native
@JSName("THREE.MeshFaceMaterial")
class MeshFaceMaterial(var materials: js.Array[Material] = js.native) extends Material {
  override def clone(): MeshFaceMaterial = js.native
}

@js.native
trait MeshLambertMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var ambient: Double = js.native
  var emissive: Double = js.native
  var wrapAround: Boolean = js.native
  var wrapRGB: Vector3 = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
}

@js.native
@JSName("THREE.MeshLambertMaterial")
class MeshLambertMaterial(parameters: MeshLambertMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  var ambient: Color = js.native
  var emissive: Color = js.native
  var wrapAround: Boolean = js.native
  var wrapRGB: Vector3 = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
  override def clone(): MeshLambertMaterial = js.native
}

@js.native
trait MeshNormalMaterialParameters extends MaterialParameters {
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var morphTargets: Boolean = js.native
}

@js.native
@JSName("THREE.MeshNormalMaterial")
class MeshNormalMaterial(parameters: MeshNormalMaterialParameters = js.native) extends Material {
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var morphTargets: Boolean = js.native
  override def clone(): MeshNormalMaterial = js.native
}

@js.native
trait MeshPhongMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var ambient: Double = js.native
  var emissive: Double = js.native
  var specular: Double = js.native
  var shininess: Double = js.native
  var metal: Boolean = js.native
  var wrapAround: Boolean = js.native
  var wrapRGB: Vector3 = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var bumpMap: Texture = js.native
  var bumpScale: Double = js.native
  var normalMap: Texture = js.native
  var normalScale: Vector2 = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
}

@js.native
@JSName("THREE.MeshPhongMaterial")
class MeshPhongMaterial(parameters: MeshPhongMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  var ambient: Color = js.native
  var emissive: Color = js.native
  var specular: Color = js.native
  var shininess: Double = js.native
  var metal: Boolean = js.native
  var wrapAround: Boolean = js.native
  var wrapRGB: Vector3 = js.native
  var map: Texture = js.native
  var lightMap: Texture = js.native
  var bumpMap: Texture = js.native
  var bumpScale: Double = js.native
  var normalMap: Texture = js.native
  var normalScale: Vector2 = js.native
  var specularMap: Texture = js.native
  var alphaMap: Texture = js.native
  var envMap: Texture = js.native
  var combine: Combine = js.native
  var reflectivity: Double = js.native
  var refractionRatio: Double = js.native
  var fog: Boolean = js.native
  var shading: Shading = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var wireframeLinecap: String = js.native
  var wireframeLinejoin: String = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
  override def clone(): MeshPhongMaterial = js.native
}

@js.native
trait PointCloudMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var map: Texture = js.native
  var size: Double = js.native
  var sizeAttenuation: Boolean = js.native
  var vertexColors: Colors = js.native
  var fog: Boolean = js.native
}

@js.native
@JSName("THREE.PointCloudMaterial")
class PointCloudMaterial(parameters: PointCloudMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  var map: Texture = js.native
  var size: Double = js.native
  var sizeAttenuation: Boolean = js.native
  var vertexColors: Boolean = js.native
  var fog: Boolean = js.native
  override def clone(): PointCloudMaterial = js.native
}

@js.native
@JSName("THREE.ParticleBasicMaterial")
class ParticleBasicMaterial extends PointCloudMaterial

@js.native
@JSName("THREE.ParticleSystemMaterial")
class ParticleSystemMaterial extends PointCloudMaterial

@js.native
@JSName("THREE.RawShaderMaterial")
class RawShaderMaterial(parameters: ShaderMaterialParameters = js.native) extends ShaderMaterial

@js.native
trait ShaderMaterialParameters extends MaterialParameters {
  var defines: js.Any = js.native
  var uniforms: js.Any = js.native
  var attributes: js.Any = js.native
  var vertexShader: String = js.native
  var fragmentShader: String = js.native
  var shading: Shading = js.native
  var linewidth: Double = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var fog: Boolean = js.native
  var lights: Boolean = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
}

@js.native
@JSName("THREE.ShaderMaterial")
class ShaderMaterial(parameters: ShaderMaterialParameters = js.native) extends Material {
  var defines: js.Any = js.native
  var uniforms: js.Any = js.native
  var attributes: js.Any = js.native
  var vertexShader: String = js.native
  var fragmentShader: String = js.native
  var shading: Shading = js.native
  var linewidth: Double = js.native
  var wireframe: Boolean = js.native
  var wireframeLinewidth: Double = js.native
  var fog: Boolean = js.native
  var lights: Boolean = js.native
  var vertexColors: Colors = js.native
  var skinning: Boolean = js.native
  var morphTargets: Boolean = js.native
  var morphNormals: Boolean = js.native
  override def clone(): ShaderMaterial = js.native
}

@js.native
trait SpriteCanvasMaterialParameters extends MaterialParameters {
  var color: Double = js.native
}

@js.native
@JSName("THREE.SpriteCanvasMaterial")
class SpriteCanvasMaterial(parameters: SpriteCanvasMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  def program(context: js.Any, color: Color): Unit = js.native
  override def clone(): SpriteCanvasMaterial = js.native
}

@js.native
trait SpriteMaterialParameters extends MaterialParameters {
  var color: Double = js.native
  var map: Texture = js.native
  var rotation: Double = js.native
  var fog: Boolean = js.native
}

@js.native
@JSName("THREE.SpriteMaterial")
class SpriteMaterial(parameters: SpriteMaterialParameters = js.native) extends Material {
  var color: Color = js.native
  var map: Texture = js.native
  var rotation: Double = js.native
  var fog: Boolean = js.native
  override def clone(): SpriteMaterial = js.native
}

@js.native
@JSName("THREE.Box2")
class Box2(var min: Vector2 = js.native, var max: Vector2 = js.native) extends js.Object {
  def set(min: Vector2, max: Vector2): Box2 = js.native
  def setFromPoints(points: js.Array[Vector2]): Box2 = js.native
  def setFromCenterAndSize(center: Vector2, size: Double): Box2 = js.native
  def copy(box: Box2): Box2 = js.native
  def makeEmpty(): Box2 = js.native
  def empty(): Boolean = js.native
  def center(optionalTarget: Vector2 = js.native): Vector2 = js.native
  def size(optionalTarget: Vector2 = js.native): Vector2 = js.native
  def expandByPoint(point: Vector2): Box2 = js.native
  def expandByVector(vector: Vector2): Box2 = js.native
  def expandByScalar(scalar: Double): Box2 = js.native
  def containsPoint(point: Vector2): Boolean = js.native
  def containsBox(box: Box2): Boolean = js.native
  def getParameter(point: Vector2): Vector2 = js.native
  def isIntersectionBox(box: Box2): Boolean = js.native
  def clampPoint(point: Vector2, optionalTarget: Vector2 = js.native): Vector2 = js.native
  def distanceToPoint(point: Vector2): Double = js.native
  def intersect(box: Box2): Box2 = js.native
  def union(box: Box2): Box2 = js.native
  def translate(offset: Vector2): Box2 = js.native
  def equals(box: Box2): Boolean = js.native
  override def clone(): Box2 = js.native
}

@js.native
@JSName("THREE.Box3")
class Box3(var min: Vector3 = js.native, var max: Vector3 = js.native) extends js.Object {
  def set(min: Vector3, max: Vector3): Box3 = js.native
  def setFromPoints(points: js.Array[Vector3]): Box3 = js.native
  def setFromCenterAndSize(center: Vector3, size: Double): Box3 = js.native
  def setFromObject(`object`: Object3D): Box3 = js.native
  def copy(box: Box3): Box3 = js.native
  def makeEmpty(): Box3 = js.native
  def empty(): Boolean = js.native
  def center(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def size(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def expandByPoint(point: Vector3): Box3 = js.native
  def expandByVector(vector: Vector3): Box3 = js.native
  def expandByScalar(scalar: Double): Box3 = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  def containsBox(box: Box3): Boolean = js.native
  def getParameter(point: Vector3): Vector3 = js.native
  def isIntersectionBox(box: Box3): Boolean = js.native
  def clampPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def getBoundingSphere(): Sphere = js.native
  def intersect(box: Box3): Box3 = js.native
  def union(box: Box3): Box3 = js.native
  def applyMatrix4(matrix: Matrix4): Box3 = js.native
  def translate(offset: Vector3): Box3 = js.native
  def equals(box: Box3): Boolean = js.native
  override def clone(): Box3 = js.native
}

@js.native
trait HSL extends js.Object {
  var h: Double = js.native
  var s: Double = js.native
  var l: Double = js.native
}

@js.native
@JSName("THREE.Color")
class Color(color: Color = js.native) extends js.Object {
  def this(r: Double, g: Double, b: Double) = this()
  def this(hex: Double) = this()
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  def set(color: Color): Color = js.native
  def setHex(hex: Double): Color = js.native
  def setRGB(r: Double, g: Double, b: Double): Color = js.native
  def setHSL(h: Double, s: Double, l: Double): Color = js.native
  def setStyle(style: String): Color = js.native
  def copy(color: Color): Color = js.native
  def copyGammaToLinear(color: Color): Color = js.native
  def copyLinearToGamma(color: Color): Color = js.native
  def convertGammaToLinear(): Color = js.native
  def convertLinearToGamma(): Color = js.native
  def getHex(): Double = js.native
  def getHexString(): String = js.native
  def getHSL(): HSL = js.native
  def getStyle(): String = js.native
  def offsetHSL(h: Double, s: Double, l: Double): Color = js.native
  def add(color: Color): Color = js.native
  def addColors(color1: Color, color2: Color): Color = js.native
  def addScalar(s: Double): Color = js.native
  def multiply(color: Color): Color = js.native
  def multiplyScalar(s: Double): Color = js.native
  def lerp(color: Color, alpha: Double): Color = js.native
  def equals(color: Color): Boolean = js.native
  def fromArray(rgb: js.Array[Double]): Color = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Color = js.native
}

@js.native
@JSName("THREE.ColorKeywords")
class ColorKeywords extends js.Object {
}

@js.native
@JSName("THREE.ColorKeywords")
object ColorKeywords extends js.Object {
  var aliceblue: Double = js.native
  var antiquewhite: Double = js.native
  var aqua: Double = js.native
  var aquamarine: Double = js.native
  var azure: Double = js.native
  var beige: Double = js.native
  var bisque: Double = js.native
  var black: Double = js.native
  var blanchedalmond: Double = js.native
  var blue: Double = js.native
  var blueviolet: Double = js.native
  var brown: Double = js.native
  var burlywood: Double = js.native
  var cadetblue: Double = js.native
  var chartreuse: Double = js.native
  var chocolate: Double = js.native
  var coral: Double = js.native
  var cornflowerblue: Double = js.native
  var cornsilk: Double = js.native
  var crimson: Double = js.native
  var cyan: Double = js.native
  var darkblue: Double = js.native
  var darkcyan: Double = js.native
  var darkgoldenrod: Double = js.native
  var darkgray: Double = js.native
  var darkgreen: Double = js.native
  var darkgrey: Double = js.native
  var darkkhaki: Double = js.native
  var darkmagenta: Double = js.native
  var darkolivegreen: Double = js.native
  var darkorange: Double = js.native
  var darkorchid: Double = js.native
  var darkred: Double = js.native
  var darksalmon: Double = js.native
  var darkseagreen: Double = js.native
  var darkslateblue: Double = js.native
  var darkslategray: Double = js.native
  var darkslategrey: Double = js.native
  var darkturquoise: Double = js.native
  var darkviolet: Double = js.native
  var deeppink: Double = js.native
  var deepskyblue: Double = js.native
  var dimgray: Double = js.native
  var dimgrey: Double = js.native
  var dodgerblue: Double = js.native
  var firebrick: Double = js.native
  var floralwhite: Double = js.native
  var forestgreen: Double = js.native
  var fuchsia: Double = js.native
  var gainsboro: Double = js.native
  var ghostwhite: Double = js.native
  var gold: Double = js.native
  var goldenrod: Double = js.native
  var gray: Double = js.native
  var green: Double = js.native
  var greenyellow: Double = js.native
  var grey: Double = js.native
  var honeydew: Double = js.native
  var hotpink: Double = js.native
  var indianred: Double = js.native
  var indigo: Double = js.native
  var ivory: Double = js.native
  var khaki: Double = js.native
  var lavender: Double = js.native
  var lavenderblush: Double = js.native
  var lawngreen: Double = js.native
  var lemonchiffon: Double = js.native
  var lightblue: Double = js.native
  var lightcoral: Double = js.native
  var lightcyan: Double = js.native
  var lightgoldenrodyellow: Double = js.native
  var lightgray: Double = js.native
  var lightgreen: Double = js.native
  var lightgrey: Double = js.native
  var lightpink: Double = js.native
  var lightsalmon: Double = js.native
  var lightseagreen: Double = js.native
  var lightskyblue: Double = js.native
  var lightslategray: Double = js.native
  var lightslategrey: Double = js.native
  var lightsteelblue: Double = js.native
  var lightyellow: Double = js.native
  var lime: Double = js.native
  var limegreen: Double = js.native
  var linen: Double = js.native
  var magenta: Double = js.native
  var maroon: Double = js.native
  var mediumaquamarine: Double = js.native
  var mediumblue: Double = js.native
  var mediumorchid: Double = js.native
  var mediumpurple: Double = js.native
  var mediumseagreen: Double = js.native
  var mediumslateblue: Double = js.native
  var mediumspringgreen: Double = js.native
  var mediumturquoise: Double = js.native
  var mediumvioletred: Double = js.native
  var midnightblue: Double = js.native
  var mintcream: Double = js.native
  var mistyrose: Double = js.native
  var moccasin: Double = js.native
  var navajowhite: Double = js.native
  var navy: Double = js.native
  var oldlace: Double = js.native
  var olive: Double = js.native
  var olivedrab: Double = js.native
  var orange: Double = js.native
  var orangered: Double = js.native
  var orchid: Double = js.native
  var palegoldenrod: Double = js.native
  var palegreen: Double = js.native
  var paleturquoise: Double = js.native
  var palevioletred: Double = js.native
  var papayawhip: Double = js.native
  var peachpuff: Double = js.native
  var peru: Double = js.native
  var pink: Double = js.native
  var plum: Double = js.native
  var powderblue: Double = js.native
  var purple: Double = js.native
  var red: Double = js.native
  var rosybrown: Double = js.native
  var royalblue: Double = js.native
  var saddlebrown: Double = js.native
  var salmon: Double = js.native
  var sandybrown: Double = js.native
  var seagreen: Double = js.native
  var seashell: Double = js.native
  var sienna: Double = js.native
  var silver: Double = js.native
  var skyblue: Double = js.native
  var slateblue: Double = js.native
  var slategray: Double = js.native
  var slategrey: Double = js.native
  var snow: Double = js.native
  var springgreen: Double = js.native
  var steelblue: Double = js.native
  var tan: Double = js.native
  var teal: Double = js.native
  var thistle: Double = js.native
  var tomato: Double = js.native
  var turquoise: Double = js.native
  var violet: Double = js.native
  var wheat: Double = js.native
  var white: Double = js.native
  var whitesmoke: Double = js.native
  var yellow: Double = js.native
  var yellowgreen: Double = js.native
}

@js.native
@JSName("THREE.Euler")
class Euler(var x: Double = js.native, var y: Double = js.native, var z: Double = js.native, var order: String = js.native) extends js.Object {
  def set(x: Double, y: Double, z: Double, order: String = js.native): Euler = js.native
  def copy(euler: Euler): Euler = js.native
  def setFromRotationMatrix(m: Matrix4, order: String = js.native): Euler = js.native
  def setFromQuaternion(q: Quaternion, order: String = js.native, update: Boolean = js.native): Euler = js.native
  def reorder(newOrder: String): Euler = js.native
  def equals(euler: Euler): Boolean = js.native
  def fromArray(xyzo: js.Array[js.Any]): Euler = js.native
  def toArray(): js.Array[js.Any] = js.native
  var onChange: js.Function0[Unit] = js.native
  override def clone(): Euler = js.native
}

@js.native
@JSName("THREE.Frustum")
class Frustum(p0: Plane = js.native, p1: Plane = js.native, p2: Plane = js.native, p3: Plane = js.native, p4: Plane = js.native, p5: Plane = js.native) extends js.Object {
  var planes: js.Array[Plane] = js.native
  def set(p0: Double = js.native, p1: Double = js.native, p2: Double = js.native, p3: Double = js.native, p4: Double = js.native, p5: Double = js.native): Frustum = js.native
  def copy(frustum: Frustum): Frustum = js.native
  def setFromMatrix(m: Matrix4): Frustum = js.native
  def intersectsObject(`object`: Object3D): Boolean = js.native
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  def intersectsBox(box: Box3): Boolean = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  override def clone(): Frustum = js.native
}

@js.native
@JSName("THREE.Line3")
class Line3(var start: Vector3 = js.native, var end: Vector3 = js.native) extends js.Object {
  def set(start: Vector3 = js.native, end: Vector3 = js.native): Line3 = js.native
  def copy(line: Line3): Line3 = js.native
  def center(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def delta(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def distanceSq(): Double = js.native
  def distance(): Double = js.native
  def at(t: Double, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def closestPointToPointParameter(point: Vector3, clampToLine: Boolean = js.native): Double = js.native
  def closestPointToPoint(point: Vector3, clampToLine: Boolean = js.native, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def applyMatrix4(matrix: Matrix4): Line3 = js.native
  def equals(line: Line3): Boolean = js.native
  override def clone(): Line3 = js.native
}

@js.native
trait Math extends js.Object {
  def generateUUID(): String = js.native
  def clamp(x: Double, a: Double, b: Double): Double = js.native
  def clampBottom(x: Double, a: Double): Double = js.native
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native
  def random16(): Double = js.native
  def randInt(low: Double, high: Double): Double = js.native
  def randFloat(low: Double, high: Double): Double = js.native
  def randFloatSpread(range: Double): Double = js.native
  def sign(x: Double): Double = js.native
  def degToRad(degrees: Double): Double = js.native
  def radToDeg(radians: Double): Double = js.native
  def isPowerOfTwo(value: Double): Boolean = js.native
}

@js.native
trait Matrix extends js.Object {
  var elements: scala.scalajs.js.typedarray.Float32Array = js.native
  def identity(): Matrix = js.native
  def copy(m: Matrix): Matrix = js.native
  def multiplyScalar(s: Double): Matrix = js.native
  def determinant(): Double = js.native
  def getInverse(matrix: Matrix, throwOnInvertible: Boolean = js.native): Matrix = js.native
  def transpose(): Matrix = js.native
  override def clone(): Matrix = js.native
}

@js.native
@JSName("THREE.Matrix3")
class Matrix3 extends Matrix {

  def set(n11: Double, n12: Double, n13: Double, n21: Double, n22: Double, n23: Double, n31: Double, n32: Double, n33: Double): Matrix3 = js.native
  override def identity(): Matrix3 = js.native
  def copy(m: Matrix3): Matrix3 = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double = js.native, length: Double = js.native): js.Array[Double] = js.native
  override def multiplyScalar(s: Double): Matrix3 = js.native
  override def determinant(): Double = js.native
  def getInverse(matrix: Matrix3): Matrix3 = js.native
  def getInverse(matrix: Matrix3, throwOnInvertible: Boolean): Matrix3 = js.native
  override def transpose(): Matrix3 = js.native
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def getNormalMatrix(m: Matrix4): Matrix3 = js.native
  def transposeIntoArray(r: js.Array[Double]): js.Array[Double] = js.native
  def fromArray(array: js.Array[Double]): Matrix3 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Matrix3 = js.native
}

@js.native
@JSName("THREE.Matrix4")
class Matrix4 extends Matrix {
  def set(n11: Double, n12: Double, n13: Double, n14: Double, n21: Double, n22: Double, n23: Double, n24: Double, n31: Double, n32: Double, n33: Double, n34: Double, n41: Double, n42: Double, n43: Double, n44: Double): Matrix4 = js.native
  override def identity(): Matrix4 = js.native
  def copy(m: Matrix4): Matrix4 = js.native
  def copyPosition(m: Matrix4): Matrix4 = js.native
  def extractRotation(m: Matrix4): Matrix4 = js.native
  def makeRotationFromEuler(euler: Euler): Matrix4 = js.native
  def makeRotationFromQuaternion(q: Quaternion): Matrix4 = js.native
  def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4 = js.native
  def multiply(m: Matrix4): Matrix4 = js.native
  def multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 = js.native
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double]): Matrix4 = js.native
  override def multiplyScalar(s: Double): Matrix4 = js.native
  def applyToVector3Array(array: js.Array[Double], offset: Double = js.native, length: Double = js.native): js.Array[Double] = js.native
  override def determinant(): Double = js.native
  override def transpose(): Matrix4 = js.native
  def flattenToArrayOffset(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def setPosition(v: Vector3): Vector3 = js.native
  def getInverse(m: Matrix4): Matrix4 = js.native
  def getInverse(m: Matrix4, throwOnInvertible: Boolean): Matrix4 = js.native
  def scale(v: Vector3): Matrix4 = js.native
  def getMaxScaleOnAxis(): Double = js.native
  def makeTranslation(x: Double, y: Double, z: Double): Matrix4 = js.native
  def makeRotationX(theta: Double): Matrix4 = js.native
  def makeRotationY(theta: Double): Matrix4 = js.native
  def makeRotationZ(theta: Double): Matrix4 = js.native
  def makeRotationAxis(axis: Vector3, angle: Double): Matrix4 = js.native
  def makeScale(x: Double, y: Double, z: Double): Matrix4 = js.native
  def compose(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4 = js.native
  def decompose(translation: Vector3 = js.native, rotation: Quaternion = js.native, scale: Vector3 = js.native): js.Array[Object] = js.native
  def makeFrustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  def makePerspective(fov: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.native
  def makeOrthographic(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): Matrix4 = js.native
  def fromArray(array: js.Array[Double]): Matrix4 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Matrix4 = js.native
}

@js.native
@JSName("THREE.Plane")
class Plane(var normal: Vector3 = js.native, var constant: Double = js.native) extends js.Object {
  def set(normal: Vector3, constant: Double): Plane = js.native
  def setComponents(x: Double, y: Double, z: Double, w: Double): Plane = js.native
  def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): Plane = js.native
  def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): Plane = js.native
  def copy(plane: Plane): Plane = js.native
  def normalize(): Plane = js.native
  def negate(): Plane = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def distanceToSphere(sphere: Sphere): Double = js.native
  def projectPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def orthoPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def isIntersectionLine(line: Line3): Boolean = js.native
  def intersectLine(line: Line3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def coplanarPoint(optionalTarget: Boolean = js.native): Vector3 = js.native
  def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: Matrix3 = js.native): Plane = js.native
  def translate(offset: Vector3): Plane = js.native
  def equals(plane: Plane): Boolean = js.native
  override def clone(): Plane = js.native
}

@js.native
@JSName("THREE.Quaternion")
class Quaternion(var x: Double = js.native, var y: Double = js.native, var z: Double = js.native, var w: Double = js.native) extends js.Object {
  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  def copy(q: Quaternion): Quaternion = js.native
  def setFromEuler(euler: Euler, update: Boolean = js.native): Quaternion = js.native
  def setFromAxisAngle(axis: Vector3, angle: Double): Quaternion = js.native
  def setFromRotationMatrix(m: Matrix4): Quaternion = js.native
  def setFromUnitVectors(vFrom: Vector3, vTo: Vector3): Quaternion = js.native
  def inverse(): Quaternion = js.native
  def conjugate(): Quaternion = js.native
  def dot(v: Quaternion): Double = js.native
  def lengthSq(): Double = js.native
  def length(): Double = js.native
  def normalize(): Quaternion = js.native
  def multiply(q: Quaternion): Quaternion = js.native
  def multiplyQuaternions(a: Quaternion, b: Quaternion): Quaternion = js.native
  def multiplyVector3(vector: Vector3): Vector3 = js.native
  def slerp(qb: Quaternion, t: Double): Quaternion = js.native
  def equals(v: Quaternion): Boolean = js.native
  def fromArray(n: js.Array[Double]): Quaternion = js.native
  def toArray(): js.Array[Double] = js.native
  var onChange: js.Function0[Unit] = js.native
  override def clone(): Quaternion = js.native
}

@js.native
@JSName("THREE.Quaternion")
object Quaternion extends js.Object {
  def slerp(qa: Quaternion, qb: Quaternion, qm: Quaternion, t: Double): Quaternion = js.native
}

@js.native
@JSName("THREE.Ray")
class Ray(var origin: Vector3 = js.native, var direction: Vector3 = js.native) extends js.Object {
  def set(origin: Vector3, direction: Vector3): Ray = js.native
  def copy(ray: Ray): Ray = js.native
  def at(t: Double, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def recast(t: Double): Ray = js.native
  def closestPointToPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3 = js.native, optionalPointOnSegment: Vector3 = js.native): Double = js.native
  def isIntersectionSphere(sphere: Sphere): Boolean = js.native
  def intersectSphere(sphere: Sphere, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def isIntersectionPlane(plane: Plane): Boolean = js.native
  def distanceToPlane(plane: Plane): Double = js.native
  def intersectPlane(plane: Plane, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def isIntersectionBox(box: Box3): Boolean = js.native
  def intersectBox(box: Box3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def applyMatrix4(matrix4: Matrix4): Ray = js.native
  def equals(ray: Ray): Boolean = js.native
  override def clone(): Ray = js.native
}

@js.native
@JSName("THREE.Sphere")
class Sphere(var center: Vector3 = js.native, var radius: Double = js.native) extends js.Object {
  def set(center: Vector3, radius: Double): Sphere = js.native
  def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3 = js.native): Sphere = js.native
  def copy(sphere: Sphere): Sphere = js.native
  def empty(): Boolean = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  def clampPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def getBoundingBox(optionalTarget: Box3 = js.native): Box3 = js.native
  def applyMatrix4(matrix: Matrix4): Sphere = js.native
  def translate(offset: Vector3): Sphere = js.native
  def equals(sphere: Sphere): Boolean = js.native
  override def clone(): Sphere = js.native
}

@js.native
trait SplineControlPoint extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
}

@js.native
@JSName("THREE.Spline")
class Spline(var points: js.Array[SplineControlPoint]) extends js.Object {
  def initFromArray(a: js.Array[js.Array[Double]]): Unit = js.native
  def getPoint(k: Double): SplineControlPoint = js.native
  def getControlPointsArray(): js.Array[js.Array[Double]] = js.native
  def getLength(nSubDivisions: Double = js.native): js.Any = js.native
  def reparametrizeByArcLength(samplingCoef: Double): Unit = js.native
}

@js.native
@JSName("THREE.Triangle")
class Triangle(var a: Vector3 = js.native, var b: Vector3 = js.native, var c: Vector3 = js.native) extends js.Object {
  def set(a: Vector3, b: Vector3, c: Vector3): Triangle = js.native
  def setFromPointsAndIndices(points: js.Array[Vector3], i0: Double, i1: Double, i2: Double): Triangle = js.native
  def copy(triangle: Triangle): Triangle = js.native
  def area(): Double = js.native
  def midpoint(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def normal(optionalTarget: Vector3 = js.native): Vector3 = js.native
  def plane(optionalTarget: Vector3 = js.native): Plane = js.native
  def barycoordFromPoint(point: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  def equals(triangle: Triangle): Boolean = js.native
  override def clone(): Triangle = js.native
}

@js.native
@JSName("THREE.Triangle")
object Triangle extends js.Object {
  def normal(a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3 = js.native): Vector3 = js.native
  def barycoordFromPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3): Vector3 = js.native
  def containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3): Boolean = js.native
}

@js.native
trait Vector extends js.Object {
  def setComponent(index: Double, value: Double): Unit = js.native
  def getComponent(index: Double): Double = js.native
  def copy(v: Vector): Vector = js.native
  def add(v: Vector): Vector = js.native
  def addVectors(a: Vector, b: Vector): Vector = js.native
  def sub(v: Vector): Vector = js.native
  def subVectors(a: Vector, b: Vector): Vector = js.native
  def multiplyScalar(s: Double): Vector = js.native
  def divideScalar(s: Double): Vector = js.native
  def negate(): Vector = js.native
  def dot(v: Vector): Double = js.native
  def lengthSq(): Double = js.native
  def length(): Double = js.native
  def normalize(): Vector = js.native
  def distanceTo(v: Vector): Double = js.native
  def distanceToSquared(v: Vector): Double = js.native
  def setLength(l: Double): Vector = js.native
  def lerp(v: Vector, alpha: Double): Vector = js.native
  def equals(v: Vector): Boolean = js.native
  override def clone(): Vector = js.native
}

@js.native
@JSName("THREE.Vector2")
class Vector2(var x: Double = js.native, var y: Double = js.native) extends Vector {
  def set(x: Double, y: Double): Vector2 = js.native
  def setX(x: Double): Vector2 = js.native
  def setY(y: Double): Vector2 = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  def copy(v: Vector2): Vector2 = js.native
  def add(v: Vector2): Vector2 = js.native
  def addVectors(a: Vector2, b: Vector2): Vector2 = js.native
  def addScalar(s: Double): Vector2 = js.native
  def sub(v: Vector2): Vector2 = js.native
  def subVectors(a: Vector2, b: Vector2): Vector2 = js.native
  def multiply(v: Vector2): Vector2 = js.native
  override def multiplyScalar(s: Double): Vector2 = js.native
  def divide(v: Vector2): Vector2 = js.native
  override def divideScalar(s: Double): Vector2 = js.native
  def min(v: Vector2): Vector2 = js.native
  def max(v: Vector2): Vector2 = js.native
  def clamp(min: Vector2, max: Vector2): Vector2 = js.native
  def clampScalar(min: Double, max: Double): Vector2 = js.native
  def floor(): Vector2 = js.native
  def ceil(): Vector2 = js.native
  def round(): Vector2 = js.native
  def roundToZero(): Vector2 = js.native
  override def negate(): Vector2 = js.native
  def dot(v: Vector2): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  override def normalize(): Vector2 = js.native
  def distanceTo(v: Vector2): Double = js.native
  def distanceToSquared(v: Vector2): Double = js.native
  override def setLength(l: Double): Vector2 = js.native
  def lerp(v: Vector2, alpha: Double): Vector2 = js.native
  def equals(v: Vector2): Boolean = js.native
  def fromArray(xy: js.Array[Double]): Vector2 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Vector2 = js.native
}

@js.native
@JSName("THREE.Vector3")
class Vector3(var x: Double = js.native, var y: Double = js.native, var z: Double = js.native) extends Vector {
  def set(x: Double, y: Double, z: Double): Vector3 = js.native
  def setX(x: Double): Vector3 = js.native
  def setY(y: Double): Vector3 = js.native
  def setZ(z: Double): Vector3 = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  def copy(v: Vector3): Vector3 = js.native
  def add(a: Vector3): Vector3 = js.native
  def addScalar(s: Double): Vector3 = js.native
  def addVectors(a: Vector3, b: Vector3): Vector3 = js.native
  def sub(a: Vector3): Vector3 = js.native
  def subVectors(a: Vector3, b: Vector3): Vector3 = js.native
  def multiply(v: Vector3): Vector3 = js.native
  override def multiplyScalar(s: Double): Vector3 = js.native
  def multiplyVectors(a: Vector3, b: Vector3): Vector3 = js.native
  def applyEuler(euler: Euler): Vector3 = js.native
  def applyAxisAngle(axis: Vector3, angle: Double): Vector3 = js.native
  def applyMatrix3(m: Matrix3): Vector3 = js.native
  def applyMatrix4(m: Matrix4): Vector3 = js.native
  def applyProjection(m: Matrix4): Vector3 = js.native
  def applyQuaternion(q: Quaternion): Vector3 = js.native
  def transformDirection(m: Matrix4): Vector3 = js.native
  def divide(v: Vector3): Vector3 = js.native
  override def divideScalar(s: Double): Vector3 = js.native
  def min(v: Vector3): Vector3 = js.native
  def max(v: Vector3): Vector3 = js.native
  def clamp(min: Vector3, max: Vector3): Vector3 = js.native
  def clampScalar(min: Double, max: Double): Vector3 = js.native
  def floor(): Vector3 = js.native
  def ceil(): Vector3 = js.native
  def round(): Vector3 = js.native
  def roundToZero(): Vector3 = js.native
  override def negate(): Vector3 = js.native
  def dot(v: Vector3): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  def lengthManhattan(): Double = js.native
  override def normalize(): Vector3 = js.native
  override def setLength(l: Double): Vector3 = js.native
  def lerp(v: Vector3, alpha: Double): Vector3 = js.native
  def cross(a: Vector3): Vector3 = js.native
  def crossVectors(a: Vector3, b: Vector3): Vector3 = js.native
  def project(camera: Camera): Vector3 = js.native
  def unproject(camera: Camera): Vector3 = js.native
  def projectOnVector(v: Vector3): Vector3 = js.native
  def projectOnPlane(planeNormal: Vector3): Vector3 = js.native
  def reflect(vector: Vector3): Vector3 = js.native
  def angleTo(v: Vector3): Double = js.native
  def distanceTo(v: Vector3): Double = js.native
  def distanceToSquared(v: Vector3): Double = js.native
  def setFromMatrixPosition(m: Matrix4): Vector3 = js.native
  def setFromMatrixScale(m: Matrix4): Vector3 = js.native
  def setFromSpherical(s: Spherical): Vector3 = js.native
  def setFromMatrixColumn(matrix: Matrix4, index: Double): Vector3 = js.native
  def equals(v: Vector3): Boolean = js.native
  def fromArray(xyz: js.Array[Double]): Vector3 = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Vector3 = js.native
}

@js.native
@JSName("THREE.Vector4")
class Vector4(var x: Double = js.native, var y: Double = js.native, var z: Double = js.native, var w: Double = js.native) extends Vector {
  def set(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  def setX(x: Double): Vector4 = js.native
  def setY(y: Double): Vector4 = js.native
  def setZ(z: Double): Vector4 = js.native
  def setW(w: Double): Vector4 = js.native
  override def setComponent(index: Double, value: Double): Unit = js.native
  override def getComponent(index: Double): Double = js.native
  def copy(v: Vector4): Vector4 = js.native
  def add(v: Vector4): Vector4 = js.native
  def addScalar(s: Double): Vector4 = js.native
  def addVectors(a: Vector4, b: Vector4): Vector4 = js.native
  def sub(v: Vector4): Vector4 = js.native
  def subVectors(a: Vector4, b: Vector4): Vector4 = js.native
  override def multiplyScalar(s: Double): Vector4 = js.native
  def applyMatrix4(m: Matrix4): Vector4 = js.native
  override def divideScalar(s: Double): Vector4 = js.native
  def setAxisAngleFromQuaternion(q: Quaternion): Vector4 = js.native
  def setAxisAngleFromRotationMatrix(m: Matrix3): Vector4 = js.native
  def min(v: Vector4): Vector4 = js.native
  def max(v: Vector4): Vector4 = js.native
  def clamp(min: Vector4, max: Vector4): Vector4 = js.native
  def clampScalar(min: Double, max: Double): Vector4 = js.native
  def floor(): Vector4 = js.native
  def ceil(): Vector4 = js.native
  def round(): Vector4 = js.native
  def roundToZero(): Vector4 = js.native
  override def negate(): Vector4 = js.native
  def dot(v: Vector4): Double = js.native
  override def lengthSq(): Double = js.native
  override def length(): Double = js.native
  def lengthManhattan(): Double = js.native
  override def normalize(): Vector4 = js.native
  override def setLength(l: Double): Vector4 = js.native
  def lerp(v: Vector4, alpha: Double): Vector4 = js.native
  def equals(v: Vector4): Boolean = js.native
  def fromArray(xyzw: js.Array[Double]): js.Array[Double] = js.native
  def toArray(): js.Array[Double] = js.native
  override def clone(): Vector4 = js.native
}

@js.native
@JSName("THREE.Spherical")
class Spherical(var radius: Double = js.native, var phi: Double = js.native, var theta: Double = js.native) extends js.Object {
  def set(radius: Double, phi: Double, theta: Double): Spherical = js.native
  override def clone(): Spherical = js.native
  def copy(other: Spherical): Spherical = js.native
  // restrict phi to be betwee EPS and PI-EPS
  def makeSafe(): Spherical = js.native
  def setFromVector3(vec3: Vector3): Spherical = js.native
}

@js.native
@JSName("THREE.Bone")
class Bone(var skin: SkinnedMesh) extends Object3D {
  var accumulatedRotWeight: Double = js.native
  var accumulatedPosWeight: Double = js.native
  var accumulatedSclWeight: Double = js.native
  override def updateMatrixWorld(forceUpdate: Boolean): Unit = js.native
}

@js.native
@JSName("THREE.Line")
class Line(var geometry: Geometry = js.native, var material: LineBasicMaterial = js.native, var `type`: Double = js.native) extends Object3D {
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def clone(`object`: Line): Line = js.native
}

@js.native
sealed trait LineType extends js.Object {
}

@js.native
@JSName("THREE.LineType")
object LineType extends js.Object {
  @JSBracketAccess
  def apply(value: LineType): String = js.native
}

@js.native
@JSName("THREE.LOD")
class LOD extends Object3D {
  var objects: js.Array[js.Any] = js.native
  def addLevel(`object`: Object3D, distance: Double = js.native): Unit = js.native
  def getObjectForDistance(distance: Double): Object3D = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def update(camera: Camera): Unit = js.native
  def clone(`object`: LOD): LOD = js.native
}

@js.native
@JSName("THREE.Mesh")
class Mesh(var geometry: Geometry = js.native, var material: Material = js.native) extends Object3D {
  def updateMorphTargets(): Unit = js.native
  def getMorphTargetIndexByName(name: String): Double = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def clone(`object`: Mesh): Mesh = js.native
}

@js.native
@JSName("THREE.MorphAnimMesh")
class MorphAnimMesh(geometry: Geometry = js.native, material: MeshBasicMaterial = js.native) extends Mesh(geometry, material) {
  var duration: Double = js.native
  var mirroredLoop: Boolean = js.native
  var time: Double = js.native
  var lastKeyframe: Double = js.native
  var currentKeyframe: Double = js.native
  var direction: Double = js.native
  var directionBackwards: Boolean = js.native
  var startKeyframe: Double = js.native
  var endKeyframe: Double = js.native
  var length: Double = js.native
  def setFrameRange(start: Double, end: Double): Unit = js.native
  def setDirectionForward(): Unit = js.native
  def setDirectionBackward(): Unit = js.native
  def parseAnimations(): Unit = js.native
  def setAnimationLabel(label: String, start: Double, end: Double): Unit = js.native
  def playAnimation(label: String, fps: Double): Unit = js.native
  def updateAnimation(delta: Double): Unit = js.native
  def interpolateTargets(a: Double, b: Double, t: Double): Unit = js.native
  def clone(`object`: MorphAnimMesh): MorphAnimMesh = js.native
}

@js.native
@JSName("THREE.PointCloud")
class PointCloud(var geometry: Geometry, var material: PointCloudMaterial = js.native) extends Object3D {
  var sortParticles: Boolean = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  def clone(`object`: PointCloud): PointCloud = js.native
}

@js.native
@JSName("THREE.Skeleton")
class Skeleton(var bones: js.Array[Bone], var boneInverses: js.Array[Matrix4] = js.native, var useVertexTexture: Boolean = js.native) extends js.Object {
  var identityMatrix: Matrix4 = js.native
  var boneTextureWidth: Double = js.native
  var boneTextureHeight: Double = js.native
  var boneMatrices: Float32Array = js.native
  var boneTexture: DataTexture = js.native
  def calculateInverses(bone: Bone): Unit = js.native
  def pose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.SkinnedMesh")
class SkinnedMesh(geometry: Geometry = js.native, material: MeshBasicMaterial = js.native, useVertexTexture: Boolean = js.native) extends Mesh(geometry, material) {
  var bindMode: String = js.native
  var bindMatrix: Matrix4 = js.native
  var bindMatrixInverse: Matrix4 = js.native
  def bind(skeleton: Skeleton): Unit = js.native
  def bind(skeleton: Skeleton, bindMatrix: Matrix4): Unit = js.native
  def pose(): Unit = js.native
  def normalizeSkinWeights(): Unit = js.native
  def clone(`object`: SkinnedMesh): SkinnedMesh = js.native
  var skeleton: Skeleton = js.native
}

@js.native
@JSName("THREE.Sprite")
class Sprite(var material: Material = js.native) extends Object3D {
  var geometry: BufferGeometry = js.native
  override def raycast(raycaster: Raycaster, intersects: js.Any): Unit = js.native
  override def updateMatrix(): Unit = js.native
  def clone(`object`: Sprite): Sprite = js.native
}

@js.native
trait Renderer extends js.Object {
  def render(scene: Scene, camera: Camera): Unit = js.native
  def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  var domElement: HTMLCanvasElement = js.native
}

@js.native
trait CanvasRendererParameters extends js.Object {
  var canvas: HTMLCanvasElement = js.native
  var devicePixelRatio: Double = js.native
}

@js.native
@JSName("THREE.CanvasRenderer")
class CanvasRenderer(parameters: CanvasRendererParameters = js.native) extends Renderer {

  var devicePixelRatio: Double = js.native
  var autoClear: Boolean = js.native
  var sortObjects: Boolean = js.native
  var sortElements: Boolean = js.native
  var info: js.Any = js.native
  def supportsVertexTextures(): Unit = js.native
  def setFaceCulling(): Unit = js.native
  override def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setScissor(): Unit = js.native
  def enableScissorTest(): Unit = js.native
  def setClearColor(color: Color, opacity: Double = js.native): Unit = js.native
  def setClearColorHex(hex: Double, alpha: Double = js.native): Unit = js.native
  def getClearColor(): Color = js.native
  def getClearAlpha(): Double = js.native
  def getMaxAnisotropy(): Double = js.native
  def clear(): Unit = js.native
  def clearColor(): Unit = js.native
  def clearDepth(): Unit = js.native
  def clearStencil(): Unit = js.native
  override def render(scene: Scene, camera: Camera): Unit = js.native
}

@js.native
trait RendererPlugin extends js.Object {
  def init(renderer: WebGLRenderer): Unit = js.native
  def render(scene: Scene, camera: Camera, currentWidth: Double, currentHeight: Double): Unit = js.native
}

@js.native
trait WebGLRendererParameters extends js.Object {
  var canvas: HTMLCanvasElement = js.native
  var precision: String = js.native
  var alpha: Boolean = js.native
  var premultipliedAlpha: Boolean = js.native
  var antialias: Boolean = js.native
  var stencil: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var clearColor: Double = js.native
  var clearAlpha: Double = js.native
  var devicePixelRatio: Double = js.native
}

@js.native
@JSName("THREE.WebGLRenderer")
class WebGLRenderer(parameters: WebGLRendererParameters = js.native) extends Renderer {

  var context: js.Any = js.native
  var devicePixelRatio: Double = js.native
  var autoClear: Boolean = js.native
  var autoClearColor: Boolean = js.native
  var autoClearDepth: Boolean = js.native
  var autoClearStencil: Boolean = js.native
  var sortObjects: Boolean = js.native
  var gammaInput: Boolean = js.native
  var gammaOutput: Boolean = js.native
  var shadowMapEnabled: Boolean = js.native
  var shadowMapAutoUpdate: Boolean = js.native
  var shadowMapType: ShadowMapType = js.native
  var shadowMapCullFace: CullFace = js.native
  var shadowMapDebug: Boolean = js.native
  var shadowMapCascade: Boolean = js.native
  var maxMorphTargets: Double = js.native
  var maxMorphNormals: Double = js.native
  var autoScaleCubemaps: Boolean = js.native
  var renderPluginsPre: js.Array[RendererPlugin] = js.native
  var renderPluginsPost: js.Array[RendererPlugin] = js.native
  var info: js.Any = js.native
  var shadowMapPlugin: ShadowMapPlugin = js.native
  def getContext(): WebGLRenderingContext = js.native
  def supportsVertexTextures(): Boolean = js.native
  def supportsFloatTextures(): Boolean = js.native
  def supportsStandardDerivatives(): Boolean = js.native
  def supportsCompressedTextureS3TC(): Boolean = js.native
  def getMaxAnisotropy(): Double = js.native
  def getPrecision(): String = js.native
  override def setSize(width: Double, height: Double, updateStyle: Boolean = js.native): Unit = js.native
  def setViewport(x: Double = js.native, y: Double = js.native, width: Double = js.native, height: Double = js.native): Unit = js.native
  def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def enableScissorTest(enable: Boolean): Unit = js.native
  def setClearColor(color: Color, alpha: Double = js.native): Unit = js.native
  def setClearColorHex(hex: Double, alpha: Double): Unit = js.native
  def getClearColor(): Color = js.native
  def getClearAlpha(): Double = js.native
  def clear(color: Boolean = js.native, depth: Boolean = js.native, stencil: Boolean = js.native): Unit = js.native
  def clearColor(): Unit = js.native
  def clearDepth(): Unit = js.native
  def clearStencil(): Unit = js.native
  def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
  def addPostPlugin(plugin: RendererPlugin): Unit = js.native
  def addPrePlugin(plugin: RendererPlugin): Unit = js.native
  def updateShadowMap(scene: Scene, camera: Camera): Unit = js.native
  def renderBufferImmediate(`object`: Object3D, program: Object, material: Material): Unit = js.native
  def renderBufferDirect(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, geometryGroup: js.Any, `object`: Object3D): Unit = js.native
  def renderBuffer(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, geometryGroup: js.Any, `object`: Object3D): Unit = js.native
  def render(scene: Scene, camera: Camera, renderTarget: RenderTarget = js.native, forceClear: Boolean = js.native): Unit = js.native
  def renderImmediateObject(camera: Camera, lights: js.Array[Light], fog: Fog, material: Material, `object`: Object3D): Unit = js.native
  def initMaterial(material: Material, lights: js.Array[Light], fog: Fog, `object`: Object3D): Unit = js.native
  def setFaceCulling(cullFace: CullFace = js.native, frontFace: FrontFaceDirection = js.native): Unit = js.native
  def setMaterialFaces(material: Material): Unit = js.native
  def setDepthTest(depthTest: Boolean): Unit = js.native
  def setDepthWrite(depthWrite: Boolean): Unit = js.native
  def setBlending(blending: Blending, blendEquation: BlendingEquation, blendSrc: BlendingSrcFactor, blendDst: BlendingDstFactor): Unit = js.native
  def setTexture(texture: Texture, slot: Double): Unit = js.native
  def setRenderTarget(renderTarget: RenderTarget): Unit = js.native
}

@js.native
trait RenderTarget extends js.Object {
}

@js.native
trait WebGLRenderTargetOptions extends js.Object {
  var wrapS: Wrapping = js.native
  var wrapT: Wrapping = js.native
  var magFilter: TextureFilter = js.native
  var minFilter: TextureFilter = js.native
  var anisotropy: Double = js.native
  var format: Double = js.native
  var `type`: TextureDataType = js.native
  var depthBuffer: Boolean = js.native
  var stencilBuffer: Boolean = js.native
}

@js.native
@JSName("THREE.WebGLRenderTarget")
class WebGLRenderTarget(var width: Double, var height: Double, options: WebGLRenderTargetOptions = js.native) extends RenderTarget with EventDispatcher {
  var wrapS: Wrapping = js.native
  var wrapT: Wrapping = js.native
  var magFilter: TextureFilter = js.native
  var minFilter: TextureFilter = js.native
  var anisotropy: Double = js.native
  var offset: Vector2 = js.native
  var repeat: Vector2 = js.native
  var format: Double = js.native
  var `type`: Double = js.native
  var depthBuffer: Boolean = js.native
  var stencilBuffer: Boolean = js.native
  var generateMipmaps: Boolean = js.native
  var shareDepthFrom: js.Any = js.native
  override def clone(): WebGLRenderTarget = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("THREE.WebGLRenderTargetCube")
class WebGLRenderTargetCube(width: Double, height: Double, options: WebGLRenderTargetOptions = js.native) extends WebGLRenderTarget(width, height, options) {
  var activeCubeFace: Double = js.native
}

@js.native
@JSName("THREE.RenderableFace")
class RenderableFace extends js.Object {
  var id: Double = js.native
  var v1: RenderableVertex = js.native
  var v2: RenderableVertex = js.native
  var v3: RenderableVertex = js.native
  var normalModel: Vector3 = js.native
  var vertexNormalsModel: js.Array[Vector3] = js.native
  var vertexNormalsLength: Double = js.native
  var color: Color = js.native
  var material: Material = js.native
  var uvs: js.Array[js.Array[Vector2]] = js.native
  var z: Double = js.native
}

@js.native
@JSName("THREE.RenderableLine")
class RenderableLine extends js.Object {
  var id: Double = js.native
  var v1: RenderableVertex = js.native
  var v2: RenderableVertex = js.native
  var vertexColors: js.Array[Color] = js.native
  var material: Material = js.native
  var z: Double = js.native
}

@js.native
@JSName("THREE.RenderableObject")
class RenderableObject extends js.Object {
  var id: Double = js.native
  var `object`: Object = js.native
  var z: Double = js.native
}

@js.native
@JSName("THREE.RenderableSprite")
class RenderableSprite extends js.Object {
  var id: Double = js.native
  var `object`: Object = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var rotation: Double = js.native
  var scale: Vector2 = js.native
  var material: Material = js.native
}

@js.native
@JSName("THREE.RenderableVertex")
class RenderableVertex extends js.Object {
  var position: Vector3 = js.native
  var positionWorld: Vector3 = js.native
  var positionScreen: Vector4 = js.native
  var visible: Boolean = js.native
  def copy(vertex: RenderableVertex): Unit = js.native
}

@js.native
trait ShaderChunk extends js.Object {
  @JSBracketAccess
  def apply(name: String): String = js.native
  @JSBracketAccess
  def update(name: String, v: String): Unit = js.native
  var alphamap_fragment: String = js.native
  var alphamap_pars_fragment: String = js.native
  var alphatest_fragment: String = js.native
  var bumpmap_pars_fragment: String = js.native
  var color_fragment: String = js.native
  var color_pars_fragment: String = js.native
  var color_pars_vertex: String = js.native
  var color_vertex: String = js.native
  var default_vertex: String = js.native
  var defaultnormal_vertex: String = js.native
  var envmap_fragment: String = js.native
  var envmap_pars_fragment: String = js.native
  var envmap_pars_vertex: String = js.native
  var envmap_vertex: String = js.native
  var fog_fragment: String = js.native
  var fog_pars_fragment: String = js.native
  var lightmap_fragment: String = js.native
  var lightmap_pars_fragment: String = js.native
  var lightmap_pars_vertex: String = js.native
  var lightmap_vertex: String = js.native
  var lights_lambert_pars_vertex: String = js.native
  var lights_lambert_vertex: String = js.native
  var lights_phong_fragment: String = js.native
  var lights_phong_pars_fragment: String = js.native
  var lights_phong_pars_vertex: String = js.native
  var lights_phong_vertex: String = js.native
  var linear_to_gamma_fragment: String = js.native
  var logdepthbuf_fragment: String = js.native
  var logdepthbuf_pars_fragment: String = js.native
  var logdepthbuf_pars_vertex: String = js.native
  var logdepthbuf_vertex: String = js.native
  var map_fragment: String = js.native
  var map_pars_fragment: String = js.native
  var map_pars_vertex: String = js.native
  var map_particle_fragment: String = js.native
  var map_particle_pars_fragment: String = js.native
  var map_vertex: String = js.native
  var morphnormal_vertex: String = js.native
  var morphtarget_pars_vertex: String = js.native
  var morphtarget_vertex: String = js.native
  var normalmap_pars_fragment: String = js.native
  var shadowmap_fragment: String = js.native
  var shadowmap_pars_fragment: String = js.native
  var shadowmap_pars_vertex: String = js.native
  var shadowmap_vertex: String = js.native
  var skinbase_vertex: String = js.native
  var skinning_pars_vertex: String = js.native
  var skinning_vertex: String = js.native
  var skinnormal_vertex: String = js.native
  var specularmap_fragment: String = js.native
  var specularmap_pars_fragment: String = js.native
  var worldpos_vertex: String = js.native
}

@js.native
trait Shader extends js.Object {
  var uniforms: js.Any = js.native
  var vertexShader: String = js.native
  var fragmentShader: String = js.native
}

@js.native
@JSName("THREE.ShaderLib")
object ShaderLib extends js.Object {
  @JSBracketAccess
  def apply(name: String): Shader = js.native
  @JSBracketAccess
  def update(name: String, v: Shader): Unit = js.native
  var basic: Shader = js.native
  var lambert: Shader = js.native
  var phong: Shader = js.native
  var particle_basic: Shader = js.native
  var dashed: Shader = js.native
  var depth: Shader = js.native
  var normal: Shader = js.native
  var normalmap: Shader = js.native
  var cube: Shader = js.native
  var depthRGBA: Shader = js.native
}

@js.native
@JSName("THREE.UniformsLib")
object UniformsLib extends js.Object {
  var common: js.Any = js.native
  var bump: js.Any = js.native
  var normalmap: js.Any = js.native
  var fog: js.Any = js.native
  var lights: js.Any = js.native
  var particle: js.Any = js.native
  var shadowmap: js.Any = js.native
}

@js.native
@JSName("THREE.UniformsUtils")
object UniformsUtils extends js.Object {
  def merge(uniforms: js.Array[js.Any]): js.Dynamic = js.native
  def clone(uniforms_src: js.Any): js.Dynamic = js.native
}

@js.native
@JSName("THREE.WebGLProgram")
class WebGLProgram(renderer: WebGLRenderer, code: String, material: ShaderMaterial, parameters: WebGLRendererParameters) extends js.Object

@js.native
@JSName("THREE.WebGLShader")
class WebGLShader(gl: js.Any, `type`: String, string: String) extends js.Object

@js.native
trait IFog extends js.Object {
  var name: String = js.native
  var color: Color = js.native
  override def clone(): IFog = js.native
}

@js.native
@JSName("THREE.Fog")
class Fog(color: Double, var near: Double = js.native, var far: Double = js.native) extends IFog {
  override def clone(): Fog = js.native
}

@js.native
@JSName("THREE.FogExp2")
class FogExp2(color: Double, var density: Double = js.native) extends IFog {
  override def clone(): FogExp2 = js.native
}

@js.native
@JSName("THREE.Scene")
class Scene extends Object3D {
  var fog: IFog = js.native
  var overrideMaterial: Material = js.native
  var autoUpdate: Boolean = js.native

}

@js.native
@JSName("THREE.CompressedTexture")
class CompressedTexture(
  mipmaps: js.Array[ImageData], width: Double, height: Double,
  format: PixelFormat = js.native, `type`: TextureDataType = js.native, mapping: Mapping = js.native, wrapS: Wrapping = js.native, wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native, anisotropy: Double = js.native
) extends Texture(mipmaps, mapping, wrapS, wrapT, magFilter, minFilter, format, `type`, anisotropy) {

  override def clone(): CompressedTexture = js.native
}

@js.native
@JSName("THREE.CubeTexture")
class CubeTexture(
  var images: js.Array[js.Any],
  mapping: Mapping = js.native, wrapS: Wrapping = js.native, wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native, format: PixelFormat = js.native, `type`: TextureDataType = js.native, anisotropy: Double = js.native
) extends Texture(images, mapping, wrapS, wrapT, magFilter, minFilter, format, `type`, anisotropy) {
  def clone(texture: CubeTexture): CubeTexture = js.native
}

@js.native
@JSName("THREE.DataTexture")
class DataTexture(
  data: ImageData, width: Double, height: Double, format: PixelFormat, `type`: TextureDataType, mapping: Mapping, wrapS: Wrapping, wrapT: Wrapping, magFilter: TextureFilter, minFilter: TextureFilter, anisotropy: Double = js.native
) extends Texture(data, mapping, wrapS, wrapT, magFilter, minFilter, format, `type`, anisotropy) {

  override def clone(): DataTexture = js.native
}

@js.native
@JSName("THREE.Texture")
class Texture(
  var image: js.Any,
  var mapping: Mapping = js.native, var wrapS: Wrapping = js.native, var wrapT: Wrapping = js.native,
  var magFilter: TextureFilter = js.native, var minFilter: TextureFilter = js.native, var format: PixelFormat = js.native,
  var `type`: TextureDataType = js.native, var anisotropy: Double = js.native
) extends js.Object with EventDispatcher {
  var id: Double = js.native
  var uuid: String = js.native
  var name: String = js.native
  var mipmaps: js.Array[ImageData] = js.native
  var offset: Vector2 = js.native
  var repeat: Vector2 = js.native
  var generateMipmaps: Boolean = js.native
  var premultiplyAlpha: Boolean = js.native
  var flipY: Boolean = js.native
  var unpackAlignment: Double = js.native
  var needsUpdate: Boolean = js.native
  var onUpdate: js.Function0[Unit] = js.native
  override def clone(): Texture = js.native
  def update(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("THREE.Texture")
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}
@js.native
trait TypefaceData extends js.Object {
  var familyName: String = js.native
  var cssFontWeight: String = js.native
  var cssFontStyle: String = js.native
}

@js.native
@JSName("THREE.FontUtils")
object FontUtils extends js.Object {
  var faces: js.Any = js.native
  var face: String = js.native
  var weight: String = js.native
  var style: String = js.native
  var size: Double = js.native
  var divisions: Double = js.native
  def getFace(): Face3 = js.native
  def loadFace(data: TypefaceData): TypefaceData = js.native
  def drawText(text: String): js.Any = js.native
  def extractGlyphPoints(c: String, face: Face3, scale: Double, offset: Double, path: Path): js.Any = js.native
  def generateShapes(text: String, parameters: js.Any = js.native): js.Array[Shape] = js.native
  var Triangulate: js.Any = js.native
}

@js.native
@JSName("THREE.GeometryUtils")
object GeometryUtils extends js.Object {
  def merge(geometry1: Geometry, object2: Mesh, materialIndexOffset: Double = js.native): Unit = js.native
  def center(geometry: Geometry): Vector3 = js.native
}

@js.native
@JSName("THREE.ImageUtils")
object ImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String, mapping: Mapping = js.native, onLoad: js.Function1[Texture, Unit] = js.native, onError: js.Function1[String, Unit] = js.native): Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: Mapping = js.native, onLoad: js.Function1[Texture, Unit] = js.native, onError: js.Function1[String, Unit] = js.native): Texture = js.native
  def getNormalMap(image: HTMLImageElement, depth: Double = js.native): HTMLCanvasElement = js.native
  def generateDataTexture(width: Double, height: Double, color: Color): DataTexture = js.native
}

@js.native
@JSName("THREE.SceneUtils")
object SceneUtils extends js.Object {
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
}

@js.native
trait KeyFrame extends js.Object {
  var pos: js.Array[Double] = js.native
  var rot: js.Array[Double] = js.native
  var scl: js.Array[Double] = js.native
  var time: Double = js.native
}

@js.native
trait KeyFrames extends js.Object {
  var keys: js.Array[KeyFrame] = js.native
  var parent: Double = js.native
}

@js.native
trait AnimationData extends js.Object {
  var JIT: Double = js.native
  var fps: Double = js.native
  var hierarchy: js.Array[KeyFrames] = js.native
  var length: Double = js.native
  var name: String = js.native
}

@js.native
@JSName("THREE.Animation")
class Animation(var root: Mesh, var data: AnimationData) extends js.Object {
  var hierarchy: js.Array[Bone] = js.native
  var currentTime: Double = js.native
  var timeScale: Double = js.native
  var isPlaying: Boolean = js.native
  var loop: Boolean = js.native
  var weight: Double = js.native
  var keyTypes: js.Array[String] = js.native
  var interpolationType: Double = js.native
  def play(startTime: Double = js.native, weight: Double = js.native): Unit = js.native
  def stop(): Unit = js.native
  def reset(): Unit = js.native
  def update(deltaTimeMS: Double): Unit = js.native
  def getNextKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
  def getPrevKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
}

@js.native
@JSName("THREE.AnimationHandler")
object AnimationHandler extends js.Object {
  var LINEAR: Double = js.native
  var CATMULLROM: Double = js.native
  var CATMULLROM_FORWARD: Double = js.native
  var animations: js.Array[js.Any] = js.native
  def init(data: Animation): Unit = js.native
  def parse(root: Mesh): js.Array[Object3D] = js.native
  def play(animation: Animation): Unit = js.native
  def stop(animation: Animation): Unit = js.native
  def update(deltaTimeMS: Double): Unit = js.native
}

@js.native
@JSName("THREE.KeyFrameAnimation")
class KeyFrameAnimation(var data: js.Any) extends js.Object {
  var root: Mesh = js.native
  var hierarchy: js.Array[KeyFrames] = js.native
  var currentTime: Double = js.native
  var timeScale: Double = js.native
  var isPlaying: Boolean = js.native
  var isPaused: Boolean = js.native
  var loop: Boolean = js.native
  def play(startTime: Double = js.native): Unit = js.native
  def stop(): Unit = js.native
  def update(delta: Double): Unit = js.native
  def getNextKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
  def getPrevKeyWith(`type`: String, h: Double, key: Double): KeyFrame = js.native
}

@js.native
@JSName("THREE.MorphAnimation")
class MorphAnimation(var mesh: Mesh) extends js.Object {
  var frames: Double = js.native
  var currentTime: Double = js.native
  var duration: Double = js.native
  var loop: Boolean = js.native
  var isPlaying: Boolean = js.native
  def play(): Unit = js.native
  def pause(): Unit = js.native
  def update(deltaTimeMS: Double): Unit = js.native
}

@js.native
@JSName("THREE.Curve")
class Curve extends js.Object {
  def getPoint(t: Double): Vector = js.native
  def getPointAt(u: Double): Vector = js.native
  def getPoints(divisions: Double): js.Array[Vector] = js.native
  def getSpacedPoints(divisions: Double): js.Array[Vector] = js.native
  def getLength(): Double = js.native
  def getLengths(divisions: Double): js.Array[Double] = js.native
  def updateArcLengths(): Unit = js.native
  def getUtoTmapping(u: Double, distance: Double): Double = js.native
  def getTangent(t: Double): Vector = js.native
  def getTangentAt(u: Double): Vector = js.native
}

@js.native
@JSName("THREE.Curve")
object Curve extends js.Object {
  var Utils: js.Any = js.native
  def create(constructorFunc: js.Function, getPointFunc: js.Function): js.Function = js.native
}

@js.native
trait BoundingBox extends js.Object {
  var minX: Double = js.native
  var minY: Double = js.native
  var maxX: Double = js.native
  var maxY: Double = js.native
  var centroid: Vector = js.native
}

@js.native
@JSName("THREE.CurvePath")
class CurvePath extends Curve {
  var curves: js.Array[Curve] = js.native
  var bends: js.Array[Path] = js.native
  var autoClose: Boolean = js.native
  def add(curve: Curve): Unit = js.native
  def checkConnection(): Boolean = js.native
  def closePath(): Unit = js.native
  override def getPoint(t: Double): Vector = js.native
  override def getLength(): Double = js.native
  def getCurveLengths(): Double = js.native
  def getBoundingBox(): BoundingBox = js.native
  def createPointsGeometry(divisions: Double): Geometry = js.native
  def createSpacedPointsGeometry(divisions: Double): Geometry = js.native
  def createGeometry(points: js.Array[Vector2]): Geometry = js.native
  def addWrapPath(bendpath: Path): Unit = js.native
  def getTransformedPoints(segments: Double, bends: Path = js.native): js.Array[Vector2] = js.native
  def getTransformedSpacedPoints(segments: Double, bends: js.Array[Path] = js.native): js.Array[Vector2] = js.native
  def getWrapPoints(oldPts: js.Array[Vector2], path: Path): js.Array[Vector2] = js.native
}

@js.native
@JSName("THREE.Gyroscope")
class Gyroscope extends Object3D {
  var translationWorld: Vector3 = js.native
  var translationObject: Vector3 = js.native
  var quaternionWorld: Quaternion = js.native
  var quaternionObject: Quaternion = js.native
  var scaleWorld: Vector3 = js.native
  var scaleObject: Vector3 = js.native
  override def updateMatrixWorld(force: Boolean): Unit = js.native
}

@js.native
sealed trait PathActions extends js.Object {
}

@js.native
@JSName("THREE.PathActions")
object PathActions extends js.Object {
  var MOVE_TO: PathActions = js.native
  var LINE_TO: PathActions = js.native
  var QUADRATIC_CURVE_TO: PathActions = js.native
  var BEZIER_CURVE_TO: PathActions = js.native
  var CSPLINE_THRU: PathActions = js.native
  var ARC: PathActions = js.native
  var ELLIPSE: PathActions = js.native
  @JSBracketAccess
  def apply(value: PathActions): String = js.native
}

@js.native
trait PathAction extends js.Object {
  var action: PathActions = js.native
  var args: js.Any = js.native
}

@js.native
@JSName("THREE.Path")
class Path(points: js.Array[Vector2] = js.native) extends CurvePath {
  var actions: js.Array[PathAction] = js.native
  def fromPoints(vectors: js.Array[Vector2]): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): Unit = js.native
  def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): Unit = js.native
  def splineThru(pts: js.Array[Vector2]): Unit = js.native
  def arc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def absarc(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def ellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def absellipse(aX: Double, aY: Double, xRadius: Double, yRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean): Unit = js.native
  def getSpacedPoints(): js.Array[Vector] = js.native
  def getSpacedPoints(divisions: Double, closedPath: Boolean): js.Array[Vector] = js.native
  def getPoints(): js.Array[Vector] = js.native
  def getPoints(divisions: Double, closedPath: Boolean): js.Array[Vector] = js.native
  def toShapes(): js.Array[Shape] = js.native
}

@js.native
@JSName("THREE.Shape")
class Shape(points: js.Array[Vector2] = js.native) extends Path(points) {
  var holes: js.Array[Path] = js.native
  def extrude(): ExtrudeGeometry = js.native
  def extrude(options: js.Any): ExtrudeGeometry = js.native
  def makeGeometry(): ShapeGeometry = js.native
  def makeGeometry(options: js.Any): ShapeGeometry = js.native

  def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
  def getSpacedPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
  def extractAllPoints(divisions: Double): js.Any = js.native
  def extractPoints(divisions: Double): js.Array[Vector2] = js.native
  def extractAllSpacedPoints(divisions: Vector2): js.Any = js.native
}

@js.native
@JSName("THREE.ArcCurve")
class ArcCurve(aX: Double, aY: Double, aRadius: Double, aStartAngle: Double, aEndAngle: Double, aClockwise: Boolean)
  extends EllipseCurve(aX, aY, aRadius, aRadius, aStartAngle, aEndAngle, aClockwise)

@js.native
@JSName("THREE.ClosedSplineCurve3")
class ClosedSplineCurve3(var points: js.Array[Vector3] = js.native) extends Curve {
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.CubicBezierCurve")
class CubicBezierCurve(var v0: Vector2, var v1: Vector2, var v2: Vector2, var v3: Vector2) extends Curve {
  override def getPoint(t: Double): Vector2 = js.native
  override def getTangent(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.CubicBezierCurve3")
class CubicBezierCurve3(var v0: Vector3, var v1: Vector3, var v2: Vector3, var v3: Vector3) extends Curve {
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.EllipseCurve")
class EllipseCurve(var aX: Double, var aY: Double, var xRadius: Double, var yRadius: Double, var aStartAngle: Double, var aEndAngle: Double, var aClockwise: Boolean) extends Curve {
  override def getPoint(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.LineCurve")
class LineCurve(var v1: Vector2, var v2: Vector2) extends Curve {
  override def getPoint(t: Double): Vector2 = js.native
  override def getPointAt(u: Double): Vector2 = js.native
  override def getTangent(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.LineCurve3")
class LineCurve3(var v1: Vector3, var v2: Vector3) extends Curve {
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.QuadraticBezierCurve")
class QuadraticBezierCurve(var v0: Vector2, var v1: Vector2, var v2: Vector2) extends Curve {
  override def getPoint(t: Double): Vector2 = js.native
  override def getTangent(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.QuadraticBezierCurve3")
class QuadraticBezierCurve3(var v0: Vector3, var v1: Vector3, var v2: Vector3) extends Curve {
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.SplineCurve")
class SplineCurve(var points: js.Array[Vector2] = js.native) extends Curve {
  override def getPoint(t: Double): Vector2 = js.native
}

@js.native
@JSName("THREE.SplineCurve3")
class SplineCurve3(var points: js.Array[Vector3] = js.native) extends Curve {
  override def getPoint(t: Double): Vector3 = js.native
}

@js.native
@JSName("THREE.BoxGeometry")
class BoxGeometry(width: Double, height: Double, depth: Double, var widthSegments: Double = js.native, var heightSegments: Double = js.native, var depthSegments: Double = js.native) extends Geometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.CircleGeometry")
class CircleGeometry extends Geometry {
  def this(radius: Double = js.native, segments: Double = js.native, thetaStart: Double = js.native, thetaLength: Double = js.native) = this()
  var parameters: js.Any = js.native
  var radius: Double = js.native
  var segments: Double = js.native
  var thetaStart: Double = js.native
  var thetaLength: Double = js.native
}

@js.native
@JSName("THREE.CubeGeometry")
class CubeGeometry(width: Double, height: Double, depth: Double, widthSegments: Double = js.native, heightSegments: Double = js.native,  depthSegments: Double = js.native)
  extends BoxGeometry(width, height, depth, widthSegments, heightSegments, depthSegments)

@js.native
@JSName("THREE.CylinderGeometry")
class CylinderGeometry(
  var radiusTop: Double = js.native, var radiusBottom: Double = js.native, var height: Double = js.native,
  var radiusSegments: Double = js.native, var heightSegments: Double = js.native, var openEnded: Boolean = js.native
) extends Geometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.ExtrudeGeometry")
class ExtrudeGeometry(shapes: js.Array[Shape], options: js.Any = js.native) extends Geometry {
  protected def this() = this(js.Array[Shape]())
  def this(shape: Shape) = this(js.Array(shape))
  def this(shape: Shape, options: js.Any) = this(js.Array(shape), options)

  def addShapeList(shapes: js.Array[Shape], options: js.Any = js.native): Unit = js.native
  def addShape(shape: Shape, options: js.Any = js.native): Unit = js.native
}

@js.native
@JSName("THREE.IcosahedronGeometry")
class IcosahedronGeometry(var radius: Double = js.native, var detail: Double = js.native) extends PolyhedronGeometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.LatheGeometry")
class LatheGeometry(points: js.Array[Vector3], segments: Double = js.native, phiStart: Double = js.native, phiLength: Double = js.native) extends Geometry

@js.native
@JSName("THREE.OctahedronGeometry")
class OctahedronGeometry(var radius: Double, var detail: Double) extends PolyhedronGeometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.ParametricGeometry")
class ParametricGeometry(func: js.Function2[Double, Double, Vector3], slices: Double, stacks: Double, useTris: Boolean = js.native) extends Geometry

@js.native
@JSName("THREE.PlaneGeometry")
class PlaneGeometry(var width: Double, var height: Double, var widthSegments: Double = js.native, var heightSegments: Double = js.native) extends Geometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.PlaneBufferGeometry")
class PlaneBufferGeometry extends Geometry {
  def this(width: Double, height: Double, widthSegments: Double = js.native, heightSegments: Double = js.native) = this()
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.PolyhedronGeometry")
class PolyhedronGeometry extends Geometry {
  def this(vertices: js.Array[Vector3], faces: js.Array[Face3], radius: Double = js.native, detail: Double = js.native) = this()
}

@js.native
@JSName("THREE.RingGeometry")
class RingGeometry(innerRadius: Double = js.native, outerRadius: Double = js.native, thetaSegments: Double = js.native, phiSegments: Double = js.native, thetaStart: Double = js.native, thetaLength: Double = js.native) extends Geometry

@js.native
@JSName("THREE.ShapeGeometry")
class ShapeGeometry extends Geometry {
  def this(shape: Shape) = this()
  def this(shape: Shape, options: js.Any) = this()

  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: js.Array[Shape], options: js.Any) = this()

  def addShapeList(shapes: js.Array[Shape], options: js.Any): ShapeGeometry = js.native
  def addShape(shape: Shape, options: js.Any = js.native): Unit = js.native
}

@js.native
@JSName("THREE.SphereGeometry")
class SphereGeometry(
  var radius: Double, var widthSegments: Double = js.native, var heightSegments: Double = js.native,
  var phiStart: Double = js.native, var phiLength: Double = js.native, var thetaStart: Double = js.native, var thetaLength: Double = js.native
) extends Geometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.TetrahedronGeometry")
class TetrahedronGeometry(radius: Double = js.native, detail: Double = js.native) extends PolyhedronGeometry

@js.native
trait TextGeometryParameters extends js.Object {
  var size: Double = js.native
  var height: Double = js.native
  var curveSegments: Double = js.native
  var font: String = js.native
  var weight: String = js.native
  var style: String = js.native
  var bevelEnabled: Boolean = js.native
  var bevelThickness: Double = js.native
  var bevelSize: Double = js.native
}

@js.native
@JSName("THREE.TextGeometry")
class TextGeometry(text: String, TextGeometryParameters: TextGeometryParameters = js.native) extends ExtrudeGeometry

@js.native
@JSName("THREE.TorusGeometry")
class TorusGeometry(var radius: Double = js.native, var tube: Double = js.native, var radialSegments: Double = js.native, var tubularSegments: Double = js.native, var arc: Double = js.native) extends Geometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.TorusKnotGeometry")
class TorusKnotGeometry(var radius: Double = js.native, var tube: Double = js.native, var radialSegments: Double = js.native, var tubularSegments: Double = js.native, var p: Double = js.native, var q: Double = js.native, var heightScale: Double = js.native) extends Geometry {
  var parameters: js.Any = js.native
}

@js.native
@JSName("THREE.TubeGeometry")
class TubeGeometry(var path: Path, var segments: Double = js.native, var radius: Double = js.native, var radialSegments: Double = js.native, var closed: Boolean = js.native) extends Geometry {
  var parameters: js.Any = js.native
  var tangents: js.Array[Vector3] = js.native
  var normals: js.Array[Vector3] = js.native
  var binormals: js.Array[Vector3] = js.native
  def FrenetFrames(path: Path, segments: Double, closed: Boolean): Unit = js.native
}

@js.native
@JSName("THREE.ArrowHelper")
class ArrowHelper(dir: Vector3, origin: Vector3 = js.native, length: Double = js.native, hex: Double = js.native, headLength: Double = js.native, headWidth: Double = js.native) extends Object3D {
  var line: Line = js.native
  var cone: Mesh = js.native
  def setDirection(dir: Vector3): Unit = js.native
  def setLength(length: Double): Unit = js.native
  def setLength(length: Double, headLength: Double): Unit = js.native
  def setLength(length: Double, headLength: Double, headWidth: Double): Unit = js.native
  def setColor(hex: Double): Unit = js.native
}

@js.native
@JSName("THREE.AxisHelper")
class AxisHelper(size: Double = js.native) extends Line

@js.native
@JSName("THREE.BoundingBoxHelper")
class BoundingBoxHelper(var `object`: Object3D, hex: Double = js.native) extends Mesh {
  var box: js.Array[Box3] = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.BoxHelper")
class BoxHelper(`object`: Object3D = js.native) extends Line {
  def update(`object`: Object3D = js.native): Unit = js.native
}

@js.native
@JSName("THREE.CameraHelper")
class CameraHelper(var camera: Camera) extends Line {
  var pointMap: js.Any = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.DirectionalLightHelper")
class DirectionalLightHelper(var light: Light, size: Double = js.native) extends Object3D {
  var lightPlane: Line = js.native
  var targetLine: Line = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.EdgesHelper")
class EdgesHelper(`object`: Object3D, hex: Double = js.native) extends Line

@js.native
@JSName("THREE.FaceNormalsHelper")
class FaceNormalsHelper(var `object`: Object3D, var size: Double = js.native, hex: Double = js.native, linewidth: Double = js.native) extends Line {
  var normalMatrix: Matrix3 = js.native
  def update(`object`: Object3D = js.native): Unit = js.native
}

@js.native
@JSName("THREE.GridHelper")
class GridHelper(size: Double, step: Double) extends Line {
  var color1: Color = js.native
  var color2: Color = js.native
  def setColors(colorCenterLine: Double, colorGrid: Double): Unit = js.native
}

@js.native
@JSName("THREE.HemisphereLightHelper")
class HemisphereLightHelper(var light: Light, sphereSize: Double, arrowLength: Double, domeSize: Double) extends Object3D {
  var colors: js.Array[Color] = js.native
  var lightSphere: Mesh = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.PointLightHelper")
class PointLightHelper(var light: Light, sphereSize: Double) extends Object3D {
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.SkeletonHelper")
class SkeletonHelper(bone: Object3D) extends Line {
  var bones: js.Array[Bone] = js.native
  var root: Object3D = js.native
  def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.SpotLightHelper")
class SpotLightHelper(var light: Light, sphereSize: Double, arrowLength: Double) extends Object3D {
  var cone: Mesh = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("THREE.VertexNormalsHelper")
class VertexNormalsHelper(var `object`: Object3D, var size: Double = js.native, hex: Double = js.native, linewidth: Double = js.native) extends Line {
  var normalMatrix: Matrix3 = js.native
  def update(`object`: Object3D = js.native): Unit = js.native
}

@js.native
@JSName("THREE.VertexTangentsHelper")
class VertexTangentsHelper(var `object`: Object3D, var size: Double = js.native, hex: Double = js.native, linewidth: Double = js.native) extends Line {
  def update(`object`: Object3D = js.native): Unit = js.native
}

@js.native
@JSName("THREE.WireframeHelper")
class WireframeHelper(`object`: Object3D, hex: Double = js.native) extends Line

@js.native
@JSName("THREE.ImmediateRenderObject")
class ImmediateRenderObject extends Object3D {
  def render(renderCallback: js.Function): Unit = js.native
}

@js.native
trait LensFlareProperty extends js.Object {
  var texture: Texture = js.native
  var size: Double = js.native
  var distance: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var scale: Double = js.native
  var rotation: Double = js.native
  var opacity: Double = js.native
  var color: Color = js.native
  var blending: Blending = js.native
}

@js.native
@JSName("THREE.LensFlare")
class LensFlare(texture: Texture = js.native, size: Double = js.native, distance: Double = js.native, blending: Blending = js.native, color: Color = js.native) extends Object3D {
  var lensFlares: js.Array[LensFlareProperty] = js.native
  var positionScreen: Vector3 = js.native
  var customUpdateCallback: js.Function1[LensFlare, Unit] = js.native
  def add(texture: Texture, size: Double = js.native, distance: Double = js.native, blending: Blending = js.native, color: Color = js.native): Unit = js.native
  override def add(obj: Object3D): Unit = js.native
  def updateLensFlares(): Unit = js.native
}

@js.native
trait MorphBlendMeshAnimation extends js.Object {
  var startFrame: Double = js.native
  var endFrame: Double = js.native
  var length: Double = js.native
  var fps: Double = js.native
  var duration: Double = js.native
  var lastFrame: Double = js.native
  var currentFrame: Double = js.native
  var active: Boolean = js.native
  var time: Double = js.native
  var direction: Double = js.native
  var weight: Double = js.native
  var directionBackwards: Boolean = js.native
  var mirroredLoop: Boolean = js.native
}

@js.native
@JSName("THREE.MorphBlendMesh")
class MorphBlendMesh(geometry: Geometry, material: Material) extends Mesh(geometry, material) {
  var animationsMap: js.Any = js.native
  var animationsList: js.Array[MorphBlendMeshAnimation] = js.native
  def createAnimation(name: String, start: Double, end: Double, fps: Double): Unit = js.native
  def autoCreateAnimations(fps: Double): Unit = js.native
  def setAnimationDirectionForward(name: String): Unit = js.native
  def setAnimationDirectionBackward(name: String): Unit = js.native
  def setAnimationFPS(name: String, fps: Double): Unit = js.native
  def setAnimationDuration(name: String, duration: Double): Unit = js.native
  def setAnimationWeight(name: String, weight: Double): Unit = js.native
  def setAnimationTime(name: String, time: Double): Unit = js.native
  def getAnimationTime(name: String): Double = js.native
  def getAnimationDuration(name: String): Double = js.native
  def playAnimation(name: String): Unit = js.native
  def stopAnimation(name: String): Unit = js.native
  def update(delta: Double): Unit = js.native
}

@js.native
@JSName("THREE.DepthPassPlugin")
class DepthPassPlugin extends RendererPlugin {
  var enabled: Boolean = js.native
  var renderTarget: RenderTarget = js.native
  def init(renderer: Renderer): Unit = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def update(scene: Scene, camera: Camera): Unit = js.native
}

@js.native
@JSName("THREE.LensFlarePlugin")
class LensFlarePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native
  override def render(scene: Scene, camera: Camera, viewportWidth: Double, viewportHeight: Double): Unit = js.native
}

@js.native
@JSName("THREE.ShadowMapPlugin")
class ShadowMapPlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def update(scene: Scene, camera: Camera): Unit = js.native
}

@js.native
@JSName("THREE.SpritePlugin")
class SpritePlugin extends RendererPlugin {
  def init(renderer: Renderer): Unit = js.native
  override def render(scene: Scene, camera: Camera, viewportWidth: Double, viewportHeight: Double): Unit = js.native
}

@js.native
@JSName("THREE.ShaderFlares")
object ShaderFlares extends js.Object {
  var lensFlareVertexTexture: js.Any = js.native
  var lensFlare: js.Any = js.native
}

@js.native
@JSName("Stats")
class Stats extends js.Object {
  def showPanel(i: Int): Unit = js.native
  def begin(): js.Any = js.native
  def end(): js.Any = js.native
  var dom: HTMLElement = js.native
}


