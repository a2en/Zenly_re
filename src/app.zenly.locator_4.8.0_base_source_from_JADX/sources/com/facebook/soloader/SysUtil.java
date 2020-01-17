package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class SysUtil {

    @C9911d
    @TargetApi(21)
    private static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @C9911d
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e) {
                int i = e.errno;
                if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @C9911d
        public static String[] getSupportedAbis() {
            return Build.SUPPORTED_ABIS;
        }
    }

    /* renamed from: a */
    public static int m24779a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m24783b(java.io.File r3) throws java.io.IOException {
        /*
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x002f
            java.io.File[] r0 = r3.listFiles()
            if (r0 == 0) goto L_0x0018
            r3 = 0
        L_0x000d:
            int r1 = r0.length
            if (r3 >= r1) goto L_0x004d
            r1 = r0[r3]
            m24783b(r1)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0018:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot list directory "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x002f:
            java.lang.String r0 = r3.getPath()
            java.lang.String r1 = "_lock"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x003c
            goto L_0x004d
        L_0x003c:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x004e }
            r3.sync()     // Catch:{ all -> 0x004e }
            r0.close()
        L_0x004d:
            return
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x0059:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.m24783b(java.io.File):void");
    }

    /* renamed from: c */
    static void m24784c(File file) throws IOException {
        if (!file.mkdirs() && !file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("cannot mkdir: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    public static String[] m24782a() {
        if (VERSION.SDK_INT >= 21) {
            return LollipopSysdeps.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* renamed from: a */
    public static void m24781a(FileDescriptor fileDescriptor, long j) throws IOException {
        if (VERSION.SDK_INT >= 21) {
            LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
        }
    }

    /* renamed from: a */
    public static void m24780a(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a : listFiles) {
                    m24780a(a);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("could not delete: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    static int m24778a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m24777a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }
}
