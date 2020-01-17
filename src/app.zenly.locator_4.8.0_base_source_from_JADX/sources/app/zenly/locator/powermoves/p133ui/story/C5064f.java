package app.zenly.locator.powermoves.p133ui.story;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.powermoves.ui.story.f */
public final class C5064f implements NavArgs {

    /* renamed from: b */
    public static final C5065a f13137b = new C5065a(null);

    /* renamed from: a */
    private final String f13138a;

    /* renamed from: app.zenly.locator.powermoves.ui.story.f$a */
    public static final class C5065a {
        private C5065a() {
        }

        /* renamed from: a */
        public final C5064f mo12318a(Bundle bundle) {
            C12932j.m33818b(bundle, "bundle");
            bundle.setClassLoader(C5064f.class.getClassLoader());
            String str = "powerMoveId";
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str);
                if (string != null) {
                    return new C5064f(string);
                }
                throw new IllegalArgumentException("Argument \"powerMoveId\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"powerMoveId\" is missing and does not have an android:defaultValue");
        }

        public /* synthetic */ C5065a(C12928f fVar) {
            this();
        }
    }

    public C5064f(String str) {
        C12932j.m33818b(str, "powerMoveId");
        this.f13138a = str;
    }

    public static final C5064f fromBundle(Bundle bundle) {
        return f13137b.mo12318a(bundle);
    }

    /* renamed from: a */
    public final String mo12314a() {
        return this.f13138a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f13138a, (java.lang.Object) ((app.zenly.locator.powermoves.p133ui.story.C5064f) r2).f13138a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.powermoves.p133ui.story.C5064f
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.powermoves.ui.story.f r2 = (app.zenly.locator.powermoves.p133ui.story.C5064f) r2
            java.lang.String r0 = r1.f13138a
            java.lang.String r2 = r2.f13138a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.powermoves.p133ui.story.C5064f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f13138a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PowerMoveStoryDialogFragmentArgs(powerMoveId=");
        sb.append(this.f13138a);
        sb.append(")");
        return sb.toString();
    }
}
