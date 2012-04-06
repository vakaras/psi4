package lt.astrauskas.oop2

trait IStudent extends IHuman {
  
  private var self: IStudent = this
  def base(): IHuman
  
  def setSelf(newSelf: IStudent): Unit = {
    self = newSelf
  }
  
  def firstNameImpl(): String = base.firstNameImpl()
  def lastNameImpl(): String = base.lastNameImpl()
  def fullNameImpl(): String = base.fullNameImpl()
  def toStringImpl(): String = base.toStringImpl()

  def schoolClass(): Int = self.schoolClassImpl()

  def schoolClassImpl(): Int
  
}