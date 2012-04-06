package lt.astrauskas.oop2

trait ITeacher extends IHuman {

  private var self: ITeacher = this
  def base(): IHuman
  
  def setSelf(newSelf: ITeacher): Unit = {
    self = newSelf
  }
  
  def firstNameImpl(): String = base.firstNameImpl()
  def lastNameImpl(): String = base.lastNameImpl()
  def fullNameImpl(): String = base.fullNameImpl()
  def toStringImpl(): String = base.toStringImpl()
  
  def subject(): String = self.subjectImpl()
  def degree(): String = self.degreeImpl()
  
  def subjectImpl(): String
  def degreeImpl(): String
}