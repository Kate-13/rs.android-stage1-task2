package subtask2

import java.time.DateTimeException
import java.time.LocalTime


class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        var result = ""
        val hh=hour.toInt()
        val mm=minute.toInt()
        val numbers = arrayOf(
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine"
        )
        try {
            var time = LocalTime.of(hh, mm)
            if (mm == 0)
                result = numbers[hh] + " o' clock"
            else if (mm == 1)
                result = "one minute past " + numbers[hh]
            else if (mm == 15)
                result = "quarter past " + numbers[hh]
            else if (mm == 30)
                result = "half past " + numbers[hh]
            else if (mm == 45)
                result = "quarter to " + numbers[(hh % 12) + 1]
            else if (mm == 59)
                result = "one minute to " + numbers[(hh % 12) + 1]
            else if  ((mm >= 1) && (mm < 30))
                result = numbers[mm]+ " minutes past " + numbers[hh]
            else if  (mm > 30)
                result = numbers[60-mm] + " minutes to " + numbers[(hh % 12) + 1]

        } catch (e: DateTimeException) {
                result = ""
            }
        return result
    }
}
