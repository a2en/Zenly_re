package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.sequences.j */
class C12990j extends C12989i {

    /* renamed from: kotlin.sequences.j$a */
    public static final class C12991a implements Iterable<T>, KMappedMarker {

        /* renamed from: e */
        final /* synthetic */ Sequence f33585e;

        public C12991a(Sequence sequence) {
            this.f33585e = sequence;
        }

        public Iterator<T> iterator() {
            return this.f33585e.iterator();
        }
    }

    /* renamed from: kotlin.sequences.j$b */
    static final class C12992b extends C12933k implements Function1<T, Boolean> {

        /* renamed from: f */
        public static final C12992b f33586f = new C12992b();

        C12992b() {
            super(1);
        }

        public final boolean invoke(T t) {
            return t == null;
        }
    }

    /* renamed from: kotlin.sequences.j$c */
    public static final class C12993c implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Sequence f33587a;

        C12993c(Sequence<? extends T> sequence) {
            this.f33587a = sequence;
        }

        public Iterator<T> iterator() {
            List h = C12990j.m33936h(this.f33587a);
            C12853s.m33650c(h);
            return h.iterator();
        }
    }

    /* renamed from: kotlin.sequences.j$d */
    public static final class C12994d implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Sequence f33588a;

        /* renamed from: b */
        final /* synthetic */ Comparator f33589b;

        C12994d(Sequence<? extends T> sequence, Comparator comparator) {
            this.f33588a = sequence;
            this.f33589b = comparator;
        }

        public Iterator<T> iterator() {
            List h = C12990j.m33936h(this.f33588a);
            C12853s.m33649a(h, this.f33589b);
            return h.iterator();
        }
    }

    /* renamed from: a */
    public static <T> Sequence<T> m33926a(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        C12932j.m33818b(sequence, "$this$filter");
        C12932j.m33818b(function1, "predicate");
        return new C12979b(sequence, true, function1);
    }

    /* renamed from: b */
    public static <T> Sequence<T> m33928b(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        C12932j.m33818b(sequence, "$this$filterNot");
        C12932j.m33818b(function1, "predicate");
        return new C12979b(sequence, false, function1);
    }

    /* renamed from: c */
    public static final <T> Sequence<T> m33929c(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$filterNotNull");
        Sequence<T> b = m33928b(sequence, C12992b.f33586f);
        if (b != null) {
            return b;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<T>");
    }

    /* renamed from: d */
    public static <T> T m33931d(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$first");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: e */
    public static <T> T m33933e(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$firstOrNull");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: f */
    public static <T extends Comparable<? super T>> Sequence<T> m33934f(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$sorted");
        return new C12993c(sequence);
    }

    /* renamed from: g */
    public static <T> List<T> m33935g(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$toList");
        return C12848o.m33642b(m33936h(sequence));
    }

    /* renamed from: h */
    public static final <T> List<T> m33936h(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        m33924a(sequence, (C) arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static <T> Sequence<T> m33925a(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
        C12932j.m33818b(sequence, "$this$sortedWith");
        C12932j.m33818b(comparator, "comparator");
        return new C12994d(sequence, comparator);
    }

    /* renamed from: b */
    public static <T> Iterable<T> m33927b(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$asIterable");
        return new C12991a(sequence);
    }

    /* renamed from: c */
    public static <T, R> Sequence<R> m33930c(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        C12932j.m33818b(sequence, "$this$map");
        C12932j.m33818b(function1, "transform");
        return new C12995k(sequence, function1);
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m33924a(Sequence<? extends T> sequence, C c) {
        C12932j.m33818b(sequence, "$this$toCollection");
        C12932j.m33818b(c, "destination");
        for (Object add : sequence) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m33921a(Sequence<? extends T> sequence, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12932j.m33818b(sequence, "$this$joinTo");
        C12932j.m33818b(a, "buffer");
        C12932j.m33818b(charSequence, "separator");
        C12932j.m33818b(charSequence2, "prefix");
        C12932j.m33818b(charSequence3, "postfix");
        C12932j.m33818b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : sequence) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C13025n.m33993a(a, next, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: d */
    public static <T, R> Sequence<R> m33932d(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        C12932j.m33818b(sequence, "$this$mapNotNull");
        C12932j.m33818b(function1, "transform");
        return m33929c(new C12995k(sequence, function1));
    }

    /* renamed from: a */
    public static /* synthetic */ String m33923a(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m33922a(sequence, charSequence, charSequence6, charSequence5, i3, charSequence7, function1);
    }

    /* renamed from: a */
    public static final <T> String m33922a(Sequence<? extends T> sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12932j.m33818b(sequence, "$this$joinToString");
        C12932j.m33818b(charSequence, "separator");
        C12932j.m33818b(charSequence2, "prefix");
        C12932j.m33818b(charSequence3, "postfix");
        C12932j.m33818b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m33921a(sequence, sb, charSequence, charSequence2, charSequence3, i, charSequence4, function1);
        String sb2 = sb.toString();
        C12932j.m33815a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }
}
