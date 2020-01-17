package app.zenly.locator.core.util;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.util.e */
public final class C3199e {

    /* renamed from: a */
    public static final C3199e f8967a = new C3199e();

    private C3199e() {
    }

    /* renamed from: a */
    public static final void m10178a(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "text");
        String string = context.getString(R.string.app_name);
        C12932j.m33815a((Object) string, "context.getString(R.string.app_name)");
        m10179a(context, string, str);
    }

    /* renamed from: b */
    public static final String m10180b(Context context) {
        C12932j.m33818b(context, "context");
        String str = null;
        try {
            ClipboardManager a = f8967a.m10177a(context);
            if (a != null) {
                ClipData primaryClip = a.getPrimaryClip();
                if (primaryClip != null) {
                    C12932j.m33815a((Object) primaryClip, "clipboardManager(context…rimaryClip ?: return null");
                    if (primaryClip.getItemCount() == 0) {
                        return null;
                    }
                    Item itemAt = primaryClip.getItemAt(0);
                    C12932j.m33815a((Object) itemAt, "primaryClip.getItemAt(0)");
                    CharSequence text = itemAt.getText();
                    if (text != null) {
                        CharSequence f = C13029r.m34033f(text);
                        if (f != null) {
                            str = f.toString();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    public static final void m10179a(Context context, String str, String str2) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "label");
        C12932j.m33818b(str2, "text");
        ClipboardManager a = f8967a.m10177a(context);
        if (a != null) {
            a.setPrimaryClip(ClipData.newPlainText(str, str2));
        }
    }

    /* renamed from: a */
    private final ClipboardManager m10177a(Context context) {
        return (ClipboardManager) context.getSystemService("clipboard");
    }
}
