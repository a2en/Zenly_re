package app.zenly.locator.core.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {

    public interface StringModifier {
        String onReadLine(String str);
    }

    /* renamed from: a */
    public static void m10158a(InputStream inputStream, File file, StringModifier stringModifier) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                m10159a(inputStream, (OutputStream) fileOutputStream2, stringModifier);
                try {
                    fileOutputStream2.close();
                } catch (Exception unused) {
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.BufferedWriter] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.io.BufferedWriter] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:1|2|3|4|(3:5|6|(1:8)(1:39))|9|10|11|12|13|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
      assigns: []
      uses: []
      mth insns count: 44
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
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0042 A[SYNTHETIC, Splitter:B:31:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0049 A[SYNTHETIC, Splitter:B:35:0x0049] */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10159a(java.io.InputStream r3, java.io.OutputStream r4, app.zenly.locator.core.util.FileUtil.StringModifier r5) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
        L_0x0015:
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = r5.onReadLine(r4)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            r3.write(r4)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            goto L_0x0015
        L_0x0023:
            r3.flush()     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            r3.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            r1.close()     // Catch:{ Exception -> 0x002c }
        L_0x002c:
            return
        L_0x002d:
            r4 = move-exception
            goto L_0x003f
        L_0x002f:
            r4 = move-exception
            goto L_0x0035
        L_0x0031:
            r4 = move-exception
            goto L_0x0040
        L_0x0033:
            r4 = move-exception
            r3 = r0
        L_0x0035:
            r0 = r1
            goto L_0x003c
        L_0x0037:
            r4 = move-exception
            r1 = r0
            goto L_0x0040
        L_0x003a:
            r4 = move-exception
            r3 = r0
        L_0x003c:
            throw r4     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception
            r1 = r0
        L_0x003f:
            r0 = r3
        L_0x0040:
            if (r0 == 0) goto L_0x0047
            r0.close()     // Catch:{ Exception -> 0x0046 }
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.util.FileUtil.m10159a(java.io.InputStream, java.io.OutputStream, app.zenly.locator.core.util.FileUtil$StringModifier):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0034, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0037, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10157a(java.io.File r3, java.io.File r4) throws java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x002c }
            r3.<init>(r4)     // Catch:{ all -> 0x002c }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0020 }
        L_0x000e:
            int r1 = r0.read(r4)     // Catch:{ all -> 0x0020 }
            if (r1 <= 0) goto L_0x0019
            r2 = 0
            r3.write(r4, r2, r1)     // Catch:{ all -> 0x0020 }
            goto L_0x000e
        L_0x0019:
            r3.close()     // Catch:{ all -> 0x002c }
            r0.close()
            return
        L_0x0020:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ all -> 0x002c }
        L_0x002b:
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x0037:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.util.FileUtil.m10157a(java.io.File, java.io.File):void");
    }
}
