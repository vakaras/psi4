package lt.astrauskas.oop2

trait IHumanExtend extends IHuman {

  def baseIHuman(): IHuman
  
  def firstNameImpl(): String = baseIHuman.firstNameImpl()
  def lastNameImpl(): String = baseIHuman.lastNameImpl()
  def fullNameImpl(): String = baseIHuman.fullNameImpl()
  def toStringImpl(): String = baseIHuman.toStringImpl()

}