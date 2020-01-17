package kotlin.p409io;

import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.io.k */
class C12916k extends C12915j {
    /* renamed from: b */
    public static boolean m33779b(File file) {
        C12932j.m33818b(file, "$this$deleteRecursively");
        Iterator it = C12915j.m33777a(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }
}
