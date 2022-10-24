import java.util.*

// START GAME

fun main() {
    println("\n::::: START GAME : Rock, Paper, Scissors ::::::")

    val users = ArrayList<User>(2)
    users.add(User("Tom"))
    users.add(User("Bot"))

    for (user in users) println(helloUser(user))

    val roundLimit = 100
    println("\nGAME with $roundLimit rounds:")

    val results = ArrayList<Result>(roundLimit)
    val counter = ResultCounter(0,0,0)

    for (i in 1..roundLimit) {
        val itr: MutableIterator<User> = users.iterator()

        roundWithTwoUsers(
            i,
            Play(itr.next(), Action(UserAction.ROCK.name)),
            Play(itr.next(), Action("")),
            results,
            counter
        )
    }

    for (result in results) println(" ${result.round} ${result.first} ${result.second} = ${result.result} ")

    println("\nRESULT COUNTER:")
    val itr: MutableIterator<User> = users.iterator()
    println("User ${itr.next().name} won ${counter.first} times")
    println("User ${itr.next().name} won ${counter.second} times")
    println("Draw ${counter.nobody} times")


    println("\n::::: GAME OVER : Rock, Paper, Scissors ::::::")
}
