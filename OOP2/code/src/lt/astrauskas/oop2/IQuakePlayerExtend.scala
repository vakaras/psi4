package lt.astrauskas.oop2

trait IQuakePlayerExtend extends IQuakePlayer {

  def baseIPlayer(): IQuakePlayer
  
  def deathsImpl(): Int = baseIPlayer.deathsImpl()
  def killsImpl(): Int = baseIPlayer.killsImpl()
  def roundsPlayedImpl(): Int = baseIPlayer.roundsPlayedImpl()
  
}