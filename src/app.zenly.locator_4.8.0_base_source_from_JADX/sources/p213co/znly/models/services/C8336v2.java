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
import p213co.znly.models.C6980c3;

/* renamed from: co.znly.models.services.v2 */
public final class C8336v2 extends GeneratedMessageLite<C8336v2, C8337a> implements ZenlyProto$FriendGhostResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8336v2 f21112f = new C8336v2();

    /* renamed from: g */
    private static volatile Parser<C8336v2> f21113g;

    /* renamed from: e */
    private ProtobufList<C6980c3> f21114e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.services.v2$a */
    public static final class C8337a extends Builder<C8336v2, C8337a> implements ZenlyProto$FriendGhostResponseOrBuilder {
        /* synthetic */ C8337a(C8104i0 i0Var) {
            this();
        }

        public C6980c3 getFriendships(int i) {
            return ((C8336v2) this.instance).getFriendships(i);
        }

        public int getFriendshipsCount() {
            return ((C8336v2) this.instance).getFriendshipsCount();
        }

        public List<C6980c3> getFriendshipsList() {
            return Collections.unmodifiableList(((C8336v2) this.instance).getFriendshipsList());
        }

        private C8337a() {
            super(C8336v2.f21112f);
        }
    }

    static {
        f21112f.makeImmutable();
    }

    private C8336v2() {
    }

    public static C8337a newBuilder() {
        return (C8337a) f21112f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8336v2();
            case 2:
                return f21112f;
            case 3:
                this.f21114e.makeImmutable();
                return null;
            case 4:
                return new C8337a(null);
            case 5:
                this.f21114e = ((Visitor) obj).visitList(this.f21114e, ((C8336v2) obj2).f21114e);
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
                                if (!this.f21114e.isModifiable()) {
                                    this.f21114e = GeneratedMessageLite.mutableCopy(this.f21114e);
                                }
                                this.f21114e.add(codedInputStream.readMessage(C6980c3.parser(), extensionRegistryLite));
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
                if (f21113g == null) {
                    synchronized (C8336v2.class) {
                        if (f21113g == null) {
                            f21113g = new DefaultInstanceBasedParser(f21112f);
                        }
                    }
                }
                return f21113g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21112f;
    }

    public C6980c3 getFriendships(int i) {
        return (C6980c3) this.f21114e.get(i);
    }

    public int getFriendshipsCount() {
        return this.f21114e.size();
    }

    public List<C6980c3> getFriendshipsList() {
        return this.f21114e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21114e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f21114e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f21114e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f21114e.get(i));
        }
    }
}
