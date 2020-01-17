package app.zenly.locator.inbox.p101m;

import android.view.View;
import app.zenly.locator.inbox.C3846k;
import app.zenly.locator.inbox.C3846k.C3847a;
import app.zenly.locator.inbox.C3846k.C3848b;
import app.zenly.locator.inbox.p103o.C3884a;
import app.zenly.locator.inbox.p103o.C3886c;
import app.zenly.locator.inbox.p103o.C3887d;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7370k;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7168n;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.inbox.m.c */
public final class C3867c extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f10263f = new C12119a();

    /* renamed from: g */
    private final C12279e<String> f10264g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3846k f10265h;

    /* renamed from: app.zenly.locator.inbox.m.c$a */
    static final class C3868a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3867c f10266e;

        /* renamed from: app.zenly.locator.inbox.m.c$a$a */
        public static final class C3869a<T1, T2, R> implements BiFunction<T1, T2, R> {

            /* renamed from: a */
            final /* synthetic */ C3868a f10267a;

            public C3869a(C3868a aVar) {
                this.f10267a = aVar;
            }

            public final R apply(T1 t1, T2 t2) {
                String str;
                List list = (List) t2;
                List list2 = (List) t1;
                C12932j.m33815a((Object) list, "conversations");
                ArrayList<C7117i> arrayList = new ArrayList<>();
                Iterator it = list.iterator();
                while (true) {
                    str = "it";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    C7117i iVar = (C7117i) next;
                    C12932j.m33815a((Object) iVar, str);
                    if (!iVar.getHidden()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
                for (C7117i iVar2 : arrayList) {
                    C12932j.m33815a((Object) iVar2, str);
                    arrayList2.add(new C3884a(iVar2, this.f10267a.f10266e.f10263f.mo35844a(iVar2.getInboxUuid())));
                }
                C12932j.m33815a((Object) list2, "aoz");
                ArrayList<C7370k> arrayList3 = new ArrayList<>();
                for (Object next2 : list2) {
                    C7370k kVar = (C7370k) next2;
                    C3867c cVar = this.f10267a.f10266e;
                    C12932j.m33815a((Object) kVar, str);
                    UserProto$User user = kVar.getUser();
                    C12932j.m33815a((Object) user, "it.user");
                    if (cVar.m11401a(user, list)) {
                        arrayList3.add(next2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C12850p.m33647a(arrayList3, 10));
                for (C7370k kVar2 : arrayList3) {
                    C12932j.m33815a((Object) kVar2, "user");
                    UserProto$User user2 = kVar2.getUser();
                    C7339i contact = kVar2.getContact();
                    C12932j.m33815a((Object) contact, "user.contact");
                    C12119a a = this.f10267a.f10266e.f10263f;
                    UserProto$User user3 = kVar2.getUser();
                    C12932j.m33815a((Object) user3, "user.user");
                    arrayList4.add(new C3887d(user2, contact, a.mo35844a(user3.getUuid())));
                }
                return C11751f.m30863b(C12857w.m33670b((Collection) arrayList2, (Iterable) arrayList4));
            }
        }

        /* renamed from: app.zenly.locator.inbox.m.c$a$b */
        static final class C3870b<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C3870b f10268e = new C3870b();

            C3870b() {
            }

            /* renamed from: a */
            public final List<C7370k> apply(C3847a aVar) {
                C12932j.m33818b(aVar, "it");
                return aVar.mo10445a().getAlreadyList();
            }
        }

        /* renamed from: app.zenly.locator.inbox.m.c$a$c */
        static final class C3871c<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C3871c f10269e = new C3871c();

            C3871c() {
            }

            /* renamed from: a */
            public final List<C7117i> apply(C3848b bVar) {
                C12932j.m33818b(bVar, "it");
                C7168n conversations = bVar.mo10446a().getConversations();
                C12932j.m33815a((Object) conversations, "it.objects.conversations");
                return conversations.getConversationsList();
            }
        }

        C3868a(C3867c cVar) {
            this.f10266e = cVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(String str) {
            C12932j.m33818b(str, "query");
            C12774b bVar = C12774b.f33320a;
            C12279e i = this.f10266e.f10265h.mo10443a(str).mo36501i(C3870b.f10268e);
            C12932j.m33815a((Object) i, "searchViewModel.searchAl… it.objects.alreadyList }");
            C12279e i2 = this.f10266e.f10265h.mo10444b(str).mo36501i(C3871c.f10269e);
            C12932j.m33815a((Object) i2, "searchViewModel.searchCo…tions.conversationsList }");
            C12279e a = C12279e.m32610a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) i2, (BiFunction<? super T1, ? super T2, ? extends R>) new C3869a<Object,Object,Object>(this));
            C3886c cVar = C3886c.f10296f;
            if (cVar != null) {
                return a.mo36485d(C11751f.m30861a(cVar));
            }
            throw new TypeCastException("null cannot be cast to non-null type com.snap.ui.recycling.viewmodel.AdapterViewModel");
        }
    }

    public C3867c(C12279e<String> eVar, C3846k kVar) {
        C12932j.m33818b(eVar, "searchObservable");
        C12932j.m33818b(kVar, "searchViewModel");
        this.f10264g = eVar;
        this.f10265h = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> m = this.f10264g.mo36427a(this.f10265h.mo10442a()).mo36509m(new C3868a(this));
        C12932j.m33815a((Object) m, "searchObservable\n       …ViewModel))\n            }");
        return m;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m11401a(p213co.znly.models.UserProto$User r5, java.util.List<p213co.znly.models.core.C7117i> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000d
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x000d
            goto L_0x0046
        L_0x000d:
            java.util.Iterator r6 = r6.iterator()
        L_0x0011:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r6.next()
            co.znly.models.core.i r0 = (p213co.znly.models.core.C7117i) r0
            int r3 = r0.getOthersCount()
            if (r3 != r2) goto L_0x0042
            java.util.List r0 = r0.getOthersList()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r3 = "it.othersList[0]"
            kotlin.jvm.internal.C12932j.m33815a(r0, r3)
            co.znly.models.PingProto$Conversation$b r0 = (p213co.znly.models.PingProto$Conversation.C6818b) r0
            java.lang.String r0 = r0.getUserUuid()
            java.lang.String r3 = r5.getUuid()
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x0011
            r2 = 0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.inbox.p101m.C3867c.m11401a(co.znly.models.UserProto$User, java.util.List):boolean");
    }
}
