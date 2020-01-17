package com.bluelinelabs.conductor;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bluelinelabs.conductor.changehandler.C8817d;
import com.bluelinelabs.conductor.internal.C8846a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ControllerChangeHandler {

    /* renamed from: g */
    static final Map<String, C8807b> f22819g = new HashMap();

    /* renamed from: e */
    boolean f22820e;

    /* renamed from: f */
    private boolean f22821f;

    public interface ControllerChangeCompletedListener {
        void onChangeCompleted();
    }

    public interface ControllerChangeListener {
        void onChangeCompleted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler);

        void onChangeStarted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler);
    }

    /* renamed from: com.bluelinelabs.conductor.ControllerChangeHandler$a */
    static class C8806a implements ControllerChangeCompletedListener {

        /* renamed from: a */
        final /* synthetic */ C8819d f22822a;

        /* renamed from: b */
        final /* synthetic */ ControllerChangeHandler f22823b;

        /* renamed from: c */
        final /* synthetic */ C8829e f22824c;

        /* renamed from: d */
        final /* synthetic */ C8819d f22825d;

        /* renamed from: e */
        final /* synthetic */ C8829e f22826e;

        /* renamed from: f */
        final /* synthetic */ List f22827f;

        /* renamed from: g */
        final /* synthetic */ boolean f22828g;

        /* renamed from: h */
        final /* synthetic */ ViewGroup f22829h;

        /* renamed from: i */
        final /* synthetic */ View f22830i;

        C8806a(C8819d dVar, ControllerChangeHandler controllerChangeHandler, C8829e eVar, C8819d dVar2, C8829e eVar2, List list, boolean z, ViewGroup viewGroup, View view) {
            this.f22822a = dVar;
            this.f22823b = controllerChangeHandler;
            this.f22824c = eVar;
            this.f22825d = dVar2;
            this.f22826e = eVar2;
            this.f22827f = list;
            this.f22828g = z;
            this.f22829h = viewGroup;
            this.f22830i = view;
        }

        public void onChangeCompleted() {
            C8819d dVar = this.f22822a;
            if (dVar != null) {
                dVar.mo23910a(this.f22823b, this.f22824c);
            }
            C8819d dVar2 = this.f22825d;
            if (dVar2 != null) {
                ControllerChangeHandler.f22819g.remove(dVar2.mo23939e());
                this.f22825d.mo23910a(this.f22823b, this.f22826e);
            }
            for (ControllerChangeListener onChangeCompleted : this.f22827f) {
                onChangeCompleted.onChangeCompleted(this.f22825d, this.f22822a, this.f22828g, this.f22829h, this.f22823b);
            }
            if (this.f22823b.f22820e) {
                View view = this.f22830i;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(this.f22830i);
                    }
                }
            }
            if (this.f22823b.mo23853d()) {
                C8819d dVar3 = this.f22822a;
                if (dVar3 != null) {
                    dVar3.mo23931b(false);
                }
            }
        }
    }

    /* renamed from: com.bluelinelabs.conductor.ControllerChangeHandler$b */
    private static class C8807b {

        /* renamed from: a */
        public final ControllerChangeHandler f22831a;

        /* renamed from: b */
        public final boolean f22832b;

        public C8807b(ControllerChangeHandler controllerChangeHandler, boolean z) {
            this.f22831a = controllerChangeHandler;
            this.f22832b = z;
        }
    }

    /* renamed from: com.bluelinelabs.conductor.ControllerChangeHandler$c */
    static class C8808c {

        /* renamed from: a */
        final C8819d f22833a;

        /* renamed from: b */
        final C8819d f22834b;

        /* renamed from: c */
        final boolean f22835c;

        /* renamed from: d */
        final ViewGroup f22836d;

        /* renamed from: e */
        final ControllerChangeHandler f22837e;

        /* renamed from: f */
        final List<ControllerChangeListener> f22838f;

        public C8808c(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler, List<ControllerChangeListener> list) {
            this.f22833a = dVar;
            this.f22834b = dVar2;
            this.f22835c = z;
            this.f22836d = viewGroup;
            this.f22837e = controllerChangeHandler;
            this.f22838f = list;
        }
    }

    public ControllerChangeHandler() {
        mo23889f();
    }

    /* renamed from: a */
    static boolean m20790a(String str) {
        C8807b bVar = (C8807b) f22819g.get(str);
        if (bVar == null) {
            return false;
        }
        bVar.f22831a.mo23846a();
        f22819g.remove(str);
        return true;
    }

    /* renamed from: c */
    public static ControllerChangeHandler m20791c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ControllerChangeHandler controllerChangeHandler = (ControllerChangeHandler) C8846a.m21101a(bundle.getString("ControllerChangeHandler.className"));
        controllerChangeHandler.mo23847a(bundle.getBundle("ControllerChangeHandler.savedState"));
        return controllerChangeHandler;
    }

    /* renamed from: f */
    private void mo23889f() {
        try {
            getClass().getConstructor(new Class[0]);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" does not have a default constructor.");
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo23846a() {
    }

    /* renamed from: a */
    public void mo23847a(Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo23848a(ViewGroup viewGroup, View view, View view2, boolean z, ControllerChangeCompletedListener controllerChangeCompletedListener);

    /* renamed from: a */
    public void mo23849a(ControllerChangeHandler controllerChangeHandler, C8819d dVar) {
    }

    /* renamed from: b */
    public ControllerChangeHandler mo12522b() {
        return m20791c(mo23854e());
    }

    /* renamed from: b */
    public void mo23851b(Bundle bundle) {
    }

    /* renamed from: c */
    public boolean mo23852c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo23853d() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Bundle mo23854e() {
        Bundle bundle = new Bundle();
        bundle.putString("ControllerChangeHandler.className", getClass().getName());
        Bundle bundle2 = new Bundle();
        mo23851b(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }

    /* renamed from: a */
    static void m20788a(C8819d dVar, C8819d dVar2, ControllerChangeHandler controllerChangeHandler) {
        C8807b bVar = (C8807b) f22819g.get(dVar.mo23939e());
        if (bVar != null) {
            if (bVar.f22832b) {
                bVar.f22831a.mo23849a(controllerChangeHandler, dVar2);
            } else {
                bVar.f22831a.mo23846a();
            }
            f22819g.remove(dVar.mo23939e());
        }
    }

    /* renamed from: a */
    static void m20787a(C8808c cVar) {
        m20789a(cVar.f22833a, cVar.f22834b, cVar.f22835c, cVar.f22836d, cVar.f22837e, cVar.f22838f);
    }

    /* renamed from: a */
    private static void m20789a(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler, List<ControllerChangeListener> list) {
        View view;
        C8819d dVar3 = dVar;
        C8819d dVar4 = dVar2;
        boolean z2 = z;
        ViewGroup viewGroup2 = viewGroup;
        ControllerChangeHandler controllerChangeHandler2 = controllerChangeHandler;
        if (viewGroup2 != null) {
            if (controllerChangeHandler2 == null) {
                controllerChangeHandler2 = new C8817d();
            } else if (controllerChangeHandler2.f22821f && !controllerChangeHandler.mo23852c()) {
                controllerChangeHandler2 = controllerChangeHandler.mo12522b();
            }
            ControllerChangeHandler controllerChangeHandler3 = controllerChangeHandler2;
            controllerChangeHandler3.f22821f = true;
            if (dVar4 != null) {
                if (z2) {
                    m20790a(dVar2.mo23939e());
                } else {
                    m20788a(dVar4, dVar3, controllerChangeHandler3);
                }
            }
            if (dVar3 != null) {
                f22819g.put(dVar.mo23939e(), new C8807b(controllerChangeHandler3, z2));
            }
            for (ControllerChangeListener onChangeStarted : list) {
                onChangeStarted.onChangeStarted(dVar, dVar2, z, viewGroup, controllerChangeHandler3);
            }
            C8829e eVar = z2 ? C8829e.PUSH_ENTER : C8829e.POP_ENTER;
            C8829e eVar2 = z2 ? C8829e.PUSH_EXIT : C8829e.POP_EXIT;
            View view2 = null;
            if (dVar3 != null) {
                View b = dVar3.mo23921b(viewGroup2);
                dVar3.mo23927b(controllerChangeHandler3, eVar);
                view = b;
            } else {
                view = null;
            }
            if (dVar4 != null) {
                view2 = dVar2.mo23948m();
                dVar4.mo23927b(controllerChangeHandler3, eVar2);
            }
            View view3 = view2;
            C8806a aVar = new C8806a(dVar2, controllerChangeHandler3, eVar2, dVar, eVar, list, z, viewGroup, view3);
            controllerChangeHandler3.mo23848a(viewGroup, view3, view, z, aVar);
        }
    }

    /* renamed from: a */
    public void mo23850a(boolean z) {
        this.f22820e = z;
    }
}
