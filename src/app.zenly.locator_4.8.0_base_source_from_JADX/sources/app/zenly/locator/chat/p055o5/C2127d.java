package app.zenly.locator.chat.p055o5;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.o5.d */
public abstract class C2127d {

    /* renamed from: app.zenly.locator.chat.o5.d$a */
    public static final class C2128a extends C2127d {

        /* renamed from: a */
        public static final C2128a f6626a = new C2128a();

        private C2128a() {
            super(null);
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.d$b */
    public static final class C2129b extends C2127d {

        /* renamed from: a */
        private final long f6627a;

        public C2129b(long j) {
            super(null);
            this.f6627a = j;
        }

        /* renamed from: a */
        public final long mo7923a() {
            return this.f6627a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2129b) {
                    if (this.f6627a == ((C2129b) obj).f6627a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Long.valueOf(this.f6627a).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LiveSince(since=");
            sb.append(this.f6627a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.d$c */
    public static final class C2130c extends C2127d {

        /* renamed from: a */
        private final long f6628a;

        /* renamed from: b */
        private final String f6629b;

        public C2130c(long j, String str) {
            C12932j.m33818b(str, "username");
            super(null);
            this.f6628a = j;
            this.f6629b = str;
        }

        /* renamed from: a */
        public final long mo7927a() {
            return this.f6628a;
        }

        /* renamed from: b */
        public final String mo7928b() {
            return this.f6629b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2130c) {
                    C2130c cVar = (C2130c) obj;
                    if (!(this.f6628a == cVar.f6628a) || !C12932j.m33817a((Object) this.f6629b, (Object) cVar.f6629b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int a = Long.valueOf(this.f6628a).hashCode() * 31;
            String str = this.f6629b;
            return a + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NoLocationSince(since=");
            sb.append(this.f6628a);
            sb.append(", username=");
            sb.append(this.f6629b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.o5.d$d */
    public static final class C2131d extends C2127d {

        /* renamed from: a */
        private final long f6630a;

        public C2131d(long j) {
            super(null);
            this.f6630a = j;
        }

        /* renamed from: a */
        public final long mo7932a() {
            return this.f6630a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2131d) {
                    if (this.f6630a == ((C2131d) obj).f6630a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Long.valueOf(this.f6630a).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OutdatedSince(since=");
            sb.append(this.f6630a);
            sb.append(")");
            return sb.toString();
        }
    }

    private C2127d() {
    }

    public /* synthetic */ C2127d(C12928f fVar) {
        this();
    }
}
