package zendesk.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.renderscript.RenderScript;
import com.squareup.picasso.Transformation;
import java.util.Locale;

public class PicassoTransformations {

    private static class BlurTransformation implements Transformation {

        /* renamed from: rs */
        private final RenderScript f35193rs;

        BlurTransformation(Context context) {
            this.f35193rs = RenderScript.create(context);
        }

        public String key() {
            return "blur";
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap transform(android.graphics.Bitmap r7) {
            /*
                r6 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 17
                if (r0 < r1) goto L_0x0079
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                r1 = 1
                android.graphics.Bitmap r0 = r7.copy(r0, r1)
                android.renderscript.RenderScript r2 = r6.f35193rs
                android.renderscript.Element r3 = android.renderscript.Element.U8_4(r2)
                android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r2, r3)
                r3 = 0
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0061 }
                r5 = 18
                if (r4 < r5) goto L_0x0029
                android.renderscript.RenderScript r1 = r6.f35193rs     // Catch:{ all -> 0x0061 }
                android.renderscript.Allocation$MipmapControl r4 = android.renderscript.Allocation.MipmapControl.MIPMAP_FULL     // Catch:{ all -> 0x0061 }
                r5 = 128(0x80, float:1.794E-43)
                android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r1, r0, r4, r5)     // Catch:{ all -> 0x0061 }
                goto L_0x0031
            L_0x0029:
                android.renderscript.RenderScript r4 = r6.f35193rs     // Catch:{ all -> 0x0061 }
                android.renderscript.Allocation$MipmapControl r5 = android.renderscript.Allocation.MipmapControl.MIPMAP_FULL     // Catch:{ all -> 0x0061 }
                android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r4, r0, r5, r1)     // Catch:{ all -> 0x0061 }
            L_0x0031:
                android.renderscript.RenderScript r4 = r6.f35193rs     // Catch:{ all -> 0x005f }
                android.renderscript.Type r5 = r1.getType()     // Catch:{ all -> 0x005f }
                android.renderscript.Allocation r3 = android.renderscript.Allocation.createTyped(r4, r5)     // Catch:{ all -> 0x005f }
                r2.setInput(r1)     // Catch:{ all -> 0x005f }
                r4 = 1103626240(0x41c80000, float:25.0)
                r2.setRadius(r4)     // Catch:{ all -> 0x005f }
                r2.forEach(r3)     // Catch:{ all -> 0x005f }
                r3.copyTo(r0)     // Catch:{ all -> 0x005f }
                r7.recycle()
                android.renderscript.RenderScript r7 = r6.f35193rs
                r7.destroy()
                r2.destroy()
                if (r1 == 0) goto L_0x0059
                r1.destroy()
            L_0x0059:
                if (r3 == 0) goto L_0x005e
                r3.destroy()
            L_0x005e:
                return r0
            L_0x005f:
                r0 = move-exception
                goto L_0x0063
            L_0x0061:
                r0 = move-exception
                r1 = r3
            L_0x0063:
                r7.recycle()
                android.renderscript.RenderScript r7 = r6.f35193rs
                r7.destroy()
                r2.destroy()
                if (r1 == 0) goto L_0x0073
                r1.destroy()
            L_0x0073:
                if (r3 == 0) goto L_0x0078
                r3.destroy()
            L_0x0078:
                throw r0
            L_0x0079:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.PicassoTransformations.BlurTransformation.transform(android.graphics.Bitmap):android.graphics.Bitmap");
        }
    }

    private static class RoundedTransformation implements Transformation {
        private final int radius;
        private final int strokeColor;
        private final int strokeWidth;

        RoundedTransformation(int i) {
            this(i, 0, -1);
        }

        private RectF getMask(int i, int i2, int i3) {
            float f = (float) i3;
            return new RectF(f, f, (float) (i - i3), (float) (i2 - i3));
        }

        private Paint shapePaint(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            TileMode tileMode = TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            return paint;
        }

        private Paint strokePaint() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Style.FILL);
            paint.setColor(this.strokeColor);
            return paint;
        }

        public String key() {
            return String.format(Locale.US, "rounded-%s-%s-%s", new Object[]{Integer.valueOf(this.radius), Integer.valueOf(this.strokeColor), Integer.valueOf(this.strokeWidth)});
        }

        public Bitmap transform(Bitmap bitmap) {
            if (this.strokeWidth > 0) {
                if (!bitmap.isMutable()) {
                    Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                    if (copy != bitmap) {
                        bitmap.recycle();
                    }
                    bitmap = copy;
                }
                Canvas canvas = new Canvas(bitmap);
                Paint strokePaint = strokePaint();
                Path path = new Path();
                path.setFillType(FillType.INVERSE_EVEN_ODD);
                RectF mask = getMask(bitmap.getWidth(), bitmap.getHeight(), this.strokeWidth);
                int i = this.radius;
                path.addRoundRect(mask, (float) i, (float) i, Direction.CW);
                canvas.drawPath(path, strokePaint);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint shapePaint = shapePaint(bitmap);
            RectF mask2 = getMask(bitmap.getWidth(), bitmap.getHeight(), 0);
            int i2 = this.radius;
            canvas2.drawRoundRect(mask2, (float) i2, (float) i2, shapePaint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        RoundedTransformation(int i, int i2, int i3) {
            this.radius = i;
            this.strokeColor = i2;
            this.strokeWidth = i3;
        }
    }

    public static Transformation getBlurTransformation(Context context) {
        return new BlurTransformation(context);
    }

    public static Transformation getRoundWithBorderTransformation(int i, int i2, int i3) {
        return new RoundedTransformation(i, i2, i3);
    }

    public static Transformation getRoundedTransformation(int i) {
        return new RoundedTransformation(i);
    }
}
