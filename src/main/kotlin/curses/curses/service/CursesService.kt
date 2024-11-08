package curses.curses.service

import curses.curses.dto.CursesDto
import curses.curses.entity.Curses
import curses.curses.mapper.CursesMapper
import curses.curses.repository.CursesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CursesService {
    @Autowired
    lateinit var cursesRepository: CursesRepository


    fun list ():List<Curses> {
        return cursesRepository.findAll()
    }

    // En cursesService.kt
    fun save(cursesDto: CursesDto): CursesDto {
        val cursesEntity = CursesMapper.toEntity(cursesDto)
        val savedCurses = cursesRepository.save(cursesEntity)
        return CursesMapper.toDTO(savedCurses)
    }

}