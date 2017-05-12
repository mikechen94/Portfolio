package basics

/**
 * This is a singleton object containing the functions you need
 * to implement. Please make sure to read the documentation associated
 * with each function and provide a sensible implementation.
 */
object ScalaBasics {

  /**
   * Write a function called add that takes two Int parameters
   * and returns their sum.
   *
   * @param a operand a
   * @param b operand b
   * @return the sum
   */
  def add(a: Int, b: Int): Int = {
    a+b
  }

  /**
   * Write a function that returns the inclusive Range from start to end.
   *
   * HINT: Look at the Scaladoc for Int/RichInt to find the answer.
   *
   * @param start the start of the range
   * @param end the end of the range
   * @return the inclusive Range from start to end
   */
  def inRange(start: Int, end: Int): Range = {

    val inrange: Range = start to end
    inrange
  }
  
  /**
   * Write a function that returns a Range of odd n odd integers starting at 1.
   *
   * HINT: Look at the Scaladoc for Int/RichInt to find the answer.
   *
   * @param n the number of odd integers in the range
   * @return a Range of odd integers, excluding the last add integer
   */
  def oddRange(n: Int): Range = {

    val oddRange: Range = 1 to (1+(n-1)*2)
    oddRange
  }
  
  /**
   * Write a function that returns the minimum integer in the Array r.
   *
   * Your implementation must conform to the following rules:
   *
   * - You must use a while loop.
   * - You may use both immutable (val) and mutable (var) variables.
   * - You must use an if expression.
   *
   * @param r the array of integers
   * @return the minimum integer in the array
   */
  def minWhile(r: Array[Int]): Int = {

    var minInt: Int = Int.MaxValue
    var i: Int = 0
    while (i < r.length){
      if (r(i)<= minInt){
        minInt= r(i)
      }
      i = i + 1
    }
    minInt
  }

  /**
   * Write a function that returns the minimum integer in the Array r.
   *
   * Your implementation must conform to the following rules:
   *
   * - You must use a for loop (not for comprehension).
   * - You may use both immutable (val) and mutable (var) variables.
   * - You may not use an if expression.
   *
   * @param r the array of integers
   * @return the minimum integer in the array
   */
  def minFor(r: Array[Int]): Int = {

    var minVal = 0
    for (i <- 0 until r.length){

      math.min(minVal, r(i))
    }
    minVal
  }

  /**
   * Write a function called minRecursive that returns the minimum integer in the Array r.
   *
   * Your implementation must conform to the following rules:
   *
   * - You may not use any loops.
   * - You may not use any mutable (var) or immutable (val) variables.
   *
   * HINT: You might want to look at the Scaladoc for Array to see some
   * useful methods you can use to solve this.
   *
   * @param r the array of integers
   * @return the minimum integer in the array
   */
  def minRecursive(r: Array[Int]): Int = {

    var minVal: Int = Int.MaxValue
    def minRecursive1 (r: Array[Int], minVal: Int): Int = {
      var minVal1= minVal
      r match {
        case Array() => minVal1
        case Array(_*) => if (r(0) < minVal1) {
          minVal1 = r(0)
        }
          var ss = r.toBuffer
          ss.remove(0)
          val yy: Array[Int] = ss.toArray
          minRecursive1(yy, minVal1)
      }
    }
    val xx: Int = minRecursive1(r, minVal)
    xx
  }

  /**
   * Return the base 36 equivalent of the BitInt b.
   *
   * HINT: Poke around Scaladoc to find a way of doing this in Scala.
   *
   * @param b a big integer
   * @return the base 36 equivalent
   */
  def base36(b: BigInt): String = {

    var string: String = b.toString(36)
    string
  }
  /**
   * Splits the String s in half.
   *
   * This function returns a tuple (f, e), where the f is the first
   * half of the string and e is the last half of the string.
   *
   * For example,
   *   splitInHalf("abcdef") => ("abc", "def")
   *   splitInFalf("abcde")  => ("ab", "cde")
   *
   * Your implementation must conform to the following rules:
   *
   * - You may not use any loops.
   * - You may not use recursion.
   * - You may not use any mutable (var) or immutable (val) variables.
   *
   * HINT: You might find something useful in the String and StringOps Scaladoc.
   *
   * @param s the string to split
   * @return the split string as a tuple
   */
  def splitInHalf(s: String): (String, String) = {

    val slength: Float = s.length.toFloat
    val splitInHalf = (s.slice(0, math.floor(slength / 2).toInt), s.slice(math.floor(slength / 2).toInt, s.length))
    splitInHalf
  }

  /**)
   * Determines if the given string s is a palindrome.
   *
   * Your implementation must conform to the following rules:
   *
   * - You must use a for comprehension.
   * - You may not use any other loops.
   * - You may not use any mutable (var) variables.
   *
   * You should normalize the string s before determining if
   * it is a palindrome. That is, you should not distinguish
   * between upper and lowercase, you should not consider
   * spaces, and you should eliminate the punctuation
   * characters . ? , ; ! - '.
   *
   * HINT: You should consult the Scaladoc for String and
   * StringOps to help you with your solution.
   *
   * @param s the potential palindrome
   * @return true if s is a palindrome; false otherwise
   */
  def isPalindrome(s: String): Boolean = {

    val ss = s.replaceAll("""[\p{Punct}]|[" "]""", "").toLowerCase
    val ss1= ss.slice(0, ss.length/2.toInt)
    val ss2: String = (for (i <- ss.length-1 to ((ss.length+1)/2).toInt by -1)yield ss(i))(collection.breakOut)
    if (ss1 == ss2){
      true
    }
    else{
      false
    }
  }

  /**
   * You don't have to complete this one as we've removed it from the list
   * of required functions.
   *
   * Sum the characters (as integers) provided as arguments to this method.
   *
   * Your implementation must conform to the following rules:
   *
   * - You must use a for loop
   * - You may use any mutable (var) variables.
   *
   * @param cc 0 or more characters
   * @return the sum of the ASCII integers corresponding with the character.
   */
  //def sumChars(cc: Char*): Int = ???

  /**
   * Counts the number of space delimited words in the provided array of strings.
   *
   * This function takes an array of strings that represent lines in a text file.
   * This function must return a Map from String to Int where the String is a
   * word found across all lines and the Int is the number of times that word
   * was seen. For example:
   *
   * wordCount(Array("this is a sentence.", "this is a sentence too!"))
   *
   * would return
   *
   * Map("this" -> 2,
   *     "is" -> 2,
   *     "a" -> 2,
   *     "sentence." -> 1,
   *     "sentence" -> 1,
   *     "too!" -> 1)
   *
   * You may assume that all words are delimited by spaces. You need not worry
   * about punctuation. You can implement this however you wish.
   *
   * @param lines the lines of a text file
   * @return a map from words to the number of times that word was seen
   */
  def wordCounter(lines: Array[String]): Map[String, Int] = {

    var wordArray: Array[String]=Array()
    for (i <- lines){
      var wordArray1: Array[String]=i.split("\\s+")
      for (i <- wordArray1){
        var ii= i.replaceAll("[^\\w]", "")
        wordArray = wordArray :+ ii
      }
    var kk: Map[String, Int] = wordArray.groupBy(w => w).mapValues(_.length)
      kk
    }

  }

}
