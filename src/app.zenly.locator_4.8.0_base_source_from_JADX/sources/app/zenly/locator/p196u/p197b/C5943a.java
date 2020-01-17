package app.zenly.locator.p196u.p197b;

import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.experimental.referrer.ReferrerDetails;
import app.zenly.locator.p143s.p144i.C5427c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: app.zenly.locator.u.b.a */
public final class C5943a {

    /* renamed from: a */
    private final AnalyticsTracker f14961a;

    /* renamed from: b */
    private final ZenlyCore f14962b;

    /* renamed from: app.zenly.locator.u.b.a$a */
    public enum C5944a {
        ;

        /* renamed from: app.zenly.locator.u.b.a$a$a */
        static final class C5945a extends C5944a {
            C5945a(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: a */
            public C5427c mo13653a(int i) {
                C5427c cVar = new C5427c();
                cVar.mo12998a("z_track3exp_onboarding_no_friend_add_friend_button_tapped_dialog_type", "z_track3exp1var1_single_dialog");
                return cVar;
            }

            /* renamed from: b */
            public C5427c mo13654b(int i) {
                C5427c cVar = new C5427c();
                cVar.mo12998a("z_track3exp_onboarding_no_friend_dialog_type", "z_track3exp1var1_single_dialog");
                return cVar;
            }

            /* renamed from: a */
            public C5427c mo13652a() {
                C5427c cVar = new C5427c();
                cVar.mo12998a("z_track3exp_active_experiment", "z_track3exp1var1");
                return cVar;
            }
        }

        /* renamed from: app.zenly.locator.u.b.a$a$b */
        static final class C5946b extends C5944a {
            C5946b(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: a */
            public C5427c mo13653a(int i) {
                C5427c cVar = new C5427c();
                StringBuilder sb = new StringBuilder();
                sb.append("z_track3exp2var1_independant_dialog_");
                sb.append(i + 1);
                cVar.mo12998a("z_track3exp_onboarding_no_friend_add_friend_button_tapped_dialog_type", sb.toString());
                return cVar;
            }

            /* renamed from: b */
            public C5427c mo13654b(int i) {
                C5427c cVar = new C5427c();
                StringBuilder sb = new StringBuilder();
                sb.append("z_track3exp2var1_independant_dialog_");
                sb.append(i + 1);
                cVar.mo12998a("z_track3exp_onboarding_no_friend_dialog_type", sb.toString());
                return cVar;
            }

            /* renamed from: a */
            public C5427c mo13652a() {
                C5427c cVar = new C5427c();
                cVar.mo12998a("z_track3exp_active_experiment", "z_track3exp2var1");
                return cVar;
            }
        }

        /* renamed from: app.zenly.locator.u.b.a$a$c */
        static final class C5947c extends C5944a {
            C5947c(String str, int i) {
                super(str, i, null);
            }

            /* renamed from: a */
            public C5427c mo13653a(int i) {
                C5427c cVar = new C5427c();
                StringBuilder sb = new StringBuilder();
                sb.append("z_track3exp3var1_carousel_card_");
                sb.append(i + 1);
                cVar.mo12998a("z_track3exp_onboarding_no_friend_add_friend_button_tapped_carousel_type", sb.toString());
                return cVar;
            }

            /* renamed from: b */
            public C5427c mo13654b(int i) {
                C5427c cVar = new C5427c();
                cVar.mo12998a("z_track3exp_onboarding_no_friend_carousel_type", "z_track3exp3var1_carousel");
                return cVar;
            }

            /* renamed from: a */
            public C5427c mo13652a() {
                C5427c cVar = new C5427c();
                cVar.mo12998a("z_track3exp_active_experiment", "z_track3exp3var1");
                return cVar;
            }
        }

        /* renamed from: a */
        public abstract C5427c mo13652a();

        /* renamed from: a */
        public abstract C5427c mo13653a(int i);

        /* renamed from: b */
        public abstract C5427c mo13654b(int i);
    }

