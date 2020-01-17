package com.android.volley.toolbox;

import com.android.volley.C8713d;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.volley.toolbox.h */
public final class C8731h {

    /* renamed from: a */
    private final int f22496a;

    /* renamed from: b */
    private final List<C8713d> f22497b;

    /* renamed from: c */
    private final int f22498c;

    /* renamed from: d */
    private final InputStream f22499d;

    public C8731h(int i, List<C8713d> list) {
        this(i, list, -1, null);
    }

    /* renamed from: a */
    public final InputStream mo23606a() {
        return this.f22499d;
    }

    /* renamed from: b */
    public final int mo23607b() {
        return this.f22498c;
    }

    /* renamed from: c */
    public final List<C8713d> mo23608c() {
        return Collections.unmodifiableList(this.f22497b);
    }

    /* renamed from: d */
    public final int mo23609d() {
        return this.f22496a;
    }

    public C8731h(int i, List<C8713d> list, int i2, InputStream inputStream) {
        this.f22496a = i;
        this.f22497b = list;
        this.f22498c = i2;
        this.f22499d = inputStream;
    }
}
