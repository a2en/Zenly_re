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
import p213co.znly.models.services.C8198o.C8199a;
import p213co.znly.models.services.C8216p.C8217a;

/* renamed from: co.znly.models.services.q */
public final class C8237q extends GeneratedMessageLite<C8237q, C8238a> implements ReverseGeoCoderProto$RgcExternalRequestErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8237q f20839g = new C8237q();

    /* renamed from: h */
    private static volatile Parser<C8237q> f20840h;

    /* renamed from: e */
    private C8198o f20841e;

    /* renamed from: f */
    private C8216p f20842f;

    /* renamed from: co.znly.models.services.q$a */
    public static final class C8238a extends Builder<C8237q, C8238a> implements ReverseGeoCoderProto$RgcExternalRequestErrorOrBuilder {
        /* synthetic */ C8238a(C8005c cVar) {
            this();
        }

        public C8198o getError() {
            return ((C8237q) this.instance).getError();
        }

        public C8216p getProviderError() {
            return ((C8237q) this.instance).getProviderError();
        }

        public boolean hasError() {
            return ((C8237q) this.instance).hasError();
        }

        public boolean hasProviderError() {
            return ((C8237q) this.instance).hasProviderError();
        }

        private C8238a() {
            super(C8237q.f20839g);
        }
    }

    static {
        f20839g.makeImmutable();
    }

    private C8237q() {
    }

    public static C8237q getDefaultInstance() {
        return f20839g;
    }

    public static Parser<C8237q> parser() {
        return f20839g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8237q();
            case 2:
                return f20839g;
            case 3:
                return null;
            case 4:
                return new C8238a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8237q qVar = (C8237q) obj2;
                this.f20841e = (C8198o) visitor.visitMessage(this.f20841e, qVar.f20841e);
                this.f20842f = (C8216p) visitor.visitMessage(this.f20842f, qVar.f20842f);
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
                                Builder builder = this.f20841e != null ? (C8199a) this.f20841e.toBuilder() : null;
                                this.f20841e = (C8198o) codedInputStream.readMessage(C8198o.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20841e);
                                    this.f20841e = (C8198o) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f20842f != null ? (C8217a) this.f20842f.toBuilder() : null;
                                this.f20842f = (C8216p) codedInputStream.readMessage(C8216p.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f20842f);
                                    this.f20842f = (C8216p) builder2.buildPartial();
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
                if (f20840h == null) {
                    synchronized (C8237q.class) {
                        if (f20840h == null) {
                            f20840h = new DefaultInstanceBasedParser(f20839g);
                        }
                    }
                }
                return f20840h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20839g;
    }

    public C8198o getError() {
        C8198o oVar = this.f20841e;
        return oVar == null ? C8198o.getDefaultInstance() : oVar;
    }

    public C8216p getProviderError() {
        C8216p pVar = this.f20842f;
        return pVar == null ? C8216p.getDefaultInstance() : pVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20841e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f20842f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getProviderError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20841e != null;
    }

    public boolean hasProviderError() {
        return this.f20842f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20841e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f20842f != null) {
            codedOutputStream.writeMessage(2, getProviderError());
        }
    }
}
