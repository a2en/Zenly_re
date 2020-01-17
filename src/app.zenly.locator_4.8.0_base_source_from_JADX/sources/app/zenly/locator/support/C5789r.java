package app.zenly.locator.support;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.C5724n0.C5730c;
import app.zenly.locator.support.p168di.C5665b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.support.r */
public final class C5789r extends ZenlyController {

    /* renamed from: P */
    private View f14659P;

    /* renamed from: Q */
    private View f14660Q;

    /* renamed from: R */
    private final C12275b f14661R = new C12275b();

    /* renamed from: S */
    private final C5790a f14662S = new C5790a(this);

    /* renamed from: app.zenly.locator.support.r$a */
    public static final class C5790a extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C5789r f14663g;

        C5790a(C5789r rVar) {
            this.f14663g = rVar;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
            String str = "v.context";
            if (valueOf != null && valueOf.intValue() == R.id.button_discover) {
                C5499a aVar = C5498a.f14119e;
                Context context = view.getContext();
                C12932j.m33815a((Object) context, str);
                C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
                this.f14663g.m16196a(C5730c.DISCOVER);
            } else if (valueOf != null && valueOf.intValue() == R.id.button_troubleshooting) {
                C5499a aVar2 = C5498a.f14119e;
                Context context2 = view.getContext();
                C12932j.m33815a((Object) context2, str);
                C5498a.m15602a(aVar2.mo13125a(context2), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
                this.f14663g.m16196a(C5730c.TROUBLESHOOTING);
            } else {
                return;
            }
            C5789r.m16195a(this.f14663g).setEnabled(false);
            C5789r.m16198b(this.f14663g).setEnabled(false);
        }
    }

    /* renamed from: app.zenly.locator.support.r$b */
    static final class C5791b<T> implements Consumer<List<? extends C5730c>> {

        /* renamed from: e */
        final /* synthetic */ View f14664e;

        /* renamed from: f */
        final /* synthetic */ C5789r f14665f;

        C5791b(View view, C5789r rVar) {
            this.f14664e = view;
            this.f14665f = rVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends C5730c> list) {
            View findViewById = this.f14664e.findViewById(R.id.progress);
            C12932j.m33815a((Object) findViewById, "findViewById<View>(R.id.progress)");
            findViewById.setVisibility(8);
            View findViewById2 = this.f14664e.findViewById(R.id.container);
            C12932j.m33815a((Object) findViewById2, "findViewById<View>(R.id.container)");
            findViewById2.setVisibility(0);
            View a = C5789r.m16195a(this.f14665f);
            View findViewById3 = a.findViewById(R.id.discover_title);
            C12932j.m33815a((Object) findViewById3, "findViewById<TextView>(R.id.discover_title)");
            ((TextView) findViewById3).setText(C5730c.DISCOVER.mo13420d());
            View findViewById4 = a.findViewById(R.id.discover_subtitle);
            C12932j.m33815a((Object) findViewById4, "findViewById<TextView>(R.id.discover_subtitle)");
            ((TextView) findViewById4).setText(C5730c.DISCOVER.mo13419c());
            View b = C5789r.m16198b(this.f14665f);
            View findViewById5 = b.findViewById(R.id.troubleshooting_title);
            C12932j.m33815a((Object) findViewById5, "findViewById<TextView>(R.id.troubleshooting_title)");
            ((TextView) findViewById5).setText(C5730c.TROUBLESHOOTING.mo13420d());
            View findViewById6 = b.findViewById(R.id.troubleshooting_subtitle);
            C12932j.m33815a((Object) findViewById6, "findViewById<TextView>(R…troubleshooting_subtitle)");
            ((TextView) findViewById6).setText(C5730c.TROUBLESHOOTING.mo13419c());
        }
    }

    /* renamed from: app.zenly.locator.support.r$c */
    static final class C5792c<T, R> implements Function<C12279e<Throwable>, ObservableSource<?>> {

        /* renamed from: e */
        public static final C5792c f14666e = new C5792c();

        /* renamed from: app.zenly.locator.support.r$c$a */
        static final class C5793a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            public static final C5793a f14667e = new C5793a();

            C5793a() {
            }

            /* renamed from: a */
            public final C12279e<Long> apply(Throwable th) {
                C12932j.m33818b(th, "it");
                return C12279e.m32630h(2, TimeUnit.SECONDS);
            }
        }

        C5792c() {
        }

        /* renamed from: a */
        public final C12279e<Long> apply(C12279e<Throwable> eVar) {
            C12932j.m33818b(eVar, "errors");
            return eVar.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C5793a.f14667e);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m16195a(C5789r rVar) {
        View view = rVar.f14659P;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("discoverButton");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m16198b(C5789r rVar) {
        View view = rVar.f14660Q;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("troubleshootingButton");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f14661R.mo36401a();
        super.mo7066c(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        View view2 = this.f14659P;
        if (view2 != null) {
            view2.setEnabled(true);
            View view3 = this.f14660Q;
            if (view3 != null) {
                view3.setEnabled(true);
            } else {
                C12932j.m33820c("troubleshootingButton");
                throw null;
            }
        } else {
            C12932j.m33820c("discoverButton");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_support_ask_question, viewGroup, false);
        ((ScreenBar) inflate.findViewById(R.id.screen_bar)).setTitle((int) R.string.support_question_title);
        View findViewById = inflate.findViewById(R.id.button_discover);
        findViewById.setOnClickListener(this.f14662S);
        String str = "findViewById<View>(R.id.…ckListener)\n            }";
        C12932j.m33815a((Object) findViewById, str);
        this.f14659P = findViewById;
        View findViewById2 = inflate.findViewById(R.id.button_troubleshooting);
        findViewById2.setOnClickListener(this.f14662S);
        C12932j.m33815a((Object) findViewById2, str);
        this.f14660Q = findViewById2;
        Context context = inflate.getContext();
        C12932j.m33815a((Object) context, "context");
        Disposable d = C5665b.m15987a(context).mo13329a().mo13404e().mo36507l(C5792c.f14666e).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5791b<Object>(inflate, this));
        C12932j.m33815a((Object) d, "zendeskSdk.helpCenterCat…      }\n                }");
        C12773a.m33432a(d, this.f14661R);
        C12932j.m33815a((Object) inflate, "inflater.inflate(R.layou…OnDestroyView)\n\n        }");
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16196a(C5730c cVar) {
        C5919w a = C5919w.f14927W.mo13619a(cVar);
        a.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a2 = C8836h.m21058a((C8819d) a);
        a2.mo24026b(new C8816c());
        a2.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a2);
    }
}
