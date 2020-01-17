package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.n */
final class C11075n extends C11071l<Bundle> {
    C11075n(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32291a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo32298a(bundle2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32292a() {
        return false;
    }
}
