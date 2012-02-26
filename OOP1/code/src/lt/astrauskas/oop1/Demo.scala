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
  
  def show(nounPhrase: Strategy.NounPhrase) = {
    println("Phrase: " + nounPhrase.getValue())
    nounPhrase.show()
  }

  def show(noun: TemplateMethodScala.Noun) = {
    println("Word: " + noun.getValue())
    noun.show()
  }

  def show(nounPhrase: TemplateMethodScala.NounPhrase) = {
    println("Phrase: " + nounPhrase.getValue())
    nounPhrase.show()
  }

  def main(args: Array[String]): Unit = {
    println("Start.")

    println("------- Template Method ---------")
    show(new TemplateMethod.FeminineNoun("Hand"))
    show(new TemplateMethod.MaskulineNoun("Hund"))
    show(new TemplateMethod.NeuterNoun("Haus"))
    
    println("------- Strategy ---------")
    show(new Strategy.Noun("Hand", new Strategy.Feminine()))
    show(new Strategy.Noun("Hund", new Strategy.Maskuline()))
    show(new Strategy.Noun("Haus", new Strategy.Neuter()))
    show(new Strategy.NounPhrase("bleu", "Hand", new Strategy.Feminine()))
    show(new Strategy.NounPhrase("gelb", "Hund", new Strategy.Maskuline()))
    show(new Strategy.NounPhrase("rot", "Haus", new Strategy.Neuter()))
    
    println("------- Template Method (Scala) ---------")
    show(new TemplateMethodScala.Noun("Hand")
        with TemplateMethodScala.Feminine)
    show(new TemplateMethodScala.Noun("Hund")
        with TemplateMethodScala.Masculine)
    show(new TemplateMethodScala.Noun("Haus")
        with TemplateMethodScala.Neuter)
    show(new TemplateMethodScala.NounPhrase("bleu", "Hand")
        with TemplateMethodScala.Feminine)
    show(new TemplateMethodScala.NounPhrase("gelb", "Hund")
        with TemplateMethodScala.Masculine)
    show(new TemplateMethodScala.NounPhrase("rot", "Haus")
        with TemplateMethodScala.Neuter)

    println("Finish.")
  }

}