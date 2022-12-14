package com.gones.foodinventorykotlin.data.model

import androidx.annotation.Keep
import com.gones.foodinventorykotlin.domain.entity.ProductResult
import com.squareup.moshi.Json

@Keep
data class ProductResultResponse(
    @field:Json(name = "status")
    val status:Int,
    @field:Json(name = "product")
    val product:ProductResponse?
) {
    fun toModel() = ProductResult(
        status = status,
        product = product?.toModel()
    )
}
