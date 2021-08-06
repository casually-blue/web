package io.github.casuallyblue.view.html.tags.head

import io.github.casuallyblue.view.html.attributes.Attribute
import io.github.casuallyblue.view.html.tags.TagWithText

abstract class HeadTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)