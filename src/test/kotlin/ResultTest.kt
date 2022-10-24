
import kotlin.test.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ResultTest {
    @Test
    fun updateWonResultWithDrawTest() {
        val firstPlayer:Play
        val secondPlayer: Play
        val counter = ResultCounter(0,0,0)

        firstPlayer = Play(User("Tom"), Action(UserAction.ROCK.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.ROCK.name))
        assertEquals(true, isDraw(firstPlayer, secondPlayer))

        val result = Result(
            1,
            firstPlayer.user.name + ": " + firstPlayer.action.name,
            secondPlayer.user.name + ": " + secondPlayer.action.name,
            PlayResult.DRAW.name
        )

        updateWonResult(firstPlayer, secondPlayer, result, counter)

        assertEquals(PlayResult.DRAW.name, result.result)
        assertEquals(0, counter.first)
        assertEquals(0, counter.second)
        assertEquals(1, counter.nobody)

    }

    @Test
    fun updateWonResultWithFirstUserWonTest() {
        val firstPlayer:Play
        val secondPlayer: Play
        val counter = ResultCounter(0,0,0)

        firstPlayer = Play(User("Tom"), Action(UserAction.PAPER.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.ROCK.name))
        assertEquals(true, isFirstUserWon(firstPlayer, secondPlayer))

        val result = Result(
            1,
            firstPlayer.user.name + ": " + firstPlayer.action.name,
            secondPlayer.user.name + ": " + secondPlayer.action.name,
            PlayResult.DRAW.name
        )

        updateWonResult(firstPlayer, secondPlayer, result, counter)

        assertEquals("Tom WON!", result.result)
        assertEquals(1, counter.first)
        assertEquals(0, counter.second)
        assertEquals(0, counter.nobody)
    }
}