package io.github.casuallyblue.web.html.tags.head

import io.github.casuallyblue.web.html.attributes.Attribute

fun HeadTag.meta(content: Content, httpEquiv: HttpEquiv, vararg attributes: Attribute) = initTag(Meta(content, httpEquiv, *attributes)) {}

class Meta(content: Content, httpEquiv: HttpEquiv, vararg attributes: Attribute) : HeadTag("meta", content, httpEquiv, *attributes)

class Content(value: String): Attribute("content", value)
fun content(value: String): Content = Content(value)

class HttpEquiv(value: String): Attribute("http-equiv", value)
fun httpEquiv(value: String): HttpEquiv = HttpEquiv(value)