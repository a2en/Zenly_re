package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.C12821c0;

/* renamed from: kotlin.ranges.g */
public final class C12967g extends C12821c0 {

    /* renamed from: e */
    private final long f33561e;

    /* renamed from: f */
    private boolean f33562f;

    /* renamed from: g */
    private long f33563g;

    /* renamed from: h */
    private final long f33564h;

    public C12967g(long j, long j2, long j3) {
        this.f33564h = j3;
        this.f33561e = j2;
        boolean z = true;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (this.f33564h <= 0 ? i < 0 : i > 0) {
            z = false;
        }
        this.f33562f = z;
        if (!this.f33562f) {
            j = this.f33561e;
        }
        this.f33563g = j;
    }

    /* renamed from: a */
    public long mo37040a() {
        long j = this.f33563g;
        if (j != this.f33561e) {
            this.f33563g = this.f33564h + j;
        } else if (this.f33562f) {
            this.f33562f = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public boolean hasNext() {
        return this.f33562f;
    }
}
