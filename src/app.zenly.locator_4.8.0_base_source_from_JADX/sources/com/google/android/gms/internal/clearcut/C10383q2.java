package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.q2 */
final class C10383q2 extends C10377p2<FieldDescriptorType, Object> {
    C10383q2(int i) {
        super(i, null);
    }

    /* renamed from: e */
    public final void mo28096e() {
        if (!mo28090a()) {
            for (int i = 0; i < mo28091b(); i++) {
                Entry a = mo28089a(i);
                if (((zzca) a.getKey()).zzaw()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Entry entry : mo28092c()) {
                if (((zzca) entry.getKey()).zzaw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo28096e();
    }
}
