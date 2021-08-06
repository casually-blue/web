package io.github.casuallyblue.view.html

import io.github.casuallyblue.view.html.tags.TagWithText
import io.github.casuallyblue.view.html.attributes.Attribute

class HTML(vararg attributes: Attribute) : TagWithText("html", *attributes){
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("<!DOCTYPE html>\n")
        super.render(builder, indent)
    }
}

