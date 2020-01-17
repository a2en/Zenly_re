package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.platforminfo.d */
public class C11113d {

    /* renamed from: b */
    private static volatile C11113d f28807b;

    /* renamed from: a */
    private final Set<C11114e> f28808a = new HashSet();

    C11113d() {
    }

    /* renamed from: b */
    public static C11113d m28619b() {
        C11113d dVar = f28807b;
        if (dVar == null) {
            synchronized (C11113d.class) {
                dVar = f28807b;
                if (dVar == null) {
                    dVar = new C11113d();
                    f28807b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Set<C11114e> mo32365a() {
        Set<C11114e> unmodifiableSet;
        synchronized (this.f28808a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f28808a);
        }
        return unmodifiableSet;
    }
}
