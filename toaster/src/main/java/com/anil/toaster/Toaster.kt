package com.anil.toaster

import android.content.Context
import android.widget.Toast

object Toaster {

    fun simpleLongToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun simpleShortToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}