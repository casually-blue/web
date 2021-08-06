package com.github.casuallyblue.view.html.attributes

open class Attribute(val name: String, val value: String) {
}

class Lang(value: String): Attribute("lang", value)
fun lang(value: String): Attribute = Lang(value)

class Id(value: String): Attribute("id", value)
fun id(value: String): Attribute = Id(value)

class Class(vararg var values: String): Attribute("class", values.joinToString(" "))
fun `class`(vararg values: String): Attribute = Class(*values)