package p389io.fabric.sdk.android.services.events;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: io.fabric.sdk.android.services.events.b */
public class C12230b extends C12231c {
    public C12230b(Context context, File file, String str, String str2) throws IOException {
        super(context, file, str, str2);
    }

    /* renamed from: a */
    public OutputStream mo36182a(File file) throws IOException {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}
