package curses.curses.service


import curses.curses.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import curses.curses.entity.Students

@Service
class StudentService {
    @Autowired
    lateinit var studentsRepository: StudentRepository

    fun list ():List<Students> {
        return studentsRepository.findAll()
    }

    fun save (students: Students): Students {
        return studentsRepository.save(students)
    }
}