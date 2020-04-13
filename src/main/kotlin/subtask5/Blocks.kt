package subtask5

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass


class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        var res: Any = 0
        if (blockB == String::class) {
            val r = blockA.filterIsInstance<String>()
            res = r.joinToString(separator = "")
        }
        if (blockB == Int::class) {
            res = blockA.filterIsInstance<Int>().sum()
        }
        if (blockB == LocalDate::class) {
            val date = blockA.filterIsInstance<LocalDate>().max() ?: throw DateTimeException("Wrong Date")
            val form = DateTimeFormatter.ofPattern("dd.MM.yyyy")
            res = date.format(form)
        }
       return res
    }
}


