import components.*
import react.*
import react.dom.div
import react.dom.i
import react.dom.span
import react.router.dom.browserRouter
import react.router.dom.hashRouter
import react.router.dom.route
import react.router.dom.switch

class App : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        hashRouter {
//            navbar {}
            switch {
                route(path = "/", component = Default::class, exact = true)
                route(path = "/details") { details() }
                route(path = "/path") { cart() }
            }
        }
    }

}

fun RBuilder.app(): ReactElement {
    return child(App::class) {

    }
}
