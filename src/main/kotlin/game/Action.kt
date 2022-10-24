enum class UserAction {
    ROCK, PAPER, SCISSOR
}

class Action(var name: String)

fun randomActionIfEmpty(action: Action) {
    if (action.name == "") action.name = UserAction.values().random().toString()
}
