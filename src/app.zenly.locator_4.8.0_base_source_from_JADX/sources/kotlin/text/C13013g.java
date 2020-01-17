package kotlin.text;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.text.g */
public final class C13013g implements Serializable {

    /* renamed from: e */
    private final Pattern f33614e;

    /* renamed from: kotlin.text.g$a */
    public static final class C13014a {
        private C13014a() {
        }

        public /* synthetic */ C13014a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: kotlin.text.g$b */
    private static final class C13015b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final String f33615e;

        /* renamed from: f */
        private final int f33616f;

        /* renamed from: kotlin.text.g$b$a */
        public static final class C13016a {
            private C13016a() {
            }

            public /* synthetic */ C13016a(C12928f fVar) {
                this();
            }
        }

        static {
            new C13016a(null);
        }

        public C13015b(String str, int i) {
            C12932j.m33818b(str, "pattern");
            this.f33615e = str;
            this.f33616f = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f33615e, this.f33616f);
            C12932j.m33815a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C13013g(compile);
        }
    }

    static {
        new C13014a(null);
    }

    public C13013g(Pattern pattern) {
        C12932j.m33818b(pattern, "nativePattern");
        this.f33614e = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f33614e.pattern();
        C12932j.m33815a((Object) pattern, "nativePattern.pattern()");
        return new C13015b(pattern, this.f33614e.flags());
    }

    /* renamed from: a */
    public final boolean mo37411a(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "input");
        return this.f33614e.matcher(charSequence).matches();
    }

    public String toString() {
        String pattern = this.f33614e.toString();
        C12932j.m33815a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    public C13013g(String str) {
        C12932j.m33818b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C12932j.m33815a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    /* renamed from: a */
    public static /* synthetic */ MatchResult m33960a(C13013g gVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return gVar.mo37410a(charSequence, i);
    }

    /* renamed from: a */
    public final MatchResult mo37410a(CharSequence charSequence, int i) {
        C12932j.m33818b(charSequence, "input");
        Matcher matcher = this.f33614e.matcher(charSequence);
        C12932j.m33815a((Object) matcher, "nativePattern.matcher(input)");
        return C13017h.m33969b(matcher, i, charSequence);
    }

    /* renamed from: a */
    public final String mo37409a(CharSequence charSequence, String str) {
        C12932j.m33818b(charSequence, "input");
        C12932j.m33818b(str, "replacement");
        String replaceAll = this.f33614e.matcher(charSequence).replaceAll(str);
        C12932j.m33815a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }
}
