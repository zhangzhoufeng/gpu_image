//package com.gstory.gpu_image.camera
//
//import android.app.Activity
//import android.content.Context
//import android.os.Build
//import androidx.annotation.RequiresApi
//import io.flutter.plugin.common.BinaryMessenger
//import io.flutter.plugin.common.StandardMessageCodec
//import io.flutter.plugin.platform.PlatformView
//import io.flutter.plugin.platform.PlatformViewFactory
//
///**
// * @Author: gstory
// * @CreateDate: 2022/1/20 10:02 上午
// * @Description: 描述
// */
//
//internal class CameraFactory (private val messenger: BinaryMessenger, private val activity: Activity) : PlatformViewFactory(
//    StandardMessageCodec.INSTANCE) {
//
//    override fun create(context: Context?, viewId: Int, args: Any?): PlatformView {
//        val params = args as Map<String?, Any?>
//        return CameraView(context!!, activity,messenger, viewId, params)
//    }
//}