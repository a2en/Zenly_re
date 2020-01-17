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
import p213co.znly.models.services.C8088h0.C8089a;

/* renamed from: co.znly.models.services.z */
public final class C8393z extends GeneratedMessageLite<C8393z, C8394a> implements ZendeskProto$ZendeskCreateTicketRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8393z f21252f = new C8393z();

    /* renamed from: g */
    private static volatile Parser<C8393z> f21253g;

    /* renamed from: e */
    private C8088h0 f21254e;

    /* renamed from: co.znly.models.services.z$a */
    public static final class C8394a extends Builder<C8393z, C8394a> implements ZendeskProto$ZendeskCreateTicketRequestOrBuilder {
        /* synthetic */ C8394a(C8344w wVar) {
            this();
        }

        /* renamed from: a */
        public C8394a mo22341a(C8088h0 h0Var) {
            copyOnWrite();
            ((C8393z) this.instance).m19478a(h0Var);
            return this;
        }

        public C8088h0 getTicket() {
            return ((C8393z) this.instance).getTicket();
        }

        public boolean hasTicket() {
            return ((C8393z) this.instance).hasTicket();
        }

        private C8394a() {
            super(C8393z.f21252f);
        }
    }

    static {
        f21252f.makeImmutable();
    }

    private C8393z() {
    }

    public static C8394a newBuilder() {
        return (C8394a) f21252f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8393z();
            case 2:
                return f21252f;
            case 3:
                return null;
            case 4:
                return new C8394a(null);
            case 5:
                this.f21254e = (C8088h0) ((Visitor) obj).visitMessage(this.f21254e, ((C8393z) obj2).f21254e);
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
                                Builder builder = this.f21254e != null ? (C8089a) this.f21254e.toBuilder() : null;
                                this.f21254e = (C8088h0) codedInputStream.readMessage(C8088h0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21254e);
                                    this.f21254e = (C8088h0) builder.buildPartial();
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
                if (f21253g == null) {
                    synchronized (C8393z.class) {
                        if (f21253g == null) {
                            f21253g = new DefaultInstanceBasedParser(f21252f);
                        }
                    }
                }
                return f21253g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21252f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21254e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getTicket());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C8088h0 getTicket() {
        C8088h0 h0Var = this.f21254e;
        return h0Var == null ? C8088h0.getDefaultInstance() : h0Var;
    }

    public boolean hasTicket() {
        return this.f21254e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21254e != null) {
            codedOutputStream.writeMessage(1, getTicket());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19478a(C8088h0 h0Var) {
        if (h0Var != null) {
            this.f21254e = h0Var;
            return;
        }
        throw new NullPointerException();
    }
}
