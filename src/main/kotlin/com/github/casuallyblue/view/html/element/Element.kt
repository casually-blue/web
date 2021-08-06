package com.github.casuallyblue.view.html.element

import play.mvc.Result
import play.mvc.Results

interface Element {
    fun render(builder: StringBuilder, indent: String)
    fun render(): Result {
        val sb = StringBuilder()
        render(sb, "")
        return Results.ok(sb.toString()).`as`("text/html")
    }
}