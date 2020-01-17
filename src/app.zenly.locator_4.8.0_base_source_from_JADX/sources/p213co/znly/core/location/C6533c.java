package p213co.znly.core.location;

import com.google.android.gms.location.LocationRequest;

/* renamed from: co.znly.core.location.c */
/* compiled from: lambda */
public final /* synthetic */ class C6533c implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ GooglePlayLocationManager f16118e;

    /* renamed from: f */
    private final /* synthetic */ LocationRequest f16119f;

    public /* synthetic */ C6533c(GooglePlayLocationManager googlePlayLocationManager, LocationRequest locationRequest) {
        this.f16118e = googlePlayLocationManager;
        this.f16119f = locationRequest;
    }

    public final void run() {
        this.f16118e.mo14697a(this.f16119f);
    }
}
