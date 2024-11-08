package curses.curses.mapper

import curses.curses.dto.CursesDto
import curses.curses.entity.Curses


object CursesMapper {
    fun toEntity (cursesDto: CursesDto): Curses {
        val curses = Curses()
        curses.title = cursesDto.title
        curses.description = cursesDto.description
        curses.price= cursesDto.price
        curses.modality = cursesDto.modality
        curses.inscription = true
        return curses

    }
    fun toDTO (curses: Curses): CursesDto {
        val cursesDto = CursesDto()
        cursesDto.title = curses.title
        cursesDto.description = curses.description
        cursesDto.price = curses.price
        cursesDto.modality = curses.modality
        cursesDto.inscription = true
        return cursesDto

    }
}