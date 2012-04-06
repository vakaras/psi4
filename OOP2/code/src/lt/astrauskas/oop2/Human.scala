package lt.astrauskas.oop2

class Human(var first: String, var last: String) extends IHuman {
  
  def firstNameImpl(): String = first
  def lastNameImpl(): String = last
  def fullNameImpl(): String = firstName() + " " + lastName()
  def toStringImpl(): String = "Human: " + fullName()

}