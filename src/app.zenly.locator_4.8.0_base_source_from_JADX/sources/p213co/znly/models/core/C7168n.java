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

/* renamed from: co.znly.models.core.n */
public final class C7168n extends GeneratedMessageLite<C7168n, C7169a> implements ChatProto$ConversationsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7168n f17754f = new C7168n();

    /* renamed from: g */
    private static volatile Parser<C7168n> f17755g;

    /* renamed from: e */
    private ProtobufList<C7117i> f17756e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.n$a */
    public static final class C7169a extends Builder<C7168n, C7169a> implements ChatProto$ConversationsOrBuilder {
        /* synthetic */ C7169a(C7066c cVar) {
            this();
        }

        public C7117i getConversations(int i) {
            return ((C7168n) this.instance).getConversations(i);
        }

        public int getConversationsCount() {
            return ((C7168n) this.instance).getConversationsCount();
        }

        public List<C7117i> getConversationsList() {
            return Collections.unmodifiableList(((C7168n) this.instance).getConversationsList());
        }

        private C7169a() {
            super(C7168n.f17754f);
        }
    }

    static {
        f17754f.makeImmutable();
    }

    private C7168n() {
    }

    public static C7168n getDefaultInstance() {
        return f17754f;
    }

    public static C7169a newBuilder() {
        return (C7169a) f17754f.toBuilder();
    }

    public static Parser<C7168n> parser() {
        return f17754f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7168n();
            case 2:
                return f17754f;
            case 3:
                this.f17756e.makeImmutable();
                return null;
            case 4:
                return new C7169a(null);
            case 5:
                this.f17756e = ((Visitor) obj).visitList(this.f17756e, ((C7168n) obj2).f17756e);
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
                                if (!this.f17756e.isModifiable()) {
                                    this.f17756e = GeneratedMessageLite.mutableCopy(this.f17756e);
                                }
                                this.f17756e.add(codedInputStream.readMessage(C7117i.parser(), extensionRegistryLite));
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
                if (f17755g == null) {
                    synchronized (C7168n.class) {
                        if (f17755g == null) {
                            f17755g = new DefaultInstanceBasedParser(f17754f);
                        }
                    }
                }
                return f17755g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17754f;
    }

    public C7117i getConversations(int i) {
        return (C7117i) this.f17756e.get(i);
    }

    public int getConversationsCount() {
        return this.f17756e.size();
    }

    public List<C7117i> getConversationsList() {
        return this.f17756e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17756e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17756e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17756e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17756e.get(i));
        }
    }
}
