package com.apsforyou.azkarformoslim//package com.apsforyou.azkarformoslim
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.view.Gravity
//import io.flutter.plugin.common.MethodChannel
//import android.widget.Toast
//import androidx.annotation.NonNull
//import io.flutter.app.FlutterActivity
//import io.flutter.embedding.engine.FlutterEngine
//import io.flutter.plugins.GeneratedPluginRegistrant
//import kotlinx.android.synthetic.main.custom_toast_layout.view.*
//
//class AppActivity: FlutterActivity() {
//
//    private val CHANNEL = "ourproject.sendstring"
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        GeneratedPluginRegistrant.registerWi(this)
//
//        MethodChannel(this.flutterView, CHANNEL).setMethodCallHandler { call, result ->
//            if (call.method == "callSendStringFun") {
//                print("ifkghjkggt")
//                showHelloFromFlutter(call.argument("arg"))
////                val temp = sendString()
////                result.success(temp)
//            } else {
//                result.notImplemented()
//            }
//        }
//    }
//
//
//    @SuppressLint("InflateParams")
//    fun showHelloFromFlutter(argFromFlutter : String?) {
//        val toast = Toast(this)
//        toast.apply {
//
//            val layout = layoutInflater.inflate(R.layout.custom_toast_layout,null)
//
//            layout.textView.text = argFromFlutter
//            setGravity(Gravity.TOP, 0, 0)
//            duration = Toast.LENGTH_LONG
//            view = layout
//            show()
//        }
//    }
//}
