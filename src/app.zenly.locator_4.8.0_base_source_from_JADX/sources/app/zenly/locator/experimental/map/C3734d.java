package app.zenly.locator.experimental.map;

import android.app.Activity;
import android.view.View;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.p207x.C6272z1;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.experimental.map.d */
public final class C3734d implements NextUnlockController {

    /* renamed from: a */
    private final C12275b f9988a = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ZenlyCore f9989b;

    /* renamed from: c */
    private final ZenlySchedulers f9990c;

    /* renamed from: app.zenly.locator.experimental.map.d$a */
    static final class C3735a<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ C3734d f9991e;

        /* renamed from: f */
        final /* synthetic */ Activity f9992f;

        C3735a(C3734d dVar, Activity activity) {
            this.f9991e = dVar;
            this.f9992f = activity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
            if (r1 != null) goto L_0x0036;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void accept(p213co.znly.models.UserProto$User r6) {
            /*
                r5 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C12932j.m33815a(r6, r0)
                int r6 = r6.getFriendsCount()
                r0 = 1
                if (r0 <= r6) goto L_0x000d
                goto L_0x0061
            L_0x000d:
                r1 = 3
                if (r1 <= r6) goto L_0x0061
                app.zenly.locator.experimental.map.f r6 = new app.zenly.locator.experimental.map.f
                app.zenly.locator.s.g$a r1 = app.zenly.locator.p143s.C5407g.f13966d
                android.app.Activity r2 = r5.f9992f
                app.zenly.locator.s.g r1 = r1.mo12991a(r2)
                android.content.SharedPreferences r1 = r1.mo12986h()
                r6.<init>(r1)
                app.zenly.locator.experimental.map.d r1 = r5.f9991e
                co.znly.core.ZenlyCore r1 = r1.f9989b
                co.znly.models.ConfigurationProto$Configuration$e r1 = r1.experimentFlags()
                if (r1 == 0) goto L_0x0034
                co.znly.models.ConfigurationProto$Configuration$e$d r1 = r1.getWatchersLocked()
                if (r1 == 0) goto L_0x0034
                goto L_0x0036
            L_0x0034:
                co.znly.models.ConfigurationProto$Configuration$e$d r1 = p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d.GROUP_UNKNOWN
            L_0x0036:
                boolean r2 = r6.mo10272a()
                if (r2 != 0) goto L_0x0061
                co.znly.models.ConfigurationProto$Configuration$e$d r2 = p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d.GROUP_UNKNOWN
                if (r1 == r2) goto L_0x0061
                app.zenly.locator.u.b.a r2 = new app.zenly.locator.u.b.a
                app.zenly.locator.s.a r3 = app.zenly.locator.p143s.C5343a.m15160U()
                java.lang.String r4 = "Analytics.get()"
                kotlin.jvm.internal.C12932j.m33815a(r3, r4)
                app.zenly.locator.core.analytics.tracker.AnalyticsTracker r3 = r3.mo12806a()
                java.lang.String r4 = "Analytics.get().tracker"
                kotlin.jvm.internal.C12932j.m33815a(r3, r4)
                co.znly.core.ZenlyCore r4 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
                r2.<init>(r3, r4)
                r2.mo13642a(r1)
                r6.mo10271a(r0)
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.experimental.map.C3734d.C3735a.accept(co.znly.models.UserProto$User):void");
        }
    }

    public C3734d(ZenlyCore zenlyCore, ZenlySchedulers zenlySchedulers) {
        C12932j.m33818b(zenlyCore, "zenlyCore");
        C12932j.m33818b(zenlySchedulers, "schedulers");
        this.f9989b = zenlyCore;
        this.f9990c = zenlySchedulers;
    }

    public void onAttach(C6272z1 z1Var, Activity activity) {
        C12932j.m33818b(z1Var, "navigationController");
        C12932j.m33818b(activity, "activity");
        Disposable d = this.f9989b.userMeStream().mo36428a((C12286f) this.f9990c.getMainThread()).mo36476d((Consumer<? super T>) new C3735a<Object>(this, activity));
        C12932j.m33815a((Object) d, "zenlyCore.userMeStream()…          }\n            }");
        C12773a.m33432a(d, this.f9988a);
    }

    public void onCreateView(View view) {
        C12932j.m33818b(view, "root");
    }

    public void onDetach() {
        this.f9988a.mo36401a();
    }

    public void onDisplayGathering() {
    }

    public void onEnterDiscoverMode() {
    }

    public void onExitDiscoverMode() {
    }

    public void onGatheringCleared() {
    }

    public void onViewPagerScrolled(float f, int i) {
    }
}
