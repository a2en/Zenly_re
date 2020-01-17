package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
public final class C0583a {

    /* renamed from: d */
    static final TextDirectionHeuristicCompat f2684d = C0591e.f2716c;

    /* renamed from: e */
    private static final String f2685e = Character.toString(8206);

    /* renamed from: f */
    private static final String f2686f = Character.toString(8207);

    /* renamed from: g */
    static final C0583a f2687g = new C0583a(false, 2, f2684d);

    /* renamed from: h */
    static final C0583a f2688h = new C0583a(true, 2, f2684d);

    /* renamed from: a */
    private final boolean f2689a;

    /* renamed from: b */
    private final int f2690b;

    /* renamed from: c */
    private final TextDirectionHeuristicCompat f2691c;

    /* renamed from: androidx.core.text.a$a */
    public static final class C0584a {

        /* renamed from: a */
        private boolean f2692a;

        /* renamed from: b */
        private int f2693b;

        /* renamed from: c */
        private TextDirectionHeuristicCompat f2694c;

        public C0584a() {
            m2722b(C0583a.m2713a(Locale.getDefault()));
        }

        /* renamed from: a */
        private static C0583a m2721a(boolean z) {
            return z ? C0583a.f2688h : C0583a.f2687g;
        }

        /* renamed from: b */
        private void m2722b(boolean z) {
            this.f2692a = z;
            this.f2694c = C0583a.f2684d;
            this.f2693b = 2;
        }

        /* renamed from: a */
        public C0583a mo3206a() {
            if (this.f2693b == 2 && this.f2694c == C0583a.f2684d) {
                return m2721a(this.f2692a);
            }
            return new C0583a(this.f2692a, this.f2693b, this.f2694c);
        }
    }

    /* renamed from: androidx.core.text.a$b */
    private static class C0585b {

        /* renamed from: f */
        private static final byte[] f2695f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f2696a;

        /* renamed from: b */
        private final boolean f2697b;

        /* renamed from: c */
        private final int f2698c;

        /* renamed from: d */
        private int f2699d;

        /* renamed from: e */
        private char f2700e;

        static {
            for (int i = 0; i < 1792; i++) {
                f2695f[i] = Character.getDirectionality(i);
            }
        }

        C0585b(CharSequence charSequence, boolean z) {
            this.f2696a = charSequence;
            this.f2697b = z;
            this.f2698c = charSequence.length();
        }

        /* renamed from: a */
        private static byte m2724a(char c) {
            return c < 1792 ? f2695f[c] : Character.getDirectionality(c);
        }

        /* renamed from: e */
        private byte m2725e() {
            char c;
            int i = this.f2699d;
            do {
                int i2 = this.f2699d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2696a;
                int i3 = i2 - 1;
                this.f2699d = i3;
                this.f2700e = charSequence.charAt(i3);
                c = this.f2700e;
                if (c == '&') {
                    return 12;
                }
            } while (c != ';');
            this.f2699d = i;
            this.f2700e = ';';
            return 13;
        }

