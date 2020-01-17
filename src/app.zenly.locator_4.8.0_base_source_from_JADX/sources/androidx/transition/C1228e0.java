package androidx.transition;

import android.os.IBinder;

/* renamed from: androidx.transition.e0 */
class C1228e0 implements C1232g0 {

    /* renamed from: a */
    private final IBinder f4624a;

    C1228e0(IBinder iBinder) {
        this.f4624a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1228e0) && ((C1228e0) obj).f4624a.equals(this.f4624a);
    }

    public int hashCode() {
        return this.f4624a.hashCode();
    }
}
