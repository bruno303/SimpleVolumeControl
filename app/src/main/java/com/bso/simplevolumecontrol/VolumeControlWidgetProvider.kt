package com.bso.simplevolumecontrol

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews


class VolumeControlWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)

        for (appWidgetId in appWidgetIds) {
            val intent = Intent(context, VolumeControlWidgetProvider::class.java)
            intent.setAction("OPEN_VOLUME_PANEL")
            val pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_IMMUTABLE)

            val views = RemoteViews(context.packageName, R.layout.widget)
            views.setOnClickPendingIntent(R.id.widget_icon, pendingIntent)

            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent);
        if ("OPEN_VOLUME_PANEL" == intent.action) {
            SimpleVolumeControl.openVolumePanel(context);
        }
    }
}