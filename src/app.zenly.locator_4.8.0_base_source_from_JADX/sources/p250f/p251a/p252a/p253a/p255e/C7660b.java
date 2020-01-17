package p250f.p251a.p252a.p253a.p255e;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.e.b */
public final class C7660b {
    /* renamed from: a */
    public static final boolean m18653a(Context context, Intent intent) {
        C12932j.m33818b(context, "$this$startActivitySafely");
        C12932j.m33818b(intent, "intent");
        return m18655a(context, intent, (String) null);
    }

    /* renamed from: a */
    public static final boolean m18654a(Context context, Intent intent, int i) {
        C12932j.m33818b(context, "$this$startActivitySafely");
        C12932j.m33818b(intent, "intent");
        return m18655a(context, intent, context.getString(i));
    }

    /* renamed from: a */
    public static final boolean m18655a(Context context, Intent intent, String str) {
        C12932j.m33818b(context, "$this$startActivitySafely");
        C12932j.m33818b(intent, "intent");
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            if (str != null) {
                Toast.makeText(context, str, 0).show();
            }
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
