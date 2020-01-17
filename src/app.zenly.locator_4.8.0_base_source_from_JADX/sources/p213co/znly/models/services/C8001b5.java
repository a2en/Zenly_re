package p213co.znly.models.services;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
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
import p213co.znly.models.timetogether.C8437d;
import p213co.znly.models.timetogether.C8437d.C8438a;
import p213co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;

/* renamed from: co.znly.models.services.b5 */
public final class C8001b5 extends GeneratedMessageLite<C8001b5, C8002a> implements ZenlyProto$TimeTogetherResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8001b5 f20304j = new C8001b5();

    /* renamed from: k */
    private static volatile Parser<C8001b5> f20305k;

    /* renamed from: e */
    private int f20306e;

    /* renamed from: f */
    private String f20307f = "";

    /* renamed from: g */
    private ProtobufList<TimeTogetherProto$Tst> f20308g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: h */
    private ProtobufList<TimeTogetherProto$FriendsPerCategory> f20309h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: i */
    private C8437d f20310i;

    /* renamed from: co.znly.models.services.b5$a */
    public static final class C8002a extends Builder<C8001b5, C8002a> implements ZenlyProto$TimeTogetherResponseOrBuilder {
        private C8002a() {
            super(C8001b5.f20304j);
        }

        /* synthetic */ C8002a(C8104i0 i0Var) {
            this();
        }

        public TimeTogetherProto$FriendsPerCategory getFriends(int i) {
            return ((C8001b5) this.instance).getFriends(i);
        }

        public int getFriendsCount() {
            return ((C8001b5) this.instance).getFriendsCount();
        }

        public List<TimeTogetherProto$FriendsPerCategory> getFriendsList() {
            return Collections.unmodifiableList(((C8001b5) this.instance).getFriendsList());
        }

        public C8437d getMyTst() {
            return ((C8001b5) this.instance).getMyTst();
        }

        public TimeTogetherProto$Tst getTsts(int i) {
            return ((C8001b5) this.instance).getTsts(i);
        }

        public int getTstsCount() {
            return ((C8001b5) this.instance).getTstsCount();
        }

        public List<TimeTogetherProto$Tst> getTstsList() {
            return Collections.unmodifiableList(((C8001b5) this.instance).getTstsList());
        }

        public String getUserId() {
            return ((C8001b5) this.instance).getUserId();
        }

        public ByteString getUserIdBytes() {
            return ((C8001b5) this.instance).getUserIdBytes();
        }

        public boolean hasMyTst() {
            return ((C8001b5) this.instance).hasMyTst();
        }
    }

    static {
        f20304j.makeImmutable();
    }

    private C8001b5() {
    }

    public static C8002a newBuilder() {
        return (C8002a) f20304j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        List list;
        MessageLite readMessage;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8001b5();
            case 2:
                return f20304j;
            case 3:
                this.f20308g.makeImmutable();
                this.f20309h.makeImmutable();
                return null;
            case 4:
                return new C8002a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8001b5 b5Var = (C8001b5) obj2;
                this.f20307f = visitor.visitString(!this.f20307f.isEmpty(), this.f20307f, true ^ b5Var.f20307f.isEmpty(), b5Var.f20307f);
                this.f20308g = visitor.visitList(this.f20308g, b5Var.f20308g);
                this.f20309h = visitor.visitList(this.f20309h, b5Var.f20309h);
                this.f20310i = (C8437d) visitor.visitMessage(this.f20310i, b5Var.f20310i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f20306e |= b5Var.f20306e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag != 34) {
                                if (readTag == 42) {
                                    if (!this.f20308g.isModifiable()) {
                                        this.f20308g = GeneratedMessageLite.mutableCopy(this.f20308g);
                                    }
                                    list = this.f20308g;
                                    readMessage = codedInputStream.readMessage(TimeTogetherProto$Tst.parser(), extensionRegistryLite);
                                } else if (readTag == 50) {
                                    if (!this.f20309h.isModifiable()) {
                                        this.f20309h = GeneratedMessageLite.mutableCopy(this.f20309h);
                                    }
                                    list = this.f20309h;
                                    readMessage = codedInputStream.readMessage(TimeTogetherProto$FriendsPerCategory.parser(), extensionRegistryLite);
                                } else if (readTag == 58) {
                                    Builder builder = this.f20310i != null ? (C8438a) this.f20310i.toBuilder() : null;
                                    this.f20310i = (C8437d) codedInputStream.readMessage(C8437d.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f20310i);
                                        this.f20310i = (C8437d) builder.buildPartial();
                                    }
                                } else if (!codedInputStream.skipField(readTag)) {
                                }
                                list.add(readMessage);
                            } else {
                                this.f20307f = codedInputStream.readStringRequireUtf8();
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
                if (f20305k == null) {
                    synchronized (C8001b5.class) {
                        if (f20305k == null) {
                            f20305k = new DefaultInstanceBasedParser(f20304j);
                        }
                    }
                }
                return f20305k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20304j;
    }

    public TimeTogetherProto$FriendsPerCategory getFriends(int i) {
        return (TimeTogetherProto$FriendsPerCategory) this.f20309h.get(i);
    }

    public int getFriendsCount() {
        return this.f20309h.size();
    }

    public List<TimeTogetherProto$FriendsPerCategory> getFriendsList() {
        return this.f20309h;
    }

    public C8437d getMyTst() {
        C8437d dVar = this.f20310i;
        return dVar == null ? C8437d.getDefaultInstance() : dVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f20307f.isEmpty() ? CodedOutputStream.computeStringSize(4, getUserId()) + 0 : 0;
        for (int i2 = 0; i2 < this.f20308g.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f20308g.get(i2));
        }
        for (int i3 = 0; i3 < this.f20309h.size(); i3++) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f20309h.get(i3));
        }
        if (this.f20310i != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(7, getMyTst());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public TimeTogetherProto$Tst getTsts(int i) {
        return (TimeTogetherProto$Tst) this.f20308g.get(i);
    }

    public int getTstsCount() {
        return this.f20308g.size();
    }

    public List<TimeTogetherProto$Tst> getTstsList() {
        return this.f20308g;
    }

    public String getUserId() {
        return this.f20307f;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.f20307f);
    }

    public boolean hasMyTst() {
        return this.f20310i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20307f.isEmpty()) {
            codedOutputStream.writeString(4, getUserId());
        }
        for (int i = 0; i < this.f20308g.size(); i++) {
            codedOutputStream.writeMessage(5, (MessageLite) this.f20308g.get(i));
        }
        for (int i2 = 0; i2 < this.f20309h.size(); i2++) {
            codedOutputStream.writeMessage(6, (MessageLite) this.f20309h.get(i2));
        }
        if (this.f20310i != null) {
            codedOutputStream.writeMessage(7, getMyTst());
        }
    }
}
