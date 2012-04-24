package lt.astrauskas.oop3

class WithPassport(
    component: IHuman,
    var identityCode: String
    ) extends Decorator(component) {

  def passportInformation(): String = "%s %s".format(
      getUndecorated().fullName(), identityCode)
}