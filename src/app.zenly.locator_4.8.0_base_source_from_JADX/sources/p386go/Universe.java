package p386go;

import p386go.Seq.Proxy;

/* renamed from: go.Universe */
public abstract class Universe {

    /* renamed from: go.Universe$proxyerror */
    private static final class proxyerror extends Exception implements Proxy, error {
        private final int refnum;

        proxyerror(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native String error();

        public String getMessage() {
            return error();
        }

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    static {
        Seq.touch();
        _init();
    }

    private Universe() {
    }

    private static native void _init();

    public static void touch() {
    }
}
