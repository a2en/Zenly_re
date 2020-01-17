package okhttp3.internal.p423ws;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13342c.C13345c;
import okio.C13346d;

/* renamed from: okhttp3.internal.ws.WebSocketReader */
final class WebSocketReader {

    /* renamed from: a */
    final boolean f34324a;

    /* renamed from: b */
    final BufferedSource f34325b;

    /* renamed from: c */
    final FrameCallback f34326c;

    /* renamed from: d */
    boolean f34327d;

    /* renamed from: e */
    int f34328e;

    /* renamed from: f */
    long f34329f;

    /* renamed from: g */
    boolean f34330g;

    /* renamed from: h */
    boolean f34331h;

    /* renamed from: i */
    private final C13342c f34332i = new C13342c();

    /* renamed from: j */
    private final C13342c f34333j = new C13342c();

    /* renamed from: k */
    private final byte[] f34334k;

    /* renamed from: l */
    private final C13345c f34335l;

    /* renamed from: okhttp3.internal.ws.WebSocketReader$FrameCallback */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(C13346d dVar) throws IOException;

        void onReadPing(C13346d dVar);

        void onReadPong(C13346d dVar);
    }

    WebSocketReader(boolean z, BufferedSource bufferedSource, FrameCallback frameCallback) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        } else if (frameCallback != null) {
            this.f34324a = z;
            this.f34325b = bufferedSource;
            this.f34326c = frameCallback;
            C13345c cVar = null;
            this.f34334k = z ? null : new byte[4];
            if (!z) {
                cVar = new C13345c();
            }
            this.f34335l = cVar;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    /* renamed from: b */
    private void m35011b() throws IOException {
        String str;
        long j = this.f34329f;
        if (j > 0) {
            this.f34325b.readFully(this.f34332i, j);
            if (!this.f34324a) {
                this.f34332i.mo38485a(this.f34335l);
                this.f34335l.mo38511a(0);
                C13302c.m35029a(this.f34335l, this.f34334k);
                this.f34335l.close();
            }
        }
        switch (this.f34328e) {
            case 8:
                short s = 1005;
                long b = this.f34332i.mo38488b();
                if (b != 1) {
                    if (b != 0) {
                        s = this.f34332i.readShort();
                        str = this.f34332i.readUtf8();
                        String a = C13302c.m35028a(s);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    } else {
                        str = "";
                    }
                    this.f34326c.onReadClose(s, str);
                    this.f34327d = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f34326c.onReadPing(this.f34332i.readByteString());
                return;
            case 10:
                this.f34326c.onReadPong(this.f34332i.readByteString());
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.f34328e));
                throw new ProtocolException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private void m35012c() throws IOException {
        if (!this.f34327d) {
            long f = this.f34325b.timeout().mo38547f();
            this.f34325b.timeout().mo38543b();
            try {
                byte readByte = this.f34325b.readByte() & 255;
                this.f34325b.timeout().mo38542a(f, TimeUnit.NANOSECONDS);
                this.f34328e = readByte & 15;
                boolean z = true;
                this.f34330g = (readByte & 128) != 0;
                this.f34331h = (readByte & 8) != 0;
                if (!this.f34331h || this.f34330g) {
                    boolean z2 = (readByte & 64) != 0;
                    boolean z3 = (readByte & 32) != 0;
                    boolean z4 = (readByte & 16) != 0;
                    if (z2 || z3 || z4) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte readByte2 = this.f34325b.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z = false;
                    }
                    boolean z5 = this.f34324a;
                    if (z == z5) {
                        throw new ProtocolException(z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    this.f34329f = (long) (readByte2 & Byte.MAX_VALUE);
                    long j = this.f34329f;
                    if (j == 126) {
                        this.f34329f = ((long) this.f34325b.readShort()) & 65535;
                    } else if (j == 127) {
                        this.f34329f = this.f34325b.readLong();
                        if (this.f34329f < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Frame length 0x");
                            sb.append(Long.toHexString(this.f34329f));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.f34331h && this.f34329f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        this.f34325b.readFully(this.f34334k);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f34325b.timeout().mo38542a(f, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: d */
    private void m35013d() throws IOException {
        while (!this.f34327d) {
            long j = this.f34329f;
            if (j > 0) {
                this.f34325b.readFully(this.f34333j, j);
                if (!this.f34324a) {
                    this.f34333j.mo38485a(this.f34335l);
                    this.f34335l.mo38511a(this.f34333j.mo38488b() - this.f34329f);
                    C13302c.m35029a(this.f34335l, this.f34334k);
                    this.f34335l.close();
                }
            }
            if (!this.f34330g) {
                m35015f();
                if (this.f34328e != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.f34328e));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: e */
    private void m35014e() throws IOException {
        int i = this.f34328e;
        if (i == 1 || i == 2) {
            m35013d();
            if (i == 1) {
                this.f34326c.onReadMessage(this.f34333j.readUtf8());
            } else {
                this.f34326c.onReadMessage(this.f34333j.readByteString());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown opcode: ");
            sb.append(Integer.toHexString(i));
            throw new ProtocolException(sb.toString());
        }
    }

    /* renamed from: f */
    private void m35015f() throws IOException {
        while (!this.f34327d) {
            m35012c();
            if (this.f34331h) {
                m35011b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38195a() throws IOException {
        m35012c();
        if (this.f34331h) {
            m35011b();
        } else {
            m35014e();
        }
    }
}
