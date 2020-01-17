package com.bumptech.glide.manager;

import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.target.Target;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.j */
public final class C9193j implements LifecycleListener {

    /* renamed from: e */
    private final Set<Target<?>> f23856e = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void mo24789a(Target<?> target) {
        this.f23856e.add(target);
    }

    /* renamed from: b */
    public void mo24791b(Target<?> target) {
        this.f23856e.remove(target);
    }

    public void onDestroy() {
        for (Target onDestroy : C9217k.m22098a((Collection<T>) this.f23856e)) {
            onDestroy.onDestroy();
        }
    }

    public void onStart() {
        for (Target onStart : C9217k.m22098a((Collection<T>) this.f23856e)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        for (Target onStop : C9217k.m22098a((Collection<T>) this.f23856e)) {
            onStop.onStop();
        }
    }

    /* renamed from: a */
    public void mo24788a() {
        this.f23856e.clear();
    }

    /* renamed from: b */
    public List<Target<?>> mo24790b() {
        return C9217k.m22098a((Collection<T>) this.f23856e);
    }
}
