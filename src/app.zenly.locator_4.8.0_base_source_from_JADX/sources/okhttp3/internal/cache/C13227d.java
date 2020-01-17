package okhttp3.internal.cache;

import java.io.IOException;
import okio.C13342c;
import okio.C13348f;
import okio.Sink;

/* renamed from: okhttp3.internal.cache.d */
class C13227d extends C13348f {

    /* renamed from: f */
    private boolean f34036f;

    C13227d(Sink sink) {
        super(sink);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37985a(IOException iOException) {
        throw null;
    }

    public void close() throws IOException {
        if (!this.f34036f) {
            try {
                super.close();
            } catch (IOException e) {
                this.f34036f = true;
                mo37985a(e);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.f34036f) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f34036f = true;
                mo37985a(e);
            }
        }
    }

    public void write(C13342c cVar, long j) throws IOException {
        if (this.f34036f) {
            cVar.skip(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e) {
            this.f34036f = true;
            mo37985a(e);
        }
    }
}
