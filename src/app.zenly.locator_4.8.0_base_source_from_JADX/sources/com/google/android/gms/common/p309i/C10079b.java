package com.google.android.gms.common.p309i;

import android.content.Context;

/* renamed from: com.google.android.gms.common.i.b */
public class C10079b {

    /* renamed from: b */
    private static C10079b f26480b = new C10079b();

    /* renamed from: a */
    private C10078a f26481a = null;

    /* renamed from: a */
    public static C10078a m25337a(Context context) {
        return f26480b.m25338b(context);
    }

    /* renamed from: b */
    private final synchronized C10078a m25338b(Context context) {
        if (this.f26481a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f26481a = new C10078a(context);
        }
        return this.f26481a;
    }
}
