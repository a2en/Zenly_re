package p213co.znly.core.brump;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.AbstractMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.FloatList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.core.brump.Brump */
public final class Brump {

    /* renamed from: co.znly.core.brump.Brump$1 */
    static /* synthetic */ class C63941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15969xa1df5c61 = new int[MethodToInvoke.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15969xa1df5c61 = r0
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0056 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f15969xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0062 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.brump.Brump.C63941.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.brump.Brump$BrumpEvent */
    public static final class BrumpEvent extends GeneratedMessageLite<BrumpEvent, Builder> implements BrumpEventOrBuilder {
        public static final int AX_FIELD_NUMBER = 1;
        public static final int AY_FIELD_NUMBER = 2;
        public static final int AZ_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final BrumpEvent DEFAULT_INSTANCE = new BrumpEvent();
        public static final int GSAMPLES_FIELD_NUMBER = 4;
        private static volatile Parser<BrumpEvent> PARSER = null;
        public static final int POWER_FIELD_NUMBER = 6;
        public static final int SAMPLE_RATE_FIELD_NUMBER = 5;
        private FloatList ax_ = GeneratedMessageLite.emptyFloatList();
        private FloatList ay_ = GeneratedMessageLite.emptyFloatList();
        private FloatList az_ = GeneratedMessageLite.emptyFloatList();
        private int bitField0_;
        private FloatList gsamples_ = GeneratedMessageLite.emptyFloatList();
        private float power_;
        private int sampleRate_;

        /* renamed from: co.znly.core.brump.Brump$BrumpEvent$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<BrumpEvent, Builder> implements BrumpEventOrBuilder {
            /* synthetic */ Builder(C63941 r1) {
                this();
            }

            public Builder addAllAx(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addAllAx(iterable);
                return this;
            }

            public Builder addAllAy(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addAllAy(iterable);
                return this;
            }

            public Builder addAllAz(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addAllAz(iterable);
                return this;
            }

            public Builder addAllGsamples(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addAllGsamples(iterable);
                return this;
            }

            public Builder addAx(float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addAx(f);
                return this;
            }

            public Builder addAy(float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addAy(f);
                return this;
            }

            public Builder addAz(float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addAz(f);
                return this;
            }

            public Builder addGsamples(float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).addGsamples(f);
                return this;
            }

            public Builder clearAx() {
                copyOnWrite();
                ((BrumpEvent) this.instance).clearAx();
                return this;
            }

            public Builder clearAy() {
                copyOnWrite();
                ((BrumpEvent) this.instance).clearAy();
                return this;
            }

            public Builder clearAz() {
                copyOnWrite();
                ((BrumpEvent) this.instance).clearAz();
                return this;
            }

            public Builder clearGsamples() {
                copyOnWrite();
                ((BrumpEvent) this.instance).clearGsamples();
                return this;
            }

            public Builder clearPower() {
                copyOnWrite();
                ((BrumpEvent) this.instance).clearPower();
                return this;
            }

            public Builder clearSampleRate() {
                copyOnWrite();
                ((BrumpEvent) this.instance).clearSampleRate();
                return this;
            }

            public float getAx(int i) {
                return ((BrumpEvent) this.instance).getAx(i);
            }

            public int getAxCount() {
                return ((BrumpEvent) this.instance).getAxCount();
            }

            public List<Float> getAxList() {
                return Collections.unmodifiableList(((BrumpEvent) this.instance).getAxList());
            }

            public float getAy(int i) {
                return ((BrumpEvent) this.instance).getAy(i);
            }

            public int getAyCount() {
                return ((BrumpEvent) this.instance).getAyCount();
            }

            public List<Float> getAyList() {
                return Collections.unmodifiableList(((BrumpEvent) this.instance).getAyList());
            }

            public float getAz(int i) {
                return ((BrumpEvent) this.instance).getAz(i);
            }

            public int getAzCount() {
                return ((BrumpEvent) this.instance).getAzCount();
            }

            public List<Float> getAzList() {
                return Collections.unmodifiableList(((BrumpEvent) this.instance).getAzList());
            }

            public float getGsamples(int i) {
                return ((BrumpEvent) this.instance).getGsamples(i);
            }

            public int getGsamplesCount() {
                return ((BrumpEvent) this.instance).getGsamplesCount();
            }

            public List<Float> getGsamplesList() {
                return Collections.unmodifiableList(((BrumpEvent) this.instance).getGsamplesList());
            }

            public float getPower() {
                return ((BrumpEvent) this.instance).getPower();
            }

            public int getSampleRate() {
                return ((BrumpEvent) this.instance).getSampleRate();
            }

            public Builder setAx(int i, float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).setAx(i, f);
                return this;
            }

