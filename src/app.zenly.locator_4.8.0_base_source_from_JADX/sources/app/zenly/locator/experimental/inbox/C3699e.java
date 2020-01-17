package app.zenly.locator.experimental.inbox;

import app.zenly.locator.core.store.SuggestedStore;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.experimental.inbox.p093j.C3711b;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.experimental.inbox.e */
public final class C3699e {

    /* renamed from: a */
    private final ContactAlreadyOnZenlyStore f9924a;

    /* renamed from: b */
    private final SuggestedStore f9925b;

    /* renamed from: c */
    private final C3695c f9926c;

    /* renamed from: app.zenly.locator.experimental.inbox.e$a */
    public static final class C3700a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C3699e f9927a;

        public C3700a(C3699e eVar) {
            this.f9927a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
            if (r1.getPrivateMode() == true) goto L_0x0080;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r5, T2 r6, T3 r7) {
            /*
                r4 = this;
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.List r6 = (java.util.List) r6
                java.util.List r5 = (java.util.List) r5
                app.zenly.locator.experimental.inbox.e r0 = r4.f9927a
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r3 = kotlin.collections.C12850p.m33647a(r5, r2)
                r1.<init>(r3)
                java.util.Iterator r5 = r5.iterator()
            L_0x0017:
                boolean r3 = r5.hasNext()
                if (r3 == 0) goto L_0x002b
                java.lang.Object r3 = r5.next()
                app.zenly.locator.core.store.api.a r3 = (app.zenly.locator.core.store.api.C2935a) r3
                app.zenly.locator.experimental.inbox.j.b r3 = r0.m11074a(r3)
                r1.add(r3)
                goto L_0x0017
            L_0x002b:
                app.zenly.locator.experimental.inbox.e r5 = r4.f9927a
                java.util.ArrayList r0 = new java.util.ArrayList
                int r2 = kotlin.collections.C12850p.m33647a(r6, r2)
                r0.<init>(r2)
                java.util.Iterator r6 = r6.iterator()
            L_0x003a:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x004e
                java.lang.Object r2 = r6.next()
                co.znly.models.p r2 = (p213co.znly.models.C7434p) r2
                app.zenly.locator.experimental.inbox.j.b r2 = r5.m11077a(r2)
                r0.add(r2)
                goto L_0x003a
            L_0x004e:
                java.util.List r5 = kotlin.collections.C12857w.m33670b(r1, r0)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x005b:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0087
                java.lang.Object r0 = r5.next()
                r1 = r0
                app.zenly.locator.experimental.inbox.j.b r1 = (app.zenly.locator.experimental.inbox.p093j.C3711b) r1
                java.lang.String r2 = r1.mo10240d()
                boolean r2 = r7.contains(r2)
                r3 = 1
                if (r2 != 0) goto L_0x0080
                co.znly.models.UserProto$User r1 = r1.mo10241e()
                if (r1 == 0) goto L_0x0081
                boolean r1 = r1.getPrivateMode()
                if (r1 == r3) goto L_0x0080
                goto L_0x0081
            L_0x0080:
                r3 = 0
            L_0x0081:
                if (r3 == 0) goto L_0x005b
                r6.add(r0)
                goto L_0x005b
            L_0x0087:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.experimental.inbox.C3699e.C3700a.apply(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C3699e(ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, SuggestedStore suggestedStore, C3695c cVar) {
        C12932j.m33818b(contactAlreadyOnZenlyStore, "alreadyOnZenlyStore");
        C12932j.m33818b(suggestedStore, "suggestedStore");
        C12932j.m33818b(cVar, "suggestedFriendPreferences");
        this.f9924a = contactAlreadyOnZenlyStore;
        this.f9925b = suggestedStore;
        this.f9926c = cVar;
    }

    /* renamed from: a */
    public final C12279e<List<C3711b>> mo10230a() {
        C12774b bVar = C12774b.f33320a;
        C12279e<List<C3711b>> a = C12279e.m32609a((ObservableSource<? extends T1>) this.f9924a.contactsAlreadyOnZenly(), (ObservableSource<? extends T2>) SuggestedStore.m9424a(), (ObservableSource<? extends T3>) this.f9926c.mo10224a(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3700a<Object,Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…e\n            }\n        }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3711b m11074a(C2935a aVar) {
        return new C3711b(aVar.mo9070b().getFriendsCount(), aVar.mo9070b(), null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3711b m11077a(C7434p pVar) {
        int i;
        UserProto$User user = pVar.getUser();
        String str = "suggestedUser.user";
        C12932j.m33815a((Object) user, str);
        String uuid = user.getUuid();
        C12932j.m33815a((Object) uuid, "suggestedUser.user.uuid");
        boolean z = !C13028q.m34000a(uuid);
        if (z) {
            UserProto$User user2 = pVar.getUser();
            C12932j.m33815a((Object) user2, str);
            i = user2.getFriendsCount();
        } else {
            i = 0;
        }
        C7339i iVar = null;
        UserProto$User user3 = z ? pVar.getUser() : null;
        C7339i contact = pVar.getContact();
        C12932j.m33815a((Object) contact, "suggestedUser.contact");
        String deviceContactId = contact.getDeviceContactId();
        C12932j.m33815a((Object) deviceContactId, "suggestedUser.contact.deviceContactId");
        if (!C13028q.m34000a(deviceContactId)) {
            iVar = pVar.getContact();
        }
        return new C3711b(i, user3, iVar);
    }

    /* renamed from: a */
    public final void mo10231a(String str) {
        C12932j.m33818b(str, "id");
        this.f9926c.mo10225a(str);
    }
}
