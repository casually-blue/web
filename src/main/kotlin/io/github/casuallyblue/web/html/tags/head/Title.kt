package io.github.casuallyblue.web.html.tags.head

fun HeadTag.title(init: Title.() -> Unit) = initTag(Title(), init)
class Title : HeadTag("title")