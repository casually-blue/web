package io.github.casuallyblue.view.html.tags.body

import io.github.casuallyblue.view.html.attributes.Attribute
import io.github.casuallyblue.view.html.tags.TagWithText

abstract class BodyTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)