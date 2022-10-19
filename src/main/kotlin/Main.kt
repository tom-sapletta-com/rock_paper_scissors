//import java.util.ArrayList
import java.util.*

val user_actions = listOf("ROCK", "PAPER", "SCISSOR")

class User(val name: String)

class Action(var default: String)

fun RandomActionIfEmpty(action: Action){
    if( action.default == "" ) action.default = user_actions.random()
}

class Play(user: User, action: Action) {
    val user: User = user
    val action: Action = action
}

fun HelloUser(user: User) = println("Hello ${user.name} !")

fun HelloUsers(users: ArrayList<User>) {
    for (user in users) HelloUser(user)
}

fun IsDraw(firstPlayer: Play, secondPlayer: Play): Boolean {
    return firstPlayer.action.default == secondPlayer.action.default
}

fun GetWinner(firstPlayer: Play, secondPlayer: Play): User {
    var won: User

    won = secondPlayer.user

    if (firstPlayer.action.default == "ROCK" && secondPlayer.action.default == "SCISSOR") {
        won = firstPlayer.user
    }
    if (firstPlayer.action.default == "PAPER" && secondPlayer.action.default == "ROCK") {
        won = firstPlayer.user
    }
    if (firstPlayer.action.default == "SCISSOR" && secondPlayer.action.default == "PAPER") {
        won = firstPlayer.user
    }

    return won
}

fun Round(firstPlayer: Play, secondPlayer: Play) {

    RandomActionIfEmpty(firstPlayer.action)
    RandomActionIfEmpty(secondPlayer.action)

    //println("ACTIONS:")
    println(firstPlayer.user.name + ": " + firstPlayer.action.default + " vs " + secondPlayer.user.name + ": " + secondPlayer.action.default)

    if(IsDraw(firstPlayer, secondPlayer)){
        println("Draw")
    } else {
        var won: User = GetWinner(firstPlayer, secondPlayer)
        println(won.name + " won")
    }

}


fun main(args: Array<String>) {
    println("GAME: Rock, Paper, Scissors ")
    var round_limit=100
    println("Program arguments: ${args.joinToString()}")

    var users = arrayListOf(
        User("Tom"),
        User("Bot")
    )

    HelloUsers(users)

    var i = 1
    do {
        print(i)
        print(" ")
        Round(
            Play(User("Tom"), Action("ROCK")),
            Play(User("Bot"), Action(""))
        )
        i++
    }
    while (i <= round_limit)

}

