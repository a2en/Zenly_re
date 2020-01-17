package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C9927k.C9929b;
import com.facebook.soloader.C9927k.C9930c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.f */
public class C9917f extends C9927k {

    /* renamed from: f */
    protected final File f26042f;

    /* renamed from: g */
    protected final String f26043g;

    /* renamed from: com.facebook.soloader.f$b */
    private static final class C9919b extends C9929b implements Comparable {

        /* renamed from: g */
        final ZipEntry f26044g;

        /* renamed from: h */
        final int f26045h;

        C9919b(String str, ZipEntry zipEntry, int i) {
            super(str, m24802a(zipEntry));
            this.f26044g = zipEntry;
            this.f26045h = i;
        }

        /* renamed from: a */
        private static String m24802a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())});
        }

        public int compareTo(Object obj) {
            return this.f26063e.compareTo(((C9919b) obj).f26063e);
        }
    }

    /* renamed from: com.facebook.soloader.f$c */
    protected class C9920c extends C9933f {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C9919b[] f26046e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final ZipFile f26047f;

        /* renamed from: g */
        private final C9927k f26048g;

        /* renamed from: com.facebook.soloader.f$c$a */
        private final class C9921a extends C9932e {

            /* renamed from: e */
            private int f26050e;

            private C9921a() {
            }

            /* renamed from: a */
            public boolean mo26777a() {
                C9920c.this.mo26780c();
                return this.f26050e < C9920c.this.f26046e.length;
            }

            /* renamed from: b */
            public C9931d mo26778b() throws IOException {
                C9920c.this.mo26780c();
                C9919b[] a = C9920c.this.f26046e;
                int i = this.f26050e;
                this.f26050e = i + 1;
                C9919b bVar = a[i];
                InputStream inputStream = C9920c.this.f26047f.getInputStream(bVar.f26044g);
                try {
                    return new C9931d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        C9920c(C9927k kVar) throws IOException {
            this.f26047f = new ZipFile(C9917f.this.f26042f);
            this.f26048g = kVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo26769a(ZipEntry zipEntry, String str) {
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C9919b[] mo26780c() {
            if (this.f26046e == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C9917f.this.f26043g);
                String[] a = SysUtil.m24782a();
                Enumeration entries = this.f26047f.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a2 = SysUtil.m24779a(a, group);
                        if (a2 >= 0) {
                            linkedHashSet.add(group);
                            C9919b bVar = (C9919b) hashMap.get(group2);
                            if (bVar == null || a2 < bVar.f26045h) {
                                hashMap.put(group2, new C9919b(group2, zipEntry, a2));
                            }
                        }
                    }
                }
                this.f26048g.mo26784a((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                C9919b[] bVarArr = (C9919b[]) hashMap.values().toArray(new C9919b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    C9919b bVar2 = bVarArr[i2];
                    if (mo26769a(bVar2.f26044g, bVar2.f26063e)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                C9919b[] bVarArr2 = new C9919b[i];
                int i3 = 0;
                for (C9919b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        int i4 = i3 + 1;
                        bVarArr2[i3] = bVar3;
                        i3 = i4;
                    }
                }
                this.f26046e = bVarArr2;
            }
            return this.f26046e;
        }

        public void close() throws IOException {
            this.f26047f.close();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C9930c mo26775a() throws IOException {
            return new C9930c(mo26780c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C9932e mo26776b() throws IOException {
            return new C9921a();
        }
    }

    public C9917f(Context context, String str, File file, String str2) {
        super(context, str);
        this.f26042f = file;
        this.f26043g = str2;
    }
}
