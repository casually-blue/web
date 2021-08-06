package io.github.casuallyblue.view.html.tags

import io.github.casuallyblue.view.html.attributes.Attribute
import io.github.casuallyblue.view.html.element.TextElement

abstract class TagWithText(name: String, vararg attributes: Attribute) : Tag(name, *attributes) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}