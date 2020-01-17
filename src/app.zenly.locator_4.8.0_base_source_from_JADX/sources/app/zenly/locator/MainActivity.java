package app.zenly.locator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.core.content.C0540a;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.android.base.view.C1311b;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.app.C2453d;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.map.view.SplashView;
import app.zenly.locator.map.view.SplashView.SplashViewListener;
import app.zenly.locator.notifications.p122di.C4722b;
import app.zenly.locator.p073d0.C3285a;
import app.zenly.locator.p207x.C6272z1;
import com.bluelinelabs.conductor.C8811c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ChangeHandlerFrameLayout;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.notifications.C7793b;
import p213co.znly.models.notifications.C7857w;
import p213co.znly.models.notifications.C7862y;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;

public final class MainActivity extends BaseActivity implements RequiresAuthentication, SplashViewListener {

    /* renamed from: v */
    private static final String f5310v = f5310v;

    /* renamed from: w */
    public static final C1480a f5311w = new C1480a(null);

    /* renamed from: n */
    private final boolean f5312n = true;

    /* renamed from: o */
    private final C3285a f5313o = new C3285a();

    /* renamed from: p */
    private final C12275b f5314p = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public SplashView f5315q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f5316r;

    /* renamed from: s */
    private C8831g f5317s;

    /* renamed from: t */
    private C6272z1 f5318t;

    /* renamed from: u */
    private HashMap f5319u;

    /* renamed from: app.zenly.locator.MainActivity$a */
    public static final class C1480a {
        private C1480a() {
        }

        /* renamed from: a */
        public final Intent mo6997a(Context context) {
            C12932j.m33818b(context, "context");
            Intent addFlags = new Intent(context, MainActivity.class).addFlags(536870912);
            C12932j.m33815a((Object) addFlags, "Intent(context, MainActi…FLAG_ACTIVITY_SINGLE_TOP)");
            return addFlags;
        }

