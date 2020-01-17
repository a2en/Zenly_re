package p213co.znly.zenlygocore;

import java.util.Arrays;
import p386go.Seq;
import p386go.Seq.Proxy;

/* renamed from: co.znly.zenlygocore.RxProtoObservable */
public final class RxProtoObservable implements Proxy {
    private final int refnum;

    static {
        Zenlygocore.touch();
    }

    public RxProtoObservable() {
        this.refnum = __NewRxProtoObservable();
        Seq.trackGoRef(this.refnum, this);
    }

    private static native int __NewRxProtoObservable();

    public native void complete();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RxProtoObservable)) {
            return false;
        }
        if (getDummy() != ((RxProtoObservable) obj).getDummy()) {
            return false;
        }
        return true;
    }

    public final native boolean getDummy();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(getDummy())});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setDummy(boolean z);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxProtoObservable");
        sb.append("{");
        sb.append("Dummy:");
        sb.append(getDummy());
        sb.append(",");
        sb.append("}");
        return sb.toString();
    }

    public native void writeError(Exception exc);

    public native void writeNext(byte[] bArr);

    RxProtoObservable(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
