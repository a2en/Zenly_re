package com.facebook.cache.disk;

import android.os.Environment;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.C9480a;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.C9481a;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.DiskStorage.C9488a;
import com.facebook.cache.disk.DiskStorage.C9489b;
import com.facebook.cache.disk.DiskStorage.Entry;
import com.facebook.cache.disk.DiskStorage.Inserter;
import com.facebook.common.file.C9521a;
import com.facebook.common.file.FileTreeVisitor;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.CreateDirectoryException;
import com.facebook.common.file.FileUtils.ParentDirNotFoundException;
import com.facebook.common.file.FileUtils.RenameException;
import com.facebook.common.internal.C9526c;
import com.facebook.common.internal.C9536j;
import com.facebook.common.time.C9554a;
import com.facebook.common.time.Clock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.cache.disk.a */
public class C9490a implements DiskStorage {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Class<?> f24600f = C9490a.class;

    /* renamed from: g */
    static final long f24601g = TimeUnit.MINUTES.toMillis(30);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f24602a;

    /* renamed from: b */
    private final boolean f24603b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final File f24604c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final CacheErrorLogger f24605d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Clock f24606e = C9554a.m23375a();

    /* renamed from: com.facebook.cache.disk.a$b */
    private class C9492b implements FileTreeVisitor {

        /* renamed from: a */
        private final List<Entry> f24607a;

        private C9492b() {
            this.f24607a = new ArrayList();
        }

        /* renamed from: a */
        public List<Entry> mo25557a() {
            return Collections.unmodifiableList(this.f24607a);
        }

        public void postVisitDirectory(File file) {
        }

        public void preVisitDirectory(File file) {
        }

        public void visitFile(File file) {
            C9494d a = C9490a.this.m23148b(file);
            if (a != null && a.f24613a == ".cnt") {
                this.f24607a.add(new C9493c(a.f24614b, file));
            }
        }
    }

    /* renamed from: com.facebook.cache.disk.a$c */
    static class C9493c implements Entry {

        /* renamed from: a */
        private final String f24609a;

        /* renamed from: b */
        private final C9480a f24610b;

        /* renamed from: c */
        private long f24611c;

        /* renamed from: d */
        private long f24612d;

        public String getId() {
            return this.f24609a;
        }

        public long getSize() {
            if (this.f24611c < 0) {
                this.f24611c = this.f24610b.size();
            }
            return this.f24611c;
        }

        public long getTimestamp() {
            if (this.f24612d < 0) {
                this.f24612d = this.f24610b.mo25497a().lastModified();
            }
            return this.f24612d;
        }

        private C9493c(String str, File file) {
            C9536j.m23271a(file);
            C9536j.m23271a(str);
            this.f24609a = str;
            this.f24610b = C9480a.m23130a(file);
            this.f24611c = -1;
            this.f24612d = -1;
        }

        public C9480a getResource() {
            return this.f24610b;
        }
    }

    /* renamed from: com.facebook.cache.disk.a$d */
    private static class C9494d {

        /* renamed from: a */
        public final String f24613a;

        /* renamed from: b */
        public final String f24614b;

        /* renamed from: b */
        public static C9494d m23160b(File file) {
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0) {
                return null;
            }
            String b = C9490a.m23153c(name.substring(lastIndexOf));
            if (b == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (b.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new C9494d(b, substring);
        }

        /* renamed from: a */
        public String mo25562a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(this.f24614b);
            sb.append(this.f24613a);
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24613a);
            sb.append("(");
            sb.append(this.f24614b);
            sb.append(")");
            return sb.toString();
        }

        private C9494d(String str, String str2) {
            this.f24613a = str;
            this.f24614b = str2;
        }

