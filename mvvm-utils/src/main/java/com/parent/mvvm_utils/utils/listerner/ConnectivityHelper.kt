package com.parent.mvvm_utils.utils.listerner

import splitties.systemservices.connectivityManager

fun isConnected(): Boolean {
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo?.isConnected ?: false
}