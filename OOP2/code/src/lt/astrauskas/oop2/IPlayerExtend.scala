package lt.astrauskas.oop2

trait IPlayerExtend extends IPlayer {

  def base(): IPlayer
  
  def statusImpl(): String = base.statusImpl()
  def toStringImpl(): String = base.toStringImpl()

}