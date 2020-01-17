package okhttp3.internal.p422io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.C13354l;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.io.FileSystem */
public interface FileSystem {

    /* renamed from: a */
    public static final FileSystem f34312a = new C13289a();

    /* renamed from: okhttp3.internal.io.FileSystem$a */
    class C13289a implements FileSystem {
        C13289a() {
        }

        public Sink appendingSink(File file) throws FileNotFoundException {
            try {
                return C13354l.m35377a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C13354l.m35377a(file);
            }
        }

        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
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

        public boolean exists(File file) {
            return file.exists();
        }

        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }

        public Sink sink(File file) throws FileNotFoundException {
            try {
                return C13354l.m35384b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C13354l.m35384b(file);
            }
        }

        public long size(File file) {
            return file.length();
        }

        public Source source(File file) throws FileNotFoundException {
            return C13354l.m35386c(file);
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
