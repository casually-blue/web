package io.github.casuallyblue.web.html.tags.head

import io.github.casuallyblue.web.html
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HeadTest {

    @Test
    fun testCreateTag() {
        assertEquals("<!DOCTYPE html><html><head/></html>", html{head{}}.render())
    }
}