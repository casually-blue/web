package com.github.casuallyblue.view.html.tags.body

import com.github.casuallyblue.view.html.attributes.Attribute
import com.github.casuallyblue.view.html.tags.TagWithText

abstract class BodyTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)