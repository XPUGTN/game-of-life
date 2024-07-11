package org.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertNotNull

class AppTest {
    @Test
    fun `app has a greeting`() {
        assertNotNull(App().greeting, "app should have a greeting")
    }
}