        /* renamed from: a */
        public File mo25561a(File file) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24614b);
            sb.append(".");
            return File.createTempFile(sb.toString(), ".tmp", file);
        }
    }

    /* renamed from: com.facebook.cache.disk.a$e */
    private static class C9495e extends IOException {
        public C9495e(long j, long j2) {
            StringBuilder sb = new StringBuilder();
            sb.append("File was not written completely. Expected: ");
            sb.append(j);
            sb.append(", found: ");
            sb.append(j2);
            super(sb.toString());
        }
    }

    /* renamed from: com.facebook.cache.disk.a$f */
    class C9496f implements Inserter {

        /* renamed from: a */
        private final String f24615a;

        /* renamed from: b */
        final File f24616b;

        public C9496f(String str, File file) {
            this.f24615a = str;
            this.f24616b = file;
        }

        public boolean cleanUp() {
            return !this.f24616b.exists() || this.f24616b.delete();
        }

        public BinaryResource commit(Object obj) throws IOException {
            C9481a aVar;
            File a = C9490a.this.mo25556a(this.f24615a);
            try {
                FileUtils.m23243a(this.f24616b, a);
                if (a.exists()) {
                    a.setLastModified(C9490a.this.f24606e.now());
                }
                return C9480a.m23130a(a);
            } catch (RenameException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    aVar = C9481a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof ParentDirNotFoundException) {
                    aVar = C9481a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    aVar = C9481a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    aVar = C9481a.WRITE_RENAME_FILE_OTHER;
                }
                C9490a.this.f24605d.logError(aVar, C9490a.f24600f, "commit", e);
                throw e;
            }
        }

        /* JADX INFO: finally extract failed */
        public void writeData(WriterCallback writerCallback, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f24616b);
                try {
                    C9526c cVar = new C9526c(fileOutputStream);
                    writerCallback.write(cVar);
                    cVar.flush();
                    long count = cVar.getCount();
                    fileOutputStream.close();
                    if (this.f24616b.length() != count) {
                        throw new C9495e(count, this.f24616b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                C9490a.this.f24605d.logError(C9481a.WRITE_UPDATE_FILE_NOT_FOUND, C9490a.f24600f, "updateResource", e);
                throw e;
            }
        }
    }

    /* renamed from: com.facebook.cache.disk.a$g */
    private class C9497g implements FileTreeVisitor {

        /* renamed from: a */
        private boolean f24618a;

        private C9497g() {
        }

        /* renamed from: a */
        private boolean m23163a(File file) {
            C9494d a = C9490a.this.m23148b(file);
            boolean z = false;
            if (a == null) {
                return false;
            }
            String str = a.f24613a;
            if (str == ".tmp") {
                return m23164b(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            C9536j.m23279b(z);
            return true;
        }

        /* renamed from: b */
        private boolean m23164b(File file) {
            return file.lastModified() > C9490a.this.f24606e.now() - C9490a.f24601g;
        }

        public void postVisitDirectory(File file) {
            if (!C9490a.this.f24602a.equals(file) && !this.f24618a) {
                file.delete();
            }
            if (this.f24618a && file.equals(C9490a.this.f24604c)) {
                this.f24618a = false;
            }
        }

        public void preVisitDirectory(File file) {
            if (!this.f24618a && file.equals(C9490a.this.f24604c)) {
                this.f24618a = true;
            }
        }

        public void visitFile(File file) {
            if (!this.f24618a || !m23163a(file)) {
                file.delete();
            }
        }
    }

    public C9490a(File file, int i, CacheErrorLogger cacheErrorLogger) {
        C9536j.m23271a(file);
        this.f24602a = file;
        this.f24603b = m23146a(file, cacheErrorLogger);
        this.f24604c = new File(this.f24602a, m23143a(i));
        this.f24605d = cacheErrorLogger;
        m23151b();
    }

    /* renamed from: e */
    private File m23156e(String str) {
        return new File(m23157f(str));
    }

    /* renamed from: f */
    private String m23157f(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24604c);
        sb.append(File.separator);
        sb.append(valueOf);
        return sb.toString();
    }

    public void clearAll() {
        C9521a.m23245a(this.f24602a);
    }

    public boolean contains(String str, Object obj) {
        return m23147a(str, false);
    }

    public C9488a getDumpInfo() throws IOException {
        List<Entry> entries = getEntries();
        C9488a aVar = new C9488a();
        for (Entry a : entries) {
            C9489b a2 = m23140a(a);
            String str = a2.f24599a;
            if (!aVar.f24598b.containsKey(str)) {
                aVar.f24598b.put(str, Integer.valueOf(0));
            }
            Map<String, Integer> map = aVar.f24598b;
            map.put(str, Integer.valueOf(((Integer) map.get(str)).intValue() + 1));
            aVar.f24597a.add(a2);
        }
        return aVar;
    }

    public BinaryResource getResource(String str, Object obj) {
        File a = mo25556a(str);
        if (!a.exists()) {
            return null;
        }
        a.setLastModified(this.f24606e.now());
        return C9480a.m23130a(a);
    }

    public String getStorageName() {
        String absolutePath = this.f24602a.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        String str = "_";
        sb.append(str);
        sb.append(absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()));
        sb.append(str);
        sb.append(absolutePath.hashCode());
        return sb.toString();
    }

    public Inserter insert(String str, Object obj) throws IOException {
        C9494d dVar = new C9494d(".tmp", str);
        File e = m23156e(dVar.f24614b);
        String str2 = "insert";
        if (!e.exists()) {
            m23145a(e, str2);
        }
        try {
            return new C9496f(str, dVar.mo25561a(e));
        } catch (IOException e2) {
            this.f24605d.logError(C9481a.WRITE_CREATE_TEMPFILE, f24600f, str2, e2);
            throw e2;
        }
    }

    public boolean isEnabled() {
        return true;
    }

    public boolean isExternal() {
        return this.f24603b;
    }

    public void purgeUnexpectedResources() {
        C9521a.m23244a(this.f24602a, new C9497g());
    }

    public long remove(Entry entry) {
        return m23138a(((C9493c) entry).getResource().mo25497a());
    }

    public boolean touch(String str, Object obj) {
        return m23147a(str, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m23153c(String str) {
        String str2 = ".cnt";
        if (str2.equals(str)) {
            return str2;
        }
        String str3 = ".tmp";
        if (str3.equals(str)) {
            return str3;
        }
        return null;
    }

    /* renamed from: d */
    private String m23155d(String str) {
        C9494d dVar = new C9494d(".cnt", str);
        return dVar.mo25562a(m23157f(dVar.f24614b));
    }

    public List<Entry> getEntries() throws IOException {
        C9492b bVar = new C9492b();
        C9521a.m23244a(this.f24604c, bVar);
        return bVar.mo25557a();
    }

    /* renamed from: b */
    private void m23151b() {
        boolean z = true;
        if (this.f24602a.exists()) {
            if (!this.f24604c.exists()) {
                C9521a.m23246b(this.f24602a);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                FileUtils.m23242a(this.f24604c);
            } catch (CreateDirectoryException unused) {
                CacheErrorLogger cacheErrorLogger = this.f24605d;
                C9481a aVar = C9481a.WRITE_CREATE_DIR;
                Class<?> cls = f24600f;
                StringBuilder sb = new StringBuilder();
                sb.append("version directory could not be created: ");
                sb.append(this.f24604c);
                cacheErrorLogger.logError(aVar, cls, sb.toString(), null);
            }
        }
    }

    /* renamed from: a */
    private static boolean m23146a(File file, CacheErrorLogger cacheErrorLogger) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
                try {
                    return str.contains(file2);
                } catch (IOException e) {
                    e = e;
                    C9481a aVar = C9481a.OTHER;
                    Class<?> cls = f24600f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to read folder to check if external: ");
                    sb.append(str);
                    cacheErrorLogger.logError(aVar, cls, sb.toString(), e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                str = null;
                C9481a aVar2 = C9481a.OTHER;
                Class<?> cls2 = f24600f;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("failed to read folder to check if external: ");
                sb2.append(str);
                cacheErrorLogger.logError(aVar2, cls2, sb2.toString(), e);
                return false;
            }
        } catch (Exception e3) {
            cacheErrorLogger.logError(C9481a.OTHER, f24600f, "failed to get the external storage directory!", e3);
            return false;
        }
    }

    public long remove(String str) {
        return m23138a(mo25556a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C9494d m23148b(File file) {
        C9494d b = C9494d.m23160b(file);
        if (b == null) {
            return null;
        }
        if (!m23156e(b.f24614b).equals(file.getParentFile())) {
            b = null;
        }
        return b;
    }

    /* renamed from: a */
    static String m23143a(int i) {
        return String.format(null, "%s.ols%d.%d", new Object[]{"v2", Integer.valueOf(100), Integer.valueOf(i)});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo25556a(String str) {
        return new File(m23155d(str));
    }

    /* renamed from: a */
    private void m23145a(File file, String str) throws IOException {
        try {
            FileUtils.m23242a(file);
        } catch (CreateDirectoryException e) {
            this.f24605d.logError(C9481a.WRITE_CREATE_DIR, f24600f, str, e);
            throw e;
        }
    }

    /* renamed from: a */
    private boolean m23147a(String str, boolean z) {
        File a = mo25556a(str);
        boolean exists = a.exists();
        if (z && exists) {
            a.setLastModified(this.f24606e.now());
        }
        return exists;
    }

    /* renamed from: a */
    private long m23138a(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* renamed from: a */
    private C9489b m23140a(Entry entry) throws IOException {
        String str;
        C9493c cVar = (C9493c) entry;
        byte[] read = cVar.getResource().read();
        String a = m23144a(read);
        if (!a.equals("undefined") || read.length < 4) {
            str = "";
        } else {
            str = String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", new Object[]{Byte.valueOf(read[0]), Byte.valueOf(read[1]), Byte.valueOf(read[2]), Byte.valueOf(read[3])});
        }
        return new C9489b(cVar.getResource().mo25497a().getPath(), a, (float) cVar.getSize(), str);
    }

    /* renamed from: a */
    private String m23144a(byte[] bArr) {
        if (bArr.length >= 2) {
            if (bArr[0] == -1 && bArr[1] == -40) {
                return "jpg";
            }
            if (bArr[0] == -119 && bArr[1] == 80) {
                return "png";
            }
            if (bArr[0] == 82 && bArr[1] == 73) {
                return "webp";
            }
            if (bArr[0] == 71 && bArr[1] == 73) {
                return "gif";
            }
        }
        return "undefined";
    }
}
