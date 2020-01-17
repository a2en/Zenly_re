package com.mapbox.android.telemetry;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.mapbox.android.telemetry.n */
class C11379n<T> {

    /* renamed from: a */
    private final Queue<T> f29473a = new ConcurrentLinkedQueue();

    C11379n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33027a(T t) {
        try {
            return this.f29473a.add(t);
        } catch (Exception e) {
            Log.e("ConcurrentQueue", e.toString());
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33028b() {
        return this.f29473a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<T> mo33026a() {
        ArrayList arrayList = new ArrayList(this.f29473a.size());
        try {
            arrayList.addAll(this.f29473a);
            this.f29473a.clear();
        } catch (Exception e) {
            Log.e("ConcurrentQueue", e.toString());
        }
        return arrayList;
    }
}
