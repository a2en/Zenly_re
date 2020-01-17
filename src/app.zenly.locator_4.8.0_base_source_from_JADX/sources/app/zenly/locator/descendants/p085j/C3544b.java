package app.zenly.locator.descendants.p085j;

/* renamed from: app.zenly.locator.descendants.j.b */
public final class C3544b {

    /* renamed from: a */
    private int f9532a;

    /* renamed from: b */
    private int f9533b;

    /* renamed from: c */
    private int f9534c;

    public C3544b(int i, int i2, int i3) {
        this.f9532a = i;
        this.f9533b = i2;
        this.f9534c = i3;
    }

    /* renamed from: b */
    private final boolean m10746b(int i) {
        int i2 = this.f9534c;
        boolean z = (i2 == -1 || i2 == i) ? false : true;
        this.f9534c = i;
        return z;
    }

    /* renamed from: a */
    public final int mo10001a(int i) {
        if (m10746b(i)) {
            int i2 = this.f9533b;
            this.f9532a = i2;
            this.f9533b = i2 + 1;
            return i2;
        }
        int i3 = this.f9532a;
        this.f9533b++;
        return i3;
    }

    public /* synthetic */ C3544b(int i, int i2, int i3, int i4, C12928f fVar) {
        if ((i4 & 1) != 0) {
            i = 1;
        }
        if ((i4 & 2) != 0) {
            i2 = 1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        this(i, i2, i3);
    }
}
