package app.zenly.locator.powermoves.p127b;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.powermoves.b.a */
public final class C4984a implements Comparable<C4984a> {

    /* renamed from: e */
    private C4987b f13002e;

    /* renamed from: f */
    private final String f13003f;

    /* renamed from: g */
    private final int f13004g;

    /* renamed from: h */
    private final int f13005h;

    /* renamed from: i */
    private final List<C4987b> f13006i;

    /* renamed from: j */
    private C4985a f13007j;

    /* renamed from: app.zenly.locator.powermoves.b.a$a */
    public enum C4985a {
        READ,
        UNREAD;
        

        /* renamed from: h */
        public static final C4986a f13011h = null;

        /* renamed from: app.zenly.locator.powermoves.b.a$a$a */
        public static final class C4986a {
            private C4986a() {
            }

            /* renamed from: a */
            public final C4985a mo12227a(boolean z) {
                return z ? C4985a.READ : C4985a.UNREAD;
            }

            public /* synthetic */ C4986a(C12928f fVar) {
                this();
            }
        }

        static {
            f13011h = new C4986a(null);
        }
    }

    public C4984a(String str, int i, int i2, List<C4987b> list, C4985a aVar) {
        C12932j.m33818b(str, "id");
        C12932j.m33818b(list, "videos");
        C12932j.m33818b(aVar, "state");
        this.f13003f = str;
        this.f13004g = i;
        this.f13005h = i2;
        this.f13006i = list;
        this.f13007j = aVar;
        if (!this.f13006i.isEmpty()) {
            this.f13002e = (C4987b) C12857w.m33682f((List) this.f13006i);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<app.zenly.locator.powermoves.b.b>, for r7v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ app.zenly.locator.powermoves.p127b.C4984a m14338a(app.zenly.locator.powermoves.p127b.C4984a r3, java.lang.String r4, int r5, int r6, java.util.List<app.zenly.locator.powermoves.p127b.C4987b> r7, app.zenly.locator.powermoves.p127b.C4984a.C4985a r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.f13003f
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            int r5 = r3.f13004g
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            int r6 = r3.f13005h
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.util.List<app.zenly.locator.powermoves.b.b> r7 = r3.f13006i
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            app.zenly.locator.powermoves.b.a$a r8 = r3.f13007j
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            app.zenly.locator.powermoves.b.a r3 = r5.mo12209a(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.powermoves.p127b.C4984a.m14338a(app.zenly.locator.powermoves.b.a, java.lang.String, int, int, java.util.List, app.zenly.locator.powermoves.b.a$a, int, java.lang.Object):app.zenly.locator.powermoves.b.a");
    }

    /* renamed from: a */
    public final C4984a mo12209a(String str, int i, int i2, List<C4987b> list, C4985a aVar) {
        C12932j.m33818b(str, "id");
        C12932j.m33818b(list, "videos");
        C12932j.m33818b(aVar, "state");
        C4984a aVar2 = new C4984a(str, i, i2, list, aVar);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo12211a(C4985a aVar) {
        C12932j.m33818b(aVar, "<set-?>");
        this.f13007j = aVar;
    }

    /* renamed from: b */
    public final C4987b mo12212b() {
        return this.f13002e;
    }

    /* renamed from: c */
    public final int mo12213c() {
        return this.f13006i.indexOf(this.f13002e);
    }

    /* renamed from: d */
    public final int mo12215d() {
        return this.f13005h;
    }

    /* renamed from: e */
    public final String mo12216e() {
        return this.f13003f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C12932j.m33817a((Object) C4984a.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(C12932j.m33817a((Object) this.f13003f, (Object) ((C4984a) obj).f13003f) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.powermoves.model.PowerMove");
    }

    /* renamed from: f */
    public final C4985a mo12218f() {
        return this.f13007j;
    }

    /* renamed from: g */
    public final int mo12219g() {
        return this.f13004g;
    }

    /* renamed from: h */
    public final List<C4987b> mo12220h() {
        return this.f13006i;
    }

    public int hashCode() {
        String str = this.f13003f;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.f13004g).hashCode()) * 31) + Integer.valueOf(this.f13005h).hashCode()) * 31;
        List<C4987b> list = this.f13006i;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C4985a aVar = this.f13007j;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final boolean mo12222i() {
        return mo12213c() == 0;
    }

    /* renamed from: j */
    public final boolean mo12223j() {
        return mo12213c() == this.f13006i.size() - 1;
    }

    /* renamed from: k */
    public final C4987b mo12224k() {
        this.f13002e = (C4987b) this.f13006i.get(C12973l.m33890b(mo12213c() + 1, this.f13006i.size() - 1));
        return this.f13002e;
    }

    /* renamed from: l */
    public final C4987b mo12225l() {
        this.f13002e = (C4987b) this.f13006i.get(C12973l.m33885a(mo12213c() - 1, 0));
        return this.f13002e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PowerMove(id=");
        sb.append(this.f13003f);
        sb.append(", title=");
        sb.append(this.f13004g);
        sb.append(", durationInSec=");
        sb.append(this.f13005h);
        sb.append(", videos=");
        sb.append(this.f13006i);
        sb.append(", state=");
        sb.append(this.f13007j);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final C4987b mo12210a() {
        this.f13002e = (C4987b) C12857w.m33682f((List) this.f13006i);
        return this.f13002e;
    }

    /* renamed from: a */
    public int compareTo(C4984a aVar) {
        C12932j.m33818b(aVar, "other");
        int compareTo = aVar.f13007j.compareTo(this.f13007j);
        return compareTo != 0 ? compareTo : this.f13003f.compareTo(aVar.f13003f);
    }

    public /* synthetic */ C4984a(String str, int i, int i2, List list, C4985a aVar, int i3, C12928f fVar) {
        if ((i3 & 16) != 0) {
            aVar = C4985a.UNREAD;
        }
        this(str, i, i2, list, aVar);
    }
}
