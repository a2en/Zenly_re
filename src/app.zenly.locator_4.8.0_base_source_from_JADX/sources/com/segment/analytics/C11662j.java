package com.segment.analytics;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* renamed from: com.segment.analytics.j */
abstract class C11662j implements Closeable {

    /* renamed from: com.segment.analytics.j$a */
    interface C11663a {
        boolean read(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: com.segment.analytics.j$b */
    static class C11664b extends C11662j {

        /* renamed from: e */
        final LinkedList<byte[]> f30244e = new LinkedList<>();

        C11664b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34362a(int i) throws IOException {
            for (int i2 = 0; i2 < i; i2++) {
                this.f30244e.remove();
            }
        }

        public void close() throws IOException {
        }

        /* access modifiers changed from: 0000 */
        public int size() {
            return this.f30244e.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34364a(byte[] bArr) throws IOException {
            this.f30244e.add(bArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34363a(C11663a aVar) throws IOException {
            int i = 0;
            while (i < this.f30244e.size()) {
                byte[] bArr = (byte[]) this.f30244e.get(i);
                if (aVar.read(new ByteArrayInputStream(bArr), bArr.length)) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.segment.analytics.j$c */
    static class C11665c extends C11662j {

        /* renamed from: e */
        final C11669m f30245e;

        C11665c(C11669m mVar) {
            this.f30245e = mVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34362a(int i) throws IOException {
            try {
                this.f30245e.mo34376a(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException(e);
            }
        }

        public void close() throws IOException {
            this.f30245e.close();
        }

        /* access modifiers changed from: 0000 */
        public int size() {
            return this.f30245e.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34364a(byte[] bArr) throws IOException {
            this.f30245e.mo34378a(bArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34363a(C11663a aVar) throws IOException {
            this.f30245e.mo34374a(aVar);
        }
    }

    C11662j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34362a(int i) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34363a(C11663a aVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34364a(byte[] bArr) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract int size();
}
