package app.zenly.locator.inbox.p101m;

import android.view.View;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.inbox.InboxManager;
import app.zenly.locator.inbox.p103o.C3884a;
import app.zenly.locator.inbox.p103o.C3885b;
import app.zenly.locator.p143s.p148l.C5448c;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7125j;
import p213co.znly.models.core.C7168n;
import p213co.znly.models.core.C7192q;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p406n.C12798f;

/* renamed from: app.zenly.locator.inbox.m.a */
public final class C3855a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Comparator<C3884a> f10245f = new C3856a(C3205g.m10189a().reversed());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12119a f10246g = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12271b f10247h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C12798f<Integer> f10248i;

    /* renamed from: j */
    private final InboxManager f10249j;

    /* renamed from: k */
    private final C12279e<Boolean> f10250k;

    /* renamed from: app.zenly.locator.inbox.m.a$a */
    static final class C3856a<T> implements Comparator<C3884a> {

        /* renamed from: e */
        final /* synthetic */ C3201f f10251e;

        C3856a(C3201f fVar) {
            this.f10251e = fVar;
        }

        /* renamed from: a */
        public final int compare(C3884a aVar, C3884a aVar2) {
            return this.f10251e.compare(aVar.mo10478f(), aVar2.mo10478f());
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$b */
    static final class C3857b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3857b f10252e = new C3857b();

        C3857b() {
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(List<C3884a> list) {
            C12932j.m33818b(list, "it");
            return C11751f.m30863b(list);
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$c */
    static final class C3858c<T> implements Consumer<Seekable<C11722a>> {

        /* renamed from: e */
        final /* synthetic */ C3855a f10253e;

        C3858c(C3855a aVar) {
            this.f10253e = aVar;
        }

        /* renamed from: a */
        public final void accept(Seekable<C11722a> seekable) {
            this.f10253e.f10248i.onNext(Integer.valueOf(seekable.size()));
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$d */
    static final class C3859d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3859d f10254e = new C3859d();

        C3859d() {
        }

        /* renamed from: a */
        public final C3866b apply(C7192q qVar) {
            C12932j.m33818b(qVar, "it");
            boolean initState = qVar.getInitState();
            C7168n conversations = qVar.getConversations();
            C12932j.m33815a((Object) conversations, "it.conversations");
            List conversationsList = conversations.getConversationsList();
            C12932j.m33815a((Object) conversationsList, "it.conversations.conversationsList");
            return new C3866b(initState, conversationsList);
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$e */
    static final class C3860e<T1, T2, R> implements BiFunction<R, T, R> {

        /* renamed from: a */
        final /* synthetic */ C3855a f10255a;

        C3860e(C3855a aVar) {
            this.f10255a = aVar;
        }

        /* renamed from: a */
        public final Map<String, C3884a> mo10456a(Map<String, C3884a> map, C3866b bVar) {
            C12932j.m33818b(map, "acc");
            C12932j.m33818b(bVar, "cur");
            if (bVar.mo10463b()) {
                map.clear();
            }
            for (C7117i iVar : bVar.mo10462a()) {
                if (iVar.getHidden()) {
                    map.remove(iVar.getInboxUuid());
                } else {
                    String inboxUuid = iVar.getInboxUuid();
                    C12932j.m33815a((Object) inboxUuid, "conversation.inboxUuid");
                    map.put(inboxUuid, new C3884a(iVar, this.f10255a.f10246g.mo35844a(iVar.getInboxUuid())));
                }
            }
            return map;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            Map map = (Map) obj;
            mo10456a(map, (C3866b) obj2);
            return map;
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$f */
    static final class C3861f<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3855a f10256e;

        C3861f(C3855a aVar) {
            this.f10256e = aVar;
        }

        /* renamed from: a */
        public final List<C3884a> apply(Map<String, C3884a> map) {
            C12932j.m33818b(map, "it");
            return C12857w.m33665a((Iterable) map.values(), this.f10256e.f10245f);
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$g */
    static final class C3862g<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C3862g f10257e = new C3862g();

        C3862g() {
        }

        /* renamed from: a */
        public final C12279e<C7125j> apply(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return C5448c.m15478a().inboxNextPage().mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$h */
    static final class C3863h<T> implements Predicate<C7125j> {

        /* renamed from: e */
        public static final C3863h f10258e = new C3863h();

        C3863h() {
        }

        /* renamed from: a */
        public final boolean test(C7125j jVar) {
            C12932j.m33818b(jVar, "it");
            return jVar.getNoMore();
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$i */
    static final class C3864i<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3864i f10259e = new C3864i();

        C3864i() {
        }

        /* renamed from: a */
        public final C3866b apply(C7125j jVar) {
            C12932j.m33818b(jVar, "it");
            C7168n conversations = jVar.getConversations();
            C12932j.m33815a((Object) conversations, "it.conversations");
            List conversationsList = conversations.getConversationsList();
            C12932j.m33815a((Object) conversationsList, "it.conversations.conversationsList");
            return new C3866b(false, conversationsList);
        }
    }

    /* renamed from: app.zenly.locator.inbox.m.a$j */
    static final class C3865j<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3855a f10260e;

        C3865j(C3855a aVar) {
            this.f10260e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(Seekable<C11722a> seekable) {
            C12932j.m33818b(seekable, "it");
            if (seekable.size() != 0) {
                return this.f10260e.f10247h.mo36346a((ObservableSource<T>) C12279e.m32626e(seekable));
            }
            C3885b bVar = C3885b.f10295f;
            if (bVar != null) {
                return C12279e.m32626e(C11751f.m30861a(bVar));
            }
            throw new TypeCastException("null cannot be cast to non-null type com.snap.ui.recycling.viewmodel.AdapterViewModel");
        }
    }

    public C3855a(C12271b bVar, C12798f<Integer> fVar, InboxManager inboxManager, C12279e<Boolean> eVar) {
        C12932j.m33818b(bVar, "delayedBind");
        C12932j.m33818b(fVar, "itemCountSubject");
        C12932j.m33818b(inboxManager, "inboxManager");
        C12932j.m33818b(eVar, "_nextPageEvents");
        this.f10247h = bVar;
        this.f10248i = fVar;
        this.f10249j = inboxManager;
        this.f10250k = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> e = m11383b().mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C3865j<Object,Object>(this));
        C12932j.m33815a((Object) e, "getConversationModels()\n…          }\n            }");
        return e;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* renamed from: b */
    private final C12279e<Seekable<C11722a>> m11383b() {
        C12279e<Seekable<C11722a>> b = this.f10249j.mo10405a().mo36501i(C3859d.f10254e).mo36451b((ObservableSource<? extends T>) this.f10250k.mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) C3862g.f10257e).mo36472c((Predicate<? super T>) C3863h.f10258e).mo36501i(C3864i.f10259e)).mo36441a(new LinkedHashMap(), (BiFunction<R, ? super T, R>) new C3860e<R,Object,R>(this)).mo36479d(1).mo36501i(new C3861f(this)).mo36501i(C3857b.f10252e).mo36455b((Consumer<? super T>) new C3858c<Object>(this));
        C12932j.m33815a((Object) b, "modelsObservable\n       …bject.onNext(it.size()) }");
        return b;
    }
}
