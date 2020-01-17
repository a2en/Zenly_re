package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.squareup.picasso.w */
class C11896w {

    /* renamed from: a */
    final HandlerThread f30859a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b */
    final Cache f30860b;

    /* renamed from: c */
    final Handler f30861c;

    /* renamed from: d */
    long f30862d;

    /* renamed from: e */
    long f30863e;

    /* renamed from: f */
    long f30864f;

    /* renamed from: g */
    long f30865g;

    /* renamed from: h */
    long f30866h;

    /* renamed from: i */
    long f30867i;

    /* renamed from: j */
    long f30868j;

    /* renamed from: k */
    long f30869k;

    /* renamed from: l */
    int f30870l;

    /* renamed from: m */
    int f30871m;

    /* renamed from: n */
    int f30872n;

    /* renamed from: com.squareup.picasso.w$a */
    private static class C11897a extends Handler {

        /* renamed from: a */
        private final C11896w f30873a;

        /* renamed from: com.squareup.picasso.w$a$a */
        class C11898a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Message f30874e;

            C11898a(C11897a aVar, Message message) {
                this.f30874e = message;
            }

            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("Unhandled stats message.");
                sb.append(this.f30874e.what);
                throw new AssertionError(sb.toString());
            }
        }

        public C11897a(Looper looper, C11896w wVar) {
            super(looper);
            this.f30873a = wVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f30873a.mo35178d();
            } else if (i == 1) {
                this.f30873a.mo35179e();
            } else if (i == 2) {
                this.f30873a.mo35174b((long) message.arg1);
            } else if (i == 3) {
                this.f30873a.mo35177c((long) message.arg1);
            } else if (i != 4) {
                Picasso.f30656p.post(new C11898a(this, message));
            } else {
                this.f30873a.mo35172a((Long) message.obj);
            }
        }
    }

    C11896w(Cache cache) {
        this.f30860b = cache;
        this.f30859a.start();
        C11851a0.m31110a(this.f30859a.getLooper());
        this.f30861c = new C11897a(this.f30859a.getLooper(), this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35171a(Bitmap bitmap) {
        m31262a(bitmap, 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35175b(Bitmap bitmap) {
        m31262a(bitmap, 3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo35176c() {
        this.f30861c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo35178d() {
        this.f30862d++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo35179e() {
        this.f30863e++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35170a(long j) {
        Handler handler = this.f30861c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35173b() {
        this.f30861c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo35177c(long j) {
        this.f30872n++;
        this.f30866h += j;
        this.f30869k = m31261a(this.f30871m, this.f30866h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35172a(Long l) {
        this.f30870l++;
        this.f30864f += l.longValue();
        this.f30867i = m31261a(this.f30870l, this.f30864f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35174b(long j) {
        this.f30871m++;
        this.f30865g += j;
        this.f30868j = m31261a(this.f30871m, this.f30865g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11899x mo35169a() {
        C11899x xVar = new C11899x(this.f30860b.maxSize(), this.f30860b.size(), this.f30862d, this.f30863e, this.f30864f, this.f30865g, this.f30866h, this.f30867i, this.f30868j, this.f30869k, this.f30870l, this.f30871m, this.f30872n, System.currentTimeMillis());
        return xVar;
    }

    /* renamed from: a */
    private void m31262a(Bitmap bitmap, int i) {
        int a = C11851a0.m31100a(bitmap);
        Handler handler = this.f30861c;
        handler.sendMessage(handler.obtainMessage(i, a, 0));
    }

    /* renamed from: a */
    private static long m31261a(int i, long j) {
        return j / ((long) i);
    }
}
