package com.google.firebase.components;

import com.google.android.gms.common.internal.C10123l;
import com.google.firebase.events.C11046a;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.m */
class C11042m implements Subscriber, Publisher {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> f28647a = new HashMap();

    /* renamed from: b */
    private Queue<C11046a<?>> f28648b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f28649c;

    C11042m(Executor executor) {
        this.f28649c = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C11041l.m28447a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m28448a(r4).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publish(com.google.firebase.events.C11046a<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C10123l.m25505a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.events.a<?>> r0 = r3.f28648b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.events.a<?>> r0 = r3.f28648b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m28448a(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C11041l.m28447a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C11042m.publish(com.google.firebase.events.a):void");
    }

    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        C10123l.m25505a(cls);
        C10123l.m25505a(eventHandler);
        C10123l.m25505a(executor);
        if (!this.f28647a.containsKey(cls)) {
            this.f28647a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f28647a.get(cls)).put(eventHandler, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void unsubscribe(java.lang.Class<T> r2, com.google.firebase.events.EventHandler<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.internal.C10123l.m25505a(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.common.internal.C10123l.m25505a(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f28647a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f28647a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f28647a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C11042m.unsubscribe(java.lang.Class, com.google.firebase.events.EventHandler):void");
    }

    /* renamed from: a */
    private synchronized Set<Entry<EventHandler<Object>, Executor>> m28448a(C11046a<?> aVar) {
        Map map;
        map = (Map) this.f28647a.get(aVar.mo32215a());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32209a() {
        Queue<C11046a> queue;
        synchronized (this) {
            if (this.f28648b != null) {
                queue = this.f28648b;
                this.f28648b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C11046a publish : queue) {
                publish(publish);
            }
        }
    }

    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.f28649c, eventHandler);
    }
}
