package app.zenly.locator.core.glide.p067j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C9110f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7675b;

/* renamed from: app.zenly.locator.core.glide.j.b */
public final class C2488b extends C9110f {

    /* renamed from: j */
    private static final byte[] f7471j;

    /* renamed from: b */
    private final TextPaint f7472b;

    /* renamed from: c */
    private final Paint f7473c = new Paint(1);

    /* renamed from: d */
    private final Context f7474d;

    /* renamed from: e */
    private final String f7475e;

    /* renamed from: f */
    private final int f7476f;

    /* renamed from: g */
    private final int f7477g;

    /* renamed from: h */
    private final float f7478h;

    /* renamed from: i */
    private final int f7479i;

    /* renamed from: app.zenly.locator.core.glide.j.b$a */
    public static final class C2489a {
        private C2489a() {
        }

        public /* synthetic */ C2489a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2489a(null);
        Charset charset = Key.f23163a;
        C12932j.m33815a((Object) charset, "CHARSET");
        byte[] bytes = "app.zenly.locator.core.glide.transformation.ForegroundText:2".getBytes(charset);
        C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f7471j = bytes;
    }

    public C2488b(Context context, String str, int i, int i2, float f, int i3) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "text");
        this.f7474d = context;
        this.f7475e = str;
        this.f7476f = i;
        this.f7477g = i2;
        this.f7478h = f;
        this.f7479i = i3;
        TextPaint textPaint = new TextPaint(1);
        C7675b bVar = new C7675b(this.f7474d, this.f7476f);
        textPaint.setTypeface(bVar.mo19815a());
        textPaint.setTextSize(bVar.mo19821g());
        textPaint.setColor(this.f7477g);
        this.f7472b = textPaint;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        C12932j.m33818b(bitmapPool, "pool");
        C12932j.m33818b(bitmap, "srcBmp");
        Bitmap bitmap2 = bitmapPool.get(i, i2, bitmap.getConfig());
        C12932j.m33815a((Object) bitmap2, "pool.get(outWidth, outHeight, srcBmp.config)");
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f7473c);
        TextPaint textPaint = new TextPaint(this.f7472b);
        float f = this.f7478h;
        if (f > ((float) 0) && f <= ((float) 1)) {
            textPaint.setTextSize(f * ((float) Math.min(i, i2)));
        }
        Layout a = m8723a(canvas.getWidth() - (this.f7479i * 2), textPaint);
        canvas.save();
        canvas.translate(((float) (canvas.getWidth() - a.getWidth())) / 2.0f, ((float) (canvas.getHeight() - a.getHeight())) / 2.0f);
        a.draw(canvas);
        canvas.restore();
        return bitmap2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2488b)) {
            return false;
        }
        C2488b bVar = (C2488b) obj;
        if (C12932j.m33817a((Object) bVar.f7475e, (Object) this.f7475e) && bVar.f7476f == this.f7476f && bVar.f7477g == this.f7477g && bVar.f7478h == this.f7478h && bVar.f7479i == this.f7479i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((("app.zenly.locator.core.glide.transformation.ForegroundText:2".hashCode() * 31) + this.f7475e.hashCode()) * 31) + Integer.valueOf(this.f7476f).hashCode()) * 31) + Integer.valueOf(this.f7477g).hashCode()) * 31) + Float.valueOf(this.f7478h).hashCode()) * 31) + Integer.valueOf(this.f7479i).hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        C12932j.m33818b(messageDigest, "messageDigest");
        messageDigest.update(f7471j);
        String str = this.f7475e;
        Charset charset = Key.f23163a;
        C12932j.m33815a((Object) charset, "CHARSET");
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7476f).array());
            messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7477g).array());
            messageDigest.update(ByteBuffer.allocate(4).putFloat(this.f7478h).array());
            messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7479i).array());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final Layout m8723a(int i, TextPaint textPaint) {
        Alignment alignment = Alignment.ALIGN_CENTER;
        TruncateAt truncateAt = TruncateAt.END;
        if (VERSION.SDK_INT >= 23) {
            String str = this.f7475e;
            Builder obtain = Builder.obtain(str, 0, str.length(), textPaint, i);
            C12932j.m33815a((Object) obtain, "StaticLayout.Builder.obt…extPaint, availableWidth)");
            StaticLayout build = obtain.setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).setEllipsize(truncateAt).setEllipsizedWidth(i).setMaxLines(1).build();
            C12932j.m33815a((Object) build, "layoutBuilder.setAlignme…\n                .build()");
            return build;
        }
        String str2 = this.f7475e;
        StaticLayout staticLayout = new StaticLayout(str2, 0, str2.length(), textPaint, i, alignment, 1.0f, 0.0f, false, truncateAt, i);
        return staticLayout;
    }
}
