package io.github.casuallyblue.view.html.tags.body

fun BodyTag.p(init: P.() -> Unit) = initTag(P(), init)
class P : BodyTag("p")