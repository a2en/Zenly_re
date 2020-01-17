package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.d3 */
public final class C7082d3 extends GeneratedMessageLite<C7082d3, C7083a> implements ZendeskExtendedProto$ZendeskUnseenTicketsEventsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7082d3 f17520f = new C7082d3();

    /* renamed from: g */
    private static volatile Parser<C7082d3> f17521g;

    /* renamed from: e */
    private boolean f17522e;

    /* renamed from: co.znly.models.core.d3$a */
    public static final class C7083a extends Builder<C7082d3, C7083a> implements ZendeskExtendedProto$ZendeskUnseenTicketsEventsOrBuilder {
        /* synthetic */ C7083a(C7072c3 c3Var) {
            this();
        }

        public boolean getUnseenTickets() {
            return ((C7082d3) this.instance).getUnseenTickets();
        }

        private C7083a() {
            super(C7082d3.f17520f);
        }
    }

    static {
        f17520f.makeImmutable();
    }

    private C7082d3() {
    }

    public static C7083a newBuilder() {
        return (C7083a) f17520f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7072c3.f17494a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7082d3();
            case 2:
                return f17520f;
            case 3:
                return null;
            case 4:
                return new C7083a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7082d3 d3Var = (C7082d3) obj2;
                boolean z = this.f17522e;
                boolean z2 = d3Var.f17522e;
                this.f17522e = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f17522e = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f17521g == null) {
                    synchronized (C7082d3.class) {
                        if (f17521g == null) {
                            f17521g = new DefaultInstanceBasedParser(f17520f);
                        }
                    }
                }
                return f17521g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17520f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f17522e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getUnseenTickets() {
        return this.f17522e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f17522e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
    }
}
