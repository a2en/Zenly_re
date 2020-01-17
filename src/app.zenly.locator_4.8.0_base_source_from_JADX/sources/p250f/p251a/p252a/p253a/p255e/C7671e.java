package p250f.p251a.p252a.p253a.p255e;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.e.e */
public final class C7671e {
    /* renamed from: a */
    public static final boolean m18688a(Fragment fragment, Intent intent, int i, String str) {
        C12932j.m33818b(fragment, "$this$startActivityForResultSafely");
        C12932j.m33818b(intent, "intent");
        Context requireContext = fragment.requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        if (intent.resolveActivity(requireContext.getPackageManager()) == null) {
            if (str != null) {
                Toast.makeText(fragment.requireContext(), str, 0).show();
            }
            return false;
        }
        fragment.startActivityForResult(intent, i);
        return true;
    }
}
