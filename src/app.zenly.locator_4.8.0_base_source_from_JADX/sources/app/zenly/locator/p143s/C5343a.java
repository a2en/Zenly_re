package app.zenly.locator.p143s;

import android.text.TextUtils;
import android.util.SparseArray;
import app.zenly.locator.chat.panel.emojis.C2234d0;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.FriendRequestTrackingInfo;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.onboarding.p125y3.C4947a;
import app.zenly.locator.p143s.p144i.C5427c;
import app.zenly.locator.p143s.p144i.C5428d;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7354j0.C7360e;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7243w0;
import p213co.znly.models.services.C8355w3.C8357b;

/* renamed from: app.zenly.locator.s.a */
public final class C5343a {

    /* renamed from: b */
    private static C5343a f13770b;

    /* renamed from: a */
    private final AnalyticsTracker f13771a;

    /* renamed from: app.zenly.locator.s.a$a */
    static /* synthetic */ class C5344a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13772a = new int[C8357b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                co.znly.models.services.w3$b[] r0 = p213co.znly.models.services.C8355w3.C8357b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13772a = r0
                int[] r0 = f13772a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.services.w3$b r1 = p213co.znly.models.services.C8355w3.C8357b.UNLOCK_EVENT_INVITER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13772a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.services.w3$b r1 = p213co.znly.models.services.C8355w3.C8357b.UNLOCK_FRIENDS_COUNT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13772a     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.models.services.w3$b r1 = p213co.znly.models.services.C8355w3.C8357b.UNLOCK_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f13772a     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.models.services.w3$b r1 = p213co.znly.models.services.C8355w3.C8357b.UNLOCK_NOT_LOCKED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f13772a     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.models.services.w3$b r1 = p213co.znly.models.services.C8355w3.C8357b.UNRECOGNIZED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p143s.C5343a.C5344a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.s.a$b */
    public enum C5345b {
        BATTERY("support_deletion_done_reasons_battery"),
        BUGS("support_deletion_done_reasons_bugs"),
        CONTROL("support_deletion_done_reasons_control"),
        FRIENDS("support_deletion_done_reasons_friends"),
        OTHER("support_deletion_done_reasons_other"),
        USAGE("support_deletion_done_reasons_usage"),
        VALUE("support_deletion_done_reasons_value");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13781e;

        private C5345b(String str) {
            this.f13781e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$c */
    public enum C5346c {
        BANNED("account_banned"),
        DELETION("account_pending_deletion"),
        GDPR("account_gdpr_gated"),
        SUSPENDED("account_suspended"),
        SUSPENDED_BLOCKED_TOO_MANY_TIMES("account_suspended_blocked_too_many_times"),
        UNDER_REVIEW("account_under_review");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13789e;

        private C5346c(String str) {
            this.f13789e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$d */
    public enum C5347d {
        BUMP("bump"),
        CONTACT_JOINED("contact_joined"),
        FRIEND_RECOMMENDATION("friend_recommendation"),
        USERNAME("username");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13795e;

        private C5347d(String str) {
            this.f13795e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$e */
    public enum C5348e {
        BEST_FRIEND("best_friend"),
        MUTUAL_LOVE("mutual_love"),
        EMPTY("empty");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13800e;

        private C5348e(String str) {
            this.f13800e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$f */
    public enum C5349f {
        FRIEND("friend"),
        NOT_FRIEND("not_friend");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13804e;

        private C5349f(String str) {
            this.f13804e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$g */
    public enum C5350g {
        COUNT("descendants_count"),
        COUNT_EMPTY("descendants_count_empty"),
        LEADERBOARD("descendants_leaderboard"),
        INTERNATIONAL_RANK("descendants_international_rank"),
        INTERNATIONAL_RANK_EMPTY("descendants_international_rank_empty");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13811e;

        private C5350g(String str) {
            this.f13811e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$h */
    public enum C5351h {
        BUTTON_TAP("tap"),
        SWIPE("swipe");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13815e;

        private C5351h(String str) {
            this.f13815e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$i */
    public enum C5352i {
        FRIENDSHIP_LAST_TIME_MET_LONG_TIME_NO_SEE("long_time_no_see"),
        FRIENDSHIP_LAST_TIME_MET_STREAK("streak"),
        FRIENDSHIP_TIMES_MET("times_met"),
        FRIENDSHIP_TIME_TOGETHER("time_together"),
        FRIENDSHIP_FRIENDSHIP_AGE("friendship_age");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13822e;

        private C5352i(String str) {
            this.f13822e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$j */
    public enum C5353j {
        BUTTON_TAP("button_tap"),
        STATUS("in_chat_status_tap"),
        TOSS("toss");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13827e;

        private C5353j(String str) {
            this.f13827e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$k */
    public enum C5354k {
        INDIV("indiv"),
        GROUP("group"),
        FOG("fog");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13832e;

        private C5354k(String str) {
            this.f13832e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$l */
    public enum C5355l {
        DESCENDANTS_COUNT_EMPTY("descendant_count_empty"),
        DESCENDANTS_LIST("descendant_list"),
        DESCENDANTS_WORLD_RANK_EMPTY("descendant_worldwide_rank_empty"),
        EMOJI_PANEL_DESCENDANT_1("emoji_pack_type_descendant_1"),
        EMOJI_PANEL_DESCENDANT_2("emoji_pack_type_descendant_2"),
        DASHBOARD_EMPTY("dashboard_suggested_empty");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13840e;

        private C5355l(String str) {
            this.f13840e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$m */
    public enum C5356m {
        BUTTON("button"),
        KEYBOARD("keyboard");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13844e;

        private C5356m(String str) {
            this.f13844e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$n */
    public enum C5357n {
        ALREADY_ON_ZENLY("already_on_zenly"),
        BEST_FRIENDS("best_friends"),
        CONTACTS("contacts"),
        EMPTY_BEST_FRIEND("empty_best_friend"),
        FRIENDS("friends"),
        GLOBAL_ADD_FRIENDS_BUTTON("global_add_friends_button"),
        RECENTLY_SEARCHED("recently_searched"),
        RECENTLY_VIEWED("recently_viewed"),
        SUGGESTED("suggested"),
        SUGGESTED_ADD_FRIEND_BUTTON("suggested_add_friend_button"),
        SUGGESTED_INVITE_CONTACT_BUTTON("suggested_invite_contact_button"),
        SUGGESTED_DISMISS_BUTTON("suggested_dismiss_button"),
        TELL_YOUR_FRIENDS_BUTTON("tell_your_friends_button");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13859e;

        private C5357n(String str) {
            this.f13859e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$o */
    public enum C5358o {
        GROUP("group"),
        INDIV("indiv");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13863e;

        private C5358o(String str) {
            this.f13863e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$p */
    public enum C5359p {
        CHAT_MINI_AVATAR_TAPPED("chat_mini_avatar_tap"),
        MARKER_TAP("marker_tap"),
        OTHER("other"),
        PROFILE_BUTTON_TAP("profile_button_tap");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13869e;

        private C5359p(String str) {
            this.f13869e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$q */
    public enum C5360q {
        MESSAGE_RECEIVED("message_received"),
        EMOJI_RECEIVED("emoji_received"),
        COUNTRY_CHANGE_RECEIVED("country_change_received"),
        BUMP_RECEIVED("bump_received"),
        NO_FRIENDS("z_track3exp4var1");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13876e;

        private C5360q(String str) {
            this.f13876e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$r */
    public enum C5361r {
        ALREADY_FRIEND("already_friend"),
        NO_USER("no_user"),
        NO_USER_WARNING("no_user_warning"),
        NO_USER_RATE_LIMITED("no_user_rate_limited"),
        OWN_USERNAME("own_username"),
        TOO_MANY_SEARCH("too_many_search");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13884e;

        private C5361r(String str) {
            this.f13884e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$s */
    public enum C5362s {
        ADDED_FROM_LOCATION("added_from_location"),
        HOMETOWN("hometown"),
        NO_INFORMATION("no_information"),
        SCHOOL("mutual_school"),
        WORK("mutual_work");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13891e;

        private C5362s(String str) {
            this.f13891e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$t */
    public enum C5363t {
        PROFILE_CELL_TAP("profile_cell_tap"),
        SETTINGS_CELL_TAP("settings_cell_tap");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13895e;

        private C5363t(String str) {
            this.f13895e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$u */
    private static class C5364u {

        /* renamed from: a */
        private static final SparseArray<String> f13896a = new SparseArray<>();

        static {
            f13896a.put(0, "classic");
            f13896a.put(2, "dark");
            f13896a.put(5, "gold");
            f13896a.put(3, "jungle");
            f13896a.put(4, "lemonade");
            f13896a.put(1, "rainbow");
        }

        /* renamed from: a */
        public static String m15317a(int i) {
            String str = (String) f13896a.get(i);
            return str != null ? str : "classic";
        }
    }

    /* renamed from: app.zenly.locator.s.a$v */
    public enum C5365v {
        TALKED_TO_NON_FRIENDS_RATE_LIMITED("warning_talking_to_non_friends_rate_limited"),
        TOO_MANY_FRIEND_REQUESTS_RATE_LIMITED("warning_too_many_friend_requests_rate_limited");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13900e;

        private C5365v(String str) {
            this.f13900e = str;
        }
    }

    /* renamed from: app.zenly.locator.s.a$w */
    public enum C5366w {
        None("none"),
        WOOD("A"),
        BRONZE("B"),
        SILVER("C"),
        GOLD("D");
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String f13907e;

        private C5366w(String str) {
            this.f13907e = str;
        }
    }

    private C5343a(AnalyticsTracker analyticsTracker) {
        this.f13771a = analyticsTracker;
    }

    /* renamed from: U */
    public static C5343a m15160U() {
        return f13770b;
    }

    /* renamed from: a */
    public static void m15162a(AnalyticsTracker analyticsTracker) {
        f13770b = new C5343a(analyticsTracker);
    }

    /* renamed from: m */
    private void m15166m(String str) {
        this.f13771a.track(str, null);
    }

    /* renamed from: A */
    public void mo12786A() {
        m15166m("Profile Other Call Tapped");
    }

    /* renamed from: B */
    public void mo12787B() {
        m15166m("Profile Other Descendants Full Leaderboard Opened");
    }

    /* renamed from: C */
    public void mo12788C() {
        m15166m("Profile Other Friendship Stats Tapped");
    }

    /* renamed from: D */
    public void mo12789D() {
        m15166m("Profile Picture Dialog Change Picture Button Tapped");
    }

    /* renamed from: E */
    public void mo12790E() {
        m15166m("Profile Picture Dialog Chat Button Tapped");
    }

    /* renamed from: F */
    public void mo12791F() {
        m15166m("Profile Picture Dialog Opened");
    }

    /* renamed from: G */
    public void mo12792G() {
        m15166m("Suggested Add Friend Button Tapped");
    }

    /* renamed from: H */
    public void mo12793H() {
        m15166m("Suggested Cell Tapped");
    }

    /* renamed from: I */
    public void mo12794I() {
        m15166m("Suggested Invite Contact Button Tapped");
    }

    /* renamed from: J */
    public void mo12795J() {
        m15166m("Suggested Tell Your Friends Button Tapped");
    }

    /* renamed from: K */
    public void mo12796K() {
        m15166m("Support Opened");
    }

    /* renamed from: L */
    public void mo12797L() {
        m15166m("Support Ticket Submitted");
    }

    /* renamed from: M */
    public void mo12798M() {
        m15166m("Time Together Long Time No See Tapped");
    }

    /* renamed from: N */
    public void mo12799N() {
        m15166m("Time Together Streak Tapped");
    }

    /* renamed from: O */
    public void mo12800O() {
        m15166m("Username Me Changed");
    }

    /* renamed from: P */
    public void mo12801P() {
        m15166m("Username Me Generation Cancelled");
    }

    /* renamed from: Q */
    public void mo12802Q() {
        m15166m("Username Me Request Failed");
    }

    /* renamed from: R */
    public void mo12803R() {
        m15166m("Username Me Suggestion Tapped");
    }

    /* renamed from: S */
    public void mo12804S() {
        m15166m("Username Other Tapped");
    }

    /* renamed from: T */
    public void mo12805T() {
        m15166m("Watchers Dialog Add Friend Tapped");
    }

    /* renamed from: b */
    public void mo12855b() {
        this.f13771a.reset();
    }

    /* renamed from: c */
    public void mo12870c(String str, String str2) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("username_set", Boolean.valueOf(!TextUtils.isEmpty(str2)));
        m15164a(str, dVar);
    }

    /* renamed from: d */
    public void mo12873d(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        mo12840a("Group Info Opened", cVar);
    }

    /* renamed from: e */
    public void mo12876e() {
        m15166m("Account Deletion Confirm Button Tapped");
    }

    /* renamed from: f */
    public void mo12882f(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("discover_algorithm_version", Integer.valueOf(6));
        cVar.mo12998a("discover_gesture_type", str);
        mo12840a("Discover Replayed", cVar);
    }

    /* renamed from: g */
    public void mo12886g(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("invite_channel", str);
        mo12840a("Invite Sent", cVar);
    }

    /* renamed from: h */
    public void mo12890h(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("invite_share_sheet_app_name", str);
        mo12840a("Invite Share Sheet App Tapped", cVar);
    }

    /* renamed from: i */
    public void mo12893i(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("friendship_stats_card_share_type", str);
        mo12840a("Time Together Long Time No See Shared", cVar);
    }

    /* renamed from: j */
    public void mo12896j(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("friendship_stats_card_share_type", str);
        mo12840a("Time Together Streak Shared", cVar);
    }

    /* renamed from: k */
    public void mo12898k(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("username_me_exported_format", str);
        mo12840a("Username Me Exported", cVar);
    }

    /* renamed from: l */
    public void mo12899l() {
        m15166m("Chat Input Tapped");
    }

    /* renamed from: n */
    public void mo12902n() {
        m15166m("Dashboard Opened");
    }

    /* renamed from: o */
    public void mo12903o() {
        m15166m("Dashboard Overlay Tapped");
    }

    /* renamed from: p */
    public void mo12904p() {
        m15166m("Dashboard Search Canceled");
    }

    /* renamed from: q */
    public void mo12905q() {
        m15166m("Dashboard Search Focused");
    }

    /* renamed from: r */
    public void mo12906r() {
        m15166m("Data Safety Opened");
    }

    /* renamed from: s */
    public void mo12907s() {
        m15166m("Friendship Deleted");
    }

    /* renamed from: t */
    public void mo12908t() {
        m15166m("Group Inbox Button Tapped");
    }

    /* renamed from: u */
    public void mo12909u() {
        m15166m("Inbox Opened");
    }

    /* renamed from: v */
    public void mo12910v() {
        m15166m("Invite Canceled");
    }

    /* renamed from: w */
    public void mo12911w() {
        m15166m("Invite Share Sheet Opened");
    }

    /* renamed from: x */
    public void mo12912x() {
        m15166m("MyProfile Descendants Full Leaderboard Opened");
    }

    /* renamed from: y */
    public void mo12913y() {
        m15166m("MyProfile Descendants List Opened");
    }

    /* renamed from: z */
    public void mo12914z() {
        m15166m("MyProfile Opened");
    }

    /* renamed from: n */
    private void m15167n(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("hinter_displayed_type", str);
        mo12840a("Hinter Displayed", cVar);
    }

    /* renamed from: o */
    private void m15168o(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("hinter_tapped_type", str);
        mo12840a("Hinter Tapped", cVar);
    }

    /* renamed from: a */
    public AnalyticsTracker mo12806a() {
        return this.f13771a;
    }

    /* renamed from: b */
    public void mo12863b(String str, int i) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("friend_visible_on_map_count", Integer.valueOf(i));
        m15164a(str, dVar);
    }

    /* renamed from: c */
    public void mo12871c(boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_friend", Boolean.valueOf(z));
        mo12840a("Meet Opened", cVar);
    }

    /* renamed from: d */
    public void mo12875d(boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_private_mode_suggested_enabled", Boolean.valueOf(z));
        mo12840a("Private Mode Suggested Changed", cVar);
    }

    /* renamed from: e */
    public void mo12878e(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("discover_algorithm_version", Integer.valueOf(6));
        cVar.mo12998a("discover_gesture_type", str);
        mo12840a("Discover Previous Tapped", cVar);
    }

    /* renamed from: l */
    public void mo12900l(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("username_card_share_type", str);
        mo12840a("Username Other Shared", cVar);
    }

    /* renamed from: m */
    public void mo12901m() {
        m15166m("Chat Preview Item Tapped");
    }

    /* renamed from: a */
    public void mo12840a(String str, C5427c cVar) {
        this.f13771a.track(str, cVar);
    }

    /* renamed from: b */
    public void mo12862b(String str) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("support_ticket_submitted", Integer.valueOf(1));
        m15164a(str, dVar);
    }

    /* renamed from: a */
    private void m15164a(String str, C5428d dVar) {
        this.f13771a.identify(str, dVar);
    }

    /* renamed from: b */
    public void mo12865b(String str, boolean z) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("private_mode_limit_to_contacts_enabled", Boolean.valueOf(z));
        m15164a(str, dVar);
    }

    /* renamed from: g */
    public void mo12885g(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        mo12840a("Group Muted", cVar);
    }

    /* renamed from: h */
    public void mo12889h(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        mo12840a("Group Renamed", cVar);
    }

    /* renamed from: i */
    public void mo12891i() {
        m15166m("Add Friend Section Opened");
    }

    /* renamed from: j */
    public void mo12894j() {
        m15167n("bump");
    }

    /* renamed from: k */
    public void mo12897k() {
        m15168o("bump");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12833a(UserProto$User userProto$User, String[] strArr) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("Zen Build", Integer.valueOf(40080000));
        dVar.mo13001a("Friend Count", Integer.valueOf(userProto$User.getFriendsCount()));
        dVar.mo13001a("watchers_locked", Boolean.valueOf(userProto$User.getFriendsCount() < 3));
        try {
            dVar.mo13001a("createdAt", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz", Locale.getDefault()).format(userProto$User.getCreatedAt()));
        } catch (Exception unused) {
        }
        dVar.mo13001a("current_growth_experiment", strArr);
        dVar.mo13001a("avatar_set", Boolean.valueOf(C3194b0.m10163a(userProto$User)));
        dVar.mo13001a("username_set", Boolean.valueOf(!TextUtils.isEmpty(userProto$User.getUsername())));
        dVar.mo13001a("private_mode_limit_to_contacts_enabled", Boolean.valueOf(userProto$User.getPrivateMode()));
        dVar.mo13001a("private_mode_suggested_enabled", Boolean.valueOf(userProto$User.getOptOutSuggest()));
        dVar.mo13001a("descendants_count", Integer.valueOf(userProto$User.getEvents().getInviterCount()));
        String str = "";
        dVar.mo13001a("zenName", str);
        dVar.mo13001a("phone", str);
        dVar.mo13001a("avatar", str);
        m15164a(userProto$User.getUuid(), dVar);
    }

    /* renamed from: b */
    public void mo12864b(String str, String str2) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("play_services_version", str2);
        m15164a(str, dVar);
    }

    /* renamed from: c */
    public void mo12867c() {
        m15166m("Account Deletion Cancel Button Tapped");
    }

    /* renamed from: d */
    public void mo12874d(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("zenly_care_article_id", str);
        mo12840a("Care Article Share Tapped", cVar);
    }

    /* renamed from: f */
    public void mo12881f(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        mo12840a("Group Map Button Tapped", cVar);
    }

    /* renamed from: i */
    public void mo12892i(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("descendants_count", Integer.valueOf(i));
        mo12840a("MyProfile Descendants Stats Tapped", cVar);
    }

    /* renamed from: j */
    public void mo12895j(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("descendants_count", Integer.valueOf(i));
        mo12840a("Profile Other Descendants Stats Tapped", cVar);
    }

    /* renamed from: c */
    public void mo12868c(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        cVar.mo12998a("referrer", "map");
        mo12840a("Group Created", cVar);
    }

    /* renamed from: e */
    public void mo12877e(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        mo12840a("Group Left", cVar);
    }

    /* renamed from: g */
    public void mo12887g(boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("time_together_locked", Boolean.valueOf(z));
        mo12840a("Time Together Opened", cVar);
    }

    /* renamed from: h */
    public void mo12888h() {
        m15166m("Add By Username Tapped");
    }

    /* renamed from: b */
    private C5427c m15165b(C2234d0 d0Var) {
        int i = C5344a.f13772a[d0Var.mo8093b().getUnlockType().ordinal()];
        String str = null;
        if (i == 1) {
            str = "descendants";
        } else if (i == 2) {
            str = "friends";
        } else if (i == 3 || i == 4 || i == 5) {
            return null;
        }
        C5427c cVar = new C5427c();
        StringBuilder sb = new StringBuilder();
        sb.append(d0Var.mo8093b().getUnlockValue());
        sb.append("_");
        sb.append(str);
        cVar.mo12998a("emoji_pack_type", sb.toString());
        return cVar;
    }

    /* renamed from: d */
    public void mo12872d() {
        m15166m("Account Deletion Canceled");
    }

    /* renamed from: f */
    public void mo12883f(boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_zenly_user", Boolean.valueOf(z));
        mo12840a("Suggested Cell Dismissed", cVar);
    }

    /* renamed from: g */
    public void mo12884g() {
        m15166m("Add By Phone Number Opened");
    }

    /* renamed from: e */
    public void mo12879e(boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_private_mode_limit_to_contacts_enabled", Boolean.valueOf(z));
        mo12840a("Private Mode Limit to Contacts Changed", cVar);
    }

    /* renamed from: b */
    public void mo12857b(FriendRequestTrackingInfo friendRequestTrackingInfo) {
        mo12840a("Friend Request Sent", m15161a(friendRequestTrackingInfo.mo8611d(), Boolean.valueOf(friendRequestTrackingInfo.mo8613e()), friendRequestTrackingInfo.mo8615g(), friendRequestTrackingInfo.mo8610c(), friendRequestTrackingInfo.mo8609b(), null, friendRequestTrackingInfo.mo8608a()));
    }

    /* renamed from: c */
    public void mo12869c(String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("camera_type", str);
        mo12840a("Camera Opened", cVar);
    }

    /* renamed from: f */
    public void mo12880f() {
        m15166m("Add By Bumping Phones Section Opened");
    }

    /* renamed from: b */
    public void mo12858b(C2587f0 f0Var, Boolean bool, boolean z, Integer num, C5362s sVar) {
        mo12840a("Friend Request Denied", m15161a(f0Var, bool, null, z, num, sVar, false));
    }

    /* renamed from: b */
    public void mo12866b(boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("marker_focused_has_unread_item", Boolean.valueOf(z));
        mo12840a("Marker Focused", cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12843a(String str, String str2) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("app_flavor", str2);
        m15164a(str, dVar);
    }

    /* renamed from: b */
    public void mo12856b(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("age", Integer.valueOf(i));
        mo12840a("Account Birthday Edited", cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12836a(String str, int i) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("best_friends_count", Integer.valueOf(i));
        m15164a(str, dVar);
    }

    /* renamed from: b */
    public void mo12861b(C7360e eVar) {
        C5427c cVar = new C5427c();
        m15163a(cVar, eVar);
        mo12840a("Media Viewer Opened", cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12837a(String str, int i, int i2) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("Friend Count", Integer.valueOf(i));
        dVar.mo13001a("Already on Z Count", Integer.valueOf(i2));
        dVar.mo13001a("Available on Z Count", Integer.valueOf(i2 + i));
        dVar.mo13001a("watchers_locked", Boolean.valueOf(i < 3));
        m15164a(str, dVar);
    }

    /* renamed from: b */
    public void mo12859b(C5347d dVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("add_friend_modal_display_initiated_by", dVar.f13795e);
        mo12840a("Add Friend Modal Displayed", cVar);
    }

    /* renamed from: b */
    public void mo12860b(C5350g gVar, String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("descendants_stats_card_type", gVar.f13811e);
        cVar.mo12998a("descendants_stats_card_share_type", str);
        mo12840a("Profile Other Descendants Stats Shared", cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12848a(String str, boolean z, boolean z2, boolean z3) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("home_set", Boolean.valueOf(z));
        dVar.mo13001a("work_set", Boolean.valueOf(z2));
        dVar.mo13001a("school_set", Boolean.valueOf(z3));
        m15164a(str, dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12844a(String str, String str2, int i, int i2) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("Current App Icon", str2);
        dVar.mo13001a("Max Streak", Integer.valueOf(i2));
        dVar.mo13001a("Ongoing Streak", Integer.valueOf(i));
        m15164a(str, dVar);
    }

    /* renamed from: a */
    public void mo12841a(String str, Timestamp timestamp) {
        int i = C4947a.m14275a(timestamp).get(1);
        C5428d dVar = new C5428d();
        dVar.mo13001a("birth_year", Integer.valueOf(i));
        m15164a(str, dVar);
    }

    /* renamed from: a */
    public void mo12835a(String str) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("bump_count", Integer.valueOf(1));
        m15164a(str, dVar);
    }

    /* renamed from: a */
    public void mo12847a(String str, boolean z) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("private_mode_suggested_enabled", Boolean.valueOf(z));
        m15164a(str, dVar);
    }

    /* renamed from: a */
    public void mo12842a(String str, C7243w0 w0Var) {
        C5428d dVar = new C5428d();
        dVar.mo13001a("suggested_algo_version", Integer.valueOf(w0Var.getSuggestedAlgoVersion()));
        m15164a(str, dVar);
    }

    /* renamed from: a */
    public void mo12809a(int i, C5356m mVar, C5358o oVar, boolean z, boolean z2) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("Input type", mVar.f13844e);
        cVar.mo12998a("message_type", oVar.f13863e);
        cVar.mo12998a("Number of characters", Integer.valueOf(i));
        cVar.mo12998a("is_friend", Boolean.valueOf(z));
        cVar.mo12998a("is_zenly_user", Boolean.valueOf(z2));
        mo12840a("Message Sent", cVar);
    }

    /* renamed from: a */
    public void mo12854a(boolean z, boolean z2, boolean z3, int i, boolean z4) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_shortcut_emoji", Boolean.valueOf(z));
        cVar.mo12998a("is_full_chat_visible", Boolean.valueOf(z2));
        cVar.mo12998a("is_friend", Boolean.valueOf(z3));
        cVar.mo12998a("Combo size", Integer.valueOf(i));
        cVar.mo12998a("z_track2exp_emoji_type", z4 ? "group" : "indiv");
        mo12840a("Emoji Sent", cVar);
    }

    /* renamed from: a */
    public void mo12812a(C2234d0 d0Var) {
        mo12840a("Emoji Pack Unlocked", m15165b(d0Var));
    }

    /* renamed from: a */
    private C5427c m15161a(C2587f0 f0Var, Boolean bool, Boolean bool2, boolean z, Integer num, C5362s sVar, boolean z2) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("other_avatar_set", Boolean.valueOf(z));
        if (f0Var != C2587f0.UNDEFINED) {
            cVar.mo12998a("friend_request_type", f0Var.mo8691a());
        }
        if (bool != null) {
            cVar.mo12998a("is_contact", bool);
        }
        if (bool2 != null) {
            cVar.mo12998a("is_zenly_user", bool2);
        }
        if (num != null) {
            cVar.mo12998a("friend_request_mutual_friend_count", num);
        }
        if (sVar != null) {
            cVar.mo12998a("friend_request_sender_information", sVar.f13891e);
        }
        if (z2) {
            cVar.mo12998a("z_friend_request_send_from_experiment", "z_track4exp3var1_quick_add");
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo12813a(FriendRequestTrackingInfo friendRequestTrackingInfo) {
        mo12840a("Friend Request Reminder Sent", m15161a(friendRequestTrackingInfo.mo8611d(), Boolean.valueOf(friendRequestTrackingInfo.mo8613e()), friendRequestTrackingInfo.mo8615g(), friendRequestTrackingInfo.mo8610c(), friendRequestTrackingInfo.mo8609b(), null, friendRequestTrackingInfo.mo8608a()));
    }

    /* renamed from: a */
    public void mo12814a(C2587f0 f0Var, Boolean bool, boolean z, Integer num, C5362s sVar) {
        mo12840a("Friend Request Accepted", m15161a(f0Var, bool, null, z, num, sVar, false));
    }

    /* renamed from: a */
    public void mo12832a(UserProto$User userProto$User, boolean z, C5359p pVar) {
        boolean a = C3194b0.m10163a(userProto$User);
        C5427c cVar = new C5427c();
        cVar.mo13000b("profile_other_opened_gesture_type", pVar != null ? pVar.f13869e : null);
        cVar.mo12998a("is_zenly_user", Boolean.valueOf(true));
        cVar.mo12998a("is_friend", Boolean.valueOf(z));
        cVar.mo12998a("other_avatar_set", Boolean.valueOf(a));
        mo12840a("Profile Other Opened", cVar);
    }

    /* renamed from: a */
    public void mo12807a(int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("age", Integer.valueOf(i));
        mo12840a("Account Age Gated", cVar);
    }

    /* renamed from: a */
    public void mo12815a(C5345b bVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("account_deletion_feedback_sent_reason", bVar.f13781e);
        mo12840a("Account Deletion Feedback Sent", cVar);
    }

    /* renamed from: a */
    public void mo12849a(boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_zenly_user", Boolean.valueOf(z));
        mo12840a("Fog Opened", cVar);
    }

    /* renamed from: a */
    public void mo12850a(boolean z, int i) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("discover_algorithm_version", Integer.valueOf(6));
        cVar.mo12998a("discover_discoverability_visible", Boolean.valueOf(z));
        cVar.mo12998a("discover_discoverability_count", Integer.valueOf(i));
        mo12840a("Discover Opened", cVar);
    }

    /* renamed from: a */
    public void mo12838a(String str, int i, int i2, boolean z, int i3) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("discover_algorithm_version", Integer.valueOf(6));
        cVar.mo12998a("discover_gesture_type", str);
        cVar.mo12998a("discover_progression", Integer.valueOf(i2));
        cVar.mo12998a("discover_streak", Integer.valueOf(i));
        cVar.mo12998a("discover_hot_content_was_available", Boolean.valueOf(z));
        cVar.mo12998a("discover_hot_content_progression", Integer.valueOf(i3));
        mo12840a("Discover Exited", cVar);
    }

    /* renamed from: a */
    public void mo12811a(int i, boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        cVar.mo12998a("referrer", "group_creation");
        cVar.mo12998a("z_track2exp_group_created_with_custom_name", Boolean.valueOf(z));
        mo12840a("Group Created", cVar);
    }

    /* renamed from: a */
    public void mo12808a(int i, int i2) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("group_members_added_count", Integer.valueOf(i2));
        cVar.mo12998a("group_members_count", Integer.valueOf(i));
        mo12840a("Group Member Added", cVar);
    }

    /* renamed from: a */
    public void mo12827a(C5357n nVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("item_type", nVar.f13859e);
        mo12840a("Dashboard Item Tapped", cVar);
    }

    /* renamed from: a */
    public void mo12825a(C5354k kVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("full_chat_opened_type", kVar.f13832e);
        mo12840a("Full Chat Opened", cVar);
    }

    /* renamed from: a */
    public void mo12824a(C5353j jVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("full_chat_closed_gesture_type", jVar.f13827e);
        mo12840a("Full Chat Closed", cVar);
    }

    /* renamed from: a */
    public void mo12853a(boolean z, boolean z2) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("inbox_conversation_tapped_has_unread_item", Boolean.valueOf(z));
        cVar.mo12998a("z_track2exp_inbox_conversation_tapped_type", z2 ? "group" : "indiv");
        mo12840a("Inbox Conversation Tapped", cVar);
    }

    /* renamed from: a */
    public void mo12822a(C5351h hVar, boolean z) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("emoji_panel_opened_gesture_type", hVar.f13815e);
        cVar.mo12998a("is_full_chat_visible", Boolean.valueOf(z));
        mo12840a("Emoji Panel Opened", cVar);
    }

    /* renamed from: a */
    public void mo12828a(C5360q qVar) {
        String a = qVar != null ? qVar.f13876e : null;
        C5427c cVar = new C5427c();
        cVar.mo13000b("push_notification_type", a);
        mo12840a("Push Notification Tapped", cVar);
    }

    /* renamed from: a */
    public void mo12818a(C5348e eVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("best_friends_card_type", eVar.f13800e);
        mo12840a("Best Friends Tapped", cVar);
    }

    /* renamed from: a */
    public void mo12819a(C5348e eVar, String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("best_friends_card_type", eVar.f13800e);
        cVar.mo12998a("best_friends_share_type", str);
        mo12840a("Best Friends Shared", cVar);
    }

    /* renamed from: a */
    public void mo12852a(boolean z, C5366w wVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("while_watchers_locked", Boolean.valueOf(z));
        cVar.mo12998a("watcher_medal_type", wVar.f13907e);
        mo12840a("Watchers Tapped", cVar);
    }

    /* renamed from: a */
    public void mo12831a(C5366w wVar, String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("watcher_medal_type", wVar.f13907e);
        cVar.mo12998a("watcher_medal_share_type", str);
        mo12840a("Watchers Shared", cVar);
    }

    /* renamed from: a */
    public void mo12823a(C5352i iVar, String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("friendship_stats_card_type", iVar.f13822e);
        cVar.mo12998a("friendship_stats_card_share_type", str);
        mo12840a("Profile Other Friendship Stats Shared", cVar);
    }

    /* renamed from: a */
    public void mo12829a(C5361r rVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("add_by_username_searched_error_type", rVar.f13884e);
        mo12840a("Add By Username Search Failed", cVar);
    }

    /* renamed from: a */
    public void mo12839a(String str, C5363t tVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_username_set", Boolean.valueOf(!TextUtils.isEmpty(str)));
        cVar.mo12998a("username_accessed_via", tVar.f13895e);
        mo12840a("Username Me Opened", cVar);
    }

    /* renamed from: a */
    public void mo12851a(boolean z, int i, int i2) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_username_suggested", Boolean.valueOf(z));
        cVar.mo12998a("username_taken_count", Integer.valueOf(i));
        cVar.mo12998a("username_suggested_count", Integer.valueOf(i2));
        mo12840a("Username Me Created", cVar);
    }

    /* renamed from: a */
    public void mo12810a(int i, String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("username_card_type", C5364u.m15317a(i));
        cVar.mo12998a("username_card_share_type", str);
        mo12840a("Username Me Shared", cVar);
    }

    /* renamed from: a */
    public void mo12820a(C5349f fVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("bump_type", fVar.f13804e);
        mo12840a("Bump Triggered", cVar);
    }

    /* renamed from: a */
    private void m15163a(C5427c cVar, C7360e eVar) {
        if (eVar == C7360e.TYPE_IMAGE) {
            cVar.mo12998a("media_viewer_media_type", "image");
        }
    }

    /* renamed from: a */
    public void mo12834a(C7360e eVar) {
        C5427c cVar = new C5427c();
        m15163a(cVar, eVar);
        mo12840a("Media Viewer Media Saved", cVar);
    }

    /* renamed from: a */
    public void mo12845a(String str, String str2, String str3) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("camera_type", str);
        cVar.mo12998a("camera_media_source", str2);
        cVar.mo12998a("camera_media_type", str3);
        mo12840a("Camera Media Taken", cVar);
    }

    /* renamed from: a */
    public void mo12846a(String str, String str2, String str3, String str4) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("camera_type", str);
        cVar.mo12998a("camera_media_source", str2);
        cVar.mo12998a("camera_media_type", str3);
        cVar.mo12998a("camera_media_shared_to", str4);
        mo12840a("Camera Media Sent", cVar);
    }

    /* renamed from: a */
    public void mo12816a(C5346c cVar) {
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a("account_gated_gating_type", cVar.f13789e);
        mo12840a("Account Gated", cVar2);
    }

    /* renamed from: a */
    public void mo12830a(C5365v vVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("warning_type", vVar.f13900e);
        mo12840a("Warning Displayed", cVar);
    }

    /* renamed from: a */
    public void mo12817a(C5347d dVar) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("add_friend_modal_dismiss_initiated_by", dVar.f13795e);
        mo12840a("Add Friend Modal Dismissed", cVar);
    }

    /* renamed from: a */
    public void mo12821a(C5350g gVar, String str) {
        C5427c cVar = new C5427c();
        cVar.mo12998a("descendants_stats_card_type", gVar.f13811e);
        cVar.mo12998a("descendants_stats_card_share_type", str);
        mo12840a("MyProfile Descendants Stats Shared", cVar);
    }

    /* renamed from: a */
    public void mo12826a(C5355l lVar) {
        C5427c cVar = new C5427c();
        String str = "get_friends_to_join_origin";
        cVar.mo12998a(str, lVar.f13840e);
        mo12840a("Get Friends To Join Opened", cVar);
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a(str, lVar.f13840e);
        cVar2.mo12998a("get_friends_to_join_share_type", "other");
        mo12840a("Get Friends To Join Shared", cVar2);
    }
}
