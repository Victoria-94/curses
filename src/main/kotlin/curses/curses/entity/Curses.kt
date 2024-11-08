package curses.curses.entity


import jakarta.persistence.*

@Entity
@Table(name = "curses")
class Curses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, unique = true)
    var id: Long? = null

    var title: String? = null
    var description: String? = null
    var modality: String? = null
    var price: Double? = null
    var inscription: Boolean? = true

    @OneToMany(mappedBy = "curses", cascade = [CascadeType.ALL]) //fetch = FetchType.LAZY)
     val students: List<Students> = listOf() // Asegúrate de que esté correctamente tipado como List<student>
}
