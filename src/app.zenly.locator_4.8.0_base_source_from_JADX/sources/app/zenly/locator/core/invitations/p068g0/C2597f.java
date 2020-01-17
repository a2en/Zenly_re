package app.zenly.locator.core.invitations.p068g0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import app.zenly.locator.experimental.referrer.C3746a;
import com.snapchat.kit.sdk.SnapCreative;
import com.snapchat.kit.sdk.creative.media.SnapSticker;
import com.snapchat.kit.sdk.creative.models.SnapLiveCameraContent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;

/* renamed from: app.zenly.locator.core.invitations.g0.f */
public final class C2597f {

    /* renamed from: a */
    private final ZenlySchedulers f7688a = C1351e.m6372a(C2593c.f7686b.mo19916a("snapchat"));

    /* renamed from: b */
    private final int f7689b = C3200e0.m10183a((Context) this.f7690c, 255);

    /* renamed from: c */
    private final Activity f7690c;

    /* renamed from: d */
    private final int f7691d;

    /* renamed from: app.zenly.locator.core.invitations.g0.f$a */
    private static final class C2598a {

        /* renamed from: a */
        private final Bitmap f7692a;

        /* renamed from: b */
        private final File f7693b;

        public C2598a(Bitmap bitmap, File file) {
            C12932j.m33818b(bitmap, "bitmap");
            C12932j.m33818b(file, "file");
            this.f7692a = bitmap;
            this.f7693b = file;
        }

        /* renamed from: a */
        public final Bitmap mo8715a() {
            return this.f7692a;
        }

        /* renamed from: b */
        public final File mo8716b() {
            return this.f7693b;
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.g0.f$b */
    public static final class C2599b {
        private C2599b() {
        }

        public /* synthetic */ C2599b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.g0.f$c */
    static final /* synthetic */ class C2600c extends C12931i implements Function0<Bitmap> {
        C2600c(C2597f fVar) {
            super(0, fVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2597f.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "loadImageFromUrl()Landroid/graphics/Bitmap;";
        }

        public final String getName() {
            return "loadImageFromUrl";
        }

        public final Bitmap invoke() {
            return ((C2597f) this.f33505f).m8929b();
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.g0.f$d */
    static final /* synthetic */ class C2601d extends C12931i implements Function1<Bitmap, C12279e<C2598a>> {
        C2601d(C2597f fVar) {
            super(1, fVar);
        }

        /* renamed from: a */
        public final C12279e<C2598a> invoke(Bitmap bitmap) {
            C12932j.m33818b(bitmap, "p1");
            return ((C2597f) this.f33505f).m8925a(bitmap);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2597f.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "generateFile(Landroid/graphics/Bitmap;)Lio/reactivex/Observable;";
        }

        public final String getName() {
            return "generateFile";
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.g0.f$e */
    static final /* synthetic */ class C2602e extends C12931i implements Function1<C2598a, C12956q> {
        C2602e(C2597f fVar) {
            super(1, fVar);
        }

        /* renamed from: a */
        public final void mo8718a(C2598a aVar) {
            C12932j.m33818b(aVar, "p1");
            ((C2597f) this.f33505f).m8927a(aVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2597f.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "shareImage(Lapp/zenly/locator/core/invitations/broadcast/SnapchatBroadcastSharingVariant$BitmapFile;)V";
        }

        public final String getName() {
            return "shareImage";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo8718a((C2598a) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.g0.f$f */
    static final /* synthetic */ class C2603f extends C12931i implements Function1<Throwable, C12956q> {

        /* renamed from: i */
        public static final C2603f f7694i = new C2603f();

        C2603f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo8719a(Throwable th) {
            C12143a.m32028a(th);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12143a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public final String getName() {
            return "e";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo8719a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    static {
        new C2599b(null);
    }

    public C2597f(Activity activity, int i) {
        C12932j.m33818b(activity, "activity");
        this.f7690c = activity;
        this.f7691d = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Bitmap m8929b() {
        return (Bitmap) C2476d.m8581a(this.f7690c).m8714a().m8684a(this.f7690c.getString(R.string.snapSticker_url)).m8695a(true).mo24170M().get();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [app.zenly.locator.core.invitations.g0.f$f, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r3v0, types: [app.zenly.locator.core.invitations.g0.g] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p389io.reactivex.disposables.Disposable mo8714a() {
        /*
            r4 = this;
            app.zenly.locator.core.invitations.g0.f$c r0 = new app.zenly.locator.core.invitations.g0.f$c
            r0.<init>(r4)
            app.zenly.locator.core.invitations.g0.i r1 = new app.zenly.locator.core.invitations.g0.i
            r1.<init>(r0)
            io.reactivex.e r0 = p389io.reactivex.C12279e.m32616a(r1)
            app.zenly.locator.core.invitations.g0.f$d r1 = new app.zenly.locator.core.invitations.g0.f$d
            r1.<init>(r4)
            app.zenly.locator.core.invitations.g0.h r2 = new app.zenly.locator.core.invitations.g0.h
            r2.<init>(r1)
            io.reactivex.e r0 = r0.mo36509m(r2)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r1 = r4.f7688a
            app.zenly.android.feature.base.scheduling.b r1 = r1.getComputation()
            io.reactivex.e r0 = r0.mo36452b(r1)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r1 = r4.f7688a
            app.zenly.android.feature.base.scheduling.b r1 = r1.getMainThread()
            io.reactivex.e r0 = r0.mo36428a(r1)
            app.zenly.locator.core.invitations.g0.f$e r1 = new app.zenly.locator.core.invitations.g0.f$e
            r1.<init>(r4)
            app.zenly.locator.core.invitations.g0.g r2 = new app.zenly.locator.core.invitations.g0.g
            r2.<init>(r1)
            app.zenly.locator.core.invitations.g0.f$f r1 = app.zenly.locator.core.invitations.p068g0.C2597f.C2603f.f7694i
            if (r1 == 0) goto L_0x0044
            app.zenly.locator.core.invitations.g0.g r3 = new app.zenly.locator.core.invitations.g0.g
            r3.<init>(r1)
            r1 = r3
        L_0x0044:
            io.reactivex.functions.Consumer r1 = (p389io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r0 = r0.mo36412a(r2, r1)
            java.lang.String r1 = "Observable.fromCallable(…(::shareImage, Timber::e)"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.p068g0.C2597f.mo8714a():io.reactivex.disposables.Disposable");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<C2598a> m8925a(Bitmap bitmap) {
        String str = "Observable.empty<BitmapFile>()";
        try {
            File a = C3231q.m10236a((Context) this.f7690c, C3232a.PICTURES, (String) null, 4, (Object) null);
            if (a != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(a);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
                C12279e<C2598a> e = C12279e.m32626e(new C2598a(bitmap, a));
                C12932j.m33815a((Object) e, "Observable.just(BitmapFile(it, file))");
                return e;
            }
            C12279e<C2598a> q = C12279e.m32633q();
            C12932j.m33815a((Object) q, str);
            return q;
        } catch (Exception unused) {
            C12279e<C2598a> q2 = C12279e.m32633q();
            C12932j.m33815a((Object) q2, str);
            return q2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8927a(C2598a aVar) throws Exception {
        SnapLiveCameraContent snapLiveCameraContent = new SnapLiveCameraContent();
        SnapSticker snapStickerFromFile = SnapCreative.getMediaFactory(this.f7690c).getSnapStickerFromFile(aVar.mo8716b());
        snapStickerFromFile.setWidth((float) this.f7689b);
        snapStickerFromFile.setHeight(((float) this.f7689b) * ((float) (aVar.mo8715a().getWidth() / aVar.mo8715a().getHeight())));
        snapStickerFromFile.setPosX(0.5f);
        snapStickerFromFile.setPosY(0.6f);
        snapLiveCameraContent.setSnapSticker(snapStickerFromFile);
        snapLiveCameraContent.setAttachmentUrl(C3746a.f10026e.mo10297a(this.f7690c).mo10296a(this.f7691d, C2549b0.f7613e.mo8688c()));
        SnapCreative.getApi(this.f7690c).send(snapLiveCameraContent);
        aVar.mo8715a().recycle();
    }
}
