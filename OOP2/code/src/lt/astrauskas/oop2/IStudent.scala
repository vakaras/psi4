package lt.astrauskas.oop2

trait IStudent extends IHumanExtend {
  
  private var self: IStudent = this
  
  def setSelf(newSelf: IStudent): Unit = {
    self = newSelf
    setSelf(newSelf.asInstanceOf[IHuman])
    baseIHuman.setSelf(newSelf)
  }

  def schoolClass(): Int = self.schoolClassImpl()

  def schoolClassImpl(): Int
  
}