package p389io.fabric.sdk.android.services.events;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.QueueFile;

/* renamed from: io.fabric.sdk.android.services.events.c */
public class C12231c implements EventsStorage {

    /* renamed from: a */
    private final Context f31791a;

    /* renamed from: b */
    private final File f31792b;

    /* renamed from: c */
    private final String f31793c;

    /* renamed from: d */
    private final File f31794d;

    /* renamed from: e */
    private QueueFile f31795e = new QueueFile(this.f31794d);

    /* renamed from: f */
    private File f31796f;

    public C12231c(Context context, File file, String str, String str2) throws IOException {
        this.f31791a = context;
        this.f31792b = file;
        this.f31793c = str2;
        this.f31794d = new File(this.f31792b, str);
        m32382a();
    }

    /* renamed from: a */
    private void m32382a() {
        this.f31796f = new File(this.f31792b, this.f31793c);
        if (!this.f31796f.exists()) {
            this.f31796f.mkdirs();
        }
    }

    /* renamed from: a */
    public OutputStream mo36182a(File file) throws IOException {
        throw null;
    }

    public void add(byte[] bArr) throws IOException {
        this.f31795e.mo36033a(bArr);
    }

    public boolean canWorkingFileStore(int i, int i2) {
        return this.f31795e.mo36035a(i, i2);
    }

    public void deleteFilesInRollOverDirectory(List<File> list) {
        for (File file : list) {
            C12180h.m32267c(this.f31791a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    public void deleteWorkingFile() {
        try {
            this.f31795e.close();
        } catch (IOException unused) {
        }
        this.f31794d.delete();
    }

    public List<File> getAllFilesInRollOverDirectory() {
        return Arrays.asList(this.f31796f.listFiles());
    }

    public List<File> getBatchOfFilesToSend(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f31796f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    public File getRollOverDirectory() {
        return this.f31796f;
    }

    public File getWorkingDirectory() {
        return this.f31792b;
    }

    public int getWorkingFileUsedSizeInBytes() {
        return this.f31795e.mo36039d();
    }

    public boolean isWorkingFileEmpty() {
        return this.f31795e.mo36036b();
    }

    public void rollOver(String str) throws IOException {
        this.f31795e.close();
        m32383a(this.f31794d, new File(this.f31796f, str));
        this.f31795e = new QueueFile(this.f31794d);
    }

    /* renamed from: a */
    private void m32383a(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        String str = "Failed to close output stream";
        String str2 = "Failed to close file input stream";
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                outputStream = mo36182a(file2);
                C12180h.m32256a((InputStream) fileInputStream, outputStream, new byte[1024]);
                C12180h.m32254a((Closeable) fileInputStream, str2);
                C12180h.m32254a((Closeable) outputStream, str);
                file.delete();
            } catch (Throwable th) {
                th = th;
                C12180h.m32254a((Closeable) fileInputStream, str2);
                C12180h.m32254a((Closeable) outputStream, str);
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C12180h.m32254a((Closeable) fileInputStream, str2);
            C12180h.m32254a((Closeable) outputStream, str);
            file.delete();
            throw th;
        }
    }
}
