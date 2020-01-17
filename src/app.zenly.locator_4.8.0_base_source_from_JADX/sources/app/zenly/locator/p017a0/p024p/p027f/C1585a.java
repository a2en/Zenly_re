package app.zenly.locator.p017a0.p024p.p027f;

import android.content.Context;
import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.p017a0.p024p.p026e.C1576j;
import app.zenly.locator.p017a0.p024p.p026e.C1578l;
import app.zenly.locator.p017a0.p024p.p026e.C1579m;
import app.zenly.locator.p017a0.p024p.p026e.C1581o;
import app.zenly.locator.p017a0.p024p.p026e.C1582p;
import app.zenly.locator.p017a0.p024p.p029h.C1606b;
import app.zenly.locator.p017a0.p024p.p029h.C1607c;
import app.zenly.locator.p017a0.p024p.p029h.C1613h;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;

/* renamed from: app.zenly.locator.a0.p.f.a */
public final class C1585a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f5526f;

    /* renamed from: g */
    private final C12279e<Boolean> f5527g;

    /* renamed from: app.zenly.locator.a0.p.f.a$a */
    private enum C1586a {
        CONTACT,
        DATA_SAFETY,
        HELP,
        LICENSES,
        PHONE_CONFIGURATION,
        POWER_MOVES,
        PRIVACY,
        TERMS;
        

        /* renamed from: e */
        private final long f5537e;

        /* renamed from: a */
        public final long mo7146a() {
            return this.f5537e;
        }
    }

    /* renamed from: app.zenly.locator.a0.p.f.a$b */
    static final class C1587b<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C1585a f5538e;

        C1587b(C1585a aVar) {
            this.f5538e = aVar;
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(Boolean bool) {
            C12932j.m33818b(bool, "needsPhoneConfiguration");
            ArrayList arrayList = new ArrayList();
            long a = C1586a.HELP.mo7146a();
            String string = this.f5538e.f5526f.getString(R.string.app_settings_faqurl);
            C12932j.m33815a((Object) string, "context.getString(R.string.app_settings_faqurl)");
            C1613h hVar = new C1613h(a, R.string.settings_about_button_help, null, null, 0, new C1582p(string), 28, null);
            C12854t.m33651a((Collection) arrayList, (Iterable) C12848o.m33643b((Object[]) new C11722a[]{new C1607c(1, R.string.settings_about_section_about), hVar}));
            if (bool.booleanValue()) {
                C1613h hVar2 = new C1613h(C1586a.PHONE_CONFIGURATION.mo7146a(), R.string.settings_phoneSettings, null, null, 0, C1578l.f5520a, 28, null);
                arrayList.add(hVar2);
            }
            C1613h hVar3 = new C1613h(C1586a.POWER_MOVES.mo7146a(), R.string.settings_about_button_powermoves, null, null, 0, C1579m.f5521a, 28, null);
            arrayList.add(hVar3);
            C1613h hVar4 = new C1613h(C1586a.CONTACT.mo7146a(), R.string.support_main_button, null, null, 0, C1581o.f5523a, 28, null);
            arrayList.add(hVar4);
            C1613h hVar5 = new C1613h(C1586a.DATA_SAFETY.mo7146a(), R.string.settings_about_button_dataSafety, null, null, 0, C1576j.f5518a, 28, null);
            long a2 = C1586a.TERMS.mo7146a();
            String string2 = this.f5538e.f5526f.getString(R.string.app_settings_termsurl);
            C12932j.m33815a((Object) string2, "context.getString(R.string.app_settings_termsurl)");
            C1613h hVar6 = new C1613h(a2, R.string.settings_about_button_termsofuse, null, null, 0, new C1582p(string2), 28, null);
            long a3 = C1586a.PRIVACY.mo7146a();
            String string3 = this.f5538e.f5526f.getString(R.string.app_settings_privacyurl);
            C12932j.m33815a((Object) string3, "context.getString(R.stri….app_settings_privacyurl)");
            C1613h hVar7 = new C1613h(a3, R.string.settings_about_button_confidentiality, null, null, 0, new C1582p(string3), 28, null);
            long a4 = C1586a.LICENSES.mo7146a();
            String string4 = this.f5538e.f5526f.getString(R.string.app_settings_licensesurl_android);
            C12932j.m33815a((Object) string4, "context.getString(R.stri…ings_licensesurl_android)");
            C1613h hVar8 = new C1613h(a4, R.string.settings_about_button_licences, null, null, 0, new C1582p(string4), 28, null);
            C12854t.m33651a((Collection) arrayList, (Iterable) C12848o.m33643b((Object[]) new C11722a[]{hVar5, hVar6, hVar7, hVar8, new C1606b(1, this.f5538e.m6793b())}));
            return C11751f.m30863b(arrayList);
        }
    }

    public C1585a(Context context, C12279e<Boolean> eVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(eVar, "phoneConfigurationObservable");
        this.f5526f = context;
        this.f5527g = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> i = this.f5527g.mo36501i(new C1587b(this));
        C12932j.m33815a((Object) i, "phoneConfigurationObserv…es.copyOf(list)\n        }");
        return i;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m6793b() {
        String string = this.f5526f.getString(R.string.app_name);
        C12932j.m33815a((Object) string, "context.getString(R.string.app_name)");
        String str = "8afd4a3";
        String str2 = "4.8.0";
        if (str.length() == 0) {
            String string2 = this.f5526f.getString(R.string.settings_about_appTag_noBuildId, new Object[]{string, str2});
            C12932j.m33815a((Object) string2, "context.getString(\n     …ERSION_NAME\n            )");
            return string2;
        }
        String string3 = this.f5526f.getString(R.string.settings_about_appTag_withBuildId, new Object[]{string, str2, str});
        C12932j.m33815a((Object) string3, "context.getString(\n     …COMMIT_HASH\n            )");
        return string3;
    }
}
