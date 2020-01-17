package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.ranges.C12963e;

/* renamed from: kotlin.text.h */
public final class C13017h {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final MatchResult m33969b(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C13009f(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C12963e m33967b(MatchResult matchResult) {
        return C12973l.m33894d(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C12963e m33968b(MatchResult matchResult, int i) {
        return C12973l.m33894d(matchResult.start(i), matchResult.end(i));
    }
}
