package com.bumptech.glide.manager;

import com.bumptech.glide.p301o.C9217k;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.a */
class C9181a implements Lifecycle {

    /* renamed from: a */
    private final Set<LifecycleListener> f23830a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f23831b;

    /* renamed from: c */
    private boolean f23832c;

    C9181a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24755a() {
        this.f23832c = true;
        for (LifecycleListener onDestroy : C9217k.m22098a((Collection<T>) this.f23830a)) {
            onDestroy.onDestroy();
        }
    }

    public void addListener(LifecycleListener lifecycleListener) {
        this.f23830a.add(lifecycleListener);
        if (this.f23832c) {
            lifecycleListener.onDestroy();
        } else if (this.f23831b) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24756b() {
        this.f23831b = true;
        for (LifecycleListener onStart : C9217k.m22098a((Collection<T>) this.f23830a)) {
            onStart.onStart();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo24757c() {
        this.f23831b = false;
        for (LifecycleListener onStop : C9217k.m22098a((Collection<T>) this.f23830a)) {
            onStop.onStop();
        }
    }

    public void removeListener(LifecycleListener lifecycleListener) {
        this.f23830a.remove(lifecycleListener);
    }
}
