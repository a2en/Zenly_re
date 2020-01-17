package androidx.emoji.widget;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C0607i;
import androidx.emoji.text.C0745c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji.widget.h */
public final class C0770h extends SpannableStringBuilder {

    /* renamed from: e */
    private final Class<?> f3130e;

    /* renamed from: f */
    private final List<C0771a> f3131f = new ArrayList();

    /* renamed from: androidx.emoji.widget.h$a */
    private static class C0771a implements TextWatcher, SpanWatcher {

        /* renamed from: e */
        final Object f3132e;

        /* renamed from: f */
        private final AtomicInteger f3133f = new AtomicInteger(0);

        C0771a(Object obj) {
            this.f3132e = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3808a() {
            this.f3133f.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3132e).afterTextChanged(editable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3810b() {
            this.f3133f.decrementAndGet();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3132e).beforeTextChanged(charSequence, i, i2, i3);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3133f.get() <= 0 || !m3562a(obj)) {
                ((SpanWatcher) this.f3132e).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f3133f.get() <= 0 || !m3562a(obj)) {
                ((SpanWatcher) this.f3132e).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3133f.get() <= 0 || !m3562a(obj)) {
                ((SpanWatcher) this.f3132e).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3132e).onTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: a */
        private boolean m3562a(Object obj) {
            return obj instanceof C0745c;
        }
    }

    C0770h(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C0607i.m2774a(cls, (Object) "watcherClass cannot be null");
        this.f3130e = cls;
    }

    /* renamed from: a */
    static C0770h m3554a(Class<?> cls, CharSequence charSequence) {
        return new C0770h(cls, charSequence);
    }

    /* renamed from: b */
    private boolean m3556b(Object obj) {
        return obj != null && m3555a(obj.getClass());
    }

    /* renamed from: c */
    private void m3557c() {
        for (int i = 0; i < this.f3131f.size(); i++) {
            ((C0771a) this.f3131f.get(i)).mo3808a();
        }
    }

    /* renamed from: d */
    private void m3558d() {
        for (int i = 0; i < this.f3131f.size(); i++) {
            ((C0771a) this.f3131f.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: e */
    private void m3559e() {
        for (int i = 0; i < this.f3131f.size(); i++) {
            ((C0771a) this.f3131f.get(i)).mo3810b();
        }
    }

    public int getSpanEnd(Object obj) {
        if (m3556b(obj)) {
            Object a = m3553a(obj);
            if (a != null) {
                obj = a;
            }
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        if (m3556b(obj)) {
            Object a = m3553a(obj);
            if (a != null) {
                obj = a;
            }
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        if (m3556b(obj)) {
            Object a = m3553a(obj);
            if (a != null) {
                obj = a;
            }
        }
        return super.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m3555a(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C0771a[] aVarArr = (C0771a[]) super.getSpans(i, i2, C0771a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f3132e;
        }
        return tArr;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class, code=java.lang.Class<androidx.emoji.widget.h$a>, for r4v0, types: [java.lang.Class] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int nextSpanTransition(int r2, int r3, java.lang.Class<androidx.emoji.widget.C0770h.C0771a> r4) {
        /*
            r1 = this;
            boolean r0 = r1.m3555a(r4)
            if (r0 == 0) goto L_0x0008
            java.lang.Class<androidx.emoji.widget.h$a> r4 = androidx.emoji.widget.C0770h.C0771a.class
        L_0x0008:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.widget.C0770h.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public void removeSpan(Object obj) {
        Object obj2;
        if (m3556b(obj)) {
            obj2 = m3553a(obj);
            if (obj2 != null) {
                obj = obj2;
            }
        } else {
            obj2 = null;
        }
        super.removeSpan(obj);
        if (obj2 != null) {
            this.f3131f.remove(obj2);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m3556b(obj)) {
            Object aVar = new C0771a(obj);
            this.f3131f.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return new C0770h(this.f3130e, this, i, i2);
    }

    /* renamed from: a */
    private boolean m3555a(Class<?> cls) {
        return this.f3130e == cls;
    }

    /* renamed from: b */
    public void mo3794b() {
        m3559e();
        m3558d();
    }

    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: a */
    private C0771a m3553a(Object obj) {
        for (int i = 0; i < this.f3131f.size(); i++) {
            C0771a aVar = (C0771a) this.f3131f.get(i);
            if (aVar.f3132e == obj) {
                return aVar;
            }
        }
        return null;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m3557c();
        super.replace(i, i2, charSequence);
        m3559e();
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    C0770h(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C0607i.m2774a(cls, (Object) "watcherClass cannot be null");
        this.f3130e = cls;
    }

    /* renamed from: a */
    public void mo3789a() {
        m3557c();
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m3557c();
        super.replace(i, i2, charSequence, i3, i4);
        m3559e();
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
