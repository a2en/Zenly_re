package com.facebook.datasource;

import com.facebook.common.executors.C9512a;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import java.util.List;

/* renamed from: com.facebook.datasource.d */
public class C9568d<T> implements Supplier<DataSource<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<Supplier<DataSource<T>>> f24786a;

    /* renamed from: com.facebook.datasource.d$b */
    private class C9570b extends C9561a<T> {

        /* renamed from: g */
        private int f24787g = 0;

        /* renamed from: h */
        private DataSource<T> f24788h = null;

        /* renamed from: i */
        private DataSource<T> f24789i = null;

        /* renamed from: com.facebook.datasource.d$b$a */
        private class C9571a implements DataSubscriber<T> {
            private C9571a() {
            }

            public void onCancellation(DataSource<T> dataSource) {
            }

            public void onFailure(DataSource<T> dataSource) {
                C9570b.this.m23430c(dataSource);
            }

            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    C9570b.this.m23431d(dataSource);
                } else if (dataSource.isFinished()) {
                    C9570b.this.m23430c(dataSource);
                }
            }

            public void onProgressUpdate(DataSource<T> dataSource) {
                C9570b.this.mo25767a(Math.max(C9570b.this.getProgress(), dataSource.getProgress()));
            }
        }

        public C9570b() {
            if (!m23432d()) {
                mo25769a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: c */
        private synchronized Supplier<DataSource<T>> m23429c() {
            if (isClosed() || this.f24787g >= C9568d.this.f24786a.size()) {
                return null;
            }
            List a = C9568d.this.f24786a;
            int i = this.f24787g;
            this.f24787g = i + 1;
            return (Supplier) a.get(i);
        }

        /* renamed from: d */
        private boolean m23432d() {
            Supplier c = m23429c();
            DataSource dataSource = c != null ? (DataSource) c.get() : null;
            if (!m23433e(dataSource) || dataSource == null) {
                m23427b(dataSource);
                return false;
            }
            dataSource.subscribe(new C9571a(), C9512a.m23227a());
            return true;
        }

        /* renamed from: e */
        private synchronized boolean m23433e(DataSource<T> dataSource) {
            if (isClosed()) {
                return false;
            }
            this.f24788h = dataSource;
            return true;
        }

        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                DataSource<T> dataSource = this.f24788h;
                this.f24788h = null;
                DataSource<T> dataSource2 = this.f24789i;
                this.f24789i = null;
                m23427b(dataSource2);
                m23427b(dataSource);
                return true;
            }
        }

        public synchronized T getResult() {
            DataSource b;
            b = m23426b();
            return b != null ? b.getResult() : null;
        }

        public synchronized boolean hasResult() {
            DataSource b;
            b = m23426b();
            return b != null && b.hasResult();
        }

        /* renamed from: a */
        private synchronized boolean m23425a(DataSource<T> dataSource) {
            if (!isClosed()) {
                if (dataSource == this.f24788h) {
                    this.f24788h = null;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private synchronized DataSource<T> m23426b() {
            return this.f24789i;
        }

        /* renamed from: b */
        private void m23427b(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m23430c(DataSource<T> dataSource) {
            if (m23425a(dataSource)) {
                if (dataSource != m23426b()) {
                    m23427b(dataSource);
                }
                if (!m23432d()) {
                    mo25769a(dataSource.getFailureCause());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            m23427b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m23423a(com.facebook.datasource.DataSource<T> r2, boolean r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                com.facebook.datasource.DataSource<T> r0 = r1.f24788h     // Catch:{ all -> 0x001f }
                if (r2 != r0) goto L_0x001d
                com.facebook.datasource.DataSource<T> r0 = r1.f24789i     // Catch:{ all -> 0x001f }
                if (r2 != r0) goto L_0x000a
                goto L_0x001d
            L_0x000a:
                com.facebook.datasource.DataSource<T> r0 = r1.f24789i     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x0013
                if (r3 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0018
            L_0x0013:
                com.facebook.datasource.DataSource<T> r3 = r1.f24789i     // Catch:{ all -> 0x001f }
                r1.f24789i = r2     // Catch:{ all -> 0x001f }
                r2 = r3
            L_0x0018:
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                r1.m23427b(r2)
                return
            L_0x001d:
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                return
            L_0x001f:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C9568d.C9570b.m23423a(com.facebook.datasource.DataSource, boolean):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m23431d(DataSource<T> dataSource) {
            m23423a(dataSource, dataSource.isFinished());
            if (dataSource == m23426b()) {
                mo25768a(null, dataSource.isFinished());
            }
        }
    }

    private C9568d(List<Supplier<DataSource<T>>> list) {
        C9536j.m23276a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f24786a = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9568d)) {
            return false;
        }
        return C9532i.m23264a(this.f24786a, ((C9568d) obj).f24786a);
    }

    public int hashCode() {
        return this.f24786a.hashCode();
    }

    public String toString() {
        C9534b a = C9532i.m23262a((Object) this);
        a.mo25665a("list", (Object) this.f24786a);
        return a.toString();
    }

    /* renamed from: a */
    public static <T> C9568d<T> m23421a(List<Supplier<DataSource<T>>> list) {
        return new C9568d<>(list);
    }

    public DataSource<T> get() {
        return new C9570b();
    }
}
