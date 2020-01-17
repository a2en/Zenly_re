package com.evernote.android.job;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public interface JobCreator {

    public static abstract class AddJobCreatorReceiver extends BroadcastReceiver {
        /* access modifiers changed from: protected */
        public abstract void addJobCreator(Context context, C9447g gVar);

        public final void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                if ("com.evernote.android.job.ADD_JOB_CREATOR".equals(intent.getAction())) {
                    try {
                        addJobCreator(context, C9447g.m22878a(context));
                    } catch (JobManagerCreateException unused) {
                    }
                }
            }
        }
    }

    C9435b create(String str);
}
