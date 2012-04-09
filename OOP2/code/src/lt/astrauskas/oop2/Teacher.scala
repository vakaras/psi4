package lt.astrauskas.oop2

class Teacher(
    private var baseObj: IHumanUse,
    degreeArg: String,
    subjectArg: String)
    extends ITeacherUse {

  var selfValue: ITeacher = this
  def self: ITeacher = selfValue
  def setSelf(newSelf: ITeacher): Unit = {
    selfValue = newSelf
    baseIHuman.setSelf(newSelf)
  }
  baseObj.setSelf(this)

  def baseIHuman: IHumanUse = baseObj

  override def toStringImpl(): String = "Teacher: %s (%s)".format(
      fullName(), subject())
  override def fullNameImpl(): String = "%s %s".format(
      degree(), baseIHuman.fullNameImpl())
  def subjectImpl(): String = subjectArg
  def degreeImpl(): String = degreeArg
 
}