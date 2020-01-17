package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements FieldConverter<String, Integer> {
    public static final Creator<StringToIntConverter> CREATOR = new C10156c();

    /* renamed from: e */
    private final int f26671e;

    /* renamed from: f */
    private final HashMap<String, Integer> f26672f;

    /* renamed from: g */
    private final SparseArray<String> f26673g;

    public static final class zaa extends AbstractSafeParcelable {
        public static final Creator<zaa> CREATOR = new C10155b();

        /* renamed from: e */
        private final int f26674e;

        /* renamed from: f */
        final String f26675f;

        /* renamed from: g */
        final int f26676g;

        zaa(int i, String str, int i2) {
            this.f26674e = i;
            this.f26675f = str;
            this.f26676g = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C10134a.m25570a(parcel);
            C10134a.m25575a(parcel, 1, this.f26674e);
            C10134a.m25583a(parcel, 2, this.f26675f, false);
            C10134a.m25575a(parcel, 3, this.f26676g);
            C10134a.m25571a(parcel, a);
        }

        zaa(String str, int i) {
            this.f26674e = 1;
            this.f26675f = str;
            this.f26676g = i;
        }
    }

    StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.f26671e = i;
        this.f26672f = new HashMap<>();
        this.f26673g = new SparseArray<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zaa zaa2 = (zaa) obj;
            mo27532a(zaa2.f26675f, zaa2.f26676g);
        }
    }

    /* renamed from: a */
    public final StringToIntConverter mo27532a(String str, int i) {
        this.f26672f.put(str, Integer.valueOf(i));
        this.f26673g.put(i, str);
        return this;
    }

    public final /* synthetic */ Object convert(Object obj) {
        Integer num = (Integer) this.f26672f.get((String) obj);
        return num == null ? (Integer) this.f26672f.get("gms_unknown") : num;
    }

    public final /* synthetic */ Object convertBack(Object obj) {
        String str = (String) this.f26673g.get(((Integer) obj).intValue());
        if (str == null) {
            String str2 = "gms_unknown";
            if (this.f26672f.containsKey(str2)) {
                return str2;
            }
        }
        return str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26671e);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f26672f.keySet()) {
            arrayList.add(new zaa(str, ((Integer) this.f26672f.get(str)).intValue()));
        }
        C10134a.m25597c(parcel, 2, arrayList, false);
        C10134a.m25571a(parcel, a);
    }

    public final int zach() {
        return 7;
    }

    public final int zaci() {
        return 0;
    }

    public StringToIntConverter() {
        this.f26671e = 1;
        this.f26672f = new HashMap<>();
        this.f26673g = new SparseArray<>();
    }
}
