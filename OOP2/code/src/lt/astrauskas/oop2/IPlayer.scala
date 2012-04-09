package lt.astrauskas.oop2

trait IPlayer {

  def self: IPlayer

  def points(): Double = self.pointsImpl()
  def status(): String = self.statusImpl()
  override def toString(): String = self.toStringImpl()

  def pointsImpl(): Double
  def statusImpl(): String
  def toStringImpl(): String

}