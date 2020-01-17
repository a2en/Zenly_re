package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.getkeepsafe.relinker.ReLinker.LibraryInstaller;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.getkeepsafe.relinker.a */
public class C9934a implements LibraryInstaller {

    /* renamed from: com.getkeepsafe.relinker.a$a */
    private static class C9935a {

        /* renamed from: a */
        public ZipFile f26071a;

        /* renamed from: b */
        public ZipEntry f26072b;

        public C9935a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f26071a = zipFile;
            this.f26072b = zipEntry;
        }
    }

    /* renamed from: a */
    private String[] m24853a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (VERSION.SDK_INT >= 21) {
            String[] strArr = applicationInfo.splitSourceDirs;
            if (!(strArr == null || strArr.length == 0)) {
                String[] strArr2 = new String[(strArr.length + 1)];
                strArr2[0] = applicationInfo.sourceDir;
                System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
                return strArr2;
            }
        }
        return new String[]{applicationInfo.sourceDir};
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x00a5 A[SYNTHETIC, Splitter:B:71:0x00a5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void installLibrary(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, com.getkeepsafe.relinker.C9936b r15) {
        /*
            r10 = this;
            r0 = 0
            com.getkeepsafe.relinker.a$a r11 = r10.m24851a(r11, r12, r13, r15)     // Catch:{ all -> 0x00a1 }
            if (r11 == 0) goto L_0x0099
            r12 = 0
            r1 = 0
        L_0x0009:
            int r2 = r1 + 1
            r3 = 5
            if (r1 >= r3) goto L_0x0088
            java.lang.String r1 = "Found %s! Extracting..."
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x009f }
            r4[r12] = r13     // Catch:{ all -> 0x009f }
            r15.mo26804a(r1, r4)     // Catch:{ all -> 0x009f }
            boolean r1 = r14.exists()     // Catch:{ IOException -> 0x0086 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r14.createNewFile()     // Catch:{ IOException -> 0x0086 }
            if (r1 != 0) goto L_0x0026
            goto L_0x0086
        L_0x0026:
            java.util.zip.ZipFile r1 = r11.f26071a     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007a, all -> 0x0071 }
            java.util.zip.ZipEntry r4 = r11.f26072b     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007a, all -> 0x0071 }
            java.io.InputStream r1 = r1.getInputStream(r4)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007a, all -> 0x0071 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006d, all -> 0x006b }
            r4.<init>(r14)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006d, all -> 0x006b }
            long r5 = r10.m24850a(r1, r4)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0068 }
            java.io.FileDescriptor r7 = r4.getFD()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0068 }
            r7.sync()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0068 }
            long r7 = r14.length()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0068 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x004d
            r10.m24852a(r1)     // Catch:{ all -> 0x009f }
        L_0x0049:
            r10.m24852a(r4)     // Catch:{ all -> 0x009f }
            goto L_0x0086
        L_0x004d:
            r10.m24852a(r1)     // Catch:{ all -> 0x009f }
            r10.m24852a(r4)     // Catch:{ all -> 0x009f }
            r14.setReadable(r3, r12)     // Catch:{ all -> 0x009f }
            r14.setExecutable(r3, r12)     // Catch:{ all -> 0x009f }
            r14.setWritable(r3)     // Catch:{ all -> 0x009f }
            if (r11 == 0) goto L_0x0067
            java.util.zip.ZipFile r12 = r11.f26071a     // Catch:{ IOException -> 0x0067 }
            if (r12 == 0) goto L_0x0067
            java.util.zip.ZipFile r11 = r11.f26071a     // Catch:{ IOException -> 0x0067 }
            r11.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return
        L_0x0068:
            r12 = move-exception
            r0 = r4
            goto L_0x0073
        L_0x006b:
            r12 = move-exception
            goto L_0x0073
        L_0x006d:
            r4 = r0
            goto L_0x007c
        L_0x006f:
            r4 = r0
            goto L_0x0082
        L_0x0071:
            r12 = move-exception
            r1 = r0
        L_0x0073:
            r10.m24852a(r1)     // Catch:{ all -> 0x009f }
            r10.m24852a(r0)     // Catch:{ all -> 0x009f }
            throw r12     // Catch:{ all -> 0x009f }
        L_0x007a:
            r1 = r0
            r4 = r1
        L_0x007c:
            r10.m24852a(r1)     // Catch:{ all -> 0x009f }
            goto L_0x0049
        L_0x0080:
            r1 = r0
            r4 = r1
        L_0x0082:
            r10.m24852a(r1)     // Catch:{ all -> 0x009f }
            goto L_0x0049
        L_0x0086:
            r1 = r2
            goto L_0x0009
        L_0x0088:
            java.lang.String r12 = "FATAL! Couldn't extract the library from the APK!"
            r15.mo26803a(r12)     // Catch:{ all -> 0x009f }
            if (r11 == 0) goto L_0x0098
            java.util.zip.ZipFile r12 = r11.f26071a     // Catch:{ IOException -> 0x0098 }
            if (r12 == 0) goto L_0x0098
            java.util.zip.ZipFile r11 = r11.f26071a     // Catch:{ IOException -> 0x0098 }
            r11.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            return
        L_0x0099:
            com.getkeepsafe.relinker.MissingLibraryException r12 = new com.getkeepsafe.relinker.MissingLibraryException     // Catch:{ all -> 0x009f }
            r12.<init>(r13)     // Catch:{ all -> 0x009f }
            throw r12     // Catch:{ all -> 0x009f }
        L_0x009f:
            r12 = move-exception
            goto L_0x00a3
        L_0x00a1:
            r12 = move-exception
            r11 = r0
        L_0x00a3:
            if (r11 == 0) goto L_0x00ae
            java.util.zip.ZipFile r13 = r11.f26071a     // Catch:{ IOException -> 0x00ae }
            if (r13 == 0) goto L_0x00ae
            java.util.zip.ZipFile r11 = r11.f26071a     // Catch:{ IOException -> 0x00ae }
            r11.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getkeepsafe.relinker.C9934a.installLibrary(android.content.Context, java.lang.String[], java.lang.String, java.io.File, com.getkeepsafe.relinker.b):void");
    }

    /* renamed from: a */
    private C9935a m24851a(Context context, String[] strArr, String str, C9936b bVar) {
        int i;
        String[] strArr2 = strArr;
        String[] a = m24853a(context);
        int length = a.length;
        char c = 0;
        ZipFile zipFile = null;
        int i2 = 0;
        while (i2 < length) {
            String str2 = a[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                i = 5;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                C9936b bVar2 = bVar;
            } else {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < i) {
                        int length2 = strArr2.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            String str4 = strArr2[i7];
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            sb.append(File.separatorChar);
                            sb.append(str4);
                            sb.append(File.separatorChar);
                            sb.append(str);
                            String sb2 = sb.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb2;
                            objArr[1] = str2;
                            bVar.mo26804a("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new C9935a(zipFile, entry);
                            }
                            i7++;
                            c = 0;
                        }
                        String str5 = str;
                        C9936b bVar3 = bVar;
                        i5 = i6;
                        i = 5;
                    } else {
                        String str6 = str;
                        C9936b bVar4 = bVar;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
            c = 0;
        }
        return null;
    }

    /* renamed from: a */
    private long m24850a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    private void m24852a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
