package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.greenrobot.eventbus.g */
final class C13380g {

    /* renamed from: d */
    private static final List<C13380g> f34724d = new ArrayList();

    /* renamed from: a */
    Object f34725a;

    /* renamed from: b */
    C13387m f34726b;

    /* renamed from: c */
    C13380g f34727c;

    private C13380g(Object obj, C13387m mVar) {
        this.f34725a = obj;
        this.f34726b = mVar;
    }

    /* renamed from: a */
    static C13380g m35461a(C13387m mVar, Object obj) {
        synchronized (f34724d) {
            int size = f34724d.size();
            if (size <= 0) {
                return new C13380g(obj, mVar);
            }
            C13380g gVar = (C13380g) f34724d.remove(size - 1);
            gVar.f34725a = obj;
            gVar.f34726b = mVar;
            gVar.f34727c = null;
            return gVar;
        }
    }

    /* renamed from: a */
    static void m35462a(C13380g gVar) {
        gVar.f34725a = null;
        gVar.f34726b = null;
        gVar.f34727c = null;
        synchronized (f34724d) {
            if (f34724d.size() < 10000) {
                f34724d.add(gVar);
            }
        }
    }
}
