package app.zenly.locator.friendshipfacts.p098k;

import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.friendshipfacts.p099l.C3809c;
import app.zenly.locator.friendshipfacts.p099l.C3810d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8001b5;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;

/* renamed from: app.zenly.locator.friendshipfacts.k.e */
public final class C3804e {

    /* renamed from: a */
    public static final C3804e f10135a = new C3804e();

    /* renamed from: app.zenly.locator.friendshipfacts.k.e$a */
    public static final class C3805a {

        /* renamed from: a */
        private final List<C3809c> f10136a;

        /* renamed from: b */
        private final List<C3809c> f10137b;

        public C3805a(List<C3809c> list, List<C3809c> list2) {
            C12932j.m33818b(list, "streakUsers");
            C12932j.m33818b(list2, "noSeeUsers");
            this.f10136a = list;
            this.f10137b = list2;
        }

        /* renamed from: a */
        public final List<C3809c> mo10373a() {
            return this.f10137b;
        }

        /* renamed from: b */
        public final List<C3809c> mo10374b() {
            return this.f10136a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f10137b, (java.lang.Object) r3.f10137b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof app.zenly.locator.friendshipfacts.p098k.C3804e.C3805a
                if (r0 == 0) goto L_0x001d
                app.zenly.locator.friendshipfacts.k.e$a r3 = (app.zenly.locator.friendshipfacts.p098k.C3804e.C3805a) r3
                java.util.List<app.zenly.locator.friendshipfacts.l.c> r0 = r2.f10136a
                java.util.List<app.zenly.locator.friendshipfacts.l.c> r1 = r3.f10136a
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.List<app.zenly.locator.friendshipfacts.l.c> r0 = r2.f10137b
                java.util.List<app.zenly.locator.friendshipfacts.l.c> r3 = r3.f10137b
                boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.friendshipfacts.p098k.C3804e.C3805a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List<C3809c> list = this.f10136a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C3809c> list2 = this.f10137b;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TopStreakUsers(streakUsers=");
            sb.append(this.f10136a);
            sb.append(", noSeeUsers=");
            sb.append(this.f10137b);
            sb.append(")");
            return sb.toString();
        }
    }

    private C3804e() {
    }

    /* renamed from: a */
    public final C3805a mo10372a(C8001b5 b5Var, List<C2936a0> list) {
        String str;
        String str2;
        List<C2936a0> list2 = list;
        C12932j.m33818b(b5Var, "tst");
        C12932j.m33818b(list2, "friends");
        ArrayList arrayList = new ArrayList();
        List tstsList = b5Var.getTstsList();
        C12932j.m33815a((Object) tstsList, "tst.tstsList");
        ArrayList<TimeTogetherProto$Tst> arrayList2 = new ArrayList<>();
        Iterator it = tstsList.iterator();
        while (true) {
            str = "it.ts";
            str2 = "it";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TimeTogetherProto$Tst timeTogetherProto$Tst = (TimeTogetherProto$Tst) next;
            C12932j.m33815a((Object) timeTogetherProto$Tst, str2);
            Timestamp ts = timeTogetherProto$Tst.getTs();
            C12932j.m33815a((Object) ts, str);
            if (!C3245z.m10286e(ts)) {
                arrayList2.add(next);
            }
        }
        for (TimeTogetherProto$Tst timeTogetherProto$Tst2 : arrayList2) {
            C12932j.m33815a((Object) timeTogetherProto$Tst2, str2);
            int streak = timeTogetherProto$Tst2.getStreak();
            int bestStreak = timeTogetherProto$Tst2.getBestStreak();
            String userId = timeTogetherProto$Tst2.getUserId();
            C12932j.m33815a((Object) userId, "it.userId");
            C2936a0 a = C3800a.m11273a(list2, userId);
            if (a != null) {
                UserProto$User a2 = a.mo9074a();
                if (a2 != null) {
                    Timestamp ts2 = timeTogetherProto$Tst2.getTs();
                    C12932j.m33815a((Object) ts2, str);
                    int a3 = C3245z.m10280a(ts2);
                    if (streak > 0) {
                        C3809c cVar = new C3809c(a2, streak, bestStreak, timeTogetherProto$Tst2.getOngoing(), a3);
                        arrayList.add(cVar);
                    } else if (a3 > 0 && a3 >= C3810d.m11296a()) {
                        C3809c cVar2 = new C3809c(a2, -a3, bestStreak, false, a3);
                        arrayList.add(cVar2);
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((C3809c) next2).mo10388b() > 0) {
                z = true;
            }
            if (z) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (((C3809c) next3).mo10388b() <= 0) {
                arrayList4.add(next3);
            }
        }
        return new C3805a(arrayList3, arrayList4);
    }
}
