package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.FloatList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.c */
public final class C6973c extends GeneratedMessageLite<C6973c, C6974a> implements BrumpProto$AcceleroPointsOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C6973c f17197l = new C6973c();

    /* renamed from: m */
    private static volatile Parser<C6973c> f17198m;

    /* renamed from: e */
    private int f17199e;

    /* renamed from: f */
    private int f17200f;

    /* renamed from: g */
    private FloatList f17201g = GeneratedMessageLite.emptyFloatList();

    /* renamed from: h */
    private FloatList f17202h = GeneratedMessageLite.emptyFloatList();

    /* renamed from: i */
    private FloatList f17203i = GeneratedMessageLite.emptyFloatList();

    /* renamed from: j */
    private float f17204j;

    /* renamed from: k */
    private FloatList f17205k = GeneratedMessageLite.emptyFloatList();

    /* renamed from: co.znly.models.c$a */
    public static final class C6974a extends Builder<C6973c, C6974a> implements BrumpProto$AcceleroPointsOrBuilder {
        /* synthetic */ C6974a(C6949b bVar) {
            this();
        }

        public float getAx(int i) {
            return ((C6973c) this.instance).getAx(i);
        }

        public int getAxCount() {
            return ((C6973c) this.instance).getAxCount();
        }

        public List<Float> getAxList() {
            return Collections.unmodifiableList(((C6973c) this.instance).getAxList());
        }

        public float getAy(int i) {
            return ((C6973c) this.instance).getAy(i);
        }

        public int getAyCount() {
            return ((C6973c) this.instance).getAyCount();
        }

        public List<Float> getAyList() {
            return Collections.unmodifiableList(((C6973c) this.instance).getAyList());
        }

        public float getAz(int i) {
            return ((C6973c) this.instance).getAz(i);
        }

        public int getAzCount() {
            return ((C6973c) this.instance).getAzCount();
        }

        public List<Float> getAzList() {
            return Collections.unmodifiableList(((C6973c) this.instance).getAzList());
        }

        public float getGravity(int i) {
            return ((C6973c) this.instance).getGravity(i);
        }

        public int getGravityCount() {
            return ((C6973c) this.instance).getGravityCount();
        }

        public List<Float> getGravityList() {
            return Collections.unmodifiableList(((C6973c) this.instance).getGravityList());
        }

        public float getPower() {
            return ((C6973c) this.instance).getPower();
        }

        public int getSampleRate() {
            return ((C6973c) this.instance).getSampleRate();
        }

        private C6974a() {
            super(C6973c.f17197l);
        }
    }

    static {
        f17197l.makeImmutable();
    }

    private C6973c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6949b.f17121a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6973c();
            case 2:
                return f17197l;
            case 3:
                this.f17201g.makeImmutable();
                this.f17202h.makeImmutable();
                this.f17203i.makeImmutable();
                this.f17205k.makeImmutable();
                return null;
            case 4:
                return new C6974a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6973c cVar = (C6973c) obj2;
                this.f17200f = visitor.visitInt(this.f17200f != 0, this.f17200f, cVar.f17200f != 0, cVar.f17200f);
                this.f17201g = visitor.visitFloatList(this.f17201g, cVar.f17201g);
                this.f17202h = visitor.visitFloatList(this.f17202h, cVar.f17202h);
                this.f17203i = visitor.visitFloatList(this.f17203i, cVar.f17203i);
                boolean z2 = this.f17204j != 0.0f;
                float f = this.f17204j;
                if (cVar.f17204j != 0.0f) {
                    z = true;
                }
                this.f17204j = visitor.visitFloat(z2, f, z, cVar.f17204j);
                this.f17205k = visitor.visitFloatList(this.f17205k, cVar.f17205k);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f17199e |= cVar.f17199e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 40:
                                this.f17200f = codedInputStream.readInt32();
                                break;
                            case 50:
                                int readRawVarint32 = codedInputStream.readRawVarint32();
                                int pushLimit = codedInputStream.pushLimit(readRawVarint32);
                                if (!this.f17201g.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17201g = this.f17201g.mutableCopyWithCapacity(this.f17201g.size() + (readRawVarint32 / 4));
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17201g.addFloat(codedInputStream.readFloat());
                                }
                                codedInputStream.popLimit(pushLimit);
                                break;
                            case 53:
                                if (!this.f17201g.isModifiable()) {
                                    this.f17201g = GeneratedMessageLite.mutableCopy(this.f17201g);
                                }
                                this.f17201g.addFloat(codedInputStream.readFloat());
                                break;
                            case 58:
                                int readRawVarint322 = codedInputStream.readRawVarint32();
                                int pushLimit2 = codedInputStream.pushLimit(readRawVarint322);
                                if (!this.f17202h.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17202h = this.f17202h.mutableCopyWithCapacity(this.f17202h.size() + (readRawVarint322 / 4));
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17202h.addFloat(codedInputStream.readFloat());
                                }
                                codedInputStream.popLimit(pushLimit2);
                                break;
                            case 61:
                                if (!this.f17202h.isModifiable()) {
                                    this.f17202h = GeneratedMessageLite.mutableCopy(this.f17202h);
                                }
                                this.f17202h.addFloat(codedInputStream.readFloat());
                                break;
                            case 66:
                                int readRawVarint323 = codedInputStream.readRawVarint32();
                                int pushLimit3 = codedInputStream.pushLimit(readRawVarint323);
                                if (!this.f17203i.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17203i = this.f17203i.mutableCopyWithCapacity(this.f17203i.size() + (readRawVarint323 / 4));
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17203i.addFloat(codedInputStream.readFloat());
                                }
                                codedInputStream.popLimit(pushLimit3);
                                break;
                            case 69:
                                if (!this.f17203i.isModifiable()) {
                                    this.f17203i = GeneratedMessageLite.mutableCopy(this.f17203i);
                                }
                                this.f17203i.addFloat(codedInputStream.readFloat());
                                break;
                            case 77:
                                this.f17204j = codedInputStream.readFloat();
                                break;
                            case 82:
                                int readRawVarint324 = codedInputStream.readRawVarint32();
                                int pushLimit4 = codedInputStream.pushLimit(readRawVarint324);
                                if (!this.f17205k.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17205k = this.f17205k.mutableCopyWithCapacity(this.f17205k.size() + (readRawVarint324 / 4));
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f17205k.addFloat(codedInputStream.readFloat());
                                }
                                codedInputStream.popLimit(pushLimit4);
                                break;
                            case 85:
                                if (!this.f17205k.isModifiable()) {
                                    this.f17205k = GeneratedMessageLite.mutableCopy(this.f17205k);
                                }
                                this.f17205k.addFloat(codedInputStream.readFloat());
                                break;
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f17198m == null) {
                    synchronized (C6973c.class) {
                        if (f17198m == null) {
                            f17198m = new DefaultInstanceBasedParser(f17197l);
                        }
                    }
                }
                return f17198m;
            default:
                throw new UnsupportedOperationException();
        }
        return f17197l;
    }

    public float getAx(int i) {
        return this.f17201g.getFloat(i);
    }

    public int getAxCount() {
        return this.f17201g.size();
    }

    public List<Float> getAxList() {
        return this.f17201g;
    }

    public float getAy(int i) {
        return this.f17202h.getFloat(i);
    }

    public int getAyCount() {
        return this.f17202h.size();
    }

    public List<Float> getAyList() {
        return this.f17202h;
    }

    public float getAz(int i) {
        return this.f17203i.getFloat(i);
    }

    public int getAzCount() {
        return this.f17203i.size();
    }

    public List<Float> getAzList() {
        return this.f17203i;
    }

    public float getGravity(int i) {
        return this.f17205k.getFloat(i);
    }

    public int getGravityCount() {
        return this.f17205k.size();
    }

    public List<Float> getGravityList() {
        return this.f17205k;
    }

    public float getPower() {
        return this.f17204j;
    }

    public int getSampleRate() {
        return this.f17200f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f17200f;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(5, i3);
        }
        int size = i2 + (getAxList().size() * 4) + (getAxList().size() * 1) + (getAyList().size() * 4) + (getAyList().size() * 1) + (getAzList().size() * 4) + (getAzList().size() * 1);
        float f = this.f17204j;
        if (f != 0.0f) {
            size += CodedOutputStream.computeFloatSize(9, f);
        }
        int size2 = size + (getGravityList().size() * 4) + (getGravityList().size() * 1);
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        int i = this.f17200f;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        for (int i2 = 0; i2 < this.f17201g.size(); i2++) {
            codedOutputStream.writeFloat(6, this.f17201g.getFloat(i2));
        }
        for (int i3 = 0; i3 < this.f17202h.size(); i3++) {
            codedOutputStream.writeFloat(7, this.f17202h.getFloat(i3));
        }
        for (int i4 = 0; i4 < this.f17203i.size(); i4++) {
            codedOutputStream.writeFloat(8, this.f17203i.getFloat(i4));
        }
        float f = this.f17204j;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(9, f);
        }
        for (int i5 = 0; i5 < this.f17205k.size(); i5++) {
            codedOutputStream.writeFloat(10, this.f17205k.getFloat(i5));
        }
    }
}
