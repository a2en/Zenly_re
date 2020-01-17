package app.zenly.android.feature.base.model;

import android.net.Uri;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p268g.C7705a;

public interface Avatar {

    /* renamed from: app.zenly.android.feature.base.model.Avatar$a */
    public static final class C1327a {

        /* renamed from: c */
        public static final C1328a f4934c = new C1328a(null);

        /* renamed from: a */
        private final Uri f4935a;

        /* renamed from: b */
        private final C1329b f4936b;

        /* renamed from: app.zenly.android.feature.base.model.Avatar$a$a */
        public static final class C1328a {
            private C1328a() {
            }

            /* renamed from: a */
            public final int mo6531a(Uri uri) {
                C12932j.m33818b(uri, "url");
                if (!C12932j.m33817a((Object) "avatar", (Object) uri.getScheme())) {
                    return C7674a.f19294a;
                }
                String path = uri.getPath();
                return path != null ? Integer.parseInt(path) : C7674a.f19294a;
            }

            public /* synthetic */ C1328a(C12928f fVar) {
                this();
            }
        }

        /* renamed from: app.zenly.android.feature.base.model.Avatar$a$b */
        public enum C1329b {
            REMOTE,
            LOCAL
        }

        public C1327a(Uri uri, C1329b bVar) {
            C12932j.m33818b(uri, "url");
            C12932j.m33818b(bVar, "urlType");
            this.f4935a = uri;
            this.f4936b = bVar;
        }

        /* renamed from: a */
        public final Uri mo6526a() {
            return this.f4935a;
        }

        /* renamed from: b */
        public final C1329b mo6527b() {
            return this.f4936b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f4936b, (java.lang.Object) r3.f4936b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof app.zenly.android.feature.base.model.Avatar.C1327a
                if (r0 == 0) goto L_0x001d
                app.zenly.android.feature.base.model.Avatar$a r3 = (app.zenly.android.feature.base.model.Avatar.C1327a) r3
                android.net.Uri r0 = r2.f4935a
                android.net.Uri r1 = r3.f4935a
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x001d
                app.zenly.android.feature.base.model.Avatar$a$b r0 = r2.f4936b
                app.zenly.android.feature.base.model.Avatar$a$b r3 = r3.f4936b
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
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.base.model.Avatar.C1327a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Uri uri = this.f4935a;
            int i = 0;
            int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
            C1329b bVar = this.f4936b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AvatarUrl(url=");
            sb.append(this.f4935a);
            sb.append(", urlType=");
            sb.append(this.f4936b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.android.feature.base.model.Avatar$b */
    public static final class C1330b {
        /* renamed from: a */
        public static String m6341a(Avatar avatar) {
            return C7705a.m18750a(avatar.getName());
        }
    }

    boolean areAvatarTheSame(Avatar avatar);

    C1327a forSize(int i);

    Avatar getFallback();

    String getId();

    String getInitials();

    String getName();
}
