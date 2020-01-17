package retrofit2.p424l.p426b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.C13321t;
import okhttp3.C13333z;
import okio.BufferedSink;
import okio.C13342c;
import retrofit2.Converter;

/* renamed from: retrofit2.l.b.b */
final class C13443b<T extends Message<T, ?>> implements Converter<T, C13333z> {

    /* renamed from: b */
    private static final C13321t f34896b = C13321t.m35172b("application/x-protobuf");

    /* renamed from: a */
    private final ProtoAdapter<T> f34897a;

    C13443b(ProtoAdapter<T> protoAdapter) {
        this.f34897a = protoAdapter;
    }

    /* renamed from: a */
    public C13333z convert(T t) throws IOException {
        C13342c cVar = new C13342c();
        this.f34897a.encode((BufferedSink) cVar, t);
        return C13333z.m35282a(f34896b, cVar.mo38491c());
    }
}
