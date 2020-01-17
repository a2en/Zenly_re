package okhttp3.internal.http2;

import java.io.IOException;

public final class StreamResetException extends IOException {

    /* renamed from: e */
    public final C13256a f34144e;

    public StreamResetException(C13256a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stream was reset: ");
        sb.append(aVar);
        super(sb.toString());
        this.f34144e = aVar;
    }
}
