package app.zenly.locator.support.p171t0.p192j;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.p072ui.view.StatefulLayout;
import app.zenly.locator.core.p072ui.view.StatefulLayout.C3131a;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.support.C5667e0;
import app.zenly.locator.support.p171t0.p172f.C5826d;
import app.zenly.locator.support.p171t0.p190h.C5890a;
import app.zenly.locator.support.p171t0.p193k.C5905c;
import com.snap.p327ui.event.EventDispatcher;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.reversegeocoder.C7911b;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.support.t0.j.d */
public final class C5899d extends C7717d<C5905c> {

    /* renamed from: e */
    private final ZenlySchedulers f14892e = C1351e.m6372a(C5667e0.f14437b.mo19916a("placeViewBinding"));

    /* renamed from: f */
    private final C12275b f14893f = new C12275b();

    /* renamed from: g */
    private HashMap f14894g;

    /* renamed from: app.zenly.locator.support.t0.j.d$a */
    static final class C5900a<T> implements Consumer<C7911b> {

        /* renamed from: e */
        final /* synthetic */ C5899d f14895e;

        /* renamed from: f */
        final /* synthetic */ Context f14896f;

        /* renamed from: g */
        final /* synthetic */ C5905c f14897g;

        /* renamed from: app.zenly.locator.support.t0.j.d$a$a */
        static final class C5901a implements OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C5900a f14898e;

            /* renamed from: f */
            final /* synthetic */ String f14899f;

            C5901a(C5900a aVar, String str) {
                this.f14898e = aVar;
                this.f14899f = str;
            }

            public final void onClick(View view) {
                EventDispatcher a = this.f14898e.f14895e.mo34491a();
                long a2 = this.f14898e.f14897g.mo13608f().mo13587c().mo9014a();
                C2918b d = this.f14898e.f14897g.mo13608f().mo13587c().mo9017d();
                String str = this.f14899f;
                C12932j.m33815a((Object) str, "formattedAddress");
                a.dispatch(new C5826d(a2, d, str));
            }
        }

        C5900a(C5899d dVar, Context context, C5905c cVar) {
            this.f14895e = dVar;
            this.f14896f = context;
            this.f14897g = cVar;
        }

        /* renamed from: a */
        public final void accept(C7911b bVar) {
            String str;
            ((StatefulLayout) this.f14895e.mo13595a(C3891l.support_ticket_place_subtitle_layout)).setState(C3131a.DATA);
            C12932j.m33815a((Object) bVar, "address");
            String street = bVar.getStreet();
            if (!(street == null || street.length() == 0)) {
                String locality = bVar.getLocality();
                if (!(locality == null || locality.length() == 0)) {
                    str = this.f14896f.getString(R.string.support_places_main_genericAddress, new Object[]{bVar.getStreet(), bVar.getLocality()});
                    AppCompatTextView appCompatTextView = (AppCompatTextView) this.f14895e.mo13595a(C3891l.support_ticket_place_subtitle);
                    C12932j.m33815a((Object) appCompatTextView, "support_ticket_place_subtitle");
                    appCompatTextView.setText(str);
                    this.f14895e.mo34493b().setOnClickListener(new C5901a(this, str));
                }
            }
            str = bVar.getFormattedAddress();
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.f14895e.mo13595a(C3891l.support_ticket_place_subtitle);
            C12932j.m33815a((Object) appCompatTextView2, "support_ticket_place_subtitle");
            appCompatTextView2.setText(str);
            this.f14895e.mo34493b().setOnClickListener(new C5901a(this, str));
        }
    }

    /* renamed from: app.zenly.locator.support.t0.j.d$b */
    static final class C5902b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5899d f14900e;

        C5902b(C5899d dVar) {
            this.f14900e = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32028a(th);
            ((StatefulLayout) this.f14900e.mo13595a(C3891l.support_ticket_place_subtitle_layout)).setState(C3131a.EMPTY);
        }
    }

    /* renamed from: a */
    public View mo13595a(int i) {
        if (this.f14894g == null) {
            this.f14894g = new HashMap();
        }
        View view = (View) this.f14894g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f14894g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* renamed from: f */
    public void mo6954f() {
        this.f14893f.mo36401a();
        ((StatefulLayout) mo13595a(C3891l.support_ticket_place_subtitle_layout)).setState(C3131a.LOADING);
        super.mo6954f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C5905c cVar, C5905c cVar2) {
        String str;
        int i;
        C12932j.m33818b(cVar, "model");
        Context context = mo34493b().getContext();
        int i2 = C5898c.f14891a[cVar.mo13608f().mo13587c().mo9017d().ordinal()];
        String str2 = "context";
        if (i2 == 1) {
            i = 2131230929;
            C12932j.m33815a((Object) context, str2);
            str = m16396a(context, cVar.mo13608f(), R.string.support_places_main_home);
        } else if (i2 == 2) {
            i = C7674a.f19294a;
            str = "";
        } else if (i2 == 3) {
            i = 2131230933;
            C12932j.m33815a((Object) context, str2);
            str = m16396a(context, cVar.mo13608f(), R.string.support_places_main_school);
        } else if (i2 == 4) {
            i = 2131230936;
            C12932j.m33815a((Object) context, str2);
            str = m16396a(context, cVar.mo13608f(), R.string.support_places_main_work);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ((ImageView) mo13595a(C3891l.support_ticket_place_icon)).setImageResource(i);
        ((AppCompatTextView) mo13595a(C3891l.support_ticket_place_title)).setText(str);
        mo34493b().setOnClickListener(null);
        if (cVar.mo13608f().mo13587c().mo9015b() != null) {
            ((StatefulLayout) mo13595a(C3891l.support_ticket_place_subtitle_layout)).setState(C3131a.LOADING);
            Disposable a = cVar.mo13608f().mo13585a().mo36428a((C12286f) this.f14892e.getMainThread()).mo36412a((Consumer<? super T>) new C5900a<Object>(this, context, cVar), (Consumer<? super Throwable>) new C5902b<Object>(this));
            C12932j.m33815a((Object) a, "model.personalPlace.addr…      }\n                )");
            C12773a.m33432a(a, this.f14893f);
            return;
        }
        ((StatefulLayout) mo13595a(C3891l.support_ticket_place_subtitle_layout)).setState(C3131a.EMPTY);
    }

    /* renamed from: a */
    private final String m16396a(Context context, C5890a aVar, int i) {
        if (aVar.mo13588d()) {
            String string = context.getString(i);
            C12932j.m33815a((Object) string, "context.getString(defaultStringRes)");
            return string;
        }
        int a = C3245z.m10280a(C3245z.m10282a(aVar.mo13586b()));
        String quantityString = context.getResources().getQuantityString(R.plurals.support_places_main_lastVisit_days, a, new Object[]{Integer.valueOf(a)});
        C12932j.m33815a((Object) quantityString, "context.resources.getQua…ys, daysSince, daysSince)");
        return quantityString;
    }
}
