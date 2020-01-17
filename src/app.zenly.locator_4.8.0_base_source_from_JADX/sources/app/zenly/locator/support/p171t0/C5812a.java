package app.zenly.locator.support.p171t0;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import app.zenly.locator.core.helper.C2509b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.support.SupportActivity;
import com.snap.p327ui.recycling.adapter.C11705b;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;

/* renamed from: app.zenly.locator.support.t0.a */
public final class C5812a extends ZenlyController {

    /* renamed from: P */
    private final C12275b f14709P = new C12275b();

    /* renamed from: Q */
    private final C5815b f14710Q = new C5815b();

    /* renamed from: R */
    private final C5821d f14711R = new C5821d();

    /* renamed from: S */
    private C11705b f14712S;

    /* renamed from: app.zenly.locator.support.t0.a$a */
    public static final class C5813a {
        private C5813a() {
        }

        public /* synthetic */ C5813a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.t0.a$b */
    public static final class C5814b extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C5812a f14713g;

        C5814b(C5812a aVar, boolean z) {
            this.f14713g = aVar;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C12932j.m33818b(view, "v");
            Activity b = this.f14713g.mo23920b();
            if (!(b instanceof SupportActivity)) {
                b = null;
            }
            SupportActivity supportActivity = (SupportActivity) b;
            if (supportActivity != null) {
                supportActivity.mo13280f();
            }
        }
    }

