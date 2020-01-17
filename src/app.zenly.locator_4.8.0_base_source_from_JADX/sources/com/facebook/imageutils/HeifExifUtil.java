package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build.VERSION;
import com.facebook.common.logging.C9543a;
import com.facebook.soloader.C9911d;
import java.io.IOException;
import java.io.InputStream;

public class HeifExifUtil {

    @C9911d
    private static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        /* renamed from: a */
        static int m24730a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                C9543a.m23309a("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", (Throwable) e);
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static int m24729a(InputStream inputStream) {
        if (VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.m24730a(inputStream);
        }
        C9543a.m23308a("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
