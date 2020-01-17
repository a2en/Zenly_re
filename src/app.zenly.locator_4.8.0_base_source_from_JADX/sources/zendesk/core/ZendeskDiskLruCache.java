package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12012b;
import com.zendesk.util.C12017g;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import okhttp3.C13170b0;
import okhttp3.C13321t;
import okio.BufferedSink;
import okio.C13354l;
import okio.Sink;
import okio.Source;
import p333g.p369e.p370a.C12095a;
import p333g.p369e.p370a.C12095a.C12098c;
import p333g.p369e.p370a.C12095a.C12101e;

class ZendeskDiskLruCache implements BaseStorage {
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private C12095a storage = openCache(this.directory, this.maxSize);

    ZendeskDiskLruCache(File file, Serializer serializer2, int i) {
        this.directory = file;
        this.maxSize = (long) i;
        this.serializer = serializer2;
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getString(java.lang.String r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            g.e.a.a r1 = r6.storage     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r7 = r6.key(r7)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            g.e.a.a$e r7 = r1.mo35814b(r7)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            if (r7 == 0) goto L_0x0029
            java.io.InputStream r7 = r7.mo35830a(r8)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            okio.Source r7 = okio.C13354l.m35381a(r7)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            okio.BufferedSource r8 = okio.C13354l.m35375a(r7)     // Catch:{ IOException -> 0x0026, all -> 0x0020 }
            java.lang.String r0 = r8.readUtf8()     // Catch:{ IOException -> 0x001e }
            goto L_0x002b
        L_0x001e:
            r1 = move-exception
            goto L_0x0038
        L_0x0020:
            r8 = move-exception
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
            goto L_0x0048
        L_0x0026:
            r1 = move-exception
            r8 = r0
            goto L_0x0038
        L_0x0029:
            r7 = r0
            r8 = r7
        L_0x002b:
            r6.close(r7)
            r6.close(r8)
            goto L_0x0043
        L_0x0032:
            r7 = move-exception
            r8 = r0
            goto L_0x0048
        L_0x0035:
            r1 = move-exception
            r7 = r0
            r8 = r7
        L_0x0038:
            java.lang.String r2 = "DiskLruStorage"
            java.lang.String r3 = "Unable to read from cache"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0044 }
            com.zendesk.logger.Logger.m31612c(r2, r3, r1, r4)     // Catch:{ all -> 0x0044 }
            goto L_0x002b
        L_0x0043:
            return r0
        L_0x0044:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0048:
            r6.close(r0)
            r6.close(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ZendeskDiskLruCache.getString(java.lang.String, int):java.lang.String");
    }

    private String key(String str) {
        return C12012b.m31642a(str);
    }

    private String keyMediaType(String str) {
        return key(String.format(Locale.US, "%s_content_type", new Object[]{str}));
    }

    private C12095a openCache(File file, long j) {
        try {
            return C12095a.m31914a(file, 1, 1, j);
        } catch (IOException unused) {
            Logger.m31614d("DiskLruStorage", "Unable to open cache", new Object[0]);
            return null;
        }
    }

    private void putString(String str, int i, String str2) {
        try {
            write(str, i, C13354l.m35381a((InputStream) new ByteArrayInputStream(str2.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e) {
            Logger.m31612c("DiskLruStorage", "Unable to encode string", e, new Object[0]);
        }
    }

    private void write(String str, int i, Source source) {
        Sink sink;
        C12098c a;
        BufferedSink bufferedSink = null;
        try {
            synchronized (this.directory) {
                a = this.storage.mo35812a(key(str));
            }
            if (a != null) {
                sink = C13354l.m35378a(a.mo35820a(i));
                try {
                    bufferedSink = C13354l.m35374a(sink);
                    bufferedSink.writeAll(source);
                    bufferedSink.flush();
                    a.mo35822b();
                } catch (IOException e) {
                    e = e;
                }
            } else {
                sink = null;
            }
        } catch (IOException e2) {
            e = e2;
            sink = null;
        } catch (Throwable th) {
            th = th;
            sink = null;
            close(bufferedSink);
            close(sink);
            close(source);
            throw th;
        }
        close(bufferedSink);
        close(sink);
        close(source);
        try {
            Logger.m31612c("DiskLruStorage", "Unable to cache data", e, new Object[0]);
            close(bufferedSink);
            close(sink);
            close(source);
        } catch (Throwable th2) {
            th = th2;
            close(bufferedSink);
            close(sink);
            close(source);
            throw th;
        }
    }

    public void clear() {
        C12095a aVar = this.storage;
        if (aVar != null) {
            try {
                if (aVar.mo35815b() == null || !this.storage.mo35815b().exists() || !C12010a.m31640b((Type[]) this.storage.mo35815b().listFiles())) {
                    this.storage.close();
                } else {
                    this.storage.mo35813a();
                }
            } catch (IOException e) {
                Logger.m31608a("DiskLruStorage", "Error clearing cache. Error: %s", e.getMessage());
            } catch (Throwable th) {
                this.storage = openCache(this.directory, this.maxSize);
                throw th;
            }
            this.storage = openCache(this.directory, this.maxSize);
        }
    }

    public String get(String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    public void put(String str, String str2) {
        if (this.storage != null && !C12017g.m31659c(str2)) {
            putString(str, 0, str2);
        }
    }

    public void remove(String str) {
    }

    public <E> E get(String str, Class<E> cls) {
        E e = null;
        if (this.storage == null) {
            return null;
        }
        if (cls.equals(C13170b0.class)) {
            try {
                C12101e b = this.storage.mo35814b(key(str));
                if (b != null) {
                    Source a = C13354l.m35381a(b.mo35830a(0));
                    long b2 = b.mo35831b(0);
                    String string = getString(keyMediaType(str), 0);
                    e = C13170b0.m34432a(C12017g.m31658b(string) ? C13321t.m35172b(string) : null, b2, C13354l.m35375a(a));
                }
            } catch (IOException e2) {
                Logger.m31612c("DiskLruStorage", "Unable to read from cache", e2, new Object[0]);
            }
        } else {
            e = this.serializer.deserialize(getString(str, 0), cls);
        }
        return e;
    }

    public void put(String str, Object obj) {
        if (this.storage != null) {
            if (obj instanceof C13170b0) {
                C13170b0 b0Var = (C13170b0) obj;
                write(str, 0, b0Var.mo37829f());
                putString(keyMediaType(str), 0, b0Var.mo37828e().toString());
            } else {
                String str2 = null;
                if (obj != null) {
                    str2 = this.serializer.serialize(obj);
                }
                put(str, str2);
            }
        }
    }
}
