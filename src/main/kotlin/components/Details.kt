package components

import react.*
import react.dom.div
import react.dom.h3

class Details : RComponent<RProps,RState>(){
    override fun RBuilder.render() {
        div {
            h3 {
                +"Hello From Details"
            }
        }
    }

}

fun RBuilder.details(): ReactElement{
    return child(Details::class){

    }
}