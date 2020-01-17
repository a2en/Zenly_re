package androidx.emoji.text;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import p214e.p234h.p235e.C7615b;

/* renamed from: androidx.emoji.text.b */
final class C0741b {

    /* renamed from: a */
    private final C0739g f3069a;

    /* renamed from: b */
    private final C0757f f3070b;

    /* renamed from: c */
    private C0743b f3071c = new C0743b();

    /* renamed from: d */
    private final boolean f3072d;

    /* renamed from: e */
    private final int[] f3073e;

    /* renamed from: androidx.emoji.text.b$a */
    private static final class C0742a {
        /* renamed from: a */
        static int m3485a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        static int m3486b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: androidx.emoji.text.b$b */
    public static class C0743b {

        /* renamed from: b */
        private static final ThreadLocal<StringBuilder> f3074b = new ThreadLocal<>();

        /* renamed from: a */
        private final TextPaint f3075a = new TextPaint();

        C0743b() {
            this.f3075a.setTextSize(10.0f);
        }

        /* renamed from: a */
        public boolean mo3723a(CharSequence charSequence, int i, int i2) {
            StringBuilder a = m3487a();
            a.setLength(0);
            while (i < i2) {
                a.append(charSequence.charAt(i));
                i++;
            }
            return C7615b.m18495a(this.f3075a, a.toString());
        }

        /* renamed from: a */
        private static StringBuilder m3487a() {
            if (f3074b.get() == null) {
                f3074b.set(new StringBuilder());
            }
            return (StringBuilder) f3074b.get();
        }
    }

    /* renamed from: androidx.emoji.text.b$c */
    static final class C0744c {

        /* renamed from: a */
        private int f3076a = 1;

        /* renamed from: b */
        private final C0758a f3077b;

        /* renamed from: c */
        private C0758a f3078c;

        /* renamed from: d */
        private C0758a f3079d;

        /* renamed from: e */
        private int f3080e;

        /* renamed from: f */
        private int f3081f;

        /* renamed from: g */
        private final boolean f3082g;

        /* renamed from: h */
        private final int[] f3083h;

        C0744c(C0758a aVar, boolean z, int[] iArr) {
            this.f3077b = aVar;
            this.f3078c = aVar;
            this.f3082g = z;
            this.f3083h = iArr;
        }

        /* renamed from: b */
        private static boolean m3489b(int i) {
            return i == 65039;
        }

        /* renamed from: c */
        private static boolean m3490c(int i) {
            return i == 65038;
        }

        /* renamed from: d */
        private int m3491d() {
            this.f3076a = 1;
            this.f3078c = this.f3077b;
            this.f3081f = 0;
            return 1;
        }

