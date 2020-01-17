package app.zenly.locator.p208y;

import android.content.Context;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p208y.C6288c.C6291c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.romutils.Resolution;
import p213co.znly.core.romutils.ResolutionSolver;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.y.i */
public final class C6302i {

    /* renamed from: a */
    private final FriendRequestStore f15822a;

    /* renamed from: b */
    private final FriendshipStore f15823b;

    /* renamed from: c */
    private final C12279e<Boolean> f15824c;

    /* renamed from: app.zenly.locator.y.i$a */
    public static final class C6303a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
            if (r4.booleanValue() != false) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r2, T2 r3, T3 r4) {
            /*
                r1 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                java.lang.String r0 = "isSyncTimeout"
                kotlin.jvm.internal.C12932j.m33815a(r2, r0)
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0029
                java.lang.String r2 = "hasPendingFr"
                kotlin.jvm.internal.C12932j.m33815a(r3, r2)
                boolean r2 = r3.booleanValue()
                if (r2 != 0) goto L_0x0027
                java.lang.String r2 = "hasFriendship"
                kotlin.jvm.internal.C12932j.m33815a(r4, r2)
                boolean r2 = r4.booleanValue()
                if (r2 == 0) goto L_0x0029
            L_0x0027:
                r2 = 1
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p208y.C6302i.C6303a.apply(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: app.zenly.locator.y.i$b */
    static final class C6304b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C6304b f15825e = new C6304b();

        C6304b() {
        }

        /* renamed from: a */
        public final boolean mo14161a(List<C2956k0> list) {
            Object obj;
            boolean z;
            C12932j.m33818b(list, "fr");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C2956k0) obj).mo9122b().getStatus() == C6812c.pending) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return obj != null;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo14161a((List) obj));
        }
    }

    /* renamed from: app.zenly.locator.y.i$c */
    static final class C6305c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C6305c f15826e = new C6305c();

        C6305c() {
        }

        /* renamed from: a */
        public final boolean mo14162a(Map<String, C2991u0> map) {
            C12932j.m33818b(map, "it");
            return !map.isEmpty();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo14162a((Map) obj));
        }
    }

    /* renamed from: app.zenly.locator.y.i$d */
    public static final class C6306d<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ Context f15827a;

        public C6306d(Context context) {
            this.f15827a = context;
        }

        public final R apply(T1 t1, T2 t2) {
            boolean booleanValue = ((Boolean) t2).booleanValue();
            boolean booleanValue2 = ((Boolean) t1).booleanValue();
            List resolutions = ResolutionSolver.get().getResolutions(this.f15827a);
            C12932j.m33815a((Object) resolutions, "ResolutionSolver.get().getResolutions(context)");
            if (!booleanValue2 || resolutions.isEmpty()) {
                return C6291c.NONE;
            }
            if (booleanValue) {
                return C6291c.BANNER;
            }
            boolean z = true;
            if (!(resolutions instanceof Collection) || !resolutions.isEmpty()) {
                Iterator it = resolutions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Resolution resolution = (Resolution) it.next();
                    C12932j.m33815a((Object) resolution, "it");
                    if (!resolution.isStateReadable()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return C6291c.MANDATORY_TROUBLESHOOTING;
            }
            return C6291c.NONE;
        }
    }

    /* renamed from: app.zenly.locator.y.i$e */
    public static final class C6307e<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ Context f15828a;

        public C6307e(Context context) {
            this.f15828a = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r4, T2 r5) {
            /*
                r3 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                co.znly.core.romutils.ResolutionSolver r0 = p213co.znly.core.romutils.ResolutionSolver.get()
                android.content.Context r1 = r3.f15828a
                java.util.List r0 = r0.getResolutions(r1)
                java.lang.String r1 = "ResolutionSolver.get().getResolutions(context)"
                kotlin.jvm.internal.C12932j.m33815a(r0, r1)
                r1 = 0
                r2 = 1
                if (r5 != 0) goto L_0x0054
                if (r4 == 0) goto L_0x0054
                boolean r4 = r0.isEmpty()
                r4 = r4 ^ r2
                if (r4 == 0) goto L_0x0054
                boolean r4 = r0 instanceof java.util.Collection
                if (r4 == 0) goto L_0x0034
                boolean r4 = r0.isEmpty()
                if (r4 == 0) goto L_0x0034
            L_0x0032:
                r4 = 0
                goto L_0x0051
            L_0x0034:
                java.util.Iterator r4 = r0.iterator()
            L_0x0038:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0032
                java.lang.Object r5 = r4.next()
                co.znly.core.romutils.Resolution r5 = (p213co.znly.core.romutils.Resolution) r5
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C12932j.m33815a(r5, r0)
                boolean r5 = r5.isStateReadable()
                r5 = r5 ^ r2
                if (r5 == 0) goto L_0x0038
                r4 = 1
            L_0x0051:
                if (r4 == 0) goto L_0x0054
                r1 = 1
            L_0x0054:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p208y.C6302i.C6307e.apply(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C6302i(FriendRequestStore friendRequestStore, FriendshipStore friendshipStore, C12279e<Boolean> eVar) {
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(friendshipStore, "friendShipStore");
        C12932j.m33818b(eVar, "hasOpenedNotificationObservable");
        this.f15822a = friendRequestStore;
        this.f15823b = friendshipStore;
        this.f15824c = eVar;
    }

    /* renamed from: a */
    private final C12279e<Boolean> m17370a() {
        C12774b bVar = C12774b.f33320a;
        C12279e isSyncTimeout = C5448c.m15478a().isSyncTimeout();
        C12932j.m33815a((Object) isSyncTimeout, "ZenlyCoreProvider.get().isSyncTimeout");
        C12279e i = this.f15822a.friendRequests().mo36501i(C6304b.f15825e);
        C12932j.m33815a((Object) i, "friendRequestStore.frien…tatus.pending } != null }");
        C12279e i2 = this.f15823b.friendshipsMap().mo36501i(C6305c.f15826e);
        C12932j.m33815a((Object) i2, "friendShipStore.friendsh…).map { it.isNotEmpty() }");
        C12279e<Boolean> a = C12279e.m32609a((ObservableSource<? extends T1>) isSyncTimeout, (ObservableSource<? extends T2>) i, (ObservableSource<? extends T3>) i2, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C6303a<Object,Object,Object,Object>());
        C12932j.m33815a((Object) a, "Observables.combineLates… hasFriendship)\n        }");
        return a;
    }

    /* renamed from: b */
    public final C12279e<Boolean> mo14160b(Context context) {
        C12932j.m33818b(context, "context");
        C12774b bVar = C12774b.f33320a;
        C12279e<Boolean> d = C12279e.m32610a((ObservableSource<? extends T1>) m17370a(), (ObservableSource<? extends T2>) this.f15824c, (BiFunction<? super T1, ? super T2, ? extends R>) new C6307e<Object,Object,Object>(context)).mo36477d();
        C12932j.m33815a((Object) d, "Observables.combineLates… }.distinctUntilChanged()");
        return d;
    }

    /* renamed from: a */
    public final C12279e<C6291c> mo14159a(Context context) {
        C12932j.m33818b(context, "context");
        C12774b bVar = C12774b.f33320a;
        C12279e<C6291c> d = C12279e.m32610a((ObservableSource<? extends T1>) m17370a(), (ObservableSource<? extends T2>) this.f15824c, (BiFunction<? super T1, ? super T2, ? extends R>) new C6306d<Object,Object,Object>(context)).mo36477d();
        C12932j.m33815a((Object) d, "Observables.combineLates… }.distinctUntilChanged()");
        return d;
    }
}
