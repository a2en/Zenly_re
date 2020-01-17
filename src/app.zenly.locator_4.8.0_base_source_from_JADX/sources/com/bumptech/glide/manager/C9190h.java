package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.Request;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.h */
public class C9190h {

    /* renamed from: a */
    private final Set<Request> f23846a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<Request> f23847b = new ArrayList();

    /* renamed from: c */
    private boolean f23848c;

    /* renamed from: a */
    public boolean mo24774a(Request request) {
        boolean z = true;
        if (request == null) {
            return true;
        }
        boolean remove = this.f23846a.remove(request);
        if (!this.f23847b.remove(request) && !remove) {
            z = false;
        }
        if (z) {
            request.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo24776b(Request request) {
        this.f23846a.add(request);
        if (!this.f23848c) {
            request.begin();
            return;
        }
        request.clear();
        String str = "RequestTracker";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Paused, delaying request");
        }
        this.f23847b.add(request);
    }

    /* renamed from: c */
    public void mo24777c() {
        this.f23848c = true;
        for (Request request : C9217k.m22098a((Collection<T>) this.f23846a)) {
            if (request.isRunning()) {
                request.pause();
                this.f23847b.add(request);
            }
        }
    }

    /* renamed from: d */
    public void mo24778d() {
        for (Request request : C9217k.m22098a((Collection<T>) this.f23846a)) {
            if (!request.isComplete() && !request.isCleared()) {
                request.clear();
                if (!this.f23848c) {
                    request.begin();
                } else {
                    this.f23847b.add(request);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo24779e() {
        this.f23848c = false;
        for (Request request : C9217k.m22098a((Collection<T>) this.f23846a)) {
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        this.f23847b.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f23846a.size());
        sb.append(", isPaused=");
        sb.append(this.f23848c);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo24773a() {
        for (Request a : C9217k.m22098a((Collection<T>) this.f23846a)) {
            mo24774a(a);
        }
        this.f23847b.clear();
    }

    /* renamed from: b */
    public void mo24775b() {
        this.f23848c = true;
        for (Request request : C9217k.m22098a((Collection<T>) this.f23846a)) {
            if (request.isRunning() || request.isComplete()) {
                request.clear();
                this.f23847b.add(request);
            }
        }
    }
}
