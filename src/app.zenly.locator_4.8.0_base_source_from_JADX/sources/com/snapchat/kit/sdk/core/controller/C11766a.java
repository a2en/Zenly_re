package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStartListener;
import com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

/* renamed from: com.snapchat.kit.sdk.core.controller.a */
public class C11766a implements LoginStateController {

    /* renamed from: a */
    private final WeakHashMap<OnLoginStateChangedListener, Void> f30502a = new WeakHashMap<>();

    /* renamed from: b */
    private final WeakHashMap<OnLoginStartListener, Void> f30503b = new WeakHashMap<>();

    /* renamed from: c */
    private final Handler f30504c;

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$a */
    class C11767a implements Runnable {
        C11767a() {
        }

        public void run() {
            for (OnLoginStateChangedListener onLogout : C11766a.this.m30916e()) {
                onLogout.onLogout();
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$b */
    class C11768b implements Runnable {
        C11768b() {
        }

        public void run() {
            for (OnLoginStateChangedListener onLoginSucceeded : C11766a.this.m30916e()) {
                onLoginSucceeded.onLoginSucceeded();
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$c */
    class C11769c implements Runnable {
        C11769c() {
        }

        public void run() {
            for (OnLoginStateChangedListener onLoginFailed : C11766a.this.m30916e()) {
                onLoginFailed.onLoginFailed();
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.controller.a$d */
    class C11770d implements Runnable {
        C11770d() {
        }

        public void run() {
            for (OnLoginStartListener onLoginStart : C11766a.this.m30917f()) {
                onLoginStart.onLoginStart();
            }
        }
    }

    C11766a(Handler handler) {
        this.f30504c = handler;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Collection<OnLoginStateChangedListener> m30916e() {
        return new ArrayList(this.f30502a.keySet());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Collection<OnLoginStartListener> m30917f() {
        return new ArrayList(this.f30503b.keySet());
    }

    public void addOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f30503b.put(onLoginStartListener, null);
    }

    public void addOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f30502a.put(onLoginStateChangedListener, null);
    }

    /* renamed from: c */
    public void mo34626c() {
        this.f30504c.post(new C11769c());
    }

    /* renamed from: d */
    public void mo34627d() {
        this.f30504c.post(new C11770d());
    }

    public void removeOnLoginStartListener(OnLoginStartListener onLoginStartListener) {
        this.f30503b.remove(onLoginStartListener);
    }

    public void removeOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f30502a.remove(onLoginStateChangedListener);
    }

    /* renamed from: a */
    public void mo34624a() {
        this.f30504c.post(new C11767a());
    }

    /* renamed from: b */
    public void mo34625b() {
        this.f30504c.post(new C11768b());
    }
}
