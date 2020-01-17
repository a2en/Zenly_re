package kotlin.p409io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.io.FileSystemException */
public class FileSystemException extends IOException {
    public FileSystemException(File file, File file2, String str) {
        C12932j.m33818b(file, "file");
        super(C12902c.m33761b(file, file2, str));
    }
}
