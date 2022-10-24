class Play(var user: User, var action: Action)

fun isDraw(firstPlayer: Play, secondPlayer: Play): Boolean {
    return firstPlayer.action.name == secondPlayer.action.name
}

fun isFirstUserWon(firstPlayer: Play, secondPlayer: Play): Boolean {
    return (firstPlayer.action.name == UserAction.ROCK.name && secondPlayer.action.name == UserAction.SCISSOR.name ) ||
            (firstPlayer.action.name == UserAction.PAPER.name && secondPlayer.action.name == UserAction.ROCK.name) ||
            (firstPlayer.action.name == UserAction.SCISSOR.name && secondPlayer.action.name == UserAction.PAPER.name)
}

