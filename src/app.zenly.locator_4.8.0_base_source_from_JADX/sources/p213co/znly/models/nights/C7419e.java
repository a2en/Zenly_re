package p213co.znly.models.nights;

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
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.nights.C7411b.C7412a;
import p213co.znly.models.nights.C7413c.C7414a;

/* renamed from: co.znly.models.nights.e */
public final class C7419e extends GeneratedMessageLite<C7419e, C7420a> implements NightsProto$NightOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7419e f18544j = new C7419e();

    /* renamed from: k */
    private static volatile Parser<C7419e> f18545k;

    /* renamed from: e */
    private int f18546e;

    /* renamed from: f */
    private C7411b f18547f;

    /* renamed from: g */
    private C7413c f18548g;

    /* renamed from: h */
    private C7413c f18549h;

    /* renamed from: i */
    private ProtobufList<String> f18550i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.nights.e$a */
    public static final class C7420a extends Builder<C7419e, C7420a> implements NightsProto$NightOrBuilder {
        /* synthetic */ C7420a(C7410a aVar) {
            this();
        }

        public C7413c getBedTime() {
            return ((C7419e) this.instance).getBedTime();
        }

        public String getFriends(int i) {
            return ((C7419e) this.instance).getFriends(i);
        }

        public ByteString getFriendsBytes(int i) {
            return ((C7419e) this.instance).getFriendsBytes(i);
        }

        public int getFriendsCount() {
            return ((C7419e) this.instance).getFriendsCount();
        }

        public List<String> getFriendsList() {
            return Collections.unmodifiableList(((C7419e) this.instance).getFriendsList());
        }

        public C7411b getNightDate() {
            return ((C7419e) this.instance).getNightDate();
        }

        public C7413c getWakeupTime() {
            return ((C7419e) this.instance).getWakeupTime();
        }

        public boolean hasBedTime() {
            return ((C7419e) this.instance).hasBedTime();
        }

        public boolean hasNightDate() {
            return ((C7419e) this.instance).hasNightDate();
        }

        public boolean hasWakeupTime() {
            return ((C7419e) this.instance).hasWakeupTime();
        }

        private C7420a() {
            super(C7419e.f18544j);
        }
    }

    static {
        f18544j.makeImmutable();
    }

    private C7419e() {
    }

    public static Parser<C7419e> parser() {
        return f18544j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7410a.f18522a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7419e();
            case 2:
                return f18544j;
            case 3:
                this.f18550i.makeImmutable();
                return null;
            case 4:
                return new C7420a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7419e eVar = (C7419e) obj2;
                this.f18547f = (C7411b) visitor.visitMessage(this.f18547f, eVar.f18547f);
                this.f18548g = (C7413c) visitor.visitMessage(this.f18548g, eVar.f18548g);
                this.f18549h = (C7413c) visitor.visitMessage(this.f18549h, eVar.f18549h);
                this.f18550i = visitor.visitList(this.f18550i, eVar.f18550i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18546e |= eVar.f18546e;
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
                                Builder builder = this.f18547f != null ? (C7412a) this.f18547f.toBuilder() : null;
                                this.f18547f = (C7411b) codedInputStream.readMessage(C7411b.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18547f);
                                    this.f18547f = (C7411b) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f18548g != null ? (C7414a) this.f18548g.toBuilder() : null;
                                this.f18548g = (C7413c) codedInputStream.readMessage(C7413c.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18548g);
                                    this.f18548g = (C7413c) builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder3 = this.f18549h != null ? (C7414a) this.f18549h.toBuilder() : null;
                                this.f18549h = (C7413c) codedInputStream.readMessage(C7413c.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f18549h);
                                    this.f18549h = (C7413c) builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!this.f18550i.isModifiable()) {
                                    this.f18550i = GeneratedMessageLite.mutableCopy(this.f18550i);
                                }
                                this.f18550i.add(readStringRequireUtf8);
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
                if (f18545k == null) {
                    synchronized (C7419e.class) {
                        if (f18545k == null) {
                            f18545k = new DefaultInstanceBasedParser(f18544j);
                        }
                    }
                }
                return f18545k;
            default:
                throw new UnsupportedOperationException();
        }
        return f18544j;
    }

    public C7413c getBedTime() {
        C7413c cVar = this.f18548g;
        return cVar == null ? C7413c.getDefaultInstance() : cVar;
    }

    public String getFriends(int i) {
        return (String) this.f18550i.get(i);
    }

    public ByteString getFriendsBytes(int i) {
        return ByteString.copyFromUtf8((String) this.f18550i.get(i));
    }

    public int getFriendsCount() {
        return this.f18550i.size();
    }

    public List<String> getFriendsList() {
        return this.f18550i;
    }

    public C7411b getNightDate() {
        C7411b bVar = this.f18547f;
        return bVar == null ? C7411b.getDefaultInstance() : bVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.f18547f != null ? CodedOutputStream.computeMessageSize(1, getNightDate()) + 0 : 0;
        if (this.f18548g != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getBedTime());
        }
        if (this.f18549h != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getWakeupTime());
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18550i.size(); i3++) {
            i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f18550i.get(i3));
        }
        int size = computeMessageSize + i2 + (getFriendsList().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    public C7413c getWakeupTime() {
        C7413c cVar = this.f18549h;
        return cVar == null ? C7413c.getDefaultInstance() : cVar;
    }

    public boolean hasBedTime() {
        return this.f18548g != null;
    }

    public boolean hasNightDate() {
        return this.f18547f != null;
    }

    public boolean hasWakeupTime() {
        return this.f18549h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18547f != null) {
            codedOutputStream.writeMessage(1, getNightDate());
        }
        if (this.f18548g != null) {
            codedOutputStream.writeMessage(2, getBedTime());
        }
        if (this.f18549h != null) {
            codedOutputStream.writeMessage(3, getWakeupTime());
        }
        for (int i = 0; i < this.f18550i.size(); i++) {
            codedOutputStream.writeString(4, (String) this.f18550i.get(i));
        }
    }
}
