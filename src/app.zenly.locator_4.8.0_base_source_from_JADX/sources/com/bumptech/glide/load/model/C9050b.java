package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;
import com.bumptech.glide.p301o.C9203a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.b */
public class C9050b implements ModelLoader<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.model.b$a */
    private static final class C9051a implements DataFetcher<ByteBuffer> {

        /* renamed from: e */
        private final File f23586e;

        C9051a(File file) {
            this.f23586e = file;
        }

        public void cancel() {
        }

        public void cleanup() {
        }

        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        public C8882a getDataSource() {
            return C8882a.LOCAL;
        }

        public void loadData(C8859g gVar, DataCallback<? super ByteBuffer> dataCallback) {
            try {
                dataCallback.onDataReady(C9203a.m22056a(this.f23586e));
            } catch (IOException e) {
                String str = "ByteBufferFileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to obtain ByteBuffer for file", e);
                }
                dataCallback.onLoadFailed(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.b$b */
    public static class C9052b implements ModelLoaderFactory<File, ByteBuffer> {
        public ModelLoader<File, ByteBuffer> build(C9068i iVar) {
            return new C9050b();
        }

        public void teardown() {
        }
    }

    /* renamed from: a */
    public C9045a<ByteBuffer> buildLoadData(File file, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(file), new C9051a(file));
    }

    /* renamed from: a */
    public boolean handles(File file) {
        return true;
    }
}
