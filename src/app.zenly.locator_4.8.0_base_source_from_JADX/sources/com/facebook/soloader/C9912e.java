package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C9927k.C9929b;
import com.facebook.soloader.C9927k.C9930c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.facebook.soloader.e */
public final class C9912e extends C9927k {

    /* renamed from: com.facebook.soloader.e$b */
    private final class C9914b extends C9933f {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C9916c[] f26038e;

        /* renamed from: com.facebook.soloader.e$b$a */
        private final class C9915a extends C9932e {

            /* renamed from: e */
            private int f26039e;

            private C9915a() {
            }

            /* renamed from: a */
            public boolean mo26777a() {
                return this.f26039e < C9914b.this.f26038e.length;
            }

            /* renamed from: b */
            public C9931d mo26778b() throws IOException {
                C9916c[] a = C9914b.this.f26038e;
                int i = this.f26039e;
                this.f26039e = i + 1;
                C9916c cVar = a[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f26041g);
                try {
                    return new C9931d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
            r9.close();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C9914b(com.facebook.soloader.C9912e r17, com.facebook.soloader.C9927k r18) throws java.io.IOException {
            /*
                r16 = this;
                r16.<init>()
                r0 = r17
                android.content.Context r0 = r0.f26054c
                java.io.File r1 = new java.io.File
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "/data/local/tmp/exopackage/"
                r2.append(r3)
                java.lang.String r0 = r0.getPackageName()
                r2.append(r0)
                java.lang.String r0 = "/native-libs/"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                r2.<init>()
                java.lang.String[] r3 = com.facebook.soloader.SysUtil.m24782a()
                int r4 = r3.length
                r5 = 0
                r6 = 0
            L_0x0037:
                if (r6 >= r4) goto L_0x0105
                r7 = r3[r6]
                java.io.File r8 = new java.io.File
                r8.<init>(r1, r7)
                boolean r9 = r8.isDirectory()
                if (r9 != 0) goto L_0x0048
                goto L_0x00e3
            L_0x0048:
                r2.add(r7)
                java.io.File r7 = new java.io.File
                java.lang.String r9 = "metadata.txt"
                r7.<init>(r8, r9)
                boolean r9 = r7.isFile()
                if (r9 != 0) goto L_0x005a
                goto L_0x00e3
            L_0x005a:
                java.io.FileReader r9 = new java.io.FileReader
                r9.<init>(r7)
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x00f6 }
                r7.<init>(r9)     // Catch:{ all -> 0x00f6 }
            L_0x0064:
                java.lang.String r10 = r7.readLine()     // Catch:{ all -> 0x00e7 }
                if (r10 == 0) goto L_0x00dd
                int r11 = r10.length()     // Catch:{ all -> 0x00e7 }
                if (r11 != 0) goto L_0x0071
                goto L_0x0064
            L_0x0071:
                r11 = 32
                int r11 = r10.indexOf(r11)     // Catch:{ all -> 0x00e7 }
                r12 = -1
                if (r11 == r12) goto L_0x00c1
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
                r12.<init>()     // Catch:{ all -> 0x00e7 }
                java.lang.String r13 = r10.substring(r5, r11)     // Catch:{ all -> 0x00e7 }
                r12.append(r13)     // Catch:{ all -> 0x00e7 }
                java.lang.String r13 = ".so"
                r12.append(r13)     // Catch:{ all -> 0x00e7 }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00e7 }
                int r13 = r0.size()     // Catch:{ all -> 0x00e7 }
                r14 = 0
            L_0x0094:
                if (r14 >= r13) goto L_0x00a9
                java.lang.Object r15 = r0.get(r14)     // Catch:{ all -> 0x00e7 }
                com.facebook.soloader.e$c r15 = (com.facebook.soloader.C9912e.C9916c) r15     // Catch:{ all -> 0x00e7 }
                java.lang.String r15 = r15.f26063e     // Catch:{ all -> 0x00e7 }
                boolean r15 = r15.equals(r12)     // Catch:{ all -> 0x00e7 }
                if (r15 == 0) goto L_0x00a6
                r13 = 1
                goto L_0x00aa
            L_0x00a6:
                int r14 = r14 + 1
                goto L_0x0094
            L_0x00a9:
                r13 = 0
            L_0x00aa:
                if (r13 == 0) goto L_0x00ad
                goto L_0x0064
            L_0x00ad:
                int r11 = r11 + 1
                java.lang.String r10 = r10.substring(r11)     // Catch:{ all -> 0x00e7 }
                com.facebook.soloader.e$c r11 = new com.facebook.soloader.e$c     // Catch:{ all -> 0x00e7 }
                java.io.File r13 = new java.io.File     // Catch:{ all -> 0x00e7 }
                r13.<init>(r8, r10)     // Catch:{ all -> 0x00e7 }
                r11.<init>(r12, r10, r13)     // Catch:{ all -> 0x00e7 }
                r0.add(r11)     // Catch:{ all -> 0x00e7 }
                goto L_0x0064
            L_0x00c1:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00e7 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
                r1.<init>()     // Catch:{ all -> 0x00e7 }
                java.lang.String r2 = "illegal line in exopackage metadata: ["
                r1.append(r2)     // Catch:{ all -> 0x00e7 }
                r1.append(r10)     // Catch:{ all -> 0x00e7 }
                java.lang.String r2 = "]"
                r1.append(r2)     // Catch:{ all -> 0x00e7 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e7 }
                r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
                throw r0     // Catch:{ all -> 0x00e7 }
            L_0x00dd:
                r7.close()     // Catch:{ all -> 0x00f6 }
                r9.close()
            L_0x00e3:
                int r6 = r6 + 1
                goto L_0x0037
            L_0x00e7:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x00ea }
            L_0x00ea:
                r0 = move-exception
                r2 = r0
                r7.close()     // Catch:{ all -> 0x00f0 }
                goto L_0x00f5
            L_0x00f0:
                r0 = move-exception
                r3 = r0
                r1.addSuppressed(r3)     // Catch:{ all -> 0x00f6 }
            L_0x00f5:
                throw r2     // Catch:{ all -> 0x00f6 }
            L_0x00f6:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x00f9 }
            L_0x00f9:
                r0 = move-exception
                r2 = r0
                r9.close()     // Catch:{ all -> 0x00ff }
                goto L_0x0104
            L_0x00ff:
                r0 = move-exception
                r3 = r0
                r1.addSuppressed(r3)
            L_0x0104:
                throw r2
            L_0x0105:
                int r1 = r2.size()
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.Object[] r1 = r2.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r2 = r18
                r2.mo26784a(r1)
                int r1 = r0.size()
                com.facebook.soloader.e$c[] r1 = new com.facebook.soloader.C9912e.C9916c[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                com.facebook.soloader.e$c[] r0 = (com.facebook.soloader.C9912e.C9916c[]) r0
                r1 = r16
                r1.f26038e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C9912e.C9914b.<init>(com.facebook.soloader.e, com.facebook.soloader.k):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C9932e mo26776b() throws IOException {
            return new C9915a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9930c mo26775a() throws IOException {
            return new C9930c(this.f26038e);
        }
    }

    /* renamed from: com.facebook.soloader.e$c */
    private static final class C9916c extends C9929b {

        /* renamed from: g */
        final File f26041g;

        C9916c(String str, String str2, File file) {
            super(str, str2);
            this.f26041g = file;
        }
    }

    public C9912e(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9933f mo26768b() throws IOException {
        return new C9914b(this, this);
    }
}
