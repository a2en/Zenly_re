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

/* renamed from: co.znly.models.core.l1 */
public final class C7144l1 extends GeneratedMessageLite<C7144l1, C7145a> implements StatesProto$ContactsStateOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7144l1 f17695f = new C7144l1();

    /* renamed from: g */
    private static volatile Parser<C7144l1> f17696g;

    /* renamed from: e */
    private ProtobufList<C7339i> f17697e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.l1$a */
    public static final class C7145a extends Builder<C7144l1, C7145a> implements StatesProto$ContactsStateOrBuilder {
        /* synthetic */ C7145a(C7137k1 k1Var) {
            this();
        }

        public C7339i getContacts(int i) {
            return ((C7144l1) this.instance).getContacts(i);
        }

        public int getContactsCount() {
            return ((C7144l1) this.instance).getContactsCount();
        }

        public List<C7339i> getContactsList() {
            return Collections.unmodifiableList(((C7144l1) this.instance).getContactsList());
        }

        private C7145a() {
            super(C7144l1.f17695f);
        }
    }

    static {
        f17695f.makeImmutable();
    }

    private C7144l1() {
    }

    public static C7145a newBuilder() {
        return (C7145a) f17695f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7137k1.f17675a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7144l1();
            case 2:
                return f17695f;
            case 3:
                this.f17697e.makeImmutable();
                return null;
            case 4:
                return new C7145a(null);
            case 5:
                this.f17697e = ((Visitor) obj).visitList(this.f17697e, ((C7144l1) obj2).f17697e);
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
                                if (!this.f17697e.isModifiable()) {
                                    this.f17697e = GeneratedMessageLite.mutableCopy(this.f17697e);
                                }
                                this.f17697e.add(codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite));
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
                if (f17696g == null) {
                    synchronized (C7144l1.class) {
                        if (f17696g == null) {
                            f17696g = new DefaultInstanceBasedParser(f17695f);
                        }
                    }
                }
                return f17696g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17695f;
    }

    public C7339i getContacts(int i) {
        return (C7339i) this.f17697e.get(i);
    }

    public int getContactsCount() {
        return this.f17697e.size();
    }

    public List<C7339i> getContactsList() {
        return this.f17697e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17697e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17697e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17697e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17697e.get(i));
        }
    }
}
