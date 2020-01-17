package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.C0540a;
import com.google.android.gms.internal.firebase_messaging.C10462l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: com.google.firebase.iid.v0 */
final class C11092v0 {
    C11092v0() {
    }

    /* renamed from: c */
    private final C11051b m28554c(Context context, String str) throws C11096x0 {
        try {
            C11051b d = m28555d(context, str);
            if (d != null) {
                m28548a(context, str, d);
                return d;
            }
            e = null;
            try {
                C11051b a = m28543a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m28542a(context, str, a, false);
                    return a;
                }
            } catch (C11096x0 e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C11096x0 e2) {
            e = e2;
        }
    }

    /* renamed from: d */
    private final C11051b m28555d(Context context, String str) throws C11096x0 {
        File e = m28556e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return m28544a(e);
        } catch (C11096x0 | IOException e2) {
            String str2 = "FirebaseInstanceId";
            if (Log.isLoggable(str2, 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d(str2, sb.toString());
            }
            try {
                return m28544a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w(str2, sb2.toString());
                throw new C11096x0((Exception) e3);
            }
        }
    }

    /* renamed from: e */
    private static File m28556e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m28553b(context), str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C11051b mo32317a(Context context, String str) throws C11096x0 {
        C11051b c = m28554c(context, str);
        if (c != null) {
            return c;
        }
        return mo32318b(context, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C11051b mo32318b(Context context, String str) {
        C11051b bVar = new C11051b(C11049a.m28460a(), System.currentTimeMillis());
        C11051b a = m28542a(context, str, bVar, true);
        String str2 = "FirebaseInstanceId";
        if (a == null || a.equals(bVar)) {
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Generated new key");
            }
            m28548a(context, str, bVar);
            return bVar;
        }
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Loaded key after generating new one, using loaded one");
        }
        return a;
    }

    /* renamed from: a */
    static void m28547a(Context context) {
        File[] listFiles;
        for (File file : m28553b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private static KeyPair m28546a(String str, String str2) throws C11096x0 {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C11096x0((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C11096x0((Exception) e2);
        }
    }

    /* renamed from: b */
    private static File m28553b(Context context) {
        File b = C0540a.m2544b(context);
        if (b != null && b.isDirectory()) {
            return b;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: b */
    private static long m28552b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C11095x.m28563a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r9 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        m28551a(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        m28550a(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        throw r11;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0060=Splitter:B:19:0x0060, B:31:0x009e=Splitter:B:31:0x009e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C11051b m28542a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.C11051b r11, boolean r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            boolean r2 = android.util.Log.isLoggable(r1, r0)
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = "Writing key to properties file"
            android.util.Log.d(r1, r2)
        L_0x000e:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r3 = r11.m28464c()
            java.lang.String r4 = "pub"
            r2.setProperty(r4, r3)
            java.lang.String r3 = r11.m28465d()
            java.lang.String r4 = "pri"
            r2.setProperty(r4, r3)
            long r3 = r11.f28675b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r9 = m28556e(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00b2 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r4 = "rw"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x00b2 }
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch:{ all -> 0x00ab }
            r9.lock()     // Catch:{ all -> 0x00a2 }
            r4 = 0
            if (r12 == 0) goto L_0x008f
            long r6 = r9.size()     // Catch:{ all -> 0x00a2 }
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x008f
            r9.position(r4)     // Catch:{ IOException -> 0x0066, x0 -> 0x0064 }
            com.google.firebase.iid.b r11 = m28545a(r9)     // Catch:{ IOException -> 0x0066, x0 -> 0x0064 }
            if (r9 == 0) goto L_0x0060
            m28551a(r10, r9)     // Catch:{ all -> 0x00ab }
        L_0x0060:
            m28550a(r10, r3)     // Catch:{ IOException -> 0x00b2 }
            return r11
        L_0x0064:
            r12 = move-exception
            goto L_0x0067
        L_0x0066:
            r12 = move-exception
        L_0x0067:
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00a2 }
            int r0 = r0.length()     // Catch:{ all -> 0x00a2 }
            int r0 = r0 + 64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "Tried reading key pair before writing new one, but failed with: "
            r6.append(r0)     // Catch:{ all -> 0x00a2 }
            r6.append(r12)     // Catch:{ all -> 0x00a2 }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x00a2 }
            android.util.Log.d(r1, r12)     // Catch:{ all -> 0x00a2 }
        L_0x008f:
            r9.position(r4)     // Catch:{ all -> 0x00a2 }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ all -> 0x00a2 }
            r2.store(r12, r10)     // Catch:{ all -> 0x00a2 }
            if (r9 == 0) goto L_0x009e
            m28551a(r10, r9)     // Catch:{ all -> 0x00ab }
        L_0x009e:
            m28550a(r10, r3)     // Catch:{ IOException -> 0x00b2 }
            return r11
        L_0x00a2:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r12 = move-exception
            if (r9 == 0) goto L_0x00aa
            m28551a(r11, r9)     // Catch:{ all -> 0x00ab }
        L_0x00aa:
            throw r12     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r11 = move-exception
            m28550a(r9, r3)     // Catch:{ IOException -> 0x00b2 }
            throw r11     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            int r11 = r11 + 21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Failed to write key: "
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.w(r1, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C11092v0.m28542a(android.content.Context, java.lang.String, com.google.firebase.iid.b, boolean):com.google.firebase.iid.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r8 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        m28551a(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        m28549a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C11051b m28544a(java.io.File r8) throws com.google.firebase.iid.C11096x0, java.io.IOException {
        /*
            r7 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002c }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r8
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0023 }
            com.google.firebase.iid.b r1 = m28545a(r8)     // Catch:{ all -> 0x0023 }
            r2 = 0
            if (r8 == 0) goto L_0x001f
            m28551a(r2, r8)     // Catch:{ all -> 0x002c }
        L_0x001f:
            m28549a(r2, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            if (r8 == 0) goto L_0x002b
            m28551a(r1, r8)     // Catch:{ all -> 0x002c }
        L_0x002b:
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            m28549a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C11092v0.m28544a(java.io.File):com.google.firebase.iid.b");
    }

    /* renamed from: a */
    private static C11051b m28545a(FileChannel fileChannel) throws C11096x0, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new C11096x0("Invalid properties file");
        }
        try {
            return new C11051b(m28546a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new C11096x0((Exception) e);
        }
    }

    /* renamed from: a */
    private static C11051b m28543a(SharedPreferences sharedPreferences, String str) throws C11096x0 {
        String string = sharedPreferences.getString(C11095x.m28563a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(C11095x.m28563a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C11051b(m28546a(string, string2), m28552b(sharedPreferences, str));
    }

    /* renamed from: a */
    private final void m28548a(Context context, String str, C11051b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (bVar.equals(m28543a(sharedPreferences, str))) {
                return;
            }
        } catch (C11096x0 unused) {
        }
        String str2 = "FirebaseInstanceId";
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Writing key to shared preferences");
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(C11095x.m28563a(str, "|P|"), bVar.m28464c());
        edit.putString(C11095x.m28563a(str, "|K|"), bVar.m28465d());
        edit.putString(C11095x.m28563a(str, "cre"), String.valueOf(bVar.f28675b));
        edit.commit();
    }

    /* renamed from: a */
    private static /* synthetic */ void m28551a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C10462l.m26847a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m28550a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C10462l.m26847a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m28549a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C10462l.m26847a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
