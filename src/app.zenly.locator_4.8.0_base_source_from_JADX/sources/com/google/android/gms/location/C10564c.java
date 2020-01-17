package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.c */
public class C10564c {

    /* renamed from: a */
    private final int f27530a;

    /* renamed from: b */
    private final int f27531b;

    /* renamed from: c */
    private final List<Geofence> f27532c;

    private C10564c(int i, int i2, List<Geofence> list, Location location) {
        this.f27530a = i;
        this.f27531b = i2;
        this.f27532c = list;
    }

    /* renamed from: a */
    public static C10564c m27009a(Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                arrayList.add(zzbh.m26934a((byte[]) obj));
            }
        }
        return new C10564c(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: a */
    public int mo28691a() {
        return this.f27530a;
    }

    /* renamed from: b */
    public int mo28692b() {
        return this.f27531b;
    }

    /* renamed from: c */
    public List<Geofence> mo28693c() {
        return this.f27532c;
    }

    /* renamed from: d */
    public boolean mo28694d() {
        return this.f27530a != -1;
    }
}
