package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11165h;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.m.h */
public final class C11196h extends C11138i<Object> {

    /* renamed from: b */
    public static final TypeAdapterFactory f28944b = new C11197a();

    /* renamed from: a */
    private final C11125d f28945a;

    /* renamed from: com.google.gson.internal.m.h$a */
    static class C11197a implements TypeAdapterFactory {
        C11197a() {
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new C11196h(dVar);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.h$b */
    static /* synthetic */ class C11198b {

        /* renamed from: a */
        static final /* synthetic */ int[] f28946a = new int[C11264b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.gson.stream.b[] r0 = com.google.gson.stream.C11264b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28946a = r0
                int[] r0 = f28946a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f28946a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f28946a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f28946a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f28946a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f28946a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.p312m.C11196h.C11198b.<clinit>():void");
        }
    }

    C11196h(C11125d dVar) {
        this.f28945a = dVar;
    }

    public Object read(C11262a aVar) throws IOException {
        switch (C11198b.f28946a[aVar.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo32573a();
                while (aVar.mo32579g()) {
                    arrayList.add(read(aVar));
                }
                aVar.mo32576d();
                return arrayList;
            case 2:
                C11165h hVar = new C11165h();
                aVar.mo32574b();
                while (aVar.mo32579g()) {
                    hVar.put(aVar.mo32584n(), read(aVar));
                }
                aVar.mo32577e();
                return hVar;
            case 3:
                return aVar.mo32586p();
            case 4:
                return Double.valueOf(aVar.mo32581k());
            case 5:
                return Boolean.valueOf(aVar.mo32580j());
            case 6:
                aVar.mo32585o();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public void write(C11265c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo32606h();
            return;
        }
        C11138i a = this.f28945a.mo32449a(obj.getClass());
        if (a instanceof C11196h) {
            cVar.mo32598b();
            cVar.mo32602d();
            return;
        }
        a.write(cVar, obj);
    }
}
