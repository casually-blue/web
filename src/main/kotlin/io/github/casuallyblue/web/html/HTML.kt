package io.github.casuallyblue.web.html

import io.github.casuallyblue.web.html.tags.TagWithText
import io.github.casuallyblue.web.html.attributes.Attribute

class HTML(vararg attributes: Attribute) : TagWithText("html", *attributes){
    override fun render(builder: StringBuilder) {
        builder.append("<!DOCTYPE html>")
        super.render(builder)
    }
}

