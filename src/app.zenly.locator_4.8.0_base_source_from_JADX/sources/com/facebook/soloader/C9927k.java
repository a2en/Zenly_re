package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.appsflyer.share.Constants;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.k */
public abstract class C9927k extends C9910c {

    /* renamed from: c */
    protected final Context f26054c;

    /* renamed from: d */
    protected String f26055d;

    /* renamed from: e */
    private final Map<String, Object> f26056e = new HashMap();

    /* renamed from: com.facebook.soloader.k$a */
    class C9928a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ File f26057e;

        /* renamed from: f */
        final /* synthetic */ byte[] f26058f;

        /* renamed from: g */
        final /* synthetic */ C9930c f26059g;

        /* renamed from: h */
        final /* synthetic */ File f26060h;

        /* renamed from: i */
        final /* synthetic */ C9922g f26061i;

        C9928a(File file, byte[] bArr, C9930c cVar, File file2, C9922g gVar) {
            this.f26057e = file;
            this.f26058f = bArr;
            this.f26059g = cVar;
            this.f26060h = file2;
            this.f26061i = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            throw r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = " (from syncer thread)"
                java.lang.String r1 = "rw"
                java.lang.String r2 = "releasing dso store lock for "
                java.lang.String r3 = "fb-UnpackingSoSource"
                java.lang.String r4 = "starting syncer worker"
                android.util.Log.v(r3, r4)     // Catch:{ all -> 0x007f }
                java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ all -> 0x007f }
                java.io.File r5 = r7.f26057e     // Catch:{ all -> 0x007f }
                r4.<init>(r5, r1)     // Catch:{ all -> 0x007f }
                byte[] r5 = r7.f26058f     // Catch:{ all -> 0x0073 }
                r4.write(r5)     // Catch:{ all -> 0x0073 }
                long r5 = r4.getFilePointer()     // Catch:{ all -> 0x0073 }
                r4.setLength(r5)     // Catch:{ all -> 0x0073 }
                r4.close()     // Catch:{ all -> 0x007f }
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x007f }
                com.facebook.soloader.k r5 = com.facebook.soloader.C9927k.this     // Catch:{ all -> 0x007f }
                java.io.File r5 = r5.f26036a     // Catch:{ all -> 0x007f }
                java.lang.String r6 = "dso_manifest"
                r4.<init>(r5, r6)     // Catch:{ all -> 0x007f }
                java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x007f }
                r5.<init>(r4, r1)     // Catch:{ all -> 0x007f }
                com.facebook.soloader.k$c r1 = r7.f26059g     // Catch:{ all -> 0x0067 }
                r1.mo26786a(r5)     // Catch:{ all -> 0x0067 }
                r5.close()     // Catch:{ all -> 0x007f }
                com.facebook.soloader.k r1 = com.facebook.soloader.C9927k.this     // Catch:{ all -> 0x007f }
                java.io.File r1 = r1.f26036a     // Catch:{ all -> 0x007f }
                com.facebook.soloader.SysUtil.m24783b(r1)     // Catch:{ all -> 0x007f }
                java.io.File r1 = r7.f26060h     // Catch:{ all -> 0x007f }
                r4 = 1
                com.facebook.soloader.C9927k.m24831b(r1, r4)     // Catch:{ all -> 0x007f }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009f }
                r1.<init>()     // Catch:{ IOException -> 0x009f }
                r1.append(r2)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.k r2 = com.facebook.soloader.C9927k.this     // Catch:{ IOException -> 0x009f }
                java.io.File r2 = r2.f26036a     // Catch:{ IOException -> 0x009f }
                r1.append(r2)     // Catch:{ IOException -> 0x009f }
                r1.append(r0)     // Catch:{ IOException -> 0x009f }
                java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x009f }
                android.util.Log.v(r3, r0)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.g r0 = r7.f26061i     // Catch:{ IOException -> 0x009f }
                r0.close()     // Catch:{ IOException -> 0x009f }
                return
            L_0x0067:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0069 }
            L_0x0069:
                r4 = move-exception
                r5.close()     // Catch:{ all -> 0x006e }
                goto L_0x0072
            L_0x006e:
                r5 = move-exception
                r1.addSuppressed(r5)     // Catch:{ all -> 0x007f }
            L_0x0072:
                throw r4     // Catch:{ all -> 0x007f }
            L_0x0073:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r5 = move-exception
                r4.close()     // Catch:{ all -> 0x007a }
                goto L_0x007e
            L_0x007a:
                r4 = move-exception
                r1.addSuppressed(r4)     // Catch:{ all -> 0x007f }
            L_0x007e:
                throw r5     // Catch:{ all -> 0x007f }
            L_0x007f:
                r1 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009f }
                r4.<init>()     // Catch:{ IOException -> 0x009f }
                r4.append(r2)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.k r2 = com.facebook.soloader.C9927k.this     // Catch:{ IOException -> 0x009f }
                java.io.File r2 = r2.f26036a     // Catch:{ IOException -> 0x009f }
                r4.append(r2)     // Catch:{ IOException -> 0x009f }
                r4.append(r0)     // Catch:{ IOException -> 0x009f }
                java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x009f }
                android.util.Log.v(r3, r0)     // Catch:{ IOException -> 0x009f }
                com.facebook.soloader.g r0 = r7.f26061i     // Catch:{ IOException -> 0x009f }
                r0.close()     // Catch:{ IOException -> 0x009f }
                throw r1     // Catch:{ IOException -> 0x009f }
            L_0x009f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C9927k.C9928a.run():void");
        }
    }

    /* renamed from: com.facebook.soloader.k$b */
    public static class C9929b {

        /* renamed from: e */
        public final String f26063e;

        /* renamed from: f */
        public final String f26064f;

        public C9929b(String str, String str2) {
            this.f26063e = str;
            this.f26064f = str2;
        }
    }

    /* renamed from: com.facebook.soloader.k$c */
    public static final class C9930c {

        /* renamed from: a */
        public final C9929b[] f26065a;

        public C9930c(C9929b[] bVarArr) {
            this.f26065a = bVarArr;
        }

        /* renamed from: a */
        static final C9930c m24838a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C9929b[] bVarArr = new C9929b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new C9929b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C9930c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: a */
        public final void mo26786a(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f26065a.length);
            int i = 0;
            while (true) {
                C9929b[] bVarArr = this.f26065a;
                if (i < bVarArr.length) {
                    dataOutput.writeUTF(bVarArr[i].f26063e);
                    dataOutput.writeUTF(this.f26065a[i].f26064f);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.facebook.soloader.k$d */
    protected static final class C9931d implements Closeable {

        /* renamed from: e */
        public final C9929b f26066e;

        /* renamed from: f */
        public final InputStream f26067f;

        public C9931d(C9929b bVar, InputStream inputStream) {
            this.f26066e = bVar;
            this.f26067f = inputStream;
        }

        public void close() throws IOException {
            this.f26067f.close();
        }
    }

    /* renamed from: com.facebook.soloader.k$e */
    protected static abstract class C9932e implements Closeable {
        protected C9932e() {
        }

        /* renamed from: a */
        public abstract boolean mo26777a();

        /* renamed from: b */
        public abstract C9931d mo26778b() throws IOException;

        public void close() throws IOException {
        }
    }

    /* renamed from: com.facebook.soloader.k$f */
    protected static abstract class C9933f implements Closeable {
        protected C9933f() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C9930c mo26775a() throws IOException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract C9932e mo26776b() throws IOException;

        public void close() throws IOException {
        }
    }

    protected C9927k(Context context, String str) {
        super(m24824a(context, str), 1);
        this.f26054c = context;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = move-exception;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24831b(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0021 }
            r0.write(r4)     // Catch:{ all -> 0x0021 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0021 }
            r0.setLength(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0021 }
            r3.sync()     // Catch:{ all -> 0x0021 }
            r0.close()
            return
        L_0x0021:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C9927k.m24831b(java.io.File, byte):void");
    }

    /* renamed from: a */
    public void mo26784a(String[] strArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C9933f mo26768b() throws IOException;

    /* renamed from: a */
    public static File m24824a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append(Constants.URL_PATH_DELIMITER);
        sb.append(str);
        return new File(sb.toString());
    }

    /* renamed from: a */
    private void m24828a(C9929b[] bVarArr) throws IOException {
        String[] list = this.f26036a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < bVarArr.length) {
                        if (bVarArr[i].f26063e.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.f26036a, str);
                        StringBuilder sb = new StringBuilder();
                        sb.append("deleting unaccounted-for file ");
                        sb.append(file);
                        Log.v("fb-UnpackingSoSource", sb.toString());
                        SysUtil.m24780a(file);
                    }
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unable to list directory ");
        sb2.append(this.f26036a);
        throw new IOException(sb2.toString());
    }

    /* renamed from: b */
    private Object m24830b(String str) {
        Object obj;
        synchronized (this.f26056e) {
            obj = this.f26056e.get(str);
            if (obj == null) {
                obj = new Object();
                this.f26056e.put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: a */
    private void m24826a(C9931d dVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        String str = "rw";
        StringBuilder sb = new StringBuilder();
        sb.append("extracting DSO ");
        sb.append(dVar.f26066e.f26063e);
        String str2 = "fb-UnpackingSoSource";
        Log.i(str2, sb.toString());
        if (this.f26036a.setWritable(true, true)) {
            File file = new File(this.f26036a, dVar.f26066e.f26063e);
            try {
                randomAccessFile = new RandomAccessFile(file, str);
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error overwriting ");
                sb2.append(file);
                sb2.append(" trying to delete and start over");
                Log.w(str2, sb2.toString(), e);
                SysUtil.m24780a(file);
                randomAccessFile = new RandomAccessFile(file, str);
            }
            try {
                int available = dVar.f26067f.available();
                if (available > 1) {
                    SysUtil.m24781a(randomAccessFile.getFD(), (long) available);
                }
                SysUtil.m24778a(randomAccessFile, dVar.f26067f, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("cannot make file executable: ");
                sb3.append(file);
                throw new IOException(sb3.toString());
            } catch (IOException e2) {
                SysUtil.m24780a(file);
                throw e2;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("cannot make directory writable for us: ");
            sb4.append(this.f26036a);
            throw new IOException(sb4.toString());
        }
    }

    /* renamed from: a */
    private void m24825a(byte b, C9930c cVar, C9932e eVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("regenerating DSO store ");
        sb.append(getClass().getName());
        String str = "fb-UnpackingSoSource";
        Log.v(str, sb.toString());
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f26036a, "dso_manifest"), "rw");
        C9930c cVar2 = null;
        if (b == 1) {
            try {
                cVar2 = C9930c.m24838a((DataInput) randomAccessFile);
            } catch (Exception e) {
                Log.i(str, "error reading existing DSO manifest", e);
            }
        }
        if (cVar2 == null) {
            cVar2 = new C9930c(new C9929b[0]);
        }
        m24828a(cVar.f26065a);
        byte[] bArr = new byte[32768];
        while (eVar.mo26777a()) {
            C9931d b2 = eVar.mo26778b();
            boolean z = true;
            int i = 0;
            while (z) {
                try {
                    if (i >= cVar2.f26065a.length) {
                        break;
                    }
                    if (cVar2.f26065a[i].f26063e.equals(b2.f26066e.f26063e) && cVar2.f26065a[i].f26064f.equals(b2.f26066e.f26064f)) {
                        z = false;
                    }
                    i++;
                } catch (Throwable th) {
                    if (b2 != null) {
                        try {
                            b2.close();
                        } catch (Throwable th2) {
                            try {
                                randomAccessFile.close();
                            } catch (Throwable th3) {
                                r10.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw th;
                }
            }
            if (z) {
                m24826a(b2, bArr);
            }
            if (b2 != null) {
                b2.close();
            }
        }
        randomAccessFile.close();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Finished regenerating DSO store ");
        sb2.append(getClass().getName());
        Log.v(str, sb2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        if (r2 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ea, code lost:
        if (r0 != null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f0, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f4, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f7, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fc, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fd, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0100, code lost:
        throw r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24829a(com.facebook.soloader.C9922g r12, int r13, byte[] r14) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "fb-UnpackingSoSource"
            java.io.File r6 = new java.io.File
            java.io.File r1 = r11.f26036a
            java.lang.String r2 = "dso_state"
            r6.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r6, r2)
            r8 = 1
            r3 = 0
            byte r4 = r1.readByte()     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            if (r4 == r8) goto L_0x0043
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            r4.<init>()     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.lang.String r5 = "dso store "
            r4.append(r5)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.io.File r5 = r11.f26036a     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            r4.append(r5)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.lang.String r5 = " regeneration interrupted: wiping clean"
            r4.append(r5)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            java.lang.String r4 = r4.toString()     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
            android.util.Log.v(r0, r4)     // Catch:{ EOFException -> 0x0035, all -> 0x0037 }
        L_0x0035:
            r4 = 0
            goto L_0x0043
        L_0x0037:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r13 = move-exception
            r1.close()     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r14 = move-exception
            r12.addSuppressed(r14)
        L_0x0042:
            throw r13
        L_0x0043:
            r1.close()
            java.io.File r5 = new java.io.File
            java.io.File r1 = r11.f26036a
            java.lang.String r7 = "dso_deps"
            r5.<init>(r1, r7)
            r1 = 0
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile
            r7.<init>(r5, r2)
            long r9 = r7.length()     // Catch:{ all -> 0x00f5 }
            int r2 = (int) r9     // Catch:{ all -> 0x00f5 }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x00f5 }
            int r9 = r7.read(r2)     // Catch:{ all -> 0x00f5 }
            int r10 = r2.length     // Catch:{ all -> 0x00f5 }
            if (r9 == r10) goto L_0x0069
            java.lang.String r4 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r0, r4)     // Catch:{ all -> 0x00f5 }
            r4 = 0
        L_0x0069:
            boolean r2 = java.util.Arrays.equals(r2, r14)     // Catch:{ all -> 0x00f5 }
            if (r2 != 0) goto L_0x0075
            java.lang.String r2 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x00f5 }
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x007e
            r2 = r13 & 2
            if (r2 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r0 = r1
            goto L_0x00a0
        L_0x007e:
            java.lang.String r1 = "so store dirty: regenerating"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x00f5 }
            m24831b(r6, r3)     // Catch:{ all -> 0x00f5 }
            com.facebook.soloader.k$f r0 = r11.mo26768b()     // Catch:{ all -> 0x00f5 }
            com.facebook.soloader.k$c r1 = r0.mo26775a()     // Catch:{ all -> 0x00e7 }
            com.facebook.soloader.k$e r2 = r0.mo26776b()     // Catch:{ all -> 0x00e7 }
            r11.m24825a(r4, r1, r2)     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch:{ all -> 0x00e7 }
        L_0x009a:
            if (r0 == 0) goto L_0x007c
            r0.close()     // Catch:{ all -> 0x00f5 }
            goto L_0x007c
        L_0x00a0:
            r7.close()
            if (r0 != 0) goto L_0x00a6
            return r3
        L_0x00a6:
            com.facebook.soloader.k$a r9 = new com.facebook.soloader.k$a
            r1 = r9
            r2 = r11
            r3 = r5
            r4 = r14
            r5 = r0
            r7 = r12
            r1.<init>(r3, r4, r5, r6, r7)
            r12 = r13 & 1
            if (r12 == 0) goto L_0x00d5
            java.lang.Thread r12 = new java.lang.Thread
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "SoSync:"
            r13.append(r14)
            java.io.File r14 = r11.f26036a
            java.lang.String r14 = r14.getName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r9, r13)
            r12.start()
            goto L_0x00d8
        L_0x00d5:
            r9.run()
        L_0x00d8:
            return r8
        L_0x00d9:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00db }
        L_0x00db:
            r13 = move-exception
            if (r2 == 0) goto L_0x00e6
            r2.close()     // Catch:{ all -> 0x00e2 }
            goto L_0x00e6
        L_0x00e2:
            r14 = move-exception
            r12.addSuppressed(r14)     // Catch:{ all -> 0x00e7 }
        L_0x00e6:
            throw r13     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r13 = move-exception
            if (r0 == 0) goto L_0x00f4
            r0.close()     // Catch:{ all -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r14 = move-exception
            r12.addSuppressed(r14)     // Catch:{ all -> 0x00f5 }
        L_0x00f4:
            throw r13     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r13 = move-exception
            r7.close()     // Catch:{ all -> 0x00fc }
            goto L_0x0100
        L_0x00fc:
            r14 = move-exception
            r12.addSuppressed(r14)
        L_0x0100:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C9927k.m24829a(com.facebook.soloader.g, int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo26767a() throws java.io.IOException {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            com.facebook.soloader.k$f r1 = r5.mo26768b()
            com.facebook.soloader.k$c r2 = r1.mo26775a()     // Catch:{ all -> 0x0038 }
            com.facebook.soloader.k$b[] r2 = r2.f26065a     // Catch:{ all -> 0x0038 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0038 }
            int r3 = r2.length     // Catch:{ all -> 0x0038 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0038 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0038 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.f26063e     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.f26064f     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r2 = move-exception
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0045:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C9927k.mo26767a():byte[]");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26771a(int i) throws IOException {
        String str = "releasing dso store lock for ";
        String str2 = " (syncer thread started)";
        String str3 = "not releasing dso store lock for ";
        String str4 = "fb-UnpackingSoSource";
        SysUtil.m24784c(this.f26036a);
        C9922g a = C9922g.m24811a(new File(this.f26036a, "dso_lock"));
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("locked dso store ");
            sb.append(this.f26036a);
            Log.v(str4, sb.toString());
            if (m24829a(a, i, mo26767a())) {
                a = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dso store is up-to-date: ");
                sb2.append(this.f26036a);
                Log.i(str4, sb2.toString());
            }
            if (a != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(this.f26036a);
                Log.v(str4, sb3.toString());
                a.close();
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.f26036a);
            sb4.append(str2);
            Log.v(str4, sb4.toString());
        } catch (Throwable th) {
            if (a != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.f26036a);
                Log.v(str4, sb5.toString());
                a.close();
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str3);
                sb6.append(this.f26036a);
                sb6.append(str2);
                Log.v(str4, sb6.toString());
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo26783a(String str) throws IOException {
        synchronized (m24830b(str)) {
            this.f26055d = str;
            mo26771a(2);
        }
    }

    /* renamed from: a */
    public int mo26770a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        int a;
        synchronized (m24830b(str)) {
            a = mo26774a(str, i, this.f26036a, threadPolicy);
        }
        return a;
    }
}
