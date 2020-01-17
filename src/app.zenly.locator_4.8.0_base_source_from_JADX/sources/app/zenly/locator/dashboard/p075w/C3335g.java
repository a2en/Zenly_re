package app.zenly.locator.dashboard.p075w;

import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2949h;
import app.zenly.locator.core.store.api.C2956k0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.C7339i;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.dashboard.w.g */
public final class C3335g {

    /* renamed from: g */
    static final /* synthetic */ KProperty[] f9268g;

    /* renamed from: a */
    private final Lazy f9269a = C12896f.m33751a(new C3336a(this));

    /* renamed from: b */
    private final Map<String, C2936a0> f9270b;

    /* renamed from: c */
    private final C3326a f9271c;

    /* renamed from: d */
    private final List<C2956k0> f9272d;

    /* renamed from: e */
    private final Map<String, C2935a> f9273e;

    /* renamed from: f */
    private final Map<String, C2949h> f9274f;

    /* renamed from: app.zenly.locator.dashboard.w.g$a */
    static final class C3336a extends C12933k implements Function0<Map<String, ? extends C2936a0>> {

        /* renamed from: f */
        final /* synthetic */ C3335g f9275f;

        C3336a(C3335g gVar) {
            this.f9275f = gVar;
            super(0);
        }

        public final Map<String, C2936a0> invoke() {
            Collection values = this.f9275f.mo9850a().values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(values, 10)), 16));
            for (Object next : values) {
                linkedHashMap.put(((C2936a0) next).mo9074a().getPhoneNumber(), next);
            }
            return linkedHashMap;
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3335g.class), "friendsByPhone", "getFriendsByPhone()Ljava/util/Map;");
        C12946x.m33839a((C12940r) sVar);
        f9268g = new KProperty[]{sVar};
    }

    public C3335g(Map<String, C2936a0> map, C3326a aVar, List<C2956k0> list, Map<String, C2935a> map2, Map<String, C2949h> map3) {
        C12932j.m33818b(map, "friends");
        C12932j.m33818b(aVar, "contactInvites");
        C12932j.m33818b(list, "requests");
        C12932j.m33818b(map2, "aoz");
        C12932j.m33818b(map3, "soon");
        this.f9270b = map;
        this.f9271c = aVar;
        this.f9272d = list;
        this.f9273e = map2;
        this.f9274f = map3;
    }

    /* renamed from: b */
    private final Map<String, C2936a0> m10517b() {
        Lazy lazy = this.f9269a;
        KProperty kProperty = f9268g[0];
        return (Map) lazy.getValue();
    }

    /* renamed from: a */
    public final Map<String, C2936a0> mo9850a() {
        return this.f9270b;
    }

    /* renamed from: b */
    public final boolean mo9853b(UserProto$User userProto$User) {
        boolean z;
        C12932j.m33818b(userProto$User, "user");
        List<C2956k0> list = this.f9272d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C2956k0 k0Var : list) {
            if (!C12932j.m33817a((Object) k0Var.mo9122b().getTargetUuid(), (Object) userProto$User.getUuid()) || k0Var.mo9122b().getStatus() != C6812c.pending) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo9854c(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        return m10517b().containsKey(iVar.getPhoneNumbersList().get(0));
    }

    /* renamed from: d */
    public final UserProto$User mo9855d(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C2935a aVar = (C2935a) this.f9273e.get(iVar.getDeviceContactId());
        if (aVar != null) {
            return aVar.mo9070b();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo9851a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        return this.f9270b.containsKey(userProto$User.getUuid());
    }

    /* renamed from: a */
    public final C3341i mo9849a(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        return this.f9271c.mo9831a(iVar);
    }

    /* renamed from: b */
    public final int mo9852b(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C2949h hVar = (C2949h) this.f9274f.get(iVar.getDeviceContactId());
        if (hVar != null) {
            return hVar.mo9105b();
        }
        return 0;
    }
}
