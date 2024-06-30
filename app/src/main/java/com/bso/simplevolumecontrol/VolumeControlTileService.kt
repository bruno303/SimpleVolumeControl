package com.bso.simplevolumecontrol

import android.graphics.drawable.Icon
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService


class VolumeControlTileService : TileService() {

    override fun onTileAdded() {
        super.onTileAdded()
        qsTile.state = Tile.STATE_INACTIVE
        qsTile.updateTile()
    }

    override fun onStartListening() {
        super.onStartListening()
        qsTile.icon = Icon.createWithResource(this, R.drawable.ic_action)
        qsTile.label = getString(R.string.qs_label)
        qsTile.state = Tile.STATE_INACTIVE
        qsTile.updateTile()
    }

    override fun onClick() {
        super.onClick()
        SimpleVolumeControl.openVolumePanel(this)
    }
}