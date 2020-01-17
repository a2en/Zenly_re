package app.zenly.locator.username.idcard;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0889u;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p213co.znly.models.services.C8141k3;
import p213co.znly.models.services.C8141k3.C8142a;
import p213co.znly.models.services.C8155l3;
import p387h.p388a.C12143a;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.username.idcard.d */
public final class C6023d extends C0889u {

    /* renamed from: app.zenly.locator.username.idcard.d$a */
    public static final class C6024a {
        private C6024a() {
        }

        public /* synthetic */ C6024a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.d$b */
    static final class C6025b<T> implements Consumer<C8155l3> {

        /* renamed from: e */
        public static final C6025b f15158e = new C6025b();

        C6025b() {
        }

        /* renamed from: a */
        public final void accept(C8155l3 l3Var) {
            C12143a.m32027a("idCardStyle saved", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.d$c */
    static final class C6026c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C6026c f15159e = new C6026c();

        C6026c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32034c(th, "Unable to save idCardStyle", new Object[0]);
        }
    }

    static {
        new C6024a(null);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public final void mo13791a(int i) {
        C12143a.m32027a("doSaveIdCardStyle", new Object[0]);
        C8142a newBuilder = C8141k3.newBuilder();
        newBuilder.mo22157a((FieldMask) FieldMask.newBuilder().addPaths("user.id_card_style").build());
        C6925a newBuilder2 = UserProto$User.newBuilder();
        newBuilder2.mo18015a(i);
        newBuilder.mo22158a((UserProto$User) newBuilder2.build());
        C5448c.m15478a().userUpdateWithErrors((C8141k3) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) C6025b.f15158e, (Consumer<? super Throwable>) C6026c.f15159e);
    }
}
