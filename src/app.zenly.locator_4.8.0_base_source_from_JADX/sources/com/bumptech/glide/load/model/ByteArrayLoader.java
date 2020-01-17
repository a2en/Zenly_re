package com.bumptech.glide.load.model;

import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteArrayLoader<Data> implements ModelLoader<byte[], Data> {

    /* renamed from: a */
    private final Converter<Data> f23564a;

    public interface Converter<Data> {
        Data convert(byte[] bArr);

        Class<Data> getDataClass();
    }

    /* renamed from: com.bumptech.glide.load.model.ByteArrayLoader$a */
    public static class C9030a implements ModelLoaderFactory<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.model.ByteArrayLoader$a$a */
        class C9031a implements Converter<ByteBuffer> {
            C9031a(C9030a aVar) {
            }

            public Class<ByteBuffer> getDataClass() {
                return ByteBuffer.class;
            }

            public ByteBuffer convert(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public ModelLoader<byte[], ByteBuffer> build(C9068i iVar) {
            return new ByteArrayLoader(new C9031a(this));
        }

        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.ByteArrayLoader$b */
    private static class C9032b<Data> implements DataFetcher<Data> {

        /* renamed from: e */
        private final byte[] f23565e;

        /* renamed from: f */
        private final Converter<Data> f23566f;

        C9032b(byte[] bArr, Converter<Data> converter) {
            this.f23565e = bArr;
            this.f23566f = converter;
        }

        public void cancel() {
        }

        public void cleanup() {
        }

        public Class<Data> getDataClass() {
            return this.f23566f.getDataClass();
        }

        public C8882a getDataSource() {
            return C8882a.LOCAL;
        }

        public void loadData(C8859g gVar, DataCallback<? super Data> dataCallback) {
            dataCallback.onDataReady(this.f23566f.convert(this.f23565e));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.ByteArrayLoader$c */
    public static class C9033c implements ModelLoaderFactory<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.model.ByteArrayLoader$c$a */
        class C9034a implements Converter<InputStream> {
            C9034a(C9033c cVar) {
            }

            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }

            public InputStream convert(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public ModelLoader<byte[], InputStream> build(C9068i iVar) {
            return new ByteArrayLoader(new C9034a(this));
        }

        public void teardown() {
        }
    }

    public ByteArrayLoader(Converter<Data> converter) {
        this.f23564a = converter;
    }

    /* renamed from: a */
    public C9045a<Data> buildLoadData(byte[] bArr, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(bArr), new C9032b(bArr, this.f23564a));
    }

    /* renamed from: a */
    public boolean handles(byte[] bArr) {
        return true;
    }
}
