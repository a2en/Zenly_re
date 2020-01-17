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
import p213co.znly.models.services.C8379y.C8380a;

/* renamed from: co.znly.models.services.a0 */
public final class C7973a0 extends GeneratedMessageLite<C7973a0, C7974a> implements ZendeskProto$ZendeskCreateTicketResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7973a0 f20246f = new C7973a0();

    /* renamed from: g */
    private static volatile Parser<C7973a0> f20247g;

    /* renamed from: e */
    private C8379y f20248e;

    /* renamed from: co.znly.models.services.a0$a */
    public static final class C7974a extends Builder<C7973a0, C7974a> implements ZendeskProto$ZendeskCreateTicketResponseOrBuilder {
        /* synthetic */ C7974a(C8344w wVar) {
            this();
        }

        public C8379y getError() {
            return ((C7973a0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C7973a0) this.instance).hasError();
        }

        private C7974a() {
            super(C7973a0.f20246f);
        }
    }

    static {
        f20246f.makeImmutable();
    }

    private C7973a0() {
    }

    public static C7974a newBuilder() {
        return (C7974a) f20246f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7973a0();
            case 2:
                return f20246f;
            case 3:
                return null;
            case 4:
                return new C7974a(null);
            case 5:
                this.f20248e = (C8379y) ((Visitor) obj).visitMessage(this.f20248e, ((C7973a0) obj2).f20248e);
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
                            if (readTag == 1010) {
                                Builder builder = this.f20248e != null ? (C8380a) this.f20248e.toBuilder() : null;
                                this.f20248e = (C8379y) codedInputStream.readMessage(C8379y.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20248e);
                                    this.f20248e = (C8379y) builder.buildPartial();
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
                if (f20247g == null) {
                    synchronized (C7973a0.class) {
                        if (f20247g == null) {
                            f20247g = new DefaultInstanceBasedParser(f20246f);
                        }
                    }
                }
                return f20247g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20246f;
    }

    public C8379y getError() {
        C8379y yVar = this.f20248e;
        return yVar == null ? C8379y.getDefaultInstance() : yVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20248e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20248e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20248e != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
