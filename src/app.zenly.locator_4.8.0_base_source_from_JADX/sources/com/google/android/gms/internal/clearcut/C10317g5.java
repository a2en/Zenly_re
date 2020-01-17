package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.g5 */
final class C10317g5 extends ContentObserver {
    C10317g5(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C10310f5.f26996e.set(true);
    }
}
