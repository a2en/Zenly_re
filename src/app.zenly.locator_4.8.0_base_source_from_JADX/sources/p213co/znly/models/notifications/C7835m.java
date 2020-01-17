package p213co.znly.models.notifications;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: co.znly.models.notifications.m */
public final class C7835m extends GeneratedMessageLite<C7835m, C7836a> implements NotificationProto$EnableAlwaysOnLocationNotificationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7835m f19586g = new C7835m();

    /* renamed from: h */
    private static volatile Parser<C7835m> f19587h;

    /* renamed from: e */
    private UserProto$User f19588e;

    /* renamed from: f */
    private UserProto$User f19589f;

    /* renamed from: co.znly.models.notifications.m$a */
    public static final class C7836a extends Builder<C7835m, C7836a> implements NotificationProto$EnableAlwaysOnLocationNotificationOrBuilder {
        /* synthetic */ C7836a(C7790a aVar) {
            this();
        }

        public UserProto$User getAuthor() {
            return ((C7835m) this.instance).getAuthor();
        }

        public UserProto$User getTarget() {
            return ((C7835m) this.instance).getTarget();
        }

        public boolean hasAuthor() {
            return ((C7835m) this.instance).hasAuthor();
        }

        public boolean hasTarget() {
            return ((C7835m) this.instance).hasTarget();
        }

        private C7836a() {
            super(C7835m.f19586g);
        }
    }

    static {
        f19586g.makeImmutable();
    }

    private C7835m() {
    }

    public static C7835m getDefaultInstance() {
        return f19586g;
    }

    public static Parser<C7835m> parser() {
        return f19586g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7790a.f19468b[methodToInvoke.ordinal()]) {
            case 1:
                return new C7835m();
            case 2:
                return f19586g;
            case 3:
                return null;
            case 4:
                return new C7836a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7835m mVar = (C7835m) obj2;
                this.f19588e = (UserProto$User) visitor.visitMessage(this.f19588e, mVar.f19588e);
                this.f19589f = (UserProto$User) visitor.visitMessage(this.f19589f, mVar.f19589f);
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
                                Builder builder = this.f19588e != null ? (C6925a) this.f19588e.toBuilder() : null;
                                this.f19588e = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19588e);
                                    this.f19588e = (UserProto$User) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19589f != null ? (C6925a) this.f19589f.toBuilder() : null;
                                this.f19589f = (UserProto$User) codedInputStream.readMessage(UserProto$User.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19589f);
                                    this.f19589f = (UserProto$User) builder2.buildPartial();
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
                if (f19587h == null) {
                    synchronized (C7835m.class) {
                        if (f19587h == null) {
                            f19587h = new DefaultInstanceBasedParser(f19586g);
                        }
                    }
                }
                return f19587h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19586g;
    }

    public UserProto$User getAuthor() {
        UserProto$User userProto$User = this.f19588e;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19588e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getAuthor());
        }
        if (this.f19589f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getTarget());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public UserProto$User getTarget() {
        UserProto$User userProto$User = this.f19589f;
        return userProto$User == null ? UserProto$User.getDefaultInstance() : userProto$User;
    }

    public boolean hasAuthor() {
        return this.f19588e != null;
    }

    public boolean hasTarget() {
        return this.f19589f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19588e != null) {
            codedOutputStream.writeMessage(1, getAuthor());
        }
        if (this.f19589f != null) {
            codedOutputStream.writeMessage(2, getTarget());
        }
    }
}
