package lt.astrauskas.oop2

trait IPlayerExtend extends IPlayer {

  def baseIPlayer(): IPlayer

  def statusImpl(): String = baseIPlayer.statusImpl()
  def toStringImpl(): String = baseIPlayer.toStringImpl()

}