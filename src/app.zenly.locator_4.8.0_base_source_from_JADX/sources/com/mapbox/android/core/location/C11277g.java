package com.mapbox.android.core.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.mapbox.android.core.location.g */
public final class C11277g {

    /* renamed from: a */
    private final List<Location> f29116a;

    private C11277g(List<Location> list) {
        this.f29116a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static C11277g m28961a(Location location) {
        C11280i.m28974a(location, "location can't be null");
        ArrayList arrayList = new ArrayList();
        arrayList.add(location);
        return new C11277g(arrayList);
    }

    /* renamed from: c */
    public static C11277g m28964c(Intent intent) {
        C11277g b = C11280i.m28976a("com.google.android.gms.location.LocationResult") ? m28963b(intent) : null;
        return b == null ? m28960a(intent) : b;
    }

    /* renamed from: d */
    private static boolean m28965d(Intent intent) {
        return intent != null && intent.hasExtra("location");
    }

    /* renamed from: b */
    public List<Location> mo32715b() {
        return Collections.unmodifiableList(this.f29116a);
    }

    /* renamed from: b */
    private static C11277g m28963b(Intent intent) {
        LocationResult a = LocationResult.m26982a(intent);
        if (a != null) {
            return m28962a(a.mo28662b());
        }
        return null;
    }

    /* renamed from: a */
    public static C11277g m28962a(List<Location> list) {
        C11280i.m28974a(list, "locations can't be null");
        return new C11277g(list);
    }

    /* renamed from: a */
    public Location mo32714a() {
        if (this.f29116a.isEmpty()) {
            return null;
        }
        return (Location) this.f29116a.get(0);
    }

    /* renamed from: a */
    private static C11277g m28960a(Intent intent) {
        if (!m28965d(intent)) {
            return null;
        }
        return m28961a((Location) intent.getExtras().getParcelable("location"));
    }
}
