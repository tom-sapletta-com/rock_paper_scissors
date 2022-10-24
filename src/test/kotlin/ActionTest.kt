
import kotlin.test.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ActionTest {

    @Test
    fun check_random_if_empty() {
        val firstPlayer:Play
        val secondPlayer: Play

        firstPlayer = Play(User("Tom"), Action(""))
        secondPlayer = Play(User("Bot"), Action(""))

        randomActionIfEmpty(firstPlayer.action)
        randomActionIfEmpty(secondPlayer.action)

        assertNotEquals("", firstPlayer.action.name)
        assertNotEquals("", secondPlayer.action.name)

    }

    @Test
    fun check_random_if_not_empty() {
        val firstPlayer:Play
        val secondPlayer: Play

        firstPlayer = Play(User("Tom"), Action(UserAction.ROCK.name))
        secondPlayer = Play(User("Bot"), Action(UserAction.ROCK.name))
        assertEquals(true, isDraw(firstPlayer, secondPlayer))

        randomActionIfEmpty(firstPlayer.action)
        randomActionIfEmpty(secondPlayer.action)

        assertEquals(UserAction.ROCK.name, firstPlayer.action.name)
        assertEquals(UserAction.ROCK.name, secondPlayer.action.name)
        assertNotEquals("", firstPlayer.action.name)
        assertNotEquals("", secondPlayer.action.name)
    }

}