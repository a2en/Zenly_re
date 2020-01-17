package okio;

import java.io.IOException;
import java.util.zip.Deflater;

/* renamed from: okio.e */
public final class C13347e implements Sink {

    /* renamed from: e */
    private final BufferedSink f34621e;

    /* renamed from: f */
    private final Deflater f34622f;

    /* renamed from: g */
    private boolean f34623g;

    C13347e(BufferedSink bufferedSink, Deflater deflater) {
        if (bufferedSink == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.f34621e = bufferedSink;
            this.f34622f = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: a */
    private void m35352a(boolean z) throws IOException {
        C13365q b;
        int i;
        C13342c buffer = this.f34621e.buffer();
        while (true) {
            b = buffer.mo38490b(1);
            if (z) {
                Deflater deflater = this.f34622f;
                byte[] bArr = b.f34663a;
                int i2 = b.f34665c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f34622f;
                byte[] bArr2 = b.f34663a;
                int i3 = b.f34665c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                b.f34665c += i;
                buffer.f34606f += (long) i;
                this.f34621e.emitCompleteSegments();
            } else if (this.f34622f.needsInput()) {
                break;
            }
        }
        if (b.f34664b == b.f34665c) {
            buffer.f34605e = b.mo38574b();
            C13366r.m35401a(b);
        }
    }

    public void close() throws IOException {
        if (!this.f34623g) {
            try {
                mo38534a();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f34622f.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f34621e.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f34623g = true;
            if (th != null) {
                C13370u.m35434a(th);
                throw null;
            }
        }
    }

    public void flush() throws IOException {
        m35352a(true);
        this.f34621e.flush();
    }

    public C13368t timeout() {
        return this.f34621e.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeflaterSink(");
        sb.append(this.f34621e);
        sb.append(")");
        return sb.toString();
    }

    public void write(C13342c cVar, long j) throws IOException {
        C13370u.m35433a(cVar.f34606f, 0, j);
        while (j > 0) {
            C13365q qVar = cVar.f34605e;
            int min = (int) Math.min(j, (long) (qVar.f34665c - qVar.f34664b));
            this.f34622f.setInput(qVar.f34663a, qVar.f34664b, min);
            m35352a(false);
            long j2 = (long) min;
            cVar.f34606f -= j2;
            qVar.f34664b += min;
            if (qVar.f34664b == qVar.f34665c) {
                cVar.f34605e = qVar.mo38574b();
                C13366r.m35401a(qVar);
            }
            j -= j2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38534a() throws IOException {
        this.f34622f.finish();
        m35352a(false);
    }
}
