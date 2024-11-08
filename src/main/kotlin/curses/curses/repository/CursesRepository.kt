package curses.curses.repository

import curses.curses.entity.Curses
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CursesRepository: JpaRepository<Curses, Long>{
}