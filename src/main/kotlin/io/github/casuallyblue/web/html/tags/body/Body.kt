package io.github.casuallyblue.web.html.tags.body

import io.github.casuallyblue.web.html.HTML

fun HTML.body(init: Body.() -> Unit) = initTag(Body(), init)
class Body : BodyTag("body")