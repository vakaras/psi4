package lt.astrauskas.oop3

class Decorator(
    protected var component: IHuman
    ) extends IHuman {

  def setComponent(newComponent: IHuman): Unit = {
    component = newComponent
  }

  def get(manifest: Manifest[_ <: IHuman]):
      Option[_ <: Decorator] = {
    if (ClassManifest.singleType(this) <:< manifest)
      Some(this)
    else if (component.isInstanceOf[Decorator])
      component.asInstanceOf[Decorator].get(manifest)
    else
      None
    }

  def getUndecorated(): IHuman = {
    if (component.isInstanceOf[Decorator])
      component.asInstanceOf[Decorator].getUndecorated()
    else
      component
  }

  def remove(manifest: Manifest[_ <: Decorator]): IHuman = {
    if (ClassManifest.singleType(this) <:< manifest) {
      if (component.isInstanceOf[Decorator])
        return component.asInstanceOf[Decorator].remove(manifest)
      else
        return component
    }
    else {
      if (component.isInstanceOf[Decorator])
        component = component.asInstanceOf[Decorator].remove(manifest)
      return this
    }
  }

  def firstName() = component.firstName
  def lastName() = component.lastName
  override def fullName() = component.fullName

}