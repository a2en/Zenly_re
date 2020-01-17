package p250f.p251a.p252a.p253a.p260i;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import java.util.ArrayDeque;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.i.b */
public final class C7685b {

    /* renamed from: a */
    private final SpannableStringBuilder f19311a = new SpannableStringBuilder();

    /* renamed from: b */
    private final ArrayDeque<C7686a> f19312b = new ArrayDeque<>();

    /* renamed from: f.a.a.a.i.b$a */
    private static final class C7686a {

        /* renamed from: a */
        private final int f19313a;

        /* renamed from: b */
        private final Object f19314b;

        public C7686a(int i, Object obj) {
            C12932j.m33818b(obj, "span");
            this.f19313a = i;
            this.f19314b = obj;
        }

        /* renamed from: a */
        public final Object mo19901a() {
            return this.f19314b;
        }

        /* renamed from: b */
        public final int mo19902b() {
            return this.f19313a;
        }
    }

    /* renamed from: a */
    public final C7685b mo19896a(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "sequence");
        this.f19311a.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final C7685b mo19898b() {
        this.f19311a.clear();
        this.f19311a.clearSpans();
        this.f19312b.clear();
        return this;
    }

    /* renamed from: c */
    public final C7685b mo19899c() {
        C7686a aVar = (C7686a) this.f19312b.removeLast();
        this.f19311a.setSpan(aVar.mo19901a(), aVar.mo19902b(), this.f19311a.length(), 17);
        return this;
    }

    /* renamed from: d */
    public final int mo19900d() {
        return this.f19311a.length();
    }

    /* renamed from: a */
    public final C7685b mo19894a(char c) {
        this.f19311a.append(c);
        return this;
    }

    /* renamed from: a */
    public final C7685b mo19895a(int i) {
        this.f19311a.append(String.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public final C7685b mo19897a(Object obj) {
        C12932j.m33818b(obj, "span");
        this.f19312b.addLast(new C7686a(this.f19311a.length(), obj));
        return this;
    }

    /* renamed from: a */
    public final Spanned mo19893a() {
        while (!this.f19312b.isEmpty()) {
            mo19899c();
        }
        return new SpannedString(this.f19311a);
    }
}
