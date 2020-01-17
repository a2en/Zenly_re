package p250f.p251a.p252a.p263b.p264a.p268g;

import java.text.BreakIterator;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.a.g.a */
public final class C7705a {
    /* renamed from: a */
    public static final String m18750a(String str) {
        C12932j.m33818b(str, "$this$initial");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int next = characterInstance.next();
        if (next == -1) {
            return "";
        }
        String substring = str.substring(0, next);
        C12932j.m33815a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
