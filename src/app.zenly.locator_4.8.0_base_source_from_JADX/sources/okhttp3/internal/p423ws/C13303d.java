package okhttp3.internal.p423ws;

import java.io.IOException;
import java.util.Random;
import okio.BufferedSink;
import okio.C13342c;
import okio.C13342c.C13345c;
import okio.C13346d;
import okio.C13368t;
import okio.Sink;

/* renamed from: okhttp3.internal.ws.d */
final class C13303d {

    /* renamed from: a */
    final boolean f34373a;

    /* renamed from: b */
    final Random f34374b;

    /* renamed from: c */
    final BufferedSink f34375c;

    /* renamed from: d */
    final C13342c f34376d;

    /* renamed from: e */
    boolean f34377e;

    /* renamed from: f */
    final C13342c f34378f = new C13342c();

    /* renamed from: g */
    final C13304a f34379g = new C13304a();

    /* renamed from: h */
    boolean f34380h;

    /* renamed from: i */
    private final byte[] f34381i;

    /* renamed from: j */
    private final C13345c f34382j;

    /* renamed from: okhttp3.internal.ws.d$a */
    final class C13304a implements Sink {

        /* renamed from: e */
        int f34383e;

        /* renamed from: f */
        long f34384f;

        /* renamed from: g */
        boolean f34385g;

        /* renamed from: h */
        boolean f34386h;

        C13304a() {
        }

        public void close() throws IOException {
            if (!this.f34386h) {
                C13303d dVar = C13303d.this;
                dVar.mo38214a(this.f34383e, dVar.f34378f.mo38488b(), this.f34385g, true);
                this.f34386h = true;
                C13303d.this.f34380h = false;
                return;
            }
            throw new IOException("closed");
        }

        public void flush() throws IOException {
            if (!this.f34386h) {
                C13303d dVar = C13303d.this;
                dVar.mo38214a(this.f34383e, dVar.f34378f.mo38488b(), this.f34385g, false);
                this.f34385g = false;
                return;
            }
            throw new IOException("closed");
        }

        public C13368t timeout() {
            return C13303d.this.f34375c.timeout();
        }

        public void write(C13342c cVar, long j) throws IOException {
            if (!this.f34386h) {
                C13303d.this.f34378f.write(cVar, j);
                boolean z = this.f34385g && this.f34384f != -1 && C13303d.this.f34378f.mo38488b() > this.f34384f - 8192;
                long a = C13303d.this.f34378f.mo38484a();
                if (a > 0 && !z) {
                    C13303d.this.mo38214a(this.f34383e, a, this.f34385g, false);
                    this.f34385g = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    C13303d(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f34373a = z;
            this.f34375c = bufferedSink;
            this.f34376d = bufferedSink.buffer();
            this.f34374b = random;
            C13345c cVar = null;
            this.f34381i = z ? new byte[4] : null;
            if (z) {
                cVar = new C13345c();
            }
            this.f34382j = cVar;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38216a(C13346d dVar) throws IOException {
        m35031b(9, dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38217b(C13346d dVar) throws IOException {
        m35031b(10, dVar);
    }

    /* renamed from: b */
    private void m35031b(int i, C13346d dVar) throws IOException {
        if (!this.f34377e) {
            int g = dVar.mo38528g();
            if (((long) g) <= 125) {
                this.f34376d.writeByte(i | 128);
                if (this.f34373a) {
                    this.f34376d.writeByte(g | 128);
                    this.f34374b.nextBytes(this.f34381i);
                    this.f34376d.write(this.f34381i);
                    if (g > 0) {
                        long b = this.f34376d.mo38488b();
                        this.f34376d.write(dVar);
                        this.f34376d.mo38485a(this.f34382j);
                        this.f34382j.mo38511a(b);
                        C13302c.m35029a(this.f34382j, this.f34381i);
                        this.f34382j.close();
                    }
                } else {
                    this.f34376d.writeByte(g);
                    this.f34376d.write(dVar);
                }
                this.f34375c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38215a(int i, C13346d dVar) throws IOException {
        C13346d dVar2 = C13346d.f34617i;
        if (!(i == 0 && dVar == null)) {
            if (i != 0) {
                C13302c.m35030b(i);
            }
            C13342c cVar = new C13342c();
            cVar.writeShort(i);
            if (dVar != null) {
                cVar.write(dVar);
            }
            dVar2 = cVar.readByteString();
        }
        try {
            m35031b(8, dVar2);
        } finally {
            this.f34377e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Sink mo38213a(int i, long j) {
        if (!this.f34380h) {
            this.f34380h = true;
            C13304a aVar = this.f34379g;
            aVar.f34383e = i;
            aVar.f34384f = j;
            aVar.f34385g = true;
            aVar.f34386h = false;
            return aVar;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38214a(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.f34377e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.f34376d.writeByte(i);
            if (this.f34373a) {
                i2 = 128;
            }
            if (j <= 125) {
                this.f34376d.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.f34376d.writeByte(i2 | 126);
                this.f34376d.writeShort((int) j);
            } else {
                this.f34376d.writeByte(i2 | 127);
                this.f34376d.writeLong(j);
            }
            if (this.f34373a) {
                this.f34374b.nextBytes(this.f34381i);
                this.f34376d.write(this.f34381i);
                if (j > 0) {
                    long b = this.f34376d.mo38488b();
                    this.f34376d.write(this.f34378f, j);
                    this.f34376d.mo38485a(this.f34382j);
                    this.f34382j.mo38511a(b);
                    C13302c.m35029a(this.f34382j, this.f34381i);
                    this.f34382j.close();
                }
            } else {
                this.f34376d.write(this.f34378f, j);
            }
            this.f34375c.emit();
            return;
        }
        throw new IOException("closed");
    }
}
