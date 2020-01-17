package com.android.volley;

/* renamed from: com.android.volley.b */
public class C8709b implements RetryPolicy {

    /* renamed from: a */
    private int f22439a;

    /* renamed from: b */
    private int f22440b;

    /* renamed from: c */
    private final int f22441c;

    /* renamed from: d */
    private final float f22442d;

    public C8709b() {
        this(2500, 1, 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23568a() {
        return this.f22440b <= this.f22441c;
    }

    public int getCurrentRetryCount() {
        return this.f22440b;
    }

    public int getCurrentTimeout() {
        return this.f22439a;
    }

    public void retry(VolleyError volleyError) throws VolleyError {
        this.f22440b++;
        int i = this.f22439a;
        this.f22439a = i + ((int) (((float) i) * this.f22442d));
        if (!mo23568a()) {
            throw volleyError;
        }
    }

    public C8709b(int i, int i2, float f) {
        this.f22439a = i;
        this.f22441c = i2;
        this.f22442d = f;
    }
}
