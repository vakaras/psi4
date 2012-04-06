package lt.astrauskas.oop2

trait IHuman {

  private var self: IHuman = this
  
  def setSelf(newSelf: IHuman): Unit = {
    self = newSelf
  }
  
  def firstName(): String = self.firstNameImpl()
  def lastName(): String = self.lastNameImpl()
  def fullName(): String = self.fullNameImpl()
  override def toString(): String = self.toStringImpl()
  
  def firstNameImpl(): String
  def lastNameImpl(): String
  def fullNameImpl(): String
  def toStringImpl(): String
  
}