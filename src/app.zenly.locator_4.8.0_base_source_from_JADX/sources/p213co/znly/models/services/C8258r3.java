package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.nights.C7425h;
import p213co.znly.models.services.nights.C8194b;
import p213co.znly.models.services.nights.C8194b.C8195a;

/* renamed from: co.znly.models.services.r3 */
public final class C8258r3 extends GeneratedMessageLite<C8258r3, C8259a> implements ZenlyProto$NightsTimelineResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8258r3 f20879i = new C8258r3();

    /* renamed from: j */
    private static volatile Parser<C8258r3> f20880j;

    /* renamed from: e */
    private int f20881e;

    /* renamed from: f */
    private ProtobufList<C7425h> f20882f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private int f20883g;

    /* renamed from: h */
    private C8194b f20884h;

    /* renamed from: co.znly.models.services.r3$a */
    public static final class C8259a extends Builder<C8258r3, C8259a> implements ZenlyProto$NightsTimelineResponseOrBuilder {
        private C8259a() {
            super(C8258r3.f20879i);
        }

        /* synthetic */ C8259a(C8104i0 i0Var) {
            this();
        }

        public C8194b getError() {
            return ((C8258r3) this.instance).getError();
        }

        public int getNightsVersion() {
            return ((C8258r3) this.instance).getNightsVersion();
        }

        public C7425h getStays(int i) {
            return ((C8258r3) this.instance).getStays(i);
        }

        public int getStaysCount() {
            return ((C8258r3) this.instance).getStaysCount();
        }

        public List<C7425h> getStaysList() {
            return Collections.unmodifiableList(((C8258r3) this.instance).getStaysList());
        }

        public boolean hasError() {
            return ((C8258r3) this.instance).hasError();
        }
    }

    static {
        f20879i.makeImmutable();
    }

    private C8258r3() {
    }

    public static C8259a newBuilder() {
        return (C8259a) f20879i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8258r3();
            case 2:
                return f20879i;
            case 3:
                this.f20882f.makeImmutable();
                return null;
            case 4:
                return new C8259a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8258r3 r3Var = (C8258r3) obj2;
                this.f20882f = visitor.visitList(this.f20882f, r3Var.f20882f);
                boolean z2 = this.f20883g != 0;
                int i = this.f20883g;
                if (r3Var.f20883g != 0) {
                    z = true;
                }
                this.f20883g = visitor.visitInt(z2, i, z, r3Var.f20883g);
                this.f20884h = (C8194b) visitor.visitMessage(this.f20884h, r3Var.f20884h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20881e |= r3Var.f20881e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!this.f20882f.isModifiable()) {
                                    this.f20882f = GeneratedMessageLite.mutableCopy(this.f20882f);
                                }
                                this.f20882f.add(codedInputStream.readMessage(C7425h.parser(), extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.f20883g = codedInputStream.readUInt32();
                            } else if (readTag == 1010) {
                                Builder builder = this.f20884h != null ? (C8195a) this.f20884h.toBuilder() : null;
                                this.f20884h = (C8194b) codedInputStream.readMessage(C8194b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20884h);
                                    this.f20884h = (C8194b) builder.buildPartial();
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
                if (f20880j == null) {
                    synchronized (C8258r3.class) {
                        if (f20880j == null) {
                            f20880j = new DefaultInstanceBasedParser(f20879i);
                        }
                    }
                }
                return f20880j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20879i;
    }

    public C8194b getError() {
        C8194b bVar = this.f20884h;
        return bVar == null ? C8194b.getDefaultInstance() : bVar;
    }

    public int getNightsVersion() {
        return this.f20883g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20882f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f20882f.get(i3));
        }
        int i4 = this.f20883g;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(2, i4);
        }
        if (this.f20884h != null) {
            i2 += CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7425h getStays(int i) {
        return (C7425h) this.f20882f.get(i);
    }

    public int getStaysCount() {
        return this.f20882f.size();
    }

    public List<C7425h> getStaysList() {
        return this.f20882f;
    }

    public boolean hasError() {
        return this.f20884h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20882f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f20882f.get(i));
        }
        int i2 = this.f20883g;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(2, i2);
        }
        if (this.f20884h != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
