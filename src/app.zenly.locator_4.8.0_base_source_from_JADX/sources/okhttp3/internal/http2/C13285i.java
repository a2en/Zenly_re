package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.C13342c;

/* renamed from: okhttp3.internal.http2.i */
final class C13285i implements Closeable {

    /* renamed from: k */
    private static final Logger f34296k = Logger.getLogger(C13261d.class.getName());

    /* renamed from: e */
    private final BufferedSink f34297e;

    /* renamed from: f */
    private final boolean f34298f;

    /* renamed from: g */
    private final C13342c f34299g = new C13342c();

    /* renamed from: h */
    private int f34300h = 16384;

    /* renamed from: i */
    private boolean f34301i;

    /* renamed from: j */
    final C13260b f34302j = new C13260b(this.f34299g);

    C13285i(BufferedSink bufferedSink, boolean z) {
        this.f34297e = bufferedSink;
        this.f34298f = z;
    }

    /* renamed from: a */
    public synchronized void mo38151a() throws IOException {
        if (this.f34301i) {
            throw new IOException("closed");
        } else if (this.f34298f) {
            if (f34296k.isLoggable(Level.FINE)) {
                f34296k.fine(C13184e.m34490a(">> CONNECTION %s", C13261d.f34186a.mo38520b()));
            }
            this.f34297e.write(C13261d.f34186a.mo38531i());
            this.f34297e.flush();
        }
    }

    /* renamed from: b */
    public int mo38162b() {
        return this.f34300h;
    }

    public synchronized void close() throws IOException {
        this.f34301i = true;
        this.f34297e.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.f34301i) {
            this.f34297e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public synchronized void mo38163b(C13288k kVar) throws IOException {
        if (!this.f34301i) {
            int i = 0;
            mo38153a(0, kVar.mo38177d() * 6, 4, 0);
            while (i < 10) {
                if (kVar.mo38178d(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.f34297e.writeShort(i2);
                    this.f34297e.writeInt(kVar.mo38169a(i));
                }
                i++;
            }
            this.f34297e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo38158a(C13288k kVar) throws IOException {
        if (!this.f34301i) {
            this.f34300h = kVar.mo38176c(this.f34300h);
            if (kVar.mo38173b() != -1) {
                this.f34302j.mo38086a(kVar.mo38173b());
            }
            mo38153a(0, 0, 4, 1);
            this.f34297e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    private void m34965b(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f34300h, j);
            long j2 = (long) min;
            j -= j2;
            mo38153a(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.f34297e.write(this.f34299g, j2);
        }
    }

    /* renamed from: a */
    public synchronized void mo38154a(int i, int i2, List<C13257b> list) throws IOException {
        if (!this.f34301i) {
            this.f34302j.mo38088a(list);
            long b = this.f34299g.mo38488b();
            int min = (int) Math.min((long) (this.f34300h - 4), b);
            long j = (long) min;
            int i3 = (b > j ? 1 : (b == j ? 0 : -1));
            mo38153a(i, min + 4, 5, i3 == 0 ? (byte) 4 : 0);
            this.f34297e.writeInt(i2 & Integer.MAX_VALUE);
            this.f34297e.write(this.f34299g, j);
            if (i3 > 0) {
                m34965b(i, b - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo38156a(int i, C13256a aVar) throws IOException {
        if (this.f34301i) {
            throw new IOException("closed");
        } else if (aVar.f34157e != -1) {
            mo38153a(i, 4, 3, 0);
            this.f34297e.writeInt(aVar.f34157e);
            this.f34297e.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public synchronized void mo38161a(boolean z, int i, C13342c cVar, int i2) throws IOException {
        if (!this.f34301i) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo38152a(i, b, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38152a(int i, byte b, C13342c cVar, int i2) throws IOException {
        mo38153a(i, i2, 0, b);
        if (i2 > 0) {
            this.f34297e.write(cVar, (long) i2);
        }
    }

    /* renamed from: a */
    public synchronized void mo38159a(boolean z, int i, int i2) throws IOException {
        if (!this.f34301i) {
            mo38153a(0, 8, 6, z ? (byte) 1 : 0);
            this.f34297e.writeInt(i);
            this.f34297e.writeInt(i2);
            this.f34297e.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo38157a(int i, C13256a aVar, byte[] bArr) throws IOException {
        if (this.f34301i) {
            throw new IOException("closed");
        } else if (aVar.f34157e != -1) {
            mo38153a(0, bArr.length + 8, 7, 0);
            this.f34297e.writeInt(i);
            this.f34297e.writeInt(aVar.f34157e);
            if (bArr.length > 0) {
                this.f34297e.write(bArr);
            }
            this.f34297e.flush();
        } else {
            C13261d.m34846a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    /* renamed from: a */
    public synchronized void mo38155a(int i, long j) throws IOException {
        if (this.f34301i) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            C13261d.m34846a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            mo38153a(i, 4, 8, 0);
            this.f34297e.writeInt((int) j);
            this.f34297e.flush();
        }
    }

    /* renamed from: a */
    public void mo38153a(int i, int i2, byte b, byte b2) throws IOException {
        if (f34296k.isLoggable(Level.FINE)) {
            f34296k.fine(C13261d.m34848a(false, i, i2, b, b2));
        }
        int i3 = this.f34300h;
        if (i2 > i3) {
            C13261d.m34846a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m34964a(this.f34297e, i2);
            this.f34297e.writeByte(b & 255);
            this.f34297e.writeByte(b2 & 255);
            this.f34297e.writeInt(i & Integer.MAX_VALUE);
        } else {
            C13261d.m34846a("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: a */
    private static void m34964a(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    /* renamed from: a */
    public synchronized void mo38160a(boolean z, int i, List<C13257b> list) throws IOException {
        if (!this.f34301i) {
            this.f34302j.mo38088a(list);
            long b = this.f34299g.mo38488b();
            int min = (int) Math.min((long) this.f34300h, b);
            long j = (long) min;
            int i2 = (b > j ? 1 : (b == j ? 0 : -1));
            byte b2 = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            mo38153a(i, min, 1, b2);
            this.f34297e.write(this.f34299g, j);
            if (i2 > 0) {
                m34965b(i, b - j);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
