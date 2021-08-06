package io.github.casuallyblue.view.html.tags.body

import io.github.casuallyblue.view.html.HTML

fun HTML.body(init: Body.() -> Unit) = initTag(Body(), init)
class Body : BodyTag("body")