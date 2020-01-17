package retrofit2.p424l.p425a;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import okhttp3.C13321t;
import okhttp3.C13333z;
import okio.C13342c;
import retrofit2.Converter;

/* renamed from: retrofit2.l.a.b */
final class C13440b<T> implements Converter<T, C13333z> {

    /* renamed from: c */
    private static final C13321t f34890c = C13321t.m35172b("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f34891d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C11125d f34892a;

    /* renamed from: b */
    private final C11138i<T> f34893b;

    C13440b(C11125d dVar, C11138i<T> iVar) {
        this.f34892a = dVar;
        this.f34893b = iVar;
    }

    public C13333z convert(T t) throws IOException {
        C13342c cVar = new C13342c();
        C11265c a = this.f34892a.mo32451a((Writer) new OutputStreamWriter(cVar.outputStream(), f34891d));
        this.f34893b.write(a, t);
        a.close();
        return C13333z.m35282a(f34890c, cVar.readByteString());
    }
}
