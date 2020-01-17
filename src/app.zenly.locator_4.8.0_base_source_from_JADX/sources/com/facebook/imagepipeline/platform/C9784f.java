package com.facebook.imagepipeline.platform;

import android.os.Build.VERSION;
import androidx.core.util.C0606h;
import com.facebook.imagepipeline.memory.C9743b0;

/* renamed from: com.facebook.imagepipeline.platform.f */
public class C9784f {
    /* renamed from: a */
    public static PlatformDecoder m24291a(C9743b0 b0Var, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            int d = b0Var.mo26515d();
            return new C9783e(b0Var.mo26512a(), d, new C0606h(d));
        } else if (i >= 21) {
            int d2 = b0Var.mo26515d();
            return new C9779a(b0Var.mo26512a(), d2, new C0606h(d2));
        } else if (!z || i >= 19) {
            return new C9782d(b0Var.mo26514c());
        } else {
            return new C9781c();
        }
    }
}
