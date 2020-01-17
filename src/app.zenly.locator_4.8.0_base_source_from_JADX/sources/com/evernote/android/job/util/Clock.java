package com.evernote.android.job.util;

import android.os.SystemClock;

public interface Clock {

    /* renamed from: a */
    public static final Clock f24524a = new C9466a();

    /* renamed from: com.evernote.android.job.util.Clock$a */
    static class C9466a implements Clock {
        C9466a() {
        }

        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }

        public long elapsedRealtime() {
            return SystemClock.elapsedRealtime();
        }
    }

    long currentTimeMillis();

    long elapsedRealtime();
}
