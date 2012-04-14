package lt.astrauskas.oop3

class HumanWithEmail(
    component: IHuman,
    var email: String
    ) extends Decorator(component) {

  def prettyEmail(): String = "%s <%s>".format(
      fullName, email)

}