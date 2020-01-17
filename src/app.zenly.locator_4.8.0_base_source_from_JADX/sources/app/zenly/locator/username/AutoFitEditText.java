package app.zenly.locator.username;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatEditText;

@Deprecated
public class AutoFitEditText extends AppCompatEditText {

    /* renamed from: h */
    private final RectF f14968h;

    /* renamed from: i */
    private final SparseIntArray f14969i;

    /* renamed from: j */
    private final C5950b f14970j;

    /* renamed from: k */
    private float f14971k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f14972l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f14973m;

    /* renamed from: n */
    private Float f14974n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f14975o;

    /* renamed from: p */
    private int f14976p;

    /* renamed from: q */
    private boolean f14977q;

    /* renamed from: r */
    private boolean f14978r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public TextPaint f14979s;

    /* renamed from: app.zenly.locator.username.AutoFitEditText$a */
    class C5949a implements C5950b {

        /* renamed from: a */
        final RectF f14980a = new RectF();

        C5949a() {
        }

        /* renamed from: a */
        public int mo13669a(int i, RectF rectF) {
            AutoFitEditText.this.f14979s.setTextSize((float) i);
            String obj = AutoFitEditText.this.getText().toString();
            if (AutoFitEditText.this.getMaxLines() == 1) {
                this.f14980a.bottom = AutoFitEditText.this.f14979s.getFontSpacing();
                this.f14980a.right = AutoFitEditText.this.f14979s.measureText(obj);
            } else {
                StaticLayout staticLayout = new StaticLayout(obj, AutoFitEditText.this.f14979s, AutoFitEditText.this.f14975o, Alignment.ALIGN_NORMAL, AutoFitEditText.this.f14972l, AutoFitEditText.this.f14973m, true);
                if (AutoFitEditText.this.getMaxLines() != -1 && staticLayout.getLineCount() > AutoFitEditText.this.getMaxLines()) {
                    return 1;
                }
                this.f14980a.bottom = (float) staticLayout.getHeight();
                int i2 = -1;
                for (int i3 = 0; i3 < staticLayout.getLineCount(); i3++) {
                    if (((float) i2) < staticLayout.getLineWidth(i3)) {
                        i2 = (int) staticLayout.getLineWidth(i3);
                    }
                }
                this.f14980a.right = (float) i2;
            }
            this.f14980a.offsetTo(0.0f, 0.0f);
            return rectF.contains(this.f14980a) ? -1 : 1;
        }
    }

    /* renamed from: app.zenly.locator.username.AutoFitEditText$b */
    private interface C5950b {
        /* renamed from: a */
        int mo13669a(int i, RectF rectF);
    }

    public AutoFitEditText(Context context) {
        this(context, null, 0);
    }

    public int getMaxLines() {
        return this.f14976p;
    }

    public Float get_minTextSize() {
        return this.f14974n;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f14969i.clear();
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m16509b();
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m16509b();
    }

    public void setEnableSizeCache(boolean z) {
        this.f14977q = z;
        this.f14969i.clear();
        m16506a();
    }

    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.f14972l = f2;
        this.f14973m = f;
    }

    public void setLines(int i) {
        super.setLines(i);
        this.f14976p = i;
        m16509b();
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f14976p = i;
        m16509b();
    }

    public void setMinTextSize(Float f) {
        this.f14974n = f;
        m16509b();
    }

    public void setSingleLine() {
        super.setSingleLine();
        this.f14976p = 1;
        m16509b();
    }

    public void setTextSize(float f) {
        this.f14971k = f;
        this.f14969i.clear();
        m16506a();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f14979s == null) {
            this.f14979s = new TextPaint(getPaint());
        }
        this.f14979s.setTypeface(typeface);
        super.setTypeface(typeface);
    }

    public AutoFitEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m16506a() {
        if (this.f14978r) {
            int round = Math.round(this.f14974n.floatValue());
            int measuredHeight = (getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            this.f14975o = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            int i = this.f14975o;
            if (i > 0) {
                RectF rectF = this.f14968h;
                rectF.right = (float) i;
                rectF.bottom = (float) measuredHeight;
                super.setTextSize(0, (float) m16507b(round, (int) this.f14971k, this.f14970j, rectF));
            }
        }
    }

    /* renamed from: b */
    private void m16509b() {
        m16506a();
    }

    public AutoFitEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14968h = new RectF();
        this.f14969i = new SparseIntArray();
        this.f14972l = 1.0f;
        this.f14973m = 0.0f;
        this.f14977q = true;
        this.f14978r = false;
        this.f14974n = Float.valueOf(TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics()));
        this.f14971k = getTextSize();
        if (this.f14976p == 0) {
            this.f14976p = -1;
        }
        this.f14970j = new C5949a();
        this.f14978r = true;
    }

    /* renamed from: b */
    private int m16507b(int i, int i2, C5950b bVar, RectF rectF) {
        int i3;
        if (!this.f14977q) {
            return m16504a(i, i2, bVar, rectF);
        }
        String obj = getText().toString();
        if (obj == null) {
            i3 = 0;
        } else {
            i3 = obj.length();
        }
        int i4 = this.f14969i.get(i3);
        if (i4 != 0) {
            return i4;
        }
        int a = m16504a(i, i2, bVar, rectF);
        this.f14969i.put(i3, a);
        return a;
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        if (z) {
            this.f14976p = 1;
        } else {
            this.f14976p = -1;
        }
        m16509b();
    }

    public void setTextSize(int i, float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.f14971k = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        this.f14969i.clear();
        m16506a();
    }

    /* renamed from: a */
    private int m16504a(int i, int i2, C5950b bVar, RectF rectF) {
        int i3 = i2 - 1;
        int i4 = i;
        while (i <= i3) {
            i4 = (i + i3) >>> 1;
            int a = bVar.mo13669a(i4, rectF);
            if (a >= 0) {
                if (a <= 0) {
                    break;
                }
                i4--;
                i3 = i4;
            } else {
                int i5 = i4 + 1;
                i4 = i;
                i = i5;
            }
        }
        return i4;
    }
}
