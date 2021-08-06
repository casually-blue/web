package io.github.casuallyblue.view.html.tags.body

fun BodyTag.b(init: B.() -> Unit) = initTag(B(), init)
class B : BodyTag("b")