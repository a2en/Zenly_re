package app.zenly.locator.chat.panel.emojis;

import android.content.Context;
import app.zenly.locator.chat.panel.emojis.p057f0.C2241c;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6926b;
import p213co.znly.models.services.C8355w3.C8357b;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12774b;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.chat.panel.emojis.b0 */
public final class C2220b0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C12785a<List<C2241c>> f6823a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<C8357b> f6824b = C12848o.m33643b((Object[]) new C8357b[]{C8357b.UNLOCK_EVENT_INVITER, C8357b.UNLOCK_FRIENDS_COUNT, C8357b.UNLOCK_NOT_LOCKED});

    /* renamed from: c */
    public static final C2220b0 f6825c = new C2220b0();

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$a */
    public static final class C2221a {

        /* renamed from: a */
        private final int f6826a;

        /* renamed from: b */
        private final int f6827b;

        /* renamed from: c */
        private final boolean f6828c;

        public C2221a(int i, int i2, boolean z) {
            this.f6826a = i;
            this.f6827b = i2;
            this.f6828c = z;
        }

        /* renamed from: a */
        public final int mo8078a() {
            return this.f6826a;
        }

        /* renamed from: b */
        public final int mo8079b() {
            return this.f6827b;
        }

        /* renamed from: c */
        public final boolean mo8080c() {
            return this.f6828c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2221a) {
                    C2221a aVar = (C2221a) obj;
                    if (this.f6826a == aVar.f6826a) {
                        if (this.f6827b == aVar.f6827b) {
                            if (this.f6828c == aVar.f6828c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int a = ((Integer.valueOf(this.f6826a).hashCode() * 31) + Integer.valueOf(this.f6827b).hashCode()) * 31;
            boolean z = this.f6828c;
            if (z) {
                z = true;
            }
            return a + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UserPanelInfo(descendantCount=");
            sb.append(this.f6826a);
            sb.append(", friendCount=");
            sb.append(this.f6827b);
            sb.append(", hasLegacyUnlock=");
            sb.append(this.f6828c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$b */
    static final class C2222b<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C2222b f6829e = new C2222b();

        C2222b() {
        }

        /* renamed from: a */
        public final List<C2241c> mo8084a(List<C2241c> list) {
            C12932j.m33818b(list, "it");
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo8084a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$c */
    static final class C2223c<T> implements Predicate<C2241c> {

        /* renamed from: e */
        final /* synthetic */ String f6830e;

        C2223c(String str) {
            this.f6830e = str;
        }

        /* renamed from: a */
        public final boolean test(C2241c cVar) {
            C12932j.m33818b(cVar, "it");
            return C12932j.m33817a((Object) cVar.f6861f, (Object) this.f6830e);
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$d */
    static final class C2224d implements Action {

        /* renamed from: a */
        final /* synthetic */ String f6831a;

        C2224d(String str) {
            this.f6831a = str;
        }

        public final void run() {
            C12143a.m32027a("Done listening for changes for the %s pack", this.f6831a);
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$e */
    static final class C2225e<T1, T2> implements BiPredicate<C2241c, C2241c> {

        /* renamed from: a */
        public static final C2225e f6832a = new C2225e();

        C2225e() {
        }

        /* renamed from: a */
        public final boolean test(C2241c cVar, C2241c cVar2) {
            C12932j.m33818b(cVar, "oldPack");
            C12932j.m33818b(cVar2, "newPack");
            return cVar.f6864i.length == cVar2.f6864i.length && cVar.f6858c == cVar2.f6858c && cVar.f6859d == cVar2.f6859d;
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$f */
    public static final class C2226f<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ boolean f6833a;

        public C2226f(boolean z) {
            this.f6833a = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0112 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r22, T2 r23) {
            /*
                r21 = this;
                r0 = r23
                app.zenly.locator.chat.panel.emojis.b0$a r0 = (app.zenly.locator.chat.panel.emojis.C2220b0.C2221a) r0
                r1 = r22
                java.util.List r1 = (java.util.List) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0011:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0036
                java.lang.Object r3 = r1.next()
                r4 = r3
                app.zenly.locator.chat.panel.emojis.d0 r4 = (app.zenly.locator.chat.panel.emojis.C2234d0) r4
                app.zenly.locator.chat.panel.emojis.b0 r5 = app.zenly.locator.chat.panel.emojis.C2220b0.f6825c
                java.util.List r5 = app.zenly.locator.chat.panel.emojis.C2220b0.f6824b
                co.znly.models.services.w3 r4 = r4.mo8093b()
                co.znly.models.services.w3$b r4 = r4.getUnlockType()
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L_0x0011
                r2.add(r3)
                goto L_0x0011
            L_0x0036:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x003f:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0061
                java.lang.Object r3 = r2.next()
                r6 = r3
                app.zenly.locator.chat.panel.emojis.d0 r6 = (app.zenly.locator.chat.panel.emojis.C2234d0) r6
                co.znly.models.services.w3 r6 = r6.mo8093b()
                int r6 = r6.getEmojisCount()
                r7 = 5
                if (r6 < r7) goto L_0x005a
                goto L_0x005b
            L_0x005a:
                r4 = 0
            L_0x005b:
                if (r4 == 0) goto L_0x003f
                r1.add(r3)
                goto L_0x003f
            L_0x0061:
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = kotlin.collections.C12850p.m33647a(r1, r3)
                r2.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
                r3 = 0
            L_0x0071:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x0121
                java.lang.Object r6 = r1.next()
                int r7 = r3 + 1
                if (r3 < 0) goto L_0x011a
                app.zenly.locator.chat.panel.emojis.d0 r6 = (app.zenly.locator.chat.panel.emojis.C2234d0) r6
                app.zenly.locator.chat.panel.emojis.b0 r8 = app.zenly.locator.chat.panel.emojis.C2220b0.f6825c
                java.lang.String r9 = "panelInfo"
                kotlin.jvm.internal.C12932j.m33815a(r0, r9)
                int r14 = r8.m8091b(r6, r0)
                if (r14 <= 0) goto L_0x0090
                r13 = 1
                goto L_0x0091
            L_0x0090:
                r13 = 0
            L_0x0091:
                co.znly.models.services.w3 r8 = r6.mo8093b()
                java.lang.String r8 = r8.getUuid()
                java.lang.String r9 = "pack.pack.uuid"
                kotlin.jvm.internal.C12932j.m33815a(r8, r9)
                co.znly.models.services.w3 r9 = r6.mo8093b()
                java.lang.String r9 = r9.getName()
                java.lang.String r10 = "pack.pack.name"
                kotlin.jvm.internal.C12932j.m33815a(r9, r10)
                if (r3 != 0) goto L_0x00b5
                r3 = r21
                boolean r10 = r3.f6833a
                if (r10 == 0) goto L_0x00b7
                r11 = 1
                goto L_0x00b8
            L_0x00b5:
                r3 = r21
            L_0x00b7:
                r11 = 0
            L_0x00b8:
                co.znly.models.services.w3 r10 = r6.mo8093b()
                int r15 = r10.getUnlockValue()
                co.znly.models.services.w3 r10 = r6.mo8093b()
                co.znly.models.services.w3$b r12 = r10.getUnlockType()
                java.lang.String r10 = "pack.pack.unlockType"
                kotlin.jvm.internal.C12932j.m33815a(r12, r10)
                java.lang.String r18 = r6.mo8094c()
                co.znly.models.services.w3 r6 = r6.mo8093b()
                java.util.List r6 = r6.getEmojisList()
                java.lang.String r10 = "pack.pack.emojisList"
                kotlin.jvm.internal.C12932j.m33815a(r6, r10)
                co.znly.models.services.u3[] r10 = new p213co.znly.models.services.C8307u3[r5]
                java.lang.Object[] r6 = r6.toArray(r10)
                if (r6 == 0) goto L_0x0112
                r20 = r6
                co.znly.models.services.u3[] r20 = (p213co.znly.models.services.C8307u3[]) r20
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                if (r13 == 0) goto L_0x00f4
                java.lang.String r10 = "_blur_gray"
                goto L_0x00f6
            L_0x00f4:
                java.lang.String r10 = ""
            L_0x00f6:
                r6.append(r10)
                java.lang.String r10 = "@2x.png"
                r6.append(r10)
                java.lang.String r19 = r6.toString()
                app.zenly.locator.chat.panel.emojis.f0.c r6 = new app.zenly.locator.chat.panel.emojis.f0.c
                r10 = r6
                r16 = r9
                r17 = r8
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r2.add(r6)
                r3 = r7
                goto L_0x0071
            L_0x0112:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)
                throw r0
            L_0x011a:
                r3 = r21
                kotlin.collections.C12844m.m33616c()
                r0 = 0
                throw r0
            L_0x0121:
                r3 = r21
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.panel.emojis.C2220b0.C2226f.apply(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$g */
    static final class C2227g<T> implements Consumer<List<? extends C2241c>> {

        /* renamed from: e */
        public static final C2227g f6834e = new C2227g();

        C2227g() {
        }

        /* renamed from: a */
        public final void accept(List<C2241c> list) {
            C2220b0.f6823a.onNext(list);
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$h */
    static final class C2228h<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2228h f6835e = new C2228h();

        C2228h() {
        }

        /* renamed from: a */
        public final C2221a apply(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "user");
            C6926b events = userProto$User.getEvents();
            C12932j.m33815a((Object) events, "user.events");
            return new C2221a(events.getInviterCount(), userProto$User.getFriendsCount(), C2220b0.f6825c.m8090a(userProto$User));
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$i */
    static final class C2229i<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2229i f6836e = new C2229i();

        C2229i() {
        }

        /* renamed from: a */
        public final boolean mo8089a(C2241c cVar) {
            C12932j.m33818b(cVar, "pack");
            return cVar.f6858c;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo8089a((C2241c) obj));
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.b0$j */
    static final class C2230j<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C2230j f6837e = new C2230j();

        C2230j() {
        }

        /* renamed from: a */
        public final boolean test(Boolean bool) {
            C12932j.m33818b(bool, "locked");
            return !bool.booleanValue();
        }
    }

    /* JADX INFO: used method not loaded: kotlin.collections.o.b(java.lang.Object[]):null, types can be incorrect */
    static {
        C12785a<List<C2241c>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<List<EmojiPack>>()");
        f6823a = u;
    }

    private C2220b0() {
    }

    /* renamed from: b */
    public static final C12279e<Boolean> m8092b(String str) {
        C12932j.m33818b(str, "uuid");
        C12279e<Boolean> e = m8086a(str).mo36501i(C2229i.f6836e).mo36477d().mo36459b((Predicate<? super T>) C2230j.f6837e).mo36487e(1);
        C12932j.m33815a((Object) e, "loadPack(uuid)\n         …ed }\n            .take(1)");
        return e;
    }

    /* renamed from: a */
    public static final C12279e<List<C2241c>> m8087a(String str, Context context) {
        C12932j.m33818b(str, "targetUuid");
        C12932j.m33818b(context, "context");
        boolean a = C3444a.m10686a(context).mo6511a("feature:requestMedia");
        C12279e a2 = C2277z.m8174a(str);
        C12774b bVar = C12774b.f33320a;
        C12279e d = f6825c.m8085a().mo36477d();
        C12932j.m33815a((Object) d, "loadUserCounts().distinctUntilChanged()");
        C12279e a3 = C12279e.m32610a((ObservableSource<? extends T1>) a2, (ObservableSource<? extends T2>) d, (BiFunction<? super T1, ? super T2, ? extends R>) new C2226f<Object,Object,Object>(a));
        C12932j.m33815a((Object) a3, "Observables.combineLates…              }\n        }");
        C12279e<List<C2241c>> b = a3.mo36455b((Consumer<? super T>) C2227g.f6834e);
        C12932j.m33815a((Object) b, "o.doOnNext { it -> emojiPacks.onNext(it) }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final int m8091b(C2234d0 d0Var, C2221a aVar) {
        int a = m8084a(d0Var, aVar);
        int a2 = m8083a(d0Var, aVar.mo8079b());
        return (a <= 0 || !aVar.mo8080c() || a2 != 0) ? a : a2;
    }

    /* renamed from: a */
    public static final C12279e<C2241c> m8086a(String str) {
        C12932j.m33818b(str, "uuid");
        C12143a.m32027a("Listening for changes for the %s pack", str);
        C12279e<C2241c> a = f6823a.mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C2222b.f6829e).mo36459b((Predicate<? super T>) new C2223c<Object>(str)).mo36467c((Action) new C2224d(str)).mo36431a((BiPredicate<? super T, ? super T>) C2225e.f6832a);
        C12932j.m33815a((Object) a, "emojiPacks.flatMapIterab…issingValue\n            }");
        return a;
    }

    /* renamed from: a */
    private final C12279e<C2221a> m8085a() {
        C12279e<C2221a> i = C5448c.m15478a().userMeStream().mo36501i(C2228h.f6835e);
        C12932j.m33815a((Object) i, "ZenlyCoreProvider.get().…yPanelUnlock())\n        }");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m8090a(UserProto$User userProto$User) {
        Timestamp createdAt = userProto$User.getCreatedAt();
        C12932j.m33815a((Object) createdAt, "createdAt");
        return createdAt.getSeconds() < ((long) 1539129600);
    }

    /* renamed from: a */
    private final int m8083a(C2234d0 d0Var, int i) {
        return C12973l.m33885a(d0Var.mo8092a() - i, 0);
    }

    /* renamed from: a */
    private final int m8084a(C2234d0 d0Var, C2221a aVar) {
        int i;
        int i2;
        int i3;
        C8357b unlockType = d0Var.mo8093b().getUnlockType();
        if (unlockType != null) {
            int i4 = C2232c0.f6839a[unlockType.ordinal()];
            if (i4 == 1) {
                i3 = d0Var.mo8093b().getUnlockValue();
                i2 = aVar.mo8078a();
            } else if (i4 == 2) {
                i3 = d0Var.mo8093b().getUnlockValue();
                i2 = aVar.mo8079b();
            } else if (!(i4 == 3 || i4 == 4 || i4 == 5)) {
                throw new NoWhenBranchMatchedException();
            }
            i = i3 - i2;
            return C12973l.m33885a(i, 0);
        }
        i = 0;
        return C12973l.m33885a(i, 0);
    }
}
