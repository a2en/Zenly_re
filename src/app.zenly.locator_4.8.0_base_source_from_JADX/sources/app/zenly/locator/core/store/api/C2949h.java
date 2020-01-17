package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.core.store.api.h */
public final class C2949h {

    /* renamed from: a */
    private final C7339i f8335a;

    /* renamed from: b */
    private final int f8336b;

    public C2949h(C7339i iVar, int i) {
        C12932j.m33818b(iVar, "contact");
        this.f8335a = iVar;
        this.f8336b = i;
    }

    /* renamed from: a */
    public final C7339i mo9104a() {
        return this.f8335a;
    }

    /* renamed from: b */
    public final int mo9105b() {
        return this.f8336b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2949h) {
                C2949h hVar = (C2949h) obj;
                if (C12932j.m33817a((Object) this.f8335a, (Object) hVar.f8335a)) {
                    if (this.f8336b == hVar.f8336b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C7339i iVar = this.f8335a;
        return ((iVar != null ? iVar.hashCode() : 0) * 31) + Integer.valueOf(this.f8336b).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactSoonOnZenly(contact=");
        sb.append(this.f8335a);
        sb.append(", potentialFriendsCount=");
        sb.append(this.f8336b);
        sb.append(")");
        return sb.toString();
    }
}
