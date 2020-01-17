package app.zenly.locator.core.app;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import app.zenly.android.feature.base.app.BaseAppCompatActivity;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.view.C1363a;
import app.zenly.android.feature.base.view.WindowInsetsListener;
import app.zenly.locator.ActivityLifecycleObserver;
import app.zenly.locator.C1501a;
import app.zenly.locator.C1687b;
import app.zenly.locator.C4702n;
import app.zenly.locator.R;
import app.zenly.locator.RequiresAuthentication;
import app.zenly.locator.core.invitations.AppShareSheetLauncherFragment;
import app.zenly.locator.core.p072ui.view.C3144f;
import app.zenly.locator.core.p072ui.view.InAppNotificationContainer;
import app.zenly.locator.core.util.C3224l;
import app.zenly.locator.core.widget.DecorView;
import com.bluelinelabs.conductor.C8811c;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.ControllerChangeHandler.ControllerChangeListener;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.p405m.C12773a;

public abstract class BaseActivity extends BaseAppCompatActivity {

    /* renamed from: m */
    static final /* synthetic */ KProperty[] f7334m;

    /* renamed from: e */
    private final C1501a f7335e = new C1501a(new C2443a(this));

    /* renamed from: f */
    private final C12275b f7336f = new C12275b();

    /* renamed from: g */
    private final Lazy f7337g = C12896f.m33751a(new C2446d(this));

    /* renamed from: h */
    private final Lazy<C8831g> f7338h = C12896f.m33751a(new C2447e(this));

    /* renamed from: i */
    private final Lazy f7339i = this.f7338h;

    /* renamed from: j */
    private final ControllerChangeListener f7340j = new C2445c(this);

    /* renamed from: k */
    private final WindowInsetsListener f7341k = new C2448f(this);

    /* renamed from: l */
    public C3144f f7342l;

    /* renamed from: app.zenly.locator.core.app.BaseActivity$a */
    public static final class C2443a implements Provider<Set<? extends ActivityLifecycleObserver>> {

        /* renamed from: a */
        final /* synthetic */ BaseActivity f7343a;

        public C2443a(BaseActivity baseActivity) {
            this.f7343a = baseActivity;
        }

        public Set<? extends ActivityLifecycleObserver> get() {
            return C1687b.m7021a(this.f7343a);
        }
    }

    /* renamed from: app.zenly.locator.core.app.BaseActivity$b */
    public static final class C2444b {
        private C2444b() {
        }

        public /* synthetic */ C2444b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.app.BaseActivity$c */
    public static final class C2445c implements ControllerChangeListener {

        /* renamed from: e */
        final /* synthetic */ BaseActivity f7344e;

        C2445c(BaseActivity baseActivity) {
            this.f7344e = baseActivity;
        }

        public void onChangeCompleted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler) {
            C12932j.m33818b(viewGroup, "container");
            C12932j.m33818b(controllerChangeHandler, "handler");
            if (this.f7344e.mo8413b().mo24003c() == 0) {
                View findViewById = this.f7344e.mo7317e().findViewById(R.id._dialog_container);
                C12932j.m33815a((Object) findViewById, "decorView.findViewById<V…>(R.id._dialog_container)");
                ((ViewGroup) findViewById).setVisibility(4);
            }
        }

