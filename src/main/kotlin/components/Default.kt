package components

import react.*
import react.dom.div
import react.dom.h3

class Default : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h3 {
                +"Page Not Found"
            }
        }
    }
}

fun RBuilder.default(): ReactElement {
    return child(Default::class){

    }
}