package app.zenly.locator.dashboard.p075w;

import app.zenly.locator.dashboard.p075w.C3342j.C3343a;
import app.zenly.locator.dashboard.p075w.C3342j.C3344b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7138k2;
import p213co.znly.models.core.C7146l2;
import p213co.znly.models.core.C7146l2.C7147a;
import p213co.znly.models.core.C7146l2.C7148b;
import p213co.znly.models.core.C7161m2;
import p213co.znly.models.core.C7161m2.C7162a;
import p213co.znly.models.core.StatesProto$RecentsState;
import p213co.znly.models.core.StatesProto$RecentsState.C7033b;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.BiFunction;

/* renamed from: app.zenly.locator.dashboard.w.e */
public final class C3331e {

    /* renamed from: a */
    private final ZenlyCore f9264a;

    /* renamed from: app.zenly.locator.dashboard.w.e$a */
    static final class C3332a<T1, T2, R> implements BiFunction<R, T, R> {

        /* renamed from: a */
        public static final C3332a f9265a = new C3332a();

        C3332a() {
        }

        /* renamed from: a */
        public final List<C3342j> apply(List<? extends C3342j> list, StatesProto$RecentsState statesProto$RecentsState) {
            Object obj;
            C12932j.m33818b(list, "list");
            C12932j.m33818b(statesProto$RecentsState, "state");
            if (!statesProto$RecentsState.hasState()) {
                return list;
            }
            C7033b state = statesProto$RecentsState.getState();
            C12932j.m33815a((Object) state, "state.state");
            List<C7138k2> stateList = state.getStateList();
            C12932j.m33815a((Object) stateList, "state.state.stateList");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
            for (C7138k2 k2Var : stateList) {
                String str = "it";
                if (k2Var.hasContact()) {
                    C12932j.m33815a((Object) k2Var, str);
                    C7339i contact = k2Var.getContact();
                    C12932j.m33815a((Object) contact, "it.contact");
                    obj = new C3343a(contact);
                } else {
                    C12932j.m33815a((Object) k2Var, str);
                    UserProto$User user = k2Var.getUser();
                    C12932j.m33815a((Object) user, "it.user");
                    obj = new C3344b(user);
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
    }

    public C3331e(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9264a = zenlyCore;
    }

    /* renamed from: a */
    public final C12279e<List<C3342j>> mo9837a() {
        C12279e<List<C3342j>> a = this.f9264a.recentlySearchedStateStream().mo36441a(C12848o.m33640a(), (BiFunction<R, ? super T, R>) C3332a.f9265a);
        C12932j.m33815a((Object) a, "core.recentlySearchedSta…t\n            }\n        }");
        return a;
    }

    /* renamed from: b */
    public final void mo9840b(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C7147a newBuilder = C7146l2.newBuilder();
        C7162a newBuilder2 = C7161m2.newBuilder();
        newBuilder2.mo19144a(iVar.getDeviceContactId());
        newBuilder.mo19127a(newBuilder2);
        newBuilder.mo19126a(C7148b.RECENTLY_SEARCHED);
        newBuilder.mo19128a(C7280e.CRUD_OP_DELETE);
        this.f9264a.recentItemInteract((C7146l2) newBuilder.build());
    }

    /* renamed from: a */
    public final void mo9838a(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C7147a newBuilder = C7146l2.newBuilder();
        C7162a newBuilder2 = C7161m2.newBuilder();
        newBuilder2.mo19144a(iVar.getDeviceContactId());
        newBuilder.mo19127a(newBuilder2);
        newBuilder.mo19126a(C7148b.RECENTLY_SEARCHED);
        newBuilder.mo19128a(C7280e.CRUD_OP_CREATE);
        this.f9264a.recentItemInteract((C7146l2) newBuilder.build());
    }

    /* renamed from: b */
    public final void mo9841b(String str) {
        C12932j.m33818b(str, "userUuid");
        C7147a newBuilder = C7146l2.newBuilder();
        C7162a newBuilder2 = C7161m2.newBuilder();
        newBuilder2.mo19145b(str);
        newBuilder.mo19127a(newBuilder2);
        newBuilder.mo19126a(C7148b.RECENTLY_SEARCHED);
        newBuilder.mo19128a(C7280e.CRUD_OP_DELETE);
        this.f9264a.recentItemInteract((C7146l2) newBuilder.build());
    }

    /* renamed from: a */
    public final void mo9839a(String str) {
        C12932j.m33818b(str, "userUuid");
        C7147a newBuilder = C7146l2.newBuilder();
        C7162a newBuilder2 = C7161m2.newBuilder();
        newBuilder2.mo19145b(str);
        newBuilder.mo19127a(newBuilder2);
        newBuilder.mo19126a(C7148b.RECENTLY_SEARCHED);
        newBuilder.mo19128a(C7280e.CRUD_OP_CREATE);
        this.f9264a.recentItemInteract((C7146l2) newBuilder.build());
    }
}
