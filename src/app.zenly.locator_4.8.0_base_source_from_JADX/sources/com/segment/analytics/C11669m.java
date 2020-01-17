package com.segment.analytics;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.segment.analytics.m */
public class C11669m implements Closeable {

    /* renamed from: k */
    private static final Logger f30246k = Logger.getLogger(C11669m.class.getName());

    /* renamed from: l */
    private static final byte[] f30247l = new byte[4096];

    /* renamed from: e */
    final RandomAccessFile f30248e;

    /* renamed from: f */
    int f30249f;

    /* renamed from: g */
    private int f30250g;

    /* renamed from: h */
    private C11671b f30251h;

    /* renamed from: i */
    private C11671b f30252i;

    /* renamed from: j */
    private final byte[] f30253j = new byte[16];

    /* renamed from: com.segment.analytics.m$a */
    class C11670a implements C11663a {

        /* renamed from: a */
        boolean f30254a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f30255b;

        C11670a(C11669m mVar, StringBuilder sb) {
            this.f30255b = sb;
        }

        public boolean read(InputStream inputStream, int i) throws IOException {
            if (this.f30254a) {
                this.f30254a = false;
            } else {
                this.f30255b.append(", ");
            }
            this.f30255b.append(i);
            return true;
        }
    }

    /* renamed from: com.segment.analytics.m$b */
    static class C11671b {

        /* renamed from: c */
        static final C11671b f30256c = new C11671b(0, 0);

        /* renamed from: a */
        final int f30257a;

        /* renamed from: b */
        final int f30258b;

        C11671b(int i, int i2) {
            this.f30257a = i;
            this.f30258b = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C11671b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f30257a);
            sb.append(", length = ");
            sb.append(this.f30258b);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.segment.analytics.m$c */
    final class C11672c extends InputStream {

        /* renamed from: e */
        private int f30259e;

        /* renamed from: f */
        private int f30260f;

        C11672c(C11671b bVar) {
            this.f30259e = C11669m.this.mo34380b(bVar.f30257a + 4);
            this.f30260f = bVar.f30258b;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f30260f;
            if (i3 == 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C11669m.this.mo34377a(this.f30259e, bArr, i, i2);
            this.f30259e = C11669m.this.mo34380b(this.f30259e + i2);
            this.f30260f -= i2;
            return i2;
        }

        public int read() throws IOException {
            if (this.f30260f == 0) {
                return -1;
            }
            C11669m.this.f30248e.seek((long) this.f30259e);
            int read = C11669m.this.f30248e.read();
            this.f30259e = C11669m.this.mo34380b(this.f30259e + 1);
            this.f30260f--;
            return read;
        }
    }

    public C11669m(File file) throws IOException {
        if (!file.exists()) {
            m30604a(file);
        }
        this.f30248e = m30605b(file);
        m30608c();
    }

