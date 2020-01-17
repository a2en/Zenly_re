package p213co.znly.models;

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

/* renamed from: co.znly.models.q1 */
public final class C7447q1 extends GeneratedMessageLite<C7447q1, C7448a> implements PingProto$ChatLeaveGroupOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7447q1 f18630j = new C7447q1();

    /* renamed from: k */
    private static volatile Parser<C7447q1> f18631k;

    /* renamed from: e */
    private int f18632e;

    /* renamed from: f */
    private String f18633f;

    /* renamed from: g */
    private String f18634g;

    /* renamed from: h */
    private String f18635h;

    /* renamed from: i */
    private ProtobufList<UserProto$User> f18636i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.q1$a */
    public static final class C7448a extends Builder<C7447q1, C7448a> implements PingProto$ChatLeaveGroupOrBuilder {
        /* synthetic */ C7448a(C7383l1 l1Var) {
            this();
        }

        public String getConversationUuid() {
            return ((C7447q1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7447q1) this.instance).getConversationUuidBytes();
        }

        public String getLocale() {
            return ((C7447q1) this.instance).getLocale();
        }

        public ByteString getLocaleBytes() {
            return ((C7447q1) this.instance).getLocaleBytes();
        }

        public UserProto$User getMembers(int i) {
            return ((C7447q1) this.instance).getMembers(i);
        }

        public int getMembersCount() {
            return ((C7447q1) this.instance).getMembersCount();
        }

        public List<UserProto$User> getMembersList() {
            return Collections.unmodifiableList(((C7447q1) this.instance).getMembersList());
        }

        public String getUserUuid() {
            return ((C7447q1) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7447q1) this.instance).getUserUuidBytes();
        }

        private C7448a() {
            super(C7447q1.f18630j);
        }
    }

    static {
        f18630j.makeImmutable();
    }

    private C7447q1() {
        String str = "";
        this.f18633f = str;
        this.f18634g = str;
        this.f18635h = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7447q1();
            case 2:
                return f18630j;
            case 3:
                this.f18636i.makeImmutable();
                return null;
            case 4:
                return new C7448a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7447q1 q1Var = (C7447q1) obj2;
                this.f18633f = visitor.visitString(!this.f18633f.isEmpty(), this.f18633f, !q1Var.f18633f.isEmpty(), q1Var.f18633f);
                this.f18634g = visitor.visitString(!this.f18634g.isEmpty(), this.f18634g, !q1Var.f18634g.isEmpty(), q1Var.f18634g);
                this.f18635h = visitor.visitString(!this.f18635h.isEmpty(), this.f18635h, true ^ q1Var.f18635h.isEmpty(), q1Var.f18635h);
                this.f18636i = visitor.visitList(this.f18636i, q1Var.f18636i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18632e |= q1Var.f18632e;
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
                            if (readTag == 10) {
                                this.f18633f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18634g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f18635h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                if (!this.f18636i.isModifiable()) {
                                    this.f18636i = GeneratedMessageLite.mutableCopy(this.f18636i);
                                }
                                this.f18636i.add(codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite));
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
                if (f18631k == null) {
                    synchronized (C7447q1.class) {
                        if (f18631k == null) {
                            f18631k = new DefaultInstanceBasedParser(f18630j);
                        }
                    }
                }
                return f18631k;
            default:
                throw new UnsupportedOperationException();
        }
        return f18630j;
    }

    public String getConversationUuid() {
        return this.f18635h;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f18635h);
    }

    public String getLocale() {
        return this.f18634g;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.f18634g);
    }

    public UserProto$User getMembers(int i) {
        return (UserProto$User) this.f18636i.get(i);
    }

    public int getMembersCount() {
        return this.f18636i.size();
    }

    public List<UserProto$User> getMembersList() {
        return this.f18636i;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18633f.isEmpty() ? CodedOutputStream.computeStringSize(1, getUserUuid()) + 0 : 0;
        if (!this.f18634g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getLocale());
        }
        if (!this.f18635h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getConversationUuid());
        }
        for (int i2 = 0; i2 < this.f18636i.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f18636i.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public String getUserUuid() {
        return this.f18633f;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18633f);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18633f.isEmpty()) {
            codedOutputStream.writeString(1, getUserUuid());
        }
        if (!this.f18634g.isEmpty()) {
            codedOutputStream.writeString(2, getLocale());
        }
        if (!this.f18635h.isEmpty()) {
            codedOutputStream.writeString(3, getConversationUuid());
        }
        for (int i = 0; i < this.f18636i.size(); i++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f18636i.get(i));
        }
    }
}
