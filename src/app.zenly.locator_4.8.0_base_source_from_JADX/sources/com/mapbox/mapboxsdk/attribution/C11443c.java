package com.mapbox.mapboxsdk.attribution;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.mapbox.mapboxsdk.C11469k;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.mapbox.mapboxsdk.attribution.c */
public class C11443c {

    /* renamed from: a */
    private final WeakReference<Context> f29607a;

    /* renamed from: b */
    private final Set<C11441a> f29608b = new LinkedHashSet();

    /* renamed from: c */
    private final String f29609c;

    /* renamed from: d */
    private final boolean f29610d;

    /* renamed from: e */
    private final boolean f29611e;

    /* renamed from: f */
    private final boolean f29612f;

    /* renamed from: g */
    private final boolean f29613g;

    /* renamed from: com.mapbox.mapboxsdk.attribution.c$a */
    public static class C11444a {

        /* renamed from: a */
        private final WeakReference<Context> f29614a;

        /* renamed from: b */
        private boolean f29615b = true;

        /* renamed from: c */
        private boolean f29616c = true;

        /* renamed from: d */
        private boolean f29617d = false;

        /* renamed from: e */
        private boolean f29618e = true;

        /* renamed from: f */
        private String[] f29619f;

        public C11444a(Context context) {
            this.f29614a = new WeakReference<>(context);
        }

        /* renamed from: a */
        public C11444a mo33310a(String... strArr) {
            this.f29619f = strArr;
            return this;
        }

        /* renamed from: b */
        public C11444a mo33312b(boolean z) {
            this.f29615b = z;
            return this;
        }

        /* renamed from: c */
        public C11444a mo33313c(boolean z) {
            this.f29617d = z;
            return this;
        }

        /* renamed from: b */
        private String m29544b(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (!str.isEmpty()) {
                    sb.append(str);
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C11444a mo33309a(boolean z) {
            this.f29616c = z;
            return this;
        }

        /* renamed from: a */
        public C11443c mo33311a() {
            String[] strArr = this.f29619f;
            if (strArr != null) {
                C11443c cVar = new C11443c(this.f29614a, m29544b(strArr), this.f29615b, this.f29616c, this.f29617d, this.f29618e);
                cVar.mo33308b();
                return cVar;
            }
            throw new IllegalStateException("Using builder without providing attribution data");
        }
    }

    C11443c(WeakReference<Context> weakReference, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f29607a = weakReference;
        this.f29609c = str;
        this.f29610d = z;
        this.f29611e = z2;
        this.f29612f = z3;
        this.f29613g = z4;
    }

    /* renamed from: c */
    private boolean m29535c(String str) {
        return m29537d(str) && m29538e(str);
    }

    /* renamed from: d */
    private void m29536d() {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m29530a(this.f29609c);
        for (URLSpan b : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            m29532b(spannableStringBuilder, b);
        }
    }

    /* renamed from: e */
    private boolean m29538e(String str) {
        return this.f29613g || !str.equals("https://www.mapbox.com/about/maps/");
    }

    /* renamed from: f */
    private String m29539f(String str) {
        return (this.f29611e || !str.startsWith("© ")) ? str : str.substring(2, str.length());
    }

    /* renamed from: g */
    private String m29540g(String str) {
        Context context = (Context) this.f29607a.get();
        return context != null ? context.getString(C11469k.mapbox_telemetryImproveMap) : str;
    }

    /* renamed from: a */
    public Set<C11441a> mo33307a() {
        return this.f29608b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33308b() {
        m29536d();
        m29534c();
    }

    /* renamed from: c */
    private void m29534c() {
        if (this.f29612f) {
            Context context = (Context) this.f29607a.get();
            this.f29608b.add(new C11441a(context != null ? context.getString(C11469k.mapbox_telemetrySettings) : "Telemetry Settings", "https://www.mapbox.com/telemetry/"));
        }
    }

    /* renamed from: a */
    public String mo33306a(boolean z) {
        StringBuilder sb = new StringBuilder(this.f29611e ? "" : "© ");
        int i = 0;
        for (C11441a aVar : this.f29608b) {
            i++;
            sb.append(!z ? aVar.mo33295a() : aVar.mo33296b());
            if (i != this.f29608b.size()) {
                sb.append(" / ");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private void m29532b(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        String url = uRLSpan.getURL();
        if (m29535c(url)) {
            String a = m29531a(spannableStringBuilder, uRLSpan);
            if (m29533b(a)) {
                a = m29540g(a);
            }
            this.f29608b.add(new C11441a(a, url));
        }
    }

    /* renamed from: d */
    private boolean m29537d(String str) {
        return this.f29610d || !C11441a.f29601c.contains(str);
    }

    /* renamed from: a */
    private String m29531a(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        char[] cArr = new char[(spanEnd - spanStart)];
        spannableStringBuilder.getChars(spanStart, spanEnd, cArr, 0);
        return m29539f(String.valueOf(cArr));
    }

    /* renamed from: b */
    private boolean m29533b(String str) {
        return str.equals("Improve this map");
    }

    /* renamed from: a */
    private static Spanned m29530a(String str) {
        if (VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }
}
