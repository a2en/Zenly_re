package retrofit2.p424l.p425a;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.JsonIOException;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import java.io.IOException;
import okhttp3.C13170b0;
import retrofit2.Converter;

/* renamed from: retrofit2.l.a.c */
final class C13441c<T> implements Converter<C13170b0, T> {

    /* renamed from: a */
    private final C11125d f34894a;

    /* renamed from: b */
    private final C11138i<T> f34895b;

    C13441c(C11125d dVar, C11138i<T> iVar) {
        this.f34894a = dVar;
        this.f34895b = iVar;
    }

    /* renamed from: a */
    public T convert(C13170b0 b0Var) throws IOException {
        C11262a a = this.f34894a.mo32450a(b0Var.mo37825c());
        try {
            T read = this.f34895b.read(a);
            if (a.peek() == C11264b.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            b0Var.close();
        }
    }
}
