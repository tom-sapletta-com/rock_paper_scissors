
import kotlin.test.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PlayTest {
    @Test
    fun is_draw() {
        var firstPlayer:Play
        var secondPlayer: Play

        firstPlayer = Play(User("Tom"), Action(UserAction.ROCK.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.ROCK.name))
        assertEquals(true, isDraw(firstPlayer, secondPlayer))

        firstPlayer = Play(User("Tom"), Action(UserAction.SCISSOR.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.SCISSOR.name))
        assertEquals(true, isDraw(firstPlayer, secondPlayer))

        firstPlayer = Play(User("Tom"), Action(UserAction.PAPER.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.PAPER.name))
        assertEquals(true, isDraw(firstPlayer, secondPlayer))
    }

    @Test
    fun first_won() {
        var firstPlayer:Play
        var secondPlayer: Play

        firstPlayer= Play(User("Tom"), Action(UserAction.ROCK.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.SCISSOR.name))
        assertEquals(true, isFirstUserWon(firstPlayer, secondPlayer))

        firstPlayer= Play(User("Tom"), Action(UserAction.SCISSOR.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.PAPER.name))
        assertEquals(true, isFirstUserWon(firstPlayer, secondPlayer))
    }

    @Test
    fun second_won() {
        var firstPlayer:Play
        var secondPlayer: Play

        firstPlayer = Play(User("Tom"), Action(UserAction.SCISSOR.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.ROCK.name))
        assertEquals(false, isFirstUserWon(firstPlayer, secondPlayer))

        firstPlayer = Play(User("Tom"), Action(UserAction.PAPER.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.SCISSOR.name))
        assertEquals(false, isFirstUserWon(firstPlayer, secondPlayer))
    }

}