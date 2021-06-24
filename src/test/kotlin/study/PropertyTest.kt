package study

import org.junit.jupiter.api.Test

internal class Property(str: String, val str2: String)

internal class PropertyTest {
    @Test
    fun test() {
        println("hi")
        Property("a", "b")
    }
}
