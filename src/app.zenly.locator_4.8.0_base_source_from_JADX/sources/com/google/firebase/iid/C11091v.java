package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.C10454d;

/* renamed from: com.google.firebase.iid.v */
final class C11091v extends C10454d {

    /* renamed from: a */
    private final /* synthetic */ C11085s f28767a;

    C11091v(C11085s sVar, Looper looper) {
        this.f28767a = sVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.f28767a.m28526a(message);
    }
}
