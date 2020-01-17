package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.common.base.e */
public class C10842e {

    /* renamed from: a */
    private final String f28384a;

    /* renamed from: com.google.common.base.e$a */
    class C10843a extends C10842e {

        /* renamed from: b */
        final /* synthetic */ String f28385b;

        C10843a(C10842e eVar, String str) {
            this.f28385b = str;
            super(eVar, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence mo31468a(Object obj) {
            return obj == null ? this.f28385b : C10842e.this.mo31468a(obj);
        }

        /* renamed from: a */
        public C10842e mo31466a(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* synthetic */ C10842e(C10842e eVar, C10843a aVar) {
        this(eVar);
    }

    /* renamed from: b */
    public static C10842e m27982b(String str) {
        return new C10842e(str);
    }

    /* renamed from: a */
    public <A extends Appendable> A mo31467a(A a, Iterator<?> it) throws IOException {
        C10850i.m28004a(a);
        if (it.hasNext()) {
            a.append(mo31468a(it.next()));
            while (it.hasNext()) {
                a.append(this.f28384a);
                a.append(mo31468a(it.next()));
            }
        }
        return a;
    }

    private C10842e(String str) {
        C10850i.m28004a(str);
        this.f28384a = str;
    }

    private C10842e(C10842e eVar) {
        this.f28384a = eVar.f28384a;
    }

    /* renamed from: a */
    public final StringBuilder mo31471a(StringBuilder sb, Iterator<?> it) {
        try {
            mo31467a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final String mo31469a(Iterable<?> iterable) {
        return mo31470a(iterable.iterator());
    }

    /* renamed from: a */
    public final String mo31470a(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        mo31471a(sb, it);
        return sb.toString();
    }

    /* renamed from: a */
    public C10842e mo31466a(String str) {
        C10850i.m28004a(str);
        return new C10843a(this, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo31468a(Object obj) {
        C10850i.m28004a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
