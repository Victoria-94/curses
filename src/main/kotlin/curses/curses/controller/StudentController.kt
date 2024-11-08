package curses.curses.controller

import curses.curses.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import curses.curses.entity.Students

@RestController
@RequestMapping("/student")
class StudentController {


    @Autowired
    lateinit var studentService: StudentService


    @GetMapping
    fun list(): List <Students> {
        return studentService.list()
    }
    @PostMapping
    fun save(@RequestBody students: Students): Students {
        return studentService.save(students)
    }


}
