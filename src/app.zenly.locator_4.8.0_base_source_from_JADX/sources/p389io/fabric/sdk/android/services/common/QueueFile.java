package p389io.fabric.sdk.android.services.common;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.fabric.sdk.android.services.common.QueueFile */
public class QueueFile implements Closeable {

    /* renamed from: k */
    private static final Logger f31628k = Logger.getLogger(QueueFile.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RandomAccessFile f31629e;

    /* renamed from: f */
    int f31630f;

    /* renamed from: g */
    private int f31631g;

    /* renamed from: h */
    private C12167b f31632h;

    /* renamed from: i */
    private C12167b f31633i;

    /* renamed from: j */
    private final byte[] f31634j = new byte[16];

    /* renamed from: io.fabric.sdk.android.services.common.QueueFile$ElementReader */
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: io.fabric.sdk.android.services.common.QueueFile$a */
    class C12166a implements ElementReader {

        /* renamed from: a */
        boolean f31635a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f31636b;

        C12166a(QueueFile queueFile, StringBuilder sb) {
            this.f31636b = sb;
        }

        public void read(InputStream inputStream, int i) throws IOException {
            if (this.f31635a) {
                this.f31635a = false;
            } else {
                this.f31636b.append(", ");
            }
            this.f31636b.append(i);
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.QueueFile$b */
    static class C12167b {

        /* renamed from: c */
        static final C12167b f31637c = new C12167b(0, 0);

        /* renamed from: a */
        final int f31638a;

        /* renamed from: b */
        final int f31639b;

        C12167b(int i, int i2) {
            this.f31638a = i;
            this.f31639b = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C12167b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f31638a);
            sb.append(", length = ");
            sb.append(this.f31639b);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.QueueFile$c */
    private final class C12168c extends InputStream {

        /* renamed from: e */
        private int f31640e;

        /* renamed from: f */
        private int f31641f;

        /* synthetic */ C12168c(QueueFile queueFile, C12167b bVar, C12166a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.m32193b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f31641f;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            QueueFile.this.m32187a(this.f31640e, bArr, i, i2);
            this.f31640e = QueueFile.this.m32197d(this.f31640e + i2);
            this.f31641f -= i2;
            return i2;
        }

        private C12168c(C12167b bVar) {
            this.f31640e = QueueFile.this.m32197d(bVar.f31638a + 4);
            this.f31641f = bVar.f31639b;
        }

        public int read() throws IOException {
            if (this.f31641f == 0) {
                return -1;
            }
            QueueFile.this.f31629e.seek((long) this.f31640e);
            int read = QueueFile.this.f31629e.read();
            this.f31640e = QueueFile.this.m32197d(this.f31640e + 1);
            this.f31641f--;
            return read;
        }
    }

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            m32189a(file);
        }
        this.f31629e = m32192b(file);
        m32198e();
    }

    /* renamed from: b */
    private static void m32195b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: c */
    private void m32196c(int i) throws IOException {
        this.f31629e.setLength((long) i);
        this.f31629e.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public int m32197d(int i) {
        int i2 = this.f31630f;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: e */
    private void m32198e() throws IOException {
        this.f31629e.seek(0);
        this.f31629e.readFully(this.f31634j);
        this.f31630f = m32182a(this.f31634j, 0);
        if (((long) this.f31630f) <= this.f31629e.length()) {
            this.f31631g = m32182a(this.f31634j, 4);
            int a = m32182a(this.f31634j, 8);
            int a2 = m32182a(this.f31634j, 12);
            this.f31632h = m32191b(a);
            this.f31633i = m32191b(a2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File is truncated. Expected length: ");
        sb.append(this.f31630f);
        sb.append(", Actual length: ");
        sb.append(this.f31629e.length());
        throw new IOException(sb.toString());
    }

    /* renamed from: f */
    private int m32199f() {
        return this.f31630f - mo36039d();
    }

    public synchronized void close() throws IOException {
        this.f31629e.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QueueFile.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f31630f);
        sb.append(", size=");
        sb.append(this.f31631g);
        sb.append(", first=");
        sb.append(this.f31632h);
        sb.append(", last=");
        sb.append(this.f31633i);
        sb.append(", element lengths=[");
        try {
            mo36032a((ElementReader) new C12166a(this, sb));
        } catch (IOException e) {
            f31628k.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: d */
    public int mo36039d() {
        if (this.f31631g == 0) {
            return 16;
        }
        C12167b bVar = this.f31633i;
        int i = bVar.f31638a;
        int i2 = this.f31632h.f31638a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f31639b + 16;
        }
        return (((i + 4) + bVar.f31639b) + this.f31630f) - i2;
    }

    /* renamed from: c */
    public synchronized void mo36037c() throws IOException {
        if (mo36036b()) {
            throw new NoSuchElementException();
        } else if (this.f31631g == 1) {
            mo36031a();
        } else {
            int d = m32197d(this.f31632h.f31638a + 4 + this.f31632h.f31639b);
            m32187a(d, this.f31634j, 0, 4);
            int a = m32182a(this.f31634j, 0);
            m32186a(this.f31630f, this.f31631g - 1, d, this.f31633i.f31638a);
            this.f31631g--;
            this.f31632h = new C12167b(d, a);
        }
    }

    /* renamed from: a */
    private static void m32190a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            m32195b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: b */
    private C12167b m32191b(int i) throws IOException {
        if (i == 0) {
            return C12167b.f31637c;
        }
        this.f31629e.seek((long) i);
        return new C12167b(i, this.f31629e.readInt());
    }

    /* renamed from: a */
    private static int m32182a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    private void m32186a(int i, int i2, int i3, int i4) throws IOException {
        m32190a(this.f31634j, i, i2, i3, i4);
        this.f31629e.seek(0);
        this.f31629e.write(this.f31634j);
    }

    /* renamed from: b */
    private static RandomAccessFile m32192b(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: b */
    private void m32194b(int i, byte[] bArr, int i2, int i3) throws IOException {
        int d = m32197d(i);
        int i4 = d + i3;
        int i5 = this.f31630f;
        if (i4 <= i5) {
            this.f31629e.seek((long) d);
            this.f31629e.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - d;
        this.f31629e.seek((long) d);
        this.f31629e.write(bArr, i2, i6);
        this.f31629e.seek(16);
        this.f31629e.write(bArr, i2 + i6, i3 - i6);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m32189a(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile b = m32192b(file2);
        try {
            b.setLength(4096);
            b.seek(0);
            byte[] bArr = new byte[16];
            m32190a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            b.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo36036b() {
        return this.f31631g == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m32193b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32187a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int d = m32197d(i);
        int i4 = d + i3;
        int i5 = this.f31630f;
        if (i4 <= i5) {
            this.f31629e.seek((long) d);
            this.f31629e.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - d;
        this.f31629e.seek((long) d);
        this.f31629e.readFully(bArr, i2, i6);
        this.f31629e.seek(16);
        this.f31629e.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: a */
    public void mo36033a(byte[] bArr) throws IOException {
        mo36034a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void mo36034a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m32193b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m32185a(i2);
        boolean b = mo36036b();
        if (b) {
            i3 = 16;
        } else {
            i3 = m32197d(this.f31633i.f31638a + 4 + this.f31633i.f31639b);
        }
        C12167b bVar = new C12167b(i3, i2);
        m32195b(this.f31634j, 0, i2);
        m32194b(bVar.f31638a, this.f31634j, 0, 4);
        m32194b(bVar.f31638a + 4, bArr, i, i2);
        m32186a(this.f31630f, this.f31631g + 1, b ? bVar.f31638a : this.f31632h.f31638a, bVar.f31638a);
        this.f31633i = bVar;
        this.f31631g++;
        if (b) {
            this.f31632h = this.f31633i;
        }
    }

    /* renamed from: a */
    private void m32185a(int i) throws IOException {
        int i2 = i + 4;
        int f = m32199f();
        if (f < i2) {
            int i3 = this.f31630f;
            do {
                f += i3;
                i3 <<= 1;
            } while (f < i2);
            m32196c(i3);
            C12167b bVar = this.f31633i;
            int d = m32197d(bVar.f31638a + 4 + bVar.f31639b);
            if (d < this.f31632h.f31638a) {
                FileChannel channel = this.f31629e.getChannel();
                channel.position((long) this.f31630f);
                long j = (long) (d - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f31633i.f31638a;
            int i5 = this.f31632h.f31638a;
            if (i4 < i5) {
                int i6 = (this.f31630f + i4) - 16;
                m32186a(i3, this.f31631g, i5, i6);
                this.f31633i = new C12167b(i6, this.f31633i.f31639b);
            } else {
                m32186a(i3, this.f31631g, i5, i4);
            }
            this.f31630f = i3;
        }
    }

    /* renamed from: a */
    public synchronized void mo36032a(ElementReader elementReader) throws IOException {
        int i = this.f31632h.f31638a;
        for (int i2 = 0; i2 < this.f31631g; i2++) {
            C12167b b = m32191b(i);
            elementReader.read(new C12168c(this, b, null), b.f31639b);
            i = m32197d(b.f31638a + 4 + b.f31639b);
        }
    }

    /* renamed from: a */
    public synchronized void mo36031a() throws IOException {
        m32186a(4096, 0, 0, 0);
        this.f31631g = 0;
        this.f31632h = C12167b.f31637c;
        this.f31633i = C12167b.f31637c;
        if (this.f31630f > 4096) {
            m32196c(4096);
        }
        this.f31630f = 4096;
    }

    /* renamed from: a */
    public boolean mo36035a(int i, int i2) {
        return (mo36039d() + 4) + i <= i2;
    }
}
