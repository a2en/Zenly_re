package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.j0 */
final class C12839j0<T> extends C12828e<T> {

    /* renamed from: e */
    private final List<T> f33424e;

    public C12839j0(List<T> list) {
        C12932j.m33818b(list, "delegate");
        this.f33424e = list;
    }

    /* renamed from: a */
    public int mo37073a() {
        return this.f33424e.size();
    }

    public void add(int i, T t) {
        this.f33424e.add(C12855u.m33656d(this, i), t);
    }

    public void clear() {
        this.f33424e.clear();
    }

    public T get(int i) {
        return this.f33424e.get(C12855u.m33655c(this, i));
    }

    public T set(int i, T t) {
        return this.f33424e.set(C12855u.m33655c(this, i), t);
    }

    /* renamed from: a */
    public T mo37074a(int i) {
        return this.f33424e.remove(C12855u.m33655c(this, i));
    }
}
