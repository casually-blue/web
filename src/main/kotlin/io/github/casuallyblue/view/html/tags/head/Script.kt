package io.github.casuallyblue.view.html.tags.head

fun HeadTag.script(init: Script.() -> Unit) = initTag(Script(), init)

class Script: HeadTag("script")