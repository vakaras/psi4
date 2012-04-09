package lt.astrauskas.oop2

trait ObjectWithSelf[T] {
  
  def setSelf(newSelf: T): Unit

}