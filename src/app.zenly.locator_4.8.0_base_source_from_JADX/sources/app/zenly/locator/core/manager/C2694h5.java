package app.zenly.locator.core.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.p143s.p148l.C5448c;
import com.bumptech.glide.load.engine.C8978i;
import java.util.concurrent.Future;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8288t0;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.manager.h5 */
public final class C2694h5 {

    /* renamed from: a */
    private final ZenlySchedulers f7865a = C1351e.m6372a(C2703i5.f7877b.mo19916a("bubblesManager"));

    /* renamed from: b */
    private final C12286f f7866b = this.f7865a.getSingle();

    /* renamed from: c */
    private final C12279e<C2890k> f7867c;

    /* renamed from: d */
    private final C12279e<C2890k> f7868d;

    /* renamed from: app.zenly.locator.core.manager.h5$b */
    private static final class C2696b {

        /* renamed from: a */
        public final UserProto$User f7869a;

        /* renamed from: b */
        public final C2890k f7870b;

        /* renamed from: a */
        public boolean mo8774a() {
            return TextUtils.equals(this.f7869a.getUuid(), this.f7870b.mo8962b().getUserUuid());
        }

        private C2696b(UserProto$User userProto$User, C2890k kVar) {
            this.f7869a = userProto$User;
            this.f7870b = kVar;
        }
    }

    public C2694h5(Context context) {
        ZenlyCore a = C5448c.m15478a();
        C12279e a2 = a.bubblesStream().mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) new C2713k0<Object,Object>(this, C2476d.m8582a(context), C3200e0.m10183a(context, 120))).mo36426a((ObservableSource<? extends U>) a.userMeStream(), (BiFunction<? super T, ? super U, ? extends R>) C2675f0.f7839a);
        this.f7867c = a2.mo36459b((Predicate<? super T>) C2698i0.f7872e).mo36501i(C2682g0.f7846e);
        this.f7868d = a2.mo36459b((Predicate<? super T>) C2728l0.f7945e).mo36501i(C2705j0.f7879e);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m9092c(C2696b bVar) throws Exception {
        return !bVar.mo8774a();
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo8771a(C2485i iVar, int i, C8288t0 t0Var) throws Exception {
        if (!TextUtils.isEmpty(t0Var.getBubble().getBadgeUrl())) {
            return C12279e.m32617a((Future<? extends T>) iVar.m8714a().m8684a(t0Var.getBubble().getBadgeUrl()).m8691a(C8978i.f23423a).m8695a(false).mo24175c(i, i)).mo36452b(this.f7866b).mo36501i(new C2689h0(t0Var)).mo36473c(new C2890k(t0Var.getBubble()));
        }
        return C12279e.m32626e(new C2890k(t0Var.getBubble()));
    }

    /* renamed from: b */
    public C12279e<C2890k> mo8773b() {
        return this.f7867c;
    }

    /* renamed from: a */
    static /* synthetic */ C2890k m9089a(C8288t0 t0Var, Bitmap bitmap) throws Exception {
        return new C2890k(t0Var.getBubble(), bitmap);
    }

    /* renamed from: a */
    static /* synthetic */ C2696b m9088a(C2890k kVar, UserProto$User userProto$User) throws Exception {
        return new C2696b(userProto$User, kVar);
    }

    /* renamed from: a */
    public C12279e<C2890k> mo8772a() {
        return this.f7868d;
    }
}
