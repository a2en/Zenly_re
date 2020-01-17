package com.facebook.datasource;

import com.facebook.common.executors.C9512a;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.datasource.e */
public class C9572e<T> implements Supplier<DataSource<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<Supplier<DataSource<T>>> f24792a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f24793b;

    /* renamed from: com.facebook.datasource.e$a */
    private class C9573a extends C9561a<T> {

        /* renamed from: g */
        private ArrayList<DataSource<T>> f24794g;

        /* renamed from: h */
        private int f24795h;

        /* renamed from: i */
        private int f24796i;

        /* renamed from: j */
        private AtomicInteger f24797j;

        /* renamed from: k */
        private Throwable f24798k;

        /* renamed from: com.facebook.datasource.e$a$a */
        private class C9574a implements DataSubscriber<T> {

            /* renamed from: a */
            private int f24800a;

            public C9574a(int i) {
                this.f24800a = i;
            }

            public void onCancellation(DataSource<T> dataSource) {
            }

            public void onFailure(DataSource<T> dataSource) {
                C9573a.this.m23438a(this.f24800a, dataSource);
            }

            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    C9573a.this.m23444b(this.f24800a, dataSource);
                } else if (dataSource.isFinished()) {
                    C9573a.this.m23438a(this.f24800a, dataSource);
                }
            }

            public void onProgressUpdate(DataSource<T> dataSource) {
                if (this.f24800a == 0) {
                    C9573a.this.mo25767a(dataSource.getProgress());
                }
            }
        }

        public C9573a() {
            if (!C9572e.this.f24793b) {
                m23443b();
            }
        }

        /* renamed from: c */
        private synchronized DataSource<T> m23446c() {
            return m23442b(this.f24795h);
        }

        /* renamed from: d */
        private void m23448d() {
            if (this.f24797j.incrementAndGet() == this.f24796i) {
                Throwable th = this.f24798k;
                if (th != null) {
                    mo25769a(th);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r0 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r1 >= r0.size()) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            m23440a((com.facebook.datasource.DataSource) r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean close() {
            /*
                r3 = this;
                com.facebook.datasource.e r0 = com.facebook.datasource.C9572e.this
                boolean r0 = r0.f24793b
                if (r0 == 0) goto L_0x000b
                r3.m23443b()
            L_0x000b:
                monitor-enter(r3)
                boolean r0 = super.close()     // Catch:{ all -> 0x0031 }
                r1 = 0
                if (r0 != 0) goto L_0x0015
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                return r1
            L_0x0015:
                java.util.ArrayList<com.facebook.datasource.DataSource<T>> r0 = r3.f24794g     // Catch:{ all -> 0x0031 }
                r2 = 0
                r3.f24794g = r2     // Catch:{ all -> 0x0031 }
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                if (r0 == 0) goto L_0x002f
            L_0x001d:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002f
                java.lang.Object r2 = r0.get(r1)
                com.facebook.datasource.DataSource r2 = (com.facebook.datasource.DataSource) r2
                r3.m23440a(r2)
                int r1 = r1 + 1
                goto L_0x001d
            L_0x002f:
                r0 = 1
                return r0
            L_0x0031:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C9572e.C9573a.close():boolean");
        }

        public synchronized T getResult() {
            DataSource c;
            if (C9572e.this.f24793b) {
                m23443b();
            }
            c = m23446c();
            return c != null ? c.getResult() : null;
        }

        public synchronized boolean hasResult() {
            DataSource c;
            if (C9572e.this.f24793b) {
                m23443b();
            }
            c = m23446c();
            return c != null && c.hasResult();
        }

        /* renamed from: a */
        private synchronized DataSource<T> m23437a(int i) {
            DataSource<T> dataSource;
            dataSource = null;
            if (this.f24794g != null && i < this.f24794g.size()) {
                dataSource = (DataSource) this.f24794g.set(i, null);
            }
            return dataSource;
        }

        /* renamed from: b */
        private void m23443b() {
            if (this.f24797j == null) {
                synchronized (this) {
                    if (this.f24797j == null) {
                        int i = 0;
                        this.f24797j = new AtomicInteger(0);
                        int size = C9572e.this.f24792a.size();
                        this.f24796i = size;
                        this.f24795h = size;
                        this.f24794g = new ArrayList<>(size);
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            DataSource dataSource = (DataSource) ((Supplier) C9572e.this.f24792a.get(i)).get();
                            this.f24794g.add(dataSource);
                            dataSource.subscribe(new C9574a(i), C9512a.m23227a());
                            if (dataSource.hasResult()) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private synchronized DataSource<T> m23447c(int i, DataSource<T> dataSource) {
            if (dataSource == m23446c()) {
                return null;
            }
            if (dataSource != m23442b(i)) {
                return dataSource;
            }
            return m23437a(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m23438a(int i, DataSource<T> dataSource) {
            m23440a(m23447c(i, dataSource));
            if (i == 0) {
                this.f24798k = dataSource.getFailureCause();
            }
            m23448d();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
            if (r0 <= r4) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
            m23440a(m23437a(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m23439a(int r4, com.facebook.datasource.DataSource<T> r5, boolean r6) {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.f24795h     // Catch:{ all -> 0x0031 }
                int r1 = r3.f24795h     // Catch:{ all -> 0x0031 }
                com.facebook.datasource.DataSource r2 = r3.m23442b(r4)     // Catch:{ all -> 0x0031 }
                if (r5 != r2) goto L_0x002f
                int r5 = r3.f24795h     // Catch:{ all -> 0x0031 }
                if (r4 != r5) goto L_0x0010
                goto L_0x002f
            L_0x0010:
                com.facebook.datasource.DataSource r5 = r3.m23446c()     // Catch:{ all -> 0x0031 }
                if (r5 == 0) goto L_0x001f
                if (r6 == 0) goto L_0x001d
                int r5 = r3.f24795h     // Catch:{ all -> 0x0031 }
                if (r4 >= r5) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r4 = r1
                goto L_0x0021
            L_0x001f:
                r3.f24795h = r4     // Catch:{ all -> 0x0031 }
            L_0x0021:
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            L_0x0022:
                if (r0 <= r4) goto L_0x002e
                com.facebook.datasource.DataSource r5 = r3.m23437a(r0)
                r3.m23440a(r5)
                int r0 = r0 + -1
                goto L_0x0022
            L_0x002e:
                return
            L_0x002f:
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                return
            L_0x0031:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C9572e.C9573a.m23439a(int, com.facebook.datasource.DataSource, boolean):void");
        }

        /* renamed from: b */
        private synchronized DataSource<T> m23442b(int i) {
            return (this.f24794g == null || i >= this.f24794g.size()) ? null : (DataSource) this.f24794g.get(i);
        }

        /* renamed from: a */
        private void m23440a(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m23444b(int i, DataSource<T> dataSource) {
            m23439a(i, dataSource, dataSource.isFinished());
            if (dataSource == m23446c()) {
                mo25768a(null, i == 0 && dataSource.isFinished());
            }
            m23448d();
        }
    }

    private C9572e(List<Supplier<DataSource<T>>> list, boolean z) {
        C9536j.m23276a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f24792a = list;
        this.f24793b = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9572e)) {
            return false;
        }
        return C9532i.m23264a(this.f24792a, ((C9572e) obj).f24792a);
    }

    public int hashCode() {
        return this.f24792a.hashCode();
    }

    public String toString() {
        C9534b a = C9532i.m23262a((Object) this);
        a.mo25665a("list", (Object) this.f24792a);
        return a.toString();
    }

    /* renamed from: a */
    public static <T> C9572e<T> m23434a(List<Supplier<DataSource<T>>> list, boolean z) {
        return new C9572e<>(list, z);
    }

    public DataSource<T> get() {
        return new C9573a();
    }
}
