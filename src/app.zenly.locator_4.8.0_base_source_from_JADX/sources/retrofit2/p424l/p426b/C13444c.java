package retrofit2.p424l.p426b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.C13170b0;
import retrofit2.Converter;

/* renamed from: retrofit2.l.b.c */
final class C13444c<T extends Message<T, ?>> implements Converter<C13170b0, T> {

    /* renamed from: a */
    private final ProtoAdapter<T> f34898a;

    C13444c(ProtoAdapter<T> protoAdapter) {
        this.f34898a = protoAdapter;
    }

    /* renamed from: a */
    public T convert(C13170b0 b0Var) throws IOException {
        try {
            return (Message) this.f34898a.decode(b0Var.mo37829f());
        } finally {
            b0Var.close();
        }
    }
}
