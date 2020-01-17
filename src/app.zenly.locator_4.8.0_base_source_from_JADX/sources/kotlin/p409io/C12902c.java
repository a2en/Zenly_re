package kotlin.p409io;

import java.io.File;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.io.c */
public final class C12902c {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m33761b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" -> ");
            sb2.append(file2);
            sb.append(sb2.toString());
        }
        if (str != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        String sb4 = sb.toString();
        C12932j.m33815a((Object) sb4, "sb.toString()");
        return sb4;
    }
}
