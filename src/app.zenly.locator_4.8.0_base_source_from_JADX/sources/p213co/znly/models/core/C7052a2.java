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
import p213co.znly.models.C7339i;
import p213co.znly.models.C7370k;

/* renamed from: co.znly.models.core.a2 */
public final class C7052a2 extends GeneratedMessageLite<C7052a2, C7053a> implements TypesProto$ContactSearchOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7052a2 f17441g = new C7052a2();

    /* renamed from: h */
    private static volatile Parser<C7052a2> f17442h;

    /* renamed from: e */
    private ProtobufList<C7339i> f17443e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: f */
    private ProtobufList<C7370k> f17444f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.a2$a */
    public static final class C7053a extends Builder<C7052a2, C7053a> implements TypesProto$ContactSearchOrBuilder {
        /* synthetic */ C7053a(C7253x1 x1Var) {
            this();
        }

        public C7370k getAlready(int i) {
            return ((C7052a2) this.instance).getAlready(i);
        }

        public int getAlreadyCount() {
            return ((C7052a2) this.instance).getAlreadyCount();
        }

        public List<C7370k> getAlreadyList() {
            return Collections.unmodifiableList(((C7052a2) this.instance).getAlreadyList());
        }

        public C7339i getContacts(int i) {
            return ((C7052a2) this.instance).getContacts(i);
        }

        public int getContactsCount() {
            return ((C7052a2) this.instance).getContactsCount();
        }

        public List<C7339i> getContactsList() {
            return Collections.unmodifiableList(((C7052a2) this.instance).getContactsList());
        }

        private C7053a() {
            super(C7052a2.f17441g);
        }
    }

    static {
        f17441g.makeImmutable();
    }

    private C7052a2() {
    }

    public static C7053a newBuilder() {
        return (C7053a) f17441g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7052a2();
            case 2:
                return f17441g;
            case 3:
                this.f17443e.makeImmutable();
                this.f17444f.makeImmutable();
                return null;
            case 4:
                return new C7053a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7052a2 a2Var = (C7052a2) obj2;
                this.f17443e = visitor.visitList(this.f17443e, a2Var.f17443e);
                this.f17444f = visitor.visitList(this.f17444f, a2Var.f17444f);
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
                                if (!this.f17443e.isModifiable()) {
                                    this.f17443e = GeneratedMessageLite.mutableCopy(this.f17443e);
                                }
                                this.f17443e.add(codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite));
                            } else if (readTag == 18) {
                                if (!this.f17444f.isModifiable()) {
                                    this.f17444f = GeneratedMessageLite.mutableCopy(this.f17444f);
                                }
                                this.f17444f.add(codedInputStream.readMessage(C7370k.parser(), extensionRegistryLite));
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
                if (f17442h == null) {
                    synchronized (C7052a2.class) {
                        if (f17442h == null) {
                            f17442h = new DefaultInstanceBasedParser(f17441g);
                        }
                    }
                }
                return f17442h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17441g;
    }

    public C7370k getAlready(int i) {
        return (C7370k) this.f17444f.get(i);
    }

    public int getAlreadyCount() {
        return this.f17444f.size();
    }

    public List<C7370k> getAlreadyList() {
        return this.f17444f;
    }

    public C7339i getContacts(int i) {
        return (C7339i) this.f17443e.get(i);
    }

    public int getContactsCount() {
        return this.f17443e.size();
    }

    public List<C7339i> getContactsList() {
        return this.f17443e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17443e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17443e.get(i3));
        }
        for (int i4 = 0; i4 < this.f17444f.size(); i4++) {
            i2 += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f17444f.get(i4));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17443e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17443e.get(i));
        }
        for (int i2 = 0; i2 < this.f17444f.size(); i2++) {
            codedOutputStream.writeMessage(2, (MessageLite) this.f17444f.get(i2));
        }
    }
}
