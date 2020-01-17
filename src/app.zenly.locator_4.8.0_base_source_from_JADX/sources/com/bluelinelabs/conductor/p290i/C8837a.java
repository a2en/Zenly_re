package com.bluelinelabs.conductor.p290i;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0869k;
import androidx.lifecycle.LifecycleOwner;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8819d.C8827h;

/* renamed from: com.bluelinelabs.conductor.i.a */
public class C8837a implements LifecycleOwner {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0869k f22946e;

    /* renamed from: com.bluelinelabs.conductor.i.a$a */
    class C8838a extends C8827h {
        C8838a() {
        }

        /* renamed from: a */
        public void mo23962a(C8819d dVar, Context context) {
            C8837a.this.f22946e.mo4450a(C0863a.ON_CREATE);
        }

        /* renamed from: b */
        public void mo23964b(C8819d dVar, Context context) {
        }

        /* renamed from: b */
        public void mo9319b(C8819d dVar, View view) {
            C8837a.this.f22946e.mo4450a(C0863a.ON_START);
        }

        /* renamed from: e */
        public void mo23974e(C8819d dVar, View view) {
            C8837a.this.f22946e.mo4450a(C0863a.ON_STOP);
        }

        /* renamed from: f */
        public void mo23976f(C8819d dVar, View view) {
            C8837a.this.f22946e.mo4450a(C0863a.ON_PAUSE);
        }

        /* renamed from: a */
        public void mo9317a(C8819d dVar, View view) {
            C8837a.this.f22946e.mo4450a(C0863a.ON_RESUME);
        }

        /* renamed from: f */
        public void mo23975f(C8819d dVar) {
            C8837a.this.f22946e.mo4450a(C0863a.ON_DESTROY);
        }
    }

    public <T extends C8819d & LifecycleOwner> C8837a(T t) {
        this.f22946e = new C0869k((LifecycleOwner) t);
        t.mo23911a((C8827h) new C8838a());
    }

    public C0862g getLifecycle() {
        return this.f22946e;
    }
}
