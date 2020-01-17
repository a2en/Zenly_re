package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13317r;
import okhttp3.C13331y;
import okhttp3.internal.connection.C13235f;
import okio.Sink;
import okio.Source;

public interface ExchangeCodec {
    void cancel();

    C13235f connection();

    Sink createRequestBody(C13331y yVar, long j) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    Source openResponseBodySource(C13167a0 a0Var) throws IOException;

    C13168a readResponseHeaders(boolean z) throws IOException;

    long reportedContentLength(C13167a0 a0Var) throws IOException;

    C13317r trailers() throws IOException;

    void writeRequestHeaders(C13331y yVar) throws IOException;
}
