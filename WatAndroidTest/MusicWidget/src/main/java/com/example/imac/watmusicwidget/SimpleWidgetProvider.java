package com.example.imac.watmusicwidget;

/**
 * Created by imac on 9/29/16.
 */

//public class SimpleWidgetProvider extends AppWidgetProvider {
//
//    @Override
//    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
//        final int count = appWidgetIds.length;
//
//        for (int i = 0; i < count; i++) {
//            int widgetId = appWidgetIds[i];
//            String number = String.format("%03d", (new Random().nextInt(900) + 100));
//
//            RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
//                    R.layout.simple_widget);
//            remoteViews.setTextViewText(R.id.textView, number);
//
//            Intent intent = new Intent(context, SimpleWidgetProvider.class);
//            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
//            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);
//            PendingIntent pendingIntent = PendingIntent.getBroadcast(context,
//                    0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//            remoteViews.setOnClickPendingIntent(R.id.actionButton, pendingIntent);
//            appWidgetManager.updateAppWidget(widgetId, remoteViews);
//        }
//    }
//}