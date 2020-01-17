package app.zenly.locator.p143s.p160v.p161b;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: app.zenly.locator.s.v.b.i */
public final class C5543i {

    /* renamed from: a */
    private static final Pattern f14192a = Pattern.compile("%([0-9]+\\$|<?)([^a-zA-z%]*)([[a-zA-Z%]&&[^tT]]|[tT][a-zA-Z])");

    /* renamed from: a */
    public static CharSequence m15727a(CharSequence charSequence, Object... objArr) {
        return m15728a(Locale.getDefault(), charSequence, objArr);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.text.Spanned] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v3
      assigns: []
      uses: []
      mth insns count: 63
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m15728a(java.util.Locale r11, java.lang.CharSequence r12, java.lang.Object... r13) {
        /*
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r12)
            r12 = 0
            r1 = -1
            r1 = 0
            r2 = -1
        L_0x0009:
            int r3 = r0.length()
            if (r1 >= r3) goto L_0x00a5
            java.util.regex.Pattern r3 = f14192a
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r1 = r3.find(r1)
            if (r1 != 0) goto L_0x001d
            goto L_0x00a5
        L_0x001d:
            int r1 = r3.start()
            int r4 = r3.end()
            r5 = 1
            java.lang.String r6 = r3.group(r5)
            r7 = 2
            java.lang.String r7 = r3.group(r7)
            r8 = 3
            java.lang.String r3 = r3.group(r8)
            java.lang.String r8 = "%"
            boolean r9 = r3.equals(r8)
            if (r9 == 0) goto L_0x003d
            goto L_0x009b
        L_0x003d:
            java.lang.String r9 = "n"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x0048
            java.lang.String r8 = "\n"
            goto L_0x009b
        L_0x0048:
            java.lang.String r9 = ""
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x0054
            int r2 = r2 + 1
        L_0x0052:
            r6 = r2
            goto L_0x006e
        L_0x0054:
            java.lang.String r9 = "<"
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x005d
            goto L_0x0052
        L_0x005d:
            int r9 = r6.length()
            int r9 = r9 - r5
            java.lang.String r6 = r6.substring(r12, r9)
            int r6 = java.lang.Integer.parseInt(r6)
            int r6 = r6 - r5
            r10 = r6
            r6 = r2
            r2 = r10
        L_0x006e:
            r2 = r13[r2]
            java.lang.String r9 = "s"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x0080
            boolean r9 = r2 instanceof android.text.Spanned
            if (r9 == 0) goto L_0x0080
            r8 = r2
            android.text.Spanned r8 = (android.text.Spanned) r8
            goto L_0x009a
        L_0x0080:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r7)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r12] = r2
            java.lang.String r8 = java.lang.String.format(r11, r3, r5)
        L_0x009a:
            r2 = r6
        L_0x009b:
            r0.replace(r1, r4, r8)
            int r3 = r8.length()
            int r1 = r1 + r3
            goto L_0x0009
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p143s.p160v.p161b.C5543i.m15728a(java.util.Locale, java.lang.CharSequence, java.lang.Object[]):java.lang.CharSequence");
    }
}
