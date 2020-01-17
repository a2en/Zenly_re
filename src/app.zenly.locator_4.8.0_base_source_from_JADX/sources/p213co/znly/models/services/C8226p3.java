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
import p213co.znly.models.nights.C7423g;

/* renamed from: co.znly.models.services.p3 */
public final class C8226p3 extends GeneratedMessageLite<C8226p3, C8227a> implements ZenlyProto$NightsStayRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8226p3 f20817f = new C8226p3();

    /* renamed from: g */
    private static volatile Parser<C8226p3> f20818g;

    /* renamed from: e */
    private ProtobufList<C7423g> f20819e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.p3$a */
    public static final class C8227a extends Builder<C8226p3, C8227a> implements ZenlyProto$NightsStayRequestOrBuilder {
        private C8227a() {
            super(C8226p3.f20817f);
        }

        /* synthetic */ C8227a(C8104i0 i0Var) {
            this();
        }

        public C7423g getOptions(int i) {
            return ((C8226p3) this.instance).getOptions(i);
        }

        public int getOptionsCount() {
            return ((C8226p3) this.instance).getOptionsCount();
        }

        public List<C7423g> getOptionsList() {
            return Collections.unmodifiableList(((C8226p3) this.instance).getOptionsList());
        }
    }

    static {
        f20817f.makeImmutable();
    }

    private C8226p3() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8226p3();
            case 2:
                return f20817f;
            case 3:
                this.f20819e.makeImmutable();
                return null;
            case 4:
                return new C8227a(null);
            case 5:
                this.f20819e = ((Visitor) obj).visitList(this.f20819e, ((C8226p3) obj2).f20819e);
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
                            if (readTag == 18) {
                                if (!this.f20819e.isModifiable()) {
                                    this.f20819e = GeneratedMessageLite.mutableCopy(this.f20819e);
                                }
                                this.f20819e.add(codedInputStream.readMessage(C7423g.parser(), extensionRegistryLite));
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
                if (f20818g == null) {
                    synchronized (C8226p3.class) {
                        if (f20818g == null) {
                            f20818g = new DefaultInstanceBasedParser(f20817f);
                        }
                    }
                }
                return f20818g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20817f;
    }

    public C7423g getOptions(int i) {
        return (C7423g) this.f20819e.get(i);
    }

    public int getOptionsCount() {
        return this.f20819e.size();
    }

    public List<C7423g> getOptionsList() {
        return this.f20819e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20819e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f20819e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f20819e.size(); i++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f20819e.get(i));
        }
    }
}
