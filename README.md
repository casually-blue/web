# Kotlin Html Templating Framework
This framework is intended to be used with playmvc for use with kotlin
It enables writing html pages without using scala templates which
are somewhat incompatible with running playmvc linked to kotlin because it causes two-way dependencies
which are much harder to deal with

## Use Instructions
To use, just declare as a dependency in your project by following the package instructions, and the github package repository instructions to get set up.

## Usage
Just use on its own or inside a View object. The view object provides a simple `.render()` function which returns a playmvc result with the http content-type set for use in your controller
```kotlin
View(
    html(lang("en")) {
        head {
            title { +"Test Page View" }
            meta(content("text/html;charset=utf8"), httpEquiv("Content-Type"))
            meta(content("utf-8"), httpEquiv("encoding"))
        }
        body {
            h1(
                id("home"),
                `class`("test", "data")
            ) {
                +"Hello from Kotlin View"
                br()
                a(href("/phones")){
                    +"Phones"
                }
            }
            p{
                for(i in 1..3) {
                    +"Count $i"
                }
            }
        }
    }
)
```