        /* renamed from: b */
        public final Intent mo7005b(Context context, String str) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "userUuid");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11452b(str));
            return a;
        }

        public /* synthetic */ C1480a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo7003a(Context context, String str, C7862y yVar) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "userUuid");
            C12932j.m33818b(yVar, "ping");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11448a(str, yVar));
            return a;
        }

        /* renamed from: b */
        public final Intent mo7004b(Context context) {
            C12932j.m33818b(context, "context");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11442a());
            return a;
        }

        /* renamed from: a */
        public final Intent mo7002a(Context context, String str, C7857w wVar) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "userUuid");
            C12932j.m33818b(wVar, "notification");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11447a(str, wVar));
            return a;
        }

        /* renamed from: a */
        public final Intent mo7001a(Context context, String str, int i) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "conversationUuid");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11446a(str, i));
            return a;
        }

        /* renamed from: a */
        public final Intent mo7000a(Context context, String str) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "userUuid");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11445a(str));
            return a;
        }

        /* renamed from: a */
        public final Intent mo6998a(Context context, long j) {
            C12932j.m33818b(context, "context");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11443a(j));
            return a;
        }

        /* renamed from: a */
        public final Intent mo6999a(Context context, C7793b bVar) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(bVar, "brump");
            Intent a = mo6997a(context);
            a.setAction("android.intent.action.VIEW");
            a.setData(C3888j.m11444a(bVar));
            return a;
        }
    }

    /* renamed from: app.zenly.locator.MainActivity$b */
    static final class C1481b<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ MainActivity f5320e;

        /* renamed from: f */
        final /* synthetic */ boolean f5321f;

        C1481b(MainActivity mainActivity, boolean z) {
            this.f5320e = mainActivity;
            this.f5321f = z;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C2453d.m8560f();
            if (this.f5321f) {
                C2453d.m8566l();
                MainActivity.m6593a(this.f5320e).mo14125e(false);
                C2453d.m8557c();
            }
            if (this.f5320e.f5316r && this.f5320e.f5315q != null) {
                C2453d.m8568n();
                SplashView b = this.f5320e.f5315q;
                if (b != null) {
                    b.mo11509a();
                }
            }
            ChangeHandlerFrameLayout changeHandlerFrameLayout = (ChangeHandlerFrameLayout) this.f5320e.mo6992a(C3891l.controller_container);
            C12932j.m33815a((Object) changeHandlerFrameLayout, "controller_container");
            changeHandlerFrameLayout.setBackground(null);
        }
    }

    /* renamed from: app.zenly.locator.MainActivity$c */
    static final class C1482c<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C1482c f5322e = new C1482c();

        C1482c() {
        }

        /* renamed from: a */
        public final Boolean mo7007a(Boolean bool) {
            C12932j.m33818b(bool, "ready");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo7007a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C6272z1 m6593a(MainActivity mainActivity) {
        C6272z1 z1Var = mainActivity.f5318t;
        if (z1Var != null) {
            return z1Var;
        }
        C12932j.m33820c("navigationController");
        throw null;
    }

    /* renamed from: a */
    public View mo6992a(int i) {
        if (this.f5319u == null) {
            this.f5319u = new HashMap();
        }
        View view = (View) this.f5319u.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f5319u.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public boolean mo6993d() {
        C8831g gVar = this.f5317s;
        if (gVar != null) {
            return gVar.mo24011i();
        }
        C12932j.m33820c("router");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C7707a.m18761b("MainActivity.onCreate");
        try {
            setTheme(2132083178);
            super.onCreate(bundle);
            setContentView((int) R.layout.activity_main);
            C2453d.m8556b();
            boolean z = getIntent() != null && C3888j.m11458g(getIntent());
            C2453d.m8555a(z);
            m6596c(z);
            ((ChangeHandlerFrameLayout) mo6992a(C3891l.controller_container)).removeAllViews();
            Fragment b = getSupportFragmentManager().mo4083b(f5310v);
            if (b != null) {
                C0819o b2 = getSupportFragmentManager().mo4084b();
                b2.mo4193d(b);
                b2.mo4176a();
                getSupportFragmentManager().mo4117n();
            }
            m6595b(z);
            C12956q qVar = C12956q.f33541a;
        } finally {
            C7707a.m18759a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f5314p.mo36401a();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C12932j.m33818b(intent, "intent");
        super.onNewIntent(intent);
        if (!isFinishing()) {
            C6272z1 z1Var = this.f5318t;
            if (z1Var != null) {
                z1Var.mo14120b(intent);
            } else {
                C12932j.m33820c("navigationController");
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f5313o.mo9744a();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f5313o.mo9745a(this, mo8414c());
    }

    public void onSplashAnimationEnd() {
        C2453d.m8562h();
        C2453d.m8566l();
        C6272z1 z1Var = this.f5318t;
        if (z1Var != null) {
            z1Var.mo14125e(true);
            C2453d.m8567m();
            SplashView splashView = this.f5315q;
            if (splashView != null) {
                C1311b.m6278a(splashView);
            }
            SplashView splashView2 = this.f5315q;
            if (splashView2 != null) {
                splashView2.setOnSplashViewListener(null);
            }
            this.f5315q = null;
            C2453d.m8557c();
            return;
        }
        C12932j.m33820c("navigationController");
        throw null;
    }

    public void onSplashViewReady() {
        this.f5316r = true;
        C2453d.m8563i();
        if (C3896a1.f10317n.mo10527a().mo10520j()) {
            C2453d.m8568n();
            SplashView splashView = this.f5315q;
            if (splashView != null) {
                splashView.mo11509a();
            }
        }
    }

    public void onUserInteraction() {
        C4722b.m13689a(this).mo11918a().mo11919a();
    }

    /* renamed from: b */
    private final void m6595b(boolean z) {
        C7707a.m18761b("router:install");
        try {
            C8831g a = C8811c.m20828a(this, (ChangeHandlerFrameLayout) mo6992a(C3891l.controller_container), null);
            C12932j.m33815a((Object) a, "Conductor.attachRouter(t…ntroller_container, null)");
            this.f5317s = a;
            this.f5318t = new C6272z1();
            C3896a1.f10317n.mo10527a().mo10526p();
            Disposable d = C3896a1.f10317n.mo10527a().mo10516f().mo36459b((Predicate<? super T>) C1482c.f5322e).mo36476d((Consumer<? super T>) new C1481b<Object>(this, z));
            C12932j.m33815a((Object) d, "MapManager.get().mapRead…ound = null\n            }");
            C12773a.m33432a(d, this.f5314p);
            C8831g gVar = this.f5317s;
            if (gVar != null) {
                C6272z1 z1Var = this.f5318t;
                if (z1Var != null) {
                    gVar.mo24008d(C8836h.m21058a((C8819d) z1Var));
                    C12956q qVar = C12956q.f33541a;
                    return;
                }
                C12932j.m33820c("navigationController");
                throw null;
            }
            C12932j.m33820c("router");
            throw null;
        } finally {
            C7707a.m18759a();
        }
    }

    /* renamed from: c */
    private final void m6596c(boolean z) {
        if (!z) {
            C7707a.m18761b("splashview:init");
            try {
                C2453d.m8552a();
                SplashView splashView = new SplashView(this);
                splashView.setOnSplashViewListener(this);
                addContentView(splashView, new LayoutParams(-1, -1));
                this.f5315q = splashView;
                C12956q qVar = C12956q.f33541a;
            } finally {
                C7707a.m18759a();
            }
        } else {
            C2453d.m8558d();
            ((ChangeHandlerFrameLayout) mo6992a(C3891l.controller_container)).setBackgroundColor(C0540a.m2536a((Context) this, (int) R.color.gray_light));
        }
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return this.f5312n;
    }
}
