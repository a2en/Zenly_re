package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class C0088b {

    /* renamed from: a */
    private boolean f145a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0087a> f146b = new CopyOnWriteArrayList<>();

    public C0088b(boolean z) {
        this.f145a = z;
    }

    /* renamed from: a */
    public abstract void mo285a();

    /* renamed from: a */
    public final void mo287a(boolean z) {
        this.f145a = z;
    }

    /* renamed from: b */
    public final boolean mo289b() {
        return this.f145a;
    }

    /* renamed from: c */
    public final void mo290c() {
        Iterator it = this.f146b.iterator();
        while (it.hasNext()) {
            ((C0087a) it.next()).cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo286a(C0087a aVar) {
        this.f146b.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo288b(C0087a aVar) {
        this.f146b.remove(aVar);
    }
}
