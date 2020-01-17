package okhttp3;

import java.util.Collections;
import java.util.List;

public interface CookieJar {

    /* renamed from: a */
    public static final CookieJar f33787a = new C13164a();

    /* renamed from: okhttp3.CookieJar$a */
    class C13164a implements CookieJar {
        C13164a() {
        }

        public List<C13311m> loadForRequest(C13319s sVar) {
            return Collections.emptyList();
        }

        public void saveFromResponse(C13319s sVar, List<C13311m> list) {
        }
    }

    List<C13311m> loadForRequest(C13319s sVar);

    void saveFromResponse(C13319s sVar, List<C13311m> list);
}
