package kotlin.text;

import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12963e;

public interface MatchResult {

    /* renamed from: kotlin.text.MatchResult$a */
    public static final class C13001a {
        /* renamed from: a */
        public static C13002b m33941a(MatchResult matchResult) {
            return new C13002b(matchResult);
        }
    }

    /* renamed from: kotlin.text.MatchResult$b */
    public static final class C13002b {
        public C13002b(MatchResult matchResult) {
            C12932j.m33818b(matchResult, "match");
        }
    }

    C13002b getDestructured();

    List<String> getGroupValues();

    MatchGroupCollection getGroups();

    C12963e getRange();

    String getValue();

    MatchResult next();
}
