package app.zenly.locator.privacy.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.android.volley.toolbox.C8733j;
import p250f.p251a.p252a.p263b.p279d.p282i.C7780a;

public class ContactHiddenCountdownView extends View {

    /* renamed from: e */
    private final Paint f13182e;

    /* renamed from: f */
    private final Paint f13183f;

    /* renamed from: g */
    private final Paint f13184g;

    /* renamed from: h */
    private float f13185h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5095b f13186i;

    /* renamed from: j */
    private long[] f13187j;

    /* renamed from: k */
    private boolean f13188k;

    /* renamed from: l */
    private String f13189l;

    /* renamed from: m */
    private final C7780a f13190m;

    /* renamed from: n */
    private final Path f13191n;

    /* renamed from: app.zenly.locator.privacy.view.ContactHiddenCountdownView$a */
    class C5094a implements OnLayoutChangeListener {
        C5094a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ContactHiddenCountdownView.this.removeOnLayoutChangeListener(this);
            ContactHiddenCountdownView contactHiddenCountdownView = ContactHiddenCountdownView.this;
            contactHiddenCountdownView.onVisibilityChanged(contactHiddenCountdownView, contactHiddenCountdownView.getVisibility());
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.ContactHiddenCountdownView$b */
    private class C5095b extends CountDownTimer {
        public C5095b(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            ContactHiddenCountdownView.this.f13186i = null;
            ContactHiddenCountdownView.this.invalidate();
            ContactHiddenCountdownView.this.setVisibility(8);
        }

        public void onTick(long j) {
            ContactHiddenCountdownView.this.m14507a((long) (((int) j) / C8733j.DEFAULT_IMAGE_TIMEOUT_MS));
        }
    }

    public ContactHiddenCountdownView(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13186i != null || this.f13189l != null) {
            this.f13190m.mo19991c((float) getPaddingLeft());
            this.f13190m.mo19993d((float) (getWidth() - getPaddingRight()));
            this.f13190m.mo19994e((float) getPaddingTop());
            this.f13190m.mo19985a((float) (getHeight() - getPaddingBottom()));
            C7780a aVar = this.f13190m;
            aVar.mo19989b(Math.min(aVar.mo19990c() - this.f13190m.mo19988b(), this.f13190m.mo19983a() - this.f13190m.mo19992d()) * 0.4f);
            C7780a aVar2 = this.f13190m;
            Path path = this.f13191n;
            aVar2.mo19984a(path);
            canvas.drawPath(path, this.f13183f);
            float width = ((float) getWidth()) / 2.0f;
            float height = (((float) getHeight()) / 2.0f) - ((this.f13184g.descent() + this.f13184g.ascent()) / 2.0f);
            String str = this.f13189l;
            if (str == null) {
                str = String.format("%d:%02d:%02d", new Object[]{Long.valueOf(this.f13187j[0]), Long.valueOf(this.f13187j[1]), Long.valueOf(this.f13187j[2])});
            }
            canvas.drawText(str, width, height, this.f13184g);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13188k = true;
        m14506a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13188k = false;
        m14506a();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m14506a();
    }

    public void setRemainingTime(long j) {
        this.f13189l = null;
        m14507a(j);
        m14506a();
    }

    public void setText(String str) {
        this.f13189l = str;
        m14506a();
        invalidate();
    }

    public ContactHiddenCountdownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactHiddenCountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13187j = new long[]{0, 0, 0};
        this.f13188k = false;
        this.f13189l = null;
        this.f13190m = new C7780a();
        this.f13191n = new Path();
        this.f13183f = new Paint(1);
        this.f13183f.setColor(1711276032);
        this.f13183f.setStyle(Style.FILL);
        this.f13182e = new Paint(1);
        this.f13182e.setColor(-1118720);
        this.f13182e.setStrokeWidth(10.0f);
        this.f13182e.setStyle(Style.STROKE);
        this.f13184g = new Paint(1);
        this.f13184g.setColor(-1);
        this.f13184g.setTextAlign(Align.CENTER);
        this.f13184g.setTextSize(32.0f);
        this.f13185h = 0.0f;
        addOnLayoutChangeListener(new C5094a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14507a(long j) {
        this.f13185h = (float) j;
        long[] jArr = this.f13187j;
        jArr[0] = j / 3600;
        long j2 = j - (jArr[0] * 3600);
        jArr[1] = j2 / 60;
        jArr[2] = j2 - (jArr[1] * 60);
        invalidate();
    }

    /* renamed from: a */
    private void m14506a() {
        if (!isShown() || !this.f13188k || this.f13189l != null) {
            C5095b bVar = this.f13186i;
            if (bVar != null) {
                bVar.cancel();
                this.f13186i = null;
                return;
            }
            return;
        }
        C5095b bVar2 = this.f13186i;
        if (bVar2 != null) {
            bVar2.cancel();
        }
        C5095b bVar3 = new C5095b(1000 * ((long) this.f13185h), 1000);
        this.f13186i = bVar3;
        this.f13186i.start();
    }
}
