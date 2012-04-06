package lt.astrauskas.oop2

class Student(private var baseObj: IHuman, schoolClassArg: Int)
	extends IStudent {
  
  baseObj.setSelf(this)
  def base(): IHuman = baseObj
  
  override def toStringImpl(): String = "Student: %s (%d)".format(
      fullName(), schoolClass())
  def schoolClassImpl(): Int = schoolClassArg

}