package okio;

import java.io.IOException;

/* renamed from: okio.f */
public abstract class C13348f implements Sink {

    /* renamed from: e */
    private final Sink f34624e;

    public C13348f(Sink sink) {
        if (sink != null) {
            this.f34624e = sink;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.f34624e.close();
    }

    public void flush() throws IOException {
        this.f34624e.flush();
    }

    public C13368t timeout() {
        return this.f34624e.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f34624e.toString());
        sb.append(")");
        return sb.toString();
    }

    public void write(C13342c cVar, long j) throws IOException {
        this.f34624e.write(cVar, j);
    }
}
