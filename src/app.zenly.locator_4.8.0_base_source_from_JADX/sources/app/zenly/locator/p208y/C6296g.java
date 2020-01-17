package app.zenly.locator.p208y;

import android.content.Context;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.C3140d;
import app.zenly.locator.core.p072ui.view.C3144f;
import app.zenly.locator.core.p072ui.view.SimpleInAppNotificationViewBuilder;
import app.zenly.locator.p143s.p148l.C5448c;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.y.g */
public final class C6296g {

    /* renamed from: a */
    private final Lazy<C3140d> f15814a;

    /* renamed from: b */
    private final Provider<C3144f> f15815b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12785a<Boolean> f15816c;

    /* renamed from: app.zenly.locator.y.g$a */
    static final class C6297a extends C12933k implements Function0<C3140d> {

        /* renamed from: f */
        final /* synthetic */ C6296g f15817f;

        /* renamed from: g */
        final /* synthetic */ Context f15818g;

        /* renamed from: app.zenly.locator.y.g$a$a */
        static final class C6298a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C6297a f15819e;

            C6298a(C6297a aVar) {
                this.f15819e = aVar;
            }

            public final void run() {
                this.f15819e.f15817f.f15816c.onNext(Boolean.valueOf(true));
            }
        }

        /* renamed from: app.zenly.locator.y.g$a$b */
        static final class C6299b implements Runnable {

            /* renamed from: e */
            public static final C6299b f15820e = new C6299b();

            C6299b() {
            }

            public final void run() {
                C5448c.m15478a().resetSyncTimeout();
            }
        }

        C6297a(C6296g gVar, Context context) {
            this.f15817f = gVar;
            this.f15818g = context;
            super(0);
        }

        public final C3140d invoke() {
            SimpleInAppNotificationViewBuilder simpleInAppNotificationViewBuilder = new SimpleInAppNotificationViewBuilder();
            simpleInAppNotificationViewBuilder.mo9434b(this.f15818g.getString(R.string.banner_phoneSettings_title));
            simpleInAppNotificationViewBuilder.mo9433a(this.f15818g.getString(R.string.banner_phoneSettings_message));
            simpleInAppNotificationViewBuilder.mo9432a(C0540a.m2546c(this.f15818g, 2131231574));
            C3140d dVar = new C3140d(simpleInAppNotificationViewBuilder.mo9431a(this.f15818g), true, false, new C6298a(this), C6299b.f15820e, 4, null);
            return dVar;
        }
    }

    public C6296g(Context context, Provider<C3144f> provider, C12785a<Boolean> aVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(provider, "inAppNotificationService");
        C12932j.m33818b(aVar, "hasOpenedNotificationObservable");
        this.f15815b = provider;
        this.f15816c = aVar;
        this.f15814a = C12896f.m33751a(new C6297a(this, context));
    }

    /* renamed from: b */
    private final void m17357b() {
        ((C3144f) this.f15815b.get()).mo9476b((C3140d) this.f15814a.getValue());
    }

    /* renamed from: a */
    public final void mo14146a(boolean z) {
        if (z) {
            m17357b();
        } else {
            m17356a();
        }
    }

    /* renamed from: a */
    private final void m17356a() {
        if (this.f15814a.isInitialized()) {
            ((C3144f) this.f15815b.get()).mo9474a((C3140d) this.f15814a.getValue());
        }
    }
}
