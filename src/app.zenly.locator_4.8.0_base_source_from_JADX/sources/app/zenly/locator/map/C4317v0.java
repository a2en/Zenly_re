package app.zenly.locator.map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.C0143b;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.MapControllerContract.C2457a;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8012c3;
import p213co.znly.models.services.C8012c3.C8013a;
import p213co.znly.models.services.C8030d3;
import p213co.znly.models.services.C8171m4;
import p213co.znly.models.services.C8171m4.C8172a;
import p213co.znly.models.services.C8171m4.C8173b;
import p213co.znly.models.services.C8187n4;
import p387h.p388a.C12143a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.map.v0 */
public final class C4317v0 {

    /* renamed from: a */
    private static final List<C4318a> f11587a = C12848o.m33643b((Object[]) new C4318a[]{new C4318a(2131231613, R.string.map_lowprecisiondialog_subtitle_nonetwork, R.string.map_lowprecisiondialog_content_nonetwork), new C4318a(2131231525, R.string.map_lowprecisiondialog_subtitle_phoneoff, R.string.map_lowprecisiondialog_content_phoneoff), new C4318a(2131231468, R.string.map_lowprecisiondialog_subtitle_gpsoff, R.string.map_lowprecisiondialog_content_gpsoff), new C4318a(2131231460, R.string.commons_privacy_frozen_location, R.string.map_lowprecisiondialog_content_locationoff)});

    /* renamed from: b */
    public static final C4317v0 f11588b = new C4317v0();

    /* renamed from: app.zenly.locator.map.v0$a */
    private static final class C4318a {

        /* renamed from: a */
        private final int f11589a;

        /* renamed from: b */
        private final int f11590b;

        /* renamed from: c */
        private final int f11591c;

        public C4318a(int i, int i2, int i3) {
            this.f11589a = i;
            this.f11590b = i2;
            this.f11591c = i3;
        }