    /* renamed from: a */
    private static int m30601a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: b */
    private static void m30607b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: c */
    private void m30608c() throws IOException {
        this.f30248e.seek(0);
        this.f30248e.readFully(this.f30253j);
        this.f30249f = m30601a(this.f30253j, 0);
        if (((long) this.f30249f) > this.f30248e.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append("File is truncated. Expected length: ");
            sb.append(this.f30249f);
            sb.append(", Actual length: ");
            sb.append(this.f30248e.length());
            throw new IOException(sb.toString());
        } else if (this.f30249f > 0) {
            this.f30250g = m30601a(this.f30253j, 4);
            int a = m30601a(this.f30253j, 8);
            int a2 = m30601a(this.f30253j, 12);
            this.f30251h = m30611d(a);
            this.f30252i = m30611d(a2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File is corrupt; length stored in header (");
            sb2.append(this.f30249f);
            sb2.append(") is invalid.");
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: d */
    private C11671b m30611d(int i) throws IOException {
        if (i == 0) {
            return C11671b.f30256c;
        }
        mo34377a(i, this.f30253j, 0, 4);
        return new C11671b(i, m30601a(this.f30253j, 0));
    }

    /* renamed from: e */
    private int m30612e() {
        if (this.f30250g == 0) {
            return 16;
        }
        C11671b bVar = this.f30252i;
        int i = bVar.f30257a;
        int i2 = this.f30251h.f30257a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f30258b + 16;
        }
        return (((i + 4) + bVar.f30258b) + this.f30249f) - i2;
    }

    public synchronized void close() throws IOException {
        this.f30248e.close();
    }

    public synchronized int size() {
        return this.f30250g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C11669m.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f30249f);
        sb.append(", size=");
        sb.append(this.f30250g);
        sb.append(", first=");
        sb.append(this.f30251h);
        sb.append(", last=");
        sb.append(this.f30252i);
        sb.append(", element lengths=[");
        try {
            mo34374a((C11663a) new C11670a(this, sb));
        } catch (IOException e) {
            f30246k.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    private void m30603a(int i, int i2, int i3, int i4) throws IOException {
        m30607b(this.f30253j, 0, i);
        m30607b(this.f30253j, 4, i2);
        m30607b(this.f30253j, 8, i3);
        m30607b(this.f30253j, 12, i4);
        this.f30248e.seek(0);
        this.f30248e.write(this.f30253j);
    }

    /* renamed from: b */
    private static RandomAccessFile m30605b(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: d */
    private int m30610d() {
        return this.f30249f - m30612e();
    }

    /* renamed from: e */
    private void m30613e(int i) throws IOException {
        this.f30248e.setLength((long) i);
        this.f30248e.getChannel().force(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo34380b(int i) {
        int i2 = this.f30249f;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: b */
    private void m30606b(int i, byte[] bArr, int i2, int i3) throws IOException {
        int b = mo34380b(i);
        int i4 = b + i3;
        int i5 = this.f30249f;
        if (i4 <= i5) {
            this.f30248e.seek((long) b);
            this.f30248e.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - b;
        this.f30248e.seek((long) b);
        this.f30248e.write(bArr, i2, i6);
        this.f30248e.seek(16);
        this.f30248e.write(bArr, i2 + i6, i3 - i6);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m30604a(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile b = m30605b(file2);
        try {
            b.setLength(4096);
            b.seek(0);
            byte[] bArr = new byte[16];
            m30607b(bArr, 0, 4096);
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

    /* renamed from: c */
    private void m30609c(int i) throws IOException {
        int i2 = i + 4;
        int d = m30610d();
        if (d < i2) {
            int i3 = this.f30249f;
            while (true) {
                d += i3;
                int i4 = i3 << 1;
                if (i4 < i3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot grow file beyond ");
                    sb.append(i3);
                    sb.append(" bytes");
                    throw new EOFException(sb.toString());
                } else if (d >= i2) {
                    m30613e(i4);
                    C11671b bVar = this.f30252i;
                    int b = mo34380b(bVar.f30257a + 4 + bVar.f30258b);
                    if (b <= this.f30251h.f30257a) {
                        FileChannel channel = this.f30248e.getChannel();
                        channel.position((long) this.f30249f);
                        int i5 = b - 16;
                        long j = (long) i5;
                        if (channel.transferTo(16, j, channel) == j) {
                            m30602a(16, i5);
                        } else {
                            throw new AssertionError("Copied insufficient number of bytes!");
                        }
                    }
                    int i6 = this.f30252i.f30257a;
                    int i7 = this.f30251h.f30257a;
                    if (i6 < i7) {
                        int i8 = (this.f30249f + i6) - 16;
                        m30603a(i4, this.f30250g, i7, i8);
                        this.f30252i = new C11671b(i8, this.f30252i.f30258b);
                    } else {
                        m30603a(i4, this.f30250g, i7, i6);
                    }
                    this.f30249f = i4;
                    return;
                } else {
                    i3 = i4;
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean mo34381b() {
        return this.f30250g == 0;
    }

    /* renamed from: a */
    private void m30602a(int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, f30247l.length);
            m30606b(i, f30247l, 0, min);
            i2 -= min;
            i += min;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34377a(int i, byte[] bArr, int i2, int i3) throws IOException {
        int b = mo34380b(i);
        int i4 = b + i3;
        int i5 = this.f30249f;
        if (i4 <= i5) {
            this.f30248e.seek((long) b);
            this.f30248e.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - b;
        this.f30248e.seek((long) b);
        this.f30248e.readFully(bArr, i2, i6);
        this.f30248e.seek(16);
        this.f30248e.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: a */
    public void mo34378a(byte[] bArr) throws IOException {
        mo34379a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void mo34379a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (bArr != null) {
            if ((i | i2) >= 0) {
                if (i2 <= bArr.length - i) {
                    m30609c(i2);
                    boolean b = mo34381b();
                    if (b) {
                        i3 = 16;
                    } else {
                        i3 = mo34380b(this.f30252i.f30257a + 4 + this.f30252i.f30258b);
                    }
                    C11671b bVar = new C11671b(i3, i2);
                    m30607b(this.f30253j, 0, i2);
                    m30606b(bVar.f30257a, this.f30253j, 0, 4);
                    m30606b(bVar.f30257a + 4, bArr, i, i2);
                    m30603a(this.f30249f, this.f30250g + 1, b ? bVar.f30257a : this.f30251h.f30257a, bVar.f30257a);
                    this.f30252i = bVar;
                    this.f30250g++;
                    if (b) {
                        this.f30251h = this.f30252i;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("data == null");
    }

    /* renamed from: a */
    public synchronized int mo34374a(C11663a aVar) throws IOException {
        int i = this.f30251h.f30257a;
        for (int i2 = 0; i2 < this.f30250g; i2++) {
            C11671b d = m30611d(i);
            if (!aVar.read(new C11672c(d), d.f30258b)) {
                return i2 + 1;
            }
            i = mo34380b(d.f30257a + 4 + d.f30258b);
        }
        return this.f30250g;
    }

    /* renamed from: a */
    public synchronized void mo34376a(int i) throws IOException {
        if (mo34381b()) {
            throw new NoSuchElementException();
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot remove negative (");
            sb.append(i);
            sb.append(") number of elements.");
            throw new IllegalArgumentException(sb.toString());
        } else if (i != 0) {
            if (i == this.f30250g) {
                mo34375a();
            } else if (i <= this.f30250g) {
                int i2 = this.f30251h.f30257a;
                int i3 = this.f30251h.f30257a;
                int i4 = this.f30251h.f30258b;
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    i5 += i4 + 4;
                    i3 = mo34380b(i3 + 4 + i4);
                    mo34377a(i3, this.f30253j, 0, 4);
                    i4 = m30601a(this.f30253j, 0);
                }
                m30603a(this.f30249f, this.f30250g - i, i3, this.f30252i.f30257a);
                this.f30250g -= i;
                this.f30251h = new C11671b(i3, i4);
                m30602a(i2, i5);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot remove more elements (");
                sb2.append(i);
                sb2.append(") than present in queue (");
                sb2.append(this.f30250g);
                sb2.append(").");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo34375a() throws IOException {
        m30603a(4096, 0, 0, 0);
        this.f30248e.seek(16);
        this.f30248e.write(f30247l, 0, 4080);
        this.f30250g = 0;
        this.f30251h = C11671b.f30256c;
        this.f30252i = C11671b.f30256c;
        if (this.f30249f > 4096) {
            m30613e(4096);
        }
        this.f30249f = 4096;
    }
}
