fun main() {
    var user: User = User("boody")
    var note: Note = Note(1, creator = user)
    var theme: Theme = Theme("#111", "#999", "#fff")

    println(user)
    println(note)
    println(theme)
}
