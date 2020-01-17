package zendesk.support;

import com.google.gson.C11125d;
import com.zendesk.logger.Logger;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13354l;
import okio.Sink;
import okio.Source;

public class Streams {

    public interface Use<R, P extends Closeable> {
        R use(P p) throws Exception;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void toJson(final C11125d dVar, Sink sink, final Object obj) {
        use(toWriter(sink), new Use<Void, Writer>() {
            public Void use(Writer writer) throws Exception {
                dVar.mo32464a(obj, (Appendable) writer);
                return null;
            }
        });
    }

    public static Reader toReader(Source source) {
        if (source instanceof BufferedSource) {
            return new InputStreamReader(((BufferedSource) source).inputStream());
        }
        return new InputStreamReader(C13354l.m35375a(source).inputStream());
    }

    public static Writer toWriter(Sink sink) {
        if (sink instanceof BufferedSink) {
            return new OutputStreamWriter(((BufferedSink) sink).outputStream());
        }
        return new OutputStreamWriter(C13354l.m35374a(sink).outputStream());
    }

    public static <R, P extends Closeable> R use(P p, Use<R, P> use) {
        if (p == null) {
            return null;
        }
        try {
            return use.use(p);
        } catch (Exception e) {
            Logger.m31609b("Streams", "Error using stream", e, new Object[0]);
            return null;
        } finally {
            closeQuietly(p);
        }
    }
}
