package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p309i.C10079b;

/* renamed from: com.google.android.gms.common.internal.l0 */
public final class C10124l0 {

    /* renamed from: a */
    private static Object f26636a = new Object();

    /* renamed from: b */
    private static boolean f26637b;

    /* renamed from: c */
    private static int f26638c;

    /* renamed from: a */
    public static int m25520a(Context context) {
        m25521b(context);
        return f26638c;
    }

    /* renamed from: b */
    private static void m25521b(Context context) {
        synchronized (f26636a) {
            if (!f26637b) {
                f26637b = true;
                try {
                    Bundle bundle = C10079b.m25337a(context).mo27331a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        f26638c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
