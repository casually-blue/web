package com.github.casuallyblue.view.html.tags.head

import com.github.casuallyblue.view.html.attributes.Attribute
import com.github.casuallyblue.view.html.tags.TagWithText

abstract class HeadTag(name: String, vararg attributes: Attribute) : TagWithText(name, *attributes)