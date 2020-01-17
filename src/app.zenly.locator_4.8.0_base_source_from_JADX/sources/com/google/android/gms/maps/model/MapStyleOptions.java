package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.util.C10171h;
import java.io.IOException;

public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Creator<MapStyleOptions> CREATOR = new C10655q();

    /* renamed from: e */
    private String f27652e;

    static {
        Class<MapStyleOptions> cls = MapStyleOptions.class;
    }

    public MapStyleOptions(String str) {
        this.f27652e = str;
    }

    /* renamed from: a */
    public static MapStyleOptions m27122a(Context context, int i) throws NotFoundException {
        try {
            return new MapStyleOptions(new String(C10171h.m25674a(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Failed to read resource ");
            sb.append(i);
            sb.append(": ");
            sb.append(valueOf);
            throw new NotFoundException(sb.toString());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 2, this.f27652e, false);
        C10134a.m25571a(parcel, a);
    }
}
