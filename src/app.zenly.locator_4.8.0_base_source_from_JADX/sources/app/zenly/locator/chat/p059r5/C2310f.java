package app.zenly.locator.chat.p059r5;

import android.content.Context;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3236s;
import p250f.p251a.p252a.p253a.p255e.C7660b;

/* renamed from: app.zenly.locator.chat.r5.f */
public final class C2310f {
    /* renamed from: a */
    public static void m8218a(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n---\n");
        sb.append(context.getResources().getString(R.string.chat_smscontent_sent_with_zenly));
        C7660b.m18653a(context, C3236s.m10253a(str, sb.toString()));
    }
}
