package app.zenly.locator.chat.emojis;

import android.graphics.Bitmap;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C1893c5;
import app.zenly.locator.chat.C2375w4;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import app.zenly.locator.core.p072ui.view.PingParticleView.C3129a;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p162w.p163c.C5569a;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: app.zenly.locator.chat.emojis.a */
public final class C1967a {

    /* renamed from: a */
    private final ZenlySchedulers f6346a = C1351e.m6372a(C2382x4.f7181b.mo19916a("animationsPresenter"));

    /* renamed from: b */
    private final C12275b f6347b = new C12275b();

    /* renamed from: c */
    private final C2375w4 f6348c;

    /* renamed from: d */
    private final C1893c5 f6349d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1978b f6350e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5569a f6351f;

    /* renamed from: g */
    private final C5498a f6352g;

    /* renamed from: h */
    private final EmojiSoundPlayer f6353h;

    /* renamed from: app.zenly.locator.chat.emojis.a$a */
    static final class C1968a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C1967a f6354e;

        /* renamed from: app.zenly.locator.chat.emojis.a$a$a */
        static final class C1969a<T, R> implements Function<T, SingleSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C1968a f6355e;

            /* renamed from: app.zenly.locator.chat.emojis.a$a$a$a */
            static final class C1970a<T, R> implements Function<T, R> {

                /* renamed from: e */
                final /* synthetic */ C2242d f6356e;

                C1970a(C2242d dVar) {
                    this.f6356e = dVar;
                }

                /* renamed from: a */
                public final C3129a apply(Bitmap bitmap) {
                    C12932j.m33818b(bitmap, "bitmap");
                    C2242d dVar = this.f6356e;
                    return new C3129a(dVar.f6865a, bitmap, dVar.f6867c);
                }
            }

            C1969a(C1968a aVar) {
                this.f6355e = aVar;
            }

            /* renamed from: a */
            public final C12291g<List<C3129a>> apply(C2242d dVar) {
                C12932j.m33818b(dVar, "emoji");
                C5569a a = this.f6355e.f6354e.f6351f;
                String str = dVar.f6866b;
                C12932j.m33815a((Object) str, "emoji.path");
                return a.mo13180b(str).mo36501i(new C1970a(dVar)).mo36511n().mo36544b(C12802a.m33491b());
            }
        }

        C1968a(C1967a aVar) {
            this.f6354e = aVar;
        }

        /* renamed from: a */
        public final C12279e<List<C3129a>> apply(List<C2242d> list) {
            C12932j.m33818b(list, "emojis");
            return C12279e.m32623b((Iterable<? extends T>) list).mo36499h((Function<? super T, ? extends SingleSource<? extends R>>) new C1969a<Object,Object>(this));
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.a$b */
    static final class C1971b<T> implements Consumer<List<C3129a>> {

        /* renamed from: e */
        final /* synthetic */ C1967a f6357e;

        C1971b(C1967a aVar) {
            this.f6357e = aVar;
        }

        /* renamed from: a */
        public final void accept(List<C3129a> list) {
            C1967a aVar = this.f6357e;
            C12932j.m33815a((Object) list, "emojis");
            aVar.m7693a(list);
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.a$c */
    static final class C1972c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1972c f6358e = new C1972c();

        C1972c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32034c(th, "Unable to download emojis", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.a$d */
    static final class C1973d<T> implements Consumer<Integer> {

        /* renamed from: e */
        final /* synthetic */ C1967a f6359e;

        C1973d(C1967a aVar) {
            this.f6359e = aVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            C1978b b = this.f6359e.f6350e;
            if (num != null) {
                b.mo7806b(num.intValue());
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.a$e */
    static final class C1974e<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C1967a f6360e;

        C1974e(C1967a aVar) {
            this.f6360e = aVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f6360e.f6350e.mo7802a();
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.a$f */
    static final class C1975f<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1975f f6361e = new C1975f();

        C1975f() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Could not update avatar blink", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.a$g */
    static final class C1976g<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ C1967a f6362e;

        C1976g(C1967a aVar) {
            this.f6362e = aVar;
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
            C1978b b = this.f6362e.f6350e;
            C12932j.m33815a((Object) userProto$User, "user");
            b.mo7804a(userProto$User);
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.a$h */
    static final class C1977h<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1977h f6363e = new C1977h();

        C1977h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting user", new Object[0]);
        }
    }

    public C1967a(C2375w4 w4Var, C1893c5 c5Var, C1978b bVar, C5569a aVar, C5498a aVar2, EmojiSoundPlayer emojiSoundPlayer) {
        C12932j.m33818b(w4Var, "viewModel");
        C12932j.m33818b(c5Var, "userViewModel");
        C12932j.m33818b(bVar, "viewController");
        C12932j.m33818b(aVar, "emojisLoader");
        C12932j.m33818b(aVar2, "haptic");
        C12932j.m33818b(emojiSoundPlayer, "player");
        this.f6348c = w4Var;
        this.f6349d = c5Var;
        this.f6350e = bVar;
        this.f6351f = aVar;
        this.f6352g = aVar2;
        this.f6353h = emojiSoundPlayer;
    }

    /* renamed from: b */
    private final void m7695b(List<? extends C3129a> list) {
        for (C3129a aVar : list) {
            String str = aVar.f8651a;
            if (str != null) {
                this.f6353h.play(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo7789a() {
        Disposable a = this.f6348c.mo8317c().mo36425a((ObservableSource<U>) C3896a1.f10317n.mo10527a().mo10511c().mo13170a()).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C1968a<Object,Object>(this)).mo36428a((C12286f) this.f6346a.getMainThread()).mo36412a((Consumer<? super T>) new C1971b<Object>(this), (Consumer<? super Throwable>) C1972c.f6358e);
        C12932j.m33815a((Object) a, "viewModel.receiveEmojis(… emojis\") }\n            )");
        C12773a.m33432a(a, this.f6347b);
        Disposable d = this.f6348c.mo8315a().mo36428a((C12286f) this.f6346a.getMainThread()).mo36476d((Consumer<? super T>) new C1973d<Object>(this));
        C12932j.m33815a((Object) d, "viewModel.emojisCount()\n…entEmojisCount(count!!) }");
        C12773a.m33432a(d, this.f6347b);
        Disposable a2 = this.f6348c.mo8316b().mo36428a((C12286f) this.f6346a.getMainThread()).mo36412a((Consumer<? super T>) new C1974e<Object>(this), (Consumer<? super Throwable>) C1975f.f6361e);
        C12932j.m33815a((Object) a2, "viewModel.emojisTick()\n …r blink\") }\n            )");
        C12773a.m33432a(a2, this.f6347b);
        Disposable a3 = this.f6349d.mo7622a().mo36428a((C12286f) this.f6346a.getMainThread()).mo36412a((Consumer<? super T>) new C1976g<Object>(this), (Consumer<? super Throwable>) C1977h.f6363e);
        C12932j.m33815a((Object) a3, "userViewModel.publicUser…ng user\") }\n            )");
        C12773a.m33432a(a3, this.f6347b);
    }

    /* renamed from: b */
    public final void mo7790b() {
        this.f6347b.mo36401a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7693a(List<? extends C3129a> list) {
        C5498a.m15602a(this.f6352g, C5501c.MEDIUM, C5500b.CHAT, 0, 4, null);
        this.f6350e.mo7807b(list);
        this.f6350e.mo7805a(list);
        m7695b(list);
    }
}
