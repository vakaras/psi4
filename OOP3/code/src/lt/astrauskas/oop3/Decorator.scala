package lt.astrauskas.oop3

class Decorator(
    protected var component: IHuman
    ) extends IHuman {

  def setComponent(newComponent: IHuman): Unit = {
    component = newComponent
  }

  def get(manifest: Manifest[_ <: Decorator]):
      Option[_ <: Decorator] = {
    if (ClassManifest.singleType(this) <:< manifest)
      Some(this)
    else if (component.isInstanceOf[Decorator])
      component.asInstanceOf[Decorator].get(manifest)
    else
      None
    }

  def firstName() = component.firstName
  def lastName() = component.lastName
  override def fullName() = component.fullName

}