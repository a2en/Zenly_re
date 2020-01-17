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

/* renamed from: co.znly.models.services.y */
public final class C8379y extends GeneratedMessageLite<C8379y, C8380a> implements ZendeskProto$ZendeskCreateTicketErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8379y f21227f = new C8379y();

    /* renamed from: g */
    private static volatile Parser<C8379y> f21228g;

    /* renamed from: e */
    private C8026d2 f21229e;

    /* renamed from: co.znly.models.services.y$a */
    public static final class C8380a extends Builder<C8379y, C8380a> implements ZendeskProto$ZendeskCreateTicketErrorOrBuilder {
        /* synthetic */ C8380a(C8344w wVar) {
            this();
        }

        public C8026d2 getError() {
            return ((C8379y) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8379y) this.instance).hasError();
        }

        private C8380a() {
            super(C8379y.f21227f);
        }
    }

    static {
        f21227f.makeImmutable();
    }

    private C8379y() {
    }

    public static C8379y getDefaultInstance() {
        return f21227f;
    }

    public static Parser<C8379y> parser() {
        return f21227f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8379y();
            case 2:
                return f21227f;
            case 3:
                return null;
            case 4:
                return new C8380a(null);
            case 5:
                this.f21229e = (C8026d2) ((Visitor) obj).visitMessage(this.f21229e, ((C8379y) obj2).f21229e);
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
                                Builder builder = this.f21229e != null ? (C8027a) this.f21229e.toBuilder() : null;
                                this.f21229e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21229e);
                                    this.f21229e = (C8026d2) builder.buildPartial();
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
                if (f21228g == null) {
                    synchronized (C8379y.class) {
                        if (f21228g == null) {
                            f21228g = new DefaultInstanceBasedParser(f21227f);
                        }
                    }
                }
                return f21228g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21227f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f21229e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21229e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f21229e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21229e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
