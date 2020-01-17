package app.zenly.locator.cards;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.cards.d */
public final class C1801d {

    /* renamed from: a */
    private final Uri f5938a;

    /* renamed from: b */
    private final File f5939b;

    public C1801d(Uri uri, File file) {
        C12932j.m33818b(uri, "uri");
        C12932j.m33818b(file, "file");
        this.f5938a = uri;
        this.f5939b = file;
    }

    /* renamed from: a */
    public final File mo7400a() {
        return this.f5939b;
    }

    /* renamed from: b */
    public final Uri mo7401b() {
        return this.f5938a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f5939b, (java.lang.Object) r3.f5939b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof app.zenly.locator.cards.C1801d
            if (r0 == 0) goto L_0x001d
            app.zenly.locator.cards.d r3 = (app.zenly.locator.cards.C1801d) r3
            android.net.Uri r0 = r2.f5938a
            android.net.Uri r1 = r3.f5938a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.io.File r0 = r2.f5939b
            java.io.File r3 = r3.f5939b
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.C1801d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Uri uri = this.f5938a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        File file = this.f5939b;
        if (file != null) {
            i = file.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaData(uri=");
        sb.append(this.f5938a);
        sb.append(", file=");
        sb.append(this.f5939b);
        sb.append(")");
        return sb.toString();
    }
}
