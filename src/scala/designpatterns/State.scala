package scala.designpatterns

/**
 * Scala implmentation of Java State pattern as described by Derek Banas 
 * Tutorial : http://www.youtube.com/watch?v=MGEx35FjBuo
 */
object State {
/*
  trait ATMState
  {
	  def insertCard
	  def ejectCard
	  def insertPin(pinEntered : Int)
	  def requestCash(cashToWithdraw : Int)
  }
  
  class ATMMachine{
    val hasCard : ATMState
    val noCard : ATMState 
    val hasCorrectPin : ATMState 
    var atmOutOfMoney : ATMState
    
    val atmState : ATMState
    
    cashInMachine = 2000
    correctPinEntered = false

  
  def apply(){
    hasCard = new HasCard(false)
    noCard = new NoCard(this)
    hasCorrectPint = new HasPin(this)
    atmOutOfMoney = new NoCash(this)
    
    atmState = noCard
    
    if(cashInMachine < 0){
      atmState = atmOutOfMoney
    }
  }
  
  def setATMState(newATMState : ATMState){
    atmState = new ATMState
  }
  
  def setCashInMachine(newCashInMachine : Int){
    cashInMachine = new CashInMachine
  }
  
  def insertCard(){
    atmState.insertCard()
  }
  
  def ejectCard {
    atmState.ejectCard
  }
  
  def requestCash(cashToWithDraw : Int){
    atmState.requestCash(cashToWithDraw)
  }
  
  def insertPin(pin : Int){
    atmState.requestCash(cashToWithDraw)
  }*/

}