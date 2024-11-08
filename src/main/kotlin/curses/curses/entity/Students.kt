package curses.curses.entity
import jakarta.persistence.*

@Entity
@Table(name = "students")
class Students{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var age: Int? = null
    var nui: String? = null
    var fullName: String? = null
    var email: String? = null

    /*@ManyToOne
    @JoinColumn(name = "curses_id")
    //, insertable = false, updatable = false) // No enforce foreign key

    var curses: Curses? = null **/
}
