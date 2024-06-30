package com.bso.simplevolumecontrol

import android.app.Activity
import android.os.Bundle
import android.widget.Button


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        findViewById<Button>(R.id.exit_button).setOnClickListener {
            finish()
        }
    }
}