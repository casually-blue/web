package io.github.casuallyblue.web.html.tags.body

fun BodyTag.p(init: P.() -> Unit) = initTag(P(), init)
class P : BodyTag("p")