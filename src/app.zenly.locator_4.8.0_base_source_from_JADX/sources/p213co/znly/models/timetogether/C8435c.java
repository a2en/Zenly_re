package p213co.znly.models.timetogether;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.timetogether.c */
public final class C8435c extends GeneratedMessageLite<C8435c, C8436a> implements TimeTogetherProto$FriendsMetOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8435c f21398i = new C8435c();

    /* renamed from: j */
    private static volatile Parser<C8435c> f21399j;

    /* renamed from: e */
    private int f21400e;

    /* renamed from: f */
    private int f21401f;

    /* renamed from: g */
    private int f21402g;

    /* renamed from: h */
    private int f21403h;

    /* renamed from: co.znly.models.timetogether.c$a */
    public static final class C8436a extends Builder<C8435c, C8436a> implements TimeTogetherProto$FriendsMetOrBuilder {
        /* synthetic */ C8436a(C8432a aVar) {
            this();
        }

        public int getMet30Days() {
            return ((C8435c) this.instance).getMet30Days();
        }

        public int getMet7Days() {
            return ((C8435c) this.instance).getMet7Days();
        }

        public int getMetCurrentMonth() {
            return ((C8435c) this.instance).getMetCurrentMonth();
        }

        public int getMetCurrentWeek() {
            return ((C8435c) this.instance).getMetCurrentWeek();
        }

        private C8436a() {
            super(C8435c.f21398i);
        }
    }

    static {
        f21398i.makeImmutable();
    }

    private C8435c() {
    }

    public static C8435c getDefaultInstance() {
        return f21398i;
    }

    public static Parser<C8435c> parser() {
        return f21398i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8432a.f21379a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8435c();
            case 2:
                return f21398i;
            case 3:
                return null;
            case 4:
                return new C8436a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8435c cVar = (C8435c) obj2;
                this.f21400e = visitor.visitInt(this.f21400e != 0, this.f21400e, cVar.f21400e != 0, cVar.f21400e);
                this.f21401f = visitor.visitInt(this.f21401f != 0, this.f21401f, cVar.f21401f != 0, cVar.f21401f);
                this.f21402g = visitor.visitInt(this.f21402g != 0, this.f21402g, cVar.f21402g != 0, cVar.f21402g);
                boolean z2 = this.f21403h != 0;
                int i = this.f21403h;
                if (cVar.f21403h != 0) {
                    z = true;
                }
                this.f21403h = visitor.visitInt(z2, i, z, cVar.f21403h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f21400e = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f21401f = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.f21402g = codedInputStream.readInt32();
                            } else if (readTag == 32) {
                                this.f21403h = codedInputStream.readInt32();
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
                if (f21399j == null) {
                    synchronized (C8435c.class) {
                        if (f21399j == null) {
                            f21399j = new DefaultInstanceBasedParser(f21398i);
                        }
                    }
                }
                return f21399j;
            default:
                throw new UnsupportedOperationException();
        }
        return f21398i;
    }

    public int getMet30Days() {
        return this.f21402g;
    }

    public int getMet7Days() {
        return this.f21400e;
    }

    public int getMetCurrentMonth() {
        return this.f21403h;
    }

    public int getMetCurrentWeek() {
        return this.f21401f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f21400e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        int i4 = this.f21401f;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i4);
        }
        int i5 = this.f21402g;
        if (i5 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i5);
        }
        int i6 = this.f21403h;
        if (i6 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i6);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f21400e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.f21401f;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
        int i3 = this.f21402g;
        if (i3 != 0) {
            codedOutputStream.writeInt32(3, i3);
        }
        int i4 = this.f21403h;
        if (i4 != 0) {
            codedOutputStream.writeInt32(4, i4);
        }
    }
}
