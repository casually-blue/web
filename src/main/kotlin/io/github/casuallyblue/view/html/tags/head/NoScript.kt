package io.github.casuallyblue.view.html.tags.head

fun HeadTag.noscript(init: NoScript.() -> Unit) = initTag(NoScript(), init)
class NoScript: HeadTag("noscript")