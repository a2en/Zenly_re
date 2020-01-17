package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.p004os.C0563a;
import androidx.core.util.C0602d;

/* renamed from: androidx.core.text.d */
public class C0588d implements Spannable {

    /* renamed from: e */
    private final Spannable f2703e;

    /* renamed from: f */
    private final C0589a f2704f;

    /* renamed from: g */
    private final PrecomputedText f2705g;

    /* renamed from: androidx.core.text.d$a */
    public static final class C0589a {

        /* renamed from: a */
        private final TextPaint f2706a;

        /* renamed from: b */
        private final TextDirectionHeuristic f2707b;

        /* renamed from: c */
        private final int f2708c;

        /* renamed from: d */
        private final int f2709d;

        /* renamed from: androidx.core.text.d$a$a */
        public static class C0590a {

            /* renamed from: a */
            private final TextPaint f2710a;

            /* renamed from: b */
            private TextDirectionHeuristic f2711b;

            /* renamed from: c */
            private int f2712c;

            /* renamed from: d */
            private int f2713d;

            public C0590a(TextPaint textPaint) {
                this.f2710a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f2712c = 1;
                    this.f2713d = 1;
                } else {
                    this.f2713d = 0;
                    this.f2712c = 0;
                }
                if (VERSION.SDK_INT >= 18) {
                    this.f2711b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f2711b = null;
                }
            }

            /* renamed from: a */
            public C0590a mo3232a(int i) {
                this.f2712c = i;
                return this;
            }

            /* renamed from: b */
            public C0590a mo3235b(int i) {
                this.f2713d = i;
                return this;
            }

            /* renamed from: a */
            public C0590a mo3233a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2711b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C0589a mo3234a() {
                return new C0589a(this.f2710a, this.f2711b, this.f2712c, this.f2713d);
            }
        }

        @SuppressLint({"NewApi"})
        C0589a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (C0563a.m2669a()) {
                new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f2706a = textPaint;
            this.f2707b = textDirectionHeuristic;
            this.f2708c = i;
            this.f2709d = i2;
        }

        /* renamed from: a */
        public int mo3224a() {
            return this.f2708c;
        }

