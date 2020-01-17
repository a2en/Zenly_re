package p333g.p369e.p370a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: g.e.a.c */
public final class C12104c {

    /* renamed from: a */
    static final Charset f31528a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    static void m31965a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m31965a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    /* renamed from: a */
    static void m31964a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
