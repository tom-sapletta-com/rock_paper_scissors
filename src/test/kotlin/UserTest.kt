
import kotlin.test.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UserTest {
    @Test
    fun helloUser_return_string() {
        assertEquals(helloUser(User("Tom")), "Hello Tom !")
        assertEquals(helloUser(User("Bot")), "Hello Bot !")
    }

    @Test
    fun helloUser_return_empty() {
        assertEquals(helloUser(User("")), "Hello  !")
    }

}