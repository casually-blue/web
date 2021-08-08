package io.github.casuallyblue.web.html.element

class TextElement(private val text: String) : Element {
    override fun render(builder: StringBuilder) {
        builder.append(text)
    }
}