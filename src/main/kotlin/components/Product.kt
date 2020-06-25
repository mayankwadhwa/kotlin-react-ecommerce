package components

import kotlinx.coroutines.CompletionHandler
import react.*
import react.dom.div
import react.dom.h3

class Product : RComponent<RProps,RState>(){
    override fun RBuilder.render() {
        div {
            h3 {
                +"Hello From Product"
            }
        }
    }

}

fun RBuilder.product():ReactElement{
    return child(Product::class){

    }
}