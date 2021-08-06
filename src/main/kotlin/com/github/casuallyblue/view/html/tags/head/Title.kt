package com.github.casuallyblue.view.html.tags.head

fun HeadTag.title(init: Title.() -> Unit) = initTag(Title(), init)
class Title : HeadTag("title")