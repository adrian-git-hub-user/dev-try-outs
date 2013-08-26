package scala.designpatterns

/**
 * Strategy Pattern
 * Explanation: Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * The strategy pattern lets the algorithm vary independently from clients that use it.
 * 
 * Use the Strategy pattern when want to define a class that will have one behaviour that is similar to all the 
 * other behaviours in a list.
 * Use the strategy pattern when need to use one of several behaviours dynamically
 * Decoupling
 * Encapsulating the concept or behaviour that varies, in this case the ability to fly
 *
 * Composition
 * Instead of inheriting ability through inheritance the class is composed with objects with the right ability built in
 * Composition allows to change the capabilities of objects at runtime
 * 
 * Advantages
 * Often reduces long lists of conditionals
 * Avoids duplicate code
 * Keeps class changes from forcing other class changes
 * Can hide complicated/secret code from the user
 * 
 * Disadvantage
 * Increased number of Objects / Classes
 */
object Strategy {

  def main(args: Array[String]) {

    var sparky = new Dog
    var tweety = new Bird

    println("Dog : " + sparky.tryToFly)
    println("Bird : " + tweety.tryToFly)
    
    sparky.setFlyingAbility(new ItFlys)
    println("Dog : " + sparky.tryToFly)
  }

  trait Flys {
    def fly: String
  }

  class ItFlys extends Flys {

    def fly: String = {
      "Flying High"
    }
  }

  class CantFly extends Flys {

    def fly: String = {
      "I can't fly"
    }
  }

  class Animal {

    var name: String = _
    var sound: String = _
    var speed: Double = _
    var favFood: Double = _
    var flyingType: Flys = _

    def tryToFly: String = {
      this.flyingType.fly
    }

    def setFlyingAbility(newFlyType: Flys) = {
      flyingType = newFlyType
    }

    def setSound(newSound: String) = {
      sound = newSound
    }

    def setSpeed(newSpeed: Double) = {
      speed = newSpeed
    }

  }

  class Dog extends Animal {

    def digHole = {
      println("Dug a hole!")
    }

    setSound("Bark")

    //Sets the fly trait polymorphically
    flyingType = new CantFly

  }

  class Bird extends Animal {

    setSound("Tweet")

    //Sets the fly trait polymorphically
    flyingType = new ItFlys
  }

}