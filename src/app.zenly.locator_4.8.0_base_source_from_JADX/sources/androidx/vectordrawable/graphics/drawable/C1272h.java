package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.content.res.C0550b;
import androidx.core.content.res.C0558f;
import androidx.core.graphics.drawable.C0559a;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p214e.p228e.C7571a;
import p214e.p234h.p235e.C7616c;
import p214e.p234h.p235e.C7616c.C7618b;

/* renamed from: androidx.vectordrawable.graphics.drawable.h */
public class C1272h extends C1271g {

    /* renamed from: n */
    static final Mode f4707n = Mode.SRC_IN;

    /* renamed from: f */
    private C1280h f4708f;

    /* renamed from: g */
    private PorterDuffColorFilter f4709g;

    /* renamed from: h */
    private ColorFilter f4710h;

    /* renamed from: i */
    private boolean f4711i;

    /* renamed from: j */
    private boolean f4712j;

    /* renamed from: k */
    private final float[] f4713k;

    /* renamed from: l */
    private final Matrix f4714l;

    /* renamed from: m */
    private final Rect f4715m;

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$b */
    private static class C1274b extends C1278f {
        C1274b() {
        }

        /* renamed from: a */
        public void mo6215a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0558f.m2622a(xmlPullParser, "pathData")) {
                TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C1260a.f4679d);
                m6076a(a, xmlPullParser);
                a.recycle();
            }
        }

        /* renamed from: b */
        public boolean mo6216b() {
            return true;
        }

        C1274b(C1274b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m6076a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4742b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4741a = C7616c.m18501a(string2);
            }
            this.f4743c = C0558f.m2623b(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$c */
    private static class C1275c extends C1278f {

        /* renamed from: e */
        private int[] f4716e;

        /* renamed from: f */
        C0550b f4717f;

        /* renamed from: g */
        float f4718g = 0.0f;

        /* renamed from: h */
        C0550b f4719h;

        /* renamed from: i */
        float f4720i = 1.0f;

        /* renamed from: j */
        float f4721j = 1.0f;

        /* renamed from: k */
        float f4722k = 0.0f;

        /* renamed from: l */
        float f4723l = 1.0f;

        /* renamed from: m */
        float f4724m = 0.0f;

        /* renamed from: n */
        Cap f4725n = Cap.BUTT;

        /* renamed from: o */
        Join f4726o = Join.MITER;

        /* renamed from: p */
        float f4727p = 4.0f;

        C1275c() {
        }

        /* renamed from: a */
        private Cap m6079a(int i, Cap cap) {
            if (i == 0) {
                return Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Cap.SQUARE;
            }
            return Cap.ROUND;
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f4721j;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.f4719h.mo3092a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f4720i;
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.f4717f.mo3092a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f4718g;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f4723l;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f4724m;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f4722k;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f4721j = f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f4719h.mo3093a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f4720i = f;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f4717f.mo3093a(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f4718g = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f4723l = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f4724m = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f4722k = f;
        }

        /* renamed from: a */
        private Join m6080a(int i, Join join) {
            if (i == 0) {
                return Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Join.BEVEL;
            }
            return Join.ROUND;
        }

        /* renamed from: a */
        public void mo6217a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C1260a.f4678c);
            m6081a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        private void m6081a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f4716e = null;
            if (C0558f.m2622a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4742b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4741a = C7616c.m18501a(string2);
                }
                Theme theme2 = theme;
                this.f4719h = C0558f.m2619a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f4721j = C0558f.m2614a(typedArray, xmlPullParser, "fillAlpha", 12, this.f4721j);
                this.f4725n = m6079a(C0558f.m2623b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4725n);
                this.f4726o = m6080a(C0558f.m2623b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4726o);
                this.f4727p = C0558f.m2614a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4727p);
                this.f4717f = C0558f.m2619a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f4720i = C0558f.m2614a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4720i);
                this.f4718g = C0558f.m2614a(typedArray, xmlPullParser, "strokeWidth", 4, this.f4718g);
                this.f4723l = C0558f.m2614a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4723l);
                this.f4724m = C0558f.m2614a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4724m);
                this.f4722k = C0558f.m2614a(typedArray, xmlPullParser, "trimPathStart", 5, this.f4722k);
                this.f4743c = C0558f.m2623b(typedArray, xmlPullParser, "fillType", 13, this.f4743c);
            }
        }

        C1275c(C1275c cVar) {
            super(cVar);
            this.f4716e = cVar.f4716e;
            this.f4717f = cVar.f4717f;
            this.f4718g = cVar.f4718g;
            this.f4720i = cVar.f4720i;
            this.f4719h = cVar.f4719h;
            this.f4743c = cVar.f4743c;
            this.f4721j = cVar.f4721j;
            this.f4722k = cVar.f4722k;
            this.f4723l = cVar.f4723l;
            this.f4724m = cVar.f4724m;
            this.f4725n = cVar.f4725n;
            this.f4726o = cVar.f4726o;
            this.f4727p = cVar.f4727p;
        }

        /* renamed from: a */
        public boolean mo6218a() {
            return this.f4719h.mo3097d() || this.f4717f.mo3097d();
        }

        /* renamed from: a */
        public boolean mo6219a(int[] iArr) {
            return this.f4717f.mo3094a(iArr) | this.f4719h.mo3094a(iArr);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$d */
    private static class C1276d extends C1277e {

        /* renamed from: a */
        final Matrix f4728a = new Matrix();

        /* renamed from: b */
        final ArrayList<C1277e> f4729b = new ArrayList<>();

        /* renamed from: c */
        float f4730c = 0.0f;

        /* renamed from: d */
        private float f4731d = 0.0f;

        /* renamed from: e */
        private float f4732e = 0.0f;

        /* renamed from: f */
        private float f4733f = 1.0f;

        /* renamed from: g */
        private float f4734g = 1.0f;

        /* renamed from: h */
        private float f4735h = 0.0f;

        /* renamed from: i */
        private float f4736i = 0.0f;

        /* renamed from: j */
        final Matrix f4737j = new Matrix();

        /* renamed from: k */
        int f4738k;

        /* renamed from: l */
        private int[] f4739l;

        /* renamed from: m */
        private String f4740m = null;

        public C1276d(C1276d dVar, C7571a<String, Object> aVar) {
            C1278f fVar;
            super();
            this.f4730c = dVar.f4730c;
            this.f4731d = dVar.f4731d;
            this.f4732e = dVar.f4732e;
            this.f4733f = dVar.f4733f;
            this.f4734g = dVar.f4734g;
            this.f4735h = dVar.f4735h;
            this.f4736i = dVar.f4736i;
            this.f4739l = dVar.f4739l;
            this.f4740m = dVar.f4740m;
            this.f4738k = dVar.f4738k;
            String str = this.f4740m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4737j.set(dVar.f4737j);
            ArrayList<C1277e> arrayList = dVar.f4729b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C1276d) {
                    this.f4729b.add(new C1276d((C1276d) obj, aVar));
                } else {
                    if (obj instanceof C1275c) {
                        fVar = new C1275c((C1275c) obj);
                    } else if (obj instanceof C1274b) {
                        fVar = new C1274b((C1274b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4729b.add(fVar);
                    String str2 = fVar.f4742b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m6086b() {
            this.f4737j.reset();
            this.f4737j.postTranslate(-this.f4731d, -this.f4732e);
            this.f4737j.postScale(this.f4733f, this.f4734g);
            this.f4737j.postRotate(this.f4730c, 0.0f, 0.0f);
            this.f4737j.postTranslate(this.f4735h + this.f4731d, this.f4736i + this.f4732e);
        }

        /* renamed from: a */
        public void mo6236a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C1260a.f4677b);
            m6085a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f4740m;
        }

        public Matrix getLocalMatrix() {
            return this.f4737j;
        }

        public float getPivotX() {
            return this.f4731d;
        }

        public float getPivotY() {
            return this.f4732e;
        }

        public float getRotation() {
            return this.f4730c;
        }

        public float getScaleX() {
            return this.f4733f;
        }

        public float getScaleY() {
            return this.f4734g;
        }

        public float getTranslateX() {
            return this.f4735h;
        }

        public float getTranslateY() {
            return this.f4736i;
        }

        public void setPivotX(float f) {
            if (f != this.f4731d) {
                this.f4731d = f;
                m6086b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f4732e) {
                this.f4732e = f;
                m6086b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f4730c) {
                this.f4730c = f;
                m6086b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f4733f) {
                this.f4733f = f;
                m6086b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f4734g) {
                this.f4734g = f;
                m6086b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f4735h) {
                this.f4735h = f;
                m6086b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f4736i) {
                this.f4736i = f;
                m6086b();
            }
        }

        /* renamed from: a */
        private void m6085a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4739l = null;
            this.f4730c = C0558f.m2614a(typedArray, xmlPullParser, "rotation", 5, this.f4730c);
            this.f4731d = typedArray.getFloat(1, this.f4731d);
            this.f4732e = typedArray.getFloat(2, this.f4732e);
            this.f4733f = C0558f.m2614a(typedArray, xmlPullParser, "scaleX", 3, this.f4733f);
            this.f4734g = C0558f.m2614a(typedArray, xmlPullParser, "scaleY", 4, this.f4734g);
            this.f4735h = C0558f.m2614a(typedArray, xmlPullParser, "translateX", 6, this.f4735h);
            this.f4736i = C0558f.m2614a(typedArray, xmlPullParser, "translateY", 7, this.f4736i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4740m = string;
            }
            m6086b();
        }

        /* renamed from: a */
        public boolean mo6218a() {
            for (int i = 0; i < this.f4729b.size(); i++) {
                if (((C1277e) this.f4729b.get(i)).mo6218a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo6219a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f4729b.size(); i++) {
                z |= ((C1277e) this.f4729b.get(i)).mo6219a(iArr);
            }
            return z;
        }

        public C1276d() {
            super();
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$e */
    private static abstract class C1277e {
        private C1277e() {
        }

        /* renamed from: a */
        public boolean mo6218a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo6219a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$f */
    private static abstract class C1278f extends C1277e {

        /* renamed from: a */
        protected C7618b[] f4741a = null;

        /* renamed from: b */
        String f4742b;

        /* renamed from: c */
        int f4743c = 0;

        /* renamed from: d */
        int f4744d;

        public C1278f() {
            super();
        }

        /* renamed from: a */
        public void mo6253a(Path path) {
            path.reset();
            C7618b[] bVarArr = this.f4741a;
            if (bVarArr != null) {
                C7618b.m18509a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo6216b() {
            return false;
        }

        public C7618b[] getPathData() {
            return this.f4741a;
        }

        public String getPathName() {
            return this.f4742b;
        }

        public void setPathData(C7618b[] bVarArr) {
            if (!C7616c.m18499a(this.f4741a, bVarArr)) {
                this.f4741a = C7616c.m18502a(bVarArr);
            } else {
                C7616c.m18504b(this.f4741a, bVarArr);
            }
        }

        public C1278f(C1278f fVar) {
            super();
            this.f4742b = fVar.f4742b;
            this.f4744d = fVar.f4744d;
            this.f4741a = C7616c.m18502a(fVar.f4741a);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$g */
    private static class C1279g {

        /* renamed from: q */
        private static final Matrix f4745q = new Matrix();

        /* renamed from: a */
        private final Path f4746a;

        /* renamed from: b */
        private final Path f4747b;

        /* renamed from: c */
        private final Matrix f4748c;

        /* renamed from: d */
        Paint f4749d;

        /* renamed from: e */
        Paint f4750e;

        /* renamed from: f */
        private PathMeasure f4751f;

        /* renamed from: g */
        private int f4752g;

        /* renamed from: h */
        final C1276d f4753h;

        /* renamed from: i */
        float f4754i;

        /* renamed from: j */
        float f4755j;

        /* renamed from: k */
        float f4756k;

        /* renamed from: l */
        float f4757l;

        /* renamed from: m */
        int f4758m;

        /* renamed from: n */
        String f4759n;

        /* renamed from: o */
        Boolean f4760o;

        /* renamed from: p */
        final C7571a<String, Object> f4761p;

        public C1279g() {
            this.f4748c = new Matrix();
            this.f4754i = 0.0f;
            this.f4755j = 0.0f;
            this.f4756k = 0.0f;
            this.f4757l = 0.0f;
            this.f4758m = 255;
            this.f4759n = null;
            this.f4760o = null;
            this.f4761p = new C7571a<>();
            this.f4753h = new C1276d();
            this.f4746a = new Path();
            this.f4747b = new Path();
        }

        /* renamed from: a */
        private static float m6094a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private void m6096a(C1276d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f4728a.set(matrix);
            dVar.f4728a.preConcat(dVar.f4737j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f4729b.size(); i3++) {
                C1277e eVar = (C1277e) dVar.f4729b.get(i3);
                if (eVar instanceof C1276d) {
                    m6096a((C1276d) eVar, dVar.f4728a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1278f) {
                    m6097a(dVar, (C1278f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4758m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f4758m = i;
        }

        /* renamed from: a */
        public void mo6257a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m6096a(this.f4753h, f4745q, canvas, i, i2, colorFilter);
        }

        public C1279g(C1279g gVar) {
            this.f4748c = new Matrix();
            this.f4754i = 0.0f;
            this.f4755j = 0.0f;
            this.f4756k = 0.0f;
            this.f4757l = 0.0f;
            this.f4758m = 255;
            this.f4759n = null;
            this.f4760o = null;
            this.f4761p = new C7571a<>();
            this.f4753h = new C1276d(gVar.f4753h, this.f4761p);
            this.f4746a = new Path(gVar.f4746a);
            this.f4747b = new Path(gVar.f4747b);
            this.f4754i = gVar.f4754i;
            this.f4755j = gVar.f4755j;
            this.f4756k = gVar.f4756k;
            this.f4757l = gVar.f4757l;
            this.f4752g = gVar.f4752g;
            this.f4758m = gVar.f4758m;
            this.f4759n = gVar.f4759n;
            String str = gVar.f4759n;
            if (str != null) {
                this.f4761p.put(str, this);
            }
            this.f4760o = gVar.f4760o;
        }

        /* renamed from: a */
        private void m6097a(C1276d dVar, C1278f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f4756k;
            float f2 = ((float) i2) / this.f4757l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f4728a;
            this.f4748c.set(matrix);
            this.f4748c.postScale(f, f2);
            float a = m6095a(matrix);
            if (a != 0.0f) {
                fVar.mo6253a(this.f4746a);
                Path path = this.f4746a;
                this.f4747b.reset();
                if (fVar.mo6216b()) {
                    this.f4747b.setFillType(fVar.f4743c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                    this.f4747b.addPath(path, this.f4748c);
                    canvas.clipPath(this.f4747b);
                } else {
                    C1275c cVar = (C1275c) fVar;
                    if (!(cVar.f4722k == 0.0f && cVar.f4723l == 1.0f)) {
                        float f3 = cVar.f4722k;
                        float f4 = cVar.f4724m;
                        float f5 = (f3 + f4) % 1.0f;
                        float f6 = (cVar.f4723l + f4) % 1.0f;
                        if (this.f4751f == null) {
                            this.f4751f = new PathMeasure();
                        }
                        this.f4751f.setPath(this.f4746a, false);
                        float length = this.f4751f.getLength();
                        float f7 = f5 * length;
                        float f8 = f6 * length;
                        path.reset();
                        if (f7 > f8) {
                            this.f4751f.getSegment(f7, length, path, true);
                            this.f4751f.getSegment(0.0f, f8, path, true);
                        } else {
                            this.f4751f.getSegment(f7, f8, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f4747b.addPath(path, this.f4748c);
                    if (cVar.f4719h.mo3098e()) {
                        C0550b bVar = cVar.f4719h;
                        if (this.f4750e == null) {
                            this.f4750e = new Paint(1);
                            this.f4750e.setStyle(Style.FILL);
                        }
                        Paint paint = this.f4750e;
                        if (bVar.mo3096c()) {
                            Shader b = bVar.mo3095b();
                            b.setLocalMatrix(this.f4748c);
                            paint.setShader(b);
                            paint.setAlpha(Math.round(cVar.f4721j * 255.0f));
                        } else {
                            paint.setShader(null);
                            paint.setAlpha(255);
                            paint.setColor(C1272h.m6067a(bVar.mo3092a(), cVar.f4721j));
                        }
                        paint.setColorFilter(colorFilter);
                        this.f4747b.setFillType(cVar.f4743c == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f4747b, paint);
                    }
                    if (cVar.f4717f.mo3098e()) {
                        C0550b bVar2 = cVar.f4717f;
                        if (this.f4749d == null) {
                            this.f4749d = new Paint(1);
                            this.f4749d.setStyle(Style.STROKE);
                        }
                        Paint paint2 = this.f4749d;
                        Join join = cVar.f4726o;
                        if (join != null) {
                            paint2.setStrokeJoin(join);
                        }
                        Cap cap = cVar.f4725n;
                        if (cap != null) {
                            paint2.setStrokeCap(cap);
                        }
                        paint2.setStrokeMiter(cVar.f4727p);
                        if (bVar2.mo3096c()) {
                            Shader b2 = bVar2.mo3095b();
                            b2.setLocalMatrix(this.f4748c);
                            paint2.setShader(b2);
                            paint2.setAlpha(Math.round(cVar.f4720i * 255.0f));
                        } else {
                            paint2.setShader(null);
                            paint2.setAlpha(255);
                            paint2.setColor(C1272h.m6067a(bVar2.mo3092a(), cVar.f4720i));
                        }
                        paint2.setColorFilter(colorFilter);
                        paint2.setStrokeWidth(cVar.f4718g * min * a);
                        canvas.drawPath(this.f4747b, paint2);
                    }
                }
            }
        }

        /* renamed from: a */
        private float m6095a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m6094a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo6258a() {
            if (this.f4760o == null) {
                this.f4760o = Boolean.valueOf(this.f4753h.mo6218a());
            }
            return this.f4760o.booleanValue();
        }

        /* renamed from: a */
        public boolean mo6259a(int[] iArr) {
            return this.f4753h.mo6219a(iArr);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h */
    private static class C1280h extends ConstantState {

        /* renamed from: a */
        int f4762a;

        /* renamed from: b */
        C1279g f4763b;

        /* renamed from: c */
        ColorStateList f4764c;

        /* renamed from: d */
        Mode f4765d;

        /* renamed from: e */
        boolean f4766e;

        /* renamed from: f */
        Bitmap f4767f;

        /* renamed from: g */
        ColorStateList f4768g;

        /* renamed from: h */
        Mode f4769h;

        /* renamed from: i */
        int f4770i;

        /* renamed from: j */
        boolean f4771j;

        /* renamed from: k */
        boolean f4772k;

        /* renamed from: l */
        Paint f4773l;

        public C1280h(C1280h hVar) {
            this.f4764c = null;
            this.f4765d = C1272h.f4707n;
            if (hVar != null) {
                this.f4762a = hVar.f4762a;
                this.f4763b = new C1279g(hVar.f4763b);
                Paint paint = hVar.f4763b.f4750e;
                if (paint != null) {
                    this.f4763b.f4750e = new Paint(paint);
                }
                Paint paint2 = hVar.f4763b.f4749d;
                if (paint2 != null) {
                    this.f4763b.f4749d = new Paint(paint2);
                }
                this.f4764c = hVar.f4764c;
                this.f4765d = hVar.f4765d;
                this.f4766e = hVar.f4766e;
            }
        }

        /* renamed from: a */
        public void mo6265a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4767f, null, rect, mo6264a(colorFilter));
        }

        /* renamed from: b */
        public boolean mo6270b() {
            return this.f4763b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo6271c(int i, int i2) {
            this.f4767f.eraseColor(0);
            this.f4763b.mo6257a(new Canvas(this.f4767f), i, i2, (ColorFilter) null);
        }

        /* renamed from: d */
        public void mo6273d() {
            this.f4768g = this.f4764c;
            this.f4769h = this.f4765d;
            this.f4770i = this.f4763b.getRootAlpha();
            this.f4771j = this.f4766e;
            this.f4772k = false;
        }

        public int getChangingConfigurations() {
            return this.f4762a;
        }

        public Drawable newDrawable() {
            return new C1272h(this);
        }

        /* renamed from: b */
        public void mo6269b(int i, int i2) {
            if (this.f4767f == null || !mo6267a(i, i2)) {
                this.f4767f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f4772k = true;
            }
        }

        public Drawable newDrawable(Resources resources) {
            return new C1272h(this);
        }

        /* renamed from: a */
        public Paint mo6264a(ColorFilter colorFilter) {
            if (!mo6270b() && colorFilter == null) {
                return null;
            }
            if (this.f4773l == null) {
                this.f4773l = new Paint();
                this.f4773l.setFilterBitmap(true);
            }
            this.f4773l.setAlpha(this.f4763b.getRootAlpha());
            this.f4773l.setColorFilter(colorFilter);
            return this.f4773l;
        }

        /* renamed from: c */
        public boolean mo6272c() {
            return this.f4763b.mo6258a();
        }

        /* renamed from: a */
        public boolean mo6267a(int i, int i2) {
            return i == this.f4767f.getWidth() && i2 == this.f4767f.getHeight();
        }

        /* renamed from: a */
        public boolean mo6266a() {
            return !this.f4772k && this.f4768g == this.f4764c && this.f4769h == this.f4765d && this.f4771j == this.f4766e && this.f4770i == this.f4763b.getRootAlpha();
        }

        public C1280h() {
            this.f4764c = null;
            this.f4765d = C1272h.f4707n;
            this.f4763b = new C1279g();
        }

        /* renamed from: a */
        public boolean mo6268a(int[] iArr) {
            boolean a = this.f4763b.mo6259a(iArr);
            this.f4772k |= a;
            return a;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$i */
    private static class C1281i extends ConstantState {

        /* renamed from: a */
        private final ConstantState f4774a;

        public C1281i(ConstantState constantState) {
            this.f4774a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4774a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4774a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1272h hVar = new C1272h();
            hVar.f4706e = (VectorDrawable) this.f4774a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1272h hVar = new C1272h();
            hVar.f4706e = (VectorDrawable) this.f4774a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C1272h hVar = new C1272h();
            hVar.f4706e = (VectorDrawable) this.f4774a.newDrawable(resources, theme);
            return hVar;
        }
    }

    C1272h() {
        this.f4712j = true;
        this.f4713k = new float[9];
        this.f4714l = new Matrix();
        this.f4715m = new Rect();
        this.f4708f = new C1280h();
    }

    public static C1272h createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C1272h hVar = new C1272h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo6190a(String str) {
        return this.f4708f.f4763b.f4761p.get(str);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2647a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4715m);
        if (this.f4715m.width() > 0 && this.f4715m.height() > 0) {
            ColorFilter colorFilter = this.f4710h;
            if (colorFilter == null) {
                colorFilter = this.f4709g;
            }
            canvas.getMatrix(this.f4714l);
            this.f4714l.getValues(this.f4713k);
            float abs = Math.abs(this.f4713k[0]);
            float abs2 = Math.abs(this.f4713k[4]);
            float abs3 = Math.abs(this.f4713k[1]);
            float abs4 = Math.abs(this.f4713k[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f4715m.height()) * abs2);
            int min = Math.min(ItemAnimator.FLAG_MOVED, (int) (((float) this.f4715m.width()) * abs));
            int min2 = Math.min(ItemAnimator.FLAG_MOVED, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f4715m;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m6072a()) {
                    canvas.translate((float) this.f4715m.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f4715m.offsetTo(0, 0);
                this.f4708f.mo6269b(min, min2);
                if (!this.f4712j) {
                    this.f4708f.mo6271c(min, min2);
                } else if (!this.f4708f.mo6266a()) {
                    this.f4708f.mo6271c(min, min2);
                    this.f4708f.mo6273d();
                }
                this.f4708f.mo6265a(canvas, colorFilter, this.f4715m);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return C0559a.m2651c(drawable);
        }
        return this.f4708f.f4763b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4708f.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return C0559a.m2652d(drawable);
        }
        return this.f4710h;
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f4706e;
        if (drawable != null && VERSION.SDK_INT >= 24) {
            return new C1281i(drawable.getConstantState());
        }
        this.f4708f.f4762a = getChangingConfigurations();
        return this.f4708f;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4708f.f4763b.f4755j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4708f.f4763b.f4754i;
    }

    public int getOpacity() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return C0559a.m2654f(drawable);
        }
        return this.f4708f.f4766e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f4706e
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f4708f
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo6272c()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.h$h r0 = r1.f4708f
            android.content.res.ColorStateList r0 = r0.f4764c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1272h.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4711i && super.mutate() == this) {
            this.f4708f = new C1280h(this.f4708f);
            this.f4711i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1280h hVar = this.f4708f;
        ColorStateList colorStateList = hVar.f4764c;
        if (colorStateList != null) {
            Mode mode = hVar.f4765d;
            if (mode != null) {
                this.f4709g = mo6189a(this.f4709g, colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (hVar.mo6272c() && hVar.mo6268a(iArr)) {
            invalidateSelf();
            z = true;
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.f4708f.f4763b.getRootAlpha() != i) {
            this.f4708f.f4763b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2646a(drawable, z);
        } else {
            this.f4708f.f4766e = z;
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2650b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2642a(drawable, colorStateList);
            return;
        }
        C1280h hVar = this.f4708f;
        if (hVar.f4764c != colorStateList) {
            hVar.f4764c = colorStateList;
            this.f4709g = mo6189a(this.f4709g, colorStateList, hVar.f4765d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2645a(drawable, mode);
            return;
        }
        C1280h hVar = this.f4708f;
        if (hVar.f4765d != mode) {
            hVar.f4765d = mode;
            this.f4709g = mo6189a(this.f4709g, hVar.f4764c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PorterDuffColorFilter mo6189a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4710h = colorFilter;
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.C1272h m6069a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            androidx.vectordrawable.graphics.drawable.h r0 = new androidx.vectordrawable.graphics.drawable.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0554e.m2609b(r6, r7, r8)
            r0.f4706e = r6
            androidx.vectordrawable.graphics.drawable.h$i r6 = new androidx.vectordrawable.graphics.drawable.h$i
            android.graphics.drawable.Drawable r7 = r0.f4706e
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            androidx.vectordrawable.graphics.drawable.h r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1272h.m6069a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.h");
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2644a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1280h hVar = this.f4708f;
        hVar.f4763b = new C1279g();
        TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C1260a.f4676a);
        m6071a(a, xmlPullParser, theme);
        a.recycle();
        hVar.f4762a = getChangingConfigurations();
        hVar.f4772k = true;
        m6070a(resources, xmlPullParser, attributeSet, theme);
        this.f4709g = mo6189a(this.f4709g, hVar.f4764c, hVar.f4765d);
    }

    C1272h(C1280h hVar) {
        this.f4712j = true;
        this.f4713k = new float[9];
        this.f4714l = new Matrix();
        this.f4715m = new Rect();
        this.f4708f = hVar;
        this.f4709g = mo6189a(this.f4709g, hVar.f4764c, hVar.f4765d);
    }

    /* renamed from: a */
    static int m6067a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static Mode m6068a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m6071a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) throws XmlPullParserException {
        C1280h hVar = this.f4708f;
        C1279g gVar = hVar.f4763b;
        hVar.f4765d = m6068a(C0558f.m2623b(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList a = C0558f.m2616a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a != null) {
            hVar.f4764c = a;
        }
        hVar.f4766e = C0558f.m2621a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4766e);
        gVar.f4756k = C0558f.m2614a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4756k);
        gVar.f4757l = C0558f.m2614a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4757l);
        if (gVar.f4756k <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (gVar.f4757l > 0.0f) {
            gVar.f4754i = typedArray.getDimension(3, gVar.f4754i);
            gVar.f4755j = typedArray.getDimension(2, gVar.f4755j);
            if (gVar.f4754i <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (gVar.f4755j > 0.0f) {
                gVar.setAlpha(C0558f.m2614a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4759n = string;
                    gVar.f4761p.put(string, gVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    /* renamed from: a */
    private void m6070a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C1280h hVar = this.f4708f;
        C1279g gVar = hVar.f4763b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4753h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1276d dVar = (C1276d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1275c cVar = new C1275c();
                    cVar.mo6217a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4729b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4761p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f4762a = cVar.f4744d | hVar.f4762a;
                } else if ("clip-path".equals(name)) {
                    C1274b bVar = new C1274b();
                    bVar.mo6215a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4729b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4761p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4762a = bVar.f4744d | hVar.f4762a;
                } else if (str.equals(name)) {
                    C1276d dVar2 = new C1276d();
                    dVar2.mo6236a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4729b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4761p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4762a = dVar2.f4738k | hVar.f4762a;
                }
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6191a(boolean z) {
        this.f4712j = z;
    }

    /* renamed from: a */
    private boolean m6072a() {
        if (VERSION.SDK_INT < 17 || !isAutoMirrored() || C0559a.m2653e(this) != 1) {
            return false;
        }
        return true;
    }
}
