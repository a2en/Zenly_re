package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
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
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.UserProto$DisabledNotifications */
public final class UserProto$DisabledNotifications extends GeneratedMessageLite<UserProto$DisabledNotifications, C6922a> implements UserProto$DisabledNotificationsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final UserProto$DisabledNotifications f16998h = new UserProto$DisabledNotifications();

    /* renamed from: i */
    private static volatile Parser<UserProto$DisabledNotifications> f16999i;

    /* renamed from: e */
    private int f17000e;

    /* renamed from: f */
    private int f17001f;

    /* renamed from: g */
    private ProtobufList<C6923b> f17002g = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.UserProto$DisabledNotifications$PerUserOrBuilder */
    public interface PerUserOrBuilder extends MessageLiteOrBuilder {
        int getBitfield();

        String getUserUuid();

        ByteString getUserUuidBytes();
    }

    /* renamed from: co.znly.models.UserProto$DisabledNotifications$a */
    public static final class C6922a extends Builder<UserProto$DisabledNotifications, C6922a> implements UserProto$DisabledNotificationsOrBuilder {
        /* synthetic */ C6922a(C7519z2 z2Var) {
            this();
        }

        /* renamed from: a */
        public C6922a mo17883a(int i) {
            copyOnWrite();
            ((UserProto$DisabledNotifications) this.instance).m17645a(i);
            return this;
        }

        public int getGlobally() {
            return ((UserProto$DisabledNotifications) this.instance).getGlobally();
        }

        public C6923b getPerUser(int i) {
            return ((UserProto$DisabledNotifications) this.instance).getPerUser(i);
        }

        public int getPerUserCount() {
            return ((UserProto$DisabledNotifications) this.instance).getPerUserCount();
        }

        public List<C6923b> getPerUserList() {
            return Collections.unmodifiableList(((UserProto$DisabledNotifications) this.instance).getPerUserList());
        }

        private C6922a() {
            super(UserProto$DisabledNotifications.f16998h);
        }

        /* renamed from: a */
        public C6922a mo17884a(Iterable<? extends C6923b> iterable) {
            copyOnWrite();
            ((UserProto$DisabledNotifications) this.instance).m17649a(iterable);
            return this;
        }

        /* renamed from: a */
        public C6922a mo17882a() {
            copyOnWrite();
            ((UserProto$DisabledNotifications) this.instance).m17650b();
            return this;
        }
    }

    /* renamed from: co.znly.models.UserProto$DisabledNotifications$b */
    public static final class C6923b extends GeneratedMessageLite<C6923b, C6924a> implements PerUserOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6923b f17003g = new C6923b();

        /* renamed from: h */
        private static volatile Parser<C6923b> f17004h;

        /* renamed from: e */
        private String f17005e = "";

        /* renamed from: f */
        private int f17006f;

        /* renamed from: co.znly.models.UserProto$DisabledNotifications$b$a */
        public static final class C6924a extends Builder<C6923b, C6924a> implements PerUserOrBuilder {
            /* synthetic */ C6924a(C7519z2 z2Var) {
                this();
            }

            /* renamed from: a */
            public C6924a mo17886a(String str) {
                copyOnWrite();
                ((C6923b) this.instance).m17658a(str);
                return this;
            }

            public int getBitfield() {
                return ((C6923b) this.instance).getBitfield();
            }

            public String getUserUuid() {
                return ((C6923b) this.instance).getUserUuid();
            }

            public ByteString getUserUuidBytes() {
                return ((C6923b) this.instance).getUserUuidBytes();
            }

            private C6924a() {
                super(C6923b.f17003g);
            }

            /* renamed from: a */
            public C6924a mo17885a(int i) {
                copyOnWrite();
                ((C6923b) this.instance).m17655a(i);
                return this;
            }
        }

        static {
            f17003g.makeImmutable();
        }

        private C6923b() {
        }

        public static C6924a newBuilder() {
            return (C6924a) f17003g.toBuilder();
        }

        public static Parser<C6923b> parser() {
            return f17003g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6923b();
                case 2:
                    return f17003g;
                case 3:
                    return null;
                case 4:
                    return new C6924a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6923b bVar = (C6923b) obj2;
                    this.f17005e = visitor.visitString(!this.f17005e.isEmpty(), this.f17005e, !bVar.f17005e.isEmpty(), bVar.f17005e);
                    boolean z2 = this.f17006f != 0;
                    int i = this.f17006f;
                    if (bVar.f17006f != 0) {
                        z = true;
                    }
                    this.f17006f = visitor.visitInt(z2, i, z, bVar.f17006f);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.f17005e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f17006f = codedInputStream.readInt32();
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
                    if (f17004h == null) {
                        synchronized (C6923b.class) {
                            if (f17004h == null) {
                                f17004h = new DefaultInstanceBasedParser(f17003g);
                            }
                        }
                    }
                    return f17004h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17003g;
        }

        public int getBitfield() {
            return this.f17006f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17005e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
            }
            int i3 = this.f17006f;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(2, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUserUuid() {
            return this.f17005e;
        }

        public ByteString getUserUuidBytes() {
            return ByteString.copyFromUtf8(this.f17005e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17005e.isEmpty()) {
                codedOutputStream.writeString(1, getUserUuid());
            }
            int i = this.f17006f;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17658a(String str) {
            if (str != null) {
                this.f17005e = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17655a(int i) {
            this.f17006f = i;
        }
    }

    static {
        f16998h.makeImmutable();
    }

    private UserProto$DisabledNotifications() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17650b() {
        this.f17002g = GeneratedMessageLite.emptyProtobufList();
    }

    /* renamed from: c */
    private void m17651c() {
        if (!this.f17002g.isModifiable()) {
            this.f17002g = GeneratedMessageLite.mutableCopy(this.f17002g);
        }
    }

    public static UserProto$DisabledNotifications getDefaultInstance() {
        return f16998h;
    }

    public static Parser<UserProto$DisabledNotifications> parser() {
        return f16998h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7519z2.f18891a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserProto$DisabledNotifications();
            case 2:
                return f16998h;
            case 3:
                this.f17002g.makeImmutable();
                return null;
            case 4:
                return new C6922a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                UserProto$DisabledNotifications userProto$DisabledNotifications = (UserProto$DisabledNotifications) obj2;
                boolean z2 = this.f17001f != 0;
                int i = this.f17001f;
                if (userProto$DisabledNotifications.f17001f != 0) {
                    z = true;
                }
                this.f17001f = visitor.visitInt(z2, i, z, userProto$DisabledNotifications.f17001f);
                this.f17002g = visitor.visitList(this.f17002g, userProto$DisabledNotifications.f17002g);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17000e |= userProto$DisabledNotifications.f17000e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f17001f = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                if (!this.f17002g.isModifiable()) {
                                    this.f17002g = GeneratedMessageLite.mutableCopy(this.f17002g);
                                }
                                this.f17002g.add(codedInputStream.readMessage(C6923b.parser(), extensionRegistryLite));
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
                if (f16999i == null) {
                    synchronized (UserProto$DisabledNotifications.class) {
                        if (f16999i == null) {
                            f16999i = new DefaultInstanceBasedParser(f16998h);
                        }
                    }
                }
                return f16999i;
            default:
                throw new UnsupportedOperationException();
        }
        return f16998h;
    }

    public int getGlobally() {
        return this.f17001f;
    }

    public C6923b getPerUser(int i) {
        return (C6923b) this.f17002g.get(i);
    }

    public int getPerUserCount() {
        return this.f17002g.size();
    }

    public List<C6923b> getPerUserList() {
        return this.f17002g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.f17001f;
        int computeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
        for (int i3 = 0; i3 < this.f17002g.size(); i3++) {
            computeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f17002g.get(i3));
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f17001f;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        for (int i2 = 0; i2 < this.f17002g.size(); i2++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f17002g.get(i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17645a(int i) {
        this.f17001f = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17649a(Iterable<? extends C6923b> iterable) {
        m17651c();
        AbstractMessageLite.addAll(iterable, this.f17002g);
    }
}
