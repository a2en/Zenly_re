package com.wonderkiln.camerakit;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p214e.p241j.p242a.C7634a;

/* renamed from: com.wonderkiln.camerakit.p */
public class C11986p {

    /* renamed from: a */
    private byte[] f31242a;

    /* renamed from: b */
    private int f31243b;

    /* renamed from: c */
    private int f31244c;

    /* renamed from: d */
    private AspectRatio f31245d;

    /* renamed from: com.wonderkiln.camerakit.p$a */
    private static class C11987a {

        /* renamed from: a */
        private int f31246a;

        /* renamed from: b */
        private int f31247b;

        /* renamed from: c */
        private AspectRatio f31248c;

        public C11987a(int i, int i2, AspectRatio aspectRatio) {
            this.f31246a = i;
            this.f31247b = i2;
            this.f31248c = aspectRatio;
        }

        /* renamed from: a */
        public void mo35582a(BitmapOperator bitmapOperator) {
            Rect a = m31575a(this.f31246a, this.f31247b, this.f31248c);
            bitmapOperator.mo35464a(a.left, a.top, a.right, a.bottom);
        }

        /* renamed from: a */
        private static Rect m31575a(int i, int i2, AspectRatio aspectRatio) {
            if (AspectRatio.m31428b(i, i2).mo35454b() > aspectRatio.mo35454b()) {
                int b = (i - ((int) (((float) i2) * aspectRatio.mo35454b()))) / 2;
                return new Rect(b, 0, i - b, i2);
            }
            int b2 = (i2 - ((int) (((float) i) * aspectRatio.mo35452a().mo35454b()))) / 2;
            return new Rect(0, b2, i, i2 - b2);
        }
    }

    /* renamed from: com.wonderkiln.camerakit.p$b */
    private static class C11988b {

        /* renamed from: a */
        private int f31249a = 0;

        public C11988b(byte[] bArr) {
            try {
                this.f31249a = m31577a((InputStream) new ByteArrayInputStream(bArr));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo35583a(BitmapOperator bitmapOperator) {
            switch (this.f31249a) {
                case 2:
                    bitmapOperator.mo35463a();
                    return;
                case 3:
                    bitmapOperator.mo35468c(180);
                    return;
                case 4:
                    bitmapOperator.mo35466b();
                    return;
                case 5:
                    bitmapOperator.mo35468c(90);
                    bitmapOperator.mo35463a();
                    return;
                case 6:
                    bitmapOperator.mo35468c(90);
                    return;
                case 7:
                    bitmapOperator.mo35468c(270);
                    bitmapOperator.mo35463a();
                    return;
                case 8:
                    bitmapOperator.mo35468c(270);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public boolean mo35584a() {
            switch (this.f31249a) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    return false;
                case 5:
                case 6:
                case 7:
                case 8:
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: a */
        private static int m31577a(InputStream inputStream) throws IOException {
            return new C7634a(inputStream).mo19750a("Orientation", 1);
        }
    }

    public C11986p(byte[] bArr) {
        this.f31242a = bArr;
    }

    /* renamed from: a */
    public void mo35578a(int i) {
        this.f31244c = i;
    }

    /* renamed from: b */
    public void mo35581b(int i) {
        this.f31243b = i;
    }

    /* renamed from: b */
    private Bitmap m31570b() throws IOException {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        byte[] bArr = this.f31242a;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        Options options2 = new Options();
        options.inPreferredConfig = Config.ARGB_8888;
        byte[] bArr2 = this.f31242a;
        return BitmapRegionDecoder.newInstance(bArr2, 0, bArr2.length, true).decodeRegion(new Rect(0, 0, options.outWidth, options.outHeight), options2);
    }

    /* renamed from: a */
    public void mo35579a(AspectRatio aspectRatio) {
        this.f31245d = aspectRatio;
    }

    /* renamed from: a */
    public byte[] mo35580a() {
        try {
            Bitmap b = m31570b();
            int width = b.getWidth();
            int height = b.getHeight();
            BitmapOperator bitmapOperator = new BitmapOperator(b);
            b.recycle();
            C11988b bVar = new C11988b(this.f31242a);
            bVar.mo35583a(bitmapOperator);
            if (this.f31244c == 1) {
                bitmapOperator.mo35463a();
            }
            if (this.f31245d != null) {
                if (bVar.mo35584a()) {
                    int i = height;
                    height = width;
                    width = i;
                }
                new C11987a(width, height, this.f31245d).mo35582a(bitmapOperator);
            }
            return bitmapOperator.mo35467b(this.f31243b);
        } catch (IOException unused) {
            return null;
        }
    }
}
