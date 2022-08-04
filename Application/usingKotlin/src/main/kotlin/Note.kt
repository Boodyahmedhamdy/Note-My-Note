data class Note(val ID: Int,
           var title: String = "noteTitle",
           var content: String = "noteContent",
           var topic: String = "noteTopic",
           val creator: User) {


}