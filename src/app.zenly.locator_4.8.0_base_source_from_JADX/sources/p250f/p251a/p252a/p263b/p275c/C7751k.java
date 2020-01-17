package p250f.p251a.p252a.p263b.p275c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Size;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p275c.p277m.C7763a;
import p389io.reactivex.C12291g;
import p389io.reactivex.functions.Action;

/* renamed from: f.a.a.b.c.k */
public final class C7751k {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f19407c;

    /* renamed from: a */
    private final Lazy f19408a = C12896f.m33751a(new C7757f(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f19409b;

    /* renamed from: f.a.a.b.c.k$a */
    public static final class C7752a {
        private C7752a() {
        }

        public /* synthetic */ C7752a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: f.a.a.b.c.k$b */
    static final class C7753b<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ C7751k f19410e;

        /* renamed from: f */
        final /* synthetic */ C7763a f19411f;

        /* renamed from: g */
        final /* synthetic */ Size f19412g;

        /* renamed from: h */
        final /* synthetic */ CancellationSignal f19413h;

        C7753b(C7751k kVar, C7763a aVar, Size size, CancellationSignal cancellationSignal) {
            this.f19410e = kVar;
            this.f19411f = aVar;
            this.f19412g = size;
            this.f19413h = cancellationSignal;
        }

        public final Drawable call() {
            Bitmap bitmap = null;
            try {
                Uri c = this.f19411f.mo19974c();
                if (c != null) {
                    bitmap = this.f19410e.f19409b.getContentResolver().loadThumbnail(c, this.f19412g, this.f19413h);
                }
            } catch (OperationCanceledException unused) {
            } catch (IOException e) {
                e.printStackTrace();
            }
            return this.f19410e.m18844a(bitmap);
        }
    }

    /* renamed from: f.a.a.b.c.k$c */
    static final class C7754c implements Action {

        /* renamed from: a */
        final /* synthetic */ CancellationSignal f19414a;

        C7754c(CancellationSignal cancellationSignal) {
            this.f19414a = cancellationSignal;
        }

        public final void run() {
            if (!this.f19414a.isCanceled()) {
                this.f19414a.cancel();
            }
        }
    }

    /* renamed from: f.a.a.b.c.k$d */
    static final class C7755d<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ C7751k f19415e;

        /* renamed from: f */
        final /* synthetic */ C7763a f19416f;

        /* renamed from: g */
        final /* synthetic */ int f19417g;

        C7755d(C7751k kVar, C7763a aVar, int i) {
            this.f19415e = kVar;
            this.f19416f = aVar;
            this.f19417g = i;
        }

        public final Drawable call() {
            Bitmap bitmap;
            Bitmap bitmap2 = null;
            if (this.f19416f.mo19975d()) {
                bitmap2 = Thumbnails.getThumbnail(this.f19415e.f19409b.getContentResolver(), this.f19416f.mo19972a(), this.f19417g, null);
            } else if (this.f19416f.mo19976e()) {
                bitmap2 = Video.Thumbnails.getThumbnail(this.f19415e.f19409b.getContentResolver(), this.f19416f.mo19972a(), this.f19417g, null);
            }
            if (bitmap2 == null || this.f19416f.mo19973b() == 0) {
                bitmap = bitmap2;
            } else {
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                Matrix matrix = new Matrix();
                matrix.setRotate((float) this.f19416f.mo19973b(), ((float) width) / 2.0f, ((float) height) / 2.0f);
                bitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, false);
                bitmap2.recycle();
            }
            return this.f19415e.m18844a(bitmap);
        }
    }

    /* renamed from: f.a.a.b.c.k$e */
    static final class C7756e implements Action {

        /* renamed from: a */
        final /* synthetic */ C7751k f19418a;

        /* renamed from: b */
        final /* synthetic */ C7763a f19419b;

        C7756e(C7751k kVar, C7763a aVar) {
            this.f19418a = kVar;
            this.f19419b = aVar;
        }

        public final void run() {
            if (this.f19419b.mo19975d()) {
                Thumbnails.cancelThumbnailRequest(this.f19418a.f19409b.getContentResolver(), this.f19419b.mo19972a());
            } else if (this.f19419b.mo19976e()) {
                Video.Thumbnails.cancelThumbnailRequest(this.f19418a.f19409b.getContentResolver(), this.f19419b.mo19972a());
            }
        }
    }

    /* renamed from: f.a.a.b.c.k$f */
    static final class C7757f extends C12933k implements Function0<Drawable> {

        /* renamed from: f */
        final /* synthetic */ C7751k f19420f;

        C7757f(C7751k kVar) {
            this.f19420f = kVar;
            super(0);
        }

        public final Drawable invoke() {
            Drawable drawable = this.f19420f.f19409b.getDrawable(C7746f.mediapicker_unsupported_media);
            if (drawable != null) {
                return drawable;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C7751k.class), "unsupportedMediaDrawable", "getUnsupportedMediaDrawable()Landroid/graphics/drawable/Drawable;");
        C12946x.m33839a((C12940r) sVar);
        f19407c = new KProperty[]{sVar};
        new C7752a(null);
    }

    public C7751k(Context context) {
        C12932j.m33818b(context, "context");
        this.f19409b = context;
    }

    /* renamed from: b */
    private final C12291g<Drawable> m18846b(C7763a aVar, Size size) {
        CancellationSignal cancellationSignal = new CancellationSignal();
        C12291g<Drawable> b = C12291g.m32769c((Callable<? extends T>) new C7753b<Object>(this, aVar, size, cancellationSignal)).mo36545b((Action) new C7754c(cancellationSignal));
        C12932j.m33815a((Object) b, "Single.fromCallable {\n  …)\n            }\n        }");
        return b;
    }

    /* renamed from: c */
    private final C12291g<Drawable> m18847c(C7763a aVar, Size size) {
        C12291g<Drawable> b = C12291g.m32769c((Callable<? extends T>) new C7755d<Object>(this, aVar, ((double) C12973l.m33885a(size.getWidth(), size.getHeight())) > 144.0d ? 1 : 3)).mo36545b((Action) new C7756e(this, aVar));
        C12932j.m33815a((Object) b, "Single.fromCallable {\n  …)\n            }\n        }");
        return b;
    }

    /* renamed from: a */
    public final Drawable mo19956a() {
        Lazy lazy = this.f19408a;
        KProperty kProperty = f19407c[0];
        return (Drawable) lazy.getValue();
    }

    /* renamed from: a */
    public final C12291g<Drawable> mo19957a(C7763a aVar, Size size) {
        C12932j.m33818b(aVar, "model");
        C12932j.m33818b(size, "size");
        if (VERSION.SDK_INT >= 29) {
            return m18846b(aVar, size);
        }
        return m18847c(aVar, size);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Drawable m18844a(Bitmap bitmap) {
        if (bitmap != null) {
            return new BitmapDrawable(this.f19409b.getResources(), bitmap);
        }
        Drawable a = mo19956a();
        C12932j.m33815a((Object) a, "unsupportedMediaDrawable");
        return a;
    }
}
