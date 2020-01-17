package app.zenly.android.feature.descendants.recycler;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.recycler.a */
public final class C1406a<T> {

    /* renamed from: a */
    private final String f5070a;

    /* renamed from: b */
    private final int f5071b;

    /* renamed from: c */
    private final T f5072c;

    public C1406a(String str, int i, T t) {
        C12932j.m33818b(str, "id");
        this.f5070a = str;
        this.f5071b = i;
        this.f5072c = t;
    }

    /* renamed from: a */
    public final T mo6668a() {
        return this.f5072c;
    }

    /* renamed from: b */
    public final String mo6669b() {
        return this.f5070a;
    }

    /* renamed from: c */
    public final int mo6670c() {
        return this.f5071b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1406a) {
                C1406a aVar = (C1406a) obj;
                if (C12932j.m33817a((Object) this.f5070a, (Object) aVar.f5070a)) {
                    if (!(this.f5071b == aVar.f5071b) || !C12932j.m33817a((Object) this.f5072c, (Object) aVar.f5072c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f5070a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f5071b) * 31;
        T t = this.f5072c;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemModel(id=");
        sb.append(this.f5070a);
        sb.append(", type=");
        sb.append(this.f5071b);
        sb.append(", data=");
        sb.append(this.f5072c);
        sb.append(")");
        return sb.toString();
    }
}
