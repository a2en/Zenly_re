package com.facebook.imagepipeline.nativecode;

import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
public final class C9775c {
    /* renamed from: a */
    public static ImageTranscoderFactory m24272a(int i, boolean z) {
        try {
            return (ImageTranscoderFactory) Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory").getConstructor(new Class[]{Integer.TYPE, Boolean.TYPE}).newInstance(new Object[]{Integer.valueOf(i), Boolean.valueOf(z)});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        }
    }
}
