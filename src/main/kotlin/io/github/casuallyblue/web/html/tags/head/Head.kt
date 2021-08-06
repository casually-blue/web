package io.github.casuallyblue.web.html.tags.head

import io.github.casuallyblue.web.html.HTML

fun HTML.head(init: Head.() -> Unit) = initTag(Head(), init)
class Head  : HeadTag("head")