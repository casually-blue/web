package io.github.casuallyblue.web.html.tags.head

import io.github.casuallyblue.web.html.attributes.Attribute
import io.github.casuallyblue.web.html.tags.TagWithText

abstract class HeadTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)