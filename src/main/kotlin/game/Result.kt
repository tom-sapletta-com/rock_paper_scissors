import java.util.*

enum class PlayResult {
    DRAW, WON, LOSE
}

class Result(var round: Int, var first: String, var second: String, var result: String)
class ResultCounter(var first: Int, var second: Int, var nobody: Int)

fun updateWonResult(firstPlayer: Play, secondPlayer: Play, result: Result, resultCounter: ResultCounter) {
    if (!isDraw(firstPlayer, secondPlayer)) {
        val won_name: String
        if (isFirstUserWon(firstPlayer, secondPlayer)) {
            won_name = firstPlayer.user.name
            resultCounter.first++
        } else {
            won_name = secondPlayer.user.name
            resultCounter.second++
        }
        result.result = "$won_name ${PlayResult.WON.name}!"
    } else {
        resultCounter.nobody++
    }
}

// ONE ROUND OF GAME

fun roundWithTwoUsers(
    round: Int,
    firstPlayer: Play,
    secondPlayer: Play,
    results: ArrayList<Result>,
    counter: ResultCounter
) {

    randomActionIfEmpty(firstPlayer.action)
    randomActionIfEmpty(secondPlayer.action)

    val result = Result(
        round,
        firstPlayer.user.name + ": " + firstPlayer.action.name,
        secondPlayer.user.name + ": " + secondPlayer.action.name,
        PlayResult.DRAW.name
    )
    var won: User
    updateWonResult(firstPlayer, secondPlayer, result, counter)

    results.add(result)
}
