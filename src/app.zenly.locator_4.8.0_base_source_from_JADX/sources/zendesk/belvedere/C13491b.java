package zendesk.belvedere;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Pair;
import java.io.File;

/* renamed from: zendesk.belvedere.b */
public class C13491b {
    /* renamed from: a */
    public static Pair<Integer, Integer> m35743a(File file) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }
}
