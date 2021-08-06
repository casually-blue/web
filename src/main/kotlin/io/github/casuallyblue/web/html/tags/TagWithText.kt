package io.github.casuallyblue.web.html.tags

import io.github.casuallyblue.web.html.attributes.Attribute
import io.github.casuallyblue.web.html.element.TextElement

abstract class TagWithText(name: String, vararg attributes: Attribute) : Tag(name, *attributes) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}