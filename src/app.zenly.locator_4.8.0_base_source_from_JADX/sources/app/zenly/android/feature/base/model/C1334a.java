package app.zenly.android.feature.base.model;

/* renamed from: app.zenly.android.feature.base.model.a */
public abstract class C1334a {

    /* renamed from: a */
    private final String f4943a;

    /* renamed from: app.zenly.android.feature.base.model.a$a */
    public static final class C1335a extends C1334a {

        /* renamed from: b */
        private final float f4944b;

        public C1335a(float f) {
            StringBuilder sb = new StringBuilder();
            sb.append("CornerStrategyFixed-");
            sb.append(f);
            super(sb.toString(), null);
            this.f4944b = f;
        }

        /* renamed from: b */
        public final float mo6547b() {
            return this.f4944b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (java.lang.Float.compare(r1.f4944b, ((app.zenly.android.feature.base.model.C1334a.C1335a) r2).f4944b) == 0) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.android.feature.base.model.C1334a.C1335a
                if (r0 == 0) goto L_0x0013
                app.zenly.android.feature.base.model.a$a r2 = (app.zenly.android.feature.base.model.C1334a.C1335a) r2
                float r0 = r1.f4944b
                float r2 = r2.f4944b
                int r2 = java.lang.Float.compare(r0, r2)
                if (r2 != 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.base.model.C1334a.C1335a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f4944b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Fixed(radius=");
            sb.append(this.f4944b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.android.feature.base.model.a$b */
    public static final class C1336b extends C1334a {

        /* renamed from: b */
        private final float f4945b;

        public C1336b(float f) {
            StringBuilder sb = new StringBuilder();
            sb.append("CornerStrategyRatio-");
            sb.append(f);
            super(sb.toString(), null);
            this.f4945b = f;
        }

        /* renamed from: b */
        public final float mo6551b() {
            return this.f4945b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (java.lang.Float.compare(r1.f4945b, ((app.zenly.android.feature.base.model.C1334a.C1336b) r2).f4945b) == 0) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof app.zenly.android.feature.base.model.C1334a.C1336b
                if (r0 == 0) goto L_0x0013
                app.zenly.android.feature.base.model.a$b r2 = (app.zenly.android.feature.base.model.C1334a.C1336b) r2
                float r0 = r1.f4945b
                float r2 = r2.f4945b
                int r2 = java.lang.Float.compare(r0, r2)
                if (r2 != 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.base.model.C1334a.C1336b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f4945b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Ratio(radiusRatio=");
            sb.append(this.f4945b);
            sb.append(")");
            return sb.toString();
        }
    }

    private C1334a(String str) {
        this.f4943a = str;
    }

    /* renamed from: a */
    public final String mo6546a() {
        return this.f4943a;
    }

    public /* synthetic */ C1334a(String str, C12928f fVar) {
        this(str);
    }
}
