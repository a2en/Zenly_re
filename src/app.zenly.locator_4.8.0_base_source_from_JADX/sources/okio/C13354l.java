package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: okio.l */
public final class C13354l {

    /* renamed from: a */
    static final Logger f34641a = Logger.getLogger(C13354l.class.getName());

    /* renamed from: okio.l$a */
    class C13355a implements Sink {

        /* renamed from: e */
        final /* synthetic */ C13368t f34642e;

        /* renamed from: f */
        final /* synthetic */ OutputStream f34643f;

        C13355a(C13368t tVar, OutputStream outputStream) {
            this.f34642e = tVar;
            this.f34643f = outputStream;
        }

        public void close() throws IOException {
            this.f34643f.close();
        }

        public void flush() throws IOException {
            this.f34643f.flush();
        }

        public C13368t timeout() {
            return this.f34642e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("sink(");
            sb.append(this.f34643f);
            sb.append(")");
            return sb.toString();
        }

        public void write(C13342c cVar, long j) throws IOException {
            C13370u.m35433a(cVar.f34606f, 0, j);
            while (j > 0) {
                this.f34642e.mo38546e();
                C13365q qVar = cVar.f34605e;
                int min = (int) Math.min(j, (long) (qVar.f34665c - qVar.f34664b));
                this.f34643f.write(qVar.f34663a, qVar.f34664b, min);
                qVar.f34664b += min;
                long j2 = (long) min;
                j -= j2;
                cVar.f34606f -= j2;
                if (qVar.f34664b == qVar.f34665c) {
                    cVar.f34605e = qVar.mo38574b();
                    C13366r.m35401a(qVar);
                }
            }
        }
    }

    /* renamed from: okio.l$b */
    class C13356b implements Source {

        /* renamed from: e */
        final /* synthetic */ C13368t f34644e;

        /* renamed from: f */
        final /* synthetic */ InputStream f34645f;

        C13356b(C13368t tVar, InputStream inputStream) {
            this.f34644e = tVar;
            this.f34645f = inputStream;
        }

        public void close() throws IOException {
            this.f34645f.close();
        }

        public long read(C13342c cVar, long j) throws IOException {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (i == 0) {
                return 0;
            } else {
                try {
                    this.f34644e.mo38546e();
                    C13365q b = cVar.mo38490b(1);
                    int read = this.f34645f.read(b.f34663a, b.f34665c, (int) Math.min(j, (long) (8192 - b.f34665c)));
                    if (read == -1) {
                        return -1;
                    }
                    b.f34665c += read;
                    long j2 = (long) read;
                    cVar.f34606f += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C13354l.m35383a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public C13368t timeout() {
            return this.f34644e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("source(");
            sb.append(this.f34645f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: okio.l$c */
    class C13357c implements Sink {
        C13357c() {
        }

        public void close() throws IOException {
        }

        public void flush() throws IOException {
        }

        public C13368t timeout() {
            return C13368t.f34674d;
        }

        public void write(C13342c cVar, long j) throws IOException {
            cVar.skip(j);
        }
    }

    /* renamed from: okio.l$d */
    class C13358d extends C13337a {

        /* renamed from: k */
        final /* synthetic */ Socket f34646k;

        C13358d(Socket socket) {
            this.f34646k = socket;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public IOException mo38149b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo38069i() {
            String str = "Failed to close timed out socket ";
            try {
                this.f34646k.close();
            } catch (Exception e) {
                Logger logger = C13354l.f34641a;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f34646k);
                logger.log(level, sb.toString(), e);
            } catch (AssertionError e2) {
                if (C13354l.m35383a(e2)) {
                    Logger logger2 = C13354l.f34641a;
                    Level level2 = Level.WARNING;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(this.f34646k);
                    logger2.log(level2, sb2.toString(), e2);
                    return;
                }
                throw e2;
            }
        }
    }

    private C13354l() {
    }

    /* renamed from: a */
    public static BufferedSource m35375a(Source source) {
        return new C13363p(source);
    }

    /* renamed from: b */
    public static Sink m35384b(File file) throws FileNotFoundException {
        if (file != null) {
            return m35378a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    public static Source m35386c(File file) throws FileNotFoundException {
        if (file != null) {
            return m35381a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static BufferedSink m35374a(Sink sink) {
        return new C13361o(sink);
    }

    /* renamed from: a */
    public static Sink m35378a(OutputStream outputStream) {
        return m35379a(outputStream, new C13368t());
    }

    /* renamed from: b */
    public static Source m35385b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C13337a c = m35387c(socket);
            return c.mo38475a(m35382a(socket.getInputStream(), (C13368t) c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: c */
    private static C13337a m35387c(Socket socket) {
        return new C13358d(socket);
    }

    /* renamed from: a */
    private static Sink m35379a(OutputStream outputStream, C13368t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (tVar != null) {
            return new C13355a(tVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static Sink m35380a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C13337a c = m35387c(socket);
            return c.mo38474a(m35379a(socket.getOutputStream(), (C13368t) c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a */
    public static Source m35381a(InputStream inputStream) {
        return m35382a(inputStream, new C13368t());
    }

    /* renamed from: a */
    private static Source m35382a(InputStream inputStream, C13368t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (tVar != null) {
            return new C13356b(tVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static Sink m35377a(File file) throws FileNotFoundException {
        if (file != null) {
            return m35378a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static Sink m35376a() {
        return new C13357c();
    }

    /* renamed from: a */
    static boolean m35383a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
