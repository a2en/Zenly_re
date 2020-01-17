package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.c0 */
final class C13064c0 implements Incomplete {

    /* renamed from: e */
    private final boolean f33644e;

    public C13064c0(boolean z) {
        this.f33644e = z;
    }

    public C13150u0 getList() {
        return null;
    }

    public boolean isActive() {
        return this.f33644e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
