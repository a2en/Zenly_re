package androidx.paging;

import java.util.concurrent.Executor;

/* renamed from: androidx.paging.b */
abstract class C1008b<Key, Value> extends DataSource<Key, Value> {
    C1008b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Key mo4820a(int i, Value value);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo4821a(int i, Value value, int i2, Executor executor, C1017a<Value> aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo4822a(Key key, int i, int i2, boolean z, Executor executor, C1017a<Value> aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo4823b(int i, Value value, int i2, Executor executor, C1017a<Value> aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4803b() {
        return true;
    }
}
