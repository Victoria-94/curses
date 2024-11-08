package curses.curses

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CursesApplication

fun main(args: Array<String>) {
	runApplication<CursesApplication>(*args)
}
