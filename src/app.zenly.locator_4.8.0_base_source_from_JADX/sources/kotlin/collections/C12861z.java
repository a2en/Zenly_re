package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.z */
final class C12861z implements Map, Serializable, KMappedMarker {

    /* renamed from: e */
    public static final C12861z f33433e = new C12861z();
    private static final long serialVersionUID = 8246714829545688274L;

    private C12861z() {
    }

    private final Object readResolve() {
        return f33433e;
    }

    /* renamed from: a */
    public Set<Entry> mo37134a() {
        return C12817a0.f33411e;
    }

    /* renamed from: a */
    public boolean mo37135a(Void voidR) {
        C12932j.m33818b(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Set<Object> mo37136b() {
        return C12817a0.f33411e;
    }

    /* renamed from: c */
    public int mo37137c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return mo37135a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Collection mo37141d() {
        return C12860y.f33432e;
    }

    public final /* bridge */ Set<Entry> entrySet() {
        return mo37134a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return get(obj);
    }

    public Void get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo37136b();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo37137c();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo37141d();
    }
}
