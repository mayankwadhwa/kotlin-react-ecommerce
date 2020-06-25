package components

import react.*
import react.dom.div
import react.dom.h3

class Cart: RComponent<RProps,RState>(){

    override fun RBuilder.render() {
        div {
            h3 {
                +"Hello From Cart"
            }
        }
    }

}

fun RBuilder.cart(): ReactElement{
    return child(Cart::class){

    }
}