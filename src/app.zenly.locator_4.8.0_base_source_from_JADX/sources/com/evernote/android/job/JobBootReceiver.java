package com.evernote.android.job;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class JobBootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            C9447g.m22878a(context);
        } catch (JobManagerCreateException unused) {
        }
    }
}
