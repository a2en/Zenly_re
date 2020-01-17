package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p300n.C9202d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* renamed from: a */
    private final FileOpener<Data> f23572a;

    public interface FileOpener<Data> {
        void close(Data data) throws IOException;

        Class<Data> getDataClass();

        Data open(File file) throws FileNotFoundException;
    }

    /* renamed from: com.bumptech.glide.load.model.FileLoader$a */
    public static class C9038a<Data> implements ModelLoaderFactory<File, Data> {

        /* renamed from: a */
        private final FileOpener<Data> f23573a;

        public C9038a(FileOpener<Data> fileOpener) {
            this.f23573a = fileOpener;
        }

        public final ModelLoader<File, Data> build(C9068i iVar) {
            return new FileLoader(this.f23573a);
        }

        public final void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.FileLoader$b */
    public static class C9039b extends C9038a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.model.FileLoader$b$a */
        class C9040a implements FileOpener<ParcelFileDescriptor> {
            C9040a() {
            }

            /* renamed from: a */
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            public Class<ParcelFileDescriptor> getDataClass() {
                return ParcelFileDescriptor.class;
            }

            public ParcelFileDescriptor open(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C9039b() {
            super(new C9040a());
        }
    }

    /* renamed from: com.bumptech.glide.load.model.FileLoader$c */
    private static final class C9041c<Data> implements DataFetcher<Data> {

        /* renamed from: e */
        private final File f23574e;

        /* renamed from: f */
        private final FileOpener<Data> f23575f;

        /* renamed from: g */
        private Data f23576g;

        C9041c(File file, FileOpener<Data> fileOpener) {
            this.f23574e = file;
            this.f23575f = fileOpener;
        }

        public void cancel() {
        }

        public void cleanup() {
            Data data = this.f23576g;
            if (data != null) {
                try {
                    this.f23575f.close(data);
                } catch (IOException unused) {
                }
            }
        }

        public Class<Data> getDataClass() {
            return this.f23575f.getDataClass();
        }

        public C8882a getDataSource() {
            return C8882a.LOCAL;
        }

        public void loadData(C8859g gVar, DataCallback<? super Data> dataCallback) {
            try {
                this.f23576g = this.f23575f.open(this.f23574e);
                dataCallback.onDataReady(this.f23576g);
            } catch (FileNotFoundException e) {
                String str = "FileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to open file", e);
                }
                dataCallback.onLoadFailed(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.FileLoader$d */
    public static class C9042d extends C9038a<InputStream> {

        /* renamed from: com.bumptech.glide.load.model.FileLoader$d$a */
        class C9043a implements FileOpener<InputStream> {
            C9043a() {
            }

            /* renamed from: a */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }

            public InputStream open(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C9042d() {
            super(new C9043a());
        }
    }

    public FileLoader(FileOpener<Data> fileOpener) {
        this.f23572a = fileOpener;
    }

    /* renamed from: a */
    public C9045a<Data> buildLoadData(File file, int i, int i2, C9011f fVar) {
        return new C9045a<>(new C9202d(file), new C9041c(file, this.f23572a));
    }

    /* renamed from: a */
    public boolean handles(File file) {
        return true;
    }
}
