package io.github.casuallyblue.web

import io.github.casuallyblue.web.html.HTML
import io.github.casuallyblue.web.html.attributes.Attribute
import play.mvc.Result

fun html(vararg attributes: Attribute, init: HTML.() -> Unit): HTML {
    val html = HTML(*attributes)
    html.init()
    return html
}

open class View(private val document: HTML) {
    fun render(): Result {
        return document.renderAsResult()
    }
}
