import kotlin.random.Random



// Exercise 2



    /*
Write implementations of the functions into a Kotlin file. You may find
it useful to try out the functions in a Kotlin worksheet.
*/

    /*
Write function pickNumber() that has two Int parameters: low and high
and returns a random number between low and high (inclusive). You may
assume low <= high. Default value for low and high should be 1 and 40.
Hint: consider making a range and picking a random number from it.
Example runs:
println(pickNumber()) // a number in 1..40
println(pickNumber(0,1)) // a number in 0..1
println(pickNumber(1,6)) // a number in 1..6
*/
    fun pickNumber(low: Int = 1, high: Int = 40): Int {
        return Random.nextInt(low, high + 1)


    }



    /*
Write function pickNDistinct(low: Int, high: Int, n: Int) that
returns n distinct random numbers between low and high (inclusive).
You may assume low <= high and n <= number of distinct values.
Return the values as List of Int values sorted from smallest to greatest.
Example runs:
println(pickNDistinct(1,40,7)) // for example [3, 6, 11, 17, 19, 21, 34]
println(pickNDistinct(1,6,3)) // for example [1, 3, 6]
println(pickNDistinct(1,6,6)) // [1, 2, 3, 4, 5, 6]
*/
fun pickNDistinct(low: Int = 1, high: Int = 40, n: Int): List<Int> {
        val range = low..high
        val random = java.util.Random()
        val pickedNumbers = mutableSetOf<Int>()
        while (pickedNumbers.size < n) {
            val randomNumber = random.nextInt(range.count()) + range.first
            if (!pickedNumbers.contains(randomNumber)) {
                pickedNumbers.add(randomNumber)
            }
        }
        return pickedNumbers.toList().sorted()
    }

/*
Write function numDistinct(list: List<Int>) that returns the
number of distinct elements in list.
Hint: consider conversion to set.
Example runs:
println(numDistinct(listOf(1,1,1,2,3,4,5,6,6,6))) // 6
println(numDistinct(pickNDistinct(1,40,7))) // 7
*/
fun numDistinct(list: List<Int>){


}






/*
Write function numCommon(list1: List<Int>, list2: List<Int>) that returns
the number of elements in both list1 and list2. Multiple occurences should
be counted only once.
Example runs:
println(numCommon(listOf(1,2,3,4), listOf(2,4))) // 2
println(numCommon(listOf(1, 1, 1, 2, 3), listOf(1, 2))) // 2
println(numCommon(listOf(4, 3, 2), listOf(1, 4, 1, 1, 2, 3))) // 3
*/

    /*
Write function readNDistinct(low: Int, high: Int, n: Int): List<Int> that reads from console a line
that contains n distinct integer numbers ranging from low and high (inclusive), separated by commas.
You may assume low <= high and n <= number of distinct values.
Hints: use readLine(), .split(), check .toIntOrNull(), .filterNotNull() and .all { ... }
*/

    /*
Write function playLotto() that
- generates (secret) lotto numbers (7 distinct Ints in range from 1 to 40 (inclusive)).
- reads from the console user guess using readNDistinct() function
- prints the number of correctly guessed numbers (use numCommon() for this)
- lets user either continue with another round or end
- call your playLotto implementation from main function

Example runs (here computer guess (next exercise) is implemented also):
Give numbers separated by commas: 1,,2,3,4,5,6,7
Give numbers separated by commas: 1,2,3,4,5,6,7,8
Give numbers separated by commas: ,1,2,3,4,5,6,7
Give numbers separated by commas: 1,1,2,3,4,5,6
Give numbers separated by commas: 1,2,3,4,5,6,7
lotto numbers: [6, 7, 10, 11, 13, 25, 35], you got 2 correct
computer guess in 30 steps is [6, 7, 10, 11, 13, 25, 35]
More? (Y/N): Y
Give numbers separated by commas: 1,2,3,4,5,6,77
Give numbers separated by commas: 5,2,9,32,17,11,10
lotto numbers: [3, 6, 10, 12, 20, 36, 40], you got 1 correct
computer guess in 43 steps is [3, 6, 10, 12, 20, 36, 40]
More? (Y/N): N
*/




    fun findLotto(lotto: List<Int>): Pair<Int, List<Int>> {
        /*
    Write here code that generates lotto guesses and
    uses only function lottoResult (see below) to check the guesses.
    Do not use the content of variable lotto in any other way
    either directly or indirectly.
    Return the number of steps taken to find the correct lotto
    numbers as well as the list of correct numbers as a Pair.
    */
        return Pair(0, listOf()) // comment this out when implementing the function
    }



    /*
fun lottoResult(guess: List<Int>, lotto: List<Int>) =
    if (numDistinct(guess) == 7 && numDistinct(lotto) == 7 && (guess + lotto).all { it in (1..40) }) {
        numCommon(guess, lotto)
    } else {
        null
    }
*/
    fun main() {
        println("kukkuu")
        println(pickNumber(0,40))
        println(pickNDistinct(0,40,10))
    }
