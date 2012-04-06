package lt.astrauskas.oop2

class Teacher(
    private var baseObj: IHuman,
    degreeArg: String,
    subjectArg: String)
    extends ITeacher {
  
  baseObj.setSelf(this)
  def base(): IHuman = baseObj
  
  override def toStringImpl(): String = "Teacher: %s (%s)".format(
      fullName(), subject())
  override def fullNameImpl(): String = "%s %s".format(
      degree(), base.fullNameImpl())
  def subjectImpl(): String = subjectArg
  def degreeImpl(): String = degreeArg
 
}