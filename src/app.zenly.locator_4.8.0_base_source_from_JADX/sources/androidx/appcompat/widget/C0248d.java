package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.widget.C0674b;

/* renamed from: androidx.appcompat.widget.d */
class C0248d {

    /* renamed from: a */
    private final CompoundButton f1133a;

    /* renamed from: b */
    private ColorStateList f1134b = null;

    /* renamed from: c */
    private Mode f1135c = null;

    /* renamed from: d */
    private boolean f1136d = false;

    /* renamed from: e */
    private boolean f1137e = false;

    /* renamed from: f */
    private boolean f1138f;

    C0248d(CompoundButton compoundButton) {
        this.f1133a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1887a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f1133a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p214e.p215a.C7530j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = p214e.p215a.C7530j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = p214e.p215a.C7530j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f1133a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f1133a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = p214e.p215a.p216k.p217a.C7531a.m18133c(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = p214e.p215a.C7530j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = p214e.p215a.C7530j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f1133a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f1133a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = p214e.p215a.p216k.p217a.C7531a.m18133c(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = p214e.p215a.C7530j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f1133a     // Catch:{ all -> 0x0080 }
            int r0 = p214e.p215a.C7530j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0674b.m3160a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = p214e.p215a.C7530j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f1133a     // Catch:{ all -> 0x0080 }
            int r0 = p214e.p215a.C7530j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0262m.m1078a(r0, r1)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0674b.m3161a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0248d.mo1887a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1888b() {
        return this.f1134b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1889c() {
        return this.f1135c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1890d() {
        if (this.f1138f) {
            this.f1138f = false;
            return;
        }
        this.f1138f = true;
        mo1884a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1885a(ColorStateList colorStateList) {
        this.f1134b = colorStateList;
        this.f1136d = true;
        mo1884a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1886a(Mode mode) {
        this.f1135c = mode;
        this.f1137e = true;
        mo1884a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1884a() {
        Drawable a = C0674b.m3159a(this.f1133a);
        if (a == null) {
            return;
        }
        if (this.f1136d || this.f1137e) {
            Drawable mutate = C0559a.m2657i(a).mutate();
            if (this.f1136d) {
                C0559a.m2642a(mutate, this.f1134b);
            }
            if (this.f1137e) {
                C0559a.m2645a(mutate, this.f1135c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1133a.getDrawableState());
            }
            this.f1133a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1883a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0674b.m3159a(this.f1133a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }
}