        /* renamed from: f */
        private byte m2726f() {
            char charAt;
            do {
                int i = this.f2699d;
                if (i >= this.f2698c) {
                    break;
                }
                CharSequence charSequence = this.f2696a;
                this.f2699d = i + 1;
                charAt = charSequence.charAt(i);
                this.f2700e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: g */
        private byte m2727g() {
            char charAt;
            int i = this.f2699d;
            while (true) {
                int i2 = this.f2699d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2696a;
                int i3 = i2 - 1;
                this.f2699d = i3;
                this.f2700e = charSequence.charAt(i3);
                char c = this.f2700e;
                if (c == '<') {
                    return 12;
                }
                if (c == '>') {
                    break;
                } else if (c == '\"' || c == '\'') {
                    char c2 = this.f2700e;
                    do {
                        int i4 = this.f2699d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f2696a;
                        int i5 = i4 - 1;
                        this.f2699d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f2700e = charAt;
                    } while (charAt != c2);
                }
            }
            this.f2699d = i;
            this.f2700e = '>';
            return 13;
        }

        /* renamed from: h */
        private byte m2728h() {
            char charAt;
            int i = this.f2699d;
            while (true) {
                int i2 = this.f2699d;
                if (i2 < this.f2698c) {
                    CharSequence charSequence = this.f2696a;
                    this.f2699d = i2 + 1;
                    this.f2700e = charSequence.charAt(i2);
                    char c = this.f2700e;
                    if (c == '>') {
                        return 12;
                    }
                    if (c == '\"' || c == '\'') {
                        char c2 = this.f2700e;
                        do {
                            int i3 = this.f2699d;
                            if (i3 >= this.f2698c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2696a;
                            this.f2699d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f2700e = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    this.f2699d = i;
                    this.f2700e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public byte mo3208b() {
            this.f2700e = this.f2696a.charAt(this.f2699d);
            if (Character.isHighSurrogate(this.f2700e)) {
                int codePointAt = Character.codePointAt(this.f2696a, this.f2699d);
                this.f2699d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2699d++;
            byte a = m2724a(this.f2700e);
            if (this.f2697b) {
                char c = this.f2700e;
                if (c == '<') {
                    a = m2728h();
                } else if (c == '&') {
                    a = m2726f();
                }
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo3209c() {
            this.f2699d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2699d < this.f2698c && i == 0) {
                byte b = mo3208b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2699d > 0) {
                switch (mo3207a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = r2 - 1;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3210d() {
            /*
                r7 = this;
                int r0 = r7.f2698c
                r7.f2699d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f2699d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo3207a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0025:
                if (r1 != r2) goto L_0x002b
                return r5
            L_0x0028:
                if (r1 != r2) goto L_0x002b
                return r4
            L_0x002b:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r2 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r1 != 0) goto L_0x0007
            L_0x0039:
                r1 = r2
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.C0583a.C0585b.mo3210d():int");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte mo3207a() {
            this.f2700e = this.f2696a.charAt(this.f2699d - 1);
            if (Character.isLowSurrogate(this.f2700e)) {
                int codePointBefore = Character.codePointBefore(this.f2696a, this.f2699d);
                this.f2699d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2699d--;
            byte a = m2724a(this.f2700e);
            if (this.f2697b) {
                char c = this.f2700e;
                if (c == '>') {
                    a = m2727g();
                } else if (c == ';') {
                    a = m2725e();
                }
            }
            return a;
        }
    }

    C0583a(boolean z, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f2689a = z;
        this.f2690b = i;
        this.f2691c = textDirectionHeuristicCompat;
    }

    /* renamed from: b */
    public static C0583a m2715b() {
        return new C0584a().mo3206a();
    }

    /* renamed from: c */
    private static int m2717c(CharSequence charSequence) {
        return new C0585b(charSequence, false).mo3210d();
    }

    /* renamed from: a */
    public boolean mo3205a() {
        return (this.f2690b & 2) != 0;
    }

    /* renamed from: a */
    private String m2712a(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (this.f2689a || (!isRtl && m2717c(charSequence) != 1)) {
            return (!this.f2689a || (isRtl && m2717c(charSequence) != -1)) ? "" : f2686f;
        }
        return f2685e;
    }

    /* renamed from: b */
    private String m2716b(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        if (this.f2689a || (!isRtl && m2714b(charSequence) != 1)) {
            return (!this.f2689a || (isRtl && m2714b(charSequence) != -1)) ? "" : f2686f;
        }
        return f2685e;
    }

    /* renamed from: b */
    private static int m2714b(CharSequence charSequence) {
        return new C0585b(charSequence, false).mo3209c();
    }

    /* renamed from: a */
    public CharSequence mo3204a(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo3205a() && z) {
            spannableStringBuilder.append(m2716b(charSequence, isRtl ? C0591e.f2715b : C0591e.f2714a));
        }
        if (isRtl != this.f2689a) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m2712a(charSequence, isRtl ? C0591e.f2715b : C0591e.f2714a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public CharSequence mo3203a(CharSequence charSequence) {
        return mo3204a(charSequence, this.f2691c, true);
    }

    /* renamed from: a */
    static boolean m2713a(Locale locale) {
        return C0598f.m2758b(locale) == 1;
    }
}
