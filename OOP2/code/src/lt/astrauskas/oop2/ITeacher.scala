package lt.astrauskas.oop2

trait ITeacher extends IHumanExtend {

  def self: ITeacher

  def subject(): String = self.subjectImpl()
  def degree(): String = self.degreeImpl()

  def subjectImpl(): String
  def degreeImpl(): String

}