package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.j */
final class C11067j extends C11071l<Void> {
    C11067j(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32291a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo32298a(null);
        } else {
            mo32297a(new zzak(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32292a() {
        return true;
    }
}
