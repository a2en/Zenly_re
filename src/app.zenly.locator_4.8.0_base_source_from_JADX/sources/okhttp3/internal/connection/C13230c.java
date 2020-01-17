package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.C13307l;
import okhttp3.p418f0.C13182c;

/* renamed from: okhttp3.internal.connection.c */
final class C13230c {

    /* renamed from: a */
    private final List<C13307l> f34040a;

    /* renamed from: b */
    private int f34041b = 0;

    /* renamed from: c */
    private boolean f34042c;

    /* renamed from: d */
    private boolean f34043d;

    C13230c(List<C13307l> list) {
        this.f34040a = list;
    }

    /* renamed from: b */
    private boolean m34690b(SSLSocket sSLSocket) {
        for (int i = this.f34041b; i < this.f34040a.size(); i++) {
            if (((C13307l) this.f34040a.get(i)).mo38222a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13307l mo38000a(SSLSocket sSLSocket) throws IOException {
        C13307l lVar;
        int i = this.f34041b;
        int size = this.f34040a.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = (C13307l) this.f34040a.get(i);
            if (lVar.mo38222a(sSLSocket)) {
                this.f34041b = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            this.f34042c = m34690b(sSLSocket);
            C13182c.f33853a.mo37869a(lVar, sSLSocket, this.f34043d);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f34043d);
        sb.append(", modes=");
        sb.append(this.f34040a);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo38001a(IOException iOException) {
        this.f34043d = true;
        if (!this.f34042c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }
}
