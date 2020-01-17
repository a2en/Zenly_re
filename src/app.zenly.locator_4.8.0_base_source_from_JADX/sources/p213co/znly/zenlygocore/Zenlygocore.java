package p213co.znly.zenlygocore;

import p386go.Seq;
import p386go.Seq.Proxy;

/* renamed from: co.znly.zenlygocore.Zenlygocore */
public abstract class Zenlygocore {

    /* renamed from: co.znly.zenlygocore.Zenlygocore$proxyRxProtoObserver */
    private static final class proxyRxProtoObserver implements Proxy, RxProtoObserver {
        private final int refnum;

        proxyRxProtoObserver(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native void completed();

        public native void error(Exception exc);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native void next(byte[] bArr);
    }

    static {
        Seq.touch();
        _init();
    }

    private Zenlygocore() {
    }

    private static native void _init();

    public static native void coreCleanState() throws Exception;

    public static native double daylightValue(long j, double d, double d2);

    public static native double daylightValueNow(double d, double d2);

    public static native Exception getErrInvalidLocale();

    public static native Exception getErrObserverHasUnsubscribed();

    public static native String mapboxKey();

    public static native Core newCore(String str, String str2, String str3, boolean z, boolean z2) throws Exception;

    public static native RxProtoObservable newRxProtoObservable();

    public static native String reportDump(String str) throws Exception;

    public static native void setErrInvalidLocale(Exception exc);

    public static native void setErrObserverHasUnsubscribed(Exception exc);

    public static void touch() {
    }

    public static native byte[] wgS84ToGCJ02(double d, double d2);
}
