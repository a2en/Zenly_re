package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface Sink extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    C13368t timeout();

    void write(C13342c cVar, long j) throws IOException;
}
