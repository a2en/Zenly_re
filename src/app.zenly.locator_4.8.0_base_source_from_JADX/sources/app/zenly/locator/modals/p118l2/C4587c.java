package app.zenly.locator.modals.p118l2;

import android.graphics.Bitmap;
import app.zenly.locator.chat.panel.emojis.C2234d0;
import app.zenly.locator.chat.panel.emojis.C2277z;
import app.zenly.locator.p143s.p162w.p163c.C5569a;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C8307u3;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.ObservableTransformer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.modals.l2.c */
public final class C4587c {

    /* renamed from: app.zenly.locator.modals.l2.c$a */
    static final class C4588a<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C4588a f12226e = new C4588a();

        C4588a() {
        }

        /* renamed from: a */
        public final List<C2234d0> mo11729a(List<C2234d0> list) {
            C12932j.m33818b(list, "it");
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo11729a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.locator.modals.l2.c$b */
    static final class C4589b<T> implements Predicate<C2234d0> {

        /* renamed from: e */
        final /* synthetic */ String f12227e;

        C4589b(String str) {
            this.f12227e = str;
        }

        /* renamed from: a */
        public final boolean test(C2234d0 d0Var) {
            C12932j.m33818b(d0Var, "pack");
            return C12932j.m33817a((Object) this.f12227e, (Object) d0Var.mo8093b().getUuid());
        }
    }

    /* renamed from: app.zenly.locator.modals.l2.c$c */
    static final class C4590c<Upstream, Downstream> implements ObservableTransformer<C2234d0, Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C5569a f12228a;

        /* renamed from: app.zenly.locator.modals.l2.c$c$a */
        static final class C4591a<T, R> implements Function<T, Iterable<? extends U>> {

            /* renamed from: e */
            public static final C4591a f12229e = new C4591a();

            C4591a() {
            }

            /* renamed from: a */
            public final List<C8307u3> apply(C2234d0 d0Var) {
                C12932j.m33818b(d0Var, "pack");
                return d0Var.mo8093b().getEmojisList();
            }
        }

        /* renamed from: app.zenly.locator.modals.l2.c$c$b */
        static final class C4592b<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C4590c f12230e;

            /* renamed from: app.zenly.locator.modals.l2.c$c$b$a */
            static final class C4593a<T, R> implements Function<Throwable, ObservableSource<? extends Bitmap>> {

                /* renamed from: e */
                final /* synthetic */ C8307u3 f12231e;

                C4593a(C8307u3 u3Var) {
                    this.f12231e = u3Var;
                }

                /* renamed from: a */
                public final C12279e<Bitmap> apply(Throwable th) {
                    C12932j.m33818b(th, "th");
                    C8307u3 u3Var = this.f12231e;
                    C12932j.m33815a((Object) u3Var, "emoji");
                    C12143a.m32032b(th, "Load emoji %s fail on pack", u3Var.getUuid());
                    return C12279e.m32633q();
                }
            }

            C4592b(C4590c cVar) {
                this.f12230e = cVar;
            }

            /* renamed from: a */
            public final C12279e<Bitmap> apply(C8307u3 u3Var) {
                C12932j.m33818b(u3Var, "emoji");
                C5569a aVar = this.f12230e.f12228a;
                String uuid = u3Var.getUuid();
                C12932j.m33815a((Object) uuid, "emoji.uuid");
                return aVar.mo13181c(uuid).mo36502j(new C4593a(u3Var));
            }
        }

        C4590c(C5569a aVar) {
            this.f12228a = aVar;
        }

        public final C12279e<Bitmap> apply(C12279e<C2234d0> eVar) {
            C12932j.m33818b(eVar, "upstream");
            return eVar.mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C4591a.f12229e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C4592b<Object,Object>(this));
        }
    }

    /* renamed from: a */
    public final C12279e<C2234d0> mo11728a(String str) {
        C12932j.m33818b(str, "uuid");
        C12279e<C2234d0> l = C2277z.m8173a().mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C4588a.f12226e).mo36459b((Predicate<? super T>) new C4589b<Object>(str)).mo36487e(1).mo36506l();
        C12932j.m33815a((Object) l, "EmojisPacksRepository.lo….take(1)\n        .share()");
        return l;
    }

    /* renamed from: a */
    public final ObservableTransformer<C2234d0, Bitmap> mo11727a(C5569a aVar) {
        C12932j.m33818b(aVar, "loader");
        return new C4590c(aVar);
    }
}
