package app.zenly.locator.recommendation;

import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker.C2442a;
import app.zenly.locator.p143s.p144i.C5427c;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.d */
public final class C5245d {

    /* renamed from: a */
    private final AnalyticsTracker f13524a;

    /* renamed from: app.zenly.locator.recommendation.d$a */
    public enum C5246a {
        CARD_MATCHMAKING("card_matchmaking"),
        PROFILE_OTHER("profile_other"),
        FRIEND_REQUEST_ACCEPTED("friend_request_accepted"),
        FRIEND_REQUEST_SENT("friend_request_sent");
        

        /* renamed from: e */
        private final String f13530e;

        private C5246a(String str) {
            this.f13530e = str;
        }

        /* renamed from: a */
        public final String mo12596a() {
            return this.f13530e;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.d$b */
    public enum C5247b {
        CARD("card"),
        LIST("list");
        

        /* renamed from: e */
        private final String f13534e;

        private C5247b(String str) {
            this.f13534e = str;
        }

        /* renamed from: a */
        public final String mo12597a() {
            return this.f13534e;
        }
    }

    public C5245d(AnalyticsTracker analyticsTracker) {
        C12932j.m33818b(analyticsTracker, "analyticsTracker");
        this.f13524a = analyticsTracker;
    }

    /* renamed from: a */
    public final void mo12592a() {
        C2442a.m8540a(this.f13524a, "Profile Other Friend Recommendation Tapped", null, 2, null);
    }

    /* renamed from: b */
    public final void mo12595b(C5246a aVar) {
        C12932j.m33818b(aVar, "initiatedBy");
        AnalyticsTracker analyticsTracker = this.f13524a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("friend_recommendation_matchmaking_display_initiated_by", aVar.mo12596a());
        analyticsTracker.track("Friend Recommendation List Matchmaking Displayed", cVar);
    }

    /* renamed from: a */
    public final void mo12593a(C5246a aVar) {
        C12932j.m33818b(aVar, "initiatedBy");
        AnalyticsTracker analyticsTracker = this.f13524a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("friend_recommendation_matchmaking_display_initiated_by", aVar.mo12596a());
        analyticsTracker.track("Friend Recommendation Card Matchmaking Displayed", cVar);
    }

    /* renamed from: a */
    public final void mo12594a(C5247b bVar) {
        C12932j.m33818b(bVar, "recommendationType");
        AnalyticsTracker analyticsTracker = this.f13524a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("friend_recommendation_type", bVar.mo12597a());
        analyticsTracker.track("Friend Recommendation Sent", cVar);
    }
}