        /* renamed from: e */
        private boolean m3492e() {
            if (this.f3078c.mo3752a().mo3719g() || m3489b(this.f3080e)) {
                return true;
            }
            if (this.f3082g) {
                if (this.f3083h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3083h, this.f3078c.mo3752a().mo3711a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3724a(int i) {
            C0758a a = this.f3078c.mo3753a(i);
            int i2 = 3;
            if (this.f3076a != 2) {
                if (a == null) {
                    i2 = m3491d();
                    this.f3080e = i;
                    return i2;
                }
                this.f3076a = 2;
                this.f3078c = a;
                this.f3081f = 1;
            } else if (a != null) {
                this.f3078c = a;
                this.f3081f++;
            } else {
                if (m3490c(i)) {
                    i2 = m3491d();
                } else if (!m3489b(i)) {
                    if (this.f3078c.mo3752a() == null) {
                        i2 = m3491d();
                    } else if (this.f3081f != 1) {
                        this.f3079d = this.f3078c;
                        m3491d();
                    } else if (m3492e()) {
                        this.f3079d = this.f3078c;
                        m3491d();
                    } else {
                        i2 = m3491d();
                    }
                }
                this.f3080e = i;
                return i2;
            }
            i2 = 2;
            this.f3080e = i;
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0740a mo3726b() {
            return this.f3079d.mo3752a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo3727c() {
            if (this.f3076a != 2 || this.f3078c.mo3752a() == null || (this.f3081f <= 1 && !m3492e())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0740a mo3725a() {
            return this.f3078c.mo3752a();
        }
    }

    C0741b(C0757f fVar, C0739g gVar, boolean z, int[] iArr) {
        this.f3069a = gVar;
        this.f3070b = fVar;
        this.f3072d = z;
        this.f3073e = iArr;
    }

    /* renamed from: a */
    private static boolean m3477a(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0740a mo3721a(CharSequence charSequence) {
        C0744c cVar = new C0744c(this.f3070b.mo3750d(), this.f3072d, this.f3073e);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (cVar.mo3724a(codePointAt) != 2) {
                return null;
            }
            i += Character.charCount(codePointAt);
        }
        if (cVar.mo3727c()) {
            return cVar.mo3725a();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r5v7, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r5v10, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.text.Spannable] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.CharSequence, code=null, for r10v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v8
      assigns: []
      uses: []
      mth insns count: 131
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[Catch:{ all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[Catch:{ all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo3722a(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji.widget.C0770h
            if (r0 == 0) goto L_0x000a
            r1 = r10
            androidx.emoji.widget.h r1 = (androidx.emoji.widget.C0770h) r1
            r1.mo3789a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x0117 }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x0117 }
            if (r2 == 0) goto L_0x002e
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x0117 }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji.text.c> r5 = androidx.emoji.text.C0745c.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x0117 }
            if (r2 > r12) goto L_0x002e
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x0117 }
            r1.<init>(r10)     // Catch:{ all -> 0x0117 }
            goto L_0x002e
        L_0x002b:
            r1 = r10
            android.text.Spannable r1 = (android.text.Spannable) r1     // Catch:{ all -> 0x0117 }
        L_0x002e:
            r2 = 0
            if (r1 == 0) goto L_0x0060
            java.lang.Class<androidx.emoji.text.c> r3 = androidx.emoji.text.C0745c.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x0117 }
            androidx.emoji.text.c[] r3 = (androidx.emoji.text.C0745c[]) r3     // Catch:{ all -> 0x0117 }
            if (r3 == 0) goto L_0x0060
            int r4 = r3.length     // Catch:{ all -> 0x0117 }
            if (r4 <= 0) goto L_0x0060
            int r4 = r3.length     // Catch:{ all -> 0x0117 }
            r5 = r12
            r12 = r11
            r11 = 0
        L_0x0042:
            if (r11 >= r4) goto L_0x005e
            r6 = r3[r11]     // Catch:{ all -> 0x0117 }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x0117 }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x0117 }
            if (r7 == r5) goto L_0x0053
            r1.removeSpan(r6)     // Catch:{ all -> 0x0117 }
        L_0x0053:
            int r12 = java.lang.Math.min(r7, r12)     // Catch:{ all -> 0x0117 }
            int r5 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0117 }
            int r11 = r11 + 1
            goto L_0x0042
        L_0x005e:
            r11 = r12
            r12 = r5
        L_0x0060:
            if (r11 == r12) goto L_0x010e
            int r3 = r10.length()     // Catch:{ all -> 0x0117 }
            if (r11 < r3) goto L_0x006a
            goto L_0x010e
        L_0x006a:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x007f
            if (r1 == 0) goto L_0x007f
            int r3 = r1.length()     // Catch:{ all -> 0x0117 }
            java.lang.Class<androidx.emoji.text.c> r4 = androidx.emoji.text.C0745c.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x0117 }
            androidx.emoji.text.c[] r3 = (androidx.emoji.text.C0745c[]) r3     // Catch:{ all -> 0x0117 }
            int r3 = r3.length     // Catch:{ all -> 0x0117 }
            int r13 = r13 - r3
        L_0x007f:
            androidx.emoji.text.b$c r3 = new androidx.emoji.text.b$c     // Catch:{ all -> 0x0117 }
            androidx.emoji.text.f r4 = r9.f3070b     // Catch:{ all -> 0x0117 }
            androidx.emoji.text.f$a r4 = r4.mo3750d()     // Catch:{ all -> 0x0117 }
            boolean r5 = r9.f3072d     // Catch:{ all -> 0x0117 }
            int[] r6 = r9.f3073e     // Catch:{ all -> 0x0117 }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x0117 }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0117 }
            r5 = r1
        L_0x0093:
            r1 = r11
        L_0x0094:
            if (r11 >= r12) goto L_0x00e1
            if (r2 >= r13) goto L_0x00e1
            int r6 = r3.mo3724a(r4)     // Catch:{ all -> 0x0117 }
            r7 = 1
            if (r6 == r7) goto L_0x00cf
            r7 = 2
            if (r6 == r7) goto L_0x00c3
            r7 = 3
            if (r6 == r7) goto L_0x00a6
            goto L_0x0094
        L_0x00a6:
            if (r14 != 0) goto L_0x00b2
            androidx.emoji.text.a r6 = r3.mo3726b()     // Catch:{ all -> 0x0117 }
            boolean r6 = r9.m3482a(r10, r1, r11, r6)     // Catch:{ all -> 0x0117 }
            if (r6 != 0) goto L_0x0093
        L_0x00b2:
            if (r5 != 0) goto L_0x00b9
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ all -> 0x0117 }
            r5.<init>(r10)     // Catch:{ all -> 0x0117 }
        L_0x00b9:
            androidx.emoji.text.a r6 = r3.mo3726b()     // Catch:{ all -> 0x0117 }
            r9.m3476a(r5, r6, r1, r11)     // Catch:{ all -> 0x0117 }
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00c3:
            int r6 = java.lang.Character.charCount(r4)     // Catch:{ all -> 0x0117 }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0094
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0117 }
            goto L_0x0094
        L_0x00cf:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0117 }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0117 }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00df
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0117 }
            r4 = r11
        L_0x00df:
            r11 = r1
            goto L_0x0094
        L_0x00e1:
            boolean r12 = r3.mo3727c()     // Catch:{ all -> 0x0117 }
            if (r12 == 0) goto L_0x0103
            if (r2 >= r13) goto L_0x0103
            if (r14 != 0) goto L_0x00f5
            androidx.emoji.text.a r12 = r3.mo3725a()     // Catch:{ all -> 0x0117 }
            boolean r12 = r9.m3482a(r10, r1, r11, r12)     // Catch:{ all -> 0x0117 }
            if (r12 != 0) goto L_0x0103
        L_0x00f5:
            if (r5 != 0) goto L_0x00fc
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ all -> 0x0117 }
            r5.<init>(r10)     // Catch:{ all -> 0x0117 }
        L_0x00fc:
            androidx.emoji.text.a r12 = r3.mo3725a()     // Catch:{ all -> 0x0117 }
            r9.m3476a(r5, r12, r1, r11)     // Catch:{ all -> 0x0117 }
        L_0x0103:
            if (r5 != 0) goto L_0x0106
            r5 = r10
        L_0x0106:
            if (r0 == 0) goto L_0x010d
            androidx.emoji.widget.h r10 = (androidx.emoji.widget.C0770h) r10
            r10.mo3794b()
        L_0x010d:
            return r5
        L_0x010e:
            if (r0 == 0) goto L_0x0116
            r11 = r10
            androidx.emoji.widget.h r11 = (androidx.emoji.widget.C0770h) r11
            r11.mo3794b()
        L_0x0116:
            return r10
        L_0x0117:
            r11 = move-exception
            if (r0 == 0) goto L_0x011f
            androidx.emoji.widget.h r10 = (androidx.emoji.widget.C0770h) r10
            r10.mo3794b()
        L_0x011f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.text.C0741b.mo3722a(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* renamed from: a */
    static boolean m3478a(Editable editable, int i, KeyEvent keyEvent) {
        boolean z = i != 67 ? i != 112 ? false : m3479a(editable, keyEvent, true) : m3479a(editable, keyEvent, false);
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: a */
    private static boolean m3479a(Editable editable, KeyEvent keyEvent, boolean z) {
        if (m3480a(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (m3477a(selectionStart, selectionEnd)) {
            return false;
        }
        C0745c[] cVarArr = (C0745c[]) editable.getSpans(selectionStart, selectionEnd, C0745c.class);
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            int i = 0;
            while (i < length) {
                C0745c cVar = cVarArr[i];
                int spanStart = editable.getSpanStart(cVar);
                int spanEnd = editable.getSpanEnd(cVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m3481a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m3477a(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C0742a.m3485a(editable, selectionStart, Math.max(i, 0));
                i3 = C0742a.m3486b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            C0745c[] cVarArr = (C0745c[]) editable.getSpans(i4, i3, C0745c.class);
            if (cVarArr != null && cVarArr.length > 0) {
                int i5 = i3;
                int i6 = i4;
                for (C0745c cVar : cVarArr) {
                    int spanStart = editable.getSpanStart(cVar);
                    int spanEnd = editable.getSpanEnd(cVar);
                    i6 = Math.min(spanStart, i6);
                    i5 = Math.max(spanEnd, i5);
                }
                int max = Math.max(i6, 0);
                int min = Math.min(i5, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3480a(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: a */
    private void m3476a(Spannable spannable, C0740a aVar, int i, int i2) {
        spannable.setSpan(this.f3069a.mo3709a(aVar), i, i2, 33);
    }

    /* renamed from: a */
    private boolean m3482a(CharSequence charSequence, int i, int i2, C0740a aVar) {
        boolean z = false;
        if (VERSION.SDK_INT < 23 && aVar.mo3717e() > VERSION.SDK_INT) {
            return false;
        }
        if (aVar.mo3714b() == 0) {
            aVar.mo3713a(this.f3071c.mo3723a(charSequence, i, i2));
        }
        if (aVar.mo3714b() == 2) {
            z = true;
        }
        return z;
    }
}
