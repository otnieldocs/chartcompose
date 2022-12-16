package com.otnieldocs.chartcompose

class NativeLib {

    /**
     * A native method that is implemented by the 'chartcompose' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'chartcompose' library on application startup.
        init {
            System.loadLibrary("chartcompose")
        }
    }
}