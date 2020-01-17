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

/* renamed from: co.znly.models.core.o1 */
public final class C7180o1 extends GeneratedMessageLite<C7180o1, C7181a> implements StatesProto$PublicFriendsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7180o1 f17788f = new C7180o1();

    /* renamed from: g */
    private static volatile Parser<C7180o1> f17789g;

    /* renamed from: e */
    private ProtobufList<UserProto$User> f17790e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.o1$a */
    public static final class C7181a extends Builder<C7180o1, C7181a> implements StatesProto$PublicFriendsStateOrBuilder {
        /* synthetic */ C7181a(C7137k1 k1Var) {
            this();
        }

        public UserProto$User getFriends(int i) {
            return ((C7180o1) this.instance).getFriends(i);
        }

        public int getFriendsCount() {
            return ((C7180o1) this.instance).getFriendsCount();
        }

        public List<UserProto$User> getFriendsList() {
            return Collections.unmodifiableList(((C7180o1) this.instance).getFriendsList());
        }

        private C7181a() {
            super(C7180o1.f17788f);
        }
    }

    static {
        f17788f.makeImmutable();
    }

    private C7180o1() {
    }

    public static C7181a newBuilder() {
        return (C7181a) f17788f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7180o1();
            case 2:
                return f17788f;
            case 3:
                this.f17790e.makeImmutable();
                return null;
            case 4:
                return new C7181a(null);
            case 5:
                this.f17790e = ((Visitor) obj).visitList(this.f17790e, ((C7180o1) obj2).f17790e);
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
                                if (!this.f17790e.isModifiable()) {
                                    this.f17790e = GeneratedMessageLite.mutableCopy(this.f17790e);
                                }
                                this.f17790e.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
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
                if (f17789g == null) {
                    synchronized (C7180o1.class) {
                        if (f17789g == null) {
                            f17789g = new DefaultInstanceBasedParser(f17788f);
                        }
                    }
                }
                return f17789g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17788f;
    }

    public UserProto$User getFriends(int i) {
        return (UserProto$User) this.f17790e.get(i);
    }

    public int getFriendsCount() {
        return this.f17790e.size();
    }

    public List<UserProto$User> getFriendsList() {
        return this.f17790e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17790e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17790e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17790e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17790e.get(i));
        }
    }
}
