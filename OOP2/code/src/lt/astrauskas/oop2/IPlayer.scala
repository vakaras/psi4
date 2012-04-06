package lt.astrauskas.oop2

trait IPlayer {
  
  private var self: IPlayer = this
  
  def setSelf(newSelf: IPlayer): Unit = {
    self = newSelf
  }
  
  def points(): Double = self.pointsImpl()
  def status(): String = self.statusImpl()
  override def toString(): String = self.toStringImpl()
  
  def pointsImpl(): Double
  def statusImpl(): String
  def toStringImpl(): String

}