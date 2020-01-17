package app.zenly.locator.chat.panel.emojis.p057f0;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.panel.emojis.f0.b */
public final class C2240b {

    /* renamed from: a */
    private final C2238a f6853a;

    /* renamed from: b */
    private final int f6854b;

    /* renamed from: c */
    private final int f6855c;

    public C2240b(C2238a aVar, int i, int i2) {
        C12932j.m33818b(aVar, "emoji");
        this.f6853a = aVar;
        this.f6854b = i;
        this.f6855c = i2;
    }

    /* renamed from: a */
    public final int mo8103a() {
        return this.f6855c;
    }

    /* renamed from: b */
    public final C2238a mo8104b() {
        return this.f6853a;
    }

    /* renamed from: c */
    public final int mo8105c() {
        return this.f6854b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2240b) {
                C2240b bVar = (C2240b) obj;
                if (C12932j.m33817a((Object) this.f6853a, (Object) bVar.f6853a)) {
                    if (this.f6854b == bVar.f6854b) {
                        if (this.f6855c == bVar.f6855c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C2238a aVar = this.f6853a;
        return ((((aVar != null ? aVar.hashCode() : 0) * 31) + Integer.valueOf(this.f6854b).hashCode()) * 31) + Integer.valueOf(this.f6855c).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmojiBulk(emoji=");
        sb.append(this.f6853a);
        sb.append(", position=");
        sb.append(this.f6854b);
        sb.append(", count=");
        sb.append(this.f6855c);
        sb.append(")");
        return sb.toString();
    }
}