            public Builder setAy(int i, float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).setAy(i, f);
                return this;
            }

            public Builder setAz(int i, float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).setAz(i, f);
                return this;
            }

            public Builder setGsamples(int i, float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).setGsamples(i, f);
                return this;
            }

            public Builder setPower(float f) {
                copyOnWrite();
                ((BrumpEvent) this.instance).setPower(f);
                return this;
            }

            public Builder setSampleRate(int i) {
                copyOnWrite();
                ((BrumpEvent) this.instance).setSampleRate(i);
                return this;
            }

            private Builder() {
                super(BrumpEvent.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private BrumpEvent() {
        }

        /* access modifiers changed from: private */
        public void addAllAx(Iterable<? extends Float> iterable) {
            ensureAxIsMutable();
            AbstractMessageLite.addAll(iterable, this.ax_);
        }

        /* access modifiers changed from: private */
        public void addAllAy(Iterable<? extends Float> iterable) {
            ensureAyIsMutable();
            AbstractMessageLite.addAll(iterable, this.ay_);
        }

        /* access modifiers changed from: private */
        public void addAllAz(Iterable<? extends Float> iterable) {
            ensureAzIsMutable();
            AbstractMessageLite.addAll(iterable, this.az_);
        }

        /* access modifiers changed from: private */
        public void addAllGsamples(Iterable<? extends Float> iterable) {
            ensureGsamplesIsMutable();
            AbstractMessageLite.addAll(iterable, this.gsamples_);
        }

        /* access modifiers changed from: private */
        public void addAx(float f) {
            ensureAxIsMutable();
            this.ax_.addFloat(f);
        }

        /* access modifiers changed from: private */
        public void addAy(float f) {
            ensureAyIsMutable();
            this.ay_.addFloat(f);
        }

        /* access modifiers changed from: private */
        public void addAz(float f) {
            ensureAzIsMutable();
            this.az_.addFloat(f);
        }

        /* access modifiers changed from: private */
        public void addGsamples(float f) {
            ensureGsamplesIsMutable();
            this.gsamples_.addFloat(f);
        }

        /* access modifiers changed from: private */
        public void clearAx() {
            this.ax_ = GeneratedMessageLite.emptyFloatList();
        }

        /* access modifiers changed from: private */
        public void clearAy() {
            this.ay_ = GeneratedMessageLite.emptyFloatList();
        }

        /* access modifiers changed from: private */
        public void clearAz() {
            this.az_ = GeneratedMessageLite.emptyFloatList();
        }

        /* access modifiers changed from: private */
        public void clearGsamples() {
            this.gsamples_ = GeneratedMessageLite.emptyFloatList();
        }

        /* access modifiers changed from: private */
        public void clearPower() {
            this.power_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearSampleRate() {
            this.sampleRate_ = 0;
        }

        private void ensureAxIsMutable() {
            if (!this.ax_.isModifiable()) {
                this.ax_ = GeneratedMessageLite.mutableCopy(this.ax_);
            }
        }

        private void ensureAyIsMutable() {
            if (!this.ay_.isModifiable()) {
                this.ay_ = GeneratedMessageLite.mutableCopy(this.ay_);
            }
        }

        private void ensureAzIsMutable() {
            if (!this.az_.isModifiable()) {
                this.az_ = GeneratedMessageLite.mutableCopy(this.az_);
            }
        }

        private void ensureGsamplesIsMutable() {
            if (!this.gsamples_.isModifiable()) {
                this.gsamples_ = GeneratedMessageLite.mutableCopy(this.gsamples_);
            }
        }

        public static BrumpEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static BrumpEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BrumpEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BrumpEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<BrumpEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAx(int i, float f) {
            ensureAxIsMutable();
            this.ax_.setFloat(i, f);
        }

        /* access modifiers changed from: private */
        public void setAy(int i, float f) {
            ensureAyIsMutable();
            this.ay_.setFloat(i, f);
        }

        /* access modifiers changed from: private */
        public void setAz(int i, float f) {
            ensureAzIsMutable();
            this.az_.setFloat(i, f);
        }

        /* access modifiers changed from: private */
        public void setGsamples(int i, float f) {
            ensureGsamplesIsMutable();
            this.gsamples_.setFloat(i, f);
        }

        /* access modifiers changed from: private */
        public void setPower(float f) {
            this.power_ = f;
        }

        /* access modifiers changed from: private */
        public void setSampleRate(int i) {
            this.sampleRate_ = i;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C63941.f15969xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new BrumpEvent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.ax_.makeImmutable();
                    this.ay_.makeImmutable();
                    this.az_.makeImmutable();
                    this.gsamples_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    BrumpEvent brumpEvent = (BrumpEvent) obj2;
                    this.ax_ = visitor.visitFloatList(this.ax_, brumpEvent.ax_);
                    this.ay_ = visitor.visitFloatList(this.ay_, brumpEvent.ay_);
                    this.az_ = visitor.visitFloatList(this.az_, brumpEvent.az_);
                    this.gsamples_ = visitor.visitFloatList(this.gsamples_, brumpEvent.gsamples_);
                    this.sampleRate_ = visitor.visitInt(this.sampleRate_ != 0, this.sampleRate_, brumpEvent.sampleRate_ != 0, brumpEvent.sampleRate_);
                    boolean z2 = this.power_ != 0.0f;
                    float f = this.power_;
                    if (brumpEvent.power_ != 0.0f) {
                        z = true;
                    }
                    this.power_ = visitor.visitFloat(z2, f, z, brumpEvent.power_);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.bitField0_ |= brumpEvent.bitField0_;
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
                                case 10:
                                    int readRawVarint32 = codedInputStream.readRawVarint32();
                                    int pushLimit = codedInputStream.pushLimit(readRawVarint32);
                                    if (!this.ax_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.ax_ = this.ax_.mutableCopyWithCapacity(this.ax_.size() + (readRawVarint32 / 4));
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.ax_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                    break;
                                case 13:
                                    if (!this.ax_.isModifiable()) {
                                        this.ax_ = GeneratedMessageLite.mutableCopy(this.ax_);
                                    }
                                    this.ax_.addFloat(codedInputStream.readFloat());
                                    break;
                                case 18:
                                    int readRawVarint322 = codedInputStream.readRawVarint32();
                                    int pushLimit2 = codedInputStream.pushLimit(readRawVarint322);
                                    if (!this.ay_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.ay_ = this.ay_.mutableCopyWithCapacity(this.ay_.size() + (readRawVarint322 / 4));
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.ay_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(pushLimit2);
                                    break;
                                case 21:
                                    if (!this.ay_.isModifiable()) {
                                        this.ay_ = GeneratedMessageLite.mutableCopy(this.ay_);
                                    }
                                    this.ay_.addFloat(codedInputStream.readFloat());
                                    break;
                                case 26:
                                    int readRawVarint323 = codedInputStream.readRawVarint32();
                                    int pushLimit3 = codedInputStream.pushLimit(readRawVarint323);
                                    if (!this.az_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.az_ = this.az_.mutableCopyWithCapacity(this.az_.size() + (readRawVarint323 / 4));
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.az_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(pushLimit3);
                                    break;
                                case 29:
                                    if (!this.az_.isModifiable()) {
                                        this.az_ = GeneratedMessageLite.mutableCopy(this.az_);
                                    }
                                    this.az_.addFloat(codedInputStream.readFloat());
                                    break;
                                case 34:
                                    int readRawVarint324 = codedInputStream.readRawVarint32();
                                    int pushLimit4 = codedInputStream.pushLimit(readRawVarint324);
                                    if (!this.gsamples_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.gsamples_ = this.gsamples_.mutableCopyWithCapacity(this.gsamples_.size() + (readRawVarint324 / 4));
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.gsamples_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(pushLimit4);
                                    break;
                                case 37:
                                    if (!this.gsamples_.isModifiable()) {
                                        this.gsamples_ = GeneratedMessageLite.mutableCopy(this.gsamples_);
                                    }
                                    this.gsamples_.addFloat(codedInputStream.readFloat());
                                    break;
                                case 40:
                                    this.sampleRate_ = codedInputStream.readInt32();
                                    break;
                                case 53:
                                    this.power_ = codedInputStream.readFloat();
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
                    if (PARSER == null) {
                        synchronized (BrumpEvent.class) {
                            if (PARSER == null) {
                                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return PARSER;
                default:
                    throw new UnsupportedOperationException();
            }
            return DEFAULT_INSTANCE;
        }

        public float getAx(int i) {
            return this.ax_.getFloat(i);
        }

        public int getAxCount() {
            return this.ax_.size();
        }

        public List<Float> getAxList() {
            return this.ax_;
        }

        public float getAy(int i) {
            return this.ay_.getFloat(i);
        }

        public int getAyCount() {
            return this.ay_.size();
        }

        public List<Float> getAyList() {
            return this.ay_;
        }

        public float getAz(int i) {
            return this.az_.getFloat(i);
        }

        public int getAzCount() {
            return this.az_.size();
        }

        public List<Float> getAzList() {
            return this.az_;
        }

        public float getGsamples(int i) {
            return this.gsamples_.getFloat(i);
        }

        public int getGsamplesCount() {
            return this.gsamples_.size();
        }

        public List<Float> getGsamplesList() {
            return this.gsamples_;
        }

        public float getPower() {
            return this.power_;
        }

        public int getSampleRate() {
            return this.sampleRate_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int size = (getAxList().size() * 4) + 0 + (getAxList().size() * 1) + (getAyList().size() * 4) + (getAyList().size() * 1) + (getAzList().size() * 4) + (getAzList().size() * 1) + (getGsamplesList().size() * 4) + (getGsamplesList().size() * 1);
            int i2 = this.sampleRate_;
            if (i2 != 0) {
                size += CodedOutputStream.computeInt32Size(5, i2);
            }
            float f = this.power_;
            if (f != 0.0f) {
                size += CodedOutputStream.computeFloatSize(6, f);
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.ax_.size(); i++) {
                codedOutputStream.writeFloat(1, this.ax_.getFloat(i));
            }
            for (int i2 = 0; i2 < this.ay_.size(); i2++) {
                codedOutputStream.writeFloat(2, this.ay_.getFloat(i2));
            }
            for (int i3 = 0; i3 < this.az_.size(); i3++) {
                codedOutputStream.writeFloat(3, this.az_.getFloat(i3));
            }
            for (int i4 = 0; i4 < this.gsamples_.size(); i4++) {
                codedOutputStream.writeFloat(4, this.gsamples_.getFloat(i4));
            }
            int i5 = this.sampleRate_;
            if (i5 != 0) {
                codedOutputStream.writeInt32(5, i5);
            }
            float f = this.power_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(6, f);
            }
        }

        public static Builder newBuilder(BrumpEvent brumpEvent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(brumpEvent);
        }

        public static BrumpEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BrumpEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BrumpEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BrumpEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BrumpEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BrumpEvent parseFrom(InputStream inputStream) throws IOException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BrumpEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BrumpEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BrumpEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BrumpEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.brump.Brump$BrumpEventOrBuilder */
    public interface BrumpEventOrBuilder extends MessageLiteOrBuilder {
        float getAx(int i);

        int getAxCount();

        List<Float> getAxList();

        float getAy(int i);

        int getAyCount();

        List<Float> getAyList();

        float getAz(int i);

        int getAzCount();

        List<Float> getAzList();

        float getGsamples(int i);

        int getGsamplesCount();

        List<Float> getGsamplesList();

        float getPower();

        int getSampleRate();
    }

    private Brump() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
