package lt.astrauskas.oop2

trait ITeacher extends IHumanExtend {

  private var self: ITeacher = this
  
  def setSelf(newSelf: ITeacher): Unit = {
    self = newSelf
    setSelf(newSelf.asInstanceOf[IHuman])
    baseIHuman.setSelf(newSelf)
  }

  def subject(): String = self.subjectImpl()
  def degree(): String = self.degreeImpl()
  
  def subjectImpl(): String
  def degreeImpl(): String
}