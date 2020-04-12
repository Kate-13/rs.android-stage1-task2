package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val vowels = listOf('a','e','i','o','u','y')
        val cons = listOf('q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm')
        val res = mutableListOf<String>()
        var rs = ""
        val pangram = ('a'..'z').all {inputString.contains(it, ignoreCase = true)}
        val word = inputString.split(" ").map { it.trim() }
        var arr = vowels
        if (!pangram) {
            arr = cons
        }
        word.forEach { w ->
            var c = 0
            var nw = ""

            w.forEach { i ->
            val isletter = arr.contains(i.toLowerCase())

            if (isletter)  {
                c = c+1
                nw += i.toUpperCase()
            } else {
                nw += i
            }
        }
        if (nw != "")
            res.add(c.toString()+nw)
        }
        res.sortBy { it[0] }
        rs = res.joinToString(separator = " ")

        return rs
    }

}