        /* renamed from: a */
        public final View mo11380a(Context context, ViewGroup viewGroup) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(viewGroup, "parent");
            View inflate = LayoutInflater.from(context).inflate(R.layout.list_item_dialog, viewGroup, false);
            ((ImageView) inflate.findViewById(R.id.image)).setImageResource(this.f11589a);
            View findViewById = inflate.findViewById(R.id.title);
            C12932j.m33815a((Object) findViewById, "findViewById<TextView>(R.id.title)");
            C3275i.m10386a((TextView) findViewById, (CharSequence) context.getString(this.f11590b));
            ((TextView) inflate.findViewById(R.id.subtitle)).setText(this.f11591c);
            C12932j.m33815a((Object) inflate, "LayoutInflater.from(cont…t(subtitle)\n            }");
            return inflate;
        }
    }

    /* renamed from: app.zenly.locator.map.v0$b */
    static final class C4319b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2879d0 f11592e;

        /* renamed from: app.zenly.locator.map.v0$b$a */
        static final class C4320a<T> implements Consumer<C8187n4> {

            /* renamed from: e */
            public static final C4320a f11593e = new C4320a();

            C4320a() {
            }

            /* renamed from: a */
            public final void accept(C8187n4 n4Var) {
                C12143a.m32027a("userRequest onNext", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$b$b */
        static final class C4321b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C4321b f11594e = new C4321b();

            C4321b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C12143a.m32032b(th, "userRequest onError", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$b$c */
        static final class C4322c implements Action {

            /* renamed from: a */
            public static final C4322c f11595a = new C4322c();

            C4322c() {
            }

            public final void run() {
                C12143a.m32027a("userRequest onNext", new Object[0]);
            }
        }

        C4319b(C2879d0 d0Var) {
            this.f11592e = d0Var;
        }

        public final void onClick(View view) {
            C8172a newBuilder = C8171m4.newBuilder();
            C12932j.m33815a((Object) newBuilder, "requestRequest");
            newBuilder.mo22164a(this.f11592e.mo8945g());
            newBuilder.mo22163a(C8173b.DISABLE_CITY);
            C5448c.m15478a().userRequest((C8171m4) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) C4320a.f11593e, (Consumer<? super Throwable>) C4321b.f11594e, (Action) C4322c.f11595a);
        }
    }

    /* renamed from: app.zenly.locator.map.v0$c */
    static final class C4323c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2879d0 f11596e;

        /* renamed from: app.zenly.locator.map.v0$c$a */
        static final class C4324a<T> implements Consumer<C8030d3> {

            /* renamed from: e */
            public static final C4324a f11597e = new C4324a();

            C4324a() {
            }

            /* renamed from: a */
            public final void accept(C8030d3 d3Var) {
                C12143a.m32027a("friendSubscribe onNext", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$c$b */
        static final class C4325b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C4325b f11598e = new C4325b();

            C4325b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C12143a.m32032b(th, "friendSubscribe onError", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$c$c */
        static final class C4326c implements Action {

            /* renamed from: a */
            public static final C4326c f11599a = new C4326c();

            C4326c() {
            }

            public final void run() {
                C12143a.m32027a("friendSubscribe onNext", new Object[0]);
            }
        }

        C4323c(C2879d0 d0Var) {
            this.f11596e = d0Var;
        }

        public final void onClick(View view) {
            C8013a newBuilder = C8012c3.newBuilder();
            newBuilder.mo22056a(this.f11596e.mo8945g());
            C5448c.m15478a().friendSubscribe((C8012c3) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) C4324a.f11597e, (Consumer<? super Throwable>) C4325b.f11598e, (Action) C4326c.f11599a);
        }
    }

    /* renamed from: app.zenly.locator.map.v0$d */
    static final class C4327d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2879d0 f11600e;

        /* renamed from: app.zenly.locator.map.v0$d$a */
        static final class C4328a<T> implements Consumer<C8030d3> {

            /* renamed from: e */
            public static final C4328a f11601e = new C4328a();

            C4328a() {
            }

            /* renamed from: a */
            public final void accept(C8030d3 d3Var) {
                C12143a.m32027a("friendSubscribe onNext", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$d$b */
        static final class C4329b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C4329b f11602e = new C4329b();

            C4329b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C12143a.m32032b(th, "friendSubscribe onError", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$d$c */
        static final class C4330c implements Action {

            /* renamed from: a */
            public static final C4330c f11603a = new C4330c();

            C4330c() {
            }

            public final void run() {
                C12143a.m32027a("friendSubscribe onNext", new Object[0]);
            }
        }

        C4327d(C2879d0 d0Var) {
            this.f11600e = d0Var;
        }

        public final void onClick(View view) {
            C8013a newBuilder = C8012c3.newBuilder();
            newBuilder.mo22056a(this.f11600e.mo8945g());
            C5448c.m15478a().friendSubscribe((C8012c3) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) C4328a.f11601e, (Consumer<? super Throwable>) C4329b.f11602e, (Action) C4330c.f11603a);
        }
    }

    /* renamed from: app.zenly.locator.map.v0$e */
    static final class C4331e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2879d0 f11604e;

        /* renamed from: app.zenly.locator.map.v0$e$a */
        static final class C4332a<T> implements Consumer<C8187n4> {

            /* renamed from: e */
            public static final C4332a f11605e = new C4332a();

            C4332a() {
            }

            /* renamed from: a */
            public final void accept(C8187n4 n4Var) {
                C12143a.m32027a("userRequest onNext", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$e$b */
        static final class C4333b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            public static final C4333b f11606e = new C4333b();

            C4333b() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C12143a.m32032b(th, "userRequest onError", new Object[0]);
            }
        }

        /* renamed from: app.zenly.locator.map.v0$e$c */
        static final class C4334c implements Action {

            /* renamed from: a */
            public static final C4334c f11607a = new C4334c();

            C4334c() {
            }

            public final void run() {
                C12143a.m32027a("userRequest onNext", new Object[0]);
            }
        }

        C4331e(C2879d0 d0Var) {
            this.f11604e = d0Var;
        }

        public final void onClick(View view) {
            C8172a newBuilder = C8171m4.newBuilder();
            C12932j.m33815a((Object) newBuilder, "requestRequest");
            newBuilder.mo22164a(this.f11604e.mo8945g());
            newBuilder.mo22163a(C8173b.ENABLE_WIFI);
            C5448c.m15478a().userRequest((C8171m4) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36413a((Consumer<? super T>) C4332a.f11605e, (Consumer<? super Throwable>) C4333b.f11606e, (Action) C4334c.f11607a);
        }
    }

    private C4317v0() {
    }

    /* renamed from: a */
    public static final C3106c m12896a(Context context, C2457a aVar, C2879d0 d0Var) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "type");
        C12932j.m33818b(d0Var, "user");
        switch (C4403w0.f11891a[aVar.ordinal()]) {
            case 1:
                return f11588b.m12897a(context, d0Var);
            case 2:
                return f11588b.m12898b(context, d0Var);
            case 3:
                return f11588b.m12899c(context, d0Var);
            case 4:
                return f11588b.m12901e(context, d0Var);
            case 5:
            case 6:
            case 7:
                return f11588b.m12900d(context, d0Var);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid callout type: ");
                sb.append(aVar.name());
                C12143a.m32037e(sb.toString(), new Object[0]);
                return null;
        }
    }

    /* renamed from: b */
    private final C3106c m12898b(Context context, C2879d0 d0Var) {
        C3106c cVar = new C3106c(context);
        cVar.mo9349f((int) R.string.map_troubleshoot_title_lowprecision);
        cVar.mo9332a((int) R.string.map_troubleshoot_content_lowprecision, d0Var.mo8942e());
        C3106c a = cVar.mo9301a(true);
        C12932j.m33815a((Object) a, "GenericDialogController.…sibleOnOutsideTouch(true)");
        return a;
    }

    /* renamed from: c */
    private final C3106c m12899c(Context context, C2879d0 d0Var) {
        C4323c cVar = new C4323c(d0Var);
        C3106c cVar2 = new C3106c(context);
        cVar2.mo9340b(R.string.map_subscribe_title_nobattery, d0Var.mo8942e());
        cVar2.mo9338a(context.getString(R.string.map_subscribe_button_getnotified), context.getString(R.string.map_subscribe_button_getnotifieduserback, new Object[]{d0Var.mo8942e()}), cVar);
        C3106c a = cVar2.mo9301a(true);
        C12932j.m33815a((Object) a, "GenericDialogController.…sibleOnOutsideTouch(true)");
        return a;
    }

    /* renamed from: d */
    private final C3106c m12900d(Context context, C2879d0 d0Var) {
        C0143b bVar = new C0143b(context, 2132083208);
        View inflate = LayoutInflater.from(bVar).inflate(R.layout.dialog_content_list, null, false);
        if (inflate != null) {
            ViewGroup viewGroup = (ViewGroup) inflate;
            for (C4318a a : f11587a) {
                viewGroup.addView(a.mo11380a(bVar, viewGroup));
            }
            C4327d dVar = new C4327d(d0Var);
            C3106c cVar = new C3106c(bVar);
            cVar.mo9331a(2131231410);
            cVar.mo9349f((int) R.string.map_lowprecisiondialog_title_possiblereasons);
            cVar.mo9333a((View) viewGroup);
            cVar.mo9338a(context.getString(R.string.map_subscribe_button_getnotified), context.getString(R.string.map_subscribe_button_getnotifieduserback, new Object[]{d0Var.mo8942e()}), dVar);
            C3106c a2 = cVar.mo9301a(true);
            C12932j.m33815a((Object) a2, "GenericDialogController.…sibleOnOutsideTouch(true)");
            return a2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: e */
    private final C3106c m12901e(Context context, C2879d0 d0Var) {
        C4331e eVar = new C4331e(d0Var);
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231614);
        cVar.mo9340b(R.string.map_lowprecisiondialog_title_askwifi, d0Var.mo8942e());
        cVar.mo9338a(context.getString(R.string.map_lowprecisiondialog_button_askwifi), null, eVar);
        C3106c a = cVar.mo9301a(true);
        C12932j.m33815a((Object) a, "GenericDialogController.…sibleOnOutsideTouch(true)");
        return a;
    }

    /* renamed from: a */
    private final C3106c m12897a(Context context, C2879d0 d0Var) {
        C4319b bVar = new C4319b(d0Var);
        C3106c cVar = new C3106c(context);
        cVar.mo9331a(2131231410);
        cVar.mo9340b(R.string.map_lowprecisiondialog_title_blurred, d0Var.mo8942e());
        cVar.mo9338a(context.getString(R.string.map_lowprecisiondialog_subtitle_blurred), null, bVar);
        C3106c a = cVar.mo9301a(true);
        C12932j.m33815a((Object) a, "GenericDialogController.…sibleOnOutsideTouch(true)");
        return a;
    }
}
