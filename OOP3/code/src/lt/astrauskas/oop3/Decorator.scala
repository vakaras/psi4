package lt.astrauskas.oop3

trait Decorator extends IHuman {

  protected var component: IHuman

  def setComponent(newComponent: IHuman): Unit = {
    component = newComponent
  }

  def firstName() = component.firstName()
  def lastName() = component.lastName()
  override def fullName() = component.fullName()

}