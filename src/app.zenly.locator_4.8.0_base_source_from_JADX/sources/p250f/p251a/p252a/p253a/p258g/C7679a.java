package p250f.p251a.p252a.p253a.p258g;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Canvas.EdgeType;
import android.graphics.Canvas.VertexMode;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.g.a */
public class C7679a extends Canvas {

    /* renamed from: a */
    private final Canvas f19307a;

    public C7679a(Canvas canvas) {
        C12932j.m33818b(canvas, "wrappedCanvas");
        this.f19307a = canvas;
    }

    public void concat(Matrix matrix) {
        this.f19307a.concat(matrix);
    }

    public void drawARGB(int i, int i2, int i3, int i4) {
        this.f19307a.drawARGB(i, i2, i3, i4);
    }

    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        C12932j.m33818b(rectF, "oval");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawArc(rectF, f, f2, z, paint);
    }

    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        C12932j.m33818b(bitmap, "bitmap");
        this.f19307a.drawBitmap(bitmap, f, f2, paint);
    }

    public void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Bitmap bitmap2 = bitmap;
        C12932j.m33818b(bitmap, "bitmap");
        float[] fArr2 = fArr;
        C12932j.m33818b(fArr, "verts");
        this.f19307a.drawBitmapMesh(bitmap2, i, i2, fArr2, i3, iArr, i4, paint);
    }

    public void drawCircle(float f, float f2, float f3, Paint paint) {
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawCircle(f, f2, f3, paint);
    }

    public void drawColor(int i) {
        this.f19307a.drawColor(i);
    }

    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawLine(f, f2, f3, f4, paint);
    }

    public void drawLines(float[] fArr, int i, int i2, Paint paint) {
        C12932j.m33818b(fArr, "pts");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawLines(fArr, i, i2, paint);
    }

    public void drawOval(RectF rectF, Paint paint) {
        C12932j.m33818b(rectF, "oval");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawOval(rectF, paint);
    }

    public void drawPaint(Paint paint) {
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawPaint(paint);
    }

    public void drawPath(Path path, Paint paint) {
        C12932j.m33818b(path, "path");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawPath(path, paint);
    }

    public void drawPicture(Picture picture) {
        C12932j.m33818b(picture, "picture");
        this.f19307a.drawPicture(picture);
    }

    public void drawPoint(float f, float f2, Paint paint) {
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawPoint(f, f2, paint);
    }

    public void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        C12932j.m33818b(fArr, "pts");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawPoints(fArr, i, i2, paint);
    }

    public void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        C12932j.m33818b(cArr, "text");
        C12932j.m33818b(fArr, "pos");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawPosText(cArr, i, i2, fArr, paint);
    }

    public void drawRGB(int i, int i2, int i3) {
        this.f19307a.drawRGB(i, i2, i3);
    }

    public void drawRect(RectF rectF, Paint paint) {
        C12932j.m33818b(rectF, "rect");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawRect(rectF, paint);
    }

    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        C12932j.m33818b(rectF, "rect");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawRoundRect(rectF, f, f2, paint);
    }

    public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        C12932j.m33818b(cArr, "text");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawText(cArr, i, i2, f, f2, paint);
    }

    public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        char[] cArr2 = cArr;
        C12932j.m33818b(cArr, "text");
        Path path2 = path;
        C12932j.m33818b(path, "path");
        Paint paint2 = paint;
        C12932j.m33818b(paint2, "paint");
        this.f19307a.drawTextOnPath(cArr2, i, i2, path2, f, f2, paint2);
    }

    @TargetApi(23)
    public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        char[] cArr2 = cArr;
        C12932j.m33818b(cArr, "text");
        Paint paint2 = paint;
        C12932j.m33818b(paint2, "paint");
        this.f19307a.drawTextRun(cArr2, i, i2, i3, i4, f, f2, z, paint2);
    }

    public void drawVertices(VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        VertexMode vertexMode2 = vertexMode;
        C12932j.m33818b(vertexMode, "mode");
        float[] fArr3 = fArr;
        C12932j.m33818b(fArr3, "verts");
        Paint paint2 = paint;
        C12932j.m33818b(paint2, "paint");
        this.f19307a.drawVertices(vertexMode2, i, fArr3, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint2);
    }

    public boolean getClipBounds(Rect rect) {
        return this.f19307a.getClipBounds(rect);
    }

    public int getDensity() {
        return this.f19307a.getDensity();
    }

    public DrawFilter getDrawFilter() {
        return this.f19307a.getDrawFilter();
    }

    public int getHeight() {
        return this.f19307a.getHeight();
    }

    public void getMatrix(Matrix matrix) {
        C12932j.m33818b(matrix, "ctm");
        this.f19307a.getMatrix(matrix);
    }

    public int getMaximumBitmapHeight() {
        return this.f19307a.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        return this.f19307a.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        return this.f19307a.getSaveCount();
    }

    public int getWidth() {
        return this.f19307a.getWidth();
    }

    public boolean isOpaque() {
        return this.f19307a.isOpaque();
    }

    public boolean quickReject(RectF rectF, EdgeType edgeType) {
        C12932j.m33818b(rectF, "rect");
        C12932j.m33818b(edgeType, "type");
        return this.f19307a.quickReject(rectF, edgeType);
    }

    public void restore() {
        this.f19307a.restore();
    }

    public void restoreToCount(int i) {
        this.f19307a.restoreToCount(i);
    }

    public void rotate(float f) {
        this.f19307a.rotate(f);
    }

    public int save() {
        return this.f19307a.save();
    }

    public int saveLayer(RectF rectF, Paint paint, int i) {
        return this.f19307a.saveLayer(rectF, paint, i);
    }

    public int saveLayerAlpha(RectF rectF, int i, int i2) {
        return this.f19307a.saveLayerAlpha(rectF, i, i2);
    }

    public void scale(float f, float f2) {
        this.f19307a.scale(f, f2);
    }

    public void setBitmap(Bitmap bitmap) {
        this.f19307a.setBitmap(bitmap);
    }

    public void setDensity(int i) {
        this.f19307a.setDensity(i);
    }

    public void setDrawFilter(DrawFilter drawFilter) {
        this.f19307a.setDrawFilter(drawFilter);
    }

    public void skew(float f, float f2) {
        this.f19307a.skew(f, f2);
    }

    public void translate(float f, float f2) {
        this.f19307a.translate(f, f2);
    }

    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        Paint paint2 = paint;
        C12932j.m33818b(paint2, "paint");
        this.f19307a.drawArc(f, f2, f3, f4, f5, f6, z, paint2);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        C12932j.m33818b(bitmap, "bitmap");
        C12932j.m33818b(rectF, "dst");
        this.f19307a.drawBitmap(bitmap, rect, rectF, paint);
    }

    public void drawColor(int i, Mode mode) {
        C12932j.m33818b(mode, "mode");
        this.f19307a.drawColor(i, mode);
    }

    public void drawLines(float[] fArr, Paint paint) {
        C12932j.m33818b(fArr, "pts");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawLines(fArr, paint);
    }

    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawOval(f, f2, f3, f4, paint);
    }

    public void drawPicture(Picture picture, RectF rectF) {
        C12932j.m33818b(picture, "picture");
        C12932j.m33818b(rectF, "dst");
        this.f19307a.drawPicture(picture, rectF);
    }

    public void drawPoints(float[] fArr, Paint paint) {
        C12932j.m33818b(fArr, "pts");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawPoints(fArr, paint);
    }

    public void drawPosText(String str, float[] fArr, Paint paint) {
        C12932j.m33818b(str, "text");
        C12932j.m33818b(fArr, "pos");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawPosText(str, fArr, paint);
    }

    public void drawRect(Rect rect, Paint paint) {
        C12932j.m33818b(rect, "r");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawRect(rect, paint);
    }

    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        Paint paint2 = paint;
        C12932j.m33818b(paint2, "paint");
        this.f19307a.drawRoundRect(f, f2, f3, f4, f5, f6, paint2);
    }

    public void drawText(String str, float f, float f2, Paint paint) {
        C12932j.m33818b(str, "text");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawText(str, f, f2, paint);
    }

    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        C12932j.m33818b(str, "text");
        C12932j.m33818b(path, "path");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawTextOnPath(str, path, f, f2, paint);
    }

    @TargetApi(23)
    public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        CharSequence charSequence2 = charSequence;
        C12932j.m33818b(charSequence, "text");
        Paint paint2 = paint;
        C12932j.m33818b(paint2, "paint");
        this.f19307a.drawTextRun(charSequence2, i, i2, i3, i4, f, f2, z, paint2);
    }

    public boolean quickReject(Path path, EdgeType edgeType) {
        C12932j.m33818b(path, "path");
        C12932j.m33818b(edgeType, "type");
        return this.f19307a.quickReject(path, edgeType);
    }

    public int saveLayer(RectF rectF, Paint paint) {
        return this.f19307a.saveLayer(rectF, paint);
    }

    public int saveLayerAlpha(RectF rectF, int i) {
        return this.f19307a.saveLayerAlpha(rectF, i);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        C12932j.m33818b(bitmap, "bitmap");
        C12932j.m33818b(rect2, "dst");
        this.f19307a.drawBitmap(bitmap, rect, rect2, paint);
    }

    public void drawPicture(Picture picture, Rect rect) {
        C12932j.m33818b(picture, "picture");
        C12932j.m33818b(rect, "dst");
        this.f19307a.drawPicture(picture, rect);
    }

    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawRect(f, f2, f3, f4, paint);
    }

    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        C12932j.m33818b(str, "text");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawText(str, i, i2, f, f2, paint);
    }

    public boolean quickReject(float f, float f2, float f3, float f4, EdgeType edgeType) {
        C12932j.m33818b(edgeType, "type");
        return this.f19307a.quickReject(f, f2, f3, f4, edgeType);
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        return this.f19307a.saveLayer(f, f2, f3, f4, paint, i);
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return this.f19307a.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    public void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        int[] iArr2 = iArr;
        C12932j.m33818b(iArr, "colors");
        this.f19307a.drawBitmap(iArr2, i, i2, f, f2, i3, i4, z, paint);
    }

    public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        C12932j.m33818b(charSequence, "text");
        C12932j.m33818b(paint, "paint");
        this.f19307a.drawText(charSequence, i, i2, f, f2, paint);
    }

    public int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        return this.f19307a.saveLayer(f, f2, f3, f4, paint);
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return this.f19307a.saveLayerAlpha(f, f2, f3, f4, i);
    }

    public void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        int[] iArr2 = iArr;
        C12932j.m33818b(iArr, "colors");
        this.f19307a.drawBitmap(iArr2, i, i2, i3, i4, i5, i6, z, paint);
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        C12932j.m33818b(bitmap, "bitmap");
        C12932j.m33818b(matrix, "matrix");
        this.f19307a.drawBitmap(bitmap, matrix, paint);
    }
}
