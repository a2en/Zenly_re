package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.C8884c;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9203a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.gif.d */
public class C9158d implements ResourceEncoder<C9156c> {
    /* renamed from: a */
    public boolean encode(Resource<C9156c> resource, File file, C9011f fVar) {
        try {
            C9203a.m22058a(((C9156c) resource.get()).mo24692a(), file);
            return true;
        } catch (IOException e) {
            String str = "GifEncoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    public C8884c getEncodeStrategy(C9011f fVar) {
        return C8884c.SOURCE;
    }
}
