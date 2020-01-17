package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.widget.l */
class C0261l {

    /* renamed from: k */
    private static final RectF f1190k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f1191l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Field> f1192m = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1193a = 0;

    /* renamed from: b */
    private boolean f1194b = false;

    /* renamed from: c */
    private float f1195c = -1.0f;

    /* renamed from: d */
    private float f1196d = -1.0f;

    /* renamed from: e */
    private float f1197e = -1.0f;

    /* renamed from: f */
    private int[] f1198f = new int[0];

    /* renamed from: g */
    private boolean f1199g = false;

    /* renamed from: h */
    private TextPaint f1200h;

    /* renamed from: i */
    private final TextView f1201i;

    /* renamed from: j */
    private final Context f1202j;

    C0261l(TextView textView) {
        this.f1201i = textView;
        this.f1202j = this.f1201i.getContext();
    }

    /* renamed from: h */
    private void m1060h() {
        this.f1193a = 0;
        this.f1196d = -1.0f;
        this.f1197e = -1.0f;
        this.f1195c = -1.0f;
        this.f1198f = new int[0];
        this.f1194b = false;
    }

    /* renamed from: i */
    private boolean m1061i() {
        if (!m1063k() || this.f1193a != 1) {
            this.f1194b = false;
        } else {
            if (!this.f1199g || this.f1198f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1197e - this.f1196d) / this.f1195c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1196d + (((float) i) * this.f1195c));
                }
                this.f1198f = m1055a(iArr);
            }
            this.f1194b = true;
        }
        return this.f1194b;
    }

    /* renamed from: j */
    private boolean m1062j() {
        int length = this.f1198f.length;
        this.f1199g = length > 0;
        if (this.f1199g) {
            this.f1193a = 1;
            int[] iArr = this.f1198f;
            this.f1196d = (float) iArr[0];
            this.f1197e = (float) iArr[length - 1];
            this.f1195c = -1.0f;
        }
        return this.f1199g;
    }

    /* renamed from: k */
    private boolean m1063k() {
        return !(this.f1201i instanceof AppCompatEditText);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1950a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1202j.obtainStyledAttributes(attributeSet, C7530j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C7530j.AppCompatTextView_autoSizeTextType)) {
            this.f1193a = obtainStyledAttributes.getInt(C7530j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C7530j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C7530j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C7530j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C7530j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C7530j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C7530j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C7530j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C7530j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m1053a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m1063k()) {
            this.f1193a = 0;
        } else if (this.f1193a == 1) {
            if (!this.f1199g) {
                DisplayMetrics displayMetrics = this.f1202j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1052a(dimension2, dimension3, dimension);
            }
            m1061i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1953b(int i) {
        if (!m1063k()) {
            return;
        }
        if (i == 0) {
            m1060h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1202j.getResources().getDisplayMetrics();
            m1052a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1061i()) {
                mo1946a();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1954c() {
        return Math.round(this.f1196d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo1955d() {
        return Math.round(this.f1195c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int[] mo1956e() {
        return this.f1198f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo1957f() {
        return this.f1193a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo1958g() {
        return m1063k() && this.f1193a != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1952b() {
        return Math.round(this.f1197e);
    }

    /* renamed from: b */
    private StaticLayout m1057b(CharSequence charSequence, Alignment alignment, int i, int i2) {
        Builder obtain = Builder.obtain(charSequence, 0, charSequence.length(), this.f1200h, i);
        Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1201i.getLineSpacingExtra(), this.f1201i.getLineSpacingMultiplier()).setIncludePad(this.f1201i.getIncludeFontPadding()).setBreakStrategy(this.f1201i.getBreakStrategy()).setHyphenationFrequency(this.f1201i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            obtain.setTextDirection((TextDirectionHeuristic) m1058b((Object) this.f1201i, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: b */
    private StaticLayout m1056b(CharSequence charSequence, Alignment alignment, int i) {
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f1200h, i, alignment, this.f1201i.getLineSpacingMultiplier(), this.f1201i.getLineSpacingExtra(), this.f1201i.getIncludeFontPadding());
        return staticLayout;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1949a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m1063k()) {
            DisplayMetrics displayMetrics = this.f1202j.getResources().getDisplayMetrics();
            m1052a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1061i()) {
                mo1946a();
            }
        }
    }

    /* renamed from: b */
    private static <T> T m1058b(Object obj, String str, T t) {
        try {
            return m1059b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: b */
    private static Method m1059b(String str) {
        try {
            Method method = (Method) f1191l.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f1191l.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1951a(int[] iArr, int i) throws IllegalArgumentException {
        if (m1063k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1202j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1198f = m1055a(iArr2);
                if (!m1062j()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f1199g = false;
            }
            if (m1061i()) {
                mo1946a();
            }
        }
    }

    /* renamed from: a */
    private void m1053a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1198f = m1055a(iArr);
            m1062j();
        }
    }

    /* renamed from: a */
    private int[] m1055a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m1052a(float f, float f2, float f3) throws IllegalArgumentException {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f1193a = 1;
            this.f1196d = f;
            this.f1197e = f2;
            this.f1195c = f3;
            this.f1199g = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1946a() {
        int i;
        if (mo1958g()) {
            if (this.f1194b) {
                if (this.f1201i.getMeasuredHeight() > 0 && this.f1201i.getMeasuredWidth() > 0) {
                    if (((Boolean) m1058b((Object) this.f1201i, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue()) {
                        i = 1048576;
                    } else {
                        i = (this.f1201i.getMeasuredWidth() - this.f1201i.getTotalPaddingLeft()) - this.f1201i.getTotalPaddingRight();
                    }
                    int height = (this.f1201i.getHeight() - this.f1201i.getCompoundPaddingBottom()) - this.f1201i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f1190k) {
                            f1190k.setEmpty();
                            f1190k.right = (float) i;
                            f1190k.bottom = (float) height;
                            float a = (float) m1047a(f1190k);
                            if (a != this.f1201i.getTextSize()) {
                                mo1948a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.f1194b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1948a(int i, float f) {
        Resources resources;
        Context context = this.f1202j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1051a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m1051a(float f) {
        if (f != this.f1201i.getPaint().getTextSize()) {
            this.f1201i.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f1201i.isInLayout() : false;
            if (this.f1201i.getLayout() != null) {
                this.f1194b = false;
                try {
                    Method b = m1059b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.f1201i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1201i.requestLayout();
                } else {
                    this.f1201i.forceLayout();
                }
                this.f1201i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m1047a(RectF rectF) {
        int length = this.f1198f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1054a(this.f1198f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1198f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1947a(int i) {
        TextPaint textPaint = this.f1200h;
        if (textPaint == null) {
            this.f1200h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1200h.set(this.f1201i.getPaint());
        this.f1200h.setTextSize((float) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public StaticLayout mo1945a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 23) {
            return m1057b(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m1056b(charSequence, alignment, i);
        }
        return m1048a(charSequence, alignment, i);
    }

    /* renamed from: a */
    private boolean m1054a(int i, RectF rectF) {
        CharSequence text = this.f1201i.getText();
        TransformationMethod transformationMethod = this.f1201i.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f1201i);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f1201i.getMaxLines() : -1;
        mo1947a(i);
        StaticLayout a = mo1945a(text, (Alignment) m1058b((Object) this.f1201i, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private StaticLayout m1048a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue = ((Float) m1049a((Object) this.f1201i, "mSpacingMult", (T) Float.valueOf(1.0f))).floatValue();
        float floatValue2 = ((Float) m1049a((Object) this.f1201i, "mSpacingAdd", (T) Float.valueOf(0.0f))).floatValue();
        boolean booleanValue = ((Boolean) m1049a((Object) this.f1201i, "mIncludePad", (T) Boolean.valueOf(true))).booleanValue();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f1200h, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private static <T> T m1049a(Object obj, String str, T t) {
        try {
            Field a = m1050a(str);
            if (a == null) {
                return t;
            }
            return a.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private static Field m1050a(String str) {
        try {
            Field field = (Field) f1192m.get(str);
            if (field == null) {
                field = TextView.class.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                    f1192m.put(str, field);
                }
            }
            return field;
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }
}
