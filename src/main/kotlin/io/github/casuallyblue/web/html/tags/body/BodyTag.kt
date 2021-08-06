package io.github.casuallyblue.web.html.tags.body

import io.github.casuallyblue.web.html.attributes.Attribute
import io.github.casuallyblue.web.html.tags.TagWithText

abstract class BodyTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)