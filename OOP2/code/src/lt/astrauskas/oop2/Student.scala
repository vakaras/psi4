package lt.astrauskas.oop2

class Student(
    private var baseObj: IHumanUse,
    schoolClassArg: Int)
	extends IStudentUse {

  var selfValue: IStudent = this
  def self: IStudent = selfValue
  def setSelf(newSelf: IStudent): Unit = {
    selfValue = newSelf
    baseIHuman.setSelf(newSelf)
  }
  baseObj.setSelf(self)

  def baseIHuman: IHumanUse = baseObj

  override def toStringImpl(): String = "Student: %s (%d)".format(
      fullName(), schoolClass())
  def schoolClassImpl(): Int = schoolClassArg

}