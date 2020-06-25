package components

import react.*
import react.dom.div
import react.dom.h3

class ProductList : RComponent<ProductListProps, RState>() {

    override fun RBuilder.render() {
        div {
            product()
        }
    }

}

interface ProductListProps : RProps {
}

fun RBuilder.productList(handler: ProductListProps.() -> Unit = {}): ReactElement{
    return child(ProductList::class){
        this.attrs(handler)
    }
}

