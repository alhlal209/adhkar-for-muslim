package com.apsforyou.azkarformoslim
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant
import kotlinx.android.synthetic.main.custom_toast_layout.*
import kotlinx.android.synthetic.main.custom_toast_layout.view.*
import kotlinx.android.synthetic.main.custom_toast_layout.view.custom_toast_container



class MainActivity: FlutterActivity() {
    private val CHANNEL = "ourproject.sendstring"

    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler { call, result ->
            if (call.method == "callSendStringFun") {
                showHelloFromFlutter(call.argument("arg"))
//                val temp = sendString()
//                result.success(temp)
            } else {
                result.notImplemented()
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWit(this)
    }


    @SuppressLint("InflateParams")
    fun showHelloFromFlutter(argFromFlutter : String?) {
        val toast = Toast(this)
        toast.apply {
            val layout = layoutInflater.inflate(R.layout.custom_toast_layout,null)
            layout.textView.text = argFromFlutter
            setGravity(Gravity.TOP, 0, 0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}


