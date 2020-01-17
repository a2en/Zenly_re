package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Creator<ClientIdentity> CREATOR = new C10130p();

    /* renamed from: e */
    private final int f26557e;

    /* renamed from: f */
    private final String f26558f;

    public ClientIdentity(int i, String str) {
        this.f26557e = i;
        this.f26558f = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f26557e == this.f26557e && C10120k.m25501a(clientIdentity.f26558f, this.f26558f);
        }
    }

    public int hashCode() {
        return this.f26557e;
    }

    public String toString() {
        int i = this.f26557e;
        String str = this.f26558f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26557e);
        C10134a.m25583a(parcel, 2, this.f26558f, false);
        C10134a.m25571a(parcel, a);
    }
}
