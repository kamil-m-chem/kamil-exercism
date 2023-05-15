import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(val givenDateTime: LocalDateTime)
        {
            constructor(localDate: LocalDate?):
                this(LocalDateTime.of(localDate, LocalTime.of(0,0,0)))

            val date: LocalDateTime? = givenDateTime?.plusSeconds(1000000000)

}

