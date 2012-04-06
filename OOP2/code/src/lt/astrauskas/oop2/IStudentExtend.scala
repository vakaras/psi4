package lt.astrauskas.oop2

trait IStudentExtend extends IStudent {
  
  def baseIHuman(): IStudent
  
  def schoolClassImpl(): Int = baseIHuman.schoolClassImpl()

}