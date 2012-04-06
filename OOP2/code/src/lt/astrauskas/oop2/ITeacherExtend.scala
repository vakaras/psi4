package lt.astrauskas.oop2

trait ITeacherExtend extends ITeacher {
  
  def base(): ITeacher
  
  def subjectImpl(): String = base.subjectImpl()
  def degreeImpl(): String = base.degreeImpl()

}