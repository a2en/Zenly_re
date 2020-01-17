package app.zenly.locator.cards;

import android.app.Activity;
import androidx.core.app.C0535j.C0536a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.cards.g */
public final class C1808g {

    /* renamed from: a */
    private String f5993a;

    /* renamed from: b */
    private C1801d f5994b;

    /* renamed from: c */
    private C1801d f5995c;

    /* renamed from: d */
    private String f5996d;

    public C1808g() {
        this(null, null, null, null, 15, null);
    }

    public C1808g(String str, C1801d dVar, C1801d dVar2, String str2) {
        this.f5993a = str;
        this.f5994b = dVar;
        this.f5995c = dVar2;
        this.f5996d = str2;
    }

    /* renamed from: a */
    public final C1801d mo7459a() {
        return this.f5995c;
    }

    /* renamed from: b */
    public final String mo7462b() {
        return this.f5993a;
    }

    /* renamed from: c */
    public final C1801d mo7464c() {
        return this.f5994b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f5996d, (java.lang.Object) r3.f5996d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof app.zenly.locator.cards.C1808g
            if (r0 == 0) goto L_0x0031
            app.zenly.locator.cards.g r3 = (app.zenly.locator.cards.C1808g) r3
            java.lang.String r0 = r2.f5993a
            java.lang.String r1 = r3.f5993a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0031
            app.zenly.locator.cards.d r0 = r2.f5994b
            app.zenly.locator.cards.d r1 = r3.f5994b
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0031
            app.zenly.locator.cards.d r0 = r2.f5995c
            app.zenly.locator.cards.d r1 = r3.f5995c
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f5996d
            java.lang.String r3 = r3.f5996d
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.C1808g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f5993a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C1801d dVar = this.f5994b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C1801d dVar2 = this.f5995c;
        int hashCode3 = (hashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        String str2 = this.f5996d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SharingInfo(url=");
        sb.append(this.f5993a);
        sb.append(", videoMediaData=");
        sb.append(this.f5994b);
        sb.append(", imageMediaData=");
        sb.append(this.f5995c);
        sb.append(", text=");
        sb.append(this.f5996d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C1808g(String str, C1801d dVar, C1801d dVar2, String str2, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            dVar = null;
        }
        if ((i & 4) != 0) {
            dVar2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        this(str, dVar, dVar2, str2);
    }

    /* renamed from: a */
    public final void mo7460a(C1801d dVar) {
        this.f5995c = dVar;
    }

    /* renamed from: b */
    public final void mo7463b(C1801d dVar) {
        this.f5994b = dVar;
    }

    /* renamed from: a */
    public final void mo7461a(String str) {
        this.f5996d = str;
    }

    /* renamed from: a */
    public final C0536a mo7458a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        boolean z = true;
        boolean z2 = this.f5994b != null;
        boolean z3 = this.f5995c != null;
        if (this.f5996d == null) {
            z = false;
        }
        C0536a a = C0536a.m2510a(activity);
        if (z2 || z3 || z) {
            if (!z2 && !z3 && z) {
                a.mo3056a("text/plain");
            } else if (!z2 && z3 && !z) {
                a.mo3056a("image/*");
            } else if (!z2 || z) {
                a.mo3056a("*/*");
            } else {
                a.mo3056a("video/*");
            }
        }
        if (z2) {
            C1801d dVar = this.f5994b;
            if (dVar != null) {
                a.mo3054a(dVar.mo7401b());
            } else {
                C12932j.m33814a();
                throw null;
            }
        } else if (z3) {
            C1801d dVar2 = this.f5995c;
            if (dVar2 != null) {
                a.mo3054a(dVar2.mo7401b());
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
        if (z) {
            a.mo3058b(this.f5996d);
        }
        C12932j.m33815a((Object) a, "builder");
        return a;
    }
}
