package p213co.znly.core.location;

/* renamed from: co.znly.core.location.a */
/* compiled from: lambda */
public final /* synthetic */ class C6531a implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ AndroidLocationManager f16113e;

    /* renamed from: f */
    private final /* synthetic */ String f16114f;

    /* renamed from: g */
    private final /* synthetic */ long f16115g;

    /* renamed from: h */
    private final /* synthetic */ float f16116h;

    public /* synthetic */ C6531a(AndroidLocationManager androidLocationManager, String str, long j, float f) {
        this.f16113e = androidLocationManager;
        this.f16114f = str;
        this.f16115g = j;
        this.f16116h = f;
    }

    public final void run() {
        this.f16113e.mo14688a(this.f16114f, this.f16115g, this.f16116h);
    }
}
