package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.C12819b0;

/* renamed from: kotlin.ranges.d */
public final class C12962d extends C12819b0 {

    /* renamed from: e */
    private final int f33552e;

    /* renamed from: f */
    private boolean f33553f;

    /* renamed from: g */
    private int f33554g;

    /* renamed from: h */
    private final int f33555h;

    public C12962d(int i, int i2, int i3) {
        this.f33555h = i3;
        this.f33552e = i2;
        boolean z = true;
        if (this.f33555h <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f33553f = z;
        if (!this.f33553f) {
            i = this.f33552e;
        }
        this.f33554g = i;
    }

    /* renamed from: a */
    public int mo37031a() {
        int i = this.f33554g;
        if (i != this.f33552e) {
            this.f33554g = this.f33555h + i;
        } else if (this.f33553f) {
            this.f33553f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f33553f;
    }
}
