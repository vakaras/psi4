package lt.astrauskas.oop2

trait IStudentExtend extends IStudent {
  
  def base(): IStudent
  
  def schoolClassImpl(): Int = base.schoolClassImpl()

}