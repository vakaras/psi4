package lt.astrauskas.oop1

object Demo {
  
  def show(noun: TemplateMethod.Noun) = {
	println("Word: " + noun.getValue())
    noun.show()
  }
  
  def show(noun: Strategy.Noun) = {
    println("Word: " + noun.getValue())
    noun.show()
  }

  def main(args: Array[String]): Unit = {
    println("Start.")
    
    println("------- Template Method ---------")
    show(new TemplateMethod.FeminineNoun("Hand"))
    show(new TemplateMethod.MaskulineNoun("Hund"))
    show(new TemplateMethod.NeuterNoun("Haus"))
    
    println("------- Strategy ---------")
    show(new Strategy.Noun("Hand", new Strategy.Feminine()))
    
    println("Finish.")
  }

}