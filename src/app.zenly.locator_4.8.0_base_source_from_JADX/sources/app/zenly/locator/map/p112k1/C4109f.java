package app.zenly.locator.map.p112k1;

import android.content.Context;
import android.view.MotionEvent;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.contracts.MapControllerContract.C2464g;
import app.zenly.locator.core.models.C2908w.C2910b;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.map.C4303u0;
import app.zenly.locator.map.marker.C4167b0;
import app.zenly.locator.map.marker.C4167b0.C4169b;
import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.marker.C4187h0;
import app.zenly.locator.map.marker.C4217i0;
import app.zenly.locator.map.marker.C4217i0.C4218a;
import app.zenly.locator.map.marker.MarkerAdapter;
import app.zenly.locator.map.marker.heading.C4198b;
import app.zenly.locator.map.marker.heading.C4200c;
import app.zenly.locator.map.marker.heading.C4200c.C4202b;
import app.zenly.locator.map.marker.heading.C4200c.C4203c;
import app.zenly.locator.map.marker.heading.C4208e;
import app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView.C4193d;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;

/* renamed from: app.zenly.locator.map.k1.f */
public final class C4109f {

    /* renamed from: a */
    private final C4198b f10756a;

    /* renamed from: b */
    private final C4200c f10757b;

    /* renamed from: c */
    private C4167b0 f10758c;

    /* renamed from: d */
    private C2464g f10759d = C2464g.AUTO;

    /* renamed from: e */
    private C2458b f10760e = C2458b.NORMAL;

    /* renamed from: f */
    private final C4112c f10761f = new C4112c(this);

    /* renamed from: app.zenly.locator.map.k1.f$a */
    static final class C4110a extends C12933k implements Function1<C4203c, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4109f f10762f;

