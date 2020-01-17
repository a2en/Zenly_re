package app.zenly.locator.p143s.p144i;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.i.c */
public final class C5427c {

    /* renamed from: a */
    private final Map<String, Object> f13980a = new LinkedHashMap();

    /* renamed from: a */
    public final Map<String, Object> mo12999a() {
        return this.f13980a;
    }

    /* renamed from: b */
    public final C5427c mo13000b(String str, Object obj) {
        C12932j.m33818b(str, "key");
        if (obj != null) {
            mo12998a(str, obj);
        }
        return this;
    }

    /* renamed from: a */
    public final C5427c mo12998a(String str, Object obj) {
        C12932j.m33818b(str, "key");
        this.f13980a.put(str, obj);
        return this;
    }
}
