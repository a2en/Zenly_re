package p250f.p251a.p252a.p253a.p255e;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.e.a */
public final class C7659a {
    /* renamed from: a */
    public static final boolean m18651a(Activity activity, Intent intent, int i) {
        C12932j.m33818b(activity, "$this$startActivityForResultSafely");
        C12932j.m33818b(intent, "intent");
        return m18652a(activity, intent, i, null);
    }

    /* renamed from: a */
    public static final boolean m18652a(Activity activity, Intent intent, int i, String str) {
        C12932j.m33818b(activity, "$this$startActivityForResultSafely");
        C12932j.m33818b(intent, "intent");
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            if (str != null) {
                Toast.makeText(activity, str, 0).show();
            }
            return false;
        }
        activity.startActivityForResult(intent, i);
        return true;
    }
}
