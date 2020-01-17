package com.bumptech.glide.load.p294h;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.DecodeException;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.OnPartialImageListener;
import android.graphics.ImageDecoder.Source;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.C8883b;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.C9012g;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.C9121m;
import com.bumptech.glide.load.resource.bitmap.C9134r;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.h.a */
public abstract class C9013a<T> implements ResourceDecoder<Source, T> {

    /* renamed from: a */
    final C9134r f23544a = C9134r.m21867a();

    /* renamed from: com.bumptech.glide.load.h.a$a */
    class C9014a implements OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f23545a;

        /* renamed from: b */
        final /* synthetic */ int f23546b;

        /* renamed from: c */
        final /* synthetic */ boolean f23547c;

        /* renamed from: d */
        final /* synthetic */ C8883b f23548d;

        /* renamed from: e */
        final /* synthetic */ C9121m f23549e;

        /* renamed from: f */
        final /* synthetic */ C9012g f23550f;

        /* renamed from: com.bumptech.glide.load.h.a$a$a */
        class C9015a implements OnPartialImageListener {
            C9015a(C9014a aVar) {
            }

            public boolean onPartialImage(DecodeException decodeException) {
                return false;
            }
        }

        C9014a(int i, int i2, boolean z, C8883b bVar, C9121m mVar, C9012g gVar) {
            this.f23545a = i;
            this.f23546b = i2;
            this.f23547c = z;
            this.f23548d = bVar;
            this.f23549e = mVar;
            this.f23550f = gVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageInfo imageInfo, Source source) {
            boolean z = true;
            if (C9013a.this.f23544a.mo24642a(this.f23545a, this.f23546b, this.f23547c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f23548d == C8883b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C9015a(this));
            Size size = imageInfo.getSize();
            int i = this.f23545a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f23546b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f23549e.mo24639b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            String str = "ImageDecoder";
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resizing from [");
                sb.append(size.getWidth());
                String str2 = "x";
                sb.append(str2);
                sb.append(size.getHeight());
                sb.append("] to [");
                sb.append(round);
                sb.append(str2);
                sb.append(round2);
                sb.append("] scaleFactor: ");
                sb.append(b);
                Log.v(str, sb.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f23550f != C9012g.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) {
                    z = false;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? Named.DISPLAY_P3 : Named.SRGB));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(Named.SRGB));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Resource<T> mo24520a(Source source, int i, int i2, OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* renamed from: a */
    public final Resource<T> decode(Source source, int i, int i2, C9011f fVar) throws IOException {
        C9014a aVar = new C9014a(i, i2, fVar.mo24517a(Downsampler.f23658i) != null && ((Boolean) fVar.mo24517a(Downsampler.f23658i)).booleanValue(), (C8883b) fVar.mo24517a(Downsampler.f23655f), (C9121m) fVar.mo24517a(C9121m.f23701f), (C9012g) fVar.mo24517a(Downsampler.f23656g));
        return mo24520a(source, i, i2, (OnHeaderDecodedListener) aVar);
    }

    /* renamed from: a */
    public final boolean handles(Source source, C9011f fVar) {
        return true;
    }
}
