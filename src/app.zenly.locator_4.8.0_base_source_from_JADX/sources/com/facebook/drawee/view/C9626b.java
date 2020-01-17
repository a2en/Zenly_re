package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import com.facebook.drawee.components.C9586a;
import com.facebook.drawee.components.C9586a.C9587a;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;

/* renamed from: com.facebook.drawee.view.b */
public class C9626b<DH extends DraweeHierarchy> implements VisibilityCallback {

    /* renamed from: a */
    private boolean f25083a = false;

    /* renamed from: b */
    private boolean f25084b = false;

    /* renamed from: c */
    private boolean f25085c = true;

    /* renamed from: d */
    private DH f25086d;

    /* renamed from: e */
    private DraweeController f25087e = null;

    /* renamed from: f */
    private final C9586a f25088f = C9586a.m23498a();

    public C9626b(DH dh) {
        if (dh != null) {
            mo26077a(dh);
        }
    }

    /* renamed from: a */
    public static <DH extends DraweeHierarchy> C9626b<DH> m23645a(DH dh, Context context) {
        C9626b<DH> bVar = new C9626b<>(dh);
        bVar.mo26075a(context);
        return bVar;
    }

    /* renamed from: g */
    private void m23647g() {
        if (!this.f25083a) {
            this.f25088f.mo25834a(C9587a.ON_ATTACH_CONTROLLER);
            this.f25083a = true;
            DraweeController draweeController = this.f25087e;
            if (!(draweeController == null || draweeController.getHierarchy() == null)) {
                this.f25087e.onAttach();
            }
        }
    }

    /* renamed from: h */
    private void m23648h() {
        if (!this.f25084b || !this.f25085c) {
            m23649i();
        } else {
            m23647g();
        }
    }

    /* renamed from: i */
    private void m23649i() {
        if (this.f25083a) {
            this.f25088f.mo25834a(C9587a.ON_DETACH_CONTROLLER);
            this.f25083a = false;
            if (mo26081d()) {
                this.f25087e.onDetach();
            }
        }
    }

    /* renamed from: a */
    public void mo26075a(Context context) {
    }

    /* renamed from: b */
    public DH mo26079b() {
        DH dh = this.f25086d;
        C9536j.m23271a(dh);
        return (DraweeHierarchy) dh;
    }

    /* renamed from: c */
    public Drawable mo26080c() {
        DH dh = this.f25086d;
        if (dh == null) {
            return null;
        }
        return dh.getTopLevelDrawable();
    }

    /* renamed from: d */
    public boolean mo26081d() {
        DraweeController draweeController = this.f25087e;
        return draweeController != null && draweeController.getHierarchy() == this.f25086d;
    }

    /* renamed from: e */
    public void mo26082e() {
        this.f25088f.mo25834a(C9587a.ON_HOLDER_ATTACH);
        this.f25084b = true;
        m23648h();
    }

    /* renamed from: f */
    public void mo26083f() {
        this.f25088f.mo25834a(C9587a.ON_HOLDER_DETACH);
        this.f25084b = false;
        m23648h();
    }

    public void onDraw() {
        if (!this.f25083a) {
            C9543a.m23322c(C9586a.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f25087e)), toString());
            this.f25084b = true;
            this.f25085c = true;
            m23648h();
        }
    }

    public void onVisibilityChange(boolean z) {
        if (this.f25085c != z) {
            this.f25088f.mo25834a(z ? C9587a.ON_DRAWABLE_SHOW : C9587a.ON_DRAWABLE_HIDE);
            this.f25085c = z;
            m23648h();
        }
    }

    public String toString() {
        C9534b a = C9532i.m23262a((Object) this);
        a.mo25666a("controllerAttached", this.f25083a);
        a.mo25666a("holderAttached", this.f25084b);
        a.mo25666a("drawableVisible", this.f25085c);
        a.mo25665a("events", (Object) this.f25088f.toString());
        return a.toString();
    }

    /* renamed from: a */
    public boolean mo26078a(MotionEvent motionEvent) {
        if (!mo26081d()) {
            return false;
        }
        return this.f25087e.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m23646a(VisibilityCallback visibilityCallback) {
        Drawable c = mo26080c();
        if (c instanceof VisibilityAwareDrawable) {
            ((VisibilityAwareDrawable) c).setVisibilityCallback(visibilityCallback);
        }
    }

    /* renamed from: a */
    public void mo26076a(DraweeController draweeController) {
        boolean z = this.f25083a;
        if (z) {
            m23649i();
        }
        if (mo26081d()) {
            this.f25088f.mo25834a(C9587a.ON_CLEAR_OLD_CONTROLLER);
            this.f25087e.setHierarchy(null);
        }
        this.f25087e = draweeController;
        if (this.f25087e != null) {
            this.f25088f.mo25834a(C9587a.ON_SET_CONTROLLER);
            this.f25087e.setHierarchy(this.f25086d);
        } else {
            this.f25088f.mo25834a(C9587a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m23647g();
        }
    }

    /* renamed from: a */
    public DraweeController mo26074a() {
        return this.f25087e;
    }

    /* renamed from: a */
    public void mo26077a(DH dh) {
        this.f25088f.mo25834a(C9587a.ON_SET_HIERARCHY);
        boolean d = mo26081d();
        m23646a((VisibilityCallback) null);
        C9536j.m23271a(dh);
        this.f25086d = (DraweeHierarchy) dh;
        Drawable topLevelDrawable = this.f25086d.getTopLevelDrawable();
        onVisibilityChange(topLevelDrawable == null || topLevelDrawable.isVisible());
        m23646a((VisibilityCallback) this);
        if (d) {
            this.f25087e.setHierarchy(dh);
        }
    }
}
