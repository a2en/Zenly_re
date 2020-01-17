package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: a */
    public Object mo27548a(String str) {
        return null;
    }

    /* renamed from: b */
    public boolean mo27551b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (Field field : mo27549a().values()) {
            if (mo27550b(field)) {
                if (!fastJsonResponse.mo27550b(field) || !mo27547a(field).equals(fastJsonResponse.mo27547a(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo27550b(field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (Field field : mo27549a().values()) {
            if (mo27550b(field)) {
                i = (i * 31) + mo27547a(field).hashCode();
            }
        }
        return i;
    }
}
