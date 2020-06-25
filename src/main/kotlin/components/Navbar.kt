package components

import kotlinx.coroutines.CompletionHandler
import react.*
import react.dom.div
import react.dom.h3

class Navbar : RComponent<NavbarProps, RState>() {

    override fun RBuilder.render() {
        div {
            h3 {
                +"Hello From Nav Bar"
            }
        }
    }
}

interface NavbarProps : RProps {
    val menu: List<String>
}

fun RBuilder.navbar(handler: NavbarProps.() -> Unit): ReactElement {
    return child(Navbar::class) {
        this.attrs(handler)
    }
}
