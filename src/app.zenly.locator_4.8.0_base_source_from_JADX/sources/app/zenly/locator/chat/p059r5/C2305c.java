package app.zenly.locator.chat.p059r5;

import app.zenly.locator.p143s.p160v.C5514a;
import java.text.BreakIterator;

/* renamed from: app.zenly.locator.chat.r5.c */
public class C2305c {
    /* renamed from: a */
    public static boolean m8213a(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int next = characterInstance.next(); next != -1; next = characterInstance.next()) {
            i++;
            if (i > 3 || !C5514a.m15637a(str.substring(i2, next))) {
                break;
            }
            i3++;
            i2 = next;
        }
        if (i3 <= 0 || i3 != i) {
            return false;
        }
        return true;
    }
}
