package model

import kotlinx.serialization.json.Json
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

private val jsonParser =
    Json {
        ignoreUnknownKeys = true
    }

class UserTest {
    @Test
    fun `should correctly deserialize User from JSON`() {
        val json =
            """
            {
                "id": 100,
                "name": "Test User",
                "email": "test@example.com",
                "gender": "male",
                "status": "active"
            }
            """.trimIndent()

        val expectedUser =
            User(
                id = 100,
                name = "Test User",
                email = "test@example.com",
                gender = "male",
                status = "active",
            )

        val actualUser = jsonParser.decodeFromString<User>(json)

        assertEquals(expectedUser, actualUser)
    }
}
