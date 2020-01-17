package p389io.fabric.sdk.android.services.common;

/* renamed from: io.fabric.sdk.android.services.common.b */
class C12170b {

    /* renamed from: a */
    public final String f31649a;

    /* renamed from: b */
    public final boolean f31650b;

    C12170b(String str, boolean z) {
        this.f31649a = str;
        this.f31650b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12170b.class != obj.getClass()) {
            return false;
        }
        C12170b bVar = (C12170b) obj;
        if (this.f31650b != bVar.f31650b) {
            return false;
        }
        String str = this.f31649a;
        String str2 = bVar.f31649a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.f31649a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f31650b ? 1 : 0);
    }
}
