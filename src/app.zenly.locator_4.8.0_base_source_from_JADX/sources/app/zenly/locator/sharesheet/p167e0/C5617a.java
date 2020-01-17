package app.zenly.locator.sharesheet.p167e0;

import app.zenly.locator.core.store.api.FriendStore;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.core.C7117i;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.sharesheet.e0.a */
public final class C5617a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ZenlyCore f14358a;

    /* renamed from: b */
    private final FriendStore f14359b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Comparator<C7117i> f14360c;

    /* renamed from: app.zenly.locator.sharesheet.e0.a$a */
    static final class C5618a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C5617a f14361e;

        /* renamed from: app.zenly.locator.sharesheet.e0.a$a$a */
        static final class C5619a extends C12933k implements Function1<C7117i, Boolean> {

            /* renamed from: f */
            public static final C5619a f14362f = new C5619a();

            C5619a() {
                super(1);
            }

            /* renamed from: a */
            public final boolean mo13269a(C7117i iVar) {
                C12932j.m33815a((Object) iVar, "it");
                return iVar.getOthersCount() > 0;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo13269a((C7117i) obj));
            }
        }

        /* renamed from: app.zenly.locator.sharesheet.e0.a$a$b */
        static final class C5620b extends C12933k implements Function1<C7117i, Boolean> {

            /* renamed from: f */
            final /* synthetic */ Map f14363f;

            C5620b(Map map) {
                this.f14363f = map;
                super(1);
            }

            /* renamed from: a */
            public final boolean mo13270a(C7117i iVar) {
                boolean z;
                C12932j.m33815a((Object) iVar, "it");
                if (!iVar.getIsGroup()) {
                    Map map = this.f14363f;
                    Object obj = iVar.getOthersList().get(0);
                    C12932j.m33815a(obj, "it.othersList[0]");
                    if (map.containsKey(((C6818b) obj).getUserUuid())) {
                        z = true;
                        boolean z2 = !iVar.getIsGroup() && !iVar.getHasLeft();
                        if (z && !z2) {
                            return false;
                        }
                    }
                }
                z = false;
                if (!iVar.getIsGroup()) {
                }
                return z ? true : true;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo13270a((C7117i) obj));
            }
        }

        C5618a(C5617a aVar) {
            this.f14361e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            if (r0 != null) goto L_0x001c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<p213co.znly.models.core.C7117i> apply(java.util.Map<java.lang.String, app.zenly.locator.core.store.api.C2936a0> r3) {
            /*
                r2 = this;
                java.lang.String r0 = "friends"
                kotlin.jvm.internal.C12932j.m33818b(r3, r0)
                app.zenly.locator.sharesheet.e0.a r0 = r2.f14361e
                co.znly.core.ZenlyCore r0 = r0.f14358a
                co.znly.models.core.n r0 = r0.inboxCache()
                if (r0 == 0) goto L_0x0018
                java.util.List r0 = r0.getConversationsList()
                if (r0 == 0) goto L_0x0018
                goto L_0x001c
            L_0x0018:
                java.util.List r0 = kotlin.collections.C12848o.m33640a()
            L_0x001c:
                kotlin.sequences.Sequence r0 = kotlin.collections.C12857w.m33671b(r0)
                app.zenly.locator.sharesheet.e0.a$a$a r1 = app.zenly.locator.sharesheet.p167e0.C5617a.C5618a.C5619a.f14362f
                kotlin.sequences.Sequence r0 = kotlin.sequences.C12990j.m33926a(r0, r1)
                app.zenly.locator.sharesheet.e0.a$a$b r1 = new app.zenly.locator.sharesheet.e0.a$a$b
                r1.<init>(r3)
                kotlin.sequences.Sequence r3 = kotlin.sequences.C12990j.m33926a(r0, r1)
                app.zenly.locator.sharesheet.e0.a r0 = r2.f14361e
                java.util.Comparator r0 = r0.f14360c
                kotlin.sequences.Sequence r3 = kotlin.sequences.C12990j.m33925a(r3, r0)
                java.util.List r3 = kotlin.sequences.C12990j.m33935g(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.sharesheet.p167e0.C5617a.C5618a.apply(java.util.Map):java.util.List");
        }
    }

    public C5617a(ZenlyCore zenlyCore, FriendStore friendStore, Comparator<C7117i> comparator) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(comparator, "conversationComparator");
        this.f14358a = zenlyCore;
        this.f14359b = friendStore;
        this.f14360c = comparator;
    }

    /* renamed from: a */
    public final C12279e<List<C7117i>> mo13267a() {
        C12279e<List<C7117i>> i = this.f14359b.friendsMap().mo36487e(1).mo36501i(new C5618a(this));
        C12932j.m33815a((Object) i, "friendStore.friendsMap()…  .toList()\n            }");
        return i;
    }
}