    static {
        new C5813a(null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo7054a(android.view.LayoutInflater r19, android.view.ViewGroup r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "inflater"
            kotlin.jvm.internal.C12932j.m33818b(r1, r3)
            java.lang.String r3 = "container"
            kotlin.jvm.internal.C12932j.m33818b(r2, r3)
            r3 = 0
            r4 = 2131624056(0x7f0e0078, float:1.887528E38)
            android.view.View r1 = r1.inflate(r4, r2, r3)
            co.znly.core.ZenlyCore r2 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            co.znly.models.UserProto$User r2 = r2.userMeCache()
            if (r2 == 0) goto L_0x003f
            co.znly.core.vendor.com.google.protobuf.Timestamp r2 = r2.getCreatedAt()
            java.lang.String r4 = "userMe.createdAt"
            kotlin.jvm.internal.C12932j.m33815a(r2, r4)
            int r2 = app.zenly.locator.core.util.C3245z.m10284c(r2)
            long r4 = (long) r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r6 = 3
            long r6 = r2.toHours(r6)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r2 = 0
            goto L_0x0040
        L_0x003f:
            r2 = 1
        L_0x0040:
            java.lang.String r4 = "view"
            kotlin.jvm.internal.C12932j.m33815a(r1, r4)
            int r4 = app.zenly.locator.C3891l.my_places_empty_view
            android.view.View r4 = r1.findViewById(r4)
            app.zenly.android.feature.polenta.widget.EmptyView r4 = (app.zenly.android.feature.polenta.widget.EmptyView) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.C12932j.m33815a(r4, r5)
            r5 = 8
            if (r2 == 0) goto L_0x0059
            r6 = 8
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            r4.setVisibility(r6)
            app.zenly.locator.support.t0.a$b r6 = new app.zenly.locator.support.t0.a$b
            r6.<init>(r0, r2)
            r4.setOnActionClickListener(r6)
            int r4 = app.zenly.locator.C3891l.my_places_subtitle
            android.view.View r4 = r1.findViewById(r4)
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            java.lang.String r6 = "view.my_places_subtitle"
            kotlin.jvm.internal.C12932j.m33815a(r4, r6)
            android.content.Context r7 = r1.getContext()
            java.lang.String r8 = "view.context"
            kotlin.jvm.internal.C12932j.m33815a(r7, r8)
            r9 = 2132018363(0x7f1404bb, float:1.967503E38)
            java.lang.String r7 = p250f.p251a.p252a.p263b.p264a.p272j.C7709b.m18762a(r7, r9)
            r4.setText(r7)
            int r4 = app.zenly.locator.C3891l.my_places_subtitle
            android.view.View r4 = r1.findViewById(r4)
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            kotlin.jvm.internal.C12932j.m33815a(r4, r6)
            if (r2 == 0) goto L_0x0094
            r6 = 0
            goto L_0x0096
        L_0x0094:
            r6 = 8
        L_0x0096:
            r4.setVisibility(r6)
            int r4 = app.zenly.locator.C3891l.my_places_recycler_view
            android.view.View r4 = r1.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            java.lang.String r6 = "view.my_places_recycler_view"
            kotlin.jvm.internal.C12932j.m33815a(r4, r6)
            if (r2 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r3 = 8
        L_0x00ab:
            r4.setVisibility(r3)
            app.zenly.locator.support.e0 r2 = app.zenly.locator.support.C5667e0.f14437b
            java.lang.String r3 = "myPlaces"
            f.a.a.b.a.e.a r2 = r2.mo19916a(r3)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r2 = app.zenly.android.feature.base.scheduling.C1351e.m6372a(r2)
            com.snap.ui.event.c r3 = new com.snap.ui.event.c
            r3.<init>()
            com.snap.ui.recycling.adapter.b r4 = new com.snap.ui.recycling.adapter.b
            com.snap.ui.recycling.factory.c r10 = new com.snap.ui.recycling.factory.c
            java.lang.Class<app.zenly.locator.support.t0.e> r5 = app.zenly.locator.support.p171t0.C5822e.class
            java.util.List r5 = kotlin.collections.C12846n.m33635a(r5)
            r10.<init>(r5)
            com.snap.ui.event.EventDispatcher r11 = r3.mo34447a()
            java.lang.String r5 = "bus.eventDispatcher"
            kotlin.jvm.internal.C12932j.m33815a(r11, r5)
            app.zenly.android.feature.base.scheduling.b r12 = r2.getComputation()
            app.zenly.android.feature.base.scheduling.b r13 = r2.getMainThread()
            app.zenly.locator.support.t0.i.a r2 = new app.zenly.locator.support.t0.i.a
            app.zenly.locator.support.t0.b r5 = r0.f14710Q
            app.zenly.locator.support.t0.d r7 = r0.f14711R
            io.reactivex.n.a r7 = r7.mo13500a()
            r2.<init>(r5, r7)
            java.util.List r14 = kotlin.collections.C12846n.m33635a(r2)
            r15 = 0
            r16 = 32
            r17 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.f14712S = r4
            app.zenly.locator.support.t0.f.a r2 = new app.zenly.locator.support.t0.f.a
            android.content.Context r4 = r1.getContext()
            kotlin.jvm.internal.C12932j.m33815a(r4, r8)
            app.zenly.locator.support.t0.d r5 = r0.f14711R
            r2.<init>(r4, r0, r5)
            io.reactivex.disposables.Disposable r2 = r3.mo34449b(r2)
            java.lang.String r3 = "bus.subscribe(EventDispa…t, this, viewRepository))"
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            io.reactivex.disposables.b r3 = r0.f14709P
            p389io.reactivex.p405m.C12773a.m33432a(r2, r3)
            com.snap.ui.recycling.adapter.b r2 = r0.f14712S
            r3 = 0
            java.lang.String r4 = "adapter"
            if (r2 == 0) goto L_0x013c
            io.reactivex.disposables.Disposable r2 = r2.mo34464b()
            io.reactivex.disposables.b r5 = r0.f14709P
            p389io.reactivex.p405m.C12773a.m33432a(r2, r5)
            int r2 = app.zenly.locator.C3891l.my_places_recycler_view
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r6)
            com.snap.ui.recycling.adapter.b r5 = r0.f14712S
            if (r5 == 0) goto L_0x0138
            r2.setAdapter(r5)
            return r1
        L_0x0138:
            kotlin.jvm.internal.C12932j.m33820c(r4)
            throw r3
        L_0x013c:
            kotlin.jvm.internal.C12932j.m33820c(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.p171t0.C5812a.mo7054a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f14709P.mo36401a();
        super.mo7066c(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
