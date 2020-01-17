package p213co.znly.models.experimental.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.experimental.models.c */
public final class C7293c extends GeneratedMessageLite<C7293c, C7294a> implements UserActionsProto$UserActionsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7293c f18104h = new C7293c();

    /* renamed from: i */
    private static volatile Parser<C7293c> f18105i;

    /* renamed from: e */
    private long f18106e;

    /* renamed from: f */
    private boolean f18107f;

    /* renamed from: g */
    private boolean f18108g;

    /* renamed from: co.znly.models.experimental.models.c$a */
    public static final class C7294a extends Builder<C7293c, C7294a> implements UserActionsProto$UserActionsOrBuilder {
        /* synthetic */ C7294a(C7292b bVar) {
            this();
        }

        /* renamed from: a */
        public C7294a mo19206a(boolean z) {
            copyOnWrite();
            ((C7293c) this.instance).m17996a(z);
            return this;
        }

        public long getAppOpenedNoFriends() {
            return ((C7293c) this.instance).getAppOpenedNoFriends();
        }

        public boolean getTimetogetherHighlightDisplayed() {
            return ((C7293c) this.instance).getTimetogetherHighlightDisplayed();
        }

        public boolean getWatchersHighlightDisplayed() {
            return ((C7293c) this.instance).getWatchersHighlightDisplayed();
        }

        private C7294a() {
            super(C7293c.f18104h);
        }
    }

    static {
        f18104h.makeImmutable();
    }

    private C7293c() {
    }

    public static C7293c getDefaultInstance() {
        return f18104h;
    }

    public static C7294a newBuilder() {
        return (C7294a) f18104h.toBuilder();
    }

    public static Parser<C7293c> parser() {
        return f18104h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7292b.f18103a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7293c();
            case 2:
                return f18104h;
            case 3:
                return null;
            case 4:
                return new C7294a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7293c cVar = (C7293c) obj2;
                this.f18106e = visitor.visitLong(this.f18106e != 0, this.f18106e, cVar.f18106e != 0, cVar.f18106e);
                boolean z2 = this.f18107f;
                boolean z3 = cVar.f18107f;
                this.f18107f = visitor.visitBoolean(z2, z2, z3, z3);
                boolean z4 = this.f18108g;
                boolean z5 = cVar.f18108g;
                this.f18108g = visitor.visitBoolean(z4, z4, z5, z5);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f18106e = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.f18107f = codedInputStream.readBool();
                            } else if (readTag == 24) {
                                this.f18108g = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e.setUnfinishedMessage(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f18105i == null) {
                    synchronized (C7293c.class) {
                        if (f18105i == null) {
                            f18105i = new DefaultInstanceBasedParser(f18104h);
                        }
                    }
                }
                return f18105i;
            default:
                throw new UnsupportedOperationException();
        }
        return f18104h;
    }

    public long getAppOpenedNoFriends() {
        return this.f18106e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f18106e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        boolean z = this.f18107f;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        boolean z2 = this.f18108g;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(3, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getTimetogetherHighlightDisplayed() {
        return this.f18108g;
    }

    public boolean getWatchersHighlightDisplayed() {
        return this.f18107f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f18106e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        boolean z = this.f18107f;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        boolean z2 = this.f18108g;
        if (z2) {
            codedOutputStream.writeBool(3, z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17996a(boolean z) {
        this.f18107f = z;
    }
}
