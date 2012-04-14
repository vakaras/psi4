package lt.astrauskas.oop3

trait IHuman {

  def firstName(): String
  def lastName(): String
  def fullName(): String = "%s %s".format(firstName(), lastName())

}