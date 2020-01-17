package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.theartofdev.edmodo.cropper.C11932b.C11933a;
import com.theartofdev.edmodo.cropper.CropOverlayView.CropWindowChangeListener;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class CropImageView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public OnSetCropOverlayReleasedListener f30944A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public OnSetCropOverlayMovedListener f30945B;

    /* renamed from: C */
    private OnSetCropWindowChangeListener f30946C;

    /* renamed from: D */
    private OnSetImageUriCompleteListener f30947D;

    /* renamed from: E */
    private OnCropImageCompleteListener f30948E;

    /* renamed from: F */
    private Uri f30949F;

    /* renamed from: G */
    private int f30950G;

    /* renamed from: H */
    private float f30951H;

    /* renamed from: I */
    private float f30952I;

    /* renamed from: J */
    private float f30953J;

    /* renamed from: K */
    private RectF f30954K;

    /* renamed from: L */
    private int f30955L;

    /* renamed from: M */
    private boolean f30956M;

    /* renamed from: N */
    private Uri f30957N;

    /* renamed from: O */
    private WeakReference<C11932b> f30958O;

    /* renamed from: P */
    private WeakReference<C11930a> f30959P;

    /* renamed from: e */
    private final ImageView f30960e;

    /* renamed from: f */
    private final CropOverlayView f30961f;

    /* renamed from: g */
    private final Matrix f30962g;

    /* renamed from: h */
    private final Matrix f30963h;

    /* renamed from: i */
    private final ProgressBar f30964i;

    /* renamed from: j */
    private final float[] f30965j;

    /* renamed from: k */
    private final float[] f30966k;

    /* renamed from: l */
    private C11937d f30967l;

    /* renamed from: m */
    private Bitmap f30968m;

    /* renamed from: n */
    private int f30969n;

    /* renamed from: o */
    private int f30970o;

    /* renamed from: p */
    private boolean f30971p;

    /* renamed from: q */
    private boolean f30972q;

    /* renamed from: r */
    private int f30973r;

    /* renamed from: s */
    private int f30974s;

    /* renamed from: t */
    private int f30975t;

    /* renamed from: u */
    private C11927f f30976u;

    /* renamed from: v */
    private boolean f30977v;

    /* renamed from: w */
    private boolean f30978w;

    /* renamed from: x */
    private boolean f30979x;

    /* renamed from: y */
    private boolean f30980y;

    /* renamed from: z */
    private int f30981z;

    public interface OnCropImageCompleteListener {
        void onCropImageComplete(CropImageView cropImageView, C11923b bVar);
    }

    public interface OnSetCropOverlayMovedListener {
        void onCropOverlayMoved(Rect rect);
    }

    public interface OnSetCropOverlayReleasedListener {
        void onCropOverlayReleased(Rect rect);
    }

    public interface OnSetCropWindowChangeListener {
        void onCropWindowChanged();
    }

    public interface OnSetImageUriCompleteListener {
        void onSetImageUriComplete(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$a */
    class C11922a implements CropWindowChangeListener {
        C11922a() {
        }

        public void onCropWindowChanged(boolean z) {
            CropImageView.this.m31306a(z, true);
            OnSetCropOverlayReleasedListener a = CropImageView.this.f30944A;
            if (a != null && !z) {
                a.onCropOverlayReleased(CropImageView.this.getCropRect());
            }
            OnSetCropOverlayMovedListener b = CropImageView.this.f30945B;
            if (b != null && z) {
                b.onCropOverlayMoved(CropImageView.this.getCropRect());
            }
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$b */
    public static class C11923b {

        /* renamed from: e */
        private final Uri f30983e;

        /* renamed from: f */
        private final Uri f30984f;

        /* renamed from: g */
        private final Exception f30985g;

        /* renamed from: h */
        private final float[] f30986h;

        /* renamed from: i */
        private final Rect f30987i;

        /* renamed from: j */
        private final Rect f30988j;

        /* renamed from: k */
        private final int f30989k;

        /* renamed from: l */
        private final int f30990l;

        C11923b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f30983e = uri;
            this.f30984f = uri2;
            this.f30985g = exc;
            this.f30986h = fArr;
            this.f30987i = rect;
            this.f30988j = rect2;
            this.f30989k = i;
            this.f30990l = i2;
        }

        /* renamed from: a */
        public float[] mo35388a() {
            return this.f30986h;
        }

        /* renamed from: b */
        public Rect mo35389b() {
            return this.f30987i;
        }

        /* renamed from: c */
        public Exception mo35390c() {
            return this.f30985g;
        }

        /* renamed from: d */
        public Uri mo35391d() {
            return this.f30983e;
        }

        /* renamed from: e */
        public int mo35392e() {
            return this.f30989k;
        }

        /* renamed from: f */
        public int mo35393f() {
            return this.f30990l;
        }

        /* renamed from: g */
        public Uri mo35394g() {
            return this.f30984f;
        }

        /* renamed from: h */
        public Rect mo35395h() {
            return this.f30988j;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$c */
    public enum C11924c {
        RECTANGLE,
        OVAL
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$d */
    public enum C11925d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$e */
    public enum C11926e {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$f */
    public enum C11927f {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m31308c() {
        if (this.f30968m != null && (this.f30975t > 0 || this.f30949F != null)) {
            this.f30968m.recycle();
        }
        this.f30968m = null;
        this.f30975t = 0;
        this.f30949F = null;
        this.f30950G = 1;
        this.f30970o = 0;
        this.f30951H = 1.0f;
        this.f30952I = 0.0f;
        this.f30953J = 0.0f;
        this.f30962g.reset();
        this.f30957N = null;
        this.f30960e.setImageBitmap(null);
        m31310e();
    }

    /* renamed from: d */
    private void m31309d() {
        float[] fArr = this.f30965j;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = (float) this.f30968m.getWidth();
        float[] fArr2 = this.f30965j;
        fArr2[3] = 0.0f;
        fArr2[4] = (float) this.f30968m.getWidth();
        this.f30965j[5] = (float) this.f30968m.getHeight();
        float[] fArr3 = this.f30965j;
        fArr3[6] = 0.0f;
        fArr3[7] = (float) this.f30968m.getHeight();
        this.f30962g.mapPoints(this.f30965j);
        float[] fArr4 = this.f30966k;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f30962g.mapPoints(fArr4);
    }

    /* renamed from: e */
    private void m31310e() {
        CropOverlayView cropOverlayView = this.f30961f;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f30978w || this.f30968m == null) ? 4 : 0);
        }
    }

    /* renamed from: f */
    private void m31311f() {
        int i = 0;
        boolean z = this.f30979x && ((this.f30968m == null && this.f30958O != null) || this.f30959P != null);
        ProgressBar progressBar = this.f30964i;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f30961f.getAspectRatioX()), Integer.valueOf(this.f30961f.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f30961f.getCropWindowRect();
        float f = cropWindowRect.left;
        float f2 = cropWindowRect.top;
        float f3 = cropWindowRect.right;
        float f4 = cropWindowRect.bottom;
        float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
        this.f30962g.invert(this.f30963h);
        this.f30963h.mapPoints(fArr);
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr[i] * ((float) this.f30950G);
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i = this.f30950G;
        Bitmap bitmap = this.f30968m;
        if (bitmap == null) {
            return null;
        }
        return C11934c.m31368a(getCropPoints(), bitmap.getWidth() * i, i * bitmap.getHeight(), this.f30961f.mo35401b(), this.f30961f.getAspectRatioX(), this.f30961f.getAspectRatioY());
    }

    public C11924c getCropShape() {
        return this.f30961f.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f30961f;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        return mo35331a(0, 0, C11926e.NONE);
    }

    public void getCroppedImageAsync() {
        mo35341b(0, 0, C11926e.NONE);
    }

    public C11925d getGuidelines() {
        return this.f30961f.getGuidelines();
    }

    public int getImageResource() {
        return this.f30975t;
    }

    public Uri getImageUri() {
        return this.f30949F;
    }

    public int getMaxZoom() {
        return this.f30981z;
    }

    public int getRotatedDegrees() {
        return this.f30970o;
    }

    public C11927f getScaleType() {
        return this.f30976u;
    }

    public Rect getWholeImageRect() {
        int i = this.f30950G;
        Bitmap bitmap = this.f30968m;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f30973r <= 0 || this.f30974s <= 0) {
            m31305a(true);
            return;
        }
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f30973r;
        layoutParams.height = this.f30974s;
        setLayoutParams(layoutParams);
        if (this.f30968m != null) {
            float f = (float) (i3 - i);
            float f2 = (float) (i4 - i2);
            m31302a(f, f2, true, false);
            if (this.f30954K != null) {
                int i5 = this.f30955L;
                if (i5 != this.f30969n) {
                    this.f30970o = i5;
                    m31302a(f, f2, true, false);
                }
                this.f30962g.mapRect(this.f30954K);
                this.f30961f.setCropWindowRect(this.f30954K);
                m31306a(false, false);
                this.f30961f.mo35396a();
                this.f30954K = null;
            } else if (this.f30956M) {
                this.f30956M = false;
                m31306a(false, false);
            }
        } else {
            m31305a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f30968m;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            double width = size < this.f30968m.getWidth() ? ((double) size) / ((double) this.f30968m.getWidth()) : Double.POSITIVE_INFINITY;
            double height = size2 < this.f30968m.getHeight() ? ((double) size2) / ((double) this.f30968m.getHeight()) : Double.POSITIVE_INFINITY;
            if (width == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
                i4 = this.f30968m.getWidth();
                i3 = this.f30968m.getHeight();
            } else if (width <= height) {
                i3 = (int) (((double) this.f30968m.getHeight()) * width);
                i4 = size;
            } else {
                i4 = (int) (((double) this.f30968m.getWidth()) * height);
                i3 = size2;
            }
            int a = m31300a(mode, size, i4);
            int a2 = m31300a(mode2, size2, i3);
            this.f30973r = a;
            this.f30974s = a2;
            setMeasuredDimension(this.f30973r, this.f30974s);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f30958O == null && this.f30949F == null && this.f30968m == null && this.f30975t == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = C11934c.f31078g;
                        Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) C11934c.f31078g.second).get();
                        C11934c.f31078g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            m31303a(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.f30949F == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i2 = bundle.getInt("DEGREES_ROTATED");
                this.f30955L = i2;
                this.f30970o = i2;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    this.f30961f.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    this.f30954K = rectF;
                }
                this.f30961f.setCropShape(C11924c.valueOf(bundle.getString("CROP_SHAPE")));
                this.f30980y = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f30981z = bundle.getInt("CROP_MAX_ZOOM");
                this.f30971p = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.f30972q = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (this.f30949F == null && this.f30968m == null && this.f30975t < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f30949F;
        if (this.f30977v && uri == null && this.f30975t < 1) {
            uri = C11934c.m31369a(getContext(), this.f30968m, this.f30957N);
            this.f30957N = uri;
        }
        if (!(uri == null || this.f30968m == null)) {
            String uuid = UUID.randomUUID().toString();
            C11934c.f31078g = new Pair<>(uuid, new WeakReference(this.f30968m));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<C11932b> weakReference = this.f30958O;
        if (weakReference != null) {
            C11932b bVar = (C11932b) weakReference.get();
            if (bVar != null) {
                bundle.putParcelable("LOADING_IMAGE_URI", bVar.mo35426a());
            }
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f30975t);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f30950G);
        bundle.putInt("DEGREES_ROTATED", this.f30970o);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f30961f.getInitialCropWindowRect());
        C11934c.f31074c.set(this.f30961f.getCropWindowRect());
        this.f30962g.invert(this.f30963h);
        this.f30963h.mapRect(C11934c.f31074c);
        bundle.putParcelable("CROP_WINDOW_RECT", C11934c.f31074c);
        bundle.putString("CROP_SHAPE", this.f30961f.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f30980y);
        bundle.putInt("CROP_MAX_ZOOM", this.f30981z);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f30971p);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f30972q);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f30956M = i3 > 0 && i4 > 0;
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f30980y != z) {
            this.f30980y = z;
            m31306a(false, false);
            this.f30961f.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f30961f.setInitialCropWindowRect(rect);
    }

    public void setCropShape(C11924c cVar) {
        this.f30961f.setCropShape(cVar);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f30961f.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f30971p != z) {
            this.f30971p = z;
            m31302a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f30972q != z) {
            this.f30972q = z;
            m31302a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setGuidelines(C11925d dVar) {
        this.f30961f.setGuidelines(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f30961f.setInitialCropWindowRect(null);
        m31303a(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f30961f.setInitialCropWindowRect(null);
            m31303a(BitmapFactory.decodeResource(getResources(), i), i, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<C11932b> weakReference = this.f30958O;
            AsyncTask asyncTask = weakReference != null ? (C11932b) weakReference.get() : null;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            m31308c();
            this.f30954K = null;
            this.f30955L = 0;
            this.f30961f.setInitialCropWindowRect(null);
            this.f30958O = new WeakReference<>(new C11932b(this, uri));
            ((C11932b) this.f30958O.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m31311f();
        }
    }

    public void setMaxZoom(int i) {
        if (this.f30981z != i && i > 0) {
            this.f30981z = i;
            m31306a(false, false);
            this.f30961f.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f30961f.mo35400a(z)) {
            m31306a(false, false);
            this.f30961f.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(OnCropImageCompleteListener onCropImageCompleteListener) {
        this.f30948E = onCropImageCompleteListener;
    }

    public void setOnCropWindowChangedListener(OnSetCropWindowChangeListener onSetCropWindowChangeListener) {
        this.f30946C = onSetCropWindowChangeListener;
    }

    public void setOnSetCropOverlayMovedListener(OnSetCropOverlayMovedListener onSetCropOverlayMovedListener) {
        this.f30945B = onSetCropOverlayMovedListener;
    }

    public void setOnSetCropOverlayReleasedListener(OnSetCropOverlayReleasedListener onSetCropOverlayReleasedListener) {
        this.f30944A = onSetCropOverlayReleasedListener;
    }

    public void setOnSetImageUriCompleteListener(OnSetImageUriCompleteListener onSetImageUriCompleteListener) {
        this.f30947D = onSetImageUriCompleteListener;
    }

    public void setRotatedDegrees(int i) {
        int i2 = this.f30970o;
        if (i2 != i) {
            mo35333a(i - i2);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f30977v = z;
    }

    public void setScaleType(C11927f fVar) {
        if (fVar != this.f30976u) {
            this.f30976u = fVar;
            this.f30951H = 1.0f;
            this.f30953J = 0.0f;
            this.f30952I = 0.0f;
            this.f30961f.mo35402c();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f30978w != z) {
            this.f30978w = z;
            m31310e();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f30979x != z) {
            this.f30979x = z;
            m31311f();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= 0.0f) {
            this.f30961f.setSnapRadius(f);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30962g = new Matrix();
        this.f30963h = new Matrix();
        this.f30965j = new float[8];
        this.f30966k = new float[8];
        this.f30977v = false;
        this.f30978w = true;
        this.f30979x = true;
        this.f30980y = true;
        this.f30950G = 1;
        this.f30951H = 1.0f;
        CropImageOptions cropImageOptions = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
            if (bundleExtra != null) {
                cropImageOptions = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            }
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11946k.CropImageView, 0, 0);
                try {
                    cropImageOptions.f30933p = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropFixAspectRatio, cropImageOptions.f30933p);
                    cropImageOptions.f30934q = obtainStyledAttributes.getInteger(C11946k.CropImageView_cropAspectRatioX, cropImageOptions.f30934q);
                    cropImageOptions.f30935r = obtainStyledAttributes.getInteger(C11946k.CropImageView_cropAspectRatioY, cropImageOptions.f30935r);
                    cropImageOptions.f30926i = C11927f.values()[obtainStyledAttributes.getInt(C11946k.CropImageView_cropScaleType, cropImageOptions.f30926i.ordinal())];
                    cropImageOptions.f30929l = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropAutoZoomEnabled, cropImageOptions.f30929l);
                    cropImageOptions.f30930m = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropMultiTouchEnabled, cropImageOptions.f30930m);
                    cropImageOptions.f30931n = obtainStyledAttributes.getInteger(C11946k.CropImageView_cropMaxZoom, cropImageOptions.f30931n);
                    cropImageOptions.f30922e = C11924c.values()[obtainStyledAttributes.getInt(C11946k.CropImageView_cropShape, cropImageOptions.f30922e.ordinal())];
                    cropImageOptions.f30925h = C11925d.values()[obtainStyledAttributes.getInt(C11946k.CropImageView_cropGuidelines, cropImageOptions.f30925h.ordinal())];
                    cropImageOptions.f30923f = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropSnapRadius, cropImageOptions.f30923f);
                    cropImageOptions.f30924g = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropTouchRadius, cropImageOptions.f30924g);
                    cropImageOptions.f30932o = obtainStyledAttributes.getFloat(C11946k.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions.f30932o);
                    cropImageOptions.f30936s = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropBorderLineThickness, cropImageOptions.f30936s);
                    cropImageOptions.f30937t = obtainStyledAttributes.getInteger(C11946k.CropImageView_cropBorderLineColor, cropImageOptions.f30937t);
                    cropImageOptions.f30938u = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropBorderCornerThickness, cropImageOptions.f30938u);
                    cropImageOptions.f30939v = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropBorderCornerOffset, cropImageOptions.f30939v);
                    cropImageOptions.f30940w = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropBorderCornerLength, cropImageOptions.f30940w);
                    cropImageOptions.f30941x = obtainStyledAttributes.getInteger(C11946k.CropImageView_cropBorderCornerColor, cropImageOptions.f30941x);
                    cropImageOptions.f30942y = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropGuidelinesThickness, cropImageOptions.f30942y);
                    cropImageOptions.f30943z = obtainStyledAttributes.getInteger(C11946k.CropImageView_cropGuidelinesColor, cropImageOptions.f30943z);
                    cropImageOptions.f30896A = obtainStyledAttributes.getInteger(C11946k.CropImageView_cropBackgroundColor, cropImageOptions.f30896A);
                    cropImageOptions.f30927j = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropShowCropOverlay, this.f30978w);
                    cropImageOptions.f30928k = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropShowProgressBar, this.f30979x);
                    cropImageOptions.f30938u = obtainStyledAttributes.getDimension(C11946k.CropImageView_cropBorderCornerThickness, cropImageOptions.f30938u);
                    cropImageOptions.f30897B = (int) obtainStyledAttributes.getDimension(C11946k.CropImageView_cropMinCropWindowWidth, (float) cropImageOptions.f30897B);
                    cropImageOptions.f30898C = (int) obtainStyledAttributes.getDimension(C11946k.CropImageView_cropMinCropWindowHeight, (float) cropImageOptions.f30898C);
                    cropImageOptions.f30899D = (int) obtainStyledAttributes.getFloat(C11946k.CropImageView_cropMinCropResultWidthPX, (float) cropImageOptions.f30899D);
                    cropImageOptions.f30900E = (int) obtainStyledAttributes.getFloat(C11946k.CropImageView_cropMinCropResultHeightPX, (float) cropImageOptions.f30900E);
                    cropImageOptions.f30901F = (int) obtainStyledAttributes.getFloat(C11946k.CropImageView_cropMaxCropResultWidthPX, (float) cropImageOptions.f30901F);
                    cropImageOptions.f30902G = (int) obtainStyledAttributes.getFloat(C11946k.CropImageView_cropMaxCropResultHeightPX, (float) cropImageOptions.f30902G);
                    cropImageOptions.f30918W = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropFlipHorizontally, cropImageOptions.f30918W);
                    cropImageOptions.f30919X = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropFlipHorizontally, cropImageOptions.f30919X);
                    this.f30977v = obtainStyledAttributes.getBoolean(C11946k.CropImageView_cropSaveBitmapToInstanceState, this.f30977v);
                    if (obtainStyledAttributes.hasValue(C11946k.CropImageView_cropAspectRatioX) && obtainStyledAttributes.hasValue(C11946k.CropImageView_cropAspectRatioX) && !obtainStyledAttributes.hasValue(C11946k.CropImageView_cropFixAspectRatio)) {
                        cropImageOptions.f30933p = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        cropImageOptions.mo35326a();
        this.f30976u = cropImageOptions.f30926i;
        this.f30980y = cropImageOptions.f30929l;
        this.f30981z = cropImageOptions.f30931n;
        this.f30978w = cropImageOptions.f30927j;
        this.f30979x = cropImageOptions.f30928k;
        this.f30971p = cropImageOptions.f30918W;
        this.f30972q = cropImageOptions.f30919X;
        View inflate = LayoutInflater.from(context).inflate(C11943h.crop_image_view, this, true);
        this.f30960e = (ImageView) inflate.findViewById(C11942g.ImageView_image);
        this.f30960e.setScaleType(ScaleType.MATRIX);
        this.f30961f = (CropOverlayView) inflate.findViewById(C11942g.CropOverlayView);
        this.f30961f.setCropWindowChangeListener(new C11922a());
        this.f30961f.setInitialAttributeValues(cropImageOptions);
        this.f30964i = (ProgressBar) inflate.findViewById(C11942g.CropProgressBar);
        m31311f();
    }

    /* renamed from: b */
    public void mo35341b(int i, int i2, C11926e eVar) {
        if (this.f30948E != null) {
            mo35335a(i, i2, eVar, (Uri) null, (CompressFormat) null, 0);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    /* renamed from: a */
    public void mo35334a(int i, int i2) {
        this.f30961f.mo35398a(i, i2);
    }

    /* renamed from: a */
    public Bitmap mo35331a(int i, int i2, C11926e eVar) {
        Bitmap bitmap;
        C11926e eVar2 = eVar;
        if (this.f30968m == null) {
            return null;
        }
        this.f30960e.clearAnimation();
        int i3 = 0;
        int i4 = eVar2 != C11926e.NONE ? i : 0;
        if (eVar2 != C11926e.NONE) {
            i3 = i2;
        }
        if (this.f30949F == null || (this.f30950G <= 1 && eVar2 != C11926e.SAMPLING)) {
            bitmap = C11934c.m31375a(this.f30968m, getCropPoints(), this.f30970o, this.f30961f.mo35401b(), this.f30961f.getAspectRatioX(), this.f30961f.getAspectRatioY(), this.f30971p, this.f30972q).f31079a;
        } else {
            bitmap = C11934c.m31372a(getContext(), this.f30949F, getCropPoints(), this.f30970o, this.f30968m.getWidth() * this.f30950G, this.f30968m.getHeight() * this.f30950G, this.f30961f.mo35401b(), this.f30961f.getAspectRatioX(), this.f30961f.getAspectRatioY(), i4, i3, this.f30971p, this.f30972q).f31079a;
        }
        return C11934c.m31363a(bitmap, i4, i3, eVar2);
    }

    /* renamed from: b */
    public void mo35340b() {
        this.f30972q = !this.f30972q;
        m31302a((float) getWidth(), (float) getHeight(), true, false);
    }

    /* renamed from: a */
    public void mo35336a(Uri uri) {
        mo35337a(uri, CompressFormat.JPEG, 90, 0, 0, C11926e.NONE);
    }

    /* renamed from: a */
    public void mo35337a(Uri uri, CompressFormat compressFormat, int i, int i2, int i3, C11926e eVar) {
        if (this.f30948E != null) {
            mo35335a(i2, i3, eVar, uri, compressFormat, i);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    /* renamed from: a */
    public void mo35333a(int i) {
        int i2;
        int i3 = i;
        if (this.f30968m != null) {
            if (i3 < 0) {
                i2 = (i3 % 360) + 360;
            } else {
                i2 = i3 % 360;
            }
            boolean z = !this.f30961f.mo35401b() && ((i2 > 45 && i2 < 135) || (i2 > 215 && i2 < 305));
            C11934c.f31074c.set(this.f30961f.getCropWindowRect());
            RectF rectF = C11934c.f31074c;
            float height = (z ? rectF.height() : rectF.width()) / 2.0f;
            RectF rectF2 = C11934c.f31074c;
            float width = (z ? rectF2.width() : rectF2.height()) / 2.0f;
            if (z) {
                boolean z2 = this.f30971p;
                this.f30971p = this.f30972q;
                this.f30972q = z2;
            }
            this.f30962g.invert(this.f30963h);
            C11934c.f31075d[0] = C11934c.f31074c.centerX();
            C11934c.f31075d[1] = C11934c.f31074c.centerY();
            float[] fArr = C11934c.f31075d;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f30963h.mapPoints(fArr);
            this.f30970o = (this.f30970o + i2) % 360;
            m31302a((float) getWidth(), (float) getHeight(), true, false);
            this.f30962g.mapPoints(C11934c.f31076e, C11934c.f31075d);
            double d = (double) this.f30951H;
            float[] fArr2 = C11934c.f31076e;
            double pow = Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d);
            float[] fArr3 = C11934c.f31076e;
            float f = width;
            this.f30951H = (float) (d / Math.sqrt(pow + Math.pow((double) (fArr3[5] - fArr3[3]), 2.0d)));
            this.f30951H = Math.max(this.f30951H, 1.0f);
            m31302a((float) getWidth(), (float) getHeight(), true, false);
            this.f30962g.mapPoints(C11934c.f31076e, C11934c.f31075d);
            float[] fArr4 = C11934c.f31076e;
            double pow2 = Math.pow((double) (fArr4[4] - fArr4[2]), 2.0d);
            float[] fArr5 = C11934c.f31076e;
            double sqrt = Math.sqrt(pow2 + Math.pow((double) (fArr5[5] - fArr5[3]), 2.0d));
            float f2 = (float) (((double) height) * sqrt);
            float f3 = (float) (((double) f) * sqrt);
            RectF rectF3 = C11934c.f31074c;
            float[] fArr6 = C11934c.f31076e;
            rectF3.set(fArr6[0] - f2, fArr6[1] - f3, fArr6[0] + f2, fArr6[1] + f3);
            this.f30961f.mo35402c();
            this.f30961f.setCropWindowRect(C11934c.f31074c);
            m31302a((float) getWidth(), (float) getHeight(), true, false);
            m31306a(false, false);
            this.f30961f.mo35396a();
        }
    }

    /* renamed from: a */
    public void mo35332a() {
        this.f30971p = !this.f30971p;
        m31302a((float) getWidth(), (float) getHeight(), true, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35339a(C11933a aVar) {
        this.f30958O = null;
        m31311f();
        if (aVar.f31071e == null) {
            int i = aVar.f31070d;
            this.f30969n = i;
            m31303a(aVar.f31068b, 0, aVar.f31067a, aVar.f31069c, i);
        }
        OnSetImageUriCompleteListener onSetImageUriCompleteListener = this.f30947D;
        if (onSetImageUriCompleteListener != null) {
            onSetImageUriCompleteListener.onSetImageUriComplete(this, aVar.f31067a, aVar.f31071e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35338a(C11931a aVar) {
        this.f30959P = null;
        m31311f();
        OnCropImageCompleteListener onCropImageCompleteListener = this.f30948E;
        if (onCropImageCompleteListener != null) {
            C11923b bVar = new C11923b(this.f30968m, this.f30949F, aVar.f31058a, aVar.f31059b, aVar.f31060c, getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), aVar.f31061d);
            onCropImageCompleteListener.onCropImageComplete(this, bVar);
        }
    }

    /* renamed from: a */
    private void m31303a(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f30968m;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f30960e.clearAnimation();
            m31308c();
            this.f30968m = bitmap;
            this.f30960e.setImageBitmap(this.f30968m);
            this.f30949F = uri;
            this.f30975t = i;
            this.f30950G = i2;
            this.f30970o = i3;
            m31302a((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f30961f;
            if (cropOverlayView != null) {
                cropOverlayView.mo35402c();
                m31310e();
            }
        }
    }

    /* renamed from: a */
    public void mo35335a(int i, int i2, C11926e eVar, Uri uri, CompressFormat compressFormat, int i3) {
        CropImageView cropImageView;
        C11926e eVar2 = eVar;
        Bitmap bitmap = this.f30968m;
        if (bitmap != null) {
            this.f30960e.clearAnimation();
            WeakReference<C11930a> weakReference = this.f30959P;
            C11930a aVar = weakReference != null ? (C11930a) weakReference.get() : null;
            if (aVar != null) {
                aVar.cancel(true);
            }
            int i4 = eVar2 != C11926e.NONE ? i : 0;
            int i5 = eVar2 != C11926e.NONE ? i2 : 0;
            int width = bitmap.getWidth() * this.f30950G;
            int height = bitmap.getHeight();
            int i6 = this.f30950G;
            int i7 = height * i6;
            if (this.f30949F == null || (i6 <= 1 && eVar2 != C11926e.SAMPLING)) {
                C11930a aVar2 = r0;
                C11930a aVar3 = new C11930a(this, bitmap, getCropPoints(), this.f30970o, this.f30961f.mo35401b(), this.f30961f.getAspectRatioX(), this.f30961f.getAspectRatioY(), i4, i5, this.f30971p, this.f30972q, eVar, uri, compressFormat, i3);
                WeakReference<C11930a> weakReference2 = new WeakReference<>(aVar2);
                cropImageView = this;
                cropImageView.f30959P = weakReference2;
            } else {
                C11930a aVar4 = r0;
                C11930a aVar5 = new C11930a(this, this.f30949F, getCropPoints(), this.f30970o, width, i7, this.f30961f.mo35401b(), this.f30961f.getAspectRatioX(), this.f30961f.getAspectRatioY(), i4, i5, this.f30971p, this.f30972q, eVar, uri, compressFormat, i3);
                WeakReference<C11930a> weakReference3 = new WeakReference<>(aVar4);
                this.f30959P = weakReference3;
                cropImageView = this;
            }
            ((C11930a) cropImageView.f30959P.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m31311f();
            return;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m31306a(boolean r12, boolean r13) {
        /*
            r11 = this;
            int r0 = r11.getWidth()
            int r1 = r11.getHeight()
            android.graphics.Bitmap r2 = r11.f30968m
            if (r2 == 0) goto L_0x0104
            if (r0 <= 0) goto L_0x0104
            if (r1 <= 0) goto L_0x0104
            com.theartofdev.edmodo.cropper.CropOverlayView r2 = r11.f30961f
            android.graphics.RectF r2 = r2.getCropWindowRect()
            r3 = 0
            if (r12 == 0) goto L_0x003b
            float r13 = r2.left
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0033
            float r13 = r2.top
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0033
            float r13 = r2.right
            float r3 = (float) r0
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x0033
            float r13 = r2.bottom
            float r2 = (float) r1
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x00fb
        L_0x0033:
            float r13 = (float) r0
            float r0 = (float) r1
            r1 = 0
            r11.m31302a(r13, r0, r1, r1)
            goto L_0x00fb
        L_0x003b:
            boolean r4 = r11.f30980y
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0047
            float r4 = r11.f30951H
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00fb
        L_0x0047:
            float r4 = r11.f30951H
            int r6 = r11.f30981z
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0089
            float r4 = r2.width()
            float r6 = (float) r0
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r6 * r7
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0089
            float r4 = r2.height()
            float r8 = (float) r1
            float r7 = r7 * r8
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0089
            int r4 = r11.f30981z
            float r4 = (float) r4
            float r7 = r2.width()
            float r9 = r11.f30951H
            float r7 = r7 / r9
            r9 = 1059313418(0x3f23d70a, float:0.64)
            float r7 = r7 / r9
            float r6 = r6 / r7
            float r7 = r2.height()
            float r10 = r11.f30951H
            float r7 = r7 / r10
            float r7 = r7 / r9
            float r8 = r8 / r7
            float r6 = java.lang.Math.min(r6, r8)
            float r4 = java.lang.Math.min(r4, r6)
            goto L_0x008a
        L_0x0089:
            r4 = 0
        L_0x008a:
            float r6 = r11.f30951H
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c8
            float r6 = r2.width()
            float r7 = (float) r0
            r8 = 1059481190(0x3f266666, float:0.65)
            float r9 = r7 * r8
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x00a9
            float r6 = r2.height()
            float r9 = (float) r1
            float r9 = r9 * r8
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c8
        L_0x00a9:
            float r4 = r2.width()
            float r6 = r11.f30951H
            float r4 = r4 / r6
            r6 = 1057132380(0x3f028f5c, float:0.51)
            float r4 = r4 / r6
            float r7 = r7 / r4
            float r4 = (float) r1
            float r2 = r2.height()
            float r8 = r11.f30951H
            float r2 = r2 / r8
            float r2 = r2 / r6
            float r4 = r4 / r2
            float r2 = java.lang.Math.min(r7, r4)
            float r2 = java.lang.Math.max(r5, r2)
            goto L_0x00c9
        L_0x00c8:
            r2 = r4
        L_0x00c9:
            boolean r4 = r11.f30980y
            if (r4 != 0) goto L_0x00cf
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00cf:
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fb
            float r3 = r11.f30951H
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00fb
            if (r13 == 0) goto L_0x00f3
            com.theartofdev.edmodo.cropper.d r3 = r11.f30967l
            if (r3 != 0) goto L_0x00ea
            com.theartofdev.edmodo.cropper.d r3 = new com.theartofdev.edmodo.cropper.d
            android.widget.ImageView r4 = r11.f30960e
            com.theartofdev.edmodo.cropper.CropOverlayView r5 = r11.f30961f
            r3.<init>(r4, r5)
            r11.f30967l = r3
        L_0x00ea:
            com.theartofdev.edmodo.cropper.d r3 = r11.f30967l
            float[] r4 = r11.f30965j
            android.graphics.Matrix r5 = r11.f30962g
            r3.mo35433b(r4, r5)
        L_0x00f3:
            r11.f30951H = r2
            float r0 = (float) r0
            float r1 = (float) r1
            r2 = 1
            r11.m31302a(r0, r1, r2, r13)
        L_0x00fb:
            com.theartofdev.edmodo.cropper.CropImageView$OnSetCropWindowChangeListener r13 = r11.f30946C
            if (r13 == 0) goto L_0x0104
            if (r12 != 0) goto L_0x0104
            r13.onCropWindowChanged()
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.m31306a(boolean, boolean):void");
    }

    /* renamed from: a */
    private void m31302a(float f, float f2, boolean z, boolean z2) {
        float f3;
        if (this.f30968m != null) {
            float f4 = 0.0f;
            if (f > 0.0f && f2 > 0.0f) {
                this.f30962g.invert(this.f30963h);
                RectF cropWindowRect = this.f30961f.getCropWindowRect();
                this.f30963h.mapRect(cropWindowRect);
                this.f30962g.reset();
                this.f30962g.postTranslate((f - ((float) this.f30968m.getWidth())) / 2.0f, (f2 - ((float) this.f30968m.getHeight())) / 2.0f);
                m31309d();
                int i = this.f30970o;
                if (i > 0) {
                    this.f30962g.postRotate((float) i, C11934c.m31381b(this.f30965j), C11934c.m31382c(this.f30965j));
                    m31309d();
                }
                float min = Math.min(f / C11934c.m31387h(this.f30965j), f2 / C11934c.m31383d(this.f30965j));
                C11927f fVar = this.f30976u;
                if (fVar == C11927f.FIT_CENTER || ((fVar == C11927f.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f30980y))) {
                    this.f30962g.postScale(min, min, C11934c.m31381b(this.f30965j), C11934c.m31382c(this.f30965j));
                    m31309d();
                }
                float f5 = this.f30971p ? -this.f30951H : this.f30951H;
                float f6 = this.f30972q ? -this.f30951H : this.f30951H;
                this.f30962g.postScale(f5, f6, C11934c.m31381b(this.f30965j), C11934c.m31382c(this.f30965j));
                m31309d();
                this.f30962g.mapRect(cropWindowRect);
                if (z) {
                    if (f > C11934c.m31387h(this.f30965j)) {
                        f3 = 0.0f;
                    } else {
                        f3 = Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -C11934c.m31384e(this.f30965j)), ((float) getWidth()) - C11934c.m31385f(this.f30965j)) / f5;
                    }
                    this.f30952I = f3;
                    if (f2 <= C11934c.m31383d(this.f30965j)) {
                        f4 = Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -C11934c.m31386g(this.f30965j)), ((float) getHeight()) - C11934c.m31358a(this.f30965j)) / f6;
                    }
                    this.f30953J = f4;
                } else {
                    this.f30952I = Math.min(Math.max(this.f30952I * f5, -cropWindowRect.left), (-cropWindowRect.right) + f) / f5;
                    this.f30953J = Math.min(Math.max(this.f30953J * f6, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / f6;
                }
                this.f30962g.postTranslate(this.f30952I * f5, this.f30953J * f6);
                cropWindowRect.offset(this.f30952I * f5, this.f30953J * f6);
                this.f30961f.setCropWindowRect(cropWindowRect);
                m31309d();
                this.f30961f.invalidate();
                if (z2) {
                    this.f30967l.mo35431a(this.f30965j, this.f30962g);
                    this.f30960e.startAnimation(this.f30967l);
                } else {
                    this.f30960e.setImageMatrix(this.f30962g);
                }
                m31305a(false);
            }
        }
    }

    /* renamed from: a */
    private static int m31300a(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* renamed from: a */
    private void m31305a(boolean z) {
        if (this.f30968m != null && !z) {
            this.f30961f.mo35397a((float) getWidth(), (float) getHeight(), (((float) this.f30950G) * 100.0f) / C11934c.m31387h(this.f30966k), (((float) this.f30950G) * 100.0f) / C11934c.m31383d(this.f30966k));
        }
        this.f30961f.mo35399a(z ? null : this.f30965j, getWidth(), getHeight());
    }
}
