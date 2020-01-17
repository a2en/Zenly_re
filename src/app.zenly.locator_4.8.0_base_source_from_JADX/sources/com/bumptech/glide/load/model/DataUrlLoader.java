package com.bumptech.glide.load.model;

import android.util.Base64;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a */
    private final DataDecoder<Data> f23567a;

    public interface DataDecoder<Data> {
        void close(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;

        Class<Data> getDataClass();
    }

    /* renamed from: com.bumptech.glide.load.model.DataUrlLoader$a */
    private static final class C9035a<Data> implements DataFetcher<Data> {

        /* renamed from: e */
        private final String f23568e;

        /* renamed from: f */
        private final DataDecoder<Data> f23569f;

        /* renamed from: g */
        private Data f23570g;

        C9035a(String str, DataDecoder<Data> dataDecoder) {
            this.f23568e = str;
            this.f23569f = dataDecoder;
        }

        public void cancel() {
        }

        public void cleanup() {
            try {
                this.f23569f.close(this.f23570g);
            } catch (IOException unused) {
            }
        }

        public Class<Data> getDataClass() {
            return this.f23569f.getDataClass();
        }

        public C8882a getDataSource() {
            return C8882a.LOCAL;
        }

        public void loadData(C8859g gVar, DataCallback<? super Data> dataCallback) {
            try {
                this.f23570g = this.f23569f.decode(this.f23568e);
                dataCallback.onDataReady(this.f23570g);
            } catch (IllegalArgumentException e) {
                dataCallback.onLoadFailed(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.DataUrlLoader$b */
    public static final class C9036b<Model> implements ModelLoaderFactory<Model, InputStream> {

        /* renamed from: a */
        private final DataDecoder<InputStream> f23571a = new C9037a(this);

        /* renamed from: com.bumptech.glide.load.model.DataUrlLoader$b$a */
        class C9037a implements DataDecoder<InputStream> {
            C9037a(C9036b bVar) {
            }

            /* renamed from: a */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }

            public InputStream decode(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public ModelLoader<Model, InputStream> build(C9068i iVar) {
            return new DataUrlLoader(this.f23571a);
        }

        public void teardown() {
        }
    }

    public DataUrlLoader(DataDecoder<Data> dataDecoder) {
        this.f23567a = dataDecoder;
    }

    public C9045a<Data> buildLoadData(Model model, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(model), new C9035a(model.toString(), this.f23567a));
    }

    public boolean handles(Model model) {
        return model.toString().startsWith("data:image");
    }
}
