package p213co.znly.models.core;

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
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.ChatProto$ChatActivities */
public final class ChatProto$ChatActivities extends GeneratedMessageLite<ChatProto$ChatActivities, C6984b> implements ChatProto$ChatActivitiesOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final ChatProto$ChatActivities f17234f = new ChatProto$ChatActivities();

    /* renamed from: g */
    private static volatile Parser<ChatProto$ChatActivities> f17235g;

    /* renamed from: e */
    private ProtobufList<C6982a> f17236e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.ChatProto$ChatActivities$ActivitiesOrBuilder */
    public interface ActivitiesOrBuilder extends MessageLiteOrBuilder {
        long getActivity();

        String getUserUuid();

        ByteString getUserUuidBytes();
    }

    /* renamed from: co.znly.models.core.ChatProto$ChatActivities$a */
    public static final class C6982a extends GeneratedMessageLite<C6982a, C6983a> implements ActivitiesOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6982a f17237g = new C6982a();

        /* renamed from: h */
        private static volatile Parser<C6982a> f17238h;

        /* renamed from: e */
        private String f17239e = "";

        /* renamed from: f */
        private long f17240f;

        /* renamed from: co.znly.models.core.ChatProto$ChatActivities$a$a */
        public static final class C6983a extends Builder<C6982a, C6983a> implements ActivitiesOrBuilder {
            /* synthetic */ C6983a(C7066c cVar) {
                this();
            }

            public long getActivity() {
                return ((C6982a) this.instance).getActivity();
            }

            public String getUserUuid() {
                return ((C6982a) this.instance).getUserUuid();
            }

            public ByteString getUserUuidBytes() {
                return ((C6982a) this.instance).getUserUuidBytes();
            }

            private C6983a() {
                super(C6982a.f17237g);
            }
        }

        static {
            f17237g.makeImmutable();
        }

        private C6982a() {
        }

        public static Parser<C6982a> parser() {
            return f17237g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6982a();
                case 2:
                    return f17237g;
                case 3:
                    return null;
                case 4:
                    return new C6983a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6982a aVar = (C6982a) obj2;
                    this.f17239e = visitor.visitString(!this.f17239e.isEmpty(), this.f17239e, !aVar.f17239e.isEmpty(), aVar.f17239e);
                    this.f17240f = visitor.visitLong(this.f17240f != 0, this.f17240f, aVar.f17240f != 0, aVar.f17240f);
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
                                    this.f17239e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f17240f = codedInputStream.readInt64();
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
                    if (f17238h == null) {
                        synchronized (C6982a.class) {
                            if (f17238h == null) {
                                f17238h = new DefaultInstanceBasedParser(f17237g);
                            }
                        }
                    }
                    return f17238h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17237g;
        }

        public long getActivity() {
            return this.f17240f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f17239e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getUserUuid());
            }
            long j = this.f17240f;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(2, j);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String getUserUuid() {
            return this.f17239e;
        }

        public ByteString getUserUuidBytes() {
            return ByteString.copyFromUtf8(this.f17239e);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f17239e.isEmpty()) {
                codedOutputStream.writeString(1, getUserUuid());
            }
            long j = this.f17240f;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
        }
    }

    /* renamed from: co.znly.models.core.ChatProto$ChatActivities$b */
    public static final class C6984b extends Builder<ChatProto$ChatActivities, C6984b> implements ChatProto$ChatActivitiesOrBuilder {
        /* synthetic */ C6984b(C7066c cVar) {
            this();
        }

        public C6982a getActivities(int i) {
            return ((ChatProto$ChatActivities) this.instance).getActivities(i);
        }

        public int getActivitiesCount() {
            return ((ChatProto$ChatActivities) this.instance).getActivitiesCount();
        }

        public List<C6982a> getActivitiesList() {
            return Collections.unmodifiableList(((ChatProto$ChatActivities) this.instance).getActivitiesList());
        }

        private C6984b() {
            super(ChatProto$ChatActivities.f17234f);
        }
    }

    static {
        f17234f.makeImmutable();
    }

    private ChatProto$ChatActivities() {
    }

    public static C6984b newBuilder() {
        return (C6984b) f17234f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new ChatProto$ChatActivities();
            case 2:
                return f17234f;
            case 3:
                this.f17236e.makeImmutable();
                return null;
            case 4:
                return new C6984b(null);
            case 5:
                this.f17236e = ((Visitor) obj).visitList(this.f17236e, ((ChatProto$ChatActivities) obj2).f17236e);
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
                                if (!this.f17236e.isModifiable()) {
                                    this.f17236e = GeneratedMessageLite.mutableCopy(this.f17236e);
                                }
                                this.f17236e.add(codedInputStream.readMessage(C6982a.parser(), extensionRegistryLite));
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
                if (f17235g == null) {
                    synchronized (ChatProto$ChatActivities.class) {
                        if (f17235g == null) {
                            f17235g = new DefaultInstanceBasedParser(f17234f);
                        }
                    }
                }
                return f17235g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17234f;
    }

    public C6982a getActivities(int i) {
        return (C6982a) this.f17236e.get(i);
    }

    public int getActivitiesCount() {
        return this.f17236e.size();
    }

    public List<C6982a> getActivitiesList() {
        return this.f17236e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17236e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17236e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17236e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17236e.get(i));
        }
    }
}
