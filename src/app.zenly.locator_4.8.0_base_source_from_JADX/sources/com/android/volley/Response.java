package com.android.volley;

import com.android.volley.Cache.C8702a;

public class Response<T> {

    /* renamed from: a */
    public final T f22423a;

    /* renamed from: b */
    public final C8702a f22424b;

    /* renamed from: c */
    public final VolleyError f22425c;

    /* renamed from: d */
    public boolean f22426d;

    public interface ErrorListener {
        void onErrorResponse(VolleyError volleyError);
    }

    public interface Listener<T> {
        void onResponse(T t);
    }

    private Response(T t, C8702a aVar) {
        this.f22426d = false;
        this.f22423a = t;
        this.f22424b = aVar;
        this.f22425c = null;
    }

    /* renamed from: a */
    public static <T> Response<T> m20483a(T t, C8702a aVar) {
        return new Response<>(t, aVar);
    }

    /* renamed from: a */
    public static <T> Response<T> m20482a(VolleyError volleyError) {
        return new Response<>(volleyError);
    }

    /* renamed from: a */
    public boolean mo23554a() {
        return this.f22425c == null;
    }

    private Response(VolleyError volleyError) {
        this.f22426d = false;
        this.f22423a = null;
        this.f22424b = null;
        this.f22425c = volleyError;
    }
}
