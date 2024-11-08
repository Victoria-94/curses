package curses.curses.controller

import curses.curses.dto.CursesDto
import curses.curses.entity.Curses
import curses.curses.service.CursesService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/curses")
class CursesController {

    @Autowired
    lateinit var cursesService: CursesService


    @GetMapping
    fun list(): List<Curses> {
        return cursesService.list()
    }

    @PostMapping
    fun save(@RequestBody @Valid cursesDto: CursesDto): CursesDto {
        return cursesService.save(cursesDto)
    }

}

