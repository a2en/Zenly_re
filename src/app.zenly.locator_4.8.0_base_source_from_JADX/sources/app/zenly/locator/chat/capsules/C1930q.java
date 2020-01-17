package app.zenly.locator.chat.capsules;

import app.zenly.locator.chat.C1956d5;
import app.zenly.locator.chat.p059r5.C2309e;
import app.zenly.locator.p143s.p148l.C5447b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.core.ChatProto$ChatActivities;
import p213co.znly.models.core.ChatProto$ChatActivities.C6982a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.chat.capsules.q */
public final class C1930q {

    /* renamed from: a */
    private final String f6273a;

    /* renamed from: b */
    private final ZenlyCore f6274b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1956d5 f6275c;

    /* renamed from: app.zenly.locator.chat.capsules.q$a */
    public static final class C1931a<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C1930q f6276a;

        public C1931a(C1930q qVar) {
            this.f6276a = qVar;
        }

        public final R apply(T1 t1, T2 t2) {
            return this.f6276a.m7566a((List) t1, (List) t2);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.q$b */
    static final class C1932b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1932b f6277e = new C1932b();

        C1932b() {
        }

        /* renamed from: a */
        public final List<C6982a> apply(ChatProto$ChatActivities chatProto$ChatActivities) {
            C12932j.m33818b(chatProto$ChatActivities, "activities");
            return chatProto$ChatActivities.getActivitiesList();
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.q$c */
    static final class C1933c<T> implements Consumer<List<C6982a>> {

        /* renamed from: e */
        public static final C1933c f6278e = new C1933c();

        C1933c() {
        }

        /* renamed from: a */
        public final void accept(List<C6982a> list) {
            C12143a.m32033c("Activities have changed", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.q$d */
    static final class C1934d extends C12933k implements Function1<C6982a, Boolean> {

        /* renamed from: f */
        final /* synthetic */ String f6279f;

        C1934d(String str) {
            this.f6279f = str;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo7679a(C6982a aVar) {
            C12932j.m33818b(aVar, "it");
            return !C12932j.m33817a((Object) aVar.getUserUuid(), (Object) this.f6279f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo7679a((C6982a) obj));
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.q$e */
    static final class C1935e extends C12933k implements Function1<C6982a, C1908k> {

        /* renamed from: f */
        final /* synthetic */ C1930q f6280f;

        C1935e(C1930q qVar) {
            this.f6280f = qVar;
            super(1);
        }

        /* renamed from: a */
        public final C1908k invoke(C6982a aVar) {
            C12932j.m33818b(aVar, "activity");
            C6818b a = this.f6280f.f6275c.mo7769i().mo7611a(aVar.getUserUuid());
            if (a == null || C2309e.m8217a(a)) {
                return null;
            }
            String userUuid = a.getUserUuid();
            C12932j.m33815a((Object) userUuid, "member.userUuid");
            String nickname = a.getNickname();
            C12932j.m33815a((Object) nickname, "member.nickname");
            C1908k kVar = new C1908k(userUuid, nickname, aVar.getActivity(), null, 8, null);
            return kVar;
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.q$f */
    static final class C1936f extends C12933k implements Function1<C6818b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ String f6281f;

        /* renamed from: g */
        final /* synthetic */ Set f6282g;

        C1936f(String str, Set set) {
            this.f6281f = str;
            this.f6282g = set;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo7681a(C6818b bVar) {
            C12932j.m33818b(bVar, "it");
            if (!(!C12932j.m33817a((Object) bVar.getUserUuid(), (Object) this.f6281f)) || this.f6282g.contains(bVar.getUserUuid()) || C2309e.m8217a(bVar)) {
                return false;
            }
            return true;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo7681a((C6818b) obj));
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.q$g */
    static final class C1937g extends C12933k implements Function1<C6818b, C1908k> {

        /* renamed from: f */
        public static final C1937g f6283f = new C1937g();

        C1937g() {
            super(1);
        }

        /* renamed from: a */
        public final C1908k invoke(C6818b bVar) {
            C12932j.m33818b(bVar, "it");
            String userUuid = bVar.getUserUuid();
            C12932j.m33815a((Object) userUuid, "it.userUuid");
            String nickname = bVar.getNickname();
            C12932j.m33815a((Object) nickname, "it.nickname");
            C1908k kVar = new C1908k(userUuid, nickname, 0, null, 8, null);
            return kVar;
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.q$h */
    public static final class C1938h<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            Boolean bool = (Boolean) t2;
            R r = (List) t1;
            C12932j.m33815a((Object) bool, "hasLeft");
            return bool.booleanValue() ? C12848o.m33640a() : r;
        }
    }

    public C1930q(String str, ZenlyCore zenlyCore, C1956d5 d5Var) {
        C12932j.m33818b(str, "conversationUuid");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(d5Var, "chatViewModel");
        this.f6273a = str;
        this.f6274b = zenlyCore;
        this.f6275c = d5Var;
    }

    /* renamed from: b */
    private final C12279e<List<C1908k>> m7567b() {
        C12279e b = this.f6274b.chatActivityStream(this.f6273a).mo36501i(C1932b.f6277e).mo36485d(C12848o.m33640a()).mo36455b((Consumer<? super T>) C1933c.f6278e);
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) b, "activitiesObservables");
        C12279e c = this.f6275c.mo7754c();
        C12932j.m33815a((Object) c, "chatViewModel.conversationMembers()");
        C12279e<List<C1908k>> a = C12279e.m32610a((ObservableSource<? extends T1>) b, (ObservableSource<? extends T2>) c, (BiFunction<? super T1, ? super T2, ? extends R>) new C1931a<Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…enerateCapsules\n        )");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C1908k> m7566a(List<C6982a> list, List<C6818b> list2) {
        String d = C5447b.m15477d(this.f6274b);
        List<C1908k> g = C12990j.m33935g(C12990j.m33932d(C12990j.m33926a(C12857w.m33671b((Iterable) list), (Function1) new C1934d(d)), new C1935e(this)));
        ArrayList arrayList = new ArrayList(C12850p.m33647a(g, 10));
        for (C1908k d2 : g) {
            arrayList.add(d2.mo7642d());
        }
        return C12857w.m33670b((Collection) g, (Iterable) C12990j.m33935g(C12990j.m33930c(C12990j.m33926a(C12857w.m33671b((Iterable) list2), (Function1) new C1936f(d, C12857w.m33691l(arrayList))), C1937g.f6283f)));
    }

    /* renamed from: a */
    public final C12279e<List<C1908k>> mo7676a() {
        C12774b bVar = C12774b.f33320a;
        C12279e b = m7567b();
        C12279e b2 = this.f6275c.mo7745b();
        C12932j.m33815a((Object) b2, "chatViewModel.conversationLeft()");
        C12279e<List<C1908k>> a = C12279e.m32610a((ObservableSource<? extends T1>) b, (ObservableSource<? extends T2>) b2, (BiFunction<? super T1, ? super T2, ? extends R>) new C1938h<Object,Object,Object>());
        C12932j.m33815a((Object) a, "Observables.combineLates…s\n            }\n        }");
        return a;
    }
}
