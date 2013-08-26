package bigohnotation

object BigONotation {

  var imp: BigOImplementations = _
  val stopWatch = new StopWatch
  
  def main(args: Array[String]) {

    imp = new BigOImplementations(10000)
    imp.generateRandomArray
    imp.bubbleSort

    imp = new BigOImplementations(20000)
    imp.generateRandomArray
    imp.bubbleSort

    imp = new BigOImplementations(30000)
    imp.generateRandomArray
    imp.bubbleSort

    imp = new BigOImplementations(20000)
    imp.generateRandomArray
    imp.linearSearchForValue(20)

    imp = new BigOImplementations(40000)
    imp.generateRandomArray
    imp.linearSearchForValue(20)
    
    imp = new BigOImplementations(40000)
    imp.generateRandomArray
    imp.binarySearchForValue(20)

  }

  class BigOImplementations(arraySize: Int) {

    var theArray = new Array[Int](arraySize)
    var itemsInArray: Int = 0
    var startTime: Long = _
    var endTime: Long = _

    //O(1)
    def addItemToArray(newItem: Int) = {
      theArray(itemsInArray + 1) = newItem
    }

    //O(N)
    def linearSearchForValue(value: Int) = {
      var isValueInArray = false
      var indexWithValue: String = ""

      startTime = System.currentTimeMillis()
      for (i <- 0 to arraySize - 1) {
        if (theArray(i) == value) {
          isValueInArray = true
          indexWithValue = indexWithValue + i + " "
        }
      }

      println("Value Found : " + isValueInArray)
      println("Linear Search took " + stopWatch.elapsedTime())
    }

    def swapValues(indexOne: Int, indexTwo: Int) = {
      var temp = theArray(indexOne)
      theArray(indexOne) = theArray(indexTwo)
      theArray(indexTwo) = temp
    }

    //O (N^2)
    def bubbleSort() = {
      var startTime = System.currentTimeMillis()

      for (i <- arraySize - 1 to 0 by -1) {
        for (j <- 0 to i - 1) {
          if (theArray(j) > theArray(j + 1)) {
            swapValues(j, j + 1)
          }
        }
      }

      println("bubbleSort took " +stopWatch.elapsedTime())
    }

    //O(log N)     
    def binarySearchForValue(value : Int) = {
      startTime = System.currentTimeMillis()
      
      var lowIndex = 0
      var highIndex = arraySize - 1
      
      var timesThrough = 0
      
      while(lowIndex <= highIndex){
        var middleIndex = (highIndex + lowIndex) / 2
        
        if(theArray(middleIndex) < value){
          lowIndex = middleIndex + 1
        }
        else if(theArray(middleIndex) > value){
          highIndex = middleIndex - 1
        }
        else {
          println("Found Match in index "+middleIndex)
          lowIndex = middleIndex + 1
        }
        
        timesThrough = timesThrough + 1
      }
    
      endTime = System.currentTimeMillis()
     println("binary search took " +(startTime - endTime))
     println("Times through "+timesThrough)
    }
    
    def generateRandomArray = {
      for (i <- 0 to arraySize - 1) yield {
        theArray(i) = ((Math.random() * 1000) + 10).toInt
      }

      itemsInArray = arraySize - 1
    }

  }

}