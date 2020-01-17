package kotlinx.coroutines.internal;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.internal.a */
public class C13084a<T> {

    /* renamed from: a */
    private Object[] f33668a = new Object[16];

    /* renamed from: b */
    private int f33669b;

    /* renamed from: c */
    private int f33670c;

    /* renamed from: c */
    private final void m34145c() {
        Object[] objArr = this.f33668a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        C12838j.m33562a(objArr, objArr3, 0, this.f33669b, 0, 10, null);
        Object[] objArr4 = this.f33668a;
        int length2 = objArr4.length;
        int i = this.f33669b;
        C12838j.m33562a(objArr4, objArr2, length2 - i, 0, i, 4, null);
        this.f33668a = objArr3;
        this.f33669b = 0;
        this.f33670c = length;
    }

    /* renamed from: a */
    public final boolean mo37578a() {
        return this.f33669b == this.f33670c;
    }

    /* renamed from: b */
    public final T mo37579b() {
        int i = this.f33669b;
        if (i == this.f33670c) {
            return null;
        }
        T[] tArr = this.f33668a;
        T t = tArr[i];
        tArr[i] = null;
        this.f33669b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final void mo37577a(T t) {
        C12932j.m33818b(t, "element");
        Object[] objArr = this.f33668a;
        int i = this.f33670c;
        objArr[i] = t;
        this.f33670c = (objArr.length - 1) & (i + 1);
        if (this.f33670c == this.f33669b) {
            m34145c();
        }
    }
}
