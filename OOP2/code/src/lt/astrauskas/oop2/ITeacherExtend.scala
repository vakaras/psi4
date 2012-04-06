package lt.astrauskas.oop2

trait ITeacherExtend extends ITeacher {
  
  def baseIHuman(): ITeacher
  
  def subjectImpl(): String = baseIHuman.subjectImpl()
  def degreeImpl(): String = baseIHuman.degreeImpl()

}