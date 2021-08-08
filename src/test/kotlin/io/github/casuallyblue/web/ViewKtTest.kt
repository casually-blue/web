package io.github.casuallyblue.web

import io.github.casuallyblue.web.html.attributes.lang
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ViewKtTest {

    @Test
    fun testHtmlTag() {
        assertEquals("<!DOCTYPE html><html/>", html {}.render())
    }

    @Test
    fun testHtmlTagWithLanguage(){
        assertEquals("<!DOCTYPE html><html lang=\"en\"/>", html(lang("en")) {}.render())
    }
}