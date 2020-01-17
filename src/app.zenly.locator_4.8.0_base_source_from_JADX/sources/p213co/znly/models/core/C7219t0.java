package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.t0 */
public final class C7219t0 extends GeneratedMessageLite<C7219t0, C7220a> implements CoreUserProto$BestFriendsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7219t0 f17907f = new C7219t0();

    /* renamed from: g */
    private static volatile Parser<C7219t0> f17908g;

    /* renamed from: e */
    private ProtobufList<C7210s0> f17909e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.t0$a */
    public static final class C7220a extends Builder<C7219t0, C7220a> implements CoreUserProto$BestFriendsOrBuilder {
        /* synthetic */ C7220a(C7203r0 r0Var) {
            this();
        }

        public C7210s0 getFriends(int i) {
            return ((C7219t0) this.instance).getFriends(i);
        }

        public int getFriendsCount() {
            return ((C7219t0) this.instance).getFriendsCount();
        }

        public List<C7210s0> getFriendsList() {
            return Collections.unmodifiableList(((C7219t0) this.instance).getFriendsList());
        }

        private C7220a() {
            super(C7219t0.f17907f);
        }
    }

    static {
        f17907f.makeImmutable();
    }

    private C7219t0() {
    }

    public static C7220a newBuilder() {
        return (C7220a) f17907f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7203r0.f17852a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7219t0();
            case 2:
                return f17907f;
            case 3:
                this.f17909e.makeImmutable();
                return null;
            case 4:
                return new C7220a(null);
            case 5:
                this.f17909e = ((Visitor) obj).visitList(this.f17909e, ((C7219t0) obj2).f17909e);
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
                                if (!this.f17909e.isModifiable()) {
                                    this.f17909e = GeneratedMessageLite.mutableCopy(this.f17909e);
                                }
                                this.f17909e.add(codedInputStream.readMessage(C7210s0.parser(), extensionRegistryLite));
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
                if (f17908g == null) {
                    synchronized (C7219t0.class) {
                        if (f17908g == null) {
                            f17908g = new DefaultInstanceBasedParser(f17907f);
                        }
                    }
                }
                return f17908g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17907f;
    }

    public C7210s0 getFriends(int i) {
        return (C7210s0) this.f17909e.get(i);
    }

    public int getFriendsCount() {
        return this.f17909e.size();
    }

    public List<C7210s0> getFriendsList() {
        return this.f17909e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17909e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17909e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17909e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17909e.get(i));
        }
    }
}
