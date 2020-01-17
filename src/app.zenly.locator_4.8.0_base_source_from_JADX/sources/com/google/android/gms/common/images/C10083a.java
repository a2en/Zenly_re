package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C10120k;

/* renamed from: com.google.android.gms.common.images.a */
final class C10083a {

    /* renamed from: a */
    public final Uri f26507a;

    public C10083a(Uri uri) {
        this.f26507a = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10083a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C10120k.m25501a(((C10083a) obj).f26507a, this.f26507a);
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f26507a);
    }
}
