object BigONotation {

  var imp: BigOImplementations = _

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

    imp = new BigOImplementations(30000)
    imp.generateRandomArray
    imp.linearSearchForValue(20)

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
      endTime = System.currentTimeMillis()
      println("Linear Search took " + (endTime - startTime))
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
      endTime = System.currentTimeMillis()
      println("bubbleSort took " + (endTime - startTime))
    }

    def generateRandomArray = {
      for (i <- 0 to arraySize - 1) {
        theArray(i) = ((Math.random() * 1000) + 10).toInt
      }

      itemsInArray = arraySize - 1
    }

  }

}