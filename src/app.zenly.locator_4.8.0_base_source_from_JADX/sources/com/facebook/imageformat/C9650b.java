package com.facebook.imageformat;

/* renamed from: com.facebook.imageformat.b */
public final class C9650b {

    /* renamed from: a */
    public static final ImageFormat f25197a = new ImageFormat("JPEG", "jpeg");

    /* renamed from: b */
    public static final ImageFormat f25198b = new ImageFormat("PNG", "png");

    /* renamed from: c */
    public static final ImageFormat f25199c = new ImageFormat("GIF", "gif");

    /* renamed from: d */
    public static final ImageFormat f25200d = new ImageFormat("BMP", "bmp");

    /* renamed from: e */
    public static final ImageFormat f25201e = new ImageFormat("ICO", "ico");

    /* renamed from: f */
    public static final ImageFormat f25202f;

    /* renamed from: g */
    public static final ImageFormat f25203g;

    /* renamed from: h */
    public static final ImageFormat f25204h;

    /* renamed from: i */
    public static final ImageFormat f25205i;

    /* renamed from: j */
    public static final ImageFormat f25206j;

    /* renamed from: k */
    public static final ImageFormat f25207k = new ImageFormat("HEIF", "heif");

    static {
        String str = "webp";
        f25202f = new ImageFormat("WEBP_SIMPLE", str);
        f25203g = new ImageFormat("WEBP_LOSSLESS", str);
        f25204h = new ImageFormat("WEBP_EXTENDED", str);
        f25205i = new ImageFormat("WEBP_EXTENDED_WITH_ALPHA", str);
        f25206j = new ImageFormat("WEBP_ANIMATED", str);
    }

    /* renamed from: a */
    public static boolean m23719a(ImageFormat imageFormat) {
        return imageFormat == f25202f || imageFormat == f25203g || imageFormat == f25204h || imageFormat == f25205i;
    }

    /* renamed from: b */
    public static boolean m23720b(ImageFormat imageFormat) {
        return m23719a(imageFormat) || imageFormat == f25206j;
    }
}