    public C5943a(AnalyticsTracker analyticsTracker, ZenlyCore zenlyCore) {
        C12932j.m33818b(analyticsTracker, "analyticsTracker");
        C12932j.m33818b(zenlyCore, "zenlyCore");
        this.f14961a = analyticsTracker;
        this.f14962b = zenlyCore;
    }

    /* renamed from: a */
    public final void mo13640a(C5944a aVar) {
        C12932j.m33818b(aVar, "variation");
        mo13641a(aVar, -1);
    }

    /* renamed from: b */
    public final void mo13647b(C5944a aVar, int i) {
        C12932j.m33818b(aVar, "variation");
        this.f14961a.track(aVar == C5944a.f14965g ? "Z_Track3Exp Onboarding No Friend Carousel Opened" : "Z_Track3Exp Onboarding No Friend Dialog Opened", aVar.mo13654b(i));
    }

    /* renamed from: c */
    public final void mo13650c(C5944a aVar) {
        C12932j.m33818b(aVar, "variation");
        mo13647b(aVar, -1);
    }

    /* renamed from: d */
    public final void mo13651d() {
        AnalyticsTracker analyticsTracker = this.f14961a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("z_track4exp_unlock_hinter_displayed_type", "z_track4exp2var1_watchers");
        analyticsTracker.track("Z_Track4Exp Unlock Hinter Displayed", cVar);
    }

    /* renamed from: a */
    public final void mo13641a(C5944a aVar, int i) {
        C12932j.m33818b(aVar, "variation");
        this.f14961a.track(aVar == C5944a.f14965g ? "Z_Track3Exp Onboarding No Friend Carousel Add Friend Button Tapped" : "Z_Track3Exp Onboarding No Friend Dialog Add Friend Button Tapped", aVar.mo13653a(i));
    }

    /* renamed from: c */
    public final void mo13649c() {
        AnalyticsTracker analyticsTracker = this.f14961a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("z_track4exp_explanatory_dialog_display_type", "z_track4exp2var1_watchers");
        analyticsTracker.track("Z_Track4Exp Explanatory Dialog Displayed", cVar);
    }

    /* renamed from: b */
    public final void mo13646b(C5944a aVar) {
        C12932j.m33818b(aVar, "variation");
        this.f14961a.track("Z_Track3Exp Check", aVar.mo13652a());
    }

    /* renamed from: b */
    public final void mo13645b(ReferrerDetails referrerDetails) {
        C5427c cVar;
        AnalyticsTracker analyticsTracker = this.f14961a;
        if (referrerDetails != null) {
            cVar = new C5427c();
            cVar.mo12998a("z_track5exp_friend_request_to_invite_sender_originated_from_platform", referrerDetails.mo10276b().mo10289a());
            cVar.mo12998a("z_track5exp_friend_request_to_invite_sender_originated_from_channel", referrerDetails.mo10275a().mo10283a());
            cVar.mo12998a("z_track5exp_friend_request_to_invite_sender_originited_from_type", referrerDetails.mo10277c().mo10292a());
        } else {
            cVar = null;
        }
        analyticsTracker.track("Z_Track5Exp Friend Request Sent To Invite Sender", cVar);
    }

    /* renamed from: a */
    public final void mo13638a() {
        C6770e experimentFlags = this.f14962b.experimentFlags();
        C6775d dVar = null;
        String str = "z_track3exp_active_experiment";
        String str2 = "Z_Track3Exp Check";
        if ((experimentFlags != null ? experimentFlags.getNoFriendsSingleDialog() : null) != C6775d.GROUP_CONTROL_A) {
            if ((experimentFlags != null ? experimentFlags.getNoFriendsSingleDialog() : null) != C6775d.GROUP_CONTROL_B) {
                if ((experimentFlags != null ? experimentFlags.getNoFriendsMultipleDialogs() : null) != C6775d.GROUP_CONTROL_A) {
                    if ((experimentFlags != null ? experimentFlags.getNoFriendsMultipleDialogs() : null) != C6775d.GROUP_CONTROL_B) {
                        if ((experimentFlags != null ? experimentFlags.getNoFriendsCarousel() : null) != C6775d.GROUP_CONTROL_A) {
                            if (experimentFlags != null) {
                                dVar = experimentFlags.getNoFriendsCarousel();
                            }
                            if (dVar != C6775d.GROUP_CONTROL_B) {
                                return;
                            }
                        }
                        AnalyticsTracker analyticsTracker = this.f14961a;
                        C5427c cVar = new C5427c();
                        cVar.mo12998a(str, "z_track3exp3var1");
                        analyticsTracker.track(str2, cVar);
                        return;
                    }
                }
                AnalyticsTracker analyticsTracker2 = this.f14961a;
                C5427c cVar2 = new C5427c();
                cVar2.mo12998a(str, "z_track3exp2var1");
                analyticsTracker2.track(str2, cVar2);
                return;
            }
        }
        AnalyticsTracker analyticsTracker3 = this.f14961a;
        C5427c cVar3 = new C5427c();
        cVar3.mo12998a(str, "z_track3exp1var1");
        analyticsTracker3.track(str2, cVar3);
    }

