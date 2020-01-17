package okhttp3.internal.http2;

/* renamed from: okhttp3.internal.http2.a */
public enum C13256a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: e */
    public final int f34157e;

    private C13256a(int i) {
        this.f34157e = i;
    }

    /* renamed from: a */
    public static C13256a m34818a(int i) {
        C13256a[] values;
        for (C13256a aVar : values()) {
            if (aVar.f34157e == i) {
                return aVar;
            }
        }
        return null;
    }
}
