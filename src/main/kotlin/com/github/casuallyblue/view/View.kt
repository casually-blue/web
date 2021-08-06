package com.github.casuallyblue.view

import com.github.casuallyblue.view.html.HTML
import com.github.casuallyblue.view.html.attributes.Attribute
import play.mvc.Result

fun html(vararg attributes: Attribute, init: HTML.() -> Unit): HTML {
    val html = HTML(*attributes)
    html.init()
    return html
}

open class View(private val document: HTML) {
    fun render(): Result {
        return document.render()
    }
}
