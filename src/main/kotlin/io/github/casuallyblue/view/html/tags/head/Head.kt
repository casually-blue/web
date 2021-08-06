package io.github.casuallyblue.view.html.tags.head

import io.github.casuallyblue.view.html.HTML

fun HTML.head(init: Head.() -> Unit) = initTag(Head(), init)
class Head  : HeadTag("head")