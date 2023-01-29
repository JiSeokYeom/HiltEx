package com.example.flowex.data


data class Data(val data: List<ImageList>)
data class ImageList(val images: Images)
data class Images(val fixed_height: FixedHeight)
data class FixedHeight(val url: String)