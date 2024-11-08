package curses.curses.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CursesDto {
    @NotNull(message = "ID cannot be null")
    @NotBlank(message = "Name cannot be null")
    var title: String? = null
    @NotNull(message = "ID cannot be null")
    @NotBlank(message = "Name cannot be null")
    var description: String? = null
    @NotNull(message = "ID cannot be null")
    @NotBlank(message = "Name cannot be null")
    var modality: String? = null
    @NotNull(message = "ID cannot be null")
    @NotBlank(message = "Name cannot be null")
    var price: Double? = null
    var inscription: Boolean? = null // Agregada la propiedad `inscription`

}