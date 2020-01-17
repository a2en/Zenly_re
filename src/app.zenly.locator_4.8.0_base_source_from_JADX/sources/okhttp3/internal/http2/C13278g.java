package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.p418f0.C13184e;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;
import okio.C13368t;
import okio.Source;

/* renamed from: okhttp3.internal.http2.g */
final class C13278g implements Closeable {

    /* renamed from: i */
    static final Logger f34260i = Logger.getLogger(C13261d.class.getName());

    /* renamed from: e */
    private final BufferedSource f34261e;

    /* renamed from: f */
    private final C13279a f34262f = new C13279a(this.f34261e);

    /* renamed from: g */
    private final boolean f34263g;

    /* renamed from: h */
    final C13259a f34264h = new C13259a(4096, this.f34262f);

    /* renamed from: okhttp3.internal.http2.g$a */
    static final class C13279a implements Source {

        /* renamed from: e */
        private final BufferedSource f34265e;

        /* renamed from: f */
        int f34266f;

        /* renamed from: g */
        byte f34267g;

        /* renamed from: h */
        int f34268h;

        /* renamed from: i */
        int f34269i;

        /* renamed from: j */
        short f34270j;

        C13279a(BufferedSource bufferedSource) {
            this.f34265e = bufferedSource;
        }

        /* renamed from: a */
        private void m34924a() throws IOException {
            int i = this.f34268h;
            int a = C13278g.m34910a(this.f34265e);
            this.f34269i = a;
            this.f34266f = a;
            byte readByte = (byte) (this.f34265e.readByte() & 255);
            this.f34267g = (byte) (this.f34265e.readByte() & 255);
            if (C13278g.f34260i.isLoggable(Level.FINE)) {
                C13278g.f34260i.fine(C13261d.m34848a(true, this.f34268h, this.f34266f, readByte, this.f34267g));
            }
            this.f34268h = this.f34265e.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                C13261d.m34849b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (this.f34268h != i) {
                C13261d.m34849b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        public void close() throws IOException {
        }

        public long read(C13342c cVar, long j) throws IOException {
            while (true) {
                int i = this.f34269i;
                if (i == 0) {
                    this.f34265e.skip((long) this.f34270j);
                    this.f34270j = 0;
                    if ((this.f34267g & 4) != 0) {
                        return -1;
                    }
                    m34924a();
                } else {
                    long read = this.f34265e.read(cVar, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.f34269i = (int) (((long) this.f34269i) - read);
                    return read;
                }
            }
        }

        public C13368t timeout() {
            return this.f34265e.timeout();
        }
    }

    /* renamed from: okhttp3.internal.http2.g$b */
    interface C13280b {
        /* renamed from: a */
        void mo38117a();

        /* renamed from: a */
        void mo38118a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo38119a(int i, int i2, List<C13257b> list) throws IOException;

        /* renamed from: a */
        void mo38120a(int i, long j);

        /* renamed from: a */
        void mo38121a(int i, C13256a aVar);

        /* renamed from: a */
        void mo38122a(int i, C13256a aVar, C13346d dVar);

        /* renamed from: a */
        void mo38123a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo38124a(boolean z, int i, int i2, List<C13257b> list);

        /* renamed from: a */
        void mo38125a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* renamed from: a */
        void mo38126a(boolean z, C13288k kVar);
    }

    C13278g(BufferedSource bufferedSource, boolean z) {
        this.f34261e = bufferedSource;
        this.f34263g = z;
    }

    /* renamed from: b */
    private void m34914b(C13280b bVar, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            C13261d.m34849b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f34261e.readInt();
            int readInt2 = this.f34261e.readInt();
            int i3 = i - 8;
            C13256a a = C13256a.m34818a(readInt2);
            if (a != null) {
                C13346d dVar = C13346d.f34617i;
                if (i3 > 0) {
                    dVar = this.f34261e.readByteString((long) i3);
                }
                bVar.mo38122a(readInt, a, dVar);
                return;
            }
            C13261d.m34849b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            C13261d.m34849b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: c */
    private void m34915c(C13280b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f34261e.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m34912a(bVar, i2);
                i -= 5;
            }
            bVar.mo38124a(z, i2, -1, m34911a(m34909a(i, b, s), s, b, i2));
            return;
        }
        C13261d.m34849b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: d */
    private void m34916d(C13280b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            C13261d.m34849b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f34261e.readInt();
            int readInt2 = this.f34261e.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo38123a(z, readInt, readInt2);
        } else {
            C13261d.m34849b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: e */
    private void m34917e(C13280b bVar, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            C13261d.m34849b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            m34912a(bVar, i2);
        } else {
            C13261d.m34849b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: f */
    private void m34918f(C13280b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f34261e.readByte() & 255);
            }
            bVar.mo38119a(i2, this.f34261e.readInt() & Integer.MAX_VALUE, m34911a(m34909a(i - 4, b, s), s, b, i2));
            return;
        }
        C13261d.m34849b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: g */
    private void m34919g(C13280b bVar, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            C13261d.m34849b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.f34261e.readInt();
            C13256a a = C13256a.m34818a(readInt);
            if (a != null) {
                bVar.mo38121a(i2, a);
                return;
            }
            C13261d.m34849b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            C13261d.m34849b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: h */
    private void m34920h(C13280b bVar, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            C13261d.m34849b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo38117a();
                return;
            }
            C13261d.m34849b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        } else if (i % 6 == 0) {
            C13288k kVar = new C13288k();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f34261e.readShort() & 65535;
                int readInt = this.f34261e.readInt();
                switch (readShort) {
                    case 2:
                        if (!(readInt == 0 || readInt == 1)) {
                            C13261d.m34849b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt >= 0) {
                            break;
                        } else {
                            C13261d.m34849b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    case 5:
                        if (readInt >= 16384 && readInt <= 16777215) {
                            break;
                        } else {
                            C13261d.m34849b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            throw null;
                        }
                        break;
                }
                kVar.mo38170a(readShort, readInt);
            }
            bVar.mo38126a(false, kVar);
        } else {
            C13261d.m34849b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: i */
    private void m34921i(C13280b bVar, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f34261e.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo38120a(i2, readInt);
                return;
            }
            C13261d.m34849b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        C13261d.m34849b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    /* renamed from: a */
    public void mo38127a(C13280b bVar) throws IOException {
        if (!this.f34263g) {
            C13346d readByteString = this.f34261e.readByteString((long) C13261d.f34186a.mo38528g());
            if (f34260i.isLoggable(Level.FINE)) {
                f34260i.fine(C13184e.m34490a("<< CONNECTION %s", readByteString.mo38520b()));
            }
            if (!C13261d.f34186a.equals(readByteString)) {
                C13261d.m34849b("Expected a connection header but was %s", readByteString.mo38532j());
                throw null;
            }
        } else if (!mo38128a(true, bVar)) {
            C13261d.m34849b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public void close() throws IOException {
        this.f34261e.close();
    }

    /* renamed from: a */
    public boolean mo38128a(boolean z, C13280b bVar) throws IOException {
        try {
            this.f34261e.require(9);
            int a = m34910a(this.f34261e);
            if (a < 0 || a > 16384) {
                C13261d.m34849b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
                throw null;
            }
            byte readByte = (byte) (this.f34261e.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f34261e.readByte() & 255);
                int readInt = this.f34261e.readInt() & Integer.MAX_VALUE;
                if (f34260i.isLoggable(Level.FINE)) {
                    f34260i.fine(C13261d.m34848a(true, readInt, a, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m34913a(bVar, a, readByte2, readInt);
                        break;
                    case 1:
                        m34915c(bVar, a, readByte2, readInt);
                        break;
                    case 2:
                        m34917e(bVar, a, readByte2, readInt);
                        break;
                    case 3:
                        m34919g(bVar, a, readByte2, readInt);
                        break;
                    case 4:
                        m34920h(bVar, a, readByte2, readInt);
                        break;
                    case 5:
                        m34918f(bVar, a, readByte2, readInt);
                        break;
                    case 6:
                        m34916d(bVar, a, readByte2, readInt);
                        break;
                    case 7:
                        m34914b(bVar, a, readByte2, readInt);
                        break;
                    case 8:
                        m34921i(bVar, a, readByte2, readInt);
                        break;
                    default:
                        this.f34261e.skip((long) a);
                        break;
                }
                return true;
            }
            C13261d.m34849b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private List<C13257b> m34911a(int i, short s, byte b, int i2) throws IOException {
        C13279a aVar = this.f34262f;
        aVar.f34269i = i;
        aVar.f34266f = i;
        aVar.f34270j = s;
        aVar.f34267g = b;
        aVar.f34268h = i2;
        this.f34264h.mo38085c();
        return this.f34264h.mo38083a();
    }

    /* renamed from: a */
    private void m34913a(C13280b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f34261e.readByte() & 255);
                }
                bVar.mo38125a(z2, i2, this.f34261e, m34909a(i, b, s));
                this.f34261e.skip((long) s);
                return;
            }
            C13261d.m34849b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        C13261d.m34849b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: a */
    private void m34912a(C13280b bVar, int i) throws IOException {
        int readInt = this.f34261e.readInt();
        bVar.mo38118a(i, readInt & Integer.MAX_VALUE, (this.f34261e.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: a */
    static int m34910a(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: a */
    static int m34909a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C13261d.m34849b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
