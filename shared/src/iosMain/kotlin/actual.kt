package com.bitapps.imageboard

import platform.UIKit.UIDevice

actual fun platformName(): String {
    return ""
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}