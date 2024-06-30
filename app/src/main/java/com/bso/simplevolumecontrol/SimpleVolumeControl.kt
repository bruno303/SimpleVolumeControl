package com.bso.simplevolumecontrol

import android.content.Context
import android.media.AudioManager

object SimpleVolumeControl {
    fun openVolumePanel(context: Context) {
        (context.getSystemService(Context.AUDIO_SERVICE) as AudioManager)
            .adjustVolume(AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI)
    }
}