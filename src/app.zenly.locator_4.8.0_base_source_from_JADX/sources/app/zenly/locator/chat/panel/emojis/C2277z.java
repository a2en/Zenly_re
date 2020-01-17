package app.zenly.locator.chat.panel.emojis;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.models.services.C8338v3;
import p213co.znly.models.services.C8355w3;
import p389io.reactivex.C12279e;

/* renamed from: app.zenly.locator.chat.panel.emojis.z */
public final class C2277z {

    /* renamed from: a */
    public static final C2277z f6935a = new C2277z();

    /* renamed from: app.zenly.locator.chat.panel.emojis.z$a */
    static final /* synthetic */ class C2278a extends C12931i implements Function1<C8338v3, List<? extends C2234d0>> {
        C2278a(C2277z zVar) {
            super(1, zVar);
        }

        /* renamed from: a */
        public final List<C2234d0> invoke(C8338v3 v3Var) {
            C12932j.m33818b(v3Var, "p1");
            return ((C2277z) this.f33505f).m8176a(v3Var);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2277z.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "toPacks(Lco/znly/models/services/ZenlyProto$PingManifestResponse;)Ljava/util/List;";
        }

        public final String getName() {
            return "toPacks";
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.z$b */
    static final /* synthetic */ class C2279b extends C12931i implements Function1<C8338v3, List<? extends C2234d0>> {
        C2279b(C2277z zVar) {
            super(1, zVar);
        }

        /* renamed from: a */
        public final List<C2234d0> invoke(C8338v3 v3Var) {
            C12932j.m33818b(v3Var, "p1");
            return ((C2277z) this.f33505f).m8176a(v3Var);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2277z.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "toPacks(Lco/znly/models/services/ZenlyProto$PingManifestResponse;)Ljava/util/List;";
        }

        public final String getName() {
            return "toPacks";
        }
    }

    private C2277z() {
    }

    /* renamed from: a */
    public static final C12279e<List<C2234d0>> m8173a() {
        C12279e<List<C2234d0>> i = C5448c.m15478a().pingManifestStream().mo36501i(new C2218a0(new C2278a(f6935a)));
        C12932j.m33815a((Object) i, "ZenlyCoreProvider.get().…stStream().map(::toPacks)");
        return i;
    }

    /* renamed from: a */
    public static final C12279e<List<C2234d0>> m8174a(String str) {
        C12932j.m33818b(str, "targetUuid");
        C12279e<List<C2234d0>> i = C5448c.m15478a().pingManifestStreamForTarget(str).mo36501i(new C2218a0(new C2279b(f6935a)));
        C12932j.m33815a((Object) i, "ZenlyCoreProvider.get().…argetUuid).map(::toPacks)");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C2234d0> m8176a(C8338v3 v3Var) {
        List<C8355w3> packsList = v3Var.getPacksList();
        C12932j.m33815a((Object) packsList, "response.packsList");
        ArrayList arrayList = new ArrayList(C12850p.m33647a(packsList, 10));
        for (C8355w3 w3Var : packsList) {
            C12932j.m33815a((Object) w3Var, "pingPack");
            int minFriendsCount = w3Var.getMinFriendsCount();
            String rootUrl = v3Var.getRootUrl();
            C12932j.m33815a((Object) rootUrl, "response.rootUrl");
            arrayList.add(new C2234d0(w3Var, minFriendsCount, rootUrl));
        }
        return arrayList;
    }
}
