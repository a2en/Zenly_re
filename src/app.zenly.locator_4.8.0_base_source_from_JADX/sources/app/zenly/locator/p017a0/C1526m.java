package app.zenly.locator.p017a0;

import android.content.Context;
import android.widget.Toast;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask.Builder;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8141k3;
import p213co.znly.models.services.C8141k3.C8142a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.a0.m */
public final class C1526m {

    /* renamed from: a */
    private static final ZenlySchedulers f5416a = C1351e.m6372a(C1525l.f5415b.mo19916a("settingsUtil"));

    /* renamed from: b */
    public static final C1526m f5417b = new C1526m();

    /* renamed from: app.zenly.locator.a0.m$a */
    static final class C1527a<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        public static final C1527a f5418e = new C1527a();

        C1527a() {
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
        }
    }

    /* renamed from: app.zenly.locator.a0.m$b */
    static final class C1528b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ Context f5419e;

        C1528b(Context context) {
            this.f5419e = context;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f5419e, R.string.commons_content_oopserror, 1).show();
        }
    }

    private C1526m() {
    }

    /* renamed from: a */
    public static final Disposable m6698a(UserProto$User userProto$User, Context context) {
        C12932j.m33818b(userProto$User, "updatedUser");
        C12932j.m33818b(context, "context");
        return f5417b.m6699a(userProto$User, "user.birthdate", context);
    }

    /* renamed from: b */
    public static final Disposable m6700b(UserProto$User userProto$User, Context context) {
        C12932j.m33818b(userProto$User, "updatedUser");
        C12932j.m33818b(context, "context");
        return f5417b.m6699a(userProto$User, "user.disabled_notifications", context);
    }

    /* renamed from: c */
    public static final Disposable m6701c(UserProto$User userProto$User, Context context) {
        C12932j.m33818b(userProto$User, "updatedUser");
        C12932j.m33818b(context, "context");
        return f5417b.m6699a(userProto$User, "user.name", context);
    }

    /* renamed from: d */
    public static final Disposable m6702d(UserProto$User userProto$User, Context context) {
        C12932j.m33818b(userProto$User, "updatedUser");
        C12932j.m33818b(context, "context");
        return f5417b.m6699a(userProto$User, "user.opt_out_suggest", context);
    }

    /* renamed from: e */
    public static final Disposable m6703e(UserProto$User userProto$User, Context context) {
        C12932j.m33818b(userProto$User, "updatedUser");
        C12932j.m33818b(context, "context");
        return f5417b.m6699a(userProto$User, "user.private_mode", context);
    }

    /* renamed from: f */
    public static final Disposable m6704f(UserProto$User userProto$User, Context context) {
        C12932j.m33818b(userProto$User, "updatedUser");
        C12932j.m33818b(context, "context");
        return f5417b.m6699a(userProto$User, "user.show_ski_maps", context);
    }

    /* renamed from: a */
    private final Disposable m6699a(UserProto$User userProto$User, String str, Context context) {
        Context applicationContext = context.getApplicationContext();
        C8142a newBuilder = C8141k3.newBuilder();
        Builder newBuilder2 = FieldMask.newBuilder();
        newBuilder2.addPaths(str);
        newBuilder.mo22156a(newBuilder2);
        newBuilder.mo22158a(userProto$User);
        Disposable a = C5448c.m15478a().userUpdate((C8141k3) newBuilder.build()).mo36428a((C12286f) f5416a.getMainThread()).mo36412a((Consumer<? super T>) C1527a.f5418e, (Consumer<? super Throwable>) new C1528b<Object>(applicationContext));
        C12932j.m33815a((Object) a, "ZenlyCoreProvider.get().…          }\n            )");
        return a;
    }
}
