package app.zenly.locator.chat;

import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.q4 */
public final class C2285q4 {

    /* renamed from: a */
    private static final Integer[] f6942a = {Integer.valueOf(R.color.green), Integer.valueOf(R.color.pink), Integer.valueOf(R.color.purple), Integer.valueOf(R.color.yellow), Integer.valueOf(R.color.candy), Integer.valueOf(R.color.turquoise_blue), Integer.valueOf(R.color.orange), Integer.valueOf(R.color.emerald_green), Integer.valueOf(R.color.cerulean_blue), Integer.valueOf(R.color.coral), Integer.valueOf(R.color.brown), Integer.valueOf(R.color.turquoise_blue_light), Integer.valueOf(R.color.pink_light), Integer.valueOf(R.color.purple_light), Integer.valueOf(R.color.orange_light), Integer.valueOf(R.color.candy_light), Integer.valueOf(R.color.emerald_green_light), Integer.valueOf(R.color.cerulean_blue_light), Integer.valueOf(R.color.coral_light), Integer.valueOf(R.color.brown_light)};

    static {
        new C2285q4();
    }

    private C2285q4() {
    }

    /* renamed from: a */
    public static final int m8183a(String str, boolean z) {
        C12932j.m33818b(str, "identifier");
        return f6942a[z ? Math.abs(str.hashCode()) % f6942a.length : 0].intValue();
    }
}
