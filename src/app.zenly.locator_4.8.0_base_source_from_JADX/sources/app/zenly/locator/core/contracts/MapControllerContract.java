package app.zenly.locator.core.contracts;

import app.zenly.locator.core.models.C2896p;
import java.util.List;
import java.util.Locale;

public interface MapControllerContract {

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$a */
    public enum C2457a {
        CITY_MODE,
        HEADING,
        HEADING_OUTDATED,
        LIVE,
        LOCATION_DISABLED,
        LOW_PRECISION,
        NO_WIFI,
        NONE,
        OUT_OF_BATTERY,
        SLEEPING,
        SLEEPING_OUTDATED,
        TIMED_OUT
    }

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$b */
    public enum C2458b {
        GATHERING,
        MEET,
        NORMAL
    }

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$c */
    public static class C2459c extends C2465h {

        /* renamed from: c */
        public final C2896p f7380c;

        public C2459c(C2466a aVar, C2896p pVar, boolean z) {
            super(aVar, z);
            this.f7380c = pVar;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "FriendSelectionEvent {user: %s, event: %s, isUser: %s}", new Object[]{this.f7380c.f8197a, this.f7400a.name(), String.valueOf(this.f7401b)});
        }
    }

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$d */
    public static class C2460d {

        /* renamed from: a */
        public final C2461a f7381a;

        /* renamed from: b */
        public final List<C2896p> f7382b;

        /* renamed from: c */
        public final boolean f7383c;

        /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$d$a */
        public enum C2461a {
            FOLLOW,
            UNFOLLOW
        }

        public C2460d(C2461a aVar, List<C2896p> list, boolean z) {
            this.f7381a = aVar;
            this.f7382b = list;
            this.f7383c = z;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "FriendsSelectionEvent {users: %s, event: %s, isUser: %s}", new Object[]{Integer.valueOf(this.f7382b.size()), this.f7381a.name(), String.valueOf(this.f7383c)});
        }
    }

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$e */
    public enum C2462e {
        AUTO,
        SHADER,
        STATIC
    }

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$f */
    public static class C2463f extends C2465h {

        /* renamed from: c */
        public final int f7391c;

        public C2463f(C2466a aVar, int i, boolean z) {
            super(aVar, z);
            this.f7391c = i;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "GatheringSelectionEvent {gathering: %d, event: %s, isUser: %s}", new Object[]{Integer.valueOf(this.f7391c), this.f7400a.name(), String.valueOf(this.f7401b)});
        }
    }

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$g */
    public enum C2464g {
        ALL,
        AUTO,
        DESTINATION,
        MARKER,
        MARKER_DESTINATION,
        MARKER_ORIGIN,
        ORIGIN
    }

    /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$h */
    public static abstract class C2465h {

        /* renamed from: a */
        public final C2466a f7400a;

        /* renamed from: b */
        public final boolean f7401b;

        /* renamed from: app.zenly.locator.core.contracts.MapControllerContract$h$a */
        public enum C2466a {
            CLICK,
            FOCUS,
            LOST_POSITION,
            RESELECT,
            SELECT,
            SWITCH,
            UNSELECT
        }

        public C2465h(C2466a aVar, boolean z) {
            this.f7400a = aVar;
            this.f7401b = z;
        }
    }
}
