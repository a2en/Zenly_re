package p213co.znly.zenlygocore;

import java.util.Arrays;
import p386go.Seq;
import p386go.Seq.Proxy;

/* renamed from: co.znly.zenlygocore.RxGoProtoObserver */
public final class RxGoProtoObserver implements Proxy {
    private final int refnum;

    static {
        Zenlygocore.touch();
    }

    RxGoProtoObserver(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native void completed(Exception exc) throws Exception;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RxGoProtoObserver)) {
            return false;
        }
        RxGoProtoObserver rxGoProtoObserver = (RxGoProtoObserver) obj;
        RxProtoObserver rxProtoObserver = getRxProtoObserver();
        RxProtoObserver rxProtoObserver2 = rxGoProtoObserver.getRxProtoObserver();
        if (rxProtoObserver == null) {
            if (rxProtoObserver2 != null) {
                return false;
            }
        } else if (!rxProtoObserver.equals(rxProtoObserver2)) {
            return false;
        }
        return true;
    }

    public native void error(Exception exc) throws Exception;

    public final native RxProtoObserver getRxProtoObserver();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getRxProtoObserver()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setRxProtoObserver(RxProtoObserver rxProtoObserver);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxGoProtoObserver");
        sb.append("{");
        sb.append("RxProtoObserver:");
        sb.append(getRxProtoObserver());
        sb.append(",");
        sb.append("}");
        return sb.toString();
    }

    public RxGoProtoObserver() {
        this.refnum = __New();
        Seq.trackGoRef(this.refnum, this);
    }
}
