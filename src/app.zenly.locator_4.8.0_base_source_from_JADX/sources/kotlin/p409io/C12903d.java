package kotlin.p409io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C12956q;
import kotlin.C12977s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C12820c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.sequences.Sequence;

/* renamed from: kotlin.io.d */
public final class C12903d implements Sequence<File> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f33476a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12911f f33477b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<File, Boolean> f33478c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Function1<File, C12956q> f33479d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Function2<File, IOException, C12956q> f33480e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f33481f;

    /* renamed from: kotlin.io.d$a */
    private static abstract class C12904a extends C12909c {
        public C12904a(File file) {
            C12932j.m33818b(file, "rootDir");
            super(file);
            if (C12977s.f33570a) {
                boolean isDirectory = file.isDirectory();
                if (C12977s.f33570a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    /* renamed from: kotlin.io.d$b */
    private final class C12905b extends C12820c<File> {

        /* renamed from: g */
        private final ArrayDeque<C12909c> f33482g = new ArrayDeque<>();

        /* renamed from: kotlin.io.d$b$a */
        private final class C12906a extends C12904a {

            /* renamed from: b */
            private boolean f33484b;

            /* renamed from: c */
            private File[] f33485c;

            /* renamed from: d */
            private int f33486d;

            /* renamed from: e */
            private boolean f33487e;

            /* renamed from: f */
            final /* synthetic */ C12905b f33488f;

            public C12906a(C12905b bVar, File file) {
                C12932j.m33818b(file, "rootDir");
                this.f33488f = bVar;
                super(file);
            }

            /* renamed from: b */
            public File mo37209b() {
                if (!this.f33487e && this.f33485c == null) {
                    Function1 c = C12903d.this.f33478c;
                    if (c != null && !((Boolean) c.invoke(mo37210a())).booleanValue()) {
                        return null;
                    }
                    this.f33485c = mo37210a().listFiles();
                    if (this.f33485c == null) {
                        Function2 d = C12903d.this.f33480e;
                        if (d != null) {
                            File a = mo37210a();
                            AccessDeniedException accessDeniedException = new AccessDeniedException(mo37210a(), null, "Cannot list files in a directory", 2, null);
                            C12956q qVar = (C12956q) d.invoke(a, accessDeniedException);
                        }
                        this.f33487e = true;
                    }
                }
                File[] fileArr = this.f33485c;
                if (fileArr != null) {
                    int i = this.f33486d;
                    if (fileArr == null) {
                        C12932j.m33814a();
                        throw null;
                    } else if (i < fileArr.length) {
                        if (fileArr != null) {
                            this.f33486d = i + 1;
                            return fileArr[i];
                        }
                        C12932j.m33814a();
                        throw null;
                    }
                }
                if (!this.f33484b) {
                    this.f33484b = true;
                    return mo37210a();
                }
                Function1 e = C12903d.this.f33479d;
                if (e != null) {
                    C12956q qVar2 = (C12956q) e.invoke(mo37210a());
                }
                return null;
            }
        }

        /* renamed from: kotlin.io.d$b$b */
        private final class C12907b extends C12909c {

            /* renamed from: b */
            private boolean f33489b;

            public C12907b(C12905b bVar, File file) {
                C12932j.m33818b(file, "rootFile");
                super(file);
                if (C12977s.f33570a) {
                    boolean isFile = file.isFile();
                    if (C12977s.f33570a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }

            /* renamed from: b */
            public File mo37209b() {
                if (this.f33489b) {
                    return null;
                }
                this.f33489b = true;
                return mo37210a();
            }
        }

        /* renamed from: kotlin.io.d$b$c */
        private final class C12908c extends C12904a {

            /* renamed from: b */
            private boolean f33490b;

            /* renamed from: c */
            private File[] f33491c;

            /* renamed from: d */
            private int f33492d;

            /* renamed from: e */
            final /* synthetic */ C12905b f33493e;

            public C12908c(C12905b bVar, File file) {
                C12932j.m33818b(file, "rootDir");
                this.f33493e = bVar;
                super(file);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
                if (r0.length == 0) goto L_0x0090;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo37209b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f33490b
                    r1 = 0
                    if (r0 != 0) goto L_0x0028
                    kotlin.io.d$b r0 = r10.f33493e
                    kotlin.io.d r0 = kotlin.p409io.C12903d.this
                    kotlin.jvm.functions.Function1 r0 = r0.f33478c
                    if (r0 == 0) goto L_0x0020
                    java.io.File r2 = r10.mo37210a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0020
                    return r1
                L_0x0020:
                    r0 = 1
                    r10.f33490b = r0
                    java.io.File r0 = r10.mo37210a()
                    return r0
                L_0x0028:
                    java.io.File[] r0 = r10.f33491c
                    if (r0 == 0) goto L_0x004d
                    int r2 = r10.f33492d
                    if (r0 == 0) goto L_0x0049
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0034
                    goto L_0x004d
                L_0x0034:
                    kotlin.io.d$b r0 = r10.f33493e
                    kotlin.io.d r0 = kotlin.p409io.C12903d.this
                    kotlin.jvm.functions.Function1 r0 = r0.f33479d
                    if (r0 == 0) goto L_0x0048
                    java.io.File r2 = r10.mo37210a()
                    java.lang.Object r0 = r0.invoke(r2)
                    kotlin.q r0 = (kotlin.C12956q) r0
                L_0x0048:
                    return r1
                L_0x0049:
                    kotlin.jvm.internal.C12932j.m33814a()
                    throw r1
                L_0x004d:
                    java.io.File[] r0 = r10.f33491c
                    if (r0 != 0) goto L_0x00a5
                    java.io.File r0 = r10.mo37210a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f33491c = r0
                    java.io.File[] r0 = r10.f33491c
                    if (r0 != 0) goto L_0x0082
                    kotlin.io.d$b r0 = r10.f33493e
                    kotlin.io.d r0 = kotlin.p409io.C12903d.this
                    kotlin.jvm.functions.Function2 r0 = r0.f33480e
                    if (r0 == 0) goto L_0x0082
                    java.io.File r2 = r10.mo37210a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.mo37210a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    java.lang.Object r0 = r0.invoke(r2, r9)
                    kotlin.q r0 = (kotlin.C12956q) r0
                L_0x0082:
                    java.io.File[] r0 = r10.f33491c
                    if (r0 == 0) goto L_0x0090
                    if (r0 == 0) goto L_0x008c
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x00a5
                    goto L_0x0090
                L_0x008c:
                    kotlin.jvm.internal.C12932j.m33814a()
                    throw r1
                L_0x0090:
                    kotlin.io.d$b r0 = r10.f33493e
                    kotlin.io.d r0 = kotlin.p409io.C12903d.this
                    kotlin.jvm.functions.Function1 r0 = r0.f33479d
                    if (r0 == 0) goto L_0x00a4
                    java.io.File r2 = r10.mo37210a()
                    java.lang.Object r0 = r0.invoke(r2)
                    kotlin.q r0 = (kotlin.C12956q) r0
                L_0x00a4:
                    return r1
                L_0x00a5:
                    java.io.File[] r0 = r10.f33491c
                    if (r0 == 0) goto L_0x00b2
                    int r1 = r10.f33492d
                    int r2 = r1 + 1
                    r10.f33492d = r2
                    r0 = r0[r1]
                    return r0
                L_0x00b2:
                    kotlin.jvm.internal.C12932j.m33814a()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p409io.C12903d.C12905b.C12908c.mo37209b():java.io.File");
            }
        }

        public C12905b() {
            if (C12903d.this.f33476a.isDirectory()) {
                this.f33482g.push(m33768a(C12903d.this.f33476a));
            } else if (C12903d.this.f33476a.isFile()) {
                this.f33482g.push(new C12907b(this, C12903d.this.f33476a));
            } else {
                mo37035b();
            }
        }

        /* renamed from: c */
        private final File m33769c() {
            File b;
            while (true) {
                C12909c cVar = (C12909c) this.f33482g.peek();
                if (cVar == null) {
                    return null;
                }
                b = cVar.mo37209b();
                if (b == null) {
                    this.f33482g.pop();
                } else if (C12932j.m33817a((Object) b, (Object) cVar.mo37210a()) || !b.isDirectory() || this.f33482g.size() >= C12903d.this.f33481f) {
                    return b;
                } else {
                    this.f33482g.push(m33768a(b));
                }
            }
            return b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37034a() {
            File c = m33769c();
            if (c != null) {
                mo37036b(c);
            } else {
                mo37035b();
            }
        }

        /* renamed from: a */
        private final C12904a m33768a(File file) {
            int i = C12910e.f33495a[C12903d.this.f33477b.ordinal()];
            if (i == 1) {
                return new C12908c(this, file);
            }
            if (i == 2) {
                return new C12906a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: kotlin.io.d$c */
    private static abstract class C12909c {

        /* renamed from: a */
        private final File f33494a;

        public C12909c(File file) {
            C12932j.m33818b(file, "root");
            this.f33494a = file;
        }

        /* renamed from: a */
        public final File mo37210a() {
            return this.f33494a;
        }

        /* renamed from: b */
        public abstract File mo37209b();
    }

    private C12903d(File file, C12911f fVar, Function1<? super File, Boolean> function1, Function1<? super File, C12956q> function12, Function2<? super File, ? super IOException, C12956q> function2, int i) {
        this.f33476a = file;
        this.f33477b = fVar;
        this.f33478c = function1;
        this.f33479d = function12;
        this.f33480e = function2;
        this.f33481f = i;
    }

    public Iterator<File> iterator() {
        return new C12905b();
    }

    /* synthetic */ C12903d(File file, C12911f fVar, Function1 function1, Function1 function12, Function2 function2, int i, int i2, C12928f fVar2) {
        if ((i2 & 2) != 0) {
            fVar = C12911f.TOP_DOWN;
        }
        this(file, fVar, function1, function12, function2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    public C12903d(File file, C12911f fVar) {
        C12932j.m33818b(file, "start");
        C12932j.m33818b(fVar, "direction");
        this(file, fVar, null, null, null, 0, 32, null);
    }
}
