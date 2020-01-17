package kotlin.p409io;

import java.io.File;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.io.AccessDeniedException */
public final class AccessDeniedException extends FileSystemException {
    public /* synthetic */ AccessDeniedException(File file, File file2, String str, int i, C12928f fVar) {
        if ((i & 2) != 0) {
            file2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(file, file2, str);
    }

    public AccessDeniedException(File file, File file2, String str) {
        C12932j.m33818b(file, "file");
        super(file, file2, str);
    }
}
