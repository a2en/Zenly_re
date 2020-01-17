package app.zenly.locator.chat.panel.emojis;

import app.zenly.locator.chat.panel.emojis.gesture.C2247a;
import app.zenly.locator.chat.panel.emojis.p057f0.C2238a;
import app.zenly.locator.chat.panel.emojis.p057f0.C2240b;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12798f;

/* renamed from: app.zenly.locator.chat.panel.emojis.y */
public final class C2270y {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12279e<C2240b> f6922a = C12279e.m32633q();

    /* renamed from: b */
    private final C12279e<C12279e<C2240b>> f6923b;

    /* renamed from: c */
    private final C12279e<C2240b> f6924c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2247a f6925d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2263w f6926e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12798f<Integer> f6927f;

    /* renamed from: app.zenly.locator.chat.panel.emojis.y$a */
    static final class C2271a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C2270y f6928e;

        /* renamed from: app.zenly.locator.chat.panel.emojis.y$a$a */
        static final class C2272a<T, R> implements Function<T, R> {

            /* renamed from: e */
            final /* synthetic */ C2238a f6929e;

            /* renamed from: f */
            final /* synthetic */ Integer f6930f;

            C2272a(C2238a aVar, Integer num) {
                this.f6929e = aVar;
                this.f6930f = num;
            }

            /* renamed from: a */
            public final C2240b apply(Long l) {
                C12932j.m33818b(l, "it");
                C2238a aVar = this.f6929e;
                C12932j.m33815a((Object) aVar, "emoji");
                Integer num = this.f6930f;
                C12932j.m33815a((Object) num, "position");
                return new C2240b(aVar, num.intValue(), ((int) l.longValue()) + 1);
            }
        }

        /* renamed from: app.zenly.locator.chat.panel.emojis.y$a$b */
        static final class C2273b<T> implements Consumer<C2240b> {

            /* renamed from: e */
            final /* synthetic */ C2271a f6931e;

            C2273b(C2271a aVar) {
                this.f6931e = aVar;
            }

            /* renamed from: a */
            public final void accept(C2240b bVar) {
                this.f6931e.f6928e.f6927f.onNext(Integer.valueOf(bVar.mo8103a()));
            }
        }

        C2271a(C2270y yVar) {
            this.f6928e = yVar;
        }

        /* renamed from: a */
        public final C12279e<C2240b> apply(Integer num) {
            C12932j.m33818b(num, "position");
            C2238a b = this.f6928e.f6926e.mo8125b(num.intValue());
            if (b.mo8099d()) {
                return this.f6928e.f6922a;
            }
            return C12279e.m32628g(100, TimeUnit.MILLISECONDS).mo36485d(Long.valueOf(0)).mo36501i(new C2272a(b, num)).mo36493f((ObservableSource<U>) this.f6928e.f6925d.mo8119b()).mo36455b((Consumer<? super T>) new C2273b<Object>(this)).mo36506l();
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.y$b */
    static final class C2274b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C2270y f6932e;

        C2274b(C2270y yVar) {
            this.f6932e = yVar;
        }

        /* renamed from: a */
        public final C12279e<C2240b> apply(Integer num) {
            C12932j.m33818b(num, "position");
            C2238a b = this.f6932e.f6926e.mo8125b(num.intValue());
            if (b.mo8099d()) {
                return this.f6932e.f6922a;
            }
            C12932j.m33815a((Object) b, "emoji");
            return C12279e.m32626e(new C2240b(b, num.intValue(), 1));
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.y$c */
    static final class C2275c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C2275c f6933e = new C2275c();

        C2275c() {
        }

        /* renamed from: a */
        public final C12279e<C2240b> mo8142a(C12279e<C2240b> eVar) {
            C12932j.m33818b(eVar, "o");
            return eVar;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            C12279e eVar = (C12279e) obj;
            mo8142a(eVar);
            return eVar;
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.y$d */
    static final class C2276d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C2276d f6934e = new C2276d();

        C2276d() {
        }

        /* renamed from: a */
        public final C12279e<C2240b> apply(C12279e<C2240b> eVar) {
            C12932j.m33818b(eVar, "o");
            return eVar.mo36478d(1);
        }
    }

    public C2270y(C2247a aVar, C2263w wVar, C12798f<Integer> fVar) {
        C12932j.m33818b(aVar, "itemGestureSource");
        C12932j.m33818b(wVar, "adapter");
        C12932j.m33818b(fVar, "emojiSentCountSubject");
        this.f6925d = aVar;
        this.f6926e = wVar;
        this.f6927f = fVar;
        C12279e<C12279e<C2240b>> l = this.f6925d.mo8118a().mo36501i(new C2271a(this)).mo36506l();
        C12932j.m33815a((Object) l, "itemGestureSource.itemLo…red.\n            .share()");
        this.f6923b = l;
        C12279e<C2240b> l2 = this.f6925d.mo8120c().mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C2274b<Object,Object>(this)).mo36506l();
        C12932j.m33815a((Object) l2, "itemGestureSource.itemTa…       }\n        .share()");
        this.f6924c = l2;
    }

    /* renamed from: a */
    public final C12279e<C2240b> mo8136a() {
        C12279e e = this.f6923b.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C2275c.f6933e);
        C12932j.m33815a((Object) e, "emojiBulkObservableProvider.flatMap { o -> o }");
        C12279e<C2240b> b = C12279e.m32621b((ObservableSource<? extends T>) e, (ObservableSource<? extends T>) this.f6924c);
        C12932j.m33815a((Object) b, "Observable.merge(emojiBu…ervable, emojiObservable)");
        return b;
    }

    /* renamed from: b */
    public final C12279e<C2240b> mo8137b() {
        C12279e e = this.f6923b.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C2276d.f6934e);
        C12932j.m33815a((Object) e, "emojiBulkObservableProvi…ap { o -> o.takeLast(1) }");
        C12279e<C2240b> b = C12279e.m32621b((ObservableSource<? extends T>) e, (ObservableSource<? extends T>) this.f6924c);
        C12932j.m33815a((Object) b, "Observable.merge(emojiBu…ervable, emojiObservable)");
        return b;
    }
}
