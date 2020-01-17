package app.zenly.locator.powermoves.p127b;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.powermoves.b.b */
public final class C4987b {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f13012f;

    /* renamed from: a */
    private final Lazy f13013a = C12896f.m33751a(new C4989b(this));

    /* renamed from: b */
    private final Lazy f13014b = C12896f.m33751a(new C4990c(this));

    /* renamed from: c */
    private final Lazy f13015c = C12896f.m33751a(new C4991d(this));

    /* renamed from: d */
    private final Lazy f13016d = C12896f.m33751a(new C4992e(this));

    /* renamed from: e */
    private final String f13017e;

    /* renamed from: app.zenly.locator.powermoves.b.b$a */
    public static final class C4988a {
        private C4988a() {
        }

        public /* synthetic */ C4988a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.b.b$b */
    static final class C4989b extends C12933k implements Function0<Uri> {

        /* renamed from: f */
        final /* synthetic */ C4987b f13018f;

        C4989b(C4987b bVar) {
            this.f13018f = bVar;
            super(0);
        }

        public final Uri invoke() {
            Builder buildUpon = Uri.parse("https://cdn.zen.ly/powermoves/").buildUpon();
            StringBuilder sb = new StringBuilder();
            sb.append("FULL-");
            sb.append(this.f13018f.mo12232e());
            sb.append(".mp4");
            return buildUpon.appendPath(sb.toString()).build();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.b.b$c */
    static final class C4990c extends C12933k implements Function0<Uri> {

        /* renamed from: f */
        final /* synthetic */ C4987b f13019f;

        C4990c(C4987b bVar) {
            this.f13019f = bVar;
            super(0);
        }

        public final Uri invoke() {
            Builder buildUpon = Uri.parse("https://cdn.zen.ly/powermoves/").buildUpon();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13019f.mo12232e());
            sb.append(".mp4");
            return buildUpon.appendPath(sb.toString()).build();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.b.b$d */
    static final class C4991d extends C12933k implements Function0<Uri> {

        /* renamed from: f */
        final /* synthetic */ C4987b f13020f;

        C4991d(C4987b bVar) {
            this.f13020f = bVar;
            super(0);
        }

        public final Uri invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("file:///android_asset/thumbnails/full/");
            sb.append(this.f13020f.mo12232e());
            sb.append(".jpg");
            return Uri.parse(sb.toString());
        }
    }

    /* renamed from: app.zenly.locator.powermoves.b.b$e */
    static final class C4992e extends C12933k implements Function0<Uri> {

        /* renamed from: f */
        final /* synthetic */ C4987b f13021f;

        C4992e(C4987b bVar) {
            this.f13021f = bVar;
            super(0);
        }

        public final Uri invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("file:///android_asset/thumbnails/preview/");
            sb.append(this.f13021f.mo12232e());
            sb.append(".jpg");
            return Uri.parse(sb.toString());
        }
    }

    static {
        Class<C4987b> cls = C4987b.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "full", "getFull()Landroid/net/Uri;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "preview", "getPreview()Landroid/net/Uri;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "thumbnailFull", "getThumbnailFull()Landroid/net/Uri;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a((Class) cls), "thumbnailPreview", "getThumbnailPreview()Landroid/net/Uri;");
        C12946x.m33839a((C12940r) sVar4);
        f13012f = new KProperty[]{sVar, sVar2, sVar3, sVar4};
        new C4988a(null);
    }

    public C4987b(String str) {
        C12932j.m33818b(str, "videoId");
        this.f13017e = str;
    }

    /* renamed from: a */
    public final Uri mo12228a() {
        Lazy lazy = this.f13013a;
        KProperty kProperty = f13012f[0];
        return (Uri) lazy.getValue();
    }

    /* renamed from: b */
    public final Uri mo12229b() {
        Lazy lazy = this.f13014b;
        KProperty kProperty = f13012f[1];
        return (Uri) lazy.getValue();
    }

    /* renamed from: c */
    public final Uri mo12230c() {
        Lazy lazy = this.f13015c;
        KProperty kProperty = f13012f[2];
        return (Uri) lazy.getValue();
    }

    /* renamed from: d */
    public final Uri mo12231d() {
        Lazy lazy = this.f13016d;
        KProperty kProperty = f13012f[3];
        return (Uri) lazy.getValue();
    }

    /* renamed from: e */
    public final String mo12232e() {
        return this.f13017e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f13017e, (java.lang.Object) ((app.zenly.locator.powermoves.p127b.C4987b) r2).f13017e) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.powermoves.p127b.C4987b
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.powermoves.b.b r2 = (app.zenly.locator.powermoves.p127b.C4987b) r2
            java.lang.String r0 = r1.f13017e
            java.lang.String r2 = r2.f13017e
            boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.powermoves.p127b.C4987b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f13017e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video(videoId=");
        sb.append(this.f13017e);
        sb.append(")");
        return sb.toString();
    }
}
