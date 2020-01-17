package app.zenly.locator.p017a0.p024p.p027f;

import android.content.Context;
import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.p017a0.p024p.C1560b;
import app.zenly.locator.p017a0.p024p.p025d.C1562a;
import app.zenly.locator.p017a0.p024p.p025d.C1564b;
import app.zenly.locator.p017a0.p024p.p026e.C1569d;
import app.zenly.locator.p017a0.p024p.p026e.C1570e;
import app.zenly.locator.p017a0.p024p.p026e.C1577k;
import app.zenly.locator.p017a0.p024p.p026e.C1580n;
import app.zenly.locator.p017a0.p024p.p026e.C1583q;
import app.zenly.locator.p017a0.p024p.p026e.C1584r;
import app.zenly.locator.p017a0.p024p.p029h.C1607c;
import app.zenly.locator.p017a0.p024p.p029h.C1608d;
import app.zenly.locator.p017a0.p024p.p029h.C1610e;
import app.zenly.locator.p017a0.p024p.p029h.C1612g;
import app.zenly.locator.p017a0.p024p.p029h.C1613h;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.a0.p.f.b */
public final class C1588b extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f5539f;

    /* renamed from: g */
    private final C12279e<UserProto$User> f5540g;

    /* renamed from: h */
    private final C12279e<C1564b> f5541h;

    /* renamed from: app.zenly.locator.a0.p.f.b$a */
    private enum C1589a {
        MAP_OPTIONS,
        NOTIFICATIONS,
        PERSONAL_SETTINGS,
        SKI_SLOPES,
        UNITS_FORMATTING;
        

        /* renamed from: e */
        private final long f5548e;

        /* renamed from: a */
        public final long mo7148a() {
            return this.f5548e;
        }
    }

    /* renamed from: app.zenly.locator.a0.p.f.b$b */
    public static final class C1590b<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C1588b f5549a;

        public C1590b(C1588b bVar) {
            this.f5549a = bVar;
        }

        public final R apply(T1 t1, T2 t2) {
            C1564b bVar = (C1564b) t2;
            UserProto$User userProto$User = (UserProto$User) t1;
            C1613h hVar = new C1613h(C1589a.NOTIFICATIONS.mo7148a(), R.string.settings_managenotifications_title_manage, null, null, 0, C1577k.f5519a, 28, null);
            C1610e eVar = new C1610e(C1589a.MAP_OPTIONS.mo7148a(), (int) R.string.settings_configure_label_mapoptions, C12848o.m33643b((Object[]) new C1608d[]{new C1608d(C1560b.f5481a.mo7104b(), C1562a.f5494e.mo7107a().mo7105a(bVar.mo7110a())), new C1608d(C12848o.m33643b((Object[]) new Integer[]{Integer.valueOf(R.string.settings_configure_option_zenly), Integer.valueOf(R.string.settings_configure_option_standard), Integer.valueOf(R.string.settings_configure_option_satellite)}), C1562a.f5494e.mo7108b().mo7105a(bVar.mo7112b()))}), (Function2<? super Integer, ? super Integer, ? extends C1583q>) C1591c.f5550f);
            C1610e eVar2 = new C1610e(C1589a.UNITS_FORMATTING.mo7148a(), (int) R.string.settings_configure_unitsFormatting, new C1608d(C12848o.m33643b((Object[]) new Integer[]{Integer.valueOf(R.string.settings_configure_unitsFormatting_options_kmc), Integer.valueOf(R.string.settings_configure_unitsFormatting_options_mif), Integer.valueOf(R.string.settings_configure_unitsFormatting_options_mic)}), C1562a.f5494e.mo7109c().mo7105a(bVar.mo7113c())), (Function2<? super Integer, ? super Integer, ? extends C1583q>) C1592d.f5551f);
            long a = C1589a.SKI_SLOPES.mo7148a();
            String string = this.f5549a.f5539f.getString(R.string.settings_bonus_button_skislopes);
            C12932j.m33815a((Object) string, "context.getString(R.stri…s_bonus_button_skislopes)");
            C1612g gVar = new C1612g(a, string, this.f5549a.f5539f.getString(R.string.settings_bonus_button_skislopes_subtitle), userProto$User.getShowSkiMaps(), new C1584r(!userProto$User.getShowSkiMaps()));
            C1613h hVar2 = new C1613h(C1589a.PERSONAL_SETTINGS.mo7148a(), R.string.settings_personal_title, null, null, 0, C1580n.f5522a, 28, null);
            return C11751f.m30863b(C12848o.m33643b((Object[]) new C11722a[]{new C1607c(1, R.string.settings_configure_section_configure), hVar, eVar, eVar2, gVar, hVar2}));
        }
    }

    /* renamed from: app.zenly.locator.a0.p.f.b$c */
    static final class C1591c extends C12933k implements Function2<Integer, Integer, C1569d> {

        /* renamed from: f */
        public static final C1591c f5550f = new C1591c();

        C1591c() {
            super(2);
        }

        /* renamed from: a */
        public final C1569d mo7150a(int i, int i2) {
            return new C1569d(i, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo7150a(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* renamed from: app.zenly.locator.a0.p.f.b$d */
    static final class C1592d extends C12933k implements Function2<Integer, Integer, C1570e> {

        /* renamed from: f */
        public static final C1592d f5551f = new C1592d();

        C1592d() {
            super(2);
        }

        /* renamed from: a */
        public final C1570e mo7152a(int i, int i2) {
            return new C1570e(i, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo7152a(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public C1588b(Context context, C12279e<UserProto$User> eVar, C12279e<C1564b> eVar2) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(eVar, "userObservable");
        C12932j.m33818b(eVar2, "preferencesObservable");
        this.f5539f = context;
        this.f5540g = eVar;
        this.f5541h = eVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) this.f5540g, (ObservableSource<? extends T2>) this.f5541h, (BiFunction<? super T1, ? super T2, ? extends R>) new C1590b<Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…es.copyOf(list)\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
