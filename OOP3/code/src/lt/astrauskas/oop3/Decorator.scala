package lt.astrauskas.oop3

class Decorator(
    protected var component: IHuman
    ) extends IHuman {

  def setComponent(newComponent: IHuman): Unit = {
    component = newComponent
  }

  def firstName() = component.firstName
  def lastName() = component.lastName
  override def fullName() = component.fullName

}