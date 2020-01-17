package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.C12815a;
import kotlin.collections.C12822d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.p411u.C13038b;
import kotlin.ranges.C12963e;
import kotlin.text.MatchResult.C13001a;
import kotlin.text.MatchResult.C13002b;

/* renamed from: kotlin.text.f */
final class C13009f implements MatchResult {

    /* renamed from: a */
    private final MatchGroupCollection f33607a = new C13011b(this);

    /* renamed from: b */
    private List<String> f33608b;

    /* renamed from: c */
    private final Matcher f33609c;

    /* renamed from: d */
    private final CharSequence f33610d;

    /* renamed from: kotlin.text.f$a */
    public static final class C13010a extends C12822d<String> {

        /* renamed from: f */
        final /* synthetic */ C13009f f33611f;

        C13010a(C13009f fVar) {
            this.f33611f = fVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo37403a(String str) {
            return super.contains(str);
        }

        /* renamed from: b */
        public /* bridge */ int mo37404b(String str) {
            return super.indexOf(str);
        }

        /* renamed from: c */
        public /* bridge */ int mo37405c(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return mo37403a((String) obj);
            }
            return false;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return mo37404b((String) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return mo37405c((String) obj);
            }
            return -1;
        }

        /* renamed from: a */
        public int mo36999a() {
            return this.f33611f.m33951a().groupCount() + 1;
        }

        public String get(int i) {
            String group = this.f33611f.m33951a().group(i);
            return group != null ? group : "";
        }
    }

    /* renamed from: kotlin.text.f$b */
    public static final class C13011b extends C12815a<C13008e> implements MatchNamedGroupCollection {

        /* renamed from: e */
        final /* synthetic */ C13009f f33612e;

        /* renamed from: kotlin.text.f$b$a */
        static final class C13012a extends C12933k implements Function1<Integer, C13008e> {

            /* renamed from: f */
            final /* synthetic */ C13011b f33613f;

            C13012a(C13011b bVar) {
                this.f33613f = bVar;
                super(1);
            }

            /* renamed from: a */
            public final C13008e mo37408a(int i) {
                return this.f33613f.get(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo37408a(((Number) obj).intValue());
            }
        }

        C13011b(C13009f fVar) {
            this.f33612e = fVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo37406a(C13008e eVar) {
            return super.contains(eVar);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof C13008e : true) {
                return mo37406a((C13008e) obj);
            }
            return false;
        }

        public C13008e get(int i) {
            C12963e a = C13017h.m33968b(this.f33612e.m33951a(), i);
            if (a.getStart().intValue() < 0) {
                return null;
            }
            String group = this.f33612e.m33951a().group(i);
            C12932j.m33815a((Object) group, "matchResult.group(index)");
            return new C13008e(group, a);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<C13008e> iterator() {
            return C12990j.m33930c(C12857w.m33671b((Iterable<? extends T>) C12848o.m33641a((Collection<?>) this)), new C13012a(this)).iterator();
        }

        /* renamed from: a */
        public int mo36999a() {
            return this.f33612e.m33951a().groupCount() + 1;
        }

        public C13008e get(String str) {
            C12932j.m33818b(str, "name");
            C13038b.f33624a.mo37418a(this.f33612e.m33951a(), str);
            throw null;
        }
    }

    public C13009f(Matcher matcher, CharSequence charSequence) {
        C12932j.m33818b(matcher, "matcher");
        C12932j.m33818b(charSequence, "input");
        this.f33609c = matcher;
        this.f33610d = charSequence;
    }

    public C13002b getDestructured() {
        return C13001a.m33941a(this);
    }

    public List<String> getGroupValues() {
        if (this.f33608b == null) {
            this.f33608b = new C13010a(this);
        }
        List<String> list = this.f33608b;
        if (list != null) {
            return list;
        }
        C12932j.m33814a();
        throw null;
    }

    public MatchGroupCollection getGroups() {
        return this.f33607a;
    }

    public C12963e getRange() {
        return C13017h.m33967b(m33951a());
    }

    public String getValue() {
        String group = m33951a().group();
        C12932j.m33815a((Object) group, "matchResult.group()");
        return group;
    }

    public MatchResult next() {
        int end = m33951a().end() + (m33951a().end() == m33951a().start() ? 1 : 0);
        if (end > this.f33610d.length()) {
            return null;
        }
        Matcher matcher = this.f33609c.pattern().matcher(this.f33610d);
        C12932j.m33815a((Object) matcher, "matcher.pattern().matcher(input)");
        return C13017h.m33969b(matcher, end, this.f33610d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MatchResult m33951a() {
        return this.f33609c;
    }
}
