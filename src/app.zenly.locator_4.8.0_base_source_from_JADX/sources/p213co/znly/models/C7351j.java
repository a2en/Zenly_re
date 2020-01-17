package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MapEntryLite;
import p213co.znly.core.vendor.com.google.protobuf.MapFieldLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.WireFormat.FieldType;
import p213co.znly.models.C7339i.C7340a;

/* renamed from: co.znly.models.j */
public final class C7351j extends GeneratedMessageLite<C7351j, C7352a> implements ContactProto$ContactWithFriendsCountOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7351j f18299i = new C7351j();

    /* renamed from: j */
    private static volatile Parser<C7351j> f18300j;

    /* renamed from: e */
    private int f18301e;

    /* renamed from: f */
    private C7339i f18302f;

    /* renamed from: g */
    private int f18303g;

    /* renamed from: h */
    private MapFieldLite<String, Integer> f18304h = MapFieldLite.emptyMapField();

    /* renamed from: co.znly.models.j$a */
    public static final class C7352a extends Builder<C7351j, C7352a> implements ContactProto$ContactWithFriendsCountOrBuilder {
        /* synthetic */ C7352a(C7331h hVar) {
            this();
        }

        public boolean containsPotentialFriendsCounts(String str) {
            if (str != null) {
                return ((C7351j) this.instance).getPotentialFriendsCountsMap().containsKey(str);
            }
            throw new NullPointerException();
        }

        public C7339i getContact() {
            return ((C7351j) this.instance).getContact();
        }

        public int getPotentialFriendsCount() {
            return ((C7351j) this.instance).getPotentialFriendsCount();
        }

        @Deprecated
        public Map<String, Integer> getPotentialFriendsCounts() {
            return getPotentialFriendsCountsMap();
        }

        public int getPotentialFriendsCountsCount() {
            return ((C7351j) this.instance).getPotentialFriendsCountsMap().size();
        }

        public Map<String, Integer> getPotentialFriendsCountsMap() {
            return Collections.unmodifiableMap(((C7351j) this.instance).getPotentialFriendsCountsMap());
        }

        public int getPotentialFriendsCountsOrDefault(String str, int i) {
            if (str != null) {
                Map potentialFriendsCountsMap = ((C7351j) this.instance).getPotentialFriendsCountsMap();
                return potentialFriendsCountsMap.containsKey(str) ? ((Integer) potentialFriendsCountsMap.get(str)).intValue() : i;
            }
            throw new NullPointerException();
        }

        public int getPotentialFriendsCountsOrThrow(String str) {
            if (str != null) {
                Map potentialFriendsCountsMap = ((C7351j) this.instance).getPotentialFriendsCountsMap();
                if (potentialFriendsCountsMap.containsKey(str)) {
                    return ((Integer) potentialFriendsCountsMap.get(str)).intValue();
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public boolean hasContact() {
            return ((C7351j) this.instance).hasContact();
        }

        private C7352a() {
            super(C7351j.f18299i);
        }
    }

    /* renamed from: co.znly.models.j$b */
    private static final class C7353b {

        /* renamed from: a */
        static final MapEntryLite<String, Integer> f18305a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.INT32, Integer.valueOf(0));
    }

    static {
        f18299i.makeImmutable();
    }

    private C7351j() {
    }

    /* renamed from: b */
    private MapFieldLite<String, Integer> m18037b() {
        return this.f18304h;
    }

    public static C7351j getDefaultInstance() {
        return f18299i;
    }

    public static Parser<C7351j> parser() {
        return f18299i.getParserForType();
    }

    public boolean containsPotentialFriendsCounts(String str) {
        if (str != null) {
            return m18037b().containsKey(str);
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7331h.f18216a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7351j();
            case 2:
                return f18299i;
            case 3:
                this.f18304h.makeImmutable();
                return null;
            case 4:
                return new C7352a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7351j jVar = (C7351j) obj2;
                this.f18302f = (C7339i) visitor.visitMessage(this.f18302f, jVar.f18302f);
                boolean z2 = this.f18303g != 0;
                int i = this.f18303g;
                if (jVar.f18303g != 0) {
                    z = true;
                }
                this.f18303g = visitor.visitInt(z2, i, z, jVar.f18303g);
                this.f18304h = visitor.visitMap(this.f18304h, jVar.m18037b());
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18301e |= jVar.f18301e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f18302f != null ? (C7340a) this.f18302f.toBuilder() : null;
                                this.f18302f = (C7339i) codedInputStream.readMessage(C7339i.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18302f);
                                    this.f18302f = (C7339i) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f18303g = codedInputStream.readInt32();
                            } else if (readTag == 26) {
                                if (!this.f18304h.isMutable()) {
                                    this.f18304h = this.f18304h.mutableCopy();
                                }
                                C7353b.f18305a.parseInto(this.f18304h, codedInputStream, extensionRegistryLite);
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
                if (f18300j == null) {
                    synchronized (C7351j.class) {
                        if (f18300j == null) {
                            f18300j = new DefaultInstanceBasedParser(f18299i);
                        }
                    }
                }
                return f18300j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18299i;
    }

    public C7339i getContact() {
        C7339i iVar = this.f18302f;
        return iVar == null ? C7339i.getDefaultInstance() : iVar;
    }

    public int getPotentialFriendsCount() {
        return this.f18303g;
    }

    @Deprecated
    public Map<String, Integer> getPotentialFriendsCounts() {
        return getPotentialFriendsCountsMap();
    }

    public int getPotentialFriendsCountsCount() {
        return m18037b().size();
    }

    public Map<String, Integer> getPotentialFriendsCountsMap() {
        return Collections.unmodifiableMap(m18037b());
    }

    public int getPotentialFriendsCountsOrDefault(String str, int i) {
        if (str != null) {
            MapFieldLite b = m18037b();
            return b.containsKey(str) ? ((Integer) b.get(str)).intValue() : i;
        }
        throw new NullPointerException();
    }

    public int getPotentialFriendsCountsOrThrow(String str) {
        if (str != null) {
            MapFieldLite b = m18037b();
            if (b.containsKey(str)) {
                return ((Integer) b.get(str)).intValue();
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18302f != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getContact());
        }
        int i3 = this.f18303g;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i3);
        }
        for (Entry entry : m18037b().entrySet()) {
            i2 += C7353b.f18305a.computeMessageSize(3, entry.getKey(), entry.getValue());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasContact() {
        return this.f18302f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18302f != null) {
            codedOutputStream.writeMessage(1, getContact());
        }
        int i = this.f18303g;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        for (Entry entry : m18037b().entrySet()) {
            C7353b.f18305a.serializeTo(codedOutputStream, 3, entry.getKey(), entry.getValue());
        }
    }
}
