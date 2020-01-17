package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

public interface PushObserver {

    /* renamed from: a */
    public static final PushObserver f34143a = new C13255a();

    /* renamed from: okhttp3.internal.http2.PushObserver$a */
    class C13255a implements PushObserver {
        C13255a() {
        }

        public boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip((long) i2);
            return true;
        }

        public boolean onHeaders(int i, List<C13257b> list, boolean z) {
            return true;
        }

        public boolean onRequest(int i, List<C13257b> list) {
            return true;
        }

        public void onReset(int i, C13256a aVar) {
        }
    }

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<C13257b> list, boolean z);

    boolean onRequest(int i, List<C13257b> list);

    void onReset(int i, C13256a aVar);
}
