package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0250e;
import androidx.appcompat.widget.C0262m;
import androidx.appcompat.widget.C0291z;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.C0615a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0628c;
import androidx.core.widget.C0680h;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.google.android.material.internal.C10787c;
import com.google.android.material.internal.C10788d;
import com.google.android.material.internal.C10789e;
import com.google.android.material.internal.C10793g;
import com.google.android.material.internal.C10794h;
import com.google.android.material.internal.CheckableImageButton;
import p214e.p215a.p216k.p217a.C7531a;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12068c;
import p333g.p357d.p358a.p361b.C12069d;
import p333g.p357d.p358a.p361b.C12071f;
import p333g.p357d.p358a.p361b.C12073h;
import p333g.p357d.p358a.p361b.C12074i;
import p333g.p357d.p358a.p361b.C12075j;
import p333g.p357d.p358a.p361b.C12076k;
import p333g.p357d.p358a.p361b.p362l.C12077a;

public class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    private int f28268A;

    /* renamed from: B */
    private final int f28269B;

    /* renamed from: C */
    private final int f28270C;

    /* renamed from: D */
    private int f28271D;

    /* renamed from: E */
    private int f28272E;

    /* renamed from: F */
    private Drawable f28273F;

    /* renamed from: G */
    private final Rect f28274G;

    /* renamed from: H */
    private final RectF f28275H;

    /* renamed from: I */
    private Typeface f28276I;

    /* renamed from: J */
    private boolean f28277J;

    /* renamed from: K */
    private Drawable f28278K;

    /* renamed from: L */
    private CharSequence f28279L;

    /* renamed from: M */
    private CheckableImageButton f28280M;

    /* renamed from: N */
    private boolean f28281N;

    /* renamed from: O */
    private Drawable f28282O;

    /* renamed from: P */
    private Drawable f28283P;

    /* renamed from: Q */
    private ColorStateList f28284Q;

    /* renamed from: R */
    private boolean f28285R;

    /* renamed from: S */
    private Mode f28286S;

    /* renamed from: T */
    private boolean f28287T;

    /* renamed from: U */
    private ColorStateList f28288U;

    /* renamed from: V */
    private ColorStateList f28289V;

    /* renamed from: W */
    private final int f28290W;

    /* renamed from: a0 */
    private final int f28291a0;

    /* renamed from: b0 */
    private int f28292b0;

    /* renamed from: c0 */
    private final int f28293c0;

    /* renamed from: d0 */
    private boolean f28294d0;

    /* renamed from: e */
    private final FrameLayout f28295e;

    /* renamed from: e0 */
    final C10787c f28296e0;

    /* renamed from: f */
    EditText f28297f;

    /* renamed from: f0 */
    private boolean f28298f0;

    /* renamed from: g */
    private CharSequence f28299g;

    /* renamed from: g0 */
    private ValueAnimator f28300g0;

    /* renamed from: h */
    private final C10826b f28301h;

    /* renamed from: h0 */
    private boolean f28302h0;

    /* renamed from: i */
    boolean f28303i;

    /* renamed from: i0 */
    private boolean f28304i0;

    /* renamed from: j */
    private int f28305j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public boolean f28306j0;

    /* renamed from: k */
    private boolean f28307k;

    /* renamed from: l */
    private TextView f28308l;

    /* renamed from: m */
    private final int f28309m;

    /* renamed from: n */
    private final int f28310n;

    /* renamed from: o */
    private boolean f28311o;

    /* renamed from: p */
    private CharSequence f28312p;

    /* renamed from: q */
    private boolean f28313q;

    /* renamed from: r */
    private GradientDrawable f28314r;

    /* renamed from: s */
    private final int f28315s;

    /* renamed from: t */
    private final int f28316t;

    /* renamed from: u */
    private int f28317u;

    /* renamed from: v */
    private final int f28318v;

    /* renamed from: w */
    private float f28319w;

    /* renamed from: x */
    private float f28320x;

    /* renamed from: y */
    private float f28321y;

    /* renamed from: z */
    private float f28322z;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C10820a();

        /* renamed from: g */
        CharSequence f28323g;

        /* renamed from: h */
        boolean f28324h;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        static class C10820a implements ClassLoaderCreator<SavedState> {
            C10820a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f28323g);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f28323g, parcel, i);
            parcel.writeInt(this.f28324h ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28323g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f28324h = z;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C10821a implements TextWatcher {
        C10821a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo31336b(!textInputLayout.f28306j0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f28303i) {
                textInputLayout2.mo31331a(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C10822b implements OnClickListener {
        C10822b() {
        }

        public void onClick(View view) {
            TextInputLayout.this.mo31333a(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C10823c implements AnimatorUpdateListener {
        C10823c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f28296e0.mo31236b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public static class C10824d extends C0615a {

        /* renamed from: d */
        private final TextInputLayout f28328d;

        public C10824d(TextInputLayout textInputLayout) {
            this.f28328d = textInputLayout;
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            EditText editText = this.f28328d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f28328d.getHint();
            CharSequence error = this.f28328d.getError();
            CharSequence counterOverflowDescription = this.f28328d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.mo3347f((CharSequence) text);
            } else if (z2) {
                cVar.mo3347f(hint);
            }
            if (z2) {
                cVar.mo3336c(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.mo3360l(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.mo3330b(error);
                cVar.mo3341d(true);
            }
        }

        /* renamed from: c */
        public void mo3297c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3297c(view, accessibilityEvent);
            EditText editText = this.f28328d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.f28328d.getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m27860e() {
        if (this.f28314r != null) {
            m27872q();
            EditText editText = this.f28297f;
            if (editText != null && this.f28317u == 2) {
                if (editText.getBackground() != null) {
                    this.f28273F = this.f28297f.getBackground();
                }
                ViewCompat.m2822a((View) this.f28297f, (Drawable) null);
            }
            EditText editText2 = this.f28297f;
            if (editText2 != null && this.f28317u == 1) {
                Drawable drawable = this.f28273F;
                if (drawable != null) {
                    ViewCompat.m2822a((View) editText2, drawable);
                }
            }
            int i = this.f28268A;
            if (i > -1) {
                int i2 = this.f28271D;
                if (i2 != 0) {
                    this.f28314r.setStroke(i, i2);
                }
            }
            this.f28314r.setCornerRadii(getCornerRadiiAsArray());
            this.f28314r.setColor(this.f28272E);
            invalidate();
        }
    }

    /* renamed from: f */
    private void m27861f() {
        if (this.f28278K == null) {
            return;
        }
        if (this.f28285R || this.f28287T) {
            this.f28278K = C0559a.m2657i(this.f28278K).mutate();
            if (this.f28285R) {
                C0559a.m2642a(this.f28278K, this.f28284Q);
            }
            if (this.f28287T) {
                C0559a.m2645a(this.f28278K, this.f28286S);
            }
            CheckableImageButton checkableImageButton = this.f28280M;
            if (checkableImageButton != null) {
                Drawable drawable = checkableImageButton.getDrawable();
                Drawable drawable2 = this.f28278K;
                if (drawable != drawable2) {
                    this.f28280M.setImageDrawable(drawable2);
                }
            }
        }
    }

    /* renamed from: g */
    private void m27862g() {
        int i = this.f28317u;
        if (i == 0) {
            this.f28314r = null;
        } else if (i == 2 && this.f28311o && !(this.f28314r instanceof C10825a)) {
            this.f28314r = new C10825a();
        } else if (!(this.f28314r instanceof GradientDrawable)) {
            this.f28314r = new GradientDrawable();
        }
    }

    private Drawable getBoxBackground() {
        int i = this.f28317u;
        if (i == 1 || i == 2) {
            return this.f28314r;
        }
        throw new IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        if (!C10794h.m27781a(this)) {
            float f = this.f28319w;
            float f2 = this.f28320x;
            float f3 = this.f28321y;
            float f4 = this.f28322z;
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        float f5 = this.f28320x;
        float f6 = this.f28319w;
        float f7 = this.f28322z;
        float f8 = this.f28321y;
        return new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
    }

    /* renamed from: h */
    private int m27863h() {
        EditText editText = this.f28297f;
        if (editText == null) {
            return 0;
        }
        int i = this.f28317u;
        if (i == 1) {
            return editText.getTop();
        }
        if (i != 2) {
            return 0;
        }
        return editText.getTop() + m27865j();
    }

    /* renamed from: i */
    private int m27864i() {
        int i = this.f28317u;
        if (i == 1) {
            return getBoxBackground().getBounds().top + this.f28318v;
        }
        if (i != 2) {
            return getPaddingTop();
        }
        return getBoxBackground().getBounds().top - m27865j();
    }

    /* renamed from: j */
    private int m27865j() {
        float c;
        if (!this.f28311o) {
            return 0;
        }
        int i = this.f28317u;
        if (i == 0 || i == 1) {
            c = this.f28296e0.mo31241c();
        } else if (i != 2) {
            return 0;
        } else {
            c = this.f28296e0.mo31241c() / 2.0f;
        }
        return (int) c;
    }

    /* renamed from: k */
    private void m27866k() {
        if (m27867l()) {
            ((C10825a) this.f28314r).mo31410b();
        }
    }

    /* renamed from: l */
    private boolean m27867l() {
        return this.f28311o && !TextUtils.isEmpty(this.f28312p) && (this.f28314r instanceof C10825a);
    }

    /* renamed from: m */
    private void m27868m() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.f28297f.getBackground();
            if (background != null && !this.f28302h0) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.f28302h0 = C10789e.m27764a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.f28302h0) {
                    ViewCompat.m2822a((View) this.f28297f, newDrawable);
                    this.f28302h0 = true;
                    m27870o();
                }
            }
        }
    }

    /* renamed from: n */
    private boolean m27869n() {
        EditText editText = this.f28297f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: o */
    private void m27870o() {
        m27862g();
        if (this.f28317u != 0) {
            m27875t();
        }
        m27877v();
    }

    /* renamed from: p */
    private void m27871p() {
        if (m27867l()) {
            RectF rectF = this.f28275H;
            this.f28296e0.mo31231a(rectF);
            m27854a(rectF);
            ((C10825a) this.f28314r).mo31408a(rectF);
        }
    }

    /* renamed from: q */
    private void m27872q() {
        int i = this.f28317u;
        if (i == 1) {
            this.f28268A = 0;
        } else if (i == 2 && this.f28292b0 == 0) {
            this.f28292b0 = this.f28289V.getColorForState(getDrawableState(), this.f28289V.getDefaultColor());
        }
    }

    /* renamed from: r */
    private boolean m27873r() {
        return this.f28277J && (m27869n() || this.f28281N);
    }

    /* renamed from: s */
    private void m27874s() {
        EditText editText = this.f28297f;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (C0262m.m1079a(background)) {
                    background = background.mutate();
                }
                C10788d.m27761a((ViewGroup) this, (View) this.f28297f, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f28297f.getBottom());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f28297f == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f28297f = editText;
            m27870o();
            setTextInputAccessibilityDelegate(new C10824d(this));
            if (!m27869n()) {
                this.f28296e0.mo31232a(this.f28297f.getTypeface());
            }
            this.f28296e0.mo31225a(this.f28297f.getTextSize());
            int gravity = this.f28297f.getGravity();
            this.f28296e0.mo31237b((gravity & -113) | 48);
            this.f28296e0.mo31242c(gravity);
            this.f28297f.addTextChangedListener(new C10821a());
            if (this.f28288U == null) {
                this.f28288U = this.f28297f.getHintTextColors();
            }
            if (this.f28311o) {
                if (TextUtils.isEmpty(this.f28312p)) {
                    this.f28299g = this.f28297f.getHint();
                    setHint(this.f28299g);
                    this.f28297f.setHint(null);
                }
                this.f28313q = true;
            }
            if (this.f28308l != null) {
                mo31331a(this.f28297f.getText().length());
            }
            this.f28301h.mo31412a();
            m27876u();
            m27856a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f28312p)) {
            this.f28312p = charSequence;
            this.f28296e0.mo31233a(charSequence);
            if (!this.f28294d0) {
                m27871p();
            }
        }
    }

    /* renamed from: t */
    private void m27875t() {
        LayoutParams layoutParams = (LayoutParams) this.f28295e.getLayoutParams();
        int j = m27865j();
        if (j != layoutParams.topMargin) {
            layoutParams.topMargin = j;
            this.f28295e.requestLayout();
        }
    }

    /* renamed from: u */
    private void m27876u() {
        if (this.f28297f != null) {
            if (m27873r()) {
                if (this.f28280M == null) {
                    this.f28280M = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C12073h.design_text_input_password_icon, this.f28295e, false);
                    this.f28280M.setImageDrawable(this.f28278K);
                    this.f28280M.setContentDescription(this.f28279L);
                    this.f28295e.addView(this.f28280M);
                    this.f28280M.setOnClickListener(new C10822b());
                }
                EditText editText = this.f28297f;
                if (editText != null && ViewCompat.m2863p(editText) <= 0) {
                    this.f28297f.setMinimumHeight(ViewCompat.m2863p(this.f28280M));
                }
                this.f28280M.setVisibility(0);
                this.f28280M.setChecked(this.f28281N);
                if (this.f28282O == null) {
                    this.f28282O = new ColorDrawable();
                }
                this.f28282O.setBounds(0, 0, this.f28280M.getMeasuredWidth(), 1);
                Drawable[] a = C0680h.m3183a((TextView) this.f28297f);
                if (a[2] != this.f28282O) {
                    this.f28283P = a[2];
                }
                C0680h.m3180a(this.f28297f, a[0], a[1], this.f28282O, a[3]);
                this.f28280M.setPadding(this.f28297f.getPaddingLeft(), this.f28297f.getPaddingTop(), this.f28297f.getPaddingRight(), this.f28297f.getPaddingBottom());
            } else {
                CheckableImageButton checkableImageButton = this.f28280M;
                if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                    this.f28280M.setVisibility(8);
                }
                if (this.f28282O != null) {
                    Drawable[] a2 = C0680h.m3183a((TextView) this.f28297f);
                    if (a2[2] == this.f28282O) {
                        C0680h.m3180a(this.f28297f, a2[0], a2[1], this.f28283P, a2[3]);
                        this.f28282O = null;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    private void m27877v() {
        if (this.f28317u != 0 && this.f28314r != null && this.f28297f != null && getRight() != 0) {
            int left = this.f28297f.getLeft();
            int h = m27863h();
            int right = this.f28297f.getRight();
            int bottom = this.f28297f.getBottom() + this.f28315s;
            if (this.f28317u == 2) {
                int i = this.f28270C;
                left += i / 2;
                h -= i / 2;
                right -= i / 2;
                bottom += i / 2;
            }
            this.f28314r.setBounds(left, h, right, bottom);
            m27860e();
            m27874s();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f28295e.addView(view, layoutParams2);
            this.f28295e.setLayoutParams(layoutParams);
            m27875t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31336b(boolean z) {
        m27856a(z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo31338c() {
        EditText editText = this.f28297f;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                m27868m();
                if (C0262m.m1079a(background)) {
                    background = background.mutate();
                }
                if (this.f28301h.mo31426c()) {
                    background.setColorFilter(C0250e.m967a(this.f28301h.mo31428e(), Mode.SRC_IN));
                } else {
                    if (this.f28307k) {
                        TextView textView = this.f28308l;
                        if (textView != null) {
                            background.setColorFilter(C0250e.m967a(textView.getCurrentTextColor(), Mode.SRC_IN));
                        }
                    }
                    C0559a.m2649b(background);
                    this.f28297f.refreshDrawableState();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo31339d() {
        if (this.f28314r != null && this.f28317u != 0) {
            EditText editText = this.f28297f;
            boolean z = true;
            boolean z2 = editText != null && editText.hasFocus();
            EditText editText2 = this.f28297f;
            if (editText2 == null || !editText2.isHovered()) {
                z = false;
            }
            if (this.f28317u == 2) {
                if (!isEnabled()) {
                    this.f28271D = this.f28293c0;
                } else if (this.f28301h.mo31426c()) {
                    this.f28271D = this.f28301h.mo31428e();
                } else {
                    if (this.f28307k) {
                        TextView textView = this.f28308l;
                        if (textView != null) {
                            this.f28271D = textView.getCurrentTextColor();
                        }
                    }
                    if (z2) {
                        this.f28271D = this.f28292b0;
                    } else if (z) {
                        this.f28271D = this.f28291a0;
                    } else {
                        this.f28271D = this.f28290W;
                    }
                }
                if ((z || z2) && isEnabled()) {
                    this.f28268A = this.f28270C;
                } else {
                    this.f28268A = this.f28269B;
                }
                m27860e();
            }
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f28299g != null) {
            EditText editText = this.f28297f;
            if (editText != null) {
                boolean z = this.f28313q;
                this.f28313q = false;
                CharSequence hint = editText.getHint();
                this.f28297f.setHint(this.f28299g);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f28297f.setHint(hint);
                    this.f28313q = z;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f28306j0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f28306j0 = false;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.f28314r;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.f28311o) {
            this.f28296e0.mo31230a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f28304i0) {
            boolean z = true;
            this.f28304i0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!ViewCompat.m2804D(this) || !isEnabled()) {
                z = false;
            }
            mo31336b(z);
            mo31338c();
            m27877v();
            mo31339d();
            C10787c cVar = this.f28296e0;
            if (cVar != null ? cVar.mo31234a(drawableState) | false : false) {
                invalidate();
            }
            this.f28304i0 = false;
        }
    }

    public int getBoxBackgroundColor() {
        return this.f28272E;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f28321y;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f28322z;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f28320x;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f28319w;
    }

    public int getBoxStrokeColor() {
        return this.f28292b0;
    }

    public int getCounterMaxLength() {
        return this.f28305j;
    }

    /* access modifiers changed from: 0000 */
    public CharSequence getCounterOverflowDescription() {
        if (this.f28303i && this.f28307k) {
            TextView textView = this.f28308l;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f28288U;
    }

    public EditText getEditText() {
        return this.f28297f;
    }

    public CharSequence getError() {
        if (this.f28301h.mo31434k()) {
            return this.f28301h.mo31427d();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f28301h.mo31428e();
    }

    /* access modifiers changed from: 0000 */
    public final int getErrorTextCurrentColor() {
        return this.f28301h.mo31428e();
    }

    public CharSequence getHelperText() {
        if (this.f28301h.mo31435l()) {
            return this.f28301h.mo31430g();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f28301h.mo31431h();
    }

    public CharSequence getHint() {
        if (this.f28311o) {
            return this.f28312p;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final float getHintCollapsedTextHeight() {
        return this.f28296e0.mo31241c();
    }

    /* access modifiers changed from: 0000 */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f28296e0.mo31243d();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f28279L;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f28278K;
    }

    public Typeface getTypeface() {
        return this.f28276I;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f28314r != null) {
            m27877v();
        }
        if (this.f28311o) {
            EditText editText = this.f28297f;
            if (editText != null) {
                Rect rect = this.f28274G;
                C10788d.m27761a((ViewGroup) this, (View) editText, rect);
                int compoundPaddingLeft = rect.left + this.f28297f.getCompoundPaddingLeft();
                int compoundPaddingRight = rect.right - this.f28297f.getCompoundPaddingRight();
                int i5 = m27864i();
                this.f28296e0.mo31238b(compoundPaddingLeft, rect.top + this.f28297f.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f28297f.getCompoundPaddingBottom());
                this.f28296e0.mo31227a(compoundPaddingLeft, i5, compoundPaddingRight, (i4 - i2) - getPaddingBottom());
                this.f28296e0.mo31247h();
                if (m27867l() && !this.f28294d0) {
                    m27871p();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m27876u();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3548a());
        setError(savedState.f28323g);
        if (savedState.f28324h) {
            mo31333a(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f28301h.mo31426c()) {
            savedState.f28323g = getError();
        }
        savedState.f28324h = this.f28281N;
        return savedState;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f28272E != i) {
            this.f28272E = i;
            m27860e();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0540a.m2536a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f28317u) {
            this.f28317u = i;
            m27870o();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f28292b0 != i) {
            this.f28292b0 = i;
            mo31339d();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f28303i != z) {
            if (z) {
                this.f28308l = new AppCompatTextView(getContext());
                this.f28308l.setId(C12071f.textinput_counter);
                Typeface typeface = this.f28276I;
                if (typeface != null) {
                    this.f28308l.setTypeface(typeface);
                }
                this.f28308l.setMaxLines(1);
                mo31332a(this.f28308l, this.f28310n);
                this.f28301h.mo31415a(this.f28308l, 2);
                EditText editText = this.f28297f;
                if (editText == null) {
                    mo31331a(0);
                } else {
                    mo31331a(editText.getText().length());
                }
            } else {
                this.f28301h.mo31422b(this.f28308l, 2);
                this.f28308l = null;
            }
            this.f28303i = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f28305j != i) {
            if (i > 0) {
                this.f28305j = i;
            } else {
                this.f28305j = -1;
            }
            if (this.f28303i) {
                EditText editText = this.f28297f;
                mo31331a(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f28288U = colorStateList;
        this.f28289V = colorStateList;
        if (this.f28297f != null) {
            mo31336b(false);
        }
    }

    public void setEnabled(boolean z) {
        m27855a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f28301h.mo31434k()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f28301h.mo31416a(charSequence);
        } else {
            this.f28301h.mo31432i();
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f28301h.mo31417a(z);
    }

    public void setErrorTextAppearance(int i) {
        this.f28301h.mo31420b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f28301h.mo31413a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo31334a()) {
                setHelperTextEnabled(true);
            }
            this.f28301h.mo31423b(charSequence);
        } else if (mo31334a()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f28301h.mo31421b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f28301h.mo31424b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f28301h.mo31425c(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f28311o) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(ItemAnimator.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f28298f0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f28311o) {
            this.f28311o = z;
            if (!this.f28311o) {
                this.f28313q = false;
                if (!TextUtils.isEmpty(this.f28312p) && TextUtils.isEmpty(this.f28297f.getHint())) {
                    this.f28297f.setHint(this.f28312p);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f28297f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f28312p)) {
                        setHint(hint);
                    }
                    this.f28297f.setHint(null);
                }
                this.f28313q = true;
            }
            if (this.f28297f != null) {
                m27875t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f28296e0.mo31226a(i);
        this.f28289V = this.f28296e0.mo31235b();
        if (this.f28297f != null) {
            mo31336b(false);
            m27875t();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C7531a.m18133c(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f28277J != z) {
            this.f28277J = z;
            if (!z && this.f28281N) {
                EditText editText = this.f28297f;
                if (editText != null) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            this.f28281N = false;
            m27876u();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f28284Q = colorStateList;
        this.f28285R = true;
        m27861f();
    }

    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f28286S = mode;
        this.f28287T = true;
        m27861f();
    }

    public void setTextInputAccessibilityDelegate(C10824d dVar) {
        EditText editText = this.f28297f;
        if (editText != null) {
            ViewCompat.m2824a((View) editText, (C0615a) dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f28276I) {
            this.f28276I = typeface;
            this.f28296e0.mo31232a(typeface);
            this.f28301h.mo31414a(typeface);
            TextView textView = this.f28308l;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12067b.textInputStyle);
    }

    /* renamed from: a */
    private void m27856a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        EditText editText = this.f28297f;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f28297f;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean c = this.f28301h.mo31426c();
        ColorStateList colorStateList = this.f28288U;
        if (colorStateList != null) {
            this.f28296e0.mo31229a(colorStateList);
            this.f28296e0.mo31240b(this.f28288U);
        }
        if (!isEnabled) {
            this.f28296e0.mo31229a(ColorStateList.valueOf(this.f28293c0));
            this.f28296e0.mo31240b(ColorStateList.valueOf(this.f28293c0));
        } else if (c) {
            this.f28296e0.mo31229a(this.f28301h.mo31429f());
        } else {
            if (this.f28307k) {
                TextView textView = this.f28308l;
                if (textView != null) {
                    this.f28296e0.mo31229a(textView.getTextColors());
                }
            }
            if (z3) {
                ColorStateList colorStateList2 = this.f28289V;
                if (colorStateList2 != null) {
                    this.f28296e0.mo31229a(colorStateList2);
                }
            }
        }
        if (z4 || (isEnabled() && (z3 || c))) {
            if (z2 || this.f28294d0) {
                m27858c(z);
            }
        } else if (z2 || !this.f28294d0) {
            m27859d(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo31337b() {
        return this.f28313q;
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28301h = new C10826b(this);
        this.f28274G = new Rect();
        this.f28275H = new RectF();
        this.f28296e0 = new C10787c(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f28295e = new FrameLayout(context);
        this.f28295e.setAddStatesFromChildren(true);
        addView(this.f28295e);
        this.f28296e0.mo31239b(C12077a.f31460a);
        this.f28296e0.mo31228a(C12077a.f31460a);
        this.f28296e0.mo31237b(8388659);
        C0291z d = C10793g.m27779d(context, attributeSet, C12076k.TextInputLayout, i, C12075j.Widget_Design_TextInputLayout, new int[0]);
        this.f28311o = d.mo2103a(C12076k.TextInputLayout_hintEnabled, true);
        setHint(d.mo2112e(C12076k.TextInputLayout_android_hint));
        this.f28298f0 = d.mo2103a(C12076k.TextInputLayout_hintAnimationEnabled, true);
        this.f28315s = context.getResources().getDimensionPixelOffset(C12069d.mtrl_textinput_box_bottom_offset);
        this.f28316t = context.getResources().getDimensionPixelOffset(C12069d.mtrl_textinput_box_label_cutout_padding);
        this.f28318v = d.mo2105b(C12076k.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f28319w = d.mo2098a(C12076k.TextInputLayout_boxCornerRadiusTopStart, 0.0f);
        this.f28320x = d.mo2098a(C12076k.TextInputLayout_boxCornerRadiusTopEnd, 0.0f);
        this.f28321y = d.mo2098a(C12076k.TextInputLayout_boxCornerRadiusBottomEnd, 0.0f);
        this.f28322z = d.mo2098a(C12076k.TextInputLayout_boxCornerRadiusBottomStart, 0.0f);
        this.f28272E = d.mo2099a(C12076k.TextInputLayout_boxBackgroundColor, 0);
        this.f28292b0 = d.mo2099a(C12076k.TextInputLayout_boxStrokeColor, 0);
        this.f28269B = context.getResources().getDimensionPixelSize(C12069d.mtrl_textinput_box_stroke_width_default);
        this.f28270C = context.getResources().getDimensionPixelSize(C12069d.mtrl_textinput_box_stroke_width_focused);
        this.f28268A = this.f28269B;
        setBoxBackgroundMode(d.mo2109d(C12076k.TextInputLayout_boxBackgroundMode, 0));
        if (d.mo2116g(C12076k.TextInputLayout_android_textColorHint)) {
            ColorStateList a = d.mo2100a(C12076k.TextInputLayout_android_textColorHint);
            this.f28289V = a;
            this.f28288U = a;
        }
        this.f28290W = C0540a.m2536a(context, C12068c.mtrl_textinput_default_box_stroke_color);
        this.f28293c0 = C0540a.m2536a(context, C12068c.mtrl_textinput_disabled_color);
        this.f28291a0 = C0540a.m2536a(context, C12068c.mtrl_textinput_hovered_box_stroke_color);
        if (d.mo2115g(C12076k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(d.mo2115g(C12076k.TextInputLayout_hintTextAppearance, 0));
        }
        int g = d.mo2115g(C12076k.TextInputLayout_errorTextAppearance, 0);
        boolean a2 = d.mo2103a(C12076k.TextInputLayout_errorEnabled, false);
        int g2 = d.mo2115g(C12076k.TextInputLayout_helperTextTextAppearance, 0);
        boolean a3 = d.mo2103a(C12076k.TextInputLayout_helperTextEnabled, false);
        CharSequence e = d.mo2112e(C12076k.TextInputLayout_helperText);
        boolean a4 = d.mo2103a(C12076k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(d.mo2109d(C12076k.TextInputLayout_counterMaxLength, -1));
        this.f28310n = d.mo2115g(C12076k.TextInputLayout_counterTextAppearance, 0);
        this.f28309m = d.mo2115g(C12076k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f28277J = d.mo2103a(C12076k.TextInputLayout_passwordToggleEnabled, false);
        this.f28278K = d.mo2106b(C12076k.TextInputLayout_passwordToggleDrawable);
        this.f28279L = d.mo2112e(C12076k.TextInputLayout_passwordToggleContentDescription);
        if (d.mo2116g(C12076k.TextInputLayout_passwordToggleTint)) {
            this.f28285R = true;
            this.f28284Q = d.mo2100a(C12076k.TextInputLayout_passwordToggleTint);
        }
        if (d.mo2116g(C12076k.TextInputLayout_passwordToggleTintMode)) {
            this.f28287T = true;
            this.f28286S = C10794h.m27780a(d.mo2109d(C12076k.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        d.mo2102a();
        setHelperTextEnabled(a3);
        setHelperText(e);
        setHelperTextTextAppearance(g2);
        setErrorEnabled(a2);
        setErrorTextAppearance(g);
        setCounterEnabled(a4);
        m27861f();
        ViewCompat.m2852g(this, 2);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f28279L = charSequence;
        CheckableImageButton checkableImageButton = this.f28280M;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f28278K = drawable;
        CheckableImageButton checkableImageButton = this.f28280M;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: c */
    private void m27858c(boolean z) {
        ValueAnimator valueAnimator = this.f28300g0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f28300g0.cancel();
        }
        if (!z || !this.f28298f0) {
            this.f28296e0.mo31236b(1.0f);
        } else {
            mo31330a(1.0f);
        }
        this.f28294d0 = false;
        if (m27867l()) {
            m27871p();
        }
    }

    /* renamed from: d */
    private void m27859d(boolean z) {
        ValueAnimator valueAnimator = this.f28300g0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f28300g0.cancel();
        }
        if (!z || !this.f28298f0) {
            this.f28296e0.mo31236b(0.0f);
        } else {
            mo31330a(0.0f);
        }
        if (m27867l() && ((C10825a) this.f28314r).mo31409a()) {
            m27866k();
        }
        this.f28294d0 = true;
    }

    /* renamed from: a */
    public boolean mo31334a() {
        return this.f28301h.mo31435l();
    }

    /* renamed from: a */
    private static void m27855a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m27855a((ViewGroup) childAt, z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31331a(int i) {
        boolean z = this.f28307k;
        if (this.f28305j == -1) {
            this.f28308l.setText(String.valueOf(i));
            this.f28308l.setContentDescription(null);
            this.f28307k = false;
        } else {
            if (ViewCompat.m2847e(this.f28308l) == 1) {
                ViewCompat.m2850f(this.f28308l, 0);
            }
            this.f28307k = i > this.f28305j;
            boolean z2 = this.f28307k;
            if (z != z2) {
                mo31332a(this.f28308l, z2 ? this.f28309m : this.f28310n);
                if (this.f28307k) {
                    ViewCompat.m2850f(this.f28308l, 1);
                }
            }
            this.f28308l.setText(getContext().getString(C12074i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f28305j)}));
            this.f28308l.setContentDescription(getContext().getString(C12074i.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f28305j)}));
        }
        if (this.f28297f != null && z != this.f28307k) {
            mo31336b(false);
            mo31339d();
            mo31338c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31332a(TextView textView, int i) {
        boolean z = true;
        try {
            C0680h.m3189d(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0680h.m3189d(textView, C12075j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C0540a.m2536a(getContext(), C12068c.design_error));
        }
    }

    /* renamed from: a */
    public void mo31333a(boolean z) {
        if (this.f28277J) {
            int selectionEnd = this.f28297f.getSelectionEnd();
            if (m27869n()) {
                this.f28297f.setTransformationMethod(null);
                this.f28281N = true;
            } else {
                this.f28297f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f28281N = false;
            }
            this.f28280M.setChecked(this.f28281N);
            if (z) {
                this.f28280M.jumpDrawablesToCurrentState();
            }
            this.f28297f.setSelection(selectionEnd);
        }
    }

    /* renamed from: a */
    private void m27854a(RectF rectF) {
        float f = rectF.left;
        int i = this.f28316t;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31330a(float f) {
        if (this.f28296e0.mo31244e() != f) {
            if (this.f28300g0 == null) {
                this.f28300g0 = new ValueAnimator();
                this.f28300g0.setInterpolator(C12077a.f31461b);
                this.f28300g0.setDuration(167);
                this.f28300g0.addUpdateListener(new C10823c());
            }
            this.f28300g0.setFloatValues(new float[]{this.f28296e0.mo31244e(), f});
            this.f28300g0.start();
        }
    }
}
