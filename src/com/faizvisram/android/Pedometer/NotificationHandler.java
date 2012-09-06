/**
 * 
 */
package com.faizvisram.android.Pedometer;

import android.app.NotificationManager;
import android.content.Context;

/**
 * @author Faiz
 *
 */
public class NotificationHandler {
	private static NotificationHandler mInstance;
	private Context mContext;
	private NotificationManager mNM;

	private NotificationHandler() {
		mInstance = this;

	}

	public NotificationHandler getInstance(Context context) {
		if (context != null)
			mContext = context;

		if (mInstance == null)
			mInstance = new NotificationHandler();

		return mInstance;
	}

	public void updateNotification() {

	}
}
