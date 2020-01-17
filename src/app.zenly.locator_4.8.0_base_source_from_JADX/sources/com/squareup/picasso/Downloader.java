package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface Downloader {

    public static class ResponseException extends IOException {

        /* renamed from: e */
        final boolean f30650e;

        /* renamed from: f */
        final int f30651f;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.f30650e = C11882n.m31204a(i);
            this.f30651f = i2;
        }
    }

    /* renamed from: com.squareup.picasso.Downloader$a */
    public static class C11841a {

        /* renamed from: a */
        final InputStream f30652a;

        /* renamed from: b */
        final Bitmap f30653b;

        /* renamed from: c */
        final boolean f30654c;

        /* renamed from: d */
        final long f30655d;

        public C11841a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f30652a = inputStream;
                this.f30653b = null;
                this.f30654c = z;
                this.f30655d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Deprecated
        /* renamed from: a */
        public Bitmap mo35022a() {
            return this.f30653b;
        }

        /* renamed from: b */
        public long mo35023b() {
            return this.f30655d;
        }

        /* renamed from: c */
        public InputStream mo35024c() {
            return this.f30652a;
        }
    }

    C11841a load(Uri uri, int i) throws IOException;

    void shutdown();
}