        /* renamed from: b */
        public int mo3226b() {
            return this.f2709d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic mo3227c() {
            return this.f2707b;
        }

        /* renamed from: d */
        public TextPaint mo3228d() {
            return this.f2706a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0589a)) {
                return false;
            }
            C0589a aVar = (C0589a) obj;
            if (!mo3225a(aVar)) {
                return false;
            }
            return VERSION.SDK_INT < 18 || this.f2707b == aVar.mo3227c();
        }

        public int hashCode() {
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                return C0602d.m2767a(Float.valueOf(this.f2706a.getTextSize()), Float.valueOf(this.f2706a.getTextScaleX()), Float.valueOf(this.f2706a.getTextSkewX()), Float.valueOf(this.f2706a.getLetterSpacing()), Integer.valueOf(this.f2706a.getFlags()), this.f2706a.getTextLocales(), this.f2706a.getTypeface(), Boolean.valueOf(this.f2706a.isElegantTextHeight()), this.f2707b, Integer.valueOf(this.f2708c), Integer.valueOf(this.f2709d));
            } else if (i >= 21) {
                return C0602d.m2767a(Float.valueOf(this.f2706a.getTextSize()), Float.valueOf(this.f2706a.getTextScaleX()), Float.valueOf(this.f2706a.getTextSkewX()), Float.valueOf(this.f2706a.getLetterSpacing()), Integer.valueOf(this.f2706a.getFlags()), this.f2706a.getTextLocale(), this.f2706a.getTypeface(), Boolean.valueOf(this.f2706a.isElegantTextHeight()), this.f2707b, Integer.valueOf(this.f2708c), Integer.valueOf(this.f2709d));
            } else if (i >= 18) {
                return C0602d.m2767a(Float.valueOf(this.f2706a.getTextSize()), Float.valueOf(this.f2706a.getTextScaleX()), Float.valueOf(this.f2706a.getTextSkewX()), Integer.valueOf(this.f2706a.getFlags()), this.f2706a.getTextLocale(), this.f2706a.getTypeface(), this.f2707b, Integer.valueOf(this.f2708c), Integer.valueOf(this.f2709d));
            } else if (i >= 17) {
                return C0602d.m2767a(Float.valueOf(this.f2706a.getTextSize()), Float.valueOf(this.f2706a.getTextScaleX()), Float.valueOf(this.f2706a.getTextSkewX()), Integer.valueOf(this.f2706a.getFlags()), this.f2706a.getTextLocale(), this.f2706a.getTypeface(), this.f2707b, Integer.valueOf(this.f2708c), Integer.valueOf(this.f2709d));
            } else {
                return C0602d.m2767a(Float.valueOf(this.f2706a.getTextSize()), Float.valueOf(this.f2706a.getTextScaleX()), Float.valueOf(this.f2706a.getTextSkewX()), Integer.valueOf(this.f2706a.getFlags()), this.f2706a.getTypeface(), this.f2707b, Integer.valueOf(this.f2708c), Integer.valueOf(this.f2709d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(this.f2706a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.f2706a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.f2706a.getTextSkewX());
            sb.append(sb4.toString());
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(", letterSpacing=");
                sb5.append(this.f2706a.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(", elegantTextHeight=");
                sb6.append(this.f2706a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            int i = VERSION.SDK_INT;
            String str = ", textLocale=";
            if (i >= 24) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(this.f2706a.getTextLocales());
                sb.append(sb7.toString());
            } else if (i >= 17) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(this.f2706a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(", typeface=");
            sb9.append(this.f2706a.getTypeface());
            sb.append(sb9.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(", variationSettings=");
                sb10.append(this.f2706a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(", textDir=");
            sb11.append(this.f2707b);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(", breakStrategy=");
            sb12.append(this.f2708c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(", hyphenationFrequency=");
            sb13.append(this.f2709d);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: a */
        public boolean mo3225a(C0589a aVar) {
            if ((VERSION.SDK_INT >= 23 && (this.f2708c != aVar.mo3224a() || this.f2709d != aVar.mo3226b())) || this.f2706a.getTextSize() != aVar.mo3228d().getTextSize() || this.f2706a.getTextScaleX() != aVar.mo3228d().getTextScaleX() || this.f2706a.getTextSkewX() != aVar.mo3228d().getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f2706a.getLetterSpacing() != aVar.mo3228d().getLetterSpacing() || !TextUtils.equals(this.f2706a.getFontFeatureSettings(), aVar.mo3228d().getFontFeatureSettings()))) || this.f2706a.getFlags() != aVar.mo3228d().getFlags()) {
                return false;
            }
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f2706a.getTextLocales().equals(aVar.mo3228d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f2706a.getTextLocale().equals(aVar.mo3228d().getTextLocale())) {
                return false;
            }
            if (this.f2706a.getTypeface() == null) {
                if (aVar.mo3228d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f2706a.getTypeface().equals(aVar.mo3228d().getTypeface())) {
                return false;
            }
            return true;
        }

        public C0589a(Params params) {
            this.f2706a = params.getTextPaint();
            this.f2707b = params.getTextDirection();
            this.f2708c = params.getBreakStrategy();
            this.f2709d = params.getHyphenationFrequency();
            boolean a = C0563a.m2669a();
        }
    }

    /* renamed from: a */
    public C0589a mo3211a() {
        return this.f2704f;
    }

    /* renamed from: b */
    public PrecomputedText mo3212b() {
        Spannable spannable = this.f2703e;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f2703e.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f2703e.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2703e.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2703e.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (C0563a.m2669a()) {
            return this.f2705g.getSpans(i, i2, cls);
        }
        return this.f2703e.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2703e.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2703e.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (C0563a.m2669a()) {
            this.f2705g.removeSpan(obj);
        } else {
            this.f2703e.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (C0563a.m2669a()) {
            this.f2705g.setSpan(obj, i, i2, i3);
        } else {
            this.f2703e.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2703e.subSequence(i, i2);
    }

    public String toString() {
        return this.f2703e.toString();
    }
}
