package scala.designpatterns

  /*
   * The Observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically
   * of any state changes, usually by calling one of their methods.
   */

object Observer extends Application{
   
  trait Subject {
	  def register(o : Observer)
	  def unregister(o : Observer)
	  def notifyObserver
  }
  
  trait Observer{
	  def update(ibmPrice : Double , aaplPrice : Double , googPrice : Double)
  }
  
  class StockGrabber extends Subject{
    
	  var observers = List[Observer]() 
	  var ibmPrice : Double = _
	  var aaplPrice : Double = _
	  var googPrice : Double = _
	  
	  def register(o : Observer){
	    
	  }
	  
	  def unregister(o : Observer){
	    
	  }
	  	  
	 def notifyObserver{
	    
	  }
  }
  
}


 

