package com.facebook.imageformat;

import com.facebook.common.internal.C9522a;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9542m;
import com.facebook.imageformat.ImageFormat.FormatChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.facebook.imageformat.c */
public class C9651c {

    /* renamed from: d */
    private static C9651c f25208d;

    /* renamed from: a */
    private int f25209a;

    /* renamed from: b */
    private List<FormatChecker> f25210b;

    /* renamed from: c */
    private final FormatChecker f25211c = new C9649a();

    private C9651c() {
        m23724b();
    }

    /* renamed from: b */
    private void m23724b() {
        this.f25209a = this.f25211c.getHeaderSize();
        List<FormatChecker> list = this.f25210b;
        if (list != null) {
            for (FormatChecker headerSize : list) {
                this.f25209a = Math.max(this.f25209a, headerSize.getHeaderSize());
            }
        }
    }

    /* renamed from: c */
    public static ImageFormat m23725c(InputStream inputStream) {
        try {
            return m23723b(inputStream);
        } catch (IOException e) {
            C9542m.m23285a(e);
            throw null;
        }
    }

    /* renamed from: a */
    public ImageFormat mo26154a(InputStream inputStream) throws IOException {
        C9536j.m23271a(inputStream);
        int i = this.f25209a;
        byte[] bArr = new byte[i];
        int a = m23721a(i, inputStream, bArr);
        ImageFormat determineFormat = this.f25211c.determineFormat(bArr, a);
        if (determineFormat != null && determineFormat != ImageFormat.f25182b) {
            return determineFormat;
        }
        List<FormatChecker> list = this.f25210b;
        if (list != null) {
            for (FormatChecker determineFormat2 : list) {
                ImageFormat determineFormat3 = determineFormat2.determineFormat(bArr, a);
                if (determineFormat3 != null && determineFormat3 != ImageFormat.f25182b) {
                    return determineFormat3;
                }
            }
        }
        return ImageFormat.f25182b;
    }

    /* renamed from: b */
    public static ImageFormat m23723b(InputStream inputStream) throws IOException {
        return m23722a().mo26154a(inputStream);
    }

    /* renamed from: a */
    private static int m23721a(int i, InputStream inputStream, byte[] bArr) throws IOException {
        C9536j.m23271a(inputStream);
        C9536j.m23271a(bArr);
        C9536j.m23275a(bArr.length >= i);
        if (!inputStream.markSupported()) {
            return C9522a.m23247a(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return C9522a.m23247a(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: a */
    public static synchronized C9651c m23722a() {
        C9651c cVar;
        synchronized (C9651c.class) {
            if (f25208d == null) {
                f25208d = new C9651c();
            }
            cVar = f25208d;
        }
        return cVar;
    }
}
