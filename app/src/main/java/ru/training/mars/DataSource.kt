package ru.training.mars

import android.content.Context

class DataSource(val context: Context) {
    fun getPropertyList(): Array<String> {
        return context.resources.getStringArray(R.array.mars_property_array)
    }
}