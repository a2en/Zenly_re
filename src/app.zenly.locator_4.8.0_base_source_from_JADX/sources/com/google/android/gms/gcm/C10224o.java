package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.os.Trace;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.iid.C10230f;
import com.google.android.gms.iid.zzaj;
import java.io.Closeable;

/* renamed from: com.google.android.gms.gcm.o */
public final class C10224o implements Closeable {

    /* renamed from: f */
    private static final zzaj<Boolean> f26826f = C10230f.m25856a().mo27736a("nts.enable_tracing", true);

    /* renamed from: e */
    private final boolean f26827e;

    @TargetApi(18)
    public C10224o(String str) {
        this.f26827e = C10174k.m25681d() && ((Boolean) f26826f.get()).booleanValue();
        if (this.f26827e) {
            if (str.length() > 127) {
                str = str.substring(0, 127);
            }
            Trace.beginSection(str);
        }
    }

    @TargetApi(18)
    public final void close() {
        if (this.f26827e) {
            Trace.endSection();
        }
    }
}
