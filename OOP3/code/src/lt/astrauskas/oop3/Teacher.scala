package lt.astrauskas.oop3

class Teacher(
    component: IHuman,
    var subject: String,
    var degree: String
    ) extends Decorator(component) {

  override def fullName(): String = "%s %s".format(
      degree, super.fullName())

}