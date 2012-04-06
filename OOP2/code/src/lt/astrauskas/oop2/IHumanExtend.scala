package lt.astrauskas.oop2

trait IHumanExtend extends IHuman {

  def base(): IHuman
  
  def firstNameImpl(): String = base.firstNameImpl()
  def lastNameImpl(): String = base.lastNameImpl()
  def fullNameImpl(): String = base.fullNameImpl()
  def toStringImpl(): String = base.toStringImpl()

}