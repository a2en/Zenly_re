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

/* renamed from: co.znly.models.core.TypesProto$Gatherings */
public final class TypesProto$Gatherings extends GeneratedMessageLite<TypesProto$Gatherings, C7043a> implements TypesProto$GatheringsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final TypesProto$Gatherings f17425f = new TypesProto$Gatherings();

    /* renamed from: g */
    private static volatile Parser<TypesProto$Gatherings> f17426g;

    /* renamed from: e */
    private ProtobufList<C7044b> f17427e = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.core.TypesProto$Gatherings$GatheringOrBuilder */
    public interface GatheringOrBuilder extends MessageLiteOrBuilder {
        String getUserUuids(int i);

        ByteString getUserUuidsBytes(int i);

        int getUserUuidsCount();

        List<String> getUserUuidsList();
    }

    /* renamed from: co.znly.models.core.TypesProto$Gatherings$a */
    public static final class C7043a extends Builder<TypesProto$Gatherings, C7043a> implements TypesProto$GatheringsOrBuilder {
        /* synthetic */ C7043a(C7253x1 x1Var) {
            this();
        }

        public C7044b getGatherings(int i) {
            return ((TypesProto$Gatherings) this.instance).getGatherings(i);
        }

        public int getGatheringsCount() {
            return ((TypesProto$Gatherings) this.instance).getGatheringsCount();
        }

        public List<C7044b> getGatheringsList() {
            return Collections.unmodifiableList(((TypesProto$Gatherings) this.instance).getGatheringsList());
        }

        private C7043a() {
            super(TypesProto$Gatherings.f17425f);
        }
    }

    /* renamed from: co.znly.models.core.TypesProto$Gatherings$b */
    public static final class C7044b extends GeneratedMessageLite<C7044b, C7045a> implements GatheringOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C7044b f17428f = new C7044b();

        /* renamed from: g */
        private static volatile Parser<C7044b> f17429g;

        /* renamed from: e */
        private ProtobufList<String> f17430e = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.models.core.TypesProto$Gatherings$b$a */
        public static final class C7045a extends Builder<C7044b, C7045a> implements GatheringOrBuilder {
            /* synthetic */ C7045a(C7253x1 x1Var) {
                this();
            }

            public String getUserUuids(int i) {
                return ((C7044b) this.instance).getUserUuids(i);
            }

            public ByteString getUserUuidsBytes(int i) {
                return ((C7044b) this.instance).getUserUuidsBytes(i);
            }

            public int getUserUuidsCount() {
                return ((C7044b) this.instance).getUserUuidsCount();
            }

            public List<String> getUserUuidsList() {
                return Collections.unmodifiableList(((C7044b) this.instance).getUserUuidsList());
            }

            private C7045a() {
                super(C7044b.f17428f);
            }
        }

        static {
            f17428f.makeImmutable();
        }

        private C7044b() {
        }

        public static Parser<C7044b> parser() {
            return f17428f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C7044b();
                case 2:
                    return f17428f;
                case 3:
                    this.f17430e.makeImmutable();
                    return null;
                case 4:
                    return new C7045a(null);
                case 5:
                    this.f17430e = ((Visitor) obj).visitList(this.f17430e, ((C7044b) obj2).f17430e);
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
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.f17430e.isModifiable()) {
                                        this.f17430e = GeneratedMessageLite.mutableCopy(this.f17430e);
                                    }
                                    this.f17430e.add(readStringRequireUtf8);
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
                    if (f17429g == null) {
                        synchronized (C7044b.class) {
                            if (f17429g == null) {
                                f17429g = new DefaultInstanceBasedParser(f17428f);
                            }
                        }
                    }
                    return f17429g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f17428f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f17430e.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f17430e.get(i3));
            }
            int size = 0 + i2 + (getUserUuidsList().size() * 1);
            this.memoizedSerializedSize = size;
            return size;
        }

        public String getUserUuids(int i) {
            return (String) this.f17430e.get(i);
        }

        public ByteString getUserUuidsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.f17430e.get(i));
        }

        public int getUserUuidsCount() {
            return this.f17430e.size();
        }

        public List<String> getUserUuidsList() {
            return this.f17430e;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f17430e.size(); i++) {
                codedOutputStream.writeString(1, (String) this.f17430e.get(i));
            }
        }
    }

    static {
        f17425f.makeImmutable();
    }

    private TypesProto$Gatherings() {
    }

    public static C7043a newBuilder() {
        return (C7043a) f17425f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new TypesProto$Gatherings();
            case 2:
                return f17425f;
            case 3:
                this.f17427e.makeImmutable();
                return null;
            case 4:
                return new C7043a(null);
            case 5:
                this.f17427e = ((Visitor) obj).visitList(this.f17427e, ((TypesProto$Gatherings) obj2).f17427e);
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
                                if (!this.f17427e.isModifiable()) {
                                    this.f17427e = GeneratedMessageLite.mutableCopy(this.f17427e);
                                }
                                this.f17427e.add(codedInputStream.readMessage(C7044b.parser(), extensionRegistryLite));
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
                if (f17426g == null) {
                    synchronized (TypesProto$Gatherings.class) {
                        if (f17426g == null) {
                            f17426g = new DefaultInstanceBasedParser(f17425f);
                        }
                    }
                }
                return f17426g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17425f;
    }

    public C7044b getGatherings(int i) {
        return (C7044b) this.f17427e.get(i);
    }

    public int getGatheringsCount() {
        return this.f17427e.size();
    }

    public List<C7044b> getGatheringsList() {
        return this.f17427e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17427e.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f17427e.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f17427e.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f17427e.get(i));
        }
    }
}
