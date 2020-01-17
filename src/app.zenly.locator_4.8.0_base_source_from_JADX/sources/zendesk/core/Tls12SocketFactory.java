package zendesk.core;

import android.os.Build.VERSION;
import com.zendesk.logger.Logger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Collections;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C13176d0;
import okhttp3.C13307l;
import okhttp3.C13307l.C13308a;
import okhttp3.C13325v.C13327b;

class Tls12SocketFactory extends SSLSocketFactory {
    private static final String[] TLS_V12_ONLY = {C13176d0.TLS_1_2.mo37840a()};
    final SSLSocketFactory delegate;

    public Tls12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    public static C13327b enableTls12OnPreLollipop(C13327b bVar) {
        int i = VERSION.SDK_INT;
        String str = "Tls12SocketFactory";
        if (i < 16 || i >= 21) {
            Logger.m31608a(str, "Skipping TLS 1.2 patch", new Object[0]);
            C13308a aVar = new C13308a(C13307l.f34410g);
            aVar.mo38231a(C13176d0.TLS_1_2, C13176d0.TLS_1_3);
            bVar.mo38357a(Collections.singletonList(aVar.mo38233a()));
        } else {
            try {
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init(null, null, null);
                bVar.mo38359a((SSLSocketFactory) new Tls12SocketFactory(instance.getSocketFactory()));
                C13308a aVar2 = new C13308a(C13307l.f34410g);
                aVar2.mo38231a(C13176d0.TLS_1_2);
                bVar.mo38357a(Collections.singletonList(aVar2.mo38233a()));
                Logger.m31608a(str, "Applied TLS 1.2 patch", new Object[0]);
            } catch (Exception e) {
                Logger.m31607a(str, "Error while setting TLS 1.2", e, new Object[0]);
            }
        }
        return bVar;
    }

    private static Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(TLS_V12_ONLY);
        }
        return socket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.delegate.createSocket(socket, str, i, z);
        patch(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.delegate.createSocket(str, i);
        patch(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.delegate.createSocket(str, i, inetAddress, i2);
        patch(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.delegate.createSocket(inetAddress, i);
        patch(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.delegate.createSocket(inetAddress, i, inetAddress2, i2);
        patch(createSocket);
        return createSocket;
    }
}
