package p333g.p369e.p372c.p374c.p375a.p376a;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g.e.c.c.a.a.a */
final class C12109a extends C12110b {

    /* renamed from: a */
    private final RecyclerView f31533a;

    /* renamed from: b */
    private final int f31534b;

    /* renamed from: c */
    private final int f31535c;

    C12109a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView != null) {
            this.f31533a = recyclerView;
            this.f31534b = i;
            this.f31535c = i2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    /* renamed from: a */
    public int mo35837a() {
        return this.f31534b;
    }

    /* renamed from: b */
    public int mo35838b() {
        return this.f31535c;
    }

    /* renamed from: c */
    public RecyclerView mo35839c() {
        return this.f31533a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12110b)) {
            return false;
        }
        C12110b bVar = (C12110b) obj;
        if (!(this.f31533a.equals(bVar.mo35839c()) && this.f31534b == bVar.mo35837a() && this.f31535c == bVar.mo35838b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.f31533a.hashCode() ^ 1000003) * 1000003) ^ this.f31534b) * 1000003) ^ this.f31535c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerViewScrollEvent{view=");
        sb.append(this.f31533a);
        sb.append(", dx=");
        sb.append(this.f31534b);
        sb.append(", dy=");
        sb.append(this.f31535c);
        sb.append("}");
        return sb.toString();
    }
}
