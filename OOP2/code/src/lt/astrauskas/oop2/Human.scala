package lt.astrauskas.oop2

class Human(var first: String, var last: String)
	extends IHumanUse {

  var selfValue: IHuman = this
  def self: IHuman = selfValue
  def setSelf(newSelf: IHuman): Unit = {
    selfValue = newSelf
  }

  def firstNameImpl(): String = first
  def lastNameImpl(): String = last
  def fullNameImpl(): String = firstName() + " " + lastName()
  def toStringImpl(): String = "Human: " + fullName()

}