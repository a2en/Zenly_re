package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.jvm.internal.C12932j;

/* renamed from: androidx.navigation.fragment.a */
public final class C0957a {
    /* renamed from: a */
    public static final NavController m4290a(Fragment fragment) {
        C12932j.m33818b(fragment, "$this$findNavController");
        NavController a = NavHostFragment.m4286a(fragment);
        C12932j.m33815a((Object) a, "NavHostFragment.findNavController(this)");
        return a;
    }
}
