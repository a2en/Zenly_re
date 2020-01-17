package zendesk.belvedere;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import com.squareup.picasso.Transformation;
import java.util.Locale;
import zendesk.belvedere.p428s.C13538f;

/* renamed from: zendesk.belvedere.r */
class C13531r {

    /* renamed from: zendesk.belvedere.r$a */
    private static class C13532a implements Transformation {

        /* renamed from: a */
        private final int f35077a;

        /* renamed from: b */
        private final int f35078b;

        C13532a(int i, int i2) {
            this.f35077a = i;
            this.f35078b = i2;
        }

        public String key() {
            return String.format(Locale.US, "rounded-%s-%s", new Object[]{Integer.valueOf(this.f35077a), Integer.valueOf(this.f35078b)});
        }

        public Bitmap transform(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            TileMode tileMode = TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i = this.f35078b;
            RectF rectF = new RectF((float) i, (float) i, (float) (bitmap.getWidth() - this.f35078b), (float) (bitmap.getHeight() - this.f35078b));
            int i2 = this.f35077a;
            canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    /* renamed from: a */
    static void m35853a(View view, boolean z) {
        int i = 0;
        view.findViewById(C13538f.image_stream_toolbar).setVisibility(z ? 0 : 8);
        View findViewById = view.findViewById(C13538f.image_stream_toolbar_container);
        if (findViewById != null) {
            if (!z) {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: b */
    static Transformation m35856b(Context context, int i) {
        return new C13532a(context.getResources().getDimensionPixelOffset(i), 0);
    }

    /* renamed from: a */
    static int m35852a(Context context, int i) {
        int i2;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return -16777216;
        }
        int i3 = typedValue.resourceId;
        if (i3 == 0) {
            i2 = typedValue.data;
        } else {
            i2 = C0540a.m2536a(context, i3);
        }
        return i2;
    }

    /* renamed from: a */
    static void m35854a(ImageView imageView, int i) {
        if (imageView != null) {
            Drawable i2 = C0559a.m2657i(imageView.getDrawable());
            if (i2 != null) {
                C0559a.m2650b(i2.mutate(), i);
            }
            imageView.invalidate();
        }
    }

    /* renamed from: a */
    static boolean m35855a(String str, Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).enabled;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
