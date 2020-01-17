package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.BaseSavedState;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.p289q.C8654d;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8661c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: w */
    private static final String f21512w = LottieAnimationView.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final LottieListener<Throwable> f21513x = new C8464a();

    /* renamed from: g */
    private final LottieListener<C8506c> f21514g = new C8465b();

    /* renamed from: h */
    private final LottieListener<Throwable> f21515h = new C8466c();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public LottieListener<Throwable> f21516i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f21517j = 0;

    /* renamed from: k */
    private final C8515e f21518k = new C8515e();

    /* renamed from: l */
    private boolean f21519l;

    /* renamed from: m */
    private String f21520m;

    /* renamed from: n */
    private int f21521n;

    /* renamed from: o */
    private boolean f21522o = false;

    /* renamed from: p */
    private boolean f21523p = false;

    /* renamed from: q */
    private boolean f21524q = false;

    /* renamed from: r */
    private C8537j f21525r = C8537j.AUTOMATIC;

    /* renamed from: s */
    private Set<LottieOnCompositionLoadedListener> f21526s = new HashSet();

    /* renamed from: t */
    private int f21527t = 0;

    /* renamed from: u */
    private C8533h<C8506c> f21528u;

    /* renamed from: v */
    private C8506c f21529v;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C8463a();

        /* renamed from: e */
        String f21530e;

        /* renamed from: f */
        int f21531f;

        /* renamed from: g */
        float f21532g;

        /* renamed from: h */
        boolean f21533h;

        /* renamed from: i */
        String f21534i;

        /* renamed from: j */
        int f21535j;

        /* renamed from: k */
        int f21536k;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        class C8463a implements Creator<SavedState> {
            C8463a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C8464a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f21530e);
            parcel.writeFloat(this.f21532g);
            parcel.writeInt(this.f21533h ? 1 : 0);
            parcel.writeString(this.f21534i);
            parcel.writeInt(this.f21535j);
            parcel.writeInt(this.f21536k);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f21530e = parcel.readString();
            this.f21532g = parcel.readFloat();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f21533h = z;
            this.f21534i = parcel.readString();
            this.f21535j = parcel.readInt();
            this.f21536k = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    class C8464a implements LottieListener<Throwable> {
        C8464a() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            if (C8658h.m20204a(th)) {
                C8654d.m20154a("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    class C8465b implements LottieListener<C8506c> {
        C8465b() {
        }

        /* renamed from: a */
        public void onResult(C8506c cVar) {
            LottieAnimationView.this.setComposition(cVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    class C8466c implements LottieListener<Throwable> {
        C8466c() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f21517j != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f21517j);
            }
            (LottieAnimationView.this.f21516i == null ? LottieAnimationView.f21513x : LottieAnimationView.this.f21516i).onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    static /* synthetic */ class C8467d {

        /* renamed from: a */
        static final /* synthetic */ int[] f21539a = new int[C8537j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.airbnb.lottie.j[] r0 = com.airbnb.lottie.C8537j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21539a = r0
                int[] r0 = f21539a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.j r1 = com.airbnb.lottie.C8537j.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21539a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.j r1 = com.airbnb.lottie.C8537j.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f21539a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.j r1 = com.airbnb.lottie.C8537j.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C8467d.<clinit>():void");
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m19519a((AttributeSet) null);
    }

    /* renamed from: i */
    private void m19522i() {
        C8533h<C8506c> hVar = this.f21528u;
        if (hVar != null) {
            hVar.mo23034d(this.f21514g);
            this.f21528u.mo23033c(this.f21515h);
        }
    }

    /* renamed from: j */
    private void m19523j() {
        this.f21529v = null;
        this.f21518k.mo22968b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r3 != false) goto L_0x003d;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19524k() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C8467d.f21539a
            com.airbnb.lottie.j r1 = r5.f21525r
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x003d
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = 1
            goto L_0x003d
        L_0x0015:
            com.airbnb.lottie.c r0 = r5.f21529v
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo22944m()
            if (r0 == 0) goto L_0x0027
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            com.airbnb.lottie.c r0 = r5.f21529v
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mo22941j()
            r4 = 4
            if (r0 <= r4) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x0013
        L_0x003d:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x0047
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.m19524k():void");
    }

    private void setCompositionTask(C8533h<C8506c> hVar) {
        m19523j();
        m19522i();
        hVar.mo23032b(this.f21514g);
        hVar.mo23031a(this.f21515h);
        this.f21528u = hVar;
    }

    public void buildDrawingCache(boolean z) {
        String str = "buildDrawingCache";
        C8505b.m19651a(str);
        this.f21527t++;
        super.buildDrawingCache(z);
        if (this.f21527t == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(C8537j.HARDWARE);
        }
        this.f21527t--;
        C8505b.m19652b(str);
    }

    /* renamed from: c */
    public void mo22806c() {
        this.f21524q = false;
        this.f21523p = false;
        this.f21522o = false;
        this.f21518k.mo23008s();
        m19524k();
    }

    /* renamed from: d */
    public void mo22807d() {
        if (isShown()) {
            this.f21518k.mo23014t();
            m19524k();
            return;
        }
        this.f21522o = true;
    }

    /* renamed from: e */
    public void mo22808e() {
        this.f21518k.mo23015u();
    }

    /* renamed from: f */
    public void mo22809f() {
        this.f21526s.clear();
    }

    /* renamed from: g */
    public void mo22810g() {
        if (isShown()) {
            this.f21518k.mo23017v();
            m19524k();
            return;
        }
        this.f21522o = true;
    }

    public C8506c getComposition() {
        return this.f21529v;
    }

    public long getDuration() {
        C8506c cVar = this.f21529v;
        if (cVar != null) {
            return (long) cVar.mo22933c();
        }
        return 0;
    }

    public int getFrame() {
        return this.f21518k.mo22988f();
    }

    public String getImageAssetsFolder() {
        return this.f21518k.mo22989g();
    }

    public float getMaxFrame() {
        return this.f21518k.mo22994h();
    }

    public float getMinFrame() {
        return this.f21518k.mo22995i();
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.f21518k.mo22999j();
    }

    public float getProgress() {
        return this.f21518k.mo23000k();
    }

    public int getRepeatCount() {
        return this.f21518k.mo23001l();
    }

    public int getRepeatMode() {
        return this.f21518k.mo23002m();
    }

    public float getScale() {
        return this.f21518k.mo23003n();
    }

    public float getSpeed() {
        return this.f21518k.mo23004o();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C8515e eVar = this.f21518k;
        if (drawable2 == eVar) {
            super.invalidateDrawable(eVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21524q || this.f21523p) {
            mo22807d();
            this.f21524q = false;
            this.f21523p = false;
        }
        if (VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo22804b()) {
            mo22797a();
            this.f21523p = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f21520m = savedState.f21530e;
        if (!TextUtils.isEmpty(this.f21520m)) {
            setAnimation(this.f21520m);
        }
        this.f21521n = savedState.f21531f;
        int i = this.f21521n;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f21532g);
        if (savedState.f21533h) {
            mo22807d();
        }
        this.f21518k.mo22972b(savedState.f21534i);
        setRepeatMode(savedState.f21535j);
        setRepeatCount(savedState.f21536k);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f21530e = this.f21520m;
        savedState.f21531f = this.f21521n;
        savedState.f21532g = this.f21518k.mo23000k();
        savedState.f21533h = this.f21518k.mo23006q();
        savedState.f21534i = this.f21518k.mo22989g();
        savedState.f21535j = this.f21518k.mo23002m();
        savedState.f21536k = this.f21518k.mo23001l();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (this.f21519l) {
            if (isShown()) {
                if (this.f21522o) {
                    mo22810g();
                    this.f21522o = false;
                }
            } else if (mo22804b()) {
                mo22806c();
                this.f21522o = true;
            }
        }
    }

    public void setAnimation(int i) {
        this.f21521n = i;
        this.f21520m = null;
        setCompositionTask(C8507d.m19679a(getContext(), i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        mo22801a(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(C8507d.m19689c(getContext(), str));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f21518k.mo22973b(z);
    }

    public void setComposition(C8506c cVar) {
        if (C8505b.f21751a) {
            String str = f21512w;
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(cVar);
            Log.v(str, sb.toString());
        }
        this.f21518k.setCallback(this);
        this.f21529v = cVar;
        boolean a = this.f21518k.mo22967a(cVar);
        m19524k();
        if (getDrawable() != this.f21518k || a) {
            setImageDrawable(null);
            setImageDrawable(this.f21518k);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (LottieOnCompositionLoadedListener onCompositionLoaded : this.f21526s) {
                onCompositionLoaded.onCompositionLoaded(cVar);
            }
        }
    }

    public void setFailureListener(LottieListener<Throwable> lottieListener) {
        this.f21516i = lottieListener;
    }

    public void setFallbackResource(int i) {
        this.f21517j = i;
    }

    public void setFontAssetDelegate(C8469a aVar) {
        this.f21518k.mo22962a(aVar);
    }

    public void setFrame(int i) {
        this.f21518k.mo22958a(i);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.f21518k.mo22961a(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.f21518k.mo22972b(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m19522i();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        m19522i();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        m19522i();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f21518k.mo22970b(i);
    }

    public void setMaxProgress(float f) {
        this.f21518k.mo22957a(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f21518k.mo22982d(str);
    }

    public void setMinFrame(int i) {
        this.f21518k.mo22975c(i);
    }

    public void setMinProgress(float f) {
        this.f21518k.mo22969b(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f21518k.mo22977c(z);
    }

    public void setProgress(float f) {
        this.f21518k.mo22974c(f);
    }

    public void setRenderMode(C8537j jVar) {
        this.f21525r = jVar;
        m19524k();
    }

    public void setRepeatCount(int i) {
        this.f21518k.mo22981d(i);
    }

    public void setRepeatMode(int i) {
        this.f21518k.mo22986e(i);
    }

    public void setScale(float f) {
        this.f21518k.mo22980d(f);
        if (getDrawable() == this.f21518k) {
            setImageDrawable(null);
            setImageDrawable(this.f21518k);
        }
    }

    public void setSpeed(float f) {
        this.f21518k.mo22985e(f);
    }

    public void setTextDelegate(C8539l lVar) {
        this.f21518k.mo22963a(lVar);
    }

    /* renamed from: a */
    private void m19519a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8536i.LottieAnimationView);
        boolean z = false;
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_url);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(C8536i.LottieAnimationView_lottie_rawRes, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string = obtainStyledAttributes.getString(C8536i.LottieAnimationView_lottie_fileName);
                    if (string != null) {
                        setAnimation(string);
                    }
                } else if (hasValue3) {
                    String string2 = obtainStyledAttributes.getString(C8536i.LottieAnimationView_lottie_url);
                    if (string2 != null) {
                        setAnimationFromUrl(string2);
                    }
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(C8536i.LottieAnimationView_lottie_fallbackRes, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(C8536i.LottieAnimationView_lottie_autoPlay, false)) {
            this.f21523p = true;
            this.f21524q = true;
        }
        if (obtainStyledAttributes.getBoolean(C8536i.LottieAnimationView_lottie_loop, false)) {
            this.f21518k.mo22981d(-1);
        }
        if (obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(C8536i.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(C8536i.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(C8536i.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C8536i.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(C8536i.LottieAnimationView_lottie_progress, 0.0f));
        mo22802a(obtainStyledAttributes.getBoolean(C8536i.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_colorFilter)) {
            C8538k kVar = new C8538k(obtainStyledAttributes.getColor(C8536i.LottieAnimationView_lottie_colorFilter, 0));
            mo22799a(new C8582e("**"), LottieProperty.f21541B, new C8661c(kVar));
        }
        if (obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_scale)) {
            this.f21518k.mo22980d(obtainStyledAttributes.getFloat(C8536i.LottieAnimationView_lottie_scale, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(C8536i.LottieAnimationView_lottie_renderMode)) {
            int i = obtainStyledAttributes.getInt(C8536i.LottieAnimationView_lottie_renderMode, C8537j.AUTOMATIC.ordinal());
            if (i >= C8537j.values().length) {
                i = C8537j.AUTOMATIC.ordinal();
            }
            setRenderMode(C8537j.values()[i]);
        }
        obtainStyledAttributes.recycle();
        C8515e eVar = this.f21518k;
        if (C8658h.m20193a(getContext()) != 0.0f) {
            z = true;
        }
        eVar.mo22965a(Boolean.valueOf(z));
        m19524k();
        this.f21519l = true;
    }

    /* renamed from: b */
    public void mo22803b(AnimatorListener animatorListener) {
        this.f21518k.mo22971b(animatorListener);
    }

    public void setMaxFrame(String str) {
        this.f21518k.mo22976c(str);
    }

    public void setMinFrame(String str) {
        this.f21518k.mo22987e(str);
    }

    /* renamed from: b */
    public boolean mo22804b() {
        return this.f21518k.mo23006q();
    }

    public void setAnimation(String str) {
        this.f21520m = str;
        this.f21521n = 0;
        setCompositionTask(C8507d.m19680a(getContext(), str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19519a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19519a(attributeSet);
    }

    /* renamed from: a */
    public void mo22802a(boolean z) {
        this.f21518k.mo22966a(z);
    }

    /* renamed from: a */
    public void mo22801a(String str, String str2) {
        mo22800a((InputStream) new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* renamed from: a */
    public void mo22800a(InputStream inputStream, String str) {
        setCompositionTask(C8507d.m19681a(inputStream, str));
    }

    /* renamed from: a */
    public void mo22798a(AnimatorListener animatorListener) {
        this.f21518k.mo22960a(animatorListener);
    }

    /* renamed from: a */
    public <T> void mo22799a(C8582e eVar, T t, C8661c<T> cVar) {
        this.f21518k.mo22964a(eVar, t, cVar);
    }

    /* renamed from: a */
    public void mo22797a() {
        this.f21522o = false;
        this.f21518k.mo22956a();
        m19524k();
    }
}
