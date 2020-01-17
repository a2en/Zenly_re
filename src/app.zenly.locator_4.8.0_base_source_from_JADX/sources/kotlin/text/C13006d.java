package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C12899i;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.C12963e;
import kotlin.sequences.Sequence;

/* renamed from: kotlin.text.d */
final class C13006d implements Sequence<C12963e> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f33595a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f33596b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f33597c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Function2<CharSequence, Integer, C12899i<Integer, Integer>> f33598d;

    /* renamed from: kotlin.text.d$a */
    public static final class C13007a implements Iterator<C12963e>, KMappedMarker {

        /* renamed from: e */
        private int f33599e = -1;

        /* renamed from: f */
        private int f33600f;

        /* renamed from: g */
        private int f33601g;

        /* renamed from: h */
        private C12963e f33602h;

        /* renamed from: i */
        private int f33603i;

        /* renamed from: j */
        final /* synthetic */ C13006d f33604j;

        C13007a(C13006d dVar) {
            this.f33604j = dVar;
            this.f33600f = C12973l.m33886a(dVar.f33596b, 0, dVar.f33595a.length());
            this.f33601g = this.f33600f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r6.f33603i < kotlin.text.C13006d.m33948c(r6.f33604j)) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m33950a() {
            /*
                r6 = this;
                int r0 = r6.f33601g
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f33599e = r1
                r0 = 0
                r6.f33602h = r0
                goto L_0x00a2
            L_0x000c:
                kotlin.text.d r0 = r6.f33604j
                int r0 = r0.f33597c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0025
                int r0 = r6.f33603i
                int r0 = r0 + r3
                r6.f33603i = r0
                int r0 = r6.f33603i
                kotlin.text.d r4 = r6.f33604j
                int r4 = r4.f33597c
                if (r0 >= r4) goto L_0x0033
            L_0x0025:
                int r0 = r6.f33601g
                kotlin.text.d r4 = r6.f33604j
                java.lang.CharSequence r4 = r4.f33595a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0049
            L_0x0033:
                int r0 = r6.f33600f
                kotlin.ranges.e r1 = new kotlin.ranges.e
                kotlin.text.d r4 = r6.f33604j
                java.lang.CharSequence r4 = r4.f33595a
                int r4 = kotlin.text.C13029r.m34030c(r4)
                r1.<init>(r0, r4)
                r6.f33602h = r1
                r6.f33601g = r2
                goto L_0x00a0
            L_0x0049:
                kotlin.text.d r0 = r6.f33604j
                kotlin.jvm.functions.Function2 r0 = r0.f33598d
                kotlin.text.d r4 = r6.f33604j
                java.lang.CharSequence r4 = r4.f33595a
                int r5 = r6.f33601g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.i r0 = (kotlin.C12899i) r0
                if (r0 != 0) goto L_0x0079
                int r0 = r6.f33600f
                kotlin.ranges.e r1 = new kotlin.ranges.e
                kotlin.text.d r4 = r6.f33604j
                java.lang.CharSequence r4 = r4.f33595a
                int r4 = kotlin.text.C13029r.m34030c(r4)
                r1.<init>(r0, r4)
                r6.f33602h = r1
                r6.f33601g = r2
                goto L_0x00a0
            L_0x0079:
                java.lang.Object r2 = r0.mo37202a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo37203b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f33600f
                kotlin.ranges.e r4 = kotlin.ranges.C12973l.m33894d(r4, r2)
                r6.f33602h = r4
                int r2 = r2 + r0
                r6.f33600f = r2
                int r2 = r6.f33600f
                if (r0 != 0) goto L_0x009d
                r1 = 1
            L_0x009d:
                int r2 = r2 + r1
                r6.f33601g = r2
            L_0x00a0:
                r6.f33599e = r3
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C13006d.C13007a.m33950a():void");
        }

        public boolean hasNext() {
            if (this.f33599e == -1) {
                m33950a();
            }
            return this.f33599e == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C12963e next() {
            if (this.f33599e == -1) {
                m33950a();
            }
            if (this.f33599e != 0) {
                C12963e eVar = this.f33602h;
                if (eVar != null) {
                    this.f33602h = null;
                    this.f33599e = -1;
                    return eVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }
    }

    public C13006d(CharSequence charSequence, int i, int i2, Function2<? super CharSequence, ? super Integer, C12899i<Integer, Integer>> function2) {
        C12932j.m33818b(charSequence, "input");
        C12932j.m33818b(function2, "getNextMatch");
        this.f33595a = charSequence;
        this.f33596b = i;
        this.f33597c = i2;
        this.f33598d = function2;
    }

    public Iterator<C12963e> iterator() {
        return new C13007a(this);
    }
}
