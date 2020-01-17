package com.facebook.imageformat;

public class ImageFormat {

    /* renamed from: b */
    public static final ImageFormat f25182b = new ImageFormat("UNKNOWN", null);

    /* renamed from: a */
    private final String f25183a;

    public interface FormatChecker {
        ImageFormat determineFormat(byte[] bArr, int i);

        int getHeaderSize();
    }

    public ImageFormat(String str, String str2) {
        this.f25183a = str;
    }

    /* renamed from: a */
    public String mo26150a() {
        return this.f25183a;
    }

    public String toString() {
        return mo26150a();
    }
}
