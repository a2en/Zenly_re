package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.firebase.iid.l */
abstract class C11071l<T> {

    /* renamed from: a */
    final int f28715a;

    /* renamed from: b */
    final C10694d<T> f28716b = new C10694d<>();

    /* renamed from: c */
    final int f28717c;

    /* renamed from: d */
    final Bundle f28718d;

    C11071l(int i, int i2, Bundle bundle) {
        this.f28715a = i;
        this.f28717c = i2;
        this.f28718d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo32291a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32298a(T t) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.f28716b.mo29327a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo32292a();

    public String toString() {
        int i = this.f28717c;
        int i2 = this.f28715a;
        boolean a = mo32292a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32297a(zzak zzak) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzak);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.f28716b.mo29326a((Exception) zzak);
    }
}
