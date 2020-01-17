package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.api.internal.f */
public class C10023f {
    /* renamed from: a */
    public static <L> ListenerHolder<L> m25202a(L l, Looper looper, String str) {
        C10123l.m25506a(l, (Object) "Listener must not be null");
        C10123l.m25506a(looper, (Object) "Looper must not be null");
        C10123l.m25506a(str, (Object) "Listener type must not be null");
        return new ListenerHolder<>(looper, l, str);
    }

    /* renamed from: a */
    public static <L> C10006a<L> m25201a(L l, String str) {
        C10123l.m25506a(l, (Object) "Listener must not be null");
        C10123l.m25506a(str, (Object) "Listener type must not be null");
        C10123l.m25507a(str, (Object) "Listener type must not be empty");
        return new C10006a<>(l, str);
    }
}
