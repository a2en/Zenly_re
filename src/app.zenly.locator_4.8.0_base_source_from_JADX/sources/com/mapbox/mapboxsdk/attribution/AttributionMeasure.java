package com.mapbox.mapboxsdk.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

public class AttributionMeasure {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Bitmap f29587a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bitmap f29588b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Bitmap f29589c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f29590d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f29591e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f29592f;

    /* renamed from: g */
    private boolean f29593g;

    public interface Command {
        C11442b execute(AttributionMeasure attributionMeasure);
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$b */
    public static class C11432b {

        /* renamed from: a */
        private Bitmap f29594a;

        /* renamed from: b */
        private Bitmap f29595b;

        /* renamed from: c */
        private Bitmap f29596c;

        /* renamed from: d */
        private TextView f29597d;

        /* renamed from: e */
        private TextView f29598e;

        /* renamed from: f */
        private float f29599f;

        /* renamed from: a */
        public C11432b mo33288a(Bitmap bitmap) {
            this.f29595b = bitmap;
            return this;
        }

        /* renamed from: b */
        public C11432b mo33291b(Bitmap bitmap) {
            this.f29596c = bitmap;
            return this;
        }

        /* renamed from: c */
        public C11432b mo33293c(Bitmap bitmap) {
            this.f29594a = bitmap;
            return this;
        }

        /* renamed from: a */
        public C11432b mo33289a(TextView textView) {
            this.f29597d = textView;
            return this;
        }

        /* renamed from: b */
        public C11432b mo33292b(TextView textView) {
            this.f29598e = textView;
            return this;
        }

        /* renamed from: a */
        public C11432b mo33287a(float f) {
            this.f29599f = f;
            return this;
        }

        /* renamed from: a */
        public AttributionMeasure mo33290a() {
            AttributionMeasure attributionMeasure = new AttributionMeasure(this.f29594a, this.f29595b, this.f29596c, this.f29597d, this.f29598e, this.f29599f);
            return attributionMeasure;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$c */
    private class C11433c {

        /* renamed from: a */
        public List<Command> f29600a;

        C11433c(AttributionMeasure attributionMeasure, Command... commandArr) {
            this.f29600a = Arrays.asList(commandArr);
        }

        /* renamed from: a */
        public C11442b mo33294a(AttributionMeasure attributionMeasure) {
            C11442b bVar = null;
            for (Command execute : this.f29600a) {
                bVar = execute.execute(attributionMeasure);
                if (bVar != null) {
                    break;
                }
            }
            return bVar;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$d */
    private static class C11434d implements Command {
        private C11434d() {
        }

        public C11442b execute(AttributionMeasure attributionMeasure) {
            if (!(attributionMeasure.m29498c() + attributionMeasure.m29506g() <= attributionMeasure.m29502e())) {
                return null;
            }
            return new C11442b(attributionMeasure.f29587a, AttributionMeasure.m29496b(attributionMeasure.f29589c, attributionMeasure.f29590d, attributionMeasure.f29592f), false);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$e */
    private static class C11435e implements Command {
        private C11435e() {
        }

        public C11442b execute(AttributionMeasure attributionMeasure) {
            if (!(attributionMeasure.m29498c() + attributionMeasure.m29508h() <= attributionMeasure.m29504f())) {
                return null;
            }
            return new C11442b(attributionMeasure.f29587a, AttributionMeasure.m29496b(attributionMeasure.f29589c, attributionMeasure.f29591e, attributionMeasure.f29592f), true);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$f */
    private static class C11436f implements Command {
        private C11436f() {
        }

        public C11442b execute(AttributionMeasure attributionMeasure) {
            if (attributionMeasure.m29506g() + attributionMeasure.f29592f <= attributionMeasure.m29502e()) {
                return new C11442b(null, AttributionMeasure.m29496b(attributionMeasure.f29589c, attributionMeasure.f29590d, attributionMeasure.f29592f), false);
            }
            return null;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$g */
    private static class C11437g implements Command {
        private C11437g() {
        }

        public C11442b execute(AttributionMeasure attributionMeasure) {
            return new C11442b(null, null, false);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$h */
    private static class C11438h implements Command {
        private C11438h() {
        }

        public C11442b execute(AttributionMeasure attributionMeasure) {
            if (attributionMeasure.m29508h() + attributionMeasure.f29592f <= attributionMeasure.m29504f()) {
                return new C11442b(null, AttributionMeasure.m29496b(attributionMeasure.f29589c, attributionMeasure.f29591e, attributionMeasure.f29592f), true);
            }
            return null;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$i */
    private static class C11439i implements Command {
        private C11439i() {
        }

        public C11442b execute(AttributionMeasure attributionMeasure) {
            if (!(attributionMeasure.m29500d() + attributionMeasure.m29506g() <= attributionMeasure.m29502e())) {
                return null;
            }
            return new C11442b(attributionMeasure.f29588b, AttributionMeasure.m29496b(attributionMeasure.f29589c, attributionMeasure.f29590d, attributionMeasure.f29592f), false);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.attribution.AttributionMeasure$j */
    private static class C11440j implements Command {
        private C11440j() {
        }

        public C11442b execute(AttributionMeasure attributionMeasure) {
            if (!(attributionMeasure.m29498c() + attributionMeasure.m29508h() <= attributionMeasure.m29504f())) {
                return null;
            }
            return new C11442b(attributionMeasure.f29588b, AttributionMeasure.m29496b(attributionMeasure.f29589c, attributionMeasure.f29591e, attributionMeasure.f29592f), true);
        }
    }

    AttributionMeasure(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, TextView textView, TextView textView2, float f) {
        this.f29589c = bitmap;
        this.f29587a = bitmap2;
        this.f29588b = bitmap3;
        this.f29590d = textView;
        this.f29591e = textView2;
        this.f29592f = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public float m29498c() {
        return ((float) this.f29587a.getWidth()) + (this.f29592f * 2.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public float m29500d() {
        return ((float) this.f29588b.getWidth()) + (this.f29592f * 2.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public float m29502e() {
        return (float) ((this.f29589c.getWidth() * 8) / 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public float m29504f() {
        return (float) this.f29589c.getWidth();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public float m29506g() {
        return ((float) this.f29590d.getMeasuredWidth()) + this.f29592f;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public float m29508h() {
        return ((float) this.f29591e.getMeasuredWidth()) + this.f29592f;
    }

    /* renamed from: b */
    public C11442b mo33285b() {
        C11442b a = new C11433c(this, new C11434d(), new C11435e(), new C11439i(), new C11440j(), new C11436f(), new C11438h(), new C11437g()).mo33294a(this);
        this.f29593g = a.mo33302c();
        return a;
    }

    /* renamed from: a */
    public TextView mo33284a() {
        return this.f29593g ? this.f29591e : this.f29590d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static PointF m29496b(Bitmap bitmap, TextView textView, float f) {
        return new PointF(((float) (bitmap.getWidth() - textView.getMeasuredWidth())) - f, (((float) bitmap.getHeight()) - f) - ((float) textView.getMeasuredHeight()));
    }
}
