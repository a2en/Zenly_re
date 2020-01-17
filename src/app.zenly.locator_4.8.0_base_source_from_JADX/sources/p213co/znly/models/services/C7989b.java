package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.services.C8026d2.C8027a;

/* renamed from: co.znly.models.services.b */
public final class C7989b extends GeneratedMessageLite<C7989b, C7990a> implements BubbleProto$IsInBubbleErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7989b f20280f = new C7989b();

    /* renamed from: g */
    private static volatile Parser<C7989b> f20281g;

    /* renamed from: e */
    private C8026d2 f20282e;

    /* renamed from: co.znly.models.services.b$a */
    public static final class C7990a extends Builder<C7989b, C7990a> implements BubbleProto$IsInBubbleErrorOrBuilder {
        /* synthetic */ C7990a(C7972a aVar) {
            this();
        }

        public C8026d2 getError() {
            return ((C7989b) this.instance).getError();
        }

        public boolean hasError() {
            return ((C7989b) this.instance).hasError();
        }

        private C7990a() {
            super(C7989b.f20280f);
        }
    }

    static {
        f20280f.makeImmutable();
    }

    private C7989b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7972a.f20245a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7989b();
            case 2:
                return f20280f;
            case 3:
                return null;
            case 4:
                return new C7990a(null);
            case 5:
                this.f20282e = (C8026d2) ((Visitor) obj).visitMessage(this.f20282e, ((C7989b) obj2).f20282e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f20282e != null ? (C8027a) this.f20282e.toBuilder() : null;
                                this.f20282e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20282e);
                                    this.f20282e = (C8026d2) builder.buildPartial();
                                }
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
                if (f20281g == null) {
                    synchronized (C7989b.class) {
                        if (f20281g == null) {
                            f20281g = new DefaultInstanceBasedParser(f20280f);
                        }
                    }
                }
                return f20281g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20280f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20282e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20282e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20282e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20282e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
