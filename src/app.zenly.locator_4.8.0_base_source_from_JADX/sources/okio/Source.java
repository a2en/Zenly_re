package okio;

import java.io.Closeable;
import java.io.IOException;

public interface Source extends Closeable {
    void close() throws IOException;

    long read(C13342c cVar, long j) throws IOException;

    C13368t timeout();
}
