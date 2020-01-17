package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.p301o.C9216j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.cache.b */
final class C8943b {

    /* renamed from: a */
    private final Map<String, C8944a> f23300a = new HashMap();

    /* renamed from: b */
    private final C8945b f23301b = new C8945b();

    /* renamed from: com.bumptech.glide.load.engine.cache.b$a */
    private static class C8944a {

        /* renamed from: a */
        final Lock f23302a = new ReentrantLock();

        /* renamed from: b */
        int f23303b;

        C8944a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.b$b */
    private static class C8945b {

        /* renamed from: a */
        private final Queue<C8944a> f23304a = new ArrayDeque();

        C8945b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8944a mo24382a() {
            C8944a aVar;
            synchronized (this.f23304a) {
                aVar = (C8944a) this.f23304a.poll();
            }
            return aVar == null ? new C8944a() : aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24383a(C8944a aVar) {
            synchronized (this.f23304a) {
                if (this.f23304a.size() < 10) {
                    this.f23304a.offer(aVar);
                }
            }
        }
    }

    C8943b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24380a(String str) {
        C8944a aVar;
        synchronized (this) {
            aVar = (C8944a) this.f23300a.get(str);
            if (aVar == null) {
                aVar = this.f23301b.mo24382a();
                this.f23300a.put(str, aVar);
            }
            aVar.f23303b++;
        }
        aVar.f23302a.lock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24381b(String str) {
        C8944a aVar;
        synchronized (this) {
            Object obj = this.f23300a.get(str);
            C9216j.m22083a(obj);
            aVar = (C8944a) obj;
            if (aVar.f23303b >= 1) {
                aVar.f23303b--;
                if (aVar.f23303b == 0) {
                    C8944a aVar2 = (C8944a) this.f23300a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f23301b.mo24383a(aVar2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(aVar);
                        sb.append(", but actually removed: ");
                        sb.append(aVar2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(aVar.f23303b);
                throw new IllegalStateException(sb2.toString());
            }
        }
        aVar.f23302a.unlock();
    }
}
