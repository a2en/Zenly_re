package okhttp3;

import java.io.IOException;

/* renamed from: okhttp3.w */
public enum C13328w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: e */
    private final String f34565e;

    private C13328w(String str) {
        this.f34565e = str;
    }

    /* renamed from: a */
    public static C13328w m35246a(String str) throws IOException {
        if (str.equals(HTTP_1_0.f34565e)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f34565e)) {
            return HTTP_1_1;
        }
        if (str.equals(H2_PRIOR_KNOWLEDGE.f34565e)) {
            return H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals(HTTP_2.f34565e)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f34565e)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f34565e)) {
            return QUIC;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected protocol: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    public String toString() {
        return this.f34565e;
    }
}
