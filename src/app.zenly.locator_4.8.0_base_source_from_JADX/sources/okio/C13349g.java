package okio;

import java.io.IOException;

/* renamed from: okio.g */
public abstract class C13349g implements Source {

    /* renamed from: e */
    private final Source f34625e;

    public C13349g(Source source) {
        if (source != null) {
            this.f34625e = source;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final Source mo38537a() {
        return this.f34625e;
    }

    public void close() throws IOException {
        this.f34625e.close();
    }

    public long read(C13342c cVar, long j) throws IOException {
        return this.f34625e.read(cVar, j);
    }

    public C13368t timeout() {
        return this.f34625e.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f34625e.toString());
        sb.append(")");
        return sb.toString();
    }
}
