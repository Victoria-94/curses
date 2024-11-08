package curses.curses.repository


import curses.curses.entity.Students
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface StudentRepository: JpaRepository <Students, Long>{
}