package p213co.znly.models.places;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.places.C7883h.C7884a;
import p213co.znly.models.places.PlaceProto$PlaceData.C7866a;

/* renamed from: co.znly.models.places.c */
public final class C7873c extends GeneratedMessageLite<C7873c, C7874a> implements PlaceProto$PlaceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7873c f19715g = new C7873c();

    /* renamed from: h */
    private static volatile Parser<C7873c> f19716h;

    /* renamed from: e */
    private PlaceProto$PlaceData f19717e;

    /* renamed from: f */
    private C7883h f19718f;

    /* renamed from: co.znly.models.places.c$a */
    public static final class C7874a extends Builder<C7873c, C7874a> implements PlaceProto$PlaceOrBuilder {
        /* synthetic */ C7874a(C7870a aVar) {
            this();
        }

        public PlaceProto$PlaceData getPlace() {
            return ((C7873c) this.instance).getPlace();
        }

        public C7883h getScore() {
            return ((C7873c) this.instance).getScore();
        }

        public boolean hasPlace() {
            return ((C7873c) this.instance).hasPlace();
        }

        public boolean hasScore() {
            return ((C7873c) this.instance).hasScore();
        }

        private C7874a() {
            super(C7873c.f19715g);
        }
    }

    static {
        f19715g.makeImmutable();
    }

    private C7873c() {
    }

    public static Parser<C7873c> parser() {
        return f19715g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7870a.f19710a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7873c();
            case 2:
                return f19715g;
            case 3:
                return null;
            case 4:
                return new C7874a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7873c cVar = (C7873c) obj2;
                this.f19717e = (PlaceProto$PlaceData) visitor.visitMessage(this.f19717e, cVar.f19717e);
                this.f19718f = (C7883h) visitor.visitMessage(this.f19718f, cVar.f19718f);
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
                                Builder builder = this.f19717e != null ? (C7866a) this.f19717e.toBuilder() : null;
                                this.f19717e = (PlaceProto$PlaceData) codedInputStream.readMessage(PlaceProto$PlaceData.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f19717e);
                                    this.f19717e = (PlaceProto$PlaceData) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f19718f != null ? (C7884a) this.f19718f.toBuilder() : null;
                                this.f19718f = (C7883h) codedInputStream.readMessage(C7883h.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f19718f);
                                    this.f19718f = (C7883h) builder2.buildPartial();
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
                if (f19716h == null) {
                    synchronized (C7873c.class) {
                        if (f19716h == null) {
                            f19716h = new DefaultInstanceBasedParser(f19715g);
                        }
                    }
                }
                return f19716h;
            default:
                throw new UnsupportedOperationException();
        }
        return f19715g;
    }

    public PlaceProto$PlaceData getPlace() {
        PlaceProto$PlaceData placeProto$PlaceData = this.f19717e;
        return placeProto$PlaceData == null ? PlaceProto$PlaceData.getDefaultInstance() : placeProto$PlaceData;
    }

    public C7883h getScore() {
        C7883h hVar = this.f19718f;
        return hVar == null ? C7883h.getDefaultInstance() : hVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f19717e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getPlace());
        }
        if (this.f19718f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getScore());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasPlace() {
        return this.f19717e != null;
    }

    public boolean hasScore() {
        return this.f19718f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f19717e != null) {
            codedOutputStream.writeMessage(1, getPlace());
        }
        if (this.f19718f != null) {
            codedOutputStream.writeMessage(2, getScore());
        }
    }
}
