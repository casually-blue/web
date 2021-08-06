package com.github.casuallyblue.view.html.tags

import com.github.casuallyblue.view.html.element.Element
import com.github.casuallyblue.view.html.HtmlTagMarker
import com.github.casuallyblue.view.html.attributes.Attribute

@HtmlTagMarker
abstract class Tag(val name: String, vararg var attributes: Attribute) : Element {
    val children = arrayListOf<Element>()

    fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, indent: String) {
        if(children.isNotEmpty()) {
            builder.append("$indent<$name${renderAttributes()}>\n")
            for (c in children) {
                c.render(builder, "$indent  ")
            }
            builder.append("$indent</$name>\n")
        } else {
            builder.append("$indent<$name${renderAttributes()}/>\n")
        }
    }

    private fun renderAttributes(): String {
        val builder = StringBuilder()
        for (attr in attributes) {
            builder.append(" ${attr.name}=\"${attr.value}\"")
        }
        return builder.toString()
    }

    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}