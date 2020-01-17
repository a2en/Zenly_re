package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;
import androidx.core.content.res.C0554e.C0555a;
import androidx.core.widget.AutoSizeableTextView;
import java.lang.ref.WeakReference;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.widget.k */
class C0259k {

    /* renamed from: a */
    private final TextView f1173a;

    /* renamed from: b */
    private C0289x f1174b;

    /* renamed from: c */
    private C0289x f1175c;

    /* renamed from: d */
    private C0289x f1176d;

    /* renamed from: e */
    private C0289x f1177e;

    /* renamed from: f */
    private C0289x f1178f;

    /* renamed from: g */
    private C0289x f1179g;

    /* renamed from: h */
    private C0289x f1180h;

    /* renamed from: i */
    private final C0261l f1181i;

    /* renamed from: j */
    private int f1182j = 0;

    /* renamed from: k */
    private int f1183k = -1;

    /* renamed from: l */
    private Typeface f1184l;

    /* renamed from: m */
    private boolean f1185m;

    /* renamed from: androidx.appcompat.widget.k$a */
    class C0260a extends C0555a {

        /* renamed from: a */
        final /* synthetic */ int f1186a;

        /* renamed from: b */
        final /* synthetic */ int f1187b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1188c;

        C0260a(int i, int i2, WeakReference weakReference) {
            this.f1186a = i;
            this.f1187b = i2;
            this.f1188c = weakReference;
        }

        /* renamed from: a */
        public void mo1943a(int i) {
        }

        /* renamed from: a */
        public void mo1944a(Typeface typeface) {
            if (VERSION.SDK_INT >= 28) {
                int i = this.f1186a;
                if (i != -1) {
                    typeface = Typeface.create(typeface, i, (this.f1187b & 2) != 0);
                }
            }
            C0259k.this.mo1929a(this.f1188c, typeface);
        }
    }

    C0259k(TextView textView) {
        this.f1173a = textView;
        this.f1181i = new C0261l(this.f1173a);
    }

    /* renamed from: l */
    private void m1022l() {
        C0289x xVar = this.f1180h;
        this.f1174b = xVar;
        this.f1175c = xVar;
        this.f1176d = xVar;
        this.f1177e = xVar;
        this.f1178f = xVar;
        this.f1179g = xVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1928a(android.util.AttributeSet r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            android.widget.TextView r2 = r7.f1173a
            android.content.Context r2 = r2.getContext()
            androidx.appcompat.widget.e r3 = androidx.appcompat.widget.C0250e.m969b()
            int[] r4 = p214e.p215a.C7530j.AppCompatTextHelper
            r5 = 0
            androidx.appcompat.widget.z r4 = androidx.appcompat.widget.C0291z.m1196a(r2, r0, r4, r1, r5)
            int r6 = p214e.p215a.C7530j.AppCompatTextHelper_android_textAppearance
            r8 = -1
            int r6 = r4.mo2115g(r6, r8)
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableLeft
            boolean r9 = r4.mo2116g(r9)
            if (r9 == 0) goto L_0x0032
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableLeft
            int r9 = r4.mo2115g(r9, r5)
            androidx.appcompat.widget.x r9 = m1017a(r2, r3, r9)
            r7.f1174b = r9
        L_0x0032:
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableTop
            boolean r9 = r4.mo2116g(r9)
            if (r9 == 0) goto L_0x0046
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableTop
            int r9 = r4.mo2115g(r9, r5)
            androidx.appcompat.widget.x r9 = m1017a(r2, r3, r9)
            r7.f1175c = r9
        L_0x0046:
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableRight
            boolean r9 = r4.mo2116g(r9)
            if (r9 == 0) goto L_0x005a
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableRight
            int r9 = r4.mo2115g(r9, r5)
            androidx.appcompat.widget.x r9 = m1017a(r2, r3, r9)
            r7.f1176d = r9
        L_0x005a:
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableBottom
            boolean r9 = r4.mo2116g(r9)
            if (r9 == 0) goto L_0x006e
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableBottom
            int r9 = r4.mo2115g(r9, r5)
            androidx.appcompat.widget.x r9 = m1017a(r2, r3, r9)
            r7.f1177e = r9
        L_0x006e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x009c
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableStart
            boolean r9 = r4.mo2116g(r9)
            if (r9 == 0) goto L_0x0088
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableStart
            int r9 = r4.mo2115g(r9, r5)
            androidx.appcompat.widget.x r9 = m1017a(r2, r3, r9)
            r7.f1178f = r9
        L_0x0088:
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableEnd
            boolean r9 = r4.mo2116g(r9)
            if (r9 == 0) goto L_0x009c
            int r9 = p214e.p215a.C7530j.AppCompatTextHelper_android_drawableEnd
            int r9 = r4.mo2115g(r9, r5)
            androidx.appcompat.widget.x r9 = m1017a(r2, r3, r9)
            r7.f1179g = r9
        L_0x009c:
            r4.mo2102a()
            android.widget.TextView r4 = r7.f1173a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r9 = 26
            r11 = 23
            if (r6 == r8) goto L_0x0130
            int[] r13 = p214e.p215a.C7530j.TextAppearance
            androidx.appcompat.widget.z r6 = androidx.appcompat.widget.C0291z.m1194a(r2, r6, r13)
            if (r4 != 0) goto L_0x00c6
            int r13 = p214e.p215a.C7530j.TextAppearance_textAllCaps
            boolean r13 = r6.mo2116g(r13)
            if (r13 == 0) goto L_0x00c6
            int r13 = p214e.p215a.C7530j.TextAppearance_textAllCaps
            boolean r13 = r6.mo2103a(r13, r5)
            r14 = r13
            r13 = 1
            goto L_0x00c8
        L_0x00c6:
            r13 = 0
            r14 = 0
        L_0x00c8:
            r7.m1018a(r2, r6)
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r11) goto L_0x0105
            int r15 = p214e.p215a.C7530j.TextAppearance_android_textColor
            boolean r15 = r6.mo2116g(r15)
            if (r15 == 0) goto L_0x00de
            int r15 = p214e.p215a.C7530j.TextAppearance_android_textColor
            android.content.res.ColorStateList r15 = r6.mo2100a(r15)
            goto L_0x00df
        L_0x00de:
            r15 = 0
        L_0x00df:
            int r10 = p214e.p215a.C7530j.TextAppearance_android_textColorHint
            boolean r10 = r6.mo2116g(r10)
            if (r10 == 0) goto L_0x00ee
            int r10 = p214e.p215a.C7530j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo2100a(r10)
            goto L_0x00ef
        L_0x00ee:
            r10 = 0
        L_0x00ef:
            int r12 = p214e.p215a.C7530j.TextAppearance_android_textColorLink
            boolean r12 = r6.mo2116g(r12)
            if (r12 == 0) goto L_0x0103
            int r12 = p214e.p215a.C7530j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r12 = r6.mo2100a(r12)
            r17 = r15
            r15 = r12
            r12 = r17
            goto L_0x0108
        L_0x0103:
            r12 = r15
            goto L_0x0107
        L_0x0105:
            r10 = 0
            r12 = 0
        L_0x0107:
            r15 = 0
        L_0x0108:
            int r8 = p214e.p215a.C7530j.TextAppearance_textLocale
            boolean r8 = r6.mo2116g(r8)
            if (r8 == 0) goto L_0x0117
            int r8 = p214e.p215a.C7530j.TextAppearance_textLocale
            java.lang.String r8 = r6.mo2110d(r8)
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto L_0x012b
            int r11 = p214e.p215a.C7530j.TextAppearance_fontVariationSettings
            boolean r11 = r6.mo2116g(r11)
            if (r11 == 0) goto L_0x012b
            int r11 = p214e.p215a.C7530j.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo2110d(r11)
            goto L_0x012c
        L_0x012b:
            r11 = 0
        L_0x012c:
            r6.mo2102a()
            goto L_0x0137
        L_0x0130:
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0137:
            int[] r6 = p214e.p215a.C7530j.TextAppearance
            androidx.appcompat.widget.z r6 = androidx.appcompat.widget.C0291z.m1196a(r2, r0, r6, r1, r5)
            if (r4 != 0) goto L_0x014e
            int r9 = p214e.p215a.C7530j.TextAppearance_textAllCaps
            boolean r9 = r6.mo2116g(r9)
            if (r9 == 0) goto L_0x014e
            int r9 = p214e.p215a.C7530j.TextAppearance_textAllCaps
            boolean r14 = r6.mo2103a(r9, r5)
            r13 = 1
        L_0x014e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r9 >= r5) goto L_0x017e
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textColor
            boolean r5 = r6.mo2116g(r5)
            if (r5 == 0) goto L_0x0162
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textColor
            android.content.res.ColorStateList r12 = r6.mo2100a(r5)
        L_0x0162:
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textColorHint
            boolean r5 = r6.mo2116g(r5)
            if (r5 == 0) goto L_0x0170
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo2100a(r5)
        L_0x0170:
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textColorLink
            boolean r5 = r6.mo2116g(r5)
            if (r5 == 0) goto L_0x017e
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r15 = r6.mo2100a(r5)
        L_0x017e:
            int r5 = p214e.p215a.C7530j.TextAppearance_textLocale
            boolean r5 = r6.mo2116g(r5)
            if (r5 == 0) goto L_0x018c
            int r5 = p214e.p215a.C7530j.TextAppearance_textLocale
            java.lang.String r8 = r6.mo2110d(r5)
        L_0x018c:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r5 < r9) goto L_0x01a0
            int r5 = p214e.p215a.C7530j.TextAppearance_fontVariationSettings
            boolean r5 = r6.mo2116g(r5)
            if (r5 == 0) goto L_0x01a0
            int r5 = p214e.p215a.C7530j.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo2110d(r5)
        L_0x01a0:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r5 < r9) goto L_0x01c1
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textSize
            boolean r5 = r6.mo2116g(r5)
            if (r5 == 0) goto L_0x01c1
            int r5 = p214e.p215a.C7530j.TextAppearance_android_textSize
            r9 = -1
            int r5 = r6.mo2107c(r5, r9)
            if (r5 != 0) goto L_0x01c1
            android.widget.TextView r5 = r7.f1173a
            r9 = 0
            r16 = r3
            r3 = 0
            r5.setTextSize(r3, r9)
            goto L_0x01c3
        L_0x01c1:
            r16 = r3
        L_0x01c3:
            r7.m1018a(r2, r6)
            r6.mo2102a()
            if (r12 == 0) goto L_0x01d0
            android.widget.TextView r3 = r7.f1173a
            r3.setTextColor(r12)
        L_0x01d0:
            if (r10 == 0) goto L_0x01d7
            android.widget.TextView r3 = r7.f1173a
            r3.setHintTextColor(r10)
        L_0x01d7:
            if (r15 == 0) goto L_0x01de
            android.widget.TextView r3 = r7.f1173a
            r3.setLinkTextColor(r15)
        L_0x01de:
            if (r4 != 0) goto L_0x01e5
            if (r13 == 0) goto L_0x01e5
            r7.mo1930a(r14)
        L_0x01e5:
            android.graphics.Typeface r3 = r7.f1184l
            if (r3 == 0) goto L_0x01fb
            int r4 = r7.f1183k
            r5 = -1
            if (r4 != r5) goto L_0x01f6
            android.widget.TextView r4 = r7.f1173a
            int r5 = r7.f1182j
            r4.setTypeface(r3, r5)
            goto L_0x01fb
        L_0x01f6:
            android.widget.TextView r4 = r7.f1173a
            r4.setTypeface(r3)
        L_0x01fb:
            if (r11 == 0) goto L_0x0202
            android.widget.TextView r3 = r7.f1173a
            r3.setFontVariationSettings(r11)
        L_0x0202:
            if (r8 == 0) goto L_0x022c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0214
            android.widget.TextView r3 = r7.f1173a
            android.os.LocaleList r4 = android.os.LocaleList.forLanguageTags(r8)
            r3.setTextLocales(r4)
            goto L_0x022c
        L_0x0214:
            r4 = 21
            if (r3 < r4) goto L_0x022c
            r3 = 44
            int r3 = r8.indexOf(r3)
            r4 = 0
            java.lang.String r3 = r8.substring(r4, r3)
            android.widget.TextView r4 = r7.f1173a
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r4.setTextLocale(r3)
        L_0x022c:
            androidx.appcompat.widget.l r3 = r7.f1181i
            r3.mo1950a(r0, r1)
            boolean r1 = androidx.core.widget.AutoSizeableTextView.f2844a
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.l r1 = r7.f1181i
            int r1 = r1.mo1957f()
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.l r1 = r7.f1181i
            int[] r1 = r1.mo1956e()
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0272
            android.widget.TextView r3 = r7.f1173a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x026c
            android.widget.TextView r1 = r7.f1173a
            androidx.appcompat.widget.l r3 = r7.f1181i
            int r3 = r3.mo1954c()
            androidx.appcompat.widget.l r4 = r7.f1181i
            int r4 = r4.mo1952b()
            androidx.appcompat.widget.l r5 = r7.f1181i
            int r5 = r5.mo1955d()
            r6 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
            goto L_0x0272
        L_0x026c:
            r6 = 0
            android.widget.TextView r3 = r7.f1173a
            r3.setAutoSizeTextTypeUniformWithPresetSizes(r1, r6)
        L_0x0272:
            int[] r1 = p214e.p215a.C7530j.AppCompatTextView
            androidx.appcompat.widget.z r8 = androidx.appcompat.widget.C0291z.m1195a(r2, r0, r1)
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.mo2115g(r0, r1)
            r3 = r16
            if (r0 == r1) goto L_0x0289
            android.graphics.drawable.Drawable r0 = r3.mo1894a(r2, r0)
            r4 = r0
            goto L_0x028a
        L_0x0289:
            r4 = 0
        L_0x028a:
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo2115g(r0, r1)
            if (r0 == r1) goto L_0x0298
            android.graphics.drawable.Drawable r0 = r3.mo1894a(r2, r0)
            r5 = r0
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo2115g(r0, r1)
            if (r0 == r1) goto L_0x02a7
            android.graphics.drawable.Drawable r0 = r3.mo1894a(r2, r0)
            r6 = r0
            goto L_0x02a8
        L_0x02a7:
            r6 = 0
        L_0x02a8:
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo2115g(r0, r1)
            if (r0 == r1) goto L_0x02b6
            android.graphics.drawable.Drawable r0 = r3.mo1894a(r2, r0)
            r9 = r0
            goto L_0x02b7
        L_0x02b6:
            r9 = 0
        L_0x02b7:
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo2115g(r0, r1)
            if (r0 == r1) goto L_0x02c5
            android.graphics.drawable.Drawable r0 = r3.mo1894a(r2, r0)
            r10 = r0
            goto L_0x02c6
        L_0x02c5:
            r10 = 0
        L_0x02c6:
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo2115g(r0, r1)
            if (r0 == r1) goto L_0x02d4
            android.graphics.drawable.Drawable r0 = r3.mo1894a(r2, r0)
            r11 = r0
            goto L_0x02d5
        L_0x02d4:
            r11 = 0
        L_0x02d5:
            r0 = r18
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            r0.m1019a(r1, r2, r3, r4, r5, r6)
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableTint
            boolean r0 = r8.mo2116g(r0)
            if (r0 == 0) goto L_0x02f3
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r0 = r8.mo2100a(r0)
            android.widget.TextView r1 = r7.f1173a
            androidx.core.widget.C0680h.m3178a(r1, r0)
        L_0x02f3:
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableTintMode
            boolean r0 = r8.mo2116g(r0)
            if (r0 == 0) goto L_0x030d
            int r0 = p214e.p215a.C7530j.AppCompatTextView_drawableTintMode
            r1 = -1
            int r0 = r8.mo2109d(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0262m.m1078a(r0, r2)
            android.widget.TextView r2 = r7.f1173a
            androidx.core.widget.C0680h.m3179a(r2, r0)
            goto L_0x030e
        L_0x030d:
            r1 = -1
        L_0x030e:
            int r0 = p214e.p215a.C7530j.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo2107c(r0, r1)
            int r2 = p214e.p215a.C7530j.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.mo2107c(r2, r1)
            int r3 = p214e.p215a.C7530j.AppCompatTextView_lineHeight
            int r3 = r8.mo2107c(r3, r1)
            r8.mo2102a()
            if (r0 == r1) goto L_0x032a
            android.widget.TextView r4 = r7.f1173a
            androidx.core.widget.C0680h.m3177a(r4, r0)
        L_0x032a:
            if (r2 == r1) goto L_0x0331
            android.widget.TextView r0 = r7.f1173a
            androidx.core.widget.C0680h.m3185b(r0, r2)
        L_0x0331:
            if (r3 == r1) goto L_0x0338
            android.widget.TextView r0 = r7.f1173a
            androidx.core.widget.C0680h.m3187c(r0, r3)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0259k.mo1928a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1933b() {
        this.f1181i.mo1946a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1934c() {
        return this.f1181i.mo1952b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo1935d() {
        return this.f1181i.mo1954c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo1936e() {
        return this.f1181i.mo1955d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int[] mo1937f() {
        return this.f1181i.mo1956e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo1938g() {
        return this.f1181i.mo1957f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo1939h() {
        C0289x xVar = this.f1180h;
        if (xVar != null) {
            return xVar.f1308a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Mode mo1940i() {
        C0289x xVar = this.f1180h;
        if (xVar != null) {
            return xVar.f1309b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo1941j() {
        return this.f1181i.mo1958g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1942k() {
        mo1921a();
    }

    /* renamed from: b */
    private void m1021b(int i, float f) {
        this.f1181i.mo1948a(i, f);
    }

    /* renamed from: a */
    private void m1018a(Context context, C0291z zVar) {
        this.f1182j = zVar.mo2109d(C7530j.TextAppearance_android_textStyle, this.f1182j);
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            this.f1183k = zVar.mo2109d(C7530j.TextAppearance_android_textFontWeight, -1);
            if (this.f1183k != -1) {
                this.f1182j = (this.f1182j & 2) | 0;
            }
        }
        if (zVar.mo2116g(C7530j.TextAppearance_android_fontFamily) || zVar.mo2116g(C7530j.TextAppearance_fontFamily)) {
            this.f1184l = null;
            int i = zVar.mo2116g(C7530j.TextAppearance_fontFamily) ? C7530j.TextAppearance_fontFamily : C7530j.TextAppearance_android_fontFamily;
            int i2 = this.f1183k;
            int i3 = this.f1182j;
            if (!context.isRestricted()) {
                try {
                    Typeface a = zVar.mo2101a(i, this.f1182j, (C0555a) new C0260a(i2, i3, new WeakReference(this.f1173a)));
                    if (a != null) {
                        if (VERSION.SDK_INT < 28 || this.f1183k == -1) {
                            this.f1184l = a;
                        } else {
                            this.f1184l = Typeface.create(Typeface.create(a, 0), this.f1183k, (this.f1182j & 2) != 0);
                        }
                    }
                    this.f1185m = this.f1184l == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1184l == null) {
                String d = zVar.mo2110d(i);
                if (d != null) {
                    if (VERSION.SDK_INT < 28 || this.f1183k == -1) {
                        this.f1184l = Typeface.create(d, this.f1182j);
                    } else {
                        Typeface create = Typeface.create(d, 0);
                        int i4 = this.f1183k;
                        if ((this.f1182j & 2) != 0) {
                            z = true;
                        }
                        this.f1184l = Typeface.create(create, i4, z);
                    }
                }
            }
            return;
        }
        if (zVar.mo2116g(C7530j.TextAppearance_android_typeface)) {
            this.f1185m = false;
            int d2 = zVar.mo2109d(C7530j.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                this.f1184l = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                this.f1184l = Typeface.SERIF;
            } else if (d2 == 3) {
                this.f1184l = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1929a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1185m) {
            this.f1184l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1182j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1925a(Context context, int i) {
        C0291z a = C0291z.m1194a(context, i, C7530j.TextAppearance);
        if (a.mo2116g(C7530j.TextAppearance_textAllCaps)) {
            mo1930a(a.mo2103a(C7530j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo2116g(C7530j.TextAppearance_android_textColor)) {
            ColorStateList a2 = a.mo2100a(C7530j.TextAppearance_android_textColor);
            if (a2 != null) {
                this.f1173a.setTextColor(a2);
            }
        }
        if (a.mo2116g(C7530j.TextAppearance_android_textSize) && a.mo2107c(C7530j.TextAppearance_android_textSize, -1) == 0) {
            this.f1173a.setTextSize(0, 0.0f);
        }
        m1018a(context, a);
        if (VERSION.SDK_INT >= 26 && a.mo2116g(C7530j.TextAppearance_fontVariationSettings)) {
            String d = a.mo2110d(C7530j.TextAppearance_fontVariationSettings);
            if (d != null) {
                this.f1173a.setFontVariationSettings(d);
            }
        }
        a.mo2102a();
        Typeface typeface = this.f1184l;
        if (typeface != null) {
            this.f1173a.setTypeface(typeface, this.f1182j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1930a(boolean z) {
        this.f1173a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1921a() {
        if (!(this.f1174b == null && this.f1175c == null && this.f1176d == null && this.f1177e == null)) {
            Drawable[] compoundDrawables = this.f1173a.getCompoundDrawables();
            m1020a(compoundDrawables[0], this.f1174b);
            m1020a(compoundDrawables[1], this.f1175c);
            m1020a(compoundDrawables[2], this.f1176d);
            m1020a(compoundDrawables[3], this.f1177e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1178f != null || this.f1179g != null) {
            Drawable[] compoundDrawablesRelative = this.f1173a.getCompoundDrawablesRelative();
            m1020a(compoundDrawablesRelative[0], this.f1178f);
            m1020a(compoundDrawablesRelative[2], this.f1179g);
        }
    }

    /* renamed from: a */
    private void m1020a(Drawable drawable, C0289x xVar) {
        if (drawable != null && xVar != null) {
            C0250e.m968a(drawable, xVar, this.f1173a.getDrawableState());
        }
    }

    /* renamed from: a */
    private static C0289x m1017a(Context context, C0250e eVar, int i) {
        ColorStateList b = eVar.mo1897b(context, i);
        if (b == null) {
            return null;
        }
        C0289x xVar = new C0289x();
        xVar.f1311d = true;
        xVar.f1308a = b;
        return xVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1931a(boolean z, int i, int i2, int i3, int i4) {
        if (!AutoSizeableTextView.f2844a) {
            mo1933b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1923a(int i, float f) {
        if (!AutoSizeableTextView.f2844a && !mo1941j()) {
            m1021b(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1922a(int i) {
        this.f1181i.mo1953b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1924a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1181i.mo1949a(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1932a(int[] iArr, int i) throws IllegalArgumentException {
        this.f1181i.mo1951a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1926a(ColorStateList colorStateList) {
        if (this.f1180h == null) {
            this.f1180h = new C0289x();
        }
        C0289x xVar = this.f1180h;
        xVar.f1308a = colorStateList;
        xVar.f1311d = colorStateList != null;
        m1022l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1927a(Mode mode) {
        if (this.f1180h == null) {
            this.f1180h = new C0289x();
        }
        C0289x xVar = this.f1180h;
        xVar.f1309b = mode;
        xVar.f1310c = mode != null;
        m1022l();
    }

    /* renamed from: a */
    private void m1019a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1173a.getCompoundDrawablesRelative();
            TextView textView = this.f1173a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            if (VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1173a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1173a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1173a.getCompoundDrawables();
            TextView textView3 = this.f1173a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
}
