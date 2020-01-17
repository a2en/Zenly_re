package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: androidx.core.text.e */
public final class C0591e {

    /* renamed from: a */
    public static final TextDirectionHeuristicCompat f2714a = new C0596e(null, false);

    /* renamed from: b */
    public static final TextDirectionHeuristicCompat f2715b = new C0596e(null, true);

    /* renamed from: c */
    public static final TextDirectionHeuristicCompat f2716c = new C0596e(C0593b.f2720a, false);

    /* renamed from: d */
    public static final TextDirectionHeuristicCompat f2717d = new C0596e(C0593b.f2720a, true);

    /* renamed from: androidx.core.text.e$a */
    private static class C0592a implements C0594c {

        /* renamed from: b */
        static final C0592a f2718b = new C0592a(true);

        /* renamed from: a */
        private final boolean f2719a;

        private C0592a(boolean z) {
            this.f2719a = z;
        }

        /* renamed from: a */
        public int mo3236a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0591e.m2748a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f2719a) {
                        return 1;
                    }
                } else if (this.f2719a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f2719a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.e$b */
    private static class C0593b implements C0594c {

        /* renamed from: a */
        static final C0593b f2720a = new C0593b();

        private C0593b() {
        }

        /* renamed from: a */
        public int mo3236a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0591e.m2749b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.e$c */
    private interface C0594c {
        /* renamed from: a */
        int mo3236a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.e$d */
    private static abstract class C0595d implements TextDirectionHeuristicCompat {

        /* renamed from: a */
        private final C0594c f2721a;

        C0595d(C0594c cVar) {
            this.f2721a = cVar;
        }

        /* renamed from: a */
        private boolean m2753a(CharSequence charSequence, int i, int i2) {
            int a = this.f2721a.mo3236a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo3237a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo3237a();

        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl((CharSequence) CharBuffer.wrap(cArr), i, i2);
        }

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f2721a == null) {
                return mo3237a();
            } else {
                return m2753a(charSequence, i, i2);
            }
        }
    }

    /* renamed from: androidx.core.text.e$e */
    private static class C0596e extends C0595d {

        /* renamed from: b */
        private final boolean f2722b;

        C0596e(C0594c cVar, boolean z) {
            super(cVar);
            this.f2722b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo3237a() {
            return this.f2722b;
        }
    }

    /* renamed from: androidx.core.text.e$f */
    private static class C0597f extends C0595d {

        /* renamed from: b */
        static final C0597f f2723b = new C0597f();

        C0597f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo3237a() {
            return C0598f.m2758b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C0596e(C0592a.f2718b, false);
        C0597f fVar = C0597f.f2723b;
    }

    /* renamed from: a */
    static int m2748a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m2749b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}
