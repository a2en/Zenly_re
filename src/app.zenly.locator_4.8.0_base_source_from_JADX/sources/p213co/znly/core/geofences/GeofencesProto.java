package p213co.znly.core.geofences;

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
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.core.geofences.GeofencesProto */
public final class GeofencesProto {

    /* renamed from: co.znly.core.geofences.GeofencesProto$1 */
    static /* synthetic */ class C64631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16042xa1df5c61 = new int[MethodToInvoke.values().length];

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
                f16042xa1df5c61 = r0
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x004b }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0056 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f16042xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0062 }
                co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.geofences.GeofencesProto.C64631.<clinit>():void");
        }
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesRequest */
    public static final class AddGeofencesRequest extends GeneratedMessageLite<AddGeofencesRequest, Builder> implements AddGeofencesRequestOrBuilder {
        public static final int BUILDERS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final AddGeofencesRequest DEFAULT_INSTANCE = new AddGeofencesRequest();
        private static volatile Parser<AddGeofencesRequest> PARSER;
        private ProtobufList<GeofenceBuilder> builders_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesRequest$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<AddGeofencesRequest, Builder> implements AddGeofencesRequestOrBuilder {
            /* synthetic */ Builder(C64631 r1) {
                this();
            }

            public Builder addAllBuilders(Iterable<? extends GeofenceBuilder> iterable) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).addAllBuilders(iterable);
                return this;
            }

            public Builder addBuilders(GeofenceBuilder geofenceBuilder) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).addBuilders(geofenceBuilder);
                return this;
            }

            public Builder clearBuilders() {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).clearBuilders();
                return this;
            }

            public GeofenceBuilder getBuilders(int i) {
                return ((AddGeofencesRequest) this.instance).getBuilders(i);
            }

            public int getBuildersCount() {
                return ((AddGeofencesRequest) this.instance).getBuildersCount();
            }

            public List<GeofenceBuilder> getBuildersList() {
                return Collections.unmodifiableList(((AddGeofencesRequest) this.instance).getBuildersList());
            }

            public Builder removeBuilders(int i) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).removeBuilders(i);
                return this;
            }

            public Builder setBuilders(int i, GeofenceBuilder geofenceBuilder) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).setBuilders(i, geofenceBuilder);
                return this;
            }

            private Builder() {
                super(AddGeofencesRequest.DEFAULT_INSTANCE);
            }

            public Builder addBuilders(int i, GeofenceBuilder geofenceBuilder) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).addBuilders(i, geofenceBuilder);
                return this;
            }

            public Builder setBuilders(int i, Builder builder) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).setBuilders(i, builder);
                return this;
            }

            public Builder addBuilders(Builder builder) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).addBuilders(builder);
                return this;
            }

            public Builder addBuilders(int i, Builder builder) {
                copyOnWrite();
                ((AddGeofencesRequest) this.instance).addBuilders(i, builder);
                return this;
            }
        }

        /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesRequest$GeofenceBuilder */
        public static final class GeofenceBuilder extends GeneratedMessageLite<GeofenceBuilder, Builder> implements GeofenceBuilderOrBuilder {
            /* access modifiers changed from: private */
            public static final GeofenceBuilder DEFAULT_INSTANCE = new GeofenceBuilder();
            public static final int EXPIRATIONDURATION_FIELD_NUMBER = 5;
            public static final int LATITUDE_FIELD_NUMBER = 2;
            public static final int LOITERINGDELAYMS_FIELD_NUMBER = 6;
            public static final int LONGITUDE_FIELD_NUMBER = 3;
            public static final int NOTIFICATIONRESPONSIVENESSMS_FIELD_NUMBER = 7;
            private static volatile Parser<GeofenceBuilder> PARSER = null;
            public static final int RADIUS_FIELD_NUMBER = 4;
            public static final int REQUESTID_FIELD_NUMBER = 1;
            public static final int TRANSITIONTYPES_FIELD_NUMBER = 8;
            private int expirationDuration_;
            private double latitude_;
            private int loiteringDelayMs_;
            private double longitude_;
            private int notificationResponsivenessMs_;
            private float radius_;
            private String requestId_ = "";
            private int transitionTypes_;

            /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesRequest$GeofenceBuilder$Builder */
            public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<GeofenceBuilder, Builder> implements GeofenceBuilderOrBuilder {
                /* synthetic */ Builder(C64631 r1) {
                    this();
                }

                public Builder clearExpirationDuration() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearExpirationDuration();
                    return this;
                }

                public Builder clearLatitude() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearLatitude();
                    return this;
                }

                public Builder clearLoiteringDelayMs() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearLoiteringDelayMs();
                    return this;
                }

                public Builder clearLongitude() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearLongitude();
                    return this;
                }

                public Builder clearNotificationResponsivenessMs() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearNotificationResponsivenessMs();
                    return this;
                }

                public Builder clearRadius() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearRadius();
                    return this;
                }

                public Builder clearRequestId() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearRequestId();
                    return this;
                }

                public Builder clearTransitionTypes() {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).clearTransitionTypes();
                    return this;
                }

                public int getExpirationDuration() {
                    return ((GeofenceBuilder) this.instance).getExpirationDuration();
                }

                public double getLatitude() {
                    return ((GeofenceBuilder) this.instance).getLatitude();
                }

                public int getLoiteringDelayMs() {
                    return ((GeofenceBuilder) this.instance).getLoiteringDelayMs();
                }

                public double getLongitude() {
                    return ((GeofenceBuilder) this.instance).getLongitude();
                }

                public int getNotificationResponsivenessMs() {
                    return ((GeofenceBuilder) this.instance).getNotificationResponsivenessMs();
                }

                public float getRadius() {
                    return ((GeofenceBuilder) this.instance).getRadius();
                }

                public String getRequestId() {
                    return ((GeofenceBuilder) this.instance).getRequestId();
                }

                public ByteString getRequestIdBytes() {
                    return ((GeofenceBuilder) this.instance).getRequestIdBytes();
                }

                public GeofenceTransition getTransitionTypes() {
                    return ((GeofenceBuilder) this.instance).getTransitionTypes();
                }

                public int getTransitionTypesValue() {
                    return ((GeofenceBuilder) this.instance).getTransitionTypesValue();
                }

                public Builder setExpirationDuration(int i) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setExpirationDuration(i);
                    return this;
                }

                public Builder setLatitude(double d) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setLatitude(d);
                    return this;
                }

                public Builder setLoiteringDelayMs(int i) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setLoiteringDelayMs(i);
                    return this;
                }

                public Builder setLongitude(double d) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setLongitude(d);
                    return this;
                }

                public Builder setNotificationResponsivenessMs(int i) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setNotificationResponsivenessMs(i);
                    return this;
                }

                public Builder setRadius(float f) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setRadius(f);
                    return this;
                }

                public Builder setRequestId(String str) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setRequestId(str);
                    return this;
                }

                public Builder setRequestIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setRequestIdBytes(byteString);
                    return this;
                }

                public Builder setTransitionTypes(GeofenceTransition geofenceTransition) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setTransitionTypes(geofenceTransition);
                    return this;
                }

                public Builder setTransitionTypesValue(int i) {
                    copyOnWrite();
                    ((GeofenceBuilder) this.instance).setTransitionTypesValue(i);
                    return this;
                }

                private Builder() {
                    super(GeofenceBuilder.DEFAULT_INSTANCE);
                }
            }

            static {
                DEFAULT_INSTANCE.makeImmutable();
            }

            private GeofenceBuilder() {
            }

            /* access modifiers changed from: private */
            public void clearExpirationDuration() {
                this.expirationDuration_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearLatitude() {
                this.latitude_ = 0.0d;
            }

            /* access modifiers changed from: private */
            public void clearLoiteringDelayMs() {
                this.loiteringDelayMs_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearLongitude() {
                this.longitude_ = 0.0d;
            }

            /* access modifiers changed from: private */
            public void clearNotificationResponsivenessMs() {
                this.notificationResponsivenessMs_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearRadius() {
                this.radius_ = 0.0f;
            }

            /* access modifiers changed from: private */
            public void clearRequestId() {
                this.requestId_ = getDefaultInstance().getRequestId();
            }

            /* access modifiers changed from: private */
            public void clearTransitionTypes() {
                this.transitionTypes_ = 0;
            }

            public static GeofenceBuilder getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.toBuilder();
            }

            public static GeofenceBuilder parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GeofenceBuilder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GeofenceBuilder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Parser<GeofenceBuilder> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setExpirationDuration(int i) {
                this.expirationDuration_ = i;
            }

            /* access modifiers changed from: private */
            public void setLatitude(double d) {
                this.latitude_ = d;
            }

            /* access modifiers changed from: private */
            public void setLoiteringDelayMs(int i) {
                this.loiteringDelayMs_ = i;
            }

            /* access modifiers changed from: private */
            public void setLongitude(double d) {
                this.longitude_ = d;
            }

            /* access modifiers changed from: private */
            public void setNotificationResponsivenessMs(int i) {
                this.notificationResponsivenessMs_ = i;
            }

            /* access modifiers changed from: private */
            public void setRadius(float f) {
                this.radius_ = f;
            }

            /* access modifiers changed from: private */
            public void setRequestId(String str) {
                if (str != null) {
                    this.requestId_ = str;
                    return;
                }
                throw new NullPointerException();
            }

            /* access modifiers changed from: private */
            public void setRequestIdBytes(ByteString byteString) {
                if (byteString != null) {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.requestId_ = byteString.toStringUtf8();
                    return;
                }
                throw new NullPointerException();
            }

            /* access modifiers changed from: private */
            public void setTransitionTypes(GeofenceTransition geofenceTransition) {
                if (geofenceTransition != null) {
                    this.transitionTypes_ = geofenceTransition.getNumber();
                    return;
                }
                throw new NullPointerException();
            }

            /* access modifiers changed from: private */
            public void setTransitionTypesValue(int i) {
                this.transitionTypes_ = i;
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                boolean z = false;
                switch (C64631.f16042xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new GeofenceBuilder();
                    case 2:
                        return DEFAULT_INSTANCE;
                    case 3:
                        return null;
                    case 4:
                        return new Builder(null);
                    case 5:
                        Visitor visitor = (Visitor) obj;
                        GeofenceBuilder geofenceBuilder = (GeofenceBuilder) obj2;
                        this.requestId_ = visitor.visitString(!this.requestId_.isEmpty(), this.requestId_, !geofenceBuilder.requestId_.isEmpty(), geofenceBuilder.requestId_);
                        this.latitude_ = visitor.visitDouble(this.latitude_ != 0.0d, this.latitude_, geofenceBuilder.latitude_ != 0.0d, geofenceBuilder.latitude_);
                        this.longitude_ = visitor.visitDouble(this.longitude_ != 0.0d, this.longitude_, geofenceBuilder.longitude_ != 0.0d, geofenceBuilder.longitude_);
                        this.radius_ = visitor.visitFloat(this.radius_ != 0.0f, this.radius_, geofenceBuilder.radius_ != 0.0f, geofenceBuilder.radius_);
                        this.expirationDuration_ = visitor.visitInt(this.expirationDuration_ != 0, this.expirationDuration_, geofenceBuilder.expirationDuration_ != 0, geofenceBuilder.expirationDuration_);
                        this.loiteringDelayMs_ = visitor.visitInt(this.loiteringDelayMs_ != 0, this.loiteringDelayMs_, geofenceBuilder.loiteringDelayMs_ != 0, geofenceBuilder.loiteringDelayMs_);
                        this.notificationResponsivenessMs_ = visitor.visitInt(this.notificationResponsivenessMs_ != 0, this.notificationResponsivenessMs_, geofenceBuilder.notificationResponsivenessMs_ != 0, geofenceBuilder.notificationResponsivenessMs_);
                        boolean z2 = this.transitionTypes_ != 0;
                        int i = this.transitionTypes_;
                        if (geofenceBuilder.transitionTypes_ != 0) {
                            z = true;
                        }
                        this.transitionTypes_ = visitor.visitInt(z2, i, z, geofenceBuilder.transitionTypes_);
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
                                        this.requestId_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 17) {
                                        this.latitude_ = codedInputStream.readDouble();
                                    } else if (readTag == 25) {
                                        this.longitude_ = codedInputStream.readDouble();
                                    } else if (readTag == 37) {
                                        this.radius_ = codedInputStream.readFloat();
                                    } else if (readTag == 45) {
                                        this.expirationDuration_ = codedInputStream.readSFixed32();
                                    } else if (readTag == 53) {
                                        this.loiteringDelayMs_ = codedInputStream.readSFixed32();
                                    } else if (readTag == 61) {
                                        this.notificationResponsivenessMs_ = codedInputStream.readSFixed32();
                                    } else if (readTag == 64) {
                                        this.transitionTypes_ = codedInputStream.readEnum();
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
                        if (PARSER == null) {
                            synchronized (GeofenceBuilder.class) {
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

            public int getExpirationDuration() {
                return this.expirationDuration_;
            }

            public double getLatitude() {
                return this.latitude_;
            }

            public int getLoiteringDelayMs() {
                return this.loiteringDelayMs_;
            }

            public double getLongitude() {
                return this.longitude_;
            }

            public int getNotificationResponsivenessMs() {
                return this.notificationResponsivenessMs_;
            }

            public float getRadius() {
                return this.radius_;
            }

            public String getRequestId() {
                return this.requestId_;
            }

            public ByteString getRequestIdBytes() {
                return ByteString.copyFromUtf8(this.requestId_);
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if (!this.requestId_.isEmpty()) {
                    i2 = 0 + CodedOutputStream.computeStringSize(1, getRequestId());
                }
                double d = this.latitude_;
                if (d != 0.0d) {
                    i2 += CodedOutputStream.computeDoubleSize(2, d);
                }
                double d2 = this.longitude_;
                if (d2 != 0.0d) {
                    i2 += CodedOutputStream.computeDoubleSize(3, d2);
                }
                float f = this.radius_;
                if (f != 0.0f) {
                    i2 += CodedOutputStream.computeFloatSize(4, f);
                }
                int i3 = this.expirationDuration_;
                if (i3 != 0) {
                    i2 += CodedOutputStream.computeSFixed32Size(5, i3);
                }
                int i4 = this.loiteringDelayMs_;
                if (i4 != 0) {
                    i2 += CodedOutputStream.computeSFixed32Size(6, i4);
                }
                int i5 = this.notificationResponsivenessMs_;
                if (i5 != 0) {
                    i2 += CodedOutputStream.computeSFixed32Size(7, i5);
                }
                if (this.transitionTypes_ != GeofenceTransition.GEOFENCE_TRANSITION_UNKNOWN.getNumber()) {
                    i2 += CodedOutputStream.computeEnumSize(8, this.transitionTypes_);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public GeofenceTransition getTransitionTypes() {
                GeofenceTransition forNumber = GeofenceTransition.forNumber(this.transitionTypes_);
                return forNumber == null ? GeofenceTransition.UNRECOGNIZED : forNumber;
            }

            public int getTransitionTypesValue() {
                return this.transitionTypes_;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!this.requestId_.isEmpty()) {
                    codedOutputStream.writeString(1, getRequestId());
                }
                double d = this.latitude_;
                if (d != 0.0d) {
                    codedOutputStream.writeDouble(2, d);
                }
                double d2 = this.longitude_;
                if (d2 != 0.0d) {
                    codedOutputStream.writeDouble(3, d2);
                }
                float f = this.radius_;
                if (f != 0.0f) {
                    codedOutputStream.writeFloat(4, f);
                }
                int i = this.expirationDuration_;
                if (i != 0) {
                    codedOutputStream.writeSFixed32(5, i);
                }
                int i2 = this.loiteringDelayMs_;
                if (i2 != 0) {
                    codedOutputStream.writeSFixed32(6, i2);
                }
                int i3 = this.notificationResponsivenessMs_;
                if (i3 != 0) {
                    codedOutputStream.writeSFixed32(7, i3);
                }
                if (this.transitionTypes_ != GeofenceTransition.GEOFENCE_TRANSITION_UNKNOWN.getNumber()) {
                    codedOutputStream.writeEnum(8, this.transitionTypes_);
                }
            }

            public static Builder newBuilder(GeofenceBuilder geofenceBuilder) {
                return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(geofenceBuilder);
            }

            public static GeofenceBuilder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GeofenceBuilder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static GeofenceBuilder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static GeofenceBuilder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static GeofenceBuilder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static GeofenceBuilder parseFrom(InputStream inputStream) throws IOException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GeofenceBuilder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static GeofenceBuilder parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static GeofenceBuilder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (GeofenceBuilder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesRequest$GeofenceBuilderOrBuilder */
        public interface GeofenceBuilderOrBuilder extends MessageLiteOrBuilder {
            int getExpirationDuration();

            double getLatitude();

            int getLoiteringDelayMs();

            double getLongitude();

            int getNotificationResponsivenessMs();

            float getRadius();

            String getRequestId();

            ByteString getRequestIdBytes();

            GeofenceTransition getTransitionTypes();

            int getTransitionTypesValue();
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private AddGeofencesRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllBuilders(Iterable<? extends GeofenceBuilder> iterable) {
            ensureBuildersIsMutable();
            AbstractMessageLite.addAll(iterable, this.builders_);
        }

        /* access modifiers changed from: private */
        public void addBuilders(GeofenceBuilder geofenceBuilder) {
            if (geofenceBuilder != null) {
                ensureBuildersIsMutable();
                this.builders_.add(geofenceBuilder);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void clearBuilders() {
            this.builders_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBuildersIsMutable() {
            if (!this.builders_.isModifiable()) {
                this.builders_ = GeneratedMessageLite.mutableCopy(this.builders_);
            }
        }

        public static AddGeofencesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static AddGeofencesRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddGeofencesRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<AddGeofencesRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeBuilders(int i) {
            ensureBuildersIsMutable();
            this.builders_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBuilders(int i, GeofenceBuilder geofenceBuilder) {
            if (geofenceBuilder != null) {
                ensureBuildersIsMutable();
                this.builders_.set(i, geofenceBuilder);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C64631.f16042xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AddGeofencesRequest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.builders_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    this.builders_ = ((Visitor) obj).visitList(this.builders_, ((AddGeofencesRequest) obj2).builders_);
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
                                    if (!this.builders_.isModifiable()) {
                                        this.builders_ = GeneratedMessageLite.mutableCopy(this.builders_);
                                    }
                                    this.builders_.add(codedInputStream.readMessage(GeofenceBuilder.parser(), extensionRegistryLite));
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
                    if (PARSER == null) {
                        synchronized (AddGeofencesRequest.class) {
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

        public GeofenceBuilder getBuilders(int i) {
            return (GeofenceBuilder) this.builders_.get(i);
        }

        public int getBuildersCount() {
            return this.builders_.size();
        }

        public List<GeofenceBuilder> getBuildersList() {
            return this.builders_;
        }

        public GeofenceBuilderOrBuilder getBuildersOrBuilder(int i) {
            return (GeofenceBuilderOrBuilder) this.builders_.get(i);
        }

        public List<? extends GeofenceBuilderOrBuilder> getBuildersOrBuilderList() {
            return this.builders_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.builders_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.builders_.get(i3));
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.builders_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.builders_.get(i));
            }
        }

        public static Builder newBuilder(AddGeofencesRequest addGeofencesRequest) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(addGeofencesRequest);
        }

        public static AddGeofencesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AddGeofencesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AddGeofencesRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        /* access modifiers changed from: private */
        public void addBuilders(int i, GeofenceBuilder geofenceBuilder) {
            if (geofenceBuilder != null) {
                ensureBuildersIsMutable();
                this.builders_.add(i, geofenceBuilder);
                return;
            }
            throw new NullPointerException();
        }

        public static AddGeofencesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void setBuilders(int i, Builder builder) {
            ensureBuildersIsMutable();
            this.builders_.set(i, builder.build());
        }

        public static AddGeofencesRequest parseFrom(InputStream inputStream) throws IOException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddGeofencesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void addBuilders(Builder builder) {
            ensureBuildersIsMutable();
            this.builders_.add(builder.build());
        }

        public static AddGeofencesRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AddGeofencesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        /* access modifiers changed from: private */
        public void addBuilders(int i, Builder builder) {
            ensureBuildersIsMutable();
            this.builders_.add(i, builder.build());
        }
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesRequestOrBuilder */
    public interface AddGeofencesRequestOrBuilder extends MessageLiteOrBuilder {
        GeofenceBuilder getBuilders(int i);

        int getBuildersCount();

        List<GeofenceBuilder> getBuildersList();
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesResponse */
    public static final class AddGeofencesResponse extends GeneratedMessageLite<AddGeofencesResponse, Builder> implements AddGeofencesResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final AddGeofencesResponse DEFAULT_INSTANCE = new AddGeofencesResponse();
        private static volatile Parser<AddGeofencesResponse> PARSER;

        /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesResponse$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<AddGeofencesResponse, Builder> implements AddGeofencesResponseOrBuilder {
            /* synthetic */ Builder(C64631 r1) {
                this();
            }

            private Builder() {
                super(AddGeofencesResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private AddGeofencesResponse() {
        }

        public static AddGeofencesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static AddGeofencesResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddGeofencesResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<AddGeofencesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C64631.f16042xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AddGeofencesResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    AddGeofencesResponse addGeofencesResponse = (AddGeofencesResponse) obj2;
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag == 0 || !codedInputStream.skipField(readTag)) {
                                z = true;
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
                        synchronized (AddGeofencesResponse.class) {
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

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static Builder newBuilder(AddGeofencesResponse addGeofencesResponse) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(addGeofencesResponse);
        }

        public static AddGeofencesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AddGeofencesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AddGeofencesResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AddGeofencesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AddGeofencesResponse parseFrom(InputStream inputStream) throws IOException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddGeofencesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AddGeofencesResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AddGeofencesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AddGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$AddGeofencesResponseOrBuilder */
    public interface AddGeofencesResponseOrBuilder extends MessageLiteOrBuilder {
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$GeofenceEvent */
    public static final class GeofenceEvent extends GeneratedMessageLite<GeofenceEvent, Builder> implements GeofenceEventOrBuilder {
        /* access modifiers changed from: private */
        public static final GeofenceEvent DEFAULT_INSTANCE = new GeofenceEvent();
        private static volatile Parser<GeofenceEvent> PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        public static final int TRANSITION_FIELD_NUMBER = 2;
        private String requestId_ = "";
        private int transition_;

        /* renamed from: co.znly.core.geofences.GeofencesProto$GeofenceEvent$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<GeofenceEvent, Builder> implements GeofenceEventOrBuilder {
            /* synthetic */ Builder(C64631 r1) {
                this();
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((GeofenceEvent) this.instance).clearRequestId();
                return this;
            }

            public Builder clearTransition() {
                copyOnWrite();
                ((GeofenceEvent) this.instance).clearTransition();
                return this;
            }

            public String getRequestId() {
                return ((GeofenceEvent) this.instance).getRequestId();
            }

            public ByteString getRequestIdBytes() {
                return ((GeofenceEvent) this.instance).getRequestIdBytes();
            }

            public GeofenceTransition getTransition() {
                return ((GeofenceEvent) this.instance).getTransition();
            }

            public int getTransitionValue() {
                return ((GeofenceEvent) this.instance).getTransitionValue();
            }

            public Builder setRequestId(String str) {
                copyOnWrite();
                ((GeofenceEvent) this.instance).setRequestId(str);
                return this;
            }

            public Builder setRequestIdBytes(ByteString byteString) {
                copyOnWrite();
                ((GeofenceEvent) this.instance).setRequestIdBytes(byteString);
                return this;
            }

            public Builder setTransition(GeofenceTransition geofenceTransition) {
                copyOnWrite();
                ((GeofenceEvent) this.instance).setTransition(geofenceTransition);
                return this;
            }

            public Builder setTransitionValue(int i) {
                copyOnWrite();
                ((GeofenceEvent) this.instance).setTransitionValue(i);
                return this;
            }

            private Builder() {
                super(GeofenceEvent.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private GeofenceEvent() {
        }

        /* access modifiers changed from: private */
        public void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        /* access modifiers changed from: private */
        public void clearTransition() {
            this.transition_ = 0;
        }

        public static GeofenceEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static GeofenceEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GeofenceEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeofenceEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<GeofenceEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setRequestId(String str) {
            if (str != null) {
                this.requestId_ = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setRequestIdBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.requestId_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setTransition(GeofenceTransition geofenceTransition) {
            if (geofenceTransition != null) {
                this.transition_ = geofenceTransition.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void setTransitionValue(int i) {
            this.transition_ = i;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C64631.f16042xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GeofenceEvent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    GeofenceEvent geofenceEvent = (GeofenceEvent) obj2;
                    this.requestId_ = visitor.visitString(!this.requestId_.isEmpty(), this.requestId_, !geofenceEvent.requestId_.isEmpty(), geofenceEvent.requestId_);
                    boolean z2 = this.transition_ != 0;
                    int i = this.transition_;
                    if (geofenceEvent.transition_ != 0) {
                        z = true;
                    }
                    this.transition_ = visitor.visitInt(z2, i, z, geofenceEvent.transition_);
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
                                    this.requestId_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.transition_ = codedInputStream.readEnum();
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
                    if (PARSER == null) {
                        synchronized (GeofenceEvent.class) {
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

        public String getRequestId() {
            return this.requestId_;
        }

        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.requestId_.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getRequestId());
            }
            if (this.transition_ != GeofenceTransition.GEOFENCE_TRANSITION_UNKNOWN.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(2, this.transition_);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public GeofenceTransition getTransition() {
            GeofenceTransition forNumber = GeofenceTransition.forNumber(this.transition_);
            return forNumber == null ? GeofenceTransition.UNRECOGNIZED : forNumber;
        }

        public int getTransitionValue() {
            return this.transition_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.requestId_.isEmpty()) {
                codedOutputStream.writeString(1, getRequestId());
            }
            if (this.transition_ != GeofenceTransition.GEOFENCE_TRANSITION_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.transition_);
            }
        }

        public static Builder newBuilder(GeofenceEvent geofenceEvent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(geofenceEvent);
        }

        public static GeofenceEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeofenceEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeofenceEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GeofenceEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GeofenceEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GeofenceEvent parseFrom(InputStream inputStream) throws IOException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeofenceEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeofenceEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GeofenceEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$GeofenceEventOrBuilder */
    public interface GeofenceEventOrBuilder extends MessageLiteOrBuilder {
        String getRequestId();

        ByteString getRequestIdBytes();

        GeofenceTransition getTransition();

        int getTransitionValue();
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$GeofenceTransition */
    public enum GeofenceTransition implements EnumLite {
        GEOFENCE_TRANSITION_UNKNOWN(0),
        GEOFENCE_TRANSITION_ENTER(1),
        GEOFENCE_TRANSITION_EXIT(2),
        GEOFENCE_TRANSITION_DWELL(4),
        UNRECOGNIZED(-1);
        
        public static final int GEOFENCE_TRANSITION_DWELL_VALUE = 4;
        public static final int GEOFENCE_TRANSITION_ENTER_VALUE = 1;
        public static final int GEOFENCE_TRANSITION_EXIT_VALUE = 2;
        public static final int GEOFENCE_TRANSITION_UNKNOWN_VALUE = 0;
        private static final EnumLiteMap<GeofenceTransition> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new EnumLiteMap<GeofenceTransition>() {
                public GeofenceTransition findValueByNumber(int i) {
                    return GeofenceTransition.forNumber(i);
                }
            };
        }

        private GeofenceTransition(int i) {
            this.value = i;
        }

        public static GeofenceTransition forNumber(int i) {
            if (i == 0) {
                return GEOFENCE_TRANSITION_UNKNOWN;
            }
            if (i == 1) {
                return GEOFENCE_TRANSITION_ENTER;
            }
            if (i == 2) {
                return GEOFENCE_TRANSITION_EXIT;
            }
            if (i != 4) {
                return null;
            }
            return GEOFENCE_TRANSITION_DWELL;
        }

        public static EnumLiteMap<GeofenceTransition> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GeofenceTransition valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$RemoveGeofencesRequest */
    public static final class RemoveGeofencesRequest extends GeneratedMessageLite<RemoveGeofencesRequest, Builder> implements RemoveGeofencesRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final RemoveGeofencesRequest DEFAULT_INSTANCE = new RemoveGeofencesRequest();
        private static volatile Parser<RemoveGeofencesRequest> PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private ProtobufList<String> requestId_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: co.znly.core.geofences.GeofencesProto$RemoveGeofencesRequest$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<RemoveGeofencesRequest, Builder> implements RemoveGeofencesRequestOrBuilder {
            /* synthetic */ Builder(C64631 r1) {
                this();
            }

            public Builder addAllRequestId(Iterable<String> iterable) {
                copyOnWrite();
                ((RemoveGeofencesRequest) this.instance).addAllRequestId(iterable);
                return this;
            }

            public Builder addRequestId(String str) {
                copyOnWrite();
                ((RemoveGeofencesRequest) this.instance).addRequestId(str);
                return this;
            }

            public Builder addRequestIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RemoveGeofencesRequest) this.instance).addRequestIdBytes(byteString);
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((RemoveGeofencesRequest) this.instance).clearRequestId();
                return this;
            }

            public String getRequestId(int i) {
                return ((RemoveGeofencesRequest) this.instance).getRequestId(i);
            }

            public ByteString getRequestIdBytes(int i) {
                return ((RemoveGeofencesRequest) this.instance).getRequestIdBytes(i);
            }

            public int getRequestIdCount() {
                return ((RemoveGeofencesRequest) this.instance).getRequestIdCount();
            }

            public List<String> getRequestIdList() {
                return Collections.unmodifiableList(((RemoveGeofencesRequest) this.instance).getRequestIdList());
            }

            public Builder setRequestId(int i, String str) {
                copyOnWrite();
                ((RemoveGeofencesRequest) this.instance).setRequestId(i, str);
                return this;
            }

            private Builder() {
                super(RemoveGeofencesRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private RemoveGeofencesRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllRequestId(Iterable<String> iterable) {
            ensureRequestIdIsMutable();
            AbstractMessageLite.addAll(iterable, this.requestId_);
        }

        /* access modifiers changed from: private */
        public void addRequestId(String str) {
            if (str != null) {
                ensureRequestIdIsMutable();
                this.requestId_.add(str);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void addRequestIdBytes(ByteString byteString) {
            if (byteString != null) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                ensureRequestIdIsMutable();
                this.requestId_.add(byteString.toStringUtf8());
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public void clearRequestId() {
            this.requestId_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureRequestIdIsMutable() {
            if (!this.requestId_.isModifiable()) {
                this.requestId_ = GeneratedMessageLite.mutableCopy(this.requestId_);
            }
        }

        public static RemoveGeofencesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoveGeofencesRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveGeofencesRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<RemoveGeofencesRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setRequestId(int i, String str) {
            if (str != null) {
                ensureRequestIdIsMutable();
                this.requestId_.set(i, str);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C64631.f16042xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RemoveGeofencesRequest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.requestId_.makeImmutable();
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    this.requestId_ = ((Visitor) obj).visitList(this.requestId_, ((RemoveGeofencesRequest) obj2).requestId_);
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
                                    if (!this.requestId_.isModifiable()) {
                                        this.requestId_ = GeneratedMessageLite.mutableCopy(this.requestId_);
                                    }
                                    this.requestId_.add(readStringRequireUtf8);
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
                    if (PARSER == null) {
                        synchronized (RemoveGeofencesRequest.class) {
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

        public String getRequestId(int i) {
            return (String) this.requestId_.get(i);
        }

        public ByteString getRequestIdBytes(int i) {
            return ByteString.copyFromUtf8((String) this.requestId_.get(i));
        }

        public int getRequestIdCount() {
            return this.requestId_.size();
        }

        public List<String> getRequestIdList() {
            return this.requestId_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.requestId_.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag((String) this.requestId_.get(i3));
            }
            int size = 0 + i2 + (getRequestIdList().size() * 1);
            this.memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.requestId_.size(); i++) {
                codedOutputStream.writeString(1, (String) this.requestId_.get(i));
            }
        }

        public static Builder newBuilder(RemoveGeofencesRequest removeGeofencesRequest) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(removeGeofencesRequest);
        }

        public static RemoveGeofencesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveGeofencesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RemoveGeofencesRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveGeofencesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RemoveGeofencesRequest parseFrom(InputStream inputStream) throws IOException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveGeofencesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveGeofencesRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveGeofencesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveGeofencesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$RemoveGeofencesRequestOrBuilder */
    public interface RemoveGeofencesRequestOrBuilder extends MessageLiteOrBuilder {
        String getRequestId(int i);

        ByteString getRequestIdBytes(int i);

        int getRequestIdCount();

        List<String> getRequestIdList();
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$RemoveGeofencesResponse */
    public static final class RemoveGeofencesResponse extends GeneratedMessageLite<RemoveGeofencesResponse, Builder> implements RemoveGeofencesResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final RemoveGeofencesResponse DEFAULT_INSTANCE = new RemoveGeofencesResponse();
        private static volatile Parser<RemoveGeofencesResponse> PARSER;

        /* renamed from: co.znly.core.geofences.GeofencesProto$RemoveGeofencesResponse$Builder */
        public static final class Builder extends p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder<RemoveGeofencesResponse, Builder> implements RemoveGeofencesResponseOrBuilder {
            /* synthetic */ Builder(C64631 r1) {
                this();
            }

            private Builder() {
                super(RemoveGeofencesResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private RemoveGeofencesResponse() {
        }

        public static RemoveGeofencesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoveGeofencesResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveGeofencesResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<RemoveGeofencesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C64631.f16042xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RemoveGeofencesResponse();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    RemoveGeofencesResponse removeGeofencesResponse = (RemoveGeofencesResponse) obj2;
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag == 0 || !codedInputStream.skipField(readTag)) {
                                z = true;
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
                        synchronized (RemoveGeofencesResponse.class) {
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

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        }

        public static Builder newBuilder(RemoveGeofencesResponse removeGeofencesResponse) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(removeGeofencesResponse);
        }

        public static RemoveGeofencesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveGeofencesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RemoveGeofencesResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveGeofencesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RemoveGeofencesResponse parseFrom(InputStream inputStream) throws IOException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveGeofencesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RemoveGeofencesResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveGeofencesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RemoveGeofencesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: co.znly.core.geofences.GeofencesProto$RemoveGeofencesResponseOrBuilder */
    public interface RemoveGeofencesResponseOrBuilder extends MessageLiteOrBuilder {
    }

    private GeofencesProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