        public void onChangeStarted(C8819d dVar, C8819d dVar2, boolean z, ViewGroup viewGroup, ControllerChangeHandler controllerChangeHandler) {
            C12932j.m33818b(viewGroup, "container");
            C12932j.m33818b(controllerChangeHandler, "handler");
            View findViewById = this.f7344e.mo7317e().findViewById(R.id._dialog_container);
            C12932j.m33815a((Object) findViewById, "decorView.findViewById<V…>(R.id._dialog_container)");
            ((ViewGroup) findViewById).setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.core.app.BaseActivity$d */
    static final class C2446d extends C12933k implements Function0<DecorView> {

        /* renamed from: f */
        final /* synthetic */ BaseActivity f7345f;

        C2446d(BaseActivity baseActivity) {
            this.f7345f = baseActivity;
            super(0);
        }

        public final DecorView invoke() {
            BaseActivity.super.setContentView((int) R.layout.decor_view);
            return (DecorView) BaseActivity.super.findViewById(R.id._decor_view);
        }
    }

    /* renamed from: app.zenly.locator.core.app.BaseActivity$e */
    static final class C2447e extends C12933k implements Function0<C8831g> {

        /* renamed from: f */
        final /* synthetic */ BaseActivity f7346f;

        C2447e(BaseActivity baseActivity) {
            this.f7346f = baseActivity;
            super(0);
        }

        public final C8831g invoke() {
            C8831g a = C8811c.m20828a(this.f7346f, (ViewGroup) this.f7346f.mo7317e().findViewById(R.id._dialog_container), null);
            a.mo23998b(true);
            return a;
        }
    }

    /* renamed from: app.zenly.locator.core.app.BaseActivity$f */
    public static final class C2448f implements WindowInsetsListener {

        /* renamed from: e */
        final /* synthetic */ BaseActivity f7347e;

        C2448f(BaseActivity baseActivity) {
            this.f7347e = baseActivity;
        }

        public void onWindowInsetsChanged(View view, Rect rect) {
            C12932j.m33818b(view, "view");
            C12932j.m33818b(rect, "insets");
            InAppNotificationContainer inAppNotificationContainer = this.f7347e.mo7317e().getInAppNotificationContainer();
            inAppNotificationContainer.setPadding(rect.left, rect.top, rect.right, inAppNotificationContainer.getPaddingBottom());
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(BaseActivity.class), "decorView", "getDecorView()Lapp/zenly/locator/core/widget/DecorView;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a(BaseActivity.class), "dialogRouter", "getDialogRouter()Lcom/bluelinelabs/conductor/Router;");
        C12946x.m33839a((C12940r) sVar2);
        f7334m = new KProperty[]{sVar, sVar2};
        new C2444b(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final DecorView mo7317e() {
        Lazy lazy = this.f7337g;
        KProperty kProperty = f7334m[0];
        return (DecorView) lazy.getValue();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(layoutParams, "params");
        mo7317e().getContentView().addView(view, layoutParams);
    }

    /* renamed from: b */
    public final C8831g mo8413b() {
        Lazy lazy = this.f7339i;
        KProperty kProperty = f7334m[1];
        return (C8831g) lazy.getValue();
    }

    /* renamed from: c */
    public final C3144f mo8414c() {
        C3144f fVar = this.f7342l;
        if (fVar != null) {
            return fVar;
        }
        C12932j.m33820c("inAppNotificationService");
        throw null;
    }

    /* renamed from: d */
    public boolean mo6993d() {
        return false;
    }

    public <T extends View> T findViewById(int i) {
        mo7317e();
        return super.findViewById(i);
    }

    public final void onBackPressed() {
        if (!getSupportFragmentManager().mo4132z()) {
            if ((!this.f7338h.isInitialized() || !mo8413b().mo24011i()) && !mo6993d()) {
                super.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppShareSheetLauncherFragment.f7555i.mo8607b(this);
        if (this instanceof RequiresAuthentication) {
            C4702n.f12470a.mo11890a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f7336f.mo36401a();
        this.f7335e.mo7041b();
        C1363a.m6387a(mo7317e(), null);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f7335e.mo7042c();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C1363a.m6387a(mo7317e(), this.f7341k);
        C3144f fVar = new C3144f(mo7317e());
        C12773a.m33432a(fVar.mo9475b(), this.f7336f);
        this.f7342l = fVar;
        this.f7335e.mo7040a();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f7335e.mo7043d();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo8413b().mo23990a(this.f7340j);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo8413b().mo24002b(this.f7340j);
    }

    public void setContentView(int i) {
        mo7317e().getContentView().removeAllViews();
        getLayoutInflater().inflate(i, mo7317e().getContentView());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C3224l.m10224a(this, sb);
        sb.append('}');
        String sb2 = sb.toString();
        C12932j.m33815a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public void setContentView(View view) {
        C12932j.m33818b(view, "view");
        mo7317e().getContentView().removeAllViews();
        mo7317e().getContentView().addView(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(layoutParams, "params");
        mo7317e().getContentView().removeAllViews();
        mo7317e().getContentView().addView(view, layoutParams);
    }
}
