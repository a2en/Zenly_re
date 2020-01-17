package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: okio.i */
public final class C13351i implements Sink {

    /* renamed from: e */
    private final BufferedSink f34627e;

    /* renamed from: f */
    private final Deflater f34628f;

    /* renamed from: g */
    private final C13347e f34629g;

    /* renamed from: h */
    private boolean f34630h;

    /* renamed from: i */
    private final CRC32 f34631i = new CRC32();

    public C13351i(Sink sink) {
        if (sink != null) {
            this.f34628f = new Deflater(-1, true);
            this.f34627e = C13354l.m35374a(sink);
            this.f34629g = new C13347e(this.f34627e, this.f34628f);
            m35367b();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    private void m35365a() throws IOException {
        this.f34627e.writeIntLe((int) this.f34631i.getValue());
        this.f34627e.writeIntLe((int) this.f34628f.getBytesRead());
    }

    /* renamed from: b */
    private void m35367b() {
        C13342c buffer = this.f34627e.buffer();
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    public void close() throws IOException {
        if (!this.f34630h) {
            try {
                this.f34629g.mo38534a();
                m35365a();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f34628f.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f34627e.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f34630h = true;
            if (th != null) {
                C13370u.m35434a(th);
                throw null;
            }
        }
    }

    public void flush() throws IOException {
        this.f34629g.flush();
    }

    public C13368t timeout() {
        return this.f34627e.timeout();
    }

    public void write(C13342c cVar, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (i != 0) {
            m35366a(cVar, j);
            this.f34629g.write(cVar, j);
        }
    }

    /* renamed from: a */
    private void m35366a(C13342c cVar, long j) {
        C13365q qVar = cVar.f34605e;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (qVar.f34665c - qVar.f34664b));
            this.f34631i.update(qVar.f34663a, qVar.f34664b, min);
            j -= (long) min;
            qVar = qVar.f34668f;
        }
    }
}
