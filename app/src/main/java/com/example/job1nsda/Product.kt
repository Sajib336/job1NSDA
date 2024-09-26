package com.example.job1nsda

import android.provider.MediaStore.Images

data class Product(
    val images:List<String>,
    val title:String,
    val price:Double
)
