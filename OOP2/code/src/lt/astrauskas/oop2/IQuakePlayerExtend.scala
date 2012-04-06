package lt.astrauskas.oop2

trait IQuakePlayerExtend extends IQuakePlayer {

  def base(): IQuakePlayer
  
  def deathsImpl(): Int = base.deathsImpl()
  def killsImpl(): Int = base.killsImpl()
  def roundsPlayedImpl(): Int = base.roundsPlayedImpl()
  
}