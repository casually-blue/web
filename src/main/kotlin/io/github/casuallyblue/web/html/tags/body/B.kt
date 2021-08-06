package io.github.casuallyblue.web.html.tags.body

fun BodyTag.b(init: B.() -> Unit) = initTag(B(), init)
class B : BodyTag("b")