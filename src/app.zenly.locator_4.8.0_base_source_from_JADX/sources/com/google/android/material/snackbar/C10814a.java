package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.a */
class C10814a {

    /* renamed from: e */
    private static C10814a f28258e;

    /* renamed from: a */
    private final Object f28259a = new Object();

    /* renamed from: b */
    private final Handler f28260b = new Handler(Looper.getMainLooper(), new C10815a());

    /* renamed from: c */
    private C10817c f28261c;

    /* renamed from: d */
    private C10817c f28262d;

    /* renamed from: com.google.android.material.snackbar.a$a */
    class C10815a implements Callback {
        C10815a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C10814a.this.mo31314a((C10817c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    interface C10816b {
        /* renamed from: a */
        void mo31284a(int i);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    private static class C10817c {

        /* renamed from: a */
        final WeakReference<C10816b> f28264a;

        /* renamed from: b */
        int f28265b;

        /* renamed from: c */
        boolean f28266c;

        C10817c(int i, C10816b bVar) {
            this.f28264a = new WeakReference<>(bVar);
            this.f28265b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31321a(C10816b bVar) {
            return bVar != null && this.f28264a.get() == bVar;
        }
    }

    private C10814a() {
    }

    /* renamed from: a */
    static C10814a m27838a() {
        if (f28258e == null) {
            f28258e = new C10814a();
        }
        return f28258e;
    }

    /* renamed from: f */
    private boolean m27842f(C10816b bVar) {
        C10817c cVar = this.f28261c;
        return cVar != null && cVar.mo31321a(bVar);
    }

    /* renamed from: g */
    private boolean m27843g(C10816b bVar) {
        C10817c cVar = this.f28262d;
        return cVar != null && cVar.mo31321a(bVar);
    }

    /* renamed from: b */
    public void mo31316b(C10816b bVar) {
        synchronized (this.f28259a) {
            if (m27842f(bVar)) {
                this.f28261c = null;
                if (this.f28262d != null) {
                    m27840b();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo31317c(C10816b bVar) {
        synchronized (this.f28259a) {
            if (m27842f(bVar)) {
                m27841b(this.f28261c);
            }
        }
    }

    /* renamed from: d */
    public void mo31318d(C10816b bVar) {
        synchronized (this.f28259a) {
            if (m27842f(bVar) && !this.f28261c.f28266c) {
                this.f28261c.f28266c = true;
                this.f28260b.removeCallbacksAndMessages(this.f28261c);
            }
        }
    }

    /* renamed from: e */
    public void mo31319e(C10816b bVar) {
        synchronized (this.f28259a) {
            if (m27842f(bVar) && this.f28261c.f28266c) {
                this.f28261c.f28266c = false;
                m27841b(this.f28261c);
            }
        }
    }

    /* renamed from: a */
    public void mo31312a(int i, C10816b bVar) {
        synchronized (this.f28259a) {
            if (m27842f(bVar)) {
                this.f28261c.f28265b = i;
                this.f28260b.removeCallbacksAndMessages(this.f28261c);
                m27841b(this.f28261c);
                return;
            }
            if (m27843g(bVar)) {
                this.f28262d.f28265b = i;
            } else {
                this.f28262d = new C10817c(i, bVar);
            }
            if (this.f28261c == null || !m27839a(this.f28261c, 4)) {
                this.f28261c = null;
                m27840b();
            }
        }
    }

    /* renamed from: b */
    private void m27840b() {
        C10817c cVar = this.f28262d;
        if (cVar != null) {
            this.f28261c = cVar;
            this.f28262d = null;
            C10816b bVar = (C10816b) this.f28261c.f28264a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f28261c = null;
            }
        }
    }

    /* renamed from: b */
    private void m27841b(C10817c cVar) {
        int i = cVar.f28265b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
            }
            this.f28260b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f28260b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: a */
    public void mo31313a(C10816b bVar, int i) {
        synchronized (this.f28259a) {
            if (m27842f(bVar)) {
                m27839a(this.f28261c, i);
            } else if (m27843g(bVar)) {
                m27839a(this.f28262d, i);
            }
        }
    }

    /* renamed from: a */
    public boolean mo31315a(C10816b bVar) {
        boolean z;
        synchronized (this.f28259a) {
            if (!m27842f(bVar)) {
                if (!m27843g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m27839a(C10817c cVar, int i) {
        C10816b bVar = (C10816b) cVar.f28264a.get();
        if (bVar == null) {
            return false;
        }
        this.f28260b.removeCallbacksAndMessages(cVar);
        bVar.mo31284a(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31314a(C10817c cVar) {
        synchronized (this.f28259a) {
            if (this.f28261c == cVar || this.f28262d == cVar) {
                m27839a(cVar, 2);
            }
        }
    }
}