    /* renamed from: b */
    public final void mo13644b() {
        AnalyticsTracker analyticsTracker = this.f14961a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("z_track4exp_explanatory_dialog_button_tap_type", "z_track4exp2var1_watchers");
        analyticsTracker.track("Z_Track4Exp Explanatory Dialog Add Friend Button Tapped", cVar);
    }

    /* renamed from: a */
    public final void mo13639a(ReferrerDetails referrerDetails) {
        C12932j.m33818b(referrerDetails, "referrerDetails");
        AnalyticsTracker analyticsTracker = this.f14961a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("z_track5exp_invite_from_tracked_link_sent_from_platform", referrerDetails.mo10276b().mo10289a());
        cVar.mo12998a("z_track5exp_invite_from_tracked_link_sent_from_channel", referrerDetails.mo10275a().mo10283a());
        cVar.mo12998a("z_track5exp_invite_from_tracked_link_sent_type", referrerDetails.mo10277c().mo10292a());
        analyticsTracker.track("Z_Track5Exp Invite From Tracked Link Detected", cVar);
    }

    /* renamed from: b */
    public final void mo13648b(boolean z) {
        AnalyticsTracker analyticsTracker = this.f14961a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("z_track4exp3_quick_add_dismissed_version", "z_track4exp3var1");
        cVar.mo12998a("z_track4exp3_quick_add_dismissed_from", "z_track4exp3var1_inbox");
        cVar.mo12998a("z_track4exp3_quick_add_dismissed_type", z ? "z_track4exp3var1_contact" : "z_track4exp3var1_aoz");
        analyticsTracker.track("Z_Track4Exp3 Quick Add Dismissed", cVar);
    }

    /* renamed from: a */
    public final void mo13642a(C6775d dVar) {
        C5427c cVar;
        C12932j.m33818b(dVar, "group");
        AnalyticsTracker analyticsTracker = this.f14961a;
        int i = C5948b.f14967a[dVar.ordinal()];
        String str = "z_track4exp_active_experiment";
        if (i == 1) {
            cVar = new C5427c();
            cVar.mo12998a(str, "z_track4exp2var1_watchers");
        } else if (i == 2) {
            cVar = new C5427c();
            cVar.mo12998a(str, "z_track4exp2var1_watchers_control_a");
        } else if (i != 3) {
            cVar = new C5427c();
        } else {
            cVar = new C5427c();
            cVar.mo12998a(str, "z_track4exp2var1_watchers_control_b");
        }
        analyticsTracker.track("Z_Track4Exp Eligible", cVar);
    }

    /* renamed from: a */
    public final void mo13643a(boolean z) {
        AnalyticsTracker analyticsTracker = this.f14961a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("z_track4exp3_quick_add_added_version", "z_track4exp3var1");
        cVar.mo12998a("z_track4exp3_quick_add_added_from", "z_track4exp3var1_inbox");
        cVar.mo12998a("z_track4exp3_quick_add_added_type", z ? "z_track4exp3var1_contact" : "z_track4exp3var1_aoz");
        analyticsTracker.track("Z_Track4Exp3 Quick Add Added", cVar);
    }
}
