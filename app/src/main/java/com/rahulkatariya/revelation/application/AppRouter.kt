package com.rahulkatariya.revelation.application

import com.rahulkatariya.revelation.external.AppRoutable

class AppRouter: AppRoutable {
    override fun rootActivity(): Class<*> {
        return AppActivity::class.java
    }
}
