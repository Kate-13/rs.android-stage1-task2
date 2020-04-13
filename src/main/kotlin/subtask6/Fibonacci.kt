package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val result = ArrayList<Int>()
        val fibarr = mutableListOf(0,1)
        var prod = 0
        while (fibarr[fibarr.size-1] < n) {
            fibarr.add(fibarr[fibarr.size-1] + fibarr[fibarr.size-2])
        }

        fibarr.forEachIndexed { i, el ->
            if (i<(fibarr.size-1)) {
                prod = fibarr[i] * fibarr[i+1]
            }
            if (prod == n) {
                result.add(fibarr[i])
                result.add(fibarr[i+1])
                result.add(1)
            } else if (prod > n && result.isEmpty() ) {
                result.add(fibarr[i])
                result.add(fibarr[i+1])
                result.add(0)
              }

            }
        return result.toIntArray()
        }
    }

