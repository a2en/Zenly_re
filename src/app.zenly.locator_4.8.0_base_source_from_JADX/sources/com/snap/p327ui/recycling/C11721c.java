package com.snap.p327ui.recycling;

import android.view.View;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;

/* renamed from: com.snap.ui.recycling.c */
public abstract class C11721c<TData extends C11722a> {

    /* renamed from: a */
    private View f30376a;

    /* renamed from: b */
    private EventDispatcher f30377b;

    /* renamed from: c */
    private TData f30378c;

    /* renamed from: d */
    private final C12275b f30379d = new C12275b();

    /* renamed from: a */
    public final EventDispatcher mo34491a() {
        EventDispatcher eventDispatcher = this.f30377b;
        if (eventDispatcher != null) {
            return eventDispatcher;
        }
        C12932j.m33820c("_eventDispatcher");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6952a(TData tdata, TData tdata2);

    /* renamed from: b */
    public final View mo34493b() {
        View view = this.f30376a;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("_itemView");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6953b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final TData mo34494c() {
        TData tdata = this.f30378c;
        if (tdata != null) {
            return tdata;
        }
        C12932j.m33814a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo34495d() {
        return this.f30378c != null;
    }

    /* renamed from: e */
    public boolean mo34496e() {
        return false;
    }

    /* renamed from: f */
    public void mo6954f() {
        this.f30379d.mo36401a();
    }

    /* renamed from: a */
    public void mo34451a(View view) {
        C12932j.m33818b(view, "itemView");
        this.f30376a = view;
        mo6953b(view);
    }

    /* renamed from: a */
    public final void mo34492a(TData tdata, TData tdata2, EventDispatcher eventDispatcher) {
        C12932j.m33818b(tdata, "model");
        C12932j.m33818b(eventDispatcher, "eventDispatcher");
        this.f30377b = eventDispatcher;
        this.f30378c = tdata;
        mo6952a(tdata, tdata2);
    }
}
