package app.zenly.locator.p135r.p137b1;

import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3205g;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.r.b1.b */
public final class C5139b {

    /* renamed from: i */
    public static final C5140a f13321i = new C5140a(null);

    /* renamed from: a */
    private C7339i f13322a;

    /* renamed from: b */
    private UserProto$User f13323b;

    /* renamed from: c */
    private int f13324c;

    /* renamed from: d */
    private boolean f13325d;

    /* renamed from: e */
    private boolean f13326e;

    /* renamed from: f */
    private boolean f13327f;

    /* renamed from: g */
    private List<? extends C2545e0> f13328g = C12848o.m33640a();

    /* renamed from: h */
    private final C5142c f13329h;

    /* renamed from: app.zenly.locator.r.b1.b$a */
    public static final class C5140a {

        /* renamed from: app.zenly.locator.r.b1.b$a$a */
        public static final class C5141a extends C3201f<C5139b> {

            /* renamed from: e */
            final /* synthetic */ C3201f f13330e;

            C5141a(C3201f fVar) {
                this.f13330e = fVar;
            }

            /* renamed from: a */
            public int compare(C5139b bVar, C5139b bVar2) {
                if (bVar == null && bVar2 == null) {
                    return 0;
                }
                C7339i iVar = null;
                if ((bVar != null ? bVar.mo12471a() : null) == null) {
                    return 1;
                }
                if (bVar2 != null) {
                    iVar = bVar2.mo12471a();
                }
                if (iVar == null) {
                    return -1;
                }
                return this.f13330e.compare(bVar.mo12471a(), bVar2.mo12471a());
            }
        }

        private C5140a() {
        }

        /* renamed from: a */
        public final C3201f<C5139b> mo12487a(Locale locale) {
            C12932j.m33818b(locale, "locale");
            return new C5141a(C3205g.m10190a(locale));
        }

        public /* synthetic */ C5140a(C12928f fVar) {
            this();
        }
    }

    public C5139b(C5142c cVar) {
        C12932j.m33818b(cVar, "section");
        this.f13329h = cVar;
    }

    /* renamed from: a */
    public static final C3201f<C5139b> m14652a(Locale locale) {
        return f13321i.mo12487a(locale);
    }

    /* renamed from: a */
    public final C7339i mo12471a() {
        return this.f13322a;
    }

    /* renamed from: b */
    public final void mo12478b(boolean z) {
        this.f13326e = z;
    }

    /* renamed from: c */
    public final boolean mo12480c() {
        return this.f13326e;
    }

    /* renamed from: d */
    public final int mo12481d() {
        return this.f13324c;
    }

    /* renamed from: e */
    public final C5142c mo12482e() {
        return this.f13329h;
    }

    /* renamed from: f */
    public final List<C2545e0> mo12483f() {
        return this.f13328g;
    }

    /* renamed from: g */
    public final UserProto$User mo12484g() {
        return this.f13323b;
    }

    /* renamed from: h */
    public final boolean mo12485h() {
        return this.f13325d;
    }

    /* renamed from: i */
    public final boolean mo12486i() {
        return this.f13327f;
    }

    /* renamed from: a */
    public final void mo12474a(C7339i iVar) {
        this.f13322a = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12477b() {
        /*
            r3 = this;
            co.znly.models.i r0 = r3.f13322a
            r1 = 0
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.getFull()
            if (r0 == 0) goto L_0x001c
            boolean r0 = kotlin.text.C13028q.m34000a(r0)
            r2 = 1
            r0 = r0 ^ r2
            if (r0 != r2) goto L_0x001c
            co.znly.models.i r0 = r3.f13322a
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.getFull()
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            co.znly.models.UserProto$User r0 = r3.f13323b
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r0.getName()
            goto L_0x002a
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            r1 = r0
            goto L_0x003f
        L_0x002e:
            co.znly.models.i r0 = r3.f13322a
            if (r0 == 0) goto L_0x003f
            java.util.List r0 = r0.getPhoneNumbersList()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = kotlin.collections.C12857w.m33683g(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x003f:
            if (r1 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            java.lang.String r1 = ""
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p135r.p137b1.C5139b.mo12477b():java.lang.String");
    }

    /* renamed from: c */
    public final void mo12479c(boolean z) {
        this.f13327f = z;
    }

    /* renamed from: a */
    public final void mo12473a(UserProto$User userProto$User) {
        this.f13323b = userProto$User;
    }

    /* renamed from: a */
    public final void mo12472a(int i) {
        this.f13324c = i;
    }

    /* renamed from: a */
    public final void mo12476a(boolean z) {
        this.f13325d = z;
    }

    /* renamed from: a */
    public final void mo12475a(List<? extends C2545e0> list) {
        C12932j.m33818b(list, "<set-?>");
        this.f13328g = list;
    }
}
