package p213co.znly.zenlygocore;

import java.util.Arrays;
import p386go.Seq;
import p386go.Seq.Proxy;

/* renamed from: co.znly.zenlygocore.RxContext */
public final class RxContext implements Proxy {
    private final int refnum;

    static {
        Zenlygocore.touch();
    }

    RxContext(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native void cancel();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RxContext)) {
            return false;
        }
        RxContext rxContext = (RxContext) obj;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxContext");
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    public RxContext() {
        this.refnum = __New();
        Seq.trackGoRef(this.refnum, this);
    }
}
