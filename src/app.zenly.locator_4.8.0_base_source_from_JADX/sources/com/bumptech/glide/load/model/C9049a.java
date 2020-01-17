package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.p301o.C9203a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.a */
public class C9049a implements Encoder<ByteBuffer> {
    /* renamed from: a */
    public boolean encode(ByteBuffer byteBuffer, File file, C9011f fVar) {
        try {
            C9203a.m22058a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            String str = "ByteBufferEncoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to write data", e);
            }
            return false;
        }
    }
}
