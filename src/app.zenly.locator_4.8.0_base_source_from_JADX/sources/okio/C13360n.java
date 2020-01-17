package okio;

import java.io.IOException;

/* renamed from: okio.n */
final class C13360n implements Source {

    /* renamed from: e */
    private final BufferedSource f34649e;

    /* renamed from: f */
    private final C13342c f34650f;

    /* renamed from: g */
    private C13365q f34651g = this.f34650f.f34605e;

    /* renamed from: h */
    private int f34652h;

    /* renamed from: i */
    private boolean f34653i;

    /* renamed from: j */
    private long f34654j;

    C13360n(BufferedSource bufferedSource) {
        this.f34649e = bufferedSource;
        this.f34650f = bufferedSource.buffer();
        C13365q qVar = this.f34651g;
        this.f34652h = qVar != null ? qVar.f34664b : -1;
    }

    public void close() throws IOException {
        this.f34653i = true;
    }

    public long read(C13342c cVar, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f34653i) {
            C13365q qVar = this.f34651g;
            if (qVar != null) {
                C13365q qVar2 = this.f34650f.f34605e;
                if (!(qVar == qVar2 && this.f34652h == qVar2.f34664b)) {
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
            }
            if (i == 0) {
                return 0;
            }
            if (!this.f34649e.request(this.f34654j + 1)) {
                return -1;
            }
            if (this.f34651g == null) {
                C13365q qVar3 = this.f34650f.f34605e;
                if (qVar3 != null) {
                    this.f34651g = qVar3;
                    this.f34652h = qVar3.f34664b;
                }
            }
            long min = Math.min(j, this.f34650f.f34606f - this.f34654j);
            this.f34650f.mo38486a(cVar, this.f34654j, min);
            this.f34654j += min;
            return min;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public C13368t timeout() {
        return this.f34649e.timeout();
    }
}
