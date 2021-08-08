package io.github.casuallyblue.web.html.element

import play.mvc.Result
import play.mvc.Results

interface Element {
    fun render(builder: StringBuilder)

    fun renderAsResult(): Result {
        val sb = StringBuilder()
        render(sb)
        return Results.ok(sb.toString()).`as`("text/html")
    }

    fun render(): String {
        val sb = StringBuilder()
        render(sb)
        return sb.toString()
    }
}