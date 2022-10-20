import java.util.*

// USER

class User(val name: String)

fun helloUser(user: User) = println("Hello ${user.name} !")

fun helloUsers(users: ArrayList<User>) {
    for (user in users) helloUser(user)
}

// ACTION: "ROCK", "PAPER", "SCISSOR"

val user_actions = listOf("ROCK", "PAPER", "SCISSOR")

class Action(var default: String)

fun randomActionIfEmpty(action: Action) {
    if (action.default == "") action.default = user_actions.random()
}

// PLAY = USER + ACTION

class Play(var user: User, var action: Action)

fun isDraw(firstPlayer: Play, secondPlayer: Play): Boolean {
    return firstPlayer.action.default == secondPlayer.action.default
}

fun wonUser(firstPlayer: Play, secondPlayer: Play): User {
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

// RESULT

class Result(var first: String, var second: String, var result: String)

fun updateWonResult(firstPlayer: Play, secondPlayer: Play, result: Result) {
    if (!isDraw(firstPlayer, secondPlayer)) {
        val won: User = wonUser(firstPlayer, secondPlayer)
        result.result = won.name + " won"
    }
}

fun printResults(results: ArrayList<Result>) {
    var i = 0
    for (result in results) {
        i++
        println(" $i " + result.first + " " + result.second + " = " + result.result)
    }
}

// ONE ROUND OF GAME

fun roundWithTwoUsers(firstPlayer: Play, secondPlayer: Play, results: ArrayList<Result>) {

    randomActionIfEmpty(firstPlayer.action)
    randomActionIfEmpty(secondPlayer.action)

    val result = Result(
        firstPlayer.user.name + ": " + firstPlayer.action.default,
        secondPlayer.user.name + ": " + secondPlayer.action.default,
        "Draw"
    )

    updateWonResult(firstPlayer, secondPlayer, result)

    results.add(result)
}

// START GAME

fun main() {
    println("::::: START GAME : Rock, Paper, Scissors ::::::")

    val users = ArrayList<User>(2)
    users.add(User("Tom"))
    users.add(User("Bot"))

    helloUsers(users)

    val roundLimit: Int = 100
    println("GAME with $roundLimit rounds")

    val results = ArrayList<Result>(roundLimit)

    for (i in 1..roundLimit) {
        val itr: MutableIterator<User> = users.iterator()

        roundWithTwoUsers(
            Play(itr.next(), Action("ROCK")),
            Play(itr.next(), Action("")),
            results
        )
    }

    printResults(results);

    println("::::: GAME OVER : Rock, Paper, Scissors ::::::")
}

