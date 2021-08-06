package com.github.casuallyblue.view.html.tags.body

import com.github.casuallyblue.view.html.attributes.Attribute

fun BodyTag.h1(vararg attributes: Attribute, init: H1.() -> Unit) = initTag(H1(*attributes), init)
class H1(vararg attributes: Attribute) : BodyTag("h1", *attributes)