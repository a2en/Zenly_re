package app.zenly.locator.core.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import androidx.core.content.FileProvider;
import app.zenly.locator.core.config.C2455a.C2456a;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.util.C3195c;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p255e.C7659a;
import p333g.p382g.p383a.C12125b;
import p387h.p388a.C12143a;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;

public final class MediaHelper {

    /* renamed from: a */
    private final C12125b f7500a = new C12125b(this.f7501b);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Activity f7501b;

    /* renamed from: c */
    private final int f7502c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Callback f7503d;

    public interface Callback {
        void onPictureCanceled(C2498b bVar);

        void onPictureLoaded(C2498b bVar);

        void onPictureLoading(C2498b bVar);
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$a */
    public static final class C2497a {
        private C2497a() {
        }

        public /* synthetic */ C2497a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$b */
    public static final class C2498b implements Serializable {

        /* renamed from: e */
        private int f7504e;

        /* renamed from: f */
        private String f7505f;

        /* renamed from: app.zenly.locator.core.helper.MediaHelper$b$a */
        public static final class C2499a {
            private C2499a() {
            }

            public /* synthetic */ C2499a(C12928f fVar) {
                this();
            }
        }

        static {
            new C2499a(null);
        }

        public C2498b() {
            this(0, null, 3, null);
        }

        public C2498b(int i, String str) {
            this.f7504e = i;
            this.f7505f = str;
        }

        /* renamed from: a */
        public final void mo8571a(int i) {
            this.f7504e = i;
        }

        /* renamed from: b */
        public final int mo8573b() {
            return this.f7504e;
        }

        public /* synthetic */ C2498b(int i, String str, int i2, C12928f fVar) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            this(i, str);
        }

        /* renamed from: a */
        public final String mo8570a() {
            return this.f7505f;
        }

        /* renamed from: a */
        public final void mo8572a(String str) {
            this.f7505f = str;
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$c */
    static final class C2500c<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C2500c f7506e = new C2500c();

        C2500c() {
        }

        /* renamed from: a */
        public final Boolean mo8574a(Boolean bool) {
            C12932j.m33818b(bool, "permissionChanged");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo8574a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$d */
    static final class C2501d<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ MediaHelper f7507e;

        /* renamed from: f */
        final /* synthetic */ C2498b f7508f;

        C2501d(MediaHelper mediaHelper, C2498b bVar) {
            this.f7507e = mediaHelper;
            this.f7508f = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f7507e.m8743c(this.f7508f);
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$e */
    static final class C2502e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2502e f7509e = new C2502e();

        C2502e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting read external storage permission", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$f */
    public static final class C2503f implements RequestListener<Bitmap> {

        /* renamed from: e */
        final /* synthetic */ MediaHelper f7510e;

        /* renamed from: f */
        final /* synthetic */ C2498b f7511f;

        C2503f(MediaHelper mediaHelper, C2498b bVar) {
            this.f7510e = mediaHelper;
            this.f7511f = bVar;
        }

        /* renamed from: a */
        public boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, C8882a aVar, boolean z) {
            C12932j.m33818b(bitmap, "resource");
            if (C3195c.m10165a(new File(this.f7511f.mo8570a()), bitmap)) {
                this.f7510e.f7503d.onPictureLoaded(this.f7511f);
            } else {
                this.f7510e.f7503d.onPictureCanceled(this.f7511f);
            }
            return true;
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Bitmap> target, boolean z) {
            this.f7510e.f7503d.onPictureCanceled(this.f7511f);
            return true;
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$g */
    public static final class C2504g implements RequestListener<Bitmap> {

        /* renamed from: e */
        final /* synthetic */ MediaHelper f7512e;

        /* renamed from: f */
        final /* synthetic */ C2498b f7513f;

        C2504g(MediaHelper mediaHelper, C2498b bVar) {
            this.f7512e = mediaHelper;
            this.f7513f = bVar;
        }

        /* renamed from: a */
        public boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, C8882a aVar, boolean z) {
            C12932j.m33818b(bitmap, "resource");
            File a = C3231q.m10236a((Context) this.f7512e.f7501b, C3232a.PICTURES, (String) null, 4, (Object) null);
            if (a == null || !C3195c.m10165a(a, bitmap)) {
                this.f7512e.f7503d.onPictureCanceled(this.f7513f);
            } else {
                this.f7513f.mo8572a(a.getPath());
                this.f7512e.f7503d.onPictureLoaded(this.f7513f);
            }
            return true;
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Bitmap> target, boolean z) {
            this.f7512e.f7503d.onPictureCanceled(this.f7513f);
            return true;
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$h */
    static final class C2505h<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C2505h f7514e = new C2505h();

        C2505h() {
        }

        /* renamed from: a */
        public final Boolean mo8579a(Boolean bool) {
            C12932j.m33818b(bool, "permissionChanged");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo8579a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$i */
    static final class C2506i<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ MediaHelper f7515e;

        /* renamed from: f */
        final /* synthetic */ C2498b f7516f;

        C2506i(MediaHelper mediaHelper, C2498b bVar) {
            this.f7515e = mediaHelper;
            this.f7516f = bVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f7515e.m8744d(this.f7516f);
        }
    }

    /* renamed from: app.zenly.locator.core.helper.MediaHelper$j */
    static final class C2507j<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2507j f7517e = new C2507j();

        C2507j() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting camera permission", new Object[0]);
        }
    }

    static {
        new C2497a(null);
    }

    public MediaHelper(Activity activity, int i, Callback callback) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(callback, "callback");
        this.f7501b = activity;
        this.f7502c = i;
        this.f7503d = callback;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m8743c(C2498b bVar) {
        Intent dataAndType = new Intent("android.intent.action.PICK").setDataAndType(Media.EXTERNAL_CONTENT_URI, "image/*");
        C12932j.m33815a((Object) dataAndType, "Intent(Intent.ACTION_PIC…L_CONTENT_URI, \"image/*\")");
        bVar.mo8571a(2);
        C7659a.m18651a(this.f7501b, dataAndType, this.f7502c);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m8744d(C2498b bVar) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.f7501b.getPackageManager()) != null) {
            File a = C3231q.m10236a((Context) this.f7501b, C3232a.PICTURES, (String) null, 4, (Object) null);
            if (a != null) {
                intent.putExtra("output", FileProvider.m2525a(this.f7501b, C2456a.m8571a(this.f7501b), a));
                intent.addFlags(1);
                bVar.mo8571a(1);
                bVar.mo8572a(a.getAbsolutePath());
                C7659a.m18651a(this.f7501b, intent, this.f7502c);
            }
        }
    }

    /* renamed from: e */
    private final void m8745e(C2498b bVar) {
        this.f7503d.onPictureLoading(bVar);
        C2476d.m8581a(this.f7501b).m8714a().m8684a(bVar.mo8570a()).m8691a(C8978i.f23424b).mo8542f().mo8539b((RequestListener<TranscodeType>) new C2503f<TranscodeType>(this, bVar)).mo24175c(1024, 1024);
    }

    /* renamed from: a */
    public final void mo8565a(C2498b bVar, int i, Intent intent) {
        C12932j.m33818b(bVar, "shuttle");
        if (i == -1) {
            int b = bVar.mo8573b();
            if (b == 1) {
                m8745e(bVar);
            } else if (b == 2 && intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    C12932j.m33815a((Object) data, "it");
                    m8739a(bVar, data);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8566b(C2498b bVar) {
        C12932j.m33818b(bVar, "shuttle");
        this.f7500a.mo35910c("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE").mo36459b((Predicate<? super T>) C2505h.f7514e).mo36412a((Consumer<? super T>) new C2506i<Object>(this, bVar), (Consumer<? super Throwable>) C2507j.f7517e);
    }

    /* renamed from: a */
    public final void mo8564a(C2498b bVar) {
        C12932j.m33818b(bVar, "shuttle");
        this.f7500a.mo35910c("android.permission.READ_EXTERNAL_STORAGE").mo36459b((Predicate<? super T>) C2500c.f7506e).mo36412a((Consumer<? super T>) new C2501d<Object>(this, bVar), (Consumer<? super Throwable>) C2502e.f7509e);
    }

    /* renamed from: a */
    private final void m8739a(C2498b bVar, Uri uri) {
        this.f7503d.onPictureLoading(bVar);
        C2476d.m8581a(this.f7501b).m8714a().m8678a(uri).m8691a(C8978i.f23424b).mo8542f().mo8539b((RequestListener<TranscodeType>) new C2504g<TranscodeType>(this, bVar)).mo24175c(1024, 1024);
    }
}
