package com.snap.p327ui.recycling.p328d;

import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;

/* renamed from: com.snap.ui.recycling.d.b */
public class C11723b<D extends C11722a> extends C11724c<D> {

    /* renamed from: g */
    private final C11727c f30385g;

    /* renamed from: h */
    private final EventDispatcher f30386h;

    /* renamed from: i */
    private final int f30387i;

    /* renamed from: j */
    private final int f30388j;

    /* renamed from: k */
    private final int f30389k;

    public C11723b(AdapterViewType adapterViewType, C11727c cVar, EventDispatcher eventDispatcher, List<D> list, long j, int i, int i2, int i3) {
        super(list, adapterViewType, j);
        this.f30385g = cVar;
        this.f30387i = i;
        this.f30386h = eventDispatcher;
        this.f30388j = i2;
        this.f30389k = i3;
    }

    /* renamed from: g */
    public EventDispatcher mo34501g() {
        return this.f30386h;
    }

    /* renamed from: h */
    public int mo34502h() {
        return this.f30389k;
    }

    /* renamed from: i */
    public int mo34503i() {
        return this.f30388j;
    }

    /* renamed from: j */
    public int mo34504j() {
        return this.f30387i;
    }

    /* renamed from: k */
    public C11727c mo34505k() {
        return this.f30385g;
    }
}
