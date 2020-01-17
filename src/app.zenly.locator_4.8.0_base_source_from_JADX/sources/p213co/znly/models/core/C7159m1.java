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
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.core.m1 */
public final class C7159m1 extends GeneratedMessageLite<C7159m1, C7160a> implements StatesProto$MutualFriendsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7159m1 f17732f = new C7159m1();

    /* renamed from: g */
    private static volatile Parser<C7159m1> f17733g;

    /* renamed from: e */
    private ProtobufList<UserProto$User> f17734e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.m1$a */
    public static final class C7160a extends Builder<C7159m1, C7160a> implements StatesProto$MutualFriendsStateOrBuilder {
        /* synthetic */ C7160a(C7137k1 k1Var) {
            this();
        }

        public UserProto$User getFriends(int i) {
            return ((C7159m1) this.instance).getFriends(i);
        }

        public int getFriendsCount() {
            return ((C7159m1) this.instance).getFriendsCount();
        }

        public List<UserProto$User> getFriendsList() {
            return Collections.unmodifiableList(((C7159m1) this.instance).getFriendsList());
        }

        private C7160a() {
            super(C7159m1.f17732f);
        }
    }

    static {
        f17732f.makeImmutable();
    }

    private C7159m1() {
    }

    public static C7160a newBuilder() {
        return (C7160a) f17732f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7159m1();
            case 2:
                return f17732f;
            case 3:
                this.f17734e.makeImmutable();
                return null;
            case 4:
                return new C7160a(null);
            case 5:
                this.f17734e = ((Visitor) obj).visitList(this.f17734e, ((C7159m1) obj2).f17734e);
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
                                if (!this.f17734e.isModifiable()) {
                                    this.f17734e = GeneratedMessageLite.mutableCopy(this.f17734e);
                                }
                                this.f17734e.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
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
                if (f17733g == null) {
                    synchronized (C7159m1.class) {
                        if (f17733g == null) {
                            f17733g = new DefaultInstanceBasedParser(f17732f);
                        }
                    }
                }
                return f17733g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17732f;
    }

    public UserProto$User getFriends(int i) {
        return (UserProto$User) this.f17734e.get(i);
    }

    public int getFriendsCount() {
        return this.f17734e.size();
    }

    public List<UserProto$User> getFriendsList() {
        return this.f17734e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17734e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17734e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17734e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17734e.get(i));
        }
    }
}