        C4110a(C4109f fVar) {
            this.f10762f = fVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
            if (r4 != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
            if (r0 != null) goto L_0x0039;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo10786a(app.zenly.locator.map.marker.heading.C4200c.C4203c r4) {
            /*
                r3 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C12932j.m33818b(r4, r0)
                app.zenly.locator.map.a1$a r0 = app.zenly.locator.map.C3896a1.f10317n
                app.zenly.locator.map.a1 r0 = r0.mo10527a()
                io.reactivex.n.a r0 = r0.mo10513d()
                java.lang.Object r0 = r0.mo36963s()
                app.zenly.locator.core.contracts.MapControllerContract$g r0 = (app.zenly.locator.core.contracts.MapControllerContract.C2464g) r0
                if (r0 == 0) goto L_0x0018
                goto L_0x001a
            L_0x0018:
                app.zenly.locator.core.contracts.MapControllerContract$g r0 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.AUTO
            L_0x001a:
                java.lang.String r1 = "MapManager.get().heading…ct.HeadingFollowMode.AUTO"
                kotlin.jvm.internal.C12932j.m33815a(r0, r1)
                app.zenly.locator.map.k1.f r1 = r3.f10762f
                app.zenly.locator.map.marker.b0 r1 = r1.mo10784b()
                java.lang.String r2 = "friendMarker.friend"
                if (r1 == 0) goto L_0x0037
                app.zenly.locator.core.models.p r1 = r1.mo11025P()
                kotlin.jvm.internal.C12932j.m33815a(r1, r2)
                app.zenly.locator.core.contracts.MapControllerContract$g r0 = app.zenly.locator.map.p108h1.C3990a.m11641a(r0, r1)
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                app.zenly.locator.core.contracts.MapControllerContract$g r0 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.ALL
            L_0x0039:
                int[] r1 = app.zenly.locator.map.p112k1.C4113g.f10765a
                int r4 = r4.ordinal()
                r4 = r1[r4]
                r1 = 1
                if (r4 == r1) goto L_0x0050
                r1 = 2
                if (r4 != r1) goto L_0x004a
                app.zenly.locator.core.contracts.MapControllerContract$g r4 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.MARKER_DESTINATION
                goto L_0x0052
            L_0x004a:
                kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                r4.<init>()
                throw r4
            L_0x0050:
                app.zenly.locator.core.contracts.MapControllerContract$g r4 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.MARKER_ORIGIN
            L_0x0052:
                if (r0 == r4) goto L_0x0055
                goto L_0x0077
            L_0x0055:
                app.zenly.locator.map.k1.f r4 = r3.f10762f
                app.zenly.locator.map.marker.b0 r4 = r4.mo10784b()
                if (r4 == 0) goto L_0x006d
                app.zenly.locator.core.contracts.MapControllerContract$g r0 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.AUTO
                app.zenly.locator.core.models.p r4 = r4.mo11025P()
                kotlin.jvm.internal.C12932j.m33815a(r4, r2)
                app.zenly.locator.core.contracts.MapControllerContract$g r4 = app.zenly.locator.map.p108h1.C3990a.m11641a(r0, r4)
                if (r4 == 0) goto L_0x006d
                goto L_0x006f
            L_0x006d:
                app.zenly.locator.core.contracts.MapControllerContract$g r4 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.ALL
            L_0x006f:
                app.zenly.locator.core.contracts.MapControllerContract$g r0 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.ALL
                if (r4 != r0) goto L_0x0076
                app.zenly.locator.core.contracts.MapControllerContract$g r4 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.AUTO
                goto L_0x0077
            L_0x0076:
                r4 = r0
            L_0x0077:
                app.zenly.locator.map.a1$a r0 = app.zenly.locator.map.C3896a1.f10317n
                app.zenly.locator.map.a1 r0 = r0.mo10527a()
                r0.mo10499a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p112k1.C4109f.C4110a.mo10786a(app.zenly.locator.map.marker.heading.c$c):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo10786a((C4203c) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.map.k1.f$b */
    static final class C4111b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4109f f10763f;

        C4111b(C4109f fVar) {
            this.f10763f = fVar;
            super(0);
        }

        public final void invoke() {
            this.f10763f.m11826e();
        }
    }

    /* renamed from: app.zenly.locator.map.k1.f$c */
    public static final class C4112c extends C4169b {

        /* renamed from: a */
        final /* synthetic */ C4109f f10764a;

        C4112c(C4109f fVar) {
            this.f10764a = fVar;
        }

        /* renamed from: a */
        public void mo10787a(C4167b0 b0Var, C2910b bVar) {
            this.f10764a.m11825d();
            this.f10764a.m11827f();
            if (bVar == null) {
                C3896a1.f10317n.mo10527a().mo10499a(C2464g.AUTO);
            }
        }
    }

    public C4109f(Context context, C4303u0 u0Var) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(u0Var, "mapController");
        this.f10756a = new C4198b(context);
        C4200c cVar = new C4200c(context);
        cVar.mo11134a((MarkerAdapter) this.f10756a);
        cVar.setFromMarker(this.f10756a.mo11176d());
        cVar.setToMarker(this.f10756a.mo11177e());
        cVar.setOnHeadingRouteClick(new C4110a(this));
        cVar.setOnPlacesPositionChange(new C4111b(this));
        u0Var.mo11354a((C4187h0) cVar);
        this.f10757b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m11825d() {
        C4167b0 b0Var = this.f10758c;
        C4167b0 b0Var2 = null;
        if (b0Var != null && b0Var.mo11025P().f8222z.mo8994c() && this.f10760e == C2458b.NORMAL) {
            b0Var2 = b0Var;
        }
        this.f10756a.mo11175a(b0Var2);
        this.f10757b.setFriendMarker(b0Var2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m11826e() {
        C4193d dVar;
        C4193d dVar2;
        int i = C4113g.f10766b[this.f10759d.ordinal()];
        if (i == 1) {
            C4208e d = this.f10756a.mo11176d();
            if (this.f10757b.getPlaceOriginPosition() == C4202b.BELOW) {
                dVar = C4193d.BOTTOM;
            } else {
                dVar = C4193d.TOP;
            }
            d.mo11199a(dVar);
            this.f10756a.mo11177e().mo11199a(C4193d.NONE);
        } else if (i != 2) {
            this.f10756a.mo11176d().mo11199a(C4193d.NONE);
            this.f10756a.mo11177e().mo11199a(C4193d.NONE);
        } else {
            this.f10756a.mo11176d().mo11199a(C4193d.NONE);
            C4208e e = this.f10756a.mo11177e();
            if (this.f10757b.getPlaceDestinationPosition() == C4202b.BELOW) {
                dVar2 = C4193d.BOTTOM;
            } else {
                dVar2 = C4193d.TOP;
            }
            e.mo11199a(dVar2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11827f() {
        /*
            r4 = this;
            app.zenly.locator.map.marker.b0 r0 = r4.f10758c
            if (r0 == 0) goto L_0x0016
            app.zenly.locator.core.contracts.MapControllerContract$g r1 = r4.f10759d
            app.zenly.locator.core.models.p r0 = r0.mo11025P()
            java.lang.String r2 = "friendMarker.friend"
            kotlin.jvm.internal.C12932j.m33815a(r0, r2)
            app.zenly.locator.core.contracts.MapControllerContract$g r0 = app.zenly.locator.map.p108h1.C3990a.m11641a(r1, r0)
            if (r0 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            app.zenly.locator.core.contracts.MapControllerContract$g r0 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.ALL
        L_0x0018:
            app.zenly.locator.core.contracts.MapControllerContract$g r1 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.MARKER_ORIGIN
            if (r0 != r1) goto L_0x001f
            app.zenly.locator.map.marker.heading.c$d r1 = app.zenly.locator.map.marker.heading.C4200c.C4204d.COLLAPSE
            goto L_0x0021
        L_0x001f:
            app.zenly.locator.map.marker.heading.c$d r1 = app.zenly.locator.map.marker.heading.C4200c.C4204d.EXPAND
        L_0x0021:
            app.zenly.locator.core.contracts.MapControllerContract$g r2 = app.zenly.locator.core.contracts.MapControllerContract.C2464g.MARKER_DESTINATION
            if (r0 != r2) goto L_0x0028
            app.zenly.locator.map.marker.heading.c$d r0 = app.zenly.locator.map.marker.heading.C4200c.C4204d.COLLAPSE
            goto L_0x002a
        L_0x0028:
            app.zenly.locator.map.marker.heading.c$d r0 = app.zenly.locator.map.marker.heading.C4200c.C4204d.EXPAND
        L_0x002a:
            app.zenly.locator.map.marker.heading.c r2 = r4.f10757b
            app.zenly.locator.map.marker.heading.c$c r3 = app.zenly.locator.map.marker.heading.C4200c.C4203c.PAST
            r2.mo11178a(r3, r1)
            app.zenly.locator.map.marker.heading.c r1 = r4.f10757b
            app.zenly.locator.map.marker.heading.c$c r2 = app.zenly.locator.map.marker.heading.C4200c.C4203c.FUTURE
            r1.mo11178a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p112k1.C4109f.m11827f():void");
    }

    /* renamed from: a */
    public final void mo10780a(C4167b0 b0Var) {
        C4167b0 b0Var2 = this.f10758c;
        if (b0Var2 != null) {
            b0Var2.mo11105b((C4179a) this.f10761f);
        }
        this.f10758c = b0Var;
        C4167b0 b0Var3 = this.f10758c;
        if (b0Var3 != null) {
            b0Var3.mo11099a((C4179a) this.f10761f);
        }
        C3896a1.f10317n.mo10527a().mo10499a(C2464g.AUTO);
        m11825d();
        m11827f();
    }

    /* renamed from: b */
    public final C4167b0 mo10784b() {
        return this.f10758c;
    }

    /* renamed from: c */
    public final C4178e0<?> mo10785c() {
        return this.f10756a.mo11177e();
    }

    /* renamed from: a */
    public final void mo10779a(C2464g gVar) {
        C12932j.m33818b(gVar, "value");
        this.f10759d = gVar;
        m11827f();
        m11826e();
    }

    /* renamed from: a */
    public final void mo10778a(C2458b bVar) {
        C12932j.m33818b(bVar, "value");
        this.f10760e = bVar;
        m11825d();
    }

    /* renamed from: a */
    public final void mo10777a(int i) {
        this.f10757b.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo10781a(boolean z) {
        this.f10757b.setDarkMode(z);
    }

    /* renamed from: a */
    public final C4178e0<?> mo10776a() {
        return this.f10756a.mo11176d();
    }

    /* renamed from: a */
    public final boolean mo10783a(C4217i0 i0Var) {
        C12932j.m33818b(i0Var, "event");
        C4178e0 e0Var = i0Var.f11311b;
        if (!(e0Var instanceof C4208e) || i0Var.f11310a != C4218a.CLICK) {
            return false;
        }
        if (C12932j.m33817a((Object) e0Var, (Object) this.f10756a.mo11176d())) {
            C3896a1.f10317n.mo10527a().mo10499a(C2464g.ORIGIN);
        } else if (C12932j.m33817a((Object) e0Var, (Object) this.f10756a.mo11177e())) {
            C3896a1.f10317n.mo10527a().mo10499a(C2464g.DESTINATION);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo10782a(MotionEvent motionEvent) {
        C12932j.m33818b(motionEvent, "e");
        return this.f10757b.mo11179a(motionEvent);
    }
}
