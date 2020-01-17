package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.Internal.IntList;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ListAdapter.Converter;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.ConfigurationProto$Configuration */
public final class ConfigurationProto$Configuration extends GeneratedMessageLite<ConfigurationProto$Configuration, C6765b> implements ConfigurationProto$ConfigurationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final ConfigurationProto$Configuration f16305u = new ConfigurationProto$Configuration();

    /* renamed from: v */
    private static volatile Parser<ConfigurationProto$Configuration> f16306v;

    /* renamed from: e */
    private C6785i f16307e;

    /* renamed from: f */
    private C6789k f16308f;

    /* renamed from: g */
    private C6791l f16309g;

    /* renamed from: h */
    private C6766c f16310h;

    /* renamed from: i */
    private C6795n f16311i;

    /* renamed from: j */
    private C6799p f16312j;

    /* renamed from: k */
    private C6779f f16313k;

    /* renamed from: l */
    private C6793m f16314l;

    /* renamed from: m */
    private C6781g f16315m;

    /* renamed from: n */
    private C6797o f16316n;

    /* renamed from: o */
    private C6801q f16317o;

    /* renamed from: p */
    private C6787j f16318p;

    /* renamed from: q */
    private C6763a f16319q;

    /* renamed from: r */
    private C6783h f16320r;

    /* renamed from: s */
    private C6768d f16321s;

    /* renamed from: t */
    private C6770e f16322t;

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$BrumpOrBuilder */
    public interface BrumpOrBuilder extends MessageLiteOrBuilder {
        int getAccelerationThreshold();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$ChatOrBuilder */
    public interface ChatOrBuilder extends MessageLiteOrBuilder {
        String getDefaultEmojiUuid();

        ByteString getDefaultEmojiUuidBytes();

        Duration getEmojiSenderTimeout();

        Duration getMediaSenderTimeout();

        Duration getTextSenderTimeout();

        boolean hasEmojiSenderTimeout();

        boolean hasMediaSenderTimeout();

        boolean hasTextSenderTimeout();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$DescendantsOrBuilder */
    public interface DescendantsOrBuilder extends MessageLiteOrBuilder {
        int getNumberOfDescendantsToShowTheRankCard();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$ExperimentFlagsOrBuilder */
    public interface ExperimentFlagsOrBuilder extends MessageLiteOrBuilder {
        C6773c getActivatedExperiments(int i);

        int getActivatedExperimentsCount();

        List<C6773c> getActivatedExperimentsList();

        int getActivatedExperimentsValue(int i);

        List<Integer> getActivatedExperimentsValueList();

        C6775d getAozContainingWhileInUseUsers();

        int getAozContainingWhileInUseUsersValue();

        C6775d getBroadcastedInvitesDisabled();

        int getBroadcastedInvitesDisabledValue();

        C6775d getBroadcastedInvitesV2();

        int getBroadcastedInvitesV2Value();

        C6775d getDisplaySocialNetwork();

        int getDisplaySocialNetworkValue();

        C6777e getMasterGroup();

        int getMasterGroupValue();

        C6775d getMultipleContactsOneInvite();

        int getMultipleContactsOneInviteValue();

        C6775d getNoFriendsCarousel();

        int getNoFriendsCarouselValue();

        C6775d getNoFriendsMultipleDialogs();

        int getNoFriendsMultipleDialogsValue();

        C6775d getNoFriendsPushNotification();

        int getNoFriendsPushNotificationValue();

        C6775d getNoFriendsSingleDialog();

        int getNoFriendsSingleDialogValue();

        C6775d getQuickAddInbox();

        int getQuickAddInboxValue();

        C6775d getQuickAddProfile();

        int getQuickAddProfileValue();

        C6775d getSocialNetworksWithBroadcastedInvites();

        int getSocialNetworksWithBroadcastedInvitesValue();

        C6775d getTimetogetherLocked();

        int getTimetogetherLockedValue();

        C6775d getUseInviteLink();

        int getUseInviteLinkValue();

        C6775d getWatchersLocked();

        int getWatchersLockedValue();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$FacebookOrBuilder */
    public interface FacebookOrBuilder extends MessageLiteOrBuilder {
        String getAppIds(int i);

        ByteString getAppIdsBytes(int i);

        int getAppIdsCount();

        List<String> getAppIdsList();

        boolean getInviteAll();

        long getMaxAge();

        long getMinAge();

        long getPercentOfFriendInvited();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$FeatureFlagsOrBuilder */
    public interface FeatureFlagsOrBuilder extends MessageLiteOrBuilder {
        boolean getBroadcastedInvitationsEnabled();

        boolean getBrumpEnabled();

        boolean getBrumpHintEnabled();

        boolean getChatPicSharingEnabled();

        boolean getChatUIV2Enabled();

        boolean getContextualLabeling();

        boolean getDiscoverEnabled();

        boolean getDisplayReferrerFromLinkEnabled();

        boolean getFootstepsEnabled();

        boolean getFootstepsV2Enabled();

        boolean getGatheringEnabled();

        boolean getGroupChatEnabled();

        boolean getHeadingEnabled();

        boolean getInstagramCardsSharingEnabled();

        boolean getLandsharkEnabled();

        boolean getLockedWatchersEnabled();

        boolean getOptOutSuggestEnabled();

        boolean getRecentEmojiPerTargetEnabled();

        boolean getRecommendationChainsEnabled();

        boolean getRequestMediaEnabled();

        boolean getSkipSMSForInvitationsEnabled();

        boolean getSleepEnabled();

        boolean getSnapchatSharingEnabled();

        boolean getTSTEnabled();

        boolean getTotsEnabled();

        boolean getUsernameEnabled();

        boolean getZendeskEnabled();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$FootstepsOrBuilder */
    public interface FootstepsOrBuilder extends MessageLiteOrBuilder {
        Duration getViewsTickerInterval();

        boolean hasViewsTickerInterval();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$GlobalOrBuilder */
    public interface GlobalOrBuilder extends MessageLiteOrBuilder {
        Duration getAliveThreshold();

        String getContactHashKey();

        ByteString getContactHashKeyBytes();

        long getContactsBuffer();

        Duration getContactsUploadTimeout();

        double getDefaultTopFriend();

        Duration getLiveThreshold();

        long getMaxSearchResults();

        boolean hasAliveThreshold();

        boolean hasContactsUploadTimeout();

        boolean hasLiveThreshold();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$LocationOrBuilder */
    public interface LocationOrBuilder extends MessageLiteOrBuilder {
        boolean getApwlsEnableAndroid();

        boolean getApwlsEnableIos();

        int getCorelocationProviderMaxGpsPrecisionInMeter();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$MapOrBuilder */
    public interface MapOrBuilder extends MessageLiteOrBuilder {
        double getDistanceThreshold();

        Duration getGeoRouteEtaRefresh();

        double getRadiusBound();

        Duration getSpinnerOldTimeout();

        Duration getSpinnerTimeout();

        double getSquareDiameter();

        Duration getTooOldThreshold();

        double getViewportClosenessPower();

        double getViewportMaxDistance();

        double getViewportMinRadius();

        double getViewportZoomOutFactor();

        boolean hasGeoRouteEtaRefresh();

        boolean hasSpinnerOldTimeout();

        boolean hasSpinnerTimeout();

        boolean hasTooOldThreshold();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$NetworkOrBuilder */
    public interface NetworkOrBuilder extends MessageLiteOrBuilder {
        double getBackOffFactor();

        Duration getBackOffMaxTimeout();

        Duration getBackOffMinTimeout();

        Duration getGrpcDefaultKeepAlivePing();

        Duration getGrpcDefaultKeepAliveTimeout();

        Duration getGrpcPipelineKeepAlivePing();

        Duration getGrpcPipelineKeepAliveTimeout();

        long getStreamsBufferSize();

        Duration getTransportKeepAlive();

        Duration getTransportTimeout();

        Duration getUnaryTimeout();

        Duration getValveCacheTtl();

        Duration getValveCallTimeout();

        Duration getValveDialTimeout();

        String getValveUrl();

        ByteString getValveUrlBytes();

        boolean hasBackOffMaxTimeout();

        boolean hasBackOffMinTimeout();

        boolean hasGrpcDefaultKeepAlivePing();

        boolean hasGrpcDefaultKeepAliveTimeout();

        boolean hasGrpcPipelineKeepAlivePing();

        boolean hasGrpcPipelineKeepAliveTimeout();

        boolean hasTransportKeepAlive();

        boolean hasTransportTimeout();

        boolean hasUnaryTimeout();

        boolean hasValveCacheTtl();

        boolean hasValveCallTimeout();

        boolean hasValveDialTimeout();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$OnboardingOrBuilder */
    public interface OnboardingOrBuilder extends MessageLiteOrBuilder {
        boolean getAllowAgeGatingRetry();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$PipelineOrBuilder */
    public interface PipelineOrBuilder extends MessageLiteOrBuilder {
        Duration getBackgroundExitTimeout();

        double getTcDebounceHorizontalPrecisionThreshold();

        double getTcDebounceMaxDeltaPressure();

        double getTcDebounceMaxDistance();

        Duration getTcDebounceMaxDuration();

        Duration getTcFuserLowreqTimeout();

        Duration getTcSenderFirstTcTimeout();

        Duration getTcSenderTimeout();

        Duration getTcSenderWatchersResponseTimeout();

        boolean hasBackgroundExitTimeout();

        boolean hasTcDebounceMaxDuration();

        boolean hasTcFuserLowreqTimeout();

        boolean hasTcSenderFirstTcTimeout();

        boolean hasTcSenderTimeout();

        boolean hasTcSenderWatchersResponseTimeout();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$TimeOnTheSpotOrBuilder */
    public interface TimeOnTheSpotOrBuilder extends MessageLiteOrBuilder {
        Duration getIsMovingValidity();

        Duration getIsVisitPointObsolete();

        Duration getNetworkLatencyMargin();

        boolean hasIsMovingValidity();

        boolean hasIsVisitPointObsolete();

        boolean hasNetworkLatencyMargin();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$TracerOrBuilder */
    public interface TracerOrBuilder extends MessageLiteOrBuilder {
        int getFlushBufferSize();

        Duration getFlushTimeout();

        Duration getSendTimeout();

        boolean hasFlushTimeout();

        boolean hasSendTimeout();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$WeatherOrBuilder */
    public interface WeatherOrBuilder extends MessageLiteOrBuilder {
        int getCacheCellLevel();

        Duration getCacheTtl();

        boolean hasCacheTtl();
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$a */
    public static final class C6763a extends GeneratedMessageLite<C6763a, C6764a> implements BrumpOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6763a f16323f = new C6763a();

        /* renamed from: g */
        private static volatile Parser<C6763a> f16324g;

        /* renamed from: e */
        private int f16325e;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$a$a */
        public static final class C6764a extends Builder<C6763a, C6764a> implements BrumpOrBuilder {
            /* synthetic */ C6764a(C7317g gVar) {
                this();
            }

            public int getAccelerationThreshold() {
                return ((C6763a) this.instance).getAccelerationThreshold();
            }

            private C6764a() {
                super(C6763a.f16323f);
            }
        }

        static {
            f16323f.makeImmutable();
        }

        private C6763a() {
        }

        public static C6763a getDefaultInstance() {
            return f16323f;
        }

        public static Parser<C6763a> parser() {
            return f16323f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6763a();
                case 2:
                    return f16323f;
                case 3:
                    return null;
                case 4:
                    return new C6764a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6763a aVar = (C6763a) obj2;
                    boolean z2 = this.f16325e != 0;
                    int i = this.f16325e;
                    if (aVar.f16325e != 0) {
                        z = true;
                    }
                    this.f16325e = visitor.visitInt(z2, i, z, aVar.f16325e);
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
                                    this.f16325e = codedInputStream.readInt32();
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
                    if (f16324g == null) {
                        synchronized (C6763a.class) {
                            if (f16324g == null) {
                                f16324g = new DefaultInstanceBasedParser(f16323f);
                            }
                        }
                    }
                    return f16324g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16323f;
        }

        public int getAccelerationThreshold() {
            return this.f16325e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16325e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16325e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$b */
    public static final class C6765b extends Builder<ConfigurationProto$Configuration, C6765b> implements ConfigurationProto$ConfigurationOrBuilder {
        /* synthetic */ C6765b(C7317g gVar) {
            this();
        }

        public C6763a getBrump() {
            return ((ConfigurationProto$Configuration) this.instance).getBrump();
        }

        public C6766c getChat() {
            return ((ConfigurationProto$Configuration) this.instance).getChat();
        }

        public C6768d getDescendants() {
            return ((ConfigurationProto$Configuration) this.instance).getDescendants();
        }

        public C6770e getExperimentFlags() {
            return ((ConfigurationProto$Configuration) this.instance).getExperimentFlags();
        }

        public C6779f getFacebook() {
            return ((ConfigurationProto$Configuration) this.instance).getFacebook();
        }

        public C6781g getFeatureFlags() {
            return ((ConfigurationProto$Configuration) this.instance).getFeatureFlags();
        }

        public C6783h getFootsteps() {
            return ((ConfigurationProto$Configuration) this.instance).getFootsteps();
        }

        public C6785i getGlobal() {
            return ((ConfigurationProto$Configuration) this.instance).getGlobal();
        }

        public C6787j getLocation() {
            return ((ConfigurationProto$Configuration) this.instance).getLocation();
        }

        public C6789k getMap() {
            return ((ConfigurationProto$Configuration) this.instance).getMap();
        }

        public C6791l getNetwork() {
            return ((ConfigurationProto$Configuration) this.instance).getNetwork();
        }

        public C6793m getOnboarding() {
            return ((ConfigurationProto$Configuration) this.instance).getOnboarding();
        }

        public C6795n getPipeline() {
            return ((ConfigurationProto$Configuration) this.instance).getPipeline();
        }

        public C6797o getTimeOnTheSpot() {
            return ((ConfigurationProto$Configuration) this.instance).getTimeOnTheSpot();
        }

        public C6799p getTracer() {
            return ((ConfigurationProto$Configuration) this.instance).getTracer();
        }

        public C6801q getWeather() {
            return ((ConfigurationProto$Configuration) this.instance).getWeather();
        }

        public boolean hasBrump() {
            return ((ConfigurationProto$Configuration) this.instance).hasBrump();
        }

        public boolean hasChat() {
            return ((ConfigurationProto$Configuration) this.instance).hasChat();
        }

        public boolean hasDescendants() {
            return ((ConfigurationProto$Configuration) this.instance).hasDescendants();
        }

        public boolean hasExperimentFlags() {
            return ((ConfigurationProto$Configuration) this.instance).hasExperimentFlags();
        }

        public boolean hasFacebook() {
            return ((ConfigurationProto$Configuration) this.instance).hasFacebook();
        }

        public boolean hasFeatureFlags() {
            return ((ConfigurationProto$Configuration) this.instance).hasFeatureFlags();
        }

        public boolean hasFootsteps() {
            return ((ConfigurationProto$Configuration) this.instance).hasFootsteps();
        }

        public boolean hasGlobal() {
            return ((ConfigurationProto$Configuration) this.instance).hasGlobal();
        }

        public boolean hasLocation() {
            return ((ConfigurationProto$Configuration) this.instance).hasLocation();
        }

        public boolean hasMap() {
            return ((ConfigurationProto$Configuration) this.instance).hasMap();
        }

        public boolean hasNetwork() {
            return ((ConfigurationProto$Configuration) this.instance).hasNetwork();
        }

        public boolean hasOnboarding() {
            return ((ConfigurationProto$Configuration) this.instance).hasOnboarding();
        }

        public boolean hasPipeline() {
            return ((ConfigurationProto$Configuration) this.instance).hasPipeline();
        }

        public boolean hasTimeOnTheSpot() {
            return ((ConfigurationProto$Configuration) this.instance).hasTimeOnTheSpot();
        }

        public boolean hasTracer() {
            return ((ConfigurationProto$Configuration) this.instance).hasTracer();
        }

        public boolean hasWeather() {
            return ((ConfigurationProto$Configuration) this.instance).hasWeather();
        }

        private C6765b() {
            super(ConfigurationProto$Configuration.f16305u);
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$c */
    public static final class C6766c extends GeneratedMessageLite<C6766c, C6767a> implements ChatOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static final C6766c f16326i = new C6766c();

        /* renamed from: j */
        private static volatile Parser<C6766c> f16327j;

        /* renamed from: e */
        private String f16328e = "";

        /* renamed from: f */
        private Duration f16329f;

        /* renamed from: g */
        private Duration f16330g;

        /* renamed from: h */
        private Duration f16331h;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$c$a */
        public static final class C6767a extends Builder<C6766c, C6767a> implements ChatOrBuilder {
            /* synthetic */ C6767a(C7317g gVar) {
                this();
            }

            public String getDefaultEmojiUuid() {
                return ((C6766c) this.instance).getDefaultEmojiUuid();
            }

            public ByteString getDefaultEmojiUuidBytes() {
                return ((C6766c) this.instance).getDefaultEmojiUuidBytes();
            }

            public Duration getEmojiSenderTimeout() {
                return ((C6766c) this.instance).getEmojiSenderTimeout();
            }

            public Duration getMediaSenderTimeout() {
                return ((C6766c) this.instance).getMediaSenderTimeout();
            }

            public Duration getTextSenderTimeout() {
                return ((C6766c) this.instance).getTextSenderTimeout();
            }

            public boolean hasEmojiSenderTimeout() {
                return ((C6766c) this.instance).hasEmojiSenderTimeout();
            }

            public boolean hasMediaSenderTimeout() {
                return ((C6766c) this.instance).hasMediaSenderTimeout();
            }

            public boolean hasTextSenderTimeout() {
                return ((C6766c) this.instance).hasTextSenderTimeout();
            }

            private C6767a() {
                super(C6766c.f16326i);
            }
        }

        static {
            f16326i.makeImmutable();
        }

        private C6766c() {
        }

        public static C6766c getDefaultInstance() {
            return f16326i;
        }

        public static Parser<C6766c> parser() {
            return f16326i.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6766c();
                case 2:
                    return f16326i;
                case 3:
                    return null;
                case 4:
                    return new C6767a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6766c cVar = (C6766c) obj2;
                    this.f16328e = visitor.visitString(!this.f16328e.isEmpty(), this.f16328e, true ^ cVar.f16328e.isEmpty(), cVar.f16328e);
                    this.f16329f = (Duration) visitor.visitMessage(this.f16329f, cVar.f16329f);
                    this.f16330g = (Duration) visitor.visitMessage(this.f16330g, cVar.f16330g);
                    this.f16331h = (Duration) visitor.visitMessage(this.f16331h, cVar.f16331h);
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
                                    this.f16328e = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    Builder builder = this.f16329f != null ? (Duration.Builder) this.f16329f.toBuilder() : null;
                                    this.f16329f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16329f);
                                        this.f16329f = (Duration) builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Builder builder2 = this.f16330g != null ? (Duration.Builder) this.f16330g.toBuilder() : null;
                                    this.f16330g = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f16330g);
                                        this.f16330g = (Duration) builder2.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    Builder builder3 = this.f16331h != null ? (Duration.Builder) this.f16331h.toBuilder() : null;
                                    this.f16331h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f16331h);
                                        this.f16331h = (Duration) builder3.buildPartial();
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
                    if (f16327j == null) {
                        synchronized (C6766c.class) {
                            if (f16327j == null) {
                                f16327j = new DefaultInstanceBasedParser(f16326i);
                            }
                        }
                    }
                    return f16327j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16326i;
        }

        public String getDefaultEmojiUuid() {
            return this.f16328e;
        }

        public ByteString getDefaultEmojiUuidBytes() {
            return ByteString.copyFromUtf8(this.f16328e);
        }

        public Duration getEmojiSenderTimeout() {
            Duration duration = this.f16330g;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getMediaSenderTimeout() {
            Duration duration = this.f16331h;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f16328e.isEmpty()) {
                i2 = 0 + CodedOutputStream.computeStringSize(1, getDefaultEmojiUuid());
            }
            if (this.f16329f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getTextSenderTimeout());
            }
            if (this.f16330g != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getEmojiSenderTimeout());
            }
            if (this.f16331h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getMediaSenderTimeout());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Duration getTextSenderTimeout() {
            Duration duration = this.f16329f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public boolean hasEmojiSenderTimeout() {
            return this.f16330g != null;
        }

        public boolean hasMediaSenderTimeout() {
            return this.f16331h != null;
        }

        public boolean hasTextSenderTimeout() {
            return this.f16329f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.f16328e.isEmpty()) {
                codedOutputStream.writeString(1, getDefaultEmojiUuid());
            }
            if (this.f16329f != null) {
                codedOutputStream.writeMessage(2, getTextSenderTimeout());
            }
            if (this.f16330g != null) {
                codedOutputStream.writeMessage(3, getEmojiSenderTimeout());
            }
            if (this.f16331h != null) {
                codedOutputStream.writeMessage(4, getMediaSenderTimeout());
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$d */
    public static final class C6768d extends GeneratedMessageLite<C6768d, C6769a> implements DescendantsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6768d f16332f = new C6768d();

        /* renamed from: g */
        private static volatile Parser<C6768d> f16333g;

        /* renamed from: e */
        private int f16334e;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$d$a */
        public static final class C6769a extends Builder<C6768d, C6769a> implements DescendantsOrBuilder {
            /* synthetic */ C6769a(C7317g gVar) {
                this();
            }

            public int getNumberOfDescendantsToShowTheRankCard() {
                return ((C6768d) this.instance).getNumberOfDescendantsToShowTheRankCard();
            }

            private C6769a() {
                super(C6768d.f16332f);
            }
        }

        static {
            f16332f.makeImmutable();
        }

        private C6768d() {
        }

        public static C6768d getDefaultInstance() {
            return f16332f;
        }

        public static Parser<C6768d> parser() {
            return f16332f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6768d();
                case 2:
                    return f16332f;
                case 3:
                    return null;
                case 4:
                    return new C6769a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6768d dVar = (C6768d) obj2;
                    boolean z2 = this.f16334e != 0;
                    int i = this.f16334e;
                    if (dVar.f16334e != 0) {
                        z = true;
                    }
                    this.f16334e = visitor.visitInt(z2, i, z, dVar.f16334e);
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
                                    this.f16334e = codedInputStream.readInt32();
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
                    if (f16333g == null) {
                        synchronized (C6768d.class) {
                            if (f16333g == null) {
                                f16333g = new DefaultInstanceBasedParser(f16332f);
                            }
                        }
                    }
                    return f16333g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16332f;
        }

        public int getNumberOfDescendantsToShowTheRankCard() {
            return this.f16334e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16334e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16334e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$e */
    public static final class C6770e extends GeneratedMessageLite<C6770e, C6772b> implements ExperimentFlagsOrBuilder {

        /* renamed from: w */
        private static final Converter<Integer, C6773c> f16335w = new C6771a();
        /* access modifiers changed from: private */

        /* renamed from: x */
        public static final C6770e f16336x = new C6770e();

        /* renamed from: y */
        private static volatile Parser<C6770e> f16337y;

        /* renamed from: e */
        private int f16338e;

        /* renamed from: f */
        private IntList f16339f = GeneratedMessageLite.emptyIntList();

        /* renamed from: g */
        private int f16340g;

        /* renamed from: h */
        private int f16341h;

        /* renamed from: i */
        private int f16342i;

        /* renamed from: j */
        private int f16343j;

        /* renamed from: k */
        private int f16344k;

        /* renamed from: l */
        private int f16345l;

        /* renamed from: m */
        private int f16346m;

        /* renamed from: n */
        private int f16347n;

        /* renamed from: o */
        private int f16348o;

        /* renamed from: p */
        private int f16349p;

        /* renamed from: q */
        private int f16350q;

        /* renamed from: r */
        private int f16351r;

        /* renamed from: s */
        private int f16352s;

        /* renamed from: t */
        private int f16353t;

        /* renamed from: u */
        private int f16354u;

        /* renamed from: v */
        private int f16355v;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$a */
        class C6771a implements Converter<Integer, C6773c> {
            C6771a() {
            }

            /* renamed from: a */
            public C6773c convert(Integer num) {
                C6773c a = C6773c.m17517a(num.intValue());
                return a == null ? C6773c.UNRECOGNIZED : a;
            }
        }

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$b */
        public static final class C6772b extends Builder<C6770e, C6772b> implements ExperimentFlagsOrBuilder {
            /* synthetic */ C6772b(C7317g gVar) {
                this();
            }

            public C6773c getActivatedExperiments(int i) {
                return ((C6770e) this.instance).getActivatedExperiments(i);
            }

            public int getActivatedExperimentsCount() {
                return ((C6770e) this.instance).getActivatedExperimentsCount();
            }

            public List<C6773c> getActivatedExperimentsList() {
                return ((C6770e) this.instance).getActivatedExperimentsList();
            }

            public int getActivatedExperimentsValue(int i) {
                return ((C6770e) this.instance).getActivatedExperimentsValue(i);
            }

            public List<Integer> getActivatedExperimentsValueList() {
                return Collections.unmodifiableList(((C6770e) this.instance).getActivatedExperimentsValueList());
            }

            public C6775d getAozContainingWhileInUseUsers() {
                return ((C6770e) this.instance).getAozContainingWhileInUseUsers();
            }

            public int getAozContainingWhileInUseUsersValue() {
                return ((C6770e) this.instance).getAozContainingWhileInUseUsersValue();
            }

            public C6775d getBroadcastedInvitesDisabled() {
                return ((C6770e) this.instance).getBroadcastedInvitesDisabled();
            }

            public int getBroadcastedInvitesDisabledValue() {
                return ((C6770e) this.instance).getBroadcastedInvitesDisabledValue();
            }

            public C6775d getBroadcastedInvitesV2() {
                return ((C6770e) this.instance).getBroadcastedInvitesV2();
            }

            public int getBroadcastedInvitesV2Value() {
                return ((C6770e) this.instance).getBroadcastedInvitesV2Value();
            }

            public C6775d getDisplaySocialNetwork() {
                return ((C6770e) this.instance).getDisplaySocialNetwork();
            }

            public int getDisplaySocialNetworkValue() {
                return ((C6770e) this.instance).getDisplaySocialNetworkValue();
            }

            public C6777e getMasterGroup() {
                return ((C6770e) this.instance).getMasterGroup();
            }

            public int getMasterGroupValue() {
                return ((C6770e) this.instance).getMasterGroupValue();
            }

            public C6775d getMultipleContactsOneInvite() {
                return ((C6770e) this.instance).getMultipleContactsOneInvite();
            }

            public int getMultipleContactsOneInviteValue() {
                return ((C6770e) this.instance).getMultipleContactsOneInviteValue();
            }

            public C6775d getNoFriendsCarousel() {
                return ((C6770e) this.instance).getNoFriendsCarousel();
            }

            public int getNoFriendsCarouselValue() {
                return ((C6770e) this.instance).getNoFriendsCarouselValue();
            }

            public C6775d getNoFriendsMultipleDialogs() {
                return ((C6770e) this.instance).getNoFriendsMultipleDialogs();
            }

            public int getNoFriendsMultipleDialogsValue() {
                return ((C6770e) this.instance).getNoFriendsMultipleDialogsValue();
            }

            public C6775d getNoFriendsPushNotification() {
                return ((C6770e) this.instance).getNoFriendsPushNotification();
            }

            public int getNoFriendsPushNotificationValue() {
                return ((C6770e) this.instance).getNoFriendsPushNotificationValue();
            }

            public C6775d getNoFriendsSingleDialog() {
                return ((C6770e) this.instance).getNoFriendsSingleDialog();
            }

            public int getNoFriendsSingleDialogValue() {
                return ((C6770e) this.instance).getNoFriendsSingleDialogValue();
            }

            public C6775d getQuickAddInbox() {
                return ((C6770e) this.instance).getQuickAddInbox();
            }

            public int getQuickAddInboxValue() {
                return ((C6770e) this.instance).getQuickAddInboxValue();
            }

            public C6775d getQuickAddProfile() {
                return ((C6770e) this.instance).getQuickAddProfile();
            }

            public int getQuickAddProfileValue() {
                return ((C6770e) this.instance).getQuickAddProfileValue();
            }

            public C6775d getSocialNetworksWithBroadcastedInvites() {
                return ((C6770e) this.instance).getSocialNetworksWithBroadcastedInvites();
            }

            public int getSocialNetworksWithBroadcastedInvitesValue() {
                return ((C6770e) this.instance).getSocialNetworksWithBroadcastedInvitesValue();
            }

            public C6775d getTimetogetherLocked() {
                return ((C6770e) this.instance).getTimetogetherLocked();
            }

            public int getTimetogetherLockedValue() {
                return ((C6770e) this.instance).getTimetogetherLockedValue();
            }

            public C6775d getUseInviteLink() {
                return ((C6770e) this.instance).getUseInviteLink();
            }

            public int getUseInviteLinkValue() {
                return ((C6770e) this.instance).getUseInviteLinkValue();
            }

            public C6775d getWatchersLocked() {
                return ((C6770e) this.instance).getWatchersLocked();
            }

            public int getWatchersLockedValue() {
                return ((C6770e) this.instance).getWatchersLockedValue();
            }

            private C6772b() {
                super(C6770e.f16336x);
            }
        }

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$c */
        public enum C6773c implements EnumLite {
            EXPERIMENT_UNKNOWN(0),
            EXPERIMENT_GROUP_CHAT_OPTIONAL(1),
            EXPERIMENT_GROUP_CHAT_MANDATORY(2),
            EXPERIMENT_NOFRIENDS_SINGLE_DIALOG(3),
            EXPERIMENT_NOFRIENDS_MULTIPLE_DIALOGS(4),
            EXPERIMENT_NOFRIENDS_CAROUSEL(5),
            EXPERIMENT_SOCIAL_NETWORK_ONBOARDING(6),
            EXPERIMENT_INVITE_LINK(7),
            EXPERIMENT_NO_FRIENDS_24H_PUSH_NOTIFICATION(8),
            EXPERIMENT_MULTIPLE_CONTACTS_ONE_INVITE(9),
            EXPERIMENT_WATCHERS_LOCKED(10),
            EXPERIMENT_TIMETOGETHER_LOCKED(11),
            EXPERIMENT_QUICK_ADD_INBOX(12),
            EXPERIMENT_QUICK_ADD_PROFILE(13),
            EXPERIMENT_BROADCASTED_INVITES_DISABLED(14),
            EXPERIMENT_SOCIAL_NETWORKS_WITH_BROADCASTED_INVITES(15),
            EXPERIMENT_AOZ_CONTAINING_WHILE_IN_USE(16),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16375e;

            /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$c$a */
            class C6774a implements EnumLiteMap<C6773c> {
                C6774a() {
                }

                public C6773c findValueByNumber(int i) {
                    return C6773c.m17517a(i);
                }
            }

            static {
                new C6774a();
            }

            private C6773c(int i) {
                this.f16375e = i;
            }

            /* renamed from: a */
            public static C6773c m17517a(int i) {
                switch (i) {
                    case 0:
                        return EXPERIMENT_UNKNOWN;
                    case 1:
                        return EXPERIMENT_GROUP_CHAT_OPTIONAL;
                    case 2:
                        return EXPERIMENT_GROUP_CHAT_MANDATORY;
                    case 3:
                        return EXPERIMENT_NOFRIENDS_SINGLE_DIALOG;
                    case 4:
                        return EXPERIMENT_NOFRIENDS_MULTIPLE_DIALOGS;
                    case 5:
                        return EXPERIMENT_NOFRIENDS_CAROUSEL;
                    case 6:
                        return EXPERIMENT_SOCIAL_NETWORK_ONBOARDING;
                    case 7:
                        return EXPERIMENT_INVITE_LINK;
                    case 8:
                        return EXPERIMENT_NO_FRIENDS_24H_PUSH_NOTIFICATION;
                    case 9:
                        return EXPERIMENT_MULTIPLE_CONTACTS_ONE_INVITE;
                    case 10:
                        return EXPERIMENT_WATCHERS_LOCKED;
                    case 11:
                        return EXPERIMENT_TIMETOGETHER_LOCKED;
                    case 12:
                        return EXPERIMENT_QUICK_ADD_INBOX;
                    case 13:
                        return EXPERIMENT_QUICK_ADD_PROFILE;
                    case 14:
                        return EXPERIMENT_BROADCASTED_INVITES_DISABLED;
                    case 15:
                        return EXPERIMENT_SOCIAL_NETWORKS_WITH_BROADCASTED_INVITES;
                    case 16:
                        return EXPERIMENT_AOZ_CONTAINING_WHILE_IN_USE;
                    default:
                        return null;
                }
            }

            public final int getNumber() {
                return this.f16375e;
            }
        }

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$d */
        public enum C6775d implements EnumLite {
            GROUP_UNKNOWN(0),
            GROUP_IN_EXPERIMENT(1),
            GROUP_CONTROL_A(10),
            GROUP_CONTROL_B(11),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16382e;

            /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$d$a */
            class C6776a implements EnumLiteMap<C6775d> {
                C6776a() {
                }

                public C6775d findValueByNumber(int i) {
                    return C6775d.m17518a(i);
                }
            }

            static {
                new C6776a();
            }

            private C6775d(int i) {
                this.f16382e = i;
            }

            /* renamed from: a */
            public static C6775d m17518a(int i) {
                if (i == 0) {
                    return GROUP_UNKNOWN;
                }
                if (i == 1) {
                    return GROUP_IN_EXPERIMENT;
                }
                if (i == 10) {
                    return GROUP_CONTROL_A;
                }
                if (i != 11) {
                    return null;
                }
                return GROUP_CONTROL_B;
            }

            public final int getNumber() {
                return this.f16382e;
            }
        }

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$e */
        public enum C6777e implements EnumLite {
            MASTER_CONTROL_GROUP_UNKNOWN(0),
            MASTER_CONTROL_GROUP_A(1),
            MASTER_CONTROL_GROUP_B(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: e */
            private final int f16388e;

            /* renamed from: co.znly.models.ConfigurationProto$Configuration$e$e$a */
            class C6778a implements EnumLiteMap<C6777e> {
                C6778a() {
                }

                public C6777e findValueByNumber(int i) {
                    return C6777e.m17519a(i);
                }
            }

            static {
                new C6778a();
            }

            private C6777e(int i) {
                this.f16388e = i;
            }

            /* renamed from: a */
            public static C6777e m17519a(int i) {
                if (i == 0) {
                    return MASTER_CONTROL_GROUP_UNKNOWN;
                }
                if (i == 1) {
                    return MASTER_CONTROL_GROUP_A;
                }
                if (i != 2) {
                    return null;
                }
                return MASTER_CONTROL_GROUP_B;
            }

            public final int getNumber() {
                return this.f16388e;
            }
        }

        static {
            f16336x.makeImmutable();
        }

        private C6770e() {
        }

        public static C6770e getDefaultInstance() {
            return f16336x;
        }

        public static C6772b newBuilder() {
            return (C6772b) f16336x.toBuilder();
        }

        public static Parser<C6770e> parser() {
            return f16336x.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6770e();
                case 2:
                    return f16336x;
                case 3:
                    this.f16339f.makeImmutable();
                    return null;
                case 4:
                    return new C6772b(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6770e eVar = (C6770e) obj2;
                    this.f16339f = visitor.visitIntList(this.f16339f, eVar.f16339f);
                    this.f16340g = visitor.visitInt(this.f16340g != 0, this.f16340g, eVar.f16340g != 0, eVar.f16340g);
                    this.f16341h = visitor.visitInt(this.f16341h != 0, this.f16341h, eVar.f16341h != 0, eVar.f16341h);
                    this.f16342i = visitor.visitInt(this.f16342i != 0, this.f16342i, eVar.f16342i != 0, eVar.f16342i);
                    this.f16343j = visitor.visitInt(this.f16343j != 0, this.f16343j, eVar.f16343j != 0, eVar.f16343j);
                    this.f16344k = visitor.visitInt(this.f16344k != 0, this.f16344k, eVar.f16344k != 0, eVar.f16344k);
                    this.f16345l = visitor.visitInt(this.f16345l != 0, this.f16345l, eVar.f16345l != 0, eVar.f16345l);
                    this.f16346m = visitor.visitInt(this.f16346m != 0, this.f16346m, eVar.f16346m != 0, eVar.f16346m);
                    this.f16347n = visitor.visitInt(this.f16347n != 0, this.f16347n, eVar.f16347n != 0, eVar.f16347n);
                    this.f16348o = visitor.visitInt(this.f16348o != 0, this.f16348o, eVar.f16348o != 0, eVar.f16348o);
                    this.f16349p = visitor.visitInt(this.f16349p != 0, this.f16349p, eVar.f16349p != 0, eVar.f16349p);
                    this.f16350q = visitor.visitInt(this.f16350q != 0, this.f16350q, eVar.f16350q != 0, eVar.f16350q);
                    this.f16351r = visitor.visitInt(this.f16351r != 0, this.f16351r, eVar.f16351r != 0, eVar.f16351r);
                    this.f16352s = visitor.visitInt(this.f16352s != 0, this.f16352s, eVar.f16352s != 0, eVar.f16352s);
                    this.f16353t = visitor.visitInt(this.f16353t != 0, this.f16353t, eVar.f16353t != 0, eVar.f16353t);
                    this.f16354u = visitor.visitInt(this.f16354u != 0, this.f16354u, eVar.f16354u != 0, eVar.f16354u);
                    boolean z2 = this.f16355v != 0;
                    int i = this.f16355v;
                    if (eVar.f16355v != 0) {
                        z = true;
                    }
                    this.f16355v = visitor.visitInt(z2, i, z, eVar.f16355v);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f16338e |= eVar.f16338e;
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
                                    if (!this.f16339f.isModifiable()) {
                                        this.f16339f = GeneratedMessageLite.mutableCopy(this.f16339f);
                                    }
                                    this.f16339f.addInt(codedInputStream.readEnum());
                                    break;
                                case 42:
                                    if (!this.f16339f.isModifiable()) {
                                        this.f16339f = GeneratedMessageLite.mutableCopy(this.f16339f);
                                    }
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f16339f.addInt(codedInputStream.readEnum());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                    break;
                                case 48:
                                    this.f16340g = codedInputStream.readEnum();
                                    break;
                                case 72:
                                    this.f16341h = codedInputStream.readEnum();
                                    break;
                                case 80:
                                    this.f16342i = codedInputStream.readEnum();
                                    break;
                                case 88:
                                    this.f16343j = codedInputStream.readEnum();
                                    break;
                                case 96:
                                    this.f16344k = codedInputStream.readEnum();
                                    break;
                                case 104:
                                    this.f16345l = codedInputStream.readEnum();
                                    break;
                                case 112:
                                    this.f16346m = codedInputStream.readEnum();
                                    break;
                                case 120:
                                    this.f16347n = codedInputStream.readEnum();
                                    break;
                                case 128:
                                    this.f16348o = codedInputStream.readEnum();
                                    break;
                                case 136:
                                    this.f16349p = codedInputStream.readEnum();
                                    break;
                                case 144:
                                    this.f16350q = codedInputStream.readEnum();
                                    break;
                                case 152:
                                    this.f16351r = codedInputStream.readEnum();
                                    break;
                                case 160:
                                    this.f16352s = codedInputStream.readEnum();
                                    break;
                                case 168:
                                    this.f16353t = codedInputStream.readEnum();
                                    break;
                                case 176:
                                    this.f16354u = codedInputStream.readEnum();
                                    break;
                                case 184:
                                    this.f16355v = codedInputStream.readEnum();
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
                    if (f16337y == null) {
                        synchronized (C6770e.class) {
                            if (f16337y == null) {
                                f16337y = new DefaultInstanceBasedParser(f16336x);
                            }
                        }
                    }
                    return f16337y;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16336x;
        }

        public C6773c getActivatedExperiments(int i) {
            return (C6773c) f16335w.convert(Integer.valueOf(this.f16339f.getInt(i)));
        }

        public int getActivatedExperimentsCount() {
            return this.f16339f.size();
        }

        public List<C6773c> getActivatedExperimentsList() {
            return new ListAdapter(this.f16339f, f16335w);
        }

        public int getActivatedExperimentsValue(int i) {
            return this.f16339f.getInt(i);
        }

        public List<Integer> getActivatedExperimentsValueList() {
            return this.f16339f;
        }

        public C6775d getAozContainingWhileInUseUsers() {
            C6775d a = C6775d.m17518a(this.f16355v);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getAozContainingWhileInUseUsersValue() {
            return this.f16355v;
        }

        public C6775d getBroadcastedInvitesDisabled() {
            C6775d a = C6775d.m17518a(this.f16353t);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getBroadcastedInvitesDisabledValue() {
            return this.f16353t;
        }

        public C6775d getBroadcastedInvitesV2() {
            C6775d a = C6775d.m17518a(this.f16346m);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getBroadcastedInvitesV2Value() {
            return this.f16346m;
        }

        public C6775d getDisplaySocialNetwork() {
            C6775d a = C6775d.m17518a(this.f16344k);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getDisplaySocialNetworkValue() {
            return this.f16344k;
        }

        public C6777e getMasterGroup() {
            C6777e a = C6777e.m17519a(this.f16340g);
            return a == null ? C6777e.UNRECOGNIZED : a;
        }

        public int getMasterGroupValue() {
            return this.f16340g;
        }

        public C6775d getMultipleContactsOneInvite() {
            C6775d a = C6775d.m17518a(this.f16348o);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getMultipleContactsOneInviteValue() {
            return this.f16348o;
        }

        public C6775d getNoFriendsCarousel() {
            C6775d a = C6775d.m17518a(this.f16343j);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getNoFriendsCarouselValue() {
            return this.f16343j;
        }

        public C6775d getNoFriendsMultipleDialogs() {
            C6775d a = C6775d.m17518a(this.f16342i);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getNoFriendsMultipleDialogsValue() {
            return this.f16342i;
        }

        public C6775d getNoFriendsPushNotification() {
            C6775d a = C6775d.m17518a(this.f16347n);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getNoFriendsPushNotificationValue() {
            return this.f16347n;
        }

        public C6775d getNoFriendsSingleDialog() {
            C6775d a = C6775d.m17518a(this.f16341h);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getNoFriendsSingleDialogValue() {
            return this.f16341h;
        }

        public C6775d getQuickAddInbox() {
            C6775d a = C6775d.m17518a(this.f16351r);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getQuickAddInboxValue() {
            return this.f16351r;
        }

        public C6775d getQuickAddProfile() {
            C6775d a = C6775d.m17518a(this.f16352s);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getQuickAddProfileValue() {
            return this.f16352s;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f16339f.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.f16339f.getInt(i3));
            }
            int size = 0 + i2 + (this.f16339f.size() * 1);
            if (this.f16340g != C6777e.MASTER_CONTROL_GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(6, this.f16340g);
            }
            if (this.f16341h != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(9, this.f16341h);
            }
            if (this.f16342i != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(10, this.f16342i);
            }
            if (this.f16343j != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(11, this.f16343j);
            }
            if (this.f16344k != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.f16344k);
            }
            if (this.f16345l != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(13, this.f16345l);
            }
            if (this.f16346m != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(14, this.f16346m);
            }
            if (this.f16347n != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(15, this.f16347n);
            }
            if (this.f16348o != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(16, this.f16348o);
            }
            if (this.f16349p != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(17, this.f16349p);
            }
            if (this.f16350q != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(18, this.f16350q);
            }
            if (this.f16351r != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(19, this.f16351r);
            }
            if (this.f16352s != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(20, this.f16352s);
            }
            if (this.f16353t != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(21, this.f16353t);
            }
            if (this.f16354u != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(22, this.f16354u);
            }
            if (this.f16355v != C6775d.GROUP_UNKNOWN.getNumber()) {
                size += CodedOutputStream.computeEnumSize(23, this.f16355v);
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        public C6775d getSocialNetworksWithBroadcastedInvites() {
            C6775d a = C6775d.m17518a(this.f16354u);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getSocialNetworksWithBroadcastedInvitesValue() {
            return this.f16354u;
        }

        public C6775d getTimetogetherLocked() {
            C6775d a = C6775d.m17518a(this.f16350q);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getTimetogetherLockedValue() {
            return this.f16350q;
        }

        public C6775d getUseInviteLink() {
            C6775d a = C6775d.m17518a(this.f16345l);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getUseInviteLinkValue() {
            return this.f16345l;
        }

        public C6775d getWatchersLocked() {
            C6775d a = C6775d.m17518a(this.f16349p);
            return a == null ? C6775d.UNRECOGNIZED : a;
        }

        public int getWatchersLockedValue() {
            return this.f16349p;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.f16339f.size(); i++) {
                codedOutputStream.writeEnum(5, this.f16339f.getInt(i));
            }
            if (this.f16340g != C6777e.MASTER_CONTROL_GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(6, this.f16340g);
            }
            if (this.f16341h != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(9, this.f16341h);
            }
            if (this.f16342i != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(10, this.f16342i);
            }
            if (this.f16343j != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(11, this.f16343j);
            }
            if (this.f16344k != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(12, this.f16344k);
            }
            if (this.f16345l != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(13, this.f16345l);
            }
            if (this.f16346m != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(14, this.f16346m);
            }
            if (this.f16347n != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(15, this.f16347n);
            }
            if (this.f16348o != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(16, this.f16348o);
            }
            if (this.f16349p != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(17, this.f16349p);
            }
            if (this.f16350q != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(18, this.f16350q);
            }
            if (this.f16351r != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(19, this.f16351r);
            }
            if (this.f16352s != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(20, this.f16352s);
            }
            if (this.f16353t != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(21, this.f16353t);
            }
            if (this.f16354u != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(22, this.f16354u);
            }
            if (this.f16355v != C6775d.GROUP_UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(23, this.f16355v);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$f */
    public static final class C6779f extends GeneratedMessageLite<C6779f, C6780a> implements FacebookOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static final C6779f f16389k = new C6779f();

        /* renamed from: l */
        private static volatile Parser<C6779f> f16390l;

        /* renamed from: e */
        private int f16391e;

        /* renamed from: f */
        private ProtobufList<String> f16392f = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: g */
        private boolean f16393g;

        /* renamed from: h */
        private long f16394h;

        /* renamed from: i */
        private long f16395i;

        /* renamed from: j */
        private long f16396j;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$f$a */
        public static final class C6780a extends Builder<C6779f, C6780a> implements FacebookOrBuilder {
            /* synthetic */ C6780a(C7317g gVar) {
                this();
            }

            public String getAppIds(int i) {
                return ((C6779f) this.instance).getAppIds(i);
            }

            public ByteString getAppIdsBytes(int i) {
                return ((C6779f) this.instance).getAppIdsBytes(i);
            }

            public int getAppIdsCount() {
                return ((C6779f) this.instance).getAppIdsCount();
            }

            public List<String> getAppIdsList() {
                return Collections.unmodifiableList(((C6779f) this.instance).getAppIdsList());
            }

            public boolean getInviteAll() {
                return ((C6779f) this.instance).getInviteAll();
            }

            public long getMaxAge() {
                return ((C6779f) this.instance).getMaxAge();
            }

            public long getMinAge() {
                return ((C6779f) this.instance).getMinAge();
            }

            public long getPercentOfFriendInvited() {
                return ((C6779f) this.instance).getPercentOfFriendInvited();
            }

            private C6780a() {
                super(C6779f.f16389k);
            }
        }

        static {
            f16389k.makeImmutable();
        }

        private C6779f() {
        }

        public static C6779f getDefaultInstance() {
            return f16389k;
        }

        public static Parser<C6779f> parser() {
            return f16389k.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6779f();
                case 2:
                    return f16389k;
                case 3:
                    this.f16392f.makeImmutable();
                    return null;
                case 4:
                    return new C6780a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6779f fVar = (C6779f) obj2;
                    this.f16392f = visitor.visitList(this.f16392f, fVar.f16392f);
                    boolean z2 = this.f16393g;
                    boolean z3 = fVar.f16393g;
                    this.f16393g = visitor.visitBoolean(z2, z2, z3, z3);
                    this.f16394h = visitor.visitLong(this.f16394h != 0, this.f16394h, fVar.f16394h != 0, fVar.f16394h);
                    this.f16395i = visitor.visitLong(this.f16395i != 0, this.f16395i, fVar.f16395i != 0, fVar.f16395i);
                    this.f16396j = visitor.visitLong(this.f16396j != 0, this.f16396j, fVar.f16396j != 0, fVar.f16396j);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f16391e |= fVar.f16391e;
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
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!this.f16392f.isModifiable()) {
                                        this.f16392f = GeneratedMessageLite.mutableCopy(this.f16392f);
                                    }
                                    this.f16392f.add(readStringRequireUtf8);
                                } else if (readTag == 16) {
                                    this.f16393g = codedInputStream.readBool();
                                } else if (readTag == 24) {
                                    this.f16394h = codedInputStream.readUInt64();
                                } else if (readTag == 32) {
                                    this.f16395i = codedInputStream.readUInt64();
                                } else if (readTag == 40) {
                                    this.f16396j = codedInputStream.readUInt64();
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
                    if (f16390l == null) {
                        synchronized (C6779f.class) {
                            if (f16390l == null) {
                                f16390l = new DefaultInstanceBasedParser(f16389k);
                            }
                        }
                    }
                    return f16390l;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16389k;
        }

        public String getAppIds(int i) {
            return (String) this.f16392f.get(i);
        }

        public ByteString getAppIdsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.f16392f.get(i));
        }

        public int getAppIdsCount() {
            return this.f16392f.size();
        }

        public List<String> getAppIdsList() {
            return this.f16392f;
        }

        public boolean getInviteAll() {
            return this.f16393g;
        }

        public long getMaxAge() {
            return this.f16395i;
        }

        public long getMinAge() {
            return this.f16394h;
        }

        public long getPercentOfFriendInvited() {
            return this.f16396j;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f16392f.size(); i3++) {
                i2 += CodedOutputStream.computeStringSizeNoTag((String) this.f16392f.get(i3));
            }
            int size = 0 + i2 + (getAppIdsList().size() * 1);
            boolean z = this.f16393g;
            if (z) {
                size += CodedOutputStream.computeBoolSize(2, z);
            }
            long j = this.f16394h;
            if (j != 0) {
                size += CodedOutputStream.computeUInt64Size(3, j);
            }
            long j2 = this.f16395i;
            if (j2 != 0) {
                size += CodedOutputStream.computeUInt64Size(4, j2);
            }
            long j3 = this.f16396j;
            if (j3 != 0) {
                size += CodedOutputStream.computeUInt64Size(5, j3);
            }
            this.memoizedSerializedSize = size;
            return size;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f16392f.size(); i++) {
                codedOutputStream.writeString(1, (String) this.f16392f.get(i));
            }
            boolean z = this.f16393g;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            long j = this.f16394h;
            if (j != 0) {
                codedOutputStream.writeUInt64(3, j);
            }
            long j2 = this.f16395i;
            if (j2 != 0) {
                codedOutputStream.writeUInt64(4, j2);
            }
            long j3 = this.f16396j;
            if (j3 != 0) {
                codedOutputStream.writeUInt64(5, j3);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$g */
    public static final class C6781g extends GeneratedMessageLite<C6781g, C6782a> implements FeatureFlagsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: F */
        public static final C6781g f16397F = new C6781g();

        /* renamed from: G */
        private static volatile Parser<C6781g> f16398G;

        /* renamed from: A */
        private boolean f16399A;

        /* renamed from: B */
        private boolean f16400B;

        /* renamed from: C */
        private boolean f16401C;

        /* renamed from: D */
        private boolean f16402D;

        /* renamed from: E */
        private boolean f16403E;

        /* renamed from: e */
        private boolean f16404e;

        /* renamed from: f */
        private boolean f16405f;

        /* renamed from: g */
        private boolean f16406g;

        /* renamed from: h */
        private boolean f16407h;

        /* renamed from: i */
        private boolean f16408i;

        /* renamed from: j */
        private boolean f16409j;

        /* renamed from: k */
        private boolean f16410k;

        /* renamed from: l */
        private boolean f16411l;

        /* renamed from: m */
        private boolean f16412m;

        /* renamed from: n */
        private boolean f16413n;

        /* renamed from: o */
        private boolean f16414o;

        /* renamed from: p */
        private boolean f16415p;

        /* renamed from: q */
        private boolean f16416q;

        /* renamed from: r */
        private boolean f16417r;

        /* renamed from: s */
        private boolean f16418s;

        /* renamed from: t */
        private boolean f16419t;

        /* renamed from: u */
        private boolean f16420u;

        /* renamed from: v */
        private boolean f16421v;

        /* renamed from: w */
        private boolean f16422w;

        /* renamed from: x */
        private boolean f16423x;

        /* renamed from: y */
        private boolean f16424y;

        /* renamed from: z */
        private boolean f16425z;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$g$a */
        public static final class C6782a extends Builder<C6781g, C6782a> implements FeatureFlagsOrBuilder {
            /* synthetic */ C6782a(C7317g gVar) {
                this();
            }

            public boolean getBroadcastedInvitationsEnabled() {
                return ((C6781g) this.instance).getBroadcastedInvitationsEnabled();
            }

            public boolean getBrumpEnabled() {
                return ((C6781g) this.instance).getBrumpEnabled();
            }

            public boolean getBrumpHintEnabled() {
                return ((C6781g) this.instance).getBrumpHintEnabled();
            }

            public boolean getChatPicSharingEnabled() {
                return ((C6781g) this.instance).getChatPicSharingEnabled();
            }

            public boolean getChatUIV2Enabled() {
                return ((C6781g) this.instance).getChatUIV2Enabled();
            }

            public boolean getContextualLabeling() {
                return ((C6781g) this.instance).getContextualLabeling();
            }

            public boolean getDiscoverEnabled() {
                return ((C6781g) this.instance).getDiscoverEnabled();
            }

            public boolean getDisplayReferrerFromLinkEnabled() {
                return ((C6781g) this.instance).getDisplayReferrerFromLinkEnabled();
            }

            public boolean getFootstepsEnabled() {
                return ((C6781g) this.instance).getFootstepsEnabled();
            }

            public boolean getFootstepsV2Enabled() {
                return ((C6781g) this.instance).getFootstepsV2Enabled();
            }

            public boolean getGatheringEnabled() {
                return ((C6781g) this.instance).getGatheringEnabled();
            }

            public boolean getGroupChatEnabled() {
                return ((C6781g) this.instance).getGroupChatEnabled();
            }

            public boolean getHeadingEnabled() {
                return ((C6781g) this.instance).getHeadingEnabled();
            }

            public boolean getInstagramCardsSharingEnabled() {
                return ((C6781g) this.instance).getInstagramCardsSharingEnabled();
            }

            public boolean getLandsharkEnabled() {
                return ((C6781g) this.instance).getLandsharkEnabled();
            }

            public boolean getLockedWatchersEnabled() {
                return ((C6781g) this.instance).getLockedWatchersEnabled();
            }

            public boolean getOptOutSuggestEnabled() {
                return ((C6781g) this.instance).getOptOutSuggestEnabled();
            }

            public boolean getRecentEmojiPerTargetEnabled() {
                return ((C6781g) this.instance).getRecentEmojiPerTargetEnabled();
            }

            public boolean getRecommendationChainsEnabled() {
                return ((C6781g) this.instance).getRecommendationChainsEnabled();
            }

            public boolean getRequestMediaEnabled() {
                return ((C6781g) this.instance).getRequestMediaEnabled();
            }

            public boolean getSkipSMSForInvitationsEnabled() {
                return ((C6781g) this.instance).getSkipSMSForInvitationsEnabled();
            }

            public boolean getSleepEnabled() {
                return ((C6781g) this.instance).getSleepEnabled();
            }

            public boolean getSnapchatSharingEnabled() {
                return ((C6781g) this.instance).getSnapchatSharingEnabled();
            }

            public boolean getTSTEnabled() {
                return ((C6781g) this.instance).getTSTEnabled();
            }

            public boolean getTotsEnabled() {
                return ((C6781g) this.instance).getTotsEnabled();
            }

            public boolean getUsernameEnabled() {
                return ((C6781g) this.instance).getUsernameEnabled();
            }

            public boolean getZendeskEnabled() {
                return ((C6781g) this.instance).getZendeskEnabled();
            }

            private C6782a() {
                super(C6781g.f16397F);
            }
        }

        static {
            f16397F.makeImmutable();
        }

        private C6781g() {
        }

        public static C6781g getDefaultInstance() {
            return f16397F;
        }

        public static C6782a newBuilder() {
            return (C6782a) f16397F.toBuilder();
        }

        public static Parser<C6781g> parser() {
            return f16397F.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6781g();
                case 2:
                    return f16397F;
                case 3:
                    return null;
                case 4:
                    return new C6782a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6781g gVar = (C6781g) obj2;
                    boolean z = this.f16404e;
                    boolean z2 = gVar.f16404e;
                    this.f16404e = visitor.visitBoolean(z, z, z2, z2);
                    boolean z3 = this.f16405f;
                    boolean z4 = gVar.f16405f;
                    this.f16405f = visitor.visitBoolean(z3, z3, z4, z4);
                    boolean z5 = this.f16406g;
                    boolean z6 = gVar.f16406g;
                    this.f16406g = visitor.visitBoolean(z5, z5, z6, z6);
                    boolean z7 = this.f16407h;
                    boolean z8 = gVar.f16407h;
                    this.f16407h = visitor.visitBoolean(z7, z7, z8, z8);
                    boolean z9 = this.f16408i;
                    boolean z10 = gVar.f16408i;
                    this.f16408i = visitor.visitBoolean(z9, z9, z10, z10);
                    boolean z11 = this.f16409j;
                    boolean z12 = gVar.f16409j;
                    this.f16409j = visitor.visitBoolean(z11, z11, z12, z12);
                    boolean z13 = this.f16410k;
                    boolean z14 = gVar.f16410k;
                    this.f16410k = visitor.visitBoolean(z13, z13, z14, z14);
                    boolean z15 = this.f16411l;
                    boolean z16 = gVar.f16411l;
                    this.f16411l = visitor.visitBoolean(z15, z15, z16, z16);
                    boolean z17 = this.f16412m;
                    boolean z18 = gVar.f16412m;
                    this.f16412m = visitor.visitBoolean(z17, z17, z18, z18);
                    boolean z19 = this.f16413n;
                    boolean z20 = gVar.f16413n;
                    this.f16413n = visitor.visitBoolean(z19, z19, z20, z20);
                    boolean z21 = this.f16414o;
                    boolean z22 = gVar.f16414o;
                    this.f16414o = visitor.visitBoolean(z21, z21, z22, z22);
                    boolean z23 = this.f16415p;
                    boolean z24 = gVar.f16415p;
                    this.f16415p = visitor.visitBoolean(z23, z23, z24, z24);
                    boolean z25 = this.f16416q;
                    boolean z26 = gVar.f16416q;
                    this.f16416q = visitor.visitBoolean(z25, z25, z26, z26);
                    boolean z27 = this.f16417r;
                    boolean z28 = gVar.f16417r;
                    this.f16417r = visitor.visitBoolean(z27, z27, z28, z28);
                    boolean z29 = this.f16418s;
                    boolean z30 = gVar.f16418s;
                    this.f16418s = visitor.visitBoolean(z29, z29, z30, z30);
                    boolean z31 = this.f16419t;
                    boolean z32 = gVar.f16419t;
                    this.f16419t = visitor.visitBoolean(z31, z31, z32, z32);
                    boolean z33 = this.f16420u;
                    boolean z34 = gVar.f16420u;
                    this.f16420u = visitor.visitBoolean(z33, z33, z34, z34);
                    boolean z35 = this.f16421v;
                    boolean z36 = gVar.f16421v;
                    this.f16421v = visitor.visitBoolean(z35, z35, z36, z36);
                    boolean z37 = this.f16422w;
                    boolean z38 = gVar.f16422w;
                    this.f16422w = visitor.visitBoolean(z37, z37, z38, z38);
                    boolean z39 = this.f16423x;
                    boolean z40 = gVar.f16423x;
                    this.f16423x = visitor.visitBoolean(z39, z39, z40, z40);
                    boolean z41 = this.f16424y;
                    boolean z42 = gVar.f16424y;
                    this.f16424y = visitor.visitBoolean(z41, z41, z42, z42);
                    boolean z43 = this.f16425z;
                    boolean z44 = gVar.f16425z;
                    this.f16425z = visitor.visitBoolean(z43, z43, z44, z44);
                    boolean z45 = this.f16399A;
                    boolean z46 = gVar.f16399A;
                    this.f16399A = visitor.visitBoolean(z45, z45, z46, z46);
                    boolean z47 = this.f16400B;
                    boolean z48 = gVar.f16400B;
                    this.f16400B = visitor.visitBoolean(z47, z47, z48, z48);
                    boolean z49 = this.f16401C;
                    boolean z50 = gVar.f16401C;
                    this.f16401C = visitor.visitBoolean(z49, z49, z50, z50);
                    boolean z51 = this.f16402D;
                    boolean z52 = gVar.f16402D;
                    this.f16402D = visitor.visitBoolean(z51, z51, z52, z52);
                    boolean z53 = this.f16403E;
                    boolean z54 = gVar.f16403E;
                    this.f16403E = visitor.visitBoolean(z53, z53, z54, z54);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    boolean z55 = false;
                    while (!z55) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    z55 = true;
                                    break;
                                case 8:
                                    this.f16404e = codedInputStream.readBool();
                                    break;
                                case 16:
                                    this.f16405f = codedInputStream.readBool();
                                    break;
                                case 24:
                                    this.f16406g = codedInputStream.readBool();
                                    break;
                                case 32:
                                    this.f16407h = codedInputStream.readBool();
                                    break;
                                case 40:
                                    this.f16408i = codedInputStream.readBool();
                                    break;
                                case 48:
                                    this.f16409j = codedInputStream.readBool();
                                    break;
                                case 56:
                                    this.f16410k = codedInputStream.readBool();
                                    break;
                                case 64:
                                    this.f16411l = codedInputStream.readBool();
                                    break;
                                case 72:
                                    this.f16412m = codedInputStream.readBool();
                                    break;
                                case 80:
                                    this.f16413n = codedInputStream.readBool();
                                    break;
                                case 88:
                                    this.f16414o = codedInputStream.readBool();
                                    break;
                                case 96:
                                    this.f16415p = codedInputStream.readBool();
                                    break;
                                case 104:
                                    this.f16416q = codedInputStream.readBool();
                                    break;
                                case 112:
                                    this.f16417r = codedInputStream.readBool();
                                    break;
                                case 120:
                                    this.f16418s = codedInputStream.readBool();
                                    break;
                                case 128:
                                    this.f16419t = codedInputStream.readBool();
                                    break;
                                case 136:
                                    this.f16420u = codedInputStream.readBool();
                                    break;
                                case 144:
                                    this.f16421v = codedInputStream.readBool();
                                    break;
                                case 152:
                                    this.f16422w = codedInputStream.readBool();
                                    break;
                                case 160:
                                    this.f16423x = codedInputStream.readBool();
                                    break;
                                case 168:
                                    this.f16424y = codedInputStream.readBool();
                                    break;
                                case 176:
                                    this.f16425z = codedInputStream.readBool();
                                    break;
                                case 184:
                                    this.f16399A = codedInputStream.readBool();
                                    break;
                                case 192:
                                    this.f16400B = codedInputStream.readBool();
                                    break;
                                case 200:
                                    this.f16401C = codedInputStream.readBool();
                                    break;
                                case 208:
                                    this.f16402D = codedInputStream.readBool();
                                    break;
                                case 216:
                                    this.f16403E = codedInputStream.readBool();
                                    break;
                                default:
                                    if (codedInputStream.skipField(readTag)) {
                                        break;
                                    }
                                    z55 = true;
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
                    if (f16398G == null) {
                        synchronized (C6781g.class) {
                            if (f16398G == null) {
                                f16398G = new DefaultInstanceBasedParser(f16397F);
                            }
                        }
                    }
                    return f16398G;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16397F;
        }

        public boolean getBroadcastedInvitationsEnabled() {
            return this.f16399A;
        }

        public boolean getBrumpEnabled() {
            return this.f16412m;
        }

        public boolean getBrumpHintEnabled() {
            return this.f16420u;
        }

        public boolean getChatPicSharingEnabled() {
            return this.f16415p;
        }

        public boolean getChatUIV2Enabled() {
            return this.f16414o;
        }

        public boolean getContextualLabeling() {
            return this.f16410k;
        }

        public boolean getDiscoverEnabled() {
            return this.f16404e;
        }

        public boolean getDisplayReferrerFromLinkEnabled() {
            return this.f16401C;
        }

        public boolean getFootstepsEnabled() {
            return this.f16411l;
        }

        public boolean getFootstepsV2Enabled() {
            return this.f16422w;
        }

        public boolean getGatheringEnabled() {
            return this.f16407h;
        }

        public boolean getGroupChatEnabled() {
            return this.f16406g;
        }

        public boolean getHeadingEnabled() {
            return this.f16403E;
        }

        public boolean getInstagramCardsSharingEnabled() {
            return this.f16416q;
        }

        public boolean getLandsharkEnabled() {
            return this.f16400B;
        }

        public boolean getLockedWatchersEnabled() {
            return this.f16409j;
        }

        public boolean getOptOutSuggestEnabled() {
            return this.f16423x;
        }

        public boolean getRecentEmojiPerTargetEnabled() {
            return this.f16424y;
        }

        public boolean getRecommendationChainsEnabled() {
            return this.f16425z;
        }

        public boolean getRequestMediaEnabled() {
            return this.f16419t;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            boolean z = this.f16404e;
            if (z) {
                i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
            }
            boolean z2 = this.f16405f;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(2, z2);
            }
            boolean z3 = this.f16406g;
            if (z3) {
                i2 += CodedOutputStream.computeBoolSize(3, z3);
            }
            boolean z4 = this.f16407h;
            if (z4) {
                i2 += CodedOutputStream.computeBoolSize(4, z4);
            }
            boolean z5 = this.f16408i;
            if (z5) {
                i2 += CodedOutputStream.computeBoolSize(5, z5);
            }
            boolean z6 = this.f16409j;
            if (z6) {
                i2 += CodedOutputStream.computeBoolSize(6, z6);
            }
            boolean z7 = this.f16410k;
            if (z7) {
                i2 += CodedOutputStream.computeBoolSize(7, z7);
            }
            boolean z8 = this.f16411l;
            if (z8) {
                i2 += CodedOutputStream.computeBoolSize(8, z8);
            }
            boolean z9 = this.f16412m;
            if (z9) {
                i2 += CodedOutputStream.computeBoolSize(9, z9);
            }
            boolean z10 = this.f16413n;
            if (z10) {
                i2 += CodedOutputStream.computeBoolSize(10, z10);
            }
            boolean z11 = this.f16414o;
            if (z11) {
                i2 += CodedOutputStream.computeBoolSize(11, z11);
            }
            boolean z12 = this.f16415p;
            if (z12) {
                i2 += CodedOutputStream.computeBoolSize(12, z12);
            }
            boolean z13 = this.f16416q;
            if (z13) {
                i2 += CodedOutputStream.computeBoolSize(13, z13);
            }
            boolean z14 = this.f16417r;
            if (z14) {
                i2 += CodedOutputStream.computeBoolSize(14, z14);
            }
            boolean z15 = this.f16418s;
            if (z15) {
                i2 += CodedOutputStream.computeBoolSize(15, z15);
            }
            boolean z16 = this.f16419t;
            if (z16) {
                i2 += CodedOutputStream.computeBoolSize(16, z16);
            }
            boolean z17 = this.f16420u;
            if (z17) {
                i2 += CodedOutputStream.computeBoolSize(17, z17);
            }
            boolean z18 = this.f16421v;
            if (z18) {
                i2 += CodedOutputStream.computeBoolSize(18, z18);
            }
            boolean z19 = this.f16422w;
            if (z19) {
                i2 += CodedOutputStream.computeBoolSize(19, z19);
            }
            boolean z20 = this.f16423x;
            if (z20) {
                i2 += CodedOutputStream.computeBoolSize(20, z20);
            }
            boolean z21 = this.f16424y;
            if (z21) {
                i2 += CodedOutputStream.computeBoolSize(21, z21);
            }
            boolean z22 = this.f16425z;
            if (z22) {
                i2 += CodedOutputStream.computeBoolSize(22, z22);
            }
            boolean z23 = this.f16399A;
            if (z23) {
                i2 += CodedOutputStream.computeBoolSize(23, z23);
            }
            boolean z24 = this.f16400B;
            if (z24) {
                i2 += CodedOutputStream.computeBoolSize(24, z24);
            }
            boolean z25 = this.f16401C;
            if (z25) {
                i2 += CodedOutputStream.computeBoolSize(25, z25);
            }
            boolean z26 = this.f16402D;
            if (z26) {
                i2 += CodedOutputStream.computeBoolSize(26, z26);
            }
            boolean z27 = this.f16403E;
            if (z27) {
                i2 += CodedOutputStream.computeBoolSize(27, z27);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean getSkipSMSForInvitationsEnabled() {
            return this.f16421v;
        }

        public boolean getSleepEnabled() {
            return this.f16402D;
        }

        public boolean getSnapchatSharingEnabled() {
            return this.f16418s;
        }

        public boolean getTSTEnabled() {
            return this.f16405f;
        }

        public boolean getTotsEnabled() {
            return this.f16408i;
        }

        public boolean getUsernameEnabled() {
            return this.f16417r;
        }

        public boolean getZendeskEnabled() {
            return this.f16413n;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.f16404e;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            boolean z2 = this.f16405f;
            if (z2) {
                codedOutputStream.writeBool(2, z2);
            }
            boolean z3 = this.f16406g;
            if (z3) {
                codedOutputStream.writeBool(3, z3);
            }
            boolean z4 = this.f16407h;
            if (z4) {
                codedOutputStream.writeBool(4, z4);
            }
            boolean z5 = this.f16408i;
            if (z5) {
                codedOutputStream.writeBool(5, z5);
            }
            boolean z6 = this.f16409j;
            if (z6) {
                codedOutputStream.writeBool(6, z6);
            }
            boolean z7 = this.f16410k;
            if (z7) {
                codedOutputStream.writeBool(7, z7);
            }
            boolean z8 = this.f16411l;
            if (z8) {
                codedOutputStream.writeBool(8, z8);
            }
            boolean z9 = this.f16412m;
            if (z9) {
                codedOutputStream.writeBool(9, z9);
            }
            boolean z10 = this.f16413n;
            if (z10) {
                codedOutputStream.writeBool(10, z10);
            }
            boolean z11 = this.f16414o;
            if (z11) {
                codedOutputStream.writeBool(11, z11);
            }
            boolean z12 = this.f16415p;
            if (z12) {
                codedOutputStream.writeBool(12, z12);
            }
            boolean z13 = this.f16416q;
            if (z13) {
                codedOutputStream.writeBool(13, z13);
            }
            boolean z14 = this.f16417r;
            if (z14) {
                codedOutputStream.writeBool(14, z14);
            }
            boolean z15 = this.f16418s;
            if (z15) {
                codedOutputStream.writeBool(15, z15);
            }
            boolean z16 = this.f16419t;
            if (z16) {
                codedOutputStream.writeBool(16, z16);
            }
            boolean z17 = this.f16420u;
            if (z17) {
                codedOutputStream.writeBool(17, z17);
            }
            boolean z18 = this.f16421v;
            if (z18) {
                codedOutputStream.writeBool(18, z18);
            }
            boolean z19 = this.f16422w;
            if (z19) {
                codedOutputStream.writeBool(19, z19);
            }
            boolean z20 = this.f16423x;
            if (z20) {
                codedOutputStream.writeBool(20, z20);
            }
            boolean z21 = this.f16424y;
            if (z21) {
                codedOutputStream.writeBool(21, z21);
            }
            boolean z22 = this.f16425z;
            if (z22) {
                codedOutputStream.writeBool(22, z22);
            }
            boolean z23 = this.f16399A;
            if (z23) {
                codedOutputStream.writeBool(23, z23);
            }
            boolean z24 = this.f16400B;
            if (z24) {
                codedOutputStream.writeBool(24, z24);
            }
            boolean z25 = this.f16401C;
            if (z25) {
                codedOutputStream.writeBool(25, z25);
            }
            boolean z26 = this.f16402D;
            if (z26) {
                codedOutputStream.writeBool(26, z26);
            }
            boolean z27 = this.f16403E;
            if (z27) {
                codedOutputStream.writeBool(27, z27);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$h */
    public static final class C6783h extends GeneratedMessageLite<C6783h, C6784a> implements FootstepsOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6783h f16426f = new C6783h();

        /* renamed from: g */
        private static volatile Parser<C6783h> f16427g;

        /* renamed from: e */
        private Duration f16428e;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$h$a */
        public static final class C6784a extends Builder<C6783h, C6784a> implements FootstepsOrBuilder {
            /* synthetic */ C6784a(C7317g gVar) {
                this();
            }

            public Duration getViewsTickerInterval() {
                return ((C6783h) this.instance).getViewsTickerInterval();
            }

            public boolean hasViewsTickerInterval() {
                return ((C6783h) this.instance).hasViewsTickerInterval();
            }

            private C6784a() {
                super(C6783h.f16426f);
            }
        }

        static {
            f16426f.makeImmutable();
        }

        private C6783h() {
        }

        public static C6783h getDefaultInstance() {
            return f16426f;
        }

        public static Parser<C6783h> parser() {
            return f16426f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6783h();
                case 2:
                    return f16426f;
                case 3:
                    return null;
                case 4:
                    return new C6784a(null);
                case 5:
                    this.f16428e = (Duration) ((Visitor) obj).visitMessage(this.f16428e, ((C6783h) obj2).f16428e);
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
                                    Builder builder = this.f16428e != null ? (Duration.Builder) this.f16428e.toBuilder() : null;
                                    this.f16428e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16428e);
                                        this.f16428e = (Duration) builder.buildPartial();
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
                    if (f16427g == null) {
                        synchronized (C6783h.class) {
                            if (f16427g == null) {
                                f16427g = new DefaultInstanceBasedParser(f16426f);
                            }
                        }
                    }
                    return f16427g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16426f;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16428e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getViewsTickerInterval());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Duration getViewsTickerInterval() {
            Duration duration = this.f16428e;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public boolean hasViewsTickerInterval() {
            return this.f16428e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16428e != null) {
                codedOutputStream.writeMessage(1, getViewsTickerInterval());
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$i */
    public static final class C6785i extends GeneratedMessageLite<C6785i, C6786a> implements GlobalOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final C6785i f16429l = new C6785i();

        /* renamed from: m */
        private static volatile Parser<C6785i> f16430m;

        /* renamed from: e */
        private Duration f16431e;

        /* renamed from: f */
        private Duration f16432f;

        /* renamed from: g */
        private long f16433g;

        /* renamed from: h */
        private long f16434h;

        /* renamed from: i */
        private Duration f16435i;

        /* renamed from: j */
        private double f16436j;

        /* renamed from: k */
        private String f16437k = "";

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$i$a */
        public static final class C6786a extends Builder<C6785i, C6786a> implements GlobalOrBuilder {
            /* synthetic */ C6786a(C7317g gVar) {
                this();
            }

            public Duration getAliveThreshold() {
                return ((C6785i) this.instance).getAliveThreshold();
            }

            public String getContactHashKey() {
                return ((C6785i) this.instance).getContactHashKey();
            }

            public ByteString getContactHashKeyBytes() {
                return ((C6785i) this.instance).getContactHashKeyBytes();
            }

            public long getContactsBuffer() {
                return ((C6785i) this.instance).getContactsBuffer();
            }

            public Duration getContactsUploadTimeout() {
                return ((C6785i) this.instance).getContactsUploadTimeout();
            }

            public double getDefaultTopFriend() {
                return ((C6785i) this.instance).getDefaultTopFriend();
            }

            public Duration getLiveThreshold() {
                return ((C6785i) this.instance).getLiveThreshold();
            }

            public long getMaxSearchResults() {
                return ((C6785i) this.instance).getMaxSearchResults();
            }

            public boolean hasAliveThreshold() {
                return ((C6785i) this.instance).hasAliveThreshold();
            }

            public boolean hasContactsUploadTimeout() {
                return ((C6785i) this.instance).hasContactsUploadTimeout();
            }

            public boolean hasLiveThreshold() {
                return ((C6785i) this.instance).hasLiveThreshold();
            }

            private C6786a() {
                super(C6785i.f16429l);
            }
        }

        static {
            f16429l.makeImmutable();
        }

        private C6785i() {
        }

        public static C6785i getDefaultInstance() {
            return f16429l;
        }

        public static Parser<C6785i> parser() {
            return f16429l.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6785i();
                case 2:
                    return f16429l;
                case 3:
                    return null;
                case 4:
                    return new C6786a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6785i iVar = (C6785i) obj2;
                    this.f16431e = (Duration) visitor.visitMessage(this.f16431e, iVar.f16431e);
                    this.f16432f = (Duration) visitor.visitMessage(this.f16432f, iVar.f16432f);
                    this.f16433g = visitor.visitLong(this.f16433g != 0, this.f16433g, iVar.f16433g != 0, iVar.f16433g);
                    this.f16434h = visitor.visitLong(this.f16434h != 0, this.f16434h, iVar.f16434h != 0, iVar.f16434h);
                    this.f16435i = (Duration) visitor.visitMessage(this.f16435i, iVar.f16435i);
                    boolean z2 = this.f16436j != 0.0d;
                    double d = this.f16436j;
                    if (iVar.f16436j != 0.0d) {
                        z = true;
                    }
                    this.f16436j = visitor.visitDouble(z2, d, z, iVar.f16436j);
                    this.f16437k = visitor.visitString(!this.f16437k.isEmpty(), this.f16437k, !iVar.f16437k.isEmpty(), iVar.f16437k);
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
                                    Builder builder = this.f16431e != null ? (Duration.Builder) this.f16431e.toBuilder() : null;
                                    this.f16431e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16431e);
                                        this.f16431e = (Duration) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f16432f != null ? (Duration.Builder) this.f16432f.toBuilder() : null;
                                    this.f16432f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f16432f);
                                        this.f16432f = (Duration) builder2.buildPartial();
                                    }
                                } else if (readTag == 24) {
                                    this.f16433g = codedInputStream.readInt64();
                                } else if (readTag == 32) {
                                    this.f16434h = codedInputStream.readInt64();
                                } else if (readTag == 42) {
                                    Builder builder3 = this.f16435i != null ? (Duration.Builder) this.f16435i.toBuilder() : null;
                                    this.f16435i = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f16435i);
                                        this.f16435i = (Duration) builder3.buildPartial();
                                    }
                                } else if (readTag == 49) {
                                    this.f16436j = codedInputStream.readDouble();
                                } else if (readTag == 58) {
                                    this.f16437k = codedInputStream.readStringRequireUtf8();
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
                    if (f16430m == null) {
                        synchronized (C6785i.class) {
                            if (f16430m == null) {
                                f16430m = new DefaultInstanceBasedParser(f16429l);
                            }
                        }
                    }
                    return f16430m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16429l;
        }

        public Duration getAliveThreshold() {
            Duration duration = this.f16431e;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public String getContactHashKey() {
            return this.f16437k;
        }

        public ByteString getContactHashKeyBytes() {
            return ByteString.copyFromUtf8(this.f16437k);
        }

        public long getContactsBuffer() {
            return this.f16433g;
        }

        public Duration getContactsUploadTimeout() {
            Duration duration = this.f16435i;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public double getDefaultTopFriend() {
            return this.f16436j;
        }

        public Duration getLiveThreshold() {
            Duration duration = this.f16432f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public long getMaxSearchResults() {
            return this.f16434h;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16431e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getAliveThreshold());
            }
            if (this.f16432f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getLiveThreshold());
            }
            long j = this.f16433g;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(3, j);
            }
            long j2 = this.f16434h;
            if (j2 != 0) {
                i2 += CodedOutputStream.computeInt64Size(4, j2);
            }
            if (this.f16435i != null) {
                i2 += CodedOutputStream.computeMessageSize(5, getContactsUploadTimeout());
            }
            double d = this.f16436j;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(6, d);
            }
            if (!this.f16437k.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(7, getContactHashKey());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasAliveThreshold() {
            return this.f16431e != null;
        }

        public boolean hasContactsUploadTimeout() {
            return this.f16435i != null;
        }

        public boolean hasLiveThreshold() {
            return this.f16432f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16431e != null) {
                codedOutputStream.writeMessage(1, getAliveThreshold());
            }
            if (this.f16432f != null) {
                codedOutputStream.writeMessage(2, getLiveThreshold());
            }
            long j = this.f16433g;
            if (j != 0) {
                codedOutputStream.writeInt64(3, j);
            }
            long j2 = this.f16434h;
            if (j2 != 0) {
                codedOutputStream.writeInt64(4, j2);
            }
            if (this.f16435i != null) {
                codedOutputStream.writeMessage(5, getContactsUploadTimeout());
            }
            double d = this.f16436j;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(6, d);
            }
            if (!this.f16437k.isEmpty()) {
                codedOutputStream.writeString(7, getContactHashKey());
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$j */
    public static final class C6787j extends GeneratedMessageLite<C6787j, C6788a> implements LocationOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6787j f16438h = new C6787j();

        /* renamed from: i */
        private static volatile Parser<C6787j> f16439i;

        /* renamed from: e */
        private int f16440e;

        /* renamed from: f */
        private boolean f16441f;

        /* renamed from: g */
        private boolean f16442g;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$j$a */
        public static final class C6788a extends Builder<C6787j, C6788a> implements LocationOrBuilder {
            /* synthetic */ C6788a(C7317g gVar) {
                this();
            }

            public boolean getApwlsEnableAndroid() {
                return ((C6787j) this.instance).getApwlsEnableAndroid();
            }

            public boolean getApwlsEnableIos() {
                return ((C6787j) this.instance).getApwlsEnableIos();
            }

            public int getCorelocationProviderMaxGpsPrecisionInMeter() {
                return ((C6787j) this.instance).getCorelocationProviderMaxGpsPrecisionInMeter();
            }

            private C6788a() {
                super(C6787j.f16438h);
            }
        }

        static {
            f16438h.makeImmutable();
        }

        private C6787j() {
        }

        public static C6787j getDefaultInstance() {
            return f16438h;
        }

        public static Parser<C6787j> parser() {
            return f16438h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6787j();
                case 2:
                    return f16438h;
                case 3:
                    return null;
                case 4:
                    return new C6788a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6787j jVar = (C6787j) obj2;
                    boolean z2 = this.f16440e != 0;
                    int i = this.f16440e;
                    if (jVar.f16440e != 0) {
                        z = true;
                    }
                    this.f16440e = visitor.visitInt(z2, i, z, jVar.f16440e);
                    boolean z3 = this.f16441f;
                    boolean z4 = jVar.f16441f;
                    this.f16441f = visitor.visitBoolean(z3, z3, z4, z4);
                    boolean z5 = this.f16442g;
                    boolean z6 = jVar.f16442g;
                    this.f16442g = visitor.visitBoolean(z5, z5, z6, z6);
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
                                    this.f16440e = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.f16441f = codedInputStream.readBool();
                                } else if (readTag == 24) {
                                    this.f16442g = codedInputStream.readBool();
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
                    if (f16439i == null) {
                        synchronized (C6787j.class) {
                            if (f16439i == null) {
                                f16439i = new DefaultInstanceBasedParser(f16438h);
                            }
                        }
                    }
                    return f16439i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16438h;
        }

        public boolean getApwlsEnableAndroid() {
            return this.f16441f;
        }

        public boolean getApwlsEnableIos() {
            return this.f16442g;
        }

        public int getCorelocationProviderMaxGpsPrecisionInMeter() {
            return this.f16440e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16440e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            boolean z = this.f16441f;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(2, z);
            }
            boolean z2 = this.f16442g;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(3, z2);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16440e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            boolean z = this.f16441f;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            boolean z2 = this.f16442g;
            if (z2) {
                codedOutputStream.writeBool(3, z2);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$k */
    public static final class C6789k extends GeneratedMessageLite<C6789k, C6790a> implements MapOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: p */
        public static final C6789k f16443p = new C6789k();

        /* renamed from: q */
        private static volatile Parser<C6789k> f16444q;

        /* renamed from: e */
        private Duration f16445e;

        /* renamed from: f */
        private Duration f16446f;

        /* renamed from: g */
        private Duration f16447g;

        /* renamed from: h */
        private double f16448h;

        /* renamed from: i */
        private double f16449i;

        /* renamed from: j */
        private double f16450j;

        /* renamed from: k */
        private double f16451k;

        /* renamed from: l */
        private double f16452l;

        /* renamed from: m */
        private double f16453m;

        /* renamed from: n */
        private double f16454n;

        /* renamed from: o */
        private Duration f16455o;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$k$a */
        public static final class C6790a extends Builder<C6789k, C6790a> implements MapOrBuilder {
            /* synthetic */ C6790a(C7317g gVar) {
                this();
            }

            public double getDistanceThreshold() {
                return ((C6789k) this.instance).getDistanceThreshold();
            }

            public Duration getGeoRouteEtaRefresh() {
                return ((C6789k) this.instance).getGeoRouteEtaRefresh();
            }

            public double getRadiusBound() {
                return ((C6789k) this.instance).getRadiusBound();
            }

            public Duration getSpinnerOldTimeout() {
                return ((C6789k) this.instance).getSpinnerOldTimeout();
            }

            public Duration getSpinnerTimeout() {
                return ((C6789k) this.instance).getSpinnerTimeout();
            }

            public double getSquareDiameter() {
                return ((C6789k) this.instance).getSquareDiameter();
            }

            public Duration getTooOldThreshold() {
                return ((C6789k) this.instance).getTooOldThreshold();
            }

            public double getViewportClosenessPower() {
                return ((C6789k) this.instance).getViewportClosenessPower();
            }

            public double getViewportMaxDistance() {
                return ((C6789k) this.instance).getViewportMaxDistance();
            }

            public double getViewportMinRadius() {
                return ((C6789k) this.instance).getViewportMinRadius();
            }

            public double getViewportZoomOutFactor() {
                return ((C6789k) this.instance).getViewportZoomOutFactor();
            }

            public boolean hasGeoRouteEtaRefresh() {
                return ((C6789k) this.instance).hasGeoRouteEtaRefresh();
            }

            public boolean hasSpinnerOldTimeout() {
                return ((C6789k) this.instance).hasSpinnerOldTimeout();
            }

            public boolean hasSpinnerTimeout() {
                return ((C6789k) this.instance).hasSpinnerTimeout();
            }

            public boolean hasTooOldThreshold() {
                return ((C6789k) this.instance).hasTooOldThreshold();
            }

            private C6790a() {
                super(C6789k.f16443p);
            }
        }

        static {
            f16443p.makeImmutable();
        }

        private C6789k() {
        }

        public static C6789k getDefaultInstance() {
            return f16443p;
        }

        public static Parser<C6789k> parser() {
            return f16443p.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6789k();
                case 2:
                    return f16443p;
                case 3:
                    return null;
                case 4:
                    return new C6790a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6789k kVar = (C6789k) obj2;
                    this.f16445e = (Duration) visitor.visitMessage(this.f16445e, kVar.f16445e);
                    this.f16446f = (Duration) visitor.visitMessage(this.f16446f, kVar.f16446f);
                    this.f16447g = (Duration) visitor.visitMessage(this.f16447g, kVar.f16447g);
                    this.f16448h = visitor.visitDouble(this.f16448h != 0.0d, this.f16448h, kVar.f16448h != 0.0d, kVar.f16448h);
                    this.f16449i = visitor.visitDouble(this.f16449i != 0.0d, this.f16449i, kVar.f16449i != 0.0d, kVar.f16449i);
                    this.f16450j = visitor.visitDouble(this.f16450j != 0.0d, this.f16450j, kVar.f16450j != 0.0d, kVar.f16450j);
                    this.f16451k = visitor.visitDouble(this.f16451k != 0.0d, this.f16451k, kVar.f16451k != 0.0d, kVar.f16451k);
                    this.f16452l = visitor.visitDouble(this.f16452l != 0.0d, this.f16452l, kVar.f16452l != 0.0d, kVar.f16452l);
                    this.f16453m = visitor.visitDouble(this.f16453m != 0.0d, this.f16453m, kVar.f16453m != 0.0d, kVar.f16453m);
                    this.f16454n = visitor.visitDouble(this.f16454n != 0.0d, this.f16454n, kVar.f16454n != 0.0d, kVar.f16454n);
                    this.f16455o = (Duration) visitor.visitMessage(this.f16455o, kVar.f16455o);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
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
                                    Builder builder = this.f16445e != null ? (Duration.Builder) this.f16445e.toBuilder() : null;
                                    this.f16445e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder == null) {
                                        break;
                                    } else {
                                        builder.mergeFrom(this.f16445e);
                                        this.f16445e = (Duration) builder.buildPartial();
                                        break;
                                    }
                                case 18:
                                    Builder builder2 = this.f16447g != null ? (Duration.Builder) this.f16447g.toBuilder() : null;
                                    this.f16447g = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder2 == null) {
                                        break;
                                    } else {
                                        builder2.mergeFrom(this.f16447g);
                                        this.f16447g = (Duration) builder2.buildPartial();
                                        break;
                                    }
                                case 25:
                                    this.f16448h = codedInputStream.readDouble();
                                    break;
                                case 33:
                                    this.f16452l = codedInputStream.readDouble();
                                    break;
                                case 41:
                                    this.f16453m = codedInputStream.readDouble();
                                    break;
                                case 50:
                                    Builder builder3 = this.f16446f != null ? (Duration.Builder) this.f16446f.toBuilder() : null;
                                    this.f16446f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder3 == null) {
                                        break;
                                    } else {
                                        builder3.mergeFrom(this.f16446f);
                                        this.f16446f = (Duration) builder3.buildPartial();
                                        break;
                                    }
                                case 57:
                                    this.f16454n = codedInputStream.readDouble();
                                    break;
                                case 65:
                                    this.f16449i = codedInputStream.readDouble();
                                    break;
                                case 73:
                                    this.f16450j = codedInputStream.readDouble();
                                    break;
                                case 81:
                                    this.f16451k = codedInputStream.readDouble();
                                    break;
                                case 90:
                                    Builder builder4 = this.f16455o != null ? (Duration.Builder) this.f16455o.toBuilder() : null;
                                    this.f16455o = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder4 == null) {
                                        break;
                                    } else {
                                        builder4.mergeFrom(this.f16455o);
                                        this.f16455o = (Duration) builder4.buildPartial();
                                        break;
                                    }
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
                    if (f16444q == null) {
                        synchronized (C6789k.class) {
                            if (f16444q == null) {
                                f16444q = new DefaultInstanceBasedParser(f16443p);
                            }
                        }
                    }
                    return f16444q;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16443p;
        }

        public double getDistanceThreshold() {
            return this.f16453m;
        }

        public Duration getGeoRouteEtaRefresh() {
            Duration duration = this.f16455o;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public double getRadiusBound() {
            return this.f16452l;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16445e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getSpinnerTimeout());
            }
            if (this.f16447g != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getTooOldThreshold());
            }
            double d = this.f16448h;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(3, d);
            }
            double d2 = this.f16452l;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(4, d2);
            }
            double d3 = this.f16453m;
            if (d3 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(5, d3);
            }
            if (this.f16446f != null) {
                i2 += CodedOutputStream.computeMessageSize(6, getSpinnerOldTimeout());
            }
            double d4 = this.f16454n;
            if (d4 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(7, d4);
            }
            double d5 = this.f16449i;
            if (d5 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(8, d5);
            }
            double d6 = this.f16450j;
            if (d6 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(9, d6);
            }
            double d7 = this.f16451k;
            if (d7 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(10, d7);
            }
            if (this.f16455o != null) {
                i2 += CodedOutputStream.computeMessageSize(11, getGeoRouteEtaRefresh());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Duration getSpinnerOldTimeout() {
            Duration duration = this.f16446f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getSpinnerTimeout() {
            Duration duration = this.f16445e;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public double getSquareDiameter() {
            return this.f16454n;
        }

        public Duration getTooOldThreshold() {
            Duration duration = this.f16447g;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public double getViewportClosenessPower() {
            return this.f16449i;
        }

        public double getViewportMaxDistance() {
            return this.f16450j;
        }

        public double getViewportMinRadius() {
            return this.f16451k;
        }

        public double getViewportZoomOutFactor() {
            return this.f16448h;
        }

        public boolean hasGeoRouteEtaRefresh() {
            return this.f16455o != null;
        }

        public boolean hasSpinnerOldTimeout() {
            return this.f16446f != null;
        }

        public boolean hasSpinnerTimeout() {
            return this.f16445e != null;
        }

        public boolean hasTooOldThreshold() {
            return this.f16447g != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16445e != null) {
                codedOutputStream.writeMessage(1, getSpinnerTimeout());
            }
            if (this.f16447g != null) {
                codedOutputStream.writeMessage(2, getTooOldThreshold());
            }
            double d = this.f16448h;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(3, d);
            }
            double d2 = this.f16452l;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(4, d2);
            }
            double d3 = this.f16453m;
            if (d3 != 0.0d) {
                codedOutputStream.writeDouble(5, d3);
            }
            if (this.f16446f != null) {
                codedOutputStream.writeMessage(6, getSpinnerOldTimeout());
            }
            double d4 = this.f16454n;
            if (d4 != 0.0d) {
                codedOutputStream.writeDouble(7, d4);
            }
            double d5 = this.f16449i;
            if (d5 != 0.0d) {
                codedOutputStream.writeDouble(8, d5);
            }
            double d6 = this.f16450j;
            if (d6 != 0.0d) {
                codedOutputStream.writeDouble(9, d6);
            }
            double d7 = this.f16451k;
            if (d7 != 0.0d) {
                codedOutputStream.writeDouble(10, d7);
            }
            if (this.f16455o != null) {
                codedOutputStream.writeMessage(11, getGeoRouteEtaRefresh());
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$l */
    public static final class C6791l extends GeneratedMessageLite<C6791l, C6792a> implements NetworkOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: t */
        public static final C6791l f16456t = new C6791l();

        /* renamed from: u */
        private static volatile Parser<C6791l> f16457u;

        /* renamed from: e */
        private Duration f16458e;

        /* renamed from: f */
        private Duration f16459f;

        /* renamed from: g */
        private Duration f16460g;

        /* renamed from: h */
        private Duration f16461h;

        /* renamed from: i */
        private Duration f16462i;

        /* renamed from: j */
        private double f16463j;

        /* renamed from: k */
        private long f16464k;

        /* renamed from: l */
        private Duration f16465l;

        /* renamed from: m */
        private Duration f16466m;

        /* renamed from: n */
        private Duration f16467n;

        /* renamed from: o */
        private String f16468o = "";

        /* renamed from: p */
        private Duration f16469p;

        /* renamed from: q */
        private Duration f16470q;

        /* renamed from: r */
        private Duration f16471r;

        /* renamed from: s */
        private Duration f16472s;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$l$a */
        public static final class C6792a extends Builder<C6791l, C6792a> implements NetworkOrBuilder {
            /* synthetic */ C6792a(C7317g gVar) {
                this();
            }

            public double getBackOffFactor() {
                return ((C6791l) this.instance).getBackOffFactor();
            }

            public Duration getBackOffMaxTimeout() {
                return ((C6791l) this.instance).getBackOffMaxTimeout();
            }

            public Duration getBackOffMinTimeout() {
                return ((C6791l) this.instance).getBackOffMinTimeout();
            }

            public Duration getGrpcDefaultKeepAlivePing() {
                return ((C6791l) this.instance).getGrpcDefaultKeepAlivePing();
            }

            public Duration getGrpcDefaultKeepAliveTimeout() {
                return ((C6791l) this.instance).getGrpcDefaultKeepAliveTimeout();
            }

            public Duration getGrpcPipelineKeepAlivePing() {
                return ((C6791l) this.instance).getGrpcPipelineKeepAlivePing();
            }

            public Duration getGrpcPipelineKeepAliveTimeout() {
                return ((C6791l) this.instance).getGrpcPipelineKeepAliveTimeout();
            }

            public long getStreamsBufferSize() {
                return ((C6791l) this.instance).getStreamsBufferSize();
            }

            public Duration getTransportKeepAlive() {
                return ((C6791l) this.instance).getTransportKeepAlive();
            }

            public Duration getTransportTimeout() {
                return ((C6791l) this.instance).getTransportTimeout();
            }

            public Duration getUnaryTimeout() {
                return ((C6791l) this.instance).getUnaryTimeout();
            }

            public Duration getValveCacheTtl() {
                return ((C6791l) this.instance).getValveCacheTtl();
            }

            public Duration getValveCallTimeout() {
                return ((C6791l) this.instance).getValveCallTimeout();
            }

            public Duration getValveDialTimeout() {
                return ((C6791l) this.instance).getValveDialTimeout();
            }

            public String getValveUrl() {
                return ((C6791l) this.instance).getValveUrl();
            }

            public ByteString getValveUrlBytes() {
                return ((C6791l) this.instance).getValveUrlBytes();
            }

            public boolean hasBackOffMaxTimeout() {
                return ((C6791l) this.instance).hasBackOffMaxTimeout();
            }

            public boolean hasBackOffMinTimeout() {
                return ((C6791l) this.instance).hasBackOffMinTimeout();
            }

            public boolean hasGrpcDefaultKeepAlivePing() {
                return ((C6791l) this.instance).hasGrpcDefaultKeepAlivePing();
            }

            public boolean hasGrpcDefaultKeepAliveTimeout() {
                return ((C6791l) this.instance).hasGrpcDefaultKeepAliveTimeout();
            }

            public boolean hasGrpcPipelineKeepAlivePing() {
                return ((C6791l) this.instance).hasGrpcPipelineKeepAlivePing();
            }

            public boolean hasGrpcPipelineKeepAliveTimeout() {
                return ((C6791l) this.instance).hasGrpcPipelineKeepAliveTimeout();
            }

            public boolean hasTransportKeepAlive() {
                return ((C6791l) this.instance).hasTransportKeepAlive();
            }

            public boolean hasTransportTimeout() {
                return ((C6791l) this.instance).hasTransportTimeout();
            }

            public boolean hasUnaryTimeout() {
                return ((C6791l) this.instance).hasUnaryTimeout();
            }

            public boolean hasValveCacheTtl() {
                return ((C6791l) this.instance).hasValveCacheTtl();
            }

            public boolean hasValveCallTimeout() {
                return ((C6791l) this.instance).hasValveCallTimeout();
            }

            public boolean hasValveDialTimeout() {
                return ((C6791l) this.instance).hasValveDialTimeout();
            }

            private C6792a() {
                super(C6791l.f16456t);
            }
        }

        static {
            f16456t.makeImmutable();
        }

        private C6791l() {
        }

        public static C6791l getDefaultInstance() {
            return f16456t;
        }

        public static Parser<C6791l> parser() {
            return f16456t.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6791l();
                case 2:
                    return f16456t;
                case 3:
                    return null;
                case 4:
                    return new C6792a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6791l lVar = (C6791l) obj2;
                    this.f16458e = (Duration) visitor.visitMessage(this.f16458e, lVar.f16458e);
                    this.f16459f = (Duration) visitor.visitMessage(this.f16459f, lVar.f16459f);
                    this.f16460g = (Duration) visitor.visitMessage(this.f16460g, lVar.f16460g);
                    this.f16461h = (Duration) visitor.visitMessage(this.f16461h, lVar.f16461h);
                    this.f16462i = (Duration) visitor.visitMessage(this.f16462i, lVar.f16462i);
                    this.f16463j = visitor.visitDouble(this.f16463j != 0.0d, this.f16463j, lVar.f16463j != 0.0d, lVar.f16463j);
                    boolean z2 = this.f16464k != 0;
                    long j = this.f16464k;
                    if (lVar.f16464k != 0) {
                        z = true;
                    }
                    this.f16464k = visitor.visitLong(z2, j, z, lVar.f16464k);
                    this.f16465l = (Duration) visitor.visitMessage(this.f16465l, lVar.f16465l);
                    this.f16466m = (Duration) visitor.visitMessage(this.f16466m, lVar.f16466m);
                    this.f16467n = (Duration) visitor.visitMessage(this.f16467n, lVar.f16467n);
                    this.f16468o = visitor.visitString(!this.f16468o.isEmpty(), this.f16468o, true ^ lVar.f16468o.isEmpty(), lVar.f16468o);
                    this.f16469p = (Duration) visitor.visitMessage(this.f16469p, lVar.f16469p);
                    this.f16470q = (Duration) visitor.visitMessage(this.f16470q, lVar.f16470q);
                    this.f16471r = (Duration) visitor.visitMessage(this.f16471r, lVar.f16471r);
                    this.f16472s = (Duration) visitor.visitMessage(this.f16472s, lVar.f16472s);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
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
                                    Builder builder = this.f16458e != null ? (Duration.Builder) this.f16458e.toBuilder() : null;
                                    this.f16458e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder == null) {
                                        break;
                                    } else {
                                        builder.mergeFrom(this.f16458e);
                                        this.f16458e = (Duration) builder.buildPartial();
                                        break;
                                    }
                                case 18:
                                    Builder builder2 = this.f16459f != null ? (Duration.Builder) this.f16459f.toBuilder() : null;
                                    this.f16459f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder2 == null) {
                                        break;
                                    } else {
                                        builder2.mergeFrom(this.f16459f);
                                        this.f16459f = (Duration) builder2.buildPartial();
                                        break;
                                    }
                                case 26:
                                    Builder builder3 = this.f16460g != null ? (Duration.Builder) this.f16460g.toBuilder() : null;
                                    this.f16460g = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder3 == null) {
                                        break;
                                    } else {
                                        builder3.mergeFrom(this.f16460g);
                                        this.f16460g = (Duration) builder3.buildPartial();
                                        break;
                                    }
                                case 34:
                                    Builder builder4 = this.f16461h != null ? (Duration.Builder) this.f16461h.toBuilder() : null;
                                    this.f16461h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder4 == null) {
                                        break;
                                    } else {
                                        builder4.mergeFrom(this.f16461h);
                                        this.f16461h = (Duration) builder4.buildPartial();
                                        break;
                                    }
                                case 42:
                                    Builder builder5 = this.f16462i != null ? (Duration.Builder) this.f16462i.toBuilder() : null;
                                    this.f16462i = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder5 == null) {
                                        break;
                                    } else {
                                        builder5.mergeFrom(this.f16462i);
                                        this.f16462i = (Duration) builder5.buildPartial();
                                        break;
                                    }
                                case 49:
                                    this.f16463j = codedInputStream.readDouble();
                                    break;
                                case 56:
                                    this.f16464k = codedInputStream.readInt64();
                                    break;
                                case 66:
                                    Builder builder6 = this.f16465l != null ? (Duration.Builder) this.f16465l.toBuilder() : null;
                                    this.f16465l = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder6 == null) {
                                        break;
                                    } else {
                                        builder6.mergeFrom(this.f16465l);
                                        this.f16465l = (Duration) builder6.buildPartial();
                                        break;
                                    }
                                case 74:
                                    Builder builder7 = this.f16466m != null ? (Duration.Builder) this.f16466m.toBuilder() : null;
                                    this.f16466m = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder7 == null) {
                                        break;
                                    } else {
                                        builder7.mergeFrom(this.f16466m);
                                        this.f16466m = (Duration) builder7.buildPartial();
                                        break;
                                    }
                                case 82:
                                    Builder builder8 = this.f16467n != null ? (Duration.Builder) this.f16467n.toBuilder() : null;
                                    this.f16467n = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder8 == null) {
                                        break;
                                    } else {
                                        builder8.mergeFrom(this.f16467n);
                                        this.f16467n = (Duration) builder8.buildPartial();
                                        break;
                                    }
                                case 90:
                                    this.f16468o = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 98:
                                    Builder builder9 = this.f16469p != null ? (Duration.Builder) this.f16469p.toBuilder() : null;
                                    this.f16469p = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder9 == null) {
                                        break;
                                    } else {
                                        builder9.mergeFrom(this.f16469p);
                                        this.f16469p = (Duration) builder9.buildPartial();
                                        break;
                                    }
                                case 106:
                                    Builder builder10 = this.f16470q != null ? (Duration.Builder) this.f16470q.toBuilder() : null;
                                    this.f16470q = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder10 == null) {
                                        break;
                                    } else {
                                        builder10.mergeFrom(this.f16470q);
                                        this.f16470q = (Duration) builder10.buildPartial();
                                        break;
                                    }
                                case 114:
                                    Builder builder11 = this.f16471r != null ? (Duration.Builder) this.f16471r.toBuilder() : null;
                                    this.f16471r = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder11 == null) {
                                        break;
                                    } else {
                                        builder11.mergeFrom(this.f16471r);
                                        this.f16471r = (Duration) builder11.buildPartial();
                                        break;
                                    }
                                case 122:
                                    Builder builder12 = this.f16472s != null ? (Duration.Builder) this.f16472s.toBuilder() : null;
                                    this.f16472s = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder12 == null) {
                                        break;
                                    } else {
                                        builder12.mergeFrom(this.f16472s);
                                        this.f16472s = (Duration) builder12.buildPartial();
                                        break;
                                    }
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
                    if (f16457u == null) {
                        synchronized (C6791l.class) {
                            if (f16457u == null) {
                                f16457u = new DefaultInstanceBasedParser(f16456t);
                            }
                        }
                    }
                    return f16457u;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16456t;
        }

        public double getBackOffFactor() {
            return this.f16463j;
        }

        public Duration getBackOffMaxTimeout() {
            Duration duration = this.f16460g;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getBackOffMinTimeout() {
            Duration duration = this.f16459f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getGrpcDefaultKeepAlivePing() {
            Duration duration = this.f16470q;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getGrpcDefaultKeepAliveTimeout() {
            Duration duration = this.f16469p;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getGrpcPipelineKeepAlivePing() {
            Duration duration = this.f16472s;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getGrpcPipelineKeepAliveTimeout() {
            Duration duration = this.f16471r;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16458e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getUnaryTimeout());
            }
            if (this.f16459f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getBackOffMinTimeout());
            }
            if (this.f16460g != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getBackOffMaxTimeout());
            }
            if (this.f16461h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getTransportTimeout());
            }
            if (this.f16462i != null) {
                i2 += CodedOutputStream.computeMessageSize(5, getTransportKeepAlive());
            }
            double d = this.f16463j;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(6, d);
            }
            long j = this.f16464k;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(7, j);
            }
            if (this.f16465l != null) {
                i2 += CodedOutputStream.computeMessageSize(8, getValveDialTimeout());
            }
            if (this.f16466m != null) {
                i2 += CodedOutputStream.computeMessageSize(9, getValveCallTimeout());
            }
            if (this.f16467n != null) {
                i2 += CodedOutputStream.computeMessageSize(10, getValveCacheTtl());
            }
            if (!this.f16468o.isEmpty()) {
                i2 += CodedOutputStream.computeStringSize(11, getValveUrl());
            }
            if (this.f16469p != null) {
                i2 += CodedOutputStream.computeMessageSize(12, getGrpcDefaultKeepAliveTimeout());
            }
            if (this.f16470q != null) {
                i2 += CodedOutputStream.computeMessageSize(13, getGrpcDefaultKeepAlivePing());
            }
            if (this.f16471r != null) {
                i2 += CodedOutputStream.computeMessageSize(14, getGrpcPipelineKeepAliveTimeout());
            }
            if (this.f16472s != null) {
                i2 += CodedOutputStream.computeMessageSize(15, getGrpcPipelineKeepAlivePing());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public long getStreamsBufferSize() {
            return this.f16464k;
        }

        public Duration getTransportKeepAlive() {
            Duration duration = this.f16462i;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getTransportTimeout() {
            Duration duration = this.f16461h;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getUnaryTimeout() {
            Duration duration = this.f16458e;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getValveCacheTtl() {
            Duration duration = this.f16467n;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getValveCallTimeout() {
            Duration duration = this.f16466m;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getValveDialTimeout() {
            Duration duration = this.f16465l;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public String getValveUrl() {
            return this.f16468o;
        }

        public ByteString getValveUrlBytes() {
            return ByteString.copyFromUtf8(this.f16468o);
        }

        public boolean hasBackOffMaxTimeout() {
            return this.f16460g != null;
        }

        public boolean hasBackOffMinTimeout() {
            return this.f16459f != null;
        }

        public boolean hasGrpcDefaultKeepAlivePing() {
            return this.f16470q != null;
        }

        public boolean hasGrpcDefaultKeepAliveTimeout() {
            return this.f16469p != null;
        }

        public boolean hasGrpcPipelineKeepAlivePing() {
            return this.f16472s != null;
        }

        public boolean hasGrpcPipelineKeepAliveTimeout() {
            return this.f16471r != null;
        }

        public boolean hasTransportKeepAlive() {
            return this.f16462i != null;
        }

        public boolean hasTransportTimeout() {
            return this.f16461h != null;
        }

        public boolean hasUnaryTimeout() {
            return this.f16458e != null;
        }

        public boolean hasValveCacheTtl() {
            return this.f16467n != null;
        }

        public boolean hasValveCallTimeout() {
            return this.f16466m != null;
        }

        public boolean hasValveDialTimeout() {
            return this.f16465l != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16458e != null) {
                codedOutputStream.writeMessage(1, getUnaryTimeout());
            }
            if (this.f16459f != null) {
                codedOutputStream.writeMessage(2, getBackOffMinTimeout());
            }
            if (this.f16460g != null) {
                codedOutputStream.writeMessage(3, getBackOffMaxTimeout());
            }
            if (this.f16461h != null) {
                codedOutputStream.writeMessage(4, getTransportTimeout());
            }
            if (this.f16462i != null) {
                codedOutputStream.writeMessage(5, getTransportKeepAlive());
            }
            double d = this.f16463j;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(6, d);
            }
            long j = this.f16464k;
            if (j != 0) {
                codedOutputStream.writeInt64(7, j);
            }
            if (this.f16465l != null) {
                codedOutputStream.writeMessage(8, getValveDialTimeout());
            }
            if (this.f16466m != null) {
                codedOutputStream.writeMessage(9, getValveCallTimeout());
            }
            if (this.f16467n != null) {
                codedOutputStream.writeMessage(10, getValveCacheTtl());
            }
            if (!this.f16468o.isEmpty()) {
                codedOutputStream.writeString(11, getValveUrl());
            }
            if (this.f16469p != null) {
                codedOutputStream.writeMessage(12, getGrpcDefaultKeepAliveTimeout());
            }
            if (this.f16470q != null) {
                codedOutputStream.writeMessage(13, getGrpcDefaultKeepAlivePing());
            }
            if (this.f16471r != null) {
                codedOutputStream.writeMessage(14, getGrpcPipelineKeepAliveTimeout());
            }
            if (this.f16472s != null) {
                codedOutputStream.writeMessage(15, getGrpcPipelineKeepAlivePing());
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$m */
    public static final class C6793m extends GeneratedMessageLite<C6793m, C6794a> implements OnboardingOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C6793m f16473f = new C6793m();

        /* renamed from: g */
        private static volatile Parser<C6793m> f16474g;

        /* renamed from: e */
        private boolean f16475e;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$m$a */
        public static final class C6794a extends Builder<C6793m, C6794a> implements OnboardingOrBuilder {
            /* synthetic */ C6794a(C7317g gVar) {
                this();
            }

            public boolean getAllowAgeGatingRetry() {
                return ((C6793m) this.instance).getAllowAgeGatingRetry();
            }

            private C6794a() {
                super(C6793m.f16473f);
            }
        }

        static {
            f16473f.makeImmutable();
        }

        private C6793m() {
        }

        public static C6793m getDefaultInstance() {
            return f16473f;
        }

        public static Parser<C6793m> parser() {
            return f16473f.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6793m();
                case 2:
                    return f16473f;
                case 3:
                    return null;
                case 4:
                    return new C6794a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6793m mVar = (C6793m) obj2;
                    boolean z = this.f16475e;
                    boolean z2 = mVar.f16475e;
                    this.f16475e = visitor.visitBoolean(z, z, z2, z2);
                    MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.f16475e = codedInputStream.readBool();
                                } else if (!codedInputStream.skipField(readTag)) {
                                }
                            }
                            z3 = true;
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
                    if (f16474g == null) {
                        synchronized (C6793m.class) {
                            if (f16474g == null) {
                                f16474g = new DefaultInstanceBasedParser(f16473f);
                            }
                        }
                    }
                    return f16474g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16473f;
        }

        public boolean getAllowAgeGatingRetry() {
            return this.f16475e;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            boolean z = this.f16475e;
            if (z) {
                i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z = this.f16475e;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$n */
    public static final class C6795n extends GeneratedMessageLite<C6795n, C6796a> implements PipelineOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: n */
        public static final C6795n f16476n = new C6795n();

        /* renamed from: o */
        private static volatile Parser<C6795n> f16477o;

        /* renamed from: e */
        private Duration f16478e;

        /* renamed from: f */
        private Duration f16479f;

        /* renamed from: g */
        private Duration f16480g;

        /* renamed from: h */
        private Duration f16481h;

        /* renamed from: i */
        private Duration f16482i;

        /* renamed from: j */
        private Duration f16483j;

        /* renamed from: k */
        private double f16484k;

        /* renamed from: l */
        private double f16485l;

        /* renamed from: m */
        private double f16486m;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$n$a */
        public static final class C6796a extends Builder<C6795n, C6796a> implements PipelineOrBuilder {
            /* synthetic */ C6796a(C7317g gVar) {
                this();
            }

            public Duration getBackgroundExitTimeout() {
                return ((C6795n) this.instance).getBackgroundExitTimeout();
            }

            public double getTcDebounceHorizontalPrecisionThreshold() {
                return ((C6795n) this.instance).getTcDebounceHorizontalPrecisionThreshold();
            }

            public double getTcDebounceMaxDeltaPressure() {
                return ((C6795n) this.instance).getTcDebounceMaxDeltaPressure();
            }

            public double getTcDebounceMaxDistance() {
                return ((C6795n) this.instance).getTcDebounceMaxDistance();
            }

            public Duration getTcDebounceMaxDuration() {
                return ((C6795n) this.instance).getTcDebounceMaxDuration();
            }

            public Duration getTcFuserLowreqTimeout() {
                return ((C6795n) this.instance).getTcFuserLowreqTimeout();
            }

            public Duration getTcSenderFirstTcTimeout() {
                return ((C6795n) this.instance).getTcSenderFirstTcTimeout();
            }

            public Duration getTcSenderTimeout() {
                return ((C6795n) this.instance).getTcSenderTimeout();
            }

            public Duration getTcSenderWatchersResponseTimeout() {
                return ((C6795n) this.instance).getTcSenderWatchersResponseTimeout();
            }

            public boolean hasBackgroundExitTimeout() {
                return ((C6795n) this.instance).hasBackgroundExitTimeout();
            }

            public boolean hasTcDebounceMaxDuration() {
                return ((C6795n) this.instance).hasTcDebounceMaxDuration();
            }

            public boolean hasTcFuserLowreqTimeout() {
                return ((C6795n) this.instance).hasTcFuserLowreqTimeout();
            }

            public boolean hasTcSenderFirstTcTimeout() {
                return ((C6795n) this.instance).hasTcSenderFirstTcTimeout();
            }

            public boolean hasTcSenderTimeout() {
                return ((C6795n) this.instance).hasTcSenderTimeout();
            }

            public boolean hasTcSenderWatchersResponseTimeout() {
                return ((C6795n) this.instance).hasTcSenderWatchersResponseTimeout();
            }

            private C6796a() {
                super(C6795n.f16476n);
            }
        }

        static {
            f16476n.makeImmutable();
        }

        private C6795n() {
        }

        public static C6795n getDefaultInstance() {
            return f16476n;
        }

        public static Parser<C6795n> parser() {
            return f16476n.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6795n();
                case 2:
                    return f16476n;
                case 3:
                    return null;
                case 4:
                    return new C6796a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6795n nVar = (C6795n) obj2;
                    this.f16478e = (Duration) visitor.visitMessage(this.f16478e, nVar.f16478e);
                    this.f16479f = (Duration) visitor.visitMessage(this.f16479f, nVar.f16479f);
                    this.f16480g = (Duration) visitor.visitMessage(this.f16480g, nVar.f16480g);
                    this.f16481h = (Duration) visitor.visitMessage(this.f16481h, nVar.f16481h);
                    this.f16482i = (Duration) visitor.visitMessage(this.f16482i, nVar.f16482i);
                    this.f16483j = (Duration) visitor.visitMessage(this.f16483j, nVar.f16483j);
                    this.f16484k = visitor.visitDouble(this.f16484k != 0.0d, this.f16484k, nVar.f16484k != 0.0d, nVar.f16484k);
                    this.f16485l = visitor.visitDouble(this.f16485l != 0.0d, this.f16485l, nVar.f16485l != 0.0d, nVar.f16485l);
                    this.f16486m = visitor.visitDouble(this.f16486m != 0.0d, this.f16486m, nVar.f16486m != 0.0d, nVar.f16486m);
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
                                    Builder builder = this.f16478e != null ? (Duration.Builder) this.f16478e.toBuilder() : null;
                                    this.f16478e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16478e);
                                        this.f16478e = (Duration) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f16479f != null ? (Duration.Builder) this.f16479f.toBuilder() : null;
                                    this.f16479f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f16479f);
                                        this.f16479f = (Duration) builder2.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Builder builder3 = this.f16482i != null ? (Duration.Builder) this.f16482i.toBuilder() : null;
                                    this.f16482i = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f16482i);
                                        this.f16482i = (Duration) builder3.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    Builder builder4 = this.f16481h != null ? (Duration.Builder) this.f16481h.toBuilder() : null;
                                    this.f16481h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder4 != null) {
                                        builder4.mergeFrom(this.f16481h);
                                        this.f16481h = (Duration) builder4.buildPartial();
                                    }
                                } else if (readTag == 42) {
                                    Builder builder5 = this.f16480g != null ? (Duration.Builder) this.f16480g.toBuilder() : null;
                                    this.f16480g = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder5 != null) {
                                        builder5.mergeFrom(this.f16480g);
                                        this.f16480g = (Duration) builder5.buildPartial();
                                    }
                                } else if (readTag == 50) {
                                    Builder builder6 = this.f16483j != null ? (Duration.Builder) this.f16483j.toBuilder() : null;
                                    this.f16483j = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder6 != null) {
                                        builder6.mergeFrom(this.f16483j);
                                        this.f16483j = (Duration) builder6.buildPartial();
                                    }
                                } else if (readTag == 57) {
                                    this.f16484k = codedInputStream.readDouble();
                                } else if (readTag == 65) {
                                    this.f16485l = codedInputStream.readDouble();
                                } else if (readTag == 73) {
                                    this.f16486m = codedInputStream.readDouble();
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
                    if (f16477o == null) {
                        synchronized (C6795n.class) {
                            if (f16477o == null) {
                                f16477o = new DefaultInstanceBasedParser(f16476n);
                            }
                        }
                    }
                    return f16477o;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16476n;
        }

        public Duration getBackgroundExitTimeout() {
            Duration duration = this.f16478e;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16478e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getBackgroundExitTimeout());
            }
            if (this.f16479f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getTcSenderTimeout());
            }
            if (this.f16482i != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getTcFuserLowreqTimeout());
            }
            if (this.f16481h != null) {
                i2 += CodedOutputStream.computeMessageSize(4, getTcSenderWatchersResponseTimeout());
            }
            if (this.f16480g != null) {
                i2 += CodedOutputStream.computeMessageSize(5, getTcSenderFirstTcTimeout());
            }
            if (this.f16483j != null) {
                i2 += CodedOutputStream.computeMessageSize(6, getTcDebounceMaxDuration());
            }
            double d = this.f16484k;
            if (d != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(7, d);
            }
            double d2 = this.f16485l;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(8, d2);
            }
            double d3 = this.f16486m;
            if (d3 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(9, d3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public double getTcDebounceHorizontalPrecisionThreshold() {
            return this.f16485l;
        }

        public double getTcDebounceMaxDeltaPressure() {
            return this.f16486m;
        }

        public double getTcDebounceMaxDistance() {
            return this.f16484k;
        }

        public Duration getTcDebounceMaxDuration() {
            Duration duration = this.f16483j;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getTcFuserLowreqTimeout() {
            Duration duration = this.f16482i;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getTcSenderFirstTcTimeout() {
            Duration duration = this.f16480g;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getTcSenderTimeout() {
            Duration duration = this.f16479f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getTcSenderWatchersResponseTimeout() {
            Duration duration = this.f16481h;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public boolean hasBackgroundExitTimeout() {
            return this.f16478e != null;
        }

        public boolean hasTcDebounceMaxDuration() {
            return this.f16483j != null;
        }

        public boolean hasTcFuserLowreqTimeout() {
            return this.f16482i != null;
        }

        public boolean hasTcSenderFirstTcTimeout() {
            return this.f16480g != null;
        }

        public boolean hasTcSenderTimeout() {
            return this.f16479f != null;
        }

        public boolean hasTcSenderWatchersResponseTimeout() {
            return this.f16481h != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16478e != null) {
                codedOutputStream.writeMessage(1, getBackgroundExitTimeout());
            }
            if (this.f16479f != null) {
                codedOutputStream.writeMessage(2, getTcSenderTimeout());
            }
            if (this.f16482i != null) {
                codedOutputStream.writeMessage(3, getTcFuserLowreqTimeout());
            }
            if (this.f16481h != null) {
                codedOutputStream.writeMessage(4, getTcSenderWatchersResponseTimeout());
            }
            if (this.f16480g != null) {
                codedOutputStream.writeMessage(5, getTcSenderFirstTcTimeout());
            }
            if (this.f16483j != null) {
                codedOutputStream.writeMessage(6, getTcDebounceMaxDuration());
            }
            double d = this.f16484k;
            if (d != 0.0d) {
                codedOutputStream.writeDouble(7, d);
            }
            double d2 = this.f16485l;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(8, d2);
            }
            double d3 = this.f16486m;
            if (d3 != 0.0d) {
                codedOutputStream.writeDouble(9, d3);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$o */
    public static final class C6797o extends GeneratedMessageLite<C6797o, C6798a> implements TimeOnTheSpotOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6797o f16487h = new C6797o();

        /* renamed from: i */
        private static volatile Parser<C6797o> f16488i;

        /* renamed from: e */
        private Duration f16489e;

        /* renamed from: f */
        private Duration f16490f;

        /* renamed from: g */
        private Duration f16491g;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$o$a */
        public static final class C6798a extends Builder<C6797o, C6798a> implements TimeOnTheSpotOrBuilder {
            /* synthetic */ C6798a(C7317g gVar) {
                this();
            }

            public Duration getIsMovingValidity() {
                return ((C6797o) this.instance).getIsMovingValidity();
            }

            public Duration getIsVisitPointObsolete() {
                return ((C6797o) this.instance).getIsVisitPointObsolete();
            }

            public Duration getNetworkLatencyMargin() {
                return ((C6797o) this.instance).getNetworkLatencyMargin();
            }

            public boolean hasIsMovingValidity() {
                return ((C6797o) this.instance).hasIsMovingValidity();
            }

            public boolean hasIsVisitPointObsolete() {
                return ((C6797o) this.instance).hasIsVisitPointObsolete();
            }

            public boolean hasNetworkLatencyMargin() {
                return ((C6797o) this.instance).hasNetworkLatencyMargin();
            }

            private C6798a() {
                super(C6797o.f16487h);
            }
        }

        static {
            f16487h.makeImmutable();
        }

        private C6797o() {
        }

        public static C6797o getDefaultInstance() {
            return f16487h;
        }

        public static Parser<C6797o> parser() {
            return f16487h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6797o();
                case 2:
                    return f16487h;
                case 3:
                    return null;
                case 4:
                    return new C6798a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6797o oVar = (C6797o) obj2;
                    this.f16489e = (Duration) visitor.visitMessage(this.f16489e, oVar.f16489e);
                    this.f16490f = (Duration) visitor.visitMessage(this.f16490f, oVar.f16490f);
                    this.f16491g = (Duration) visitor.visitMessage(this.f16491g, oVar.f16491g);
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
                                    Builder builder = this.f16489e != null ? (Duration.Builder) this.f16489e.toBuilder() : null;
                                    this.f16489e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16489e);
                                        this.f16489e = (Duration) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f16490f != null ? (Duration.Builder) this.f16490f.toBuilder() : null;
                                    this.f16490f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f16490f);
                                        this.f16490f = (Duration) builder2.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Builder builder3 = this.f16491g != null ? (Duration.Builder) this.f16491g.toBuilder() : null;
                                    this.f16491g = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder3 != null) {
                                        builder3.mergeFrom(this.f16491g);
                                        this.f16491g = (Duration) builder3.buildPartial();
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
                    if (f16488i == null) {
                        synchronized (C6797o.class) {
                            if (f16488i == null) {
                                f16488i = new DefaultInstanceBasedParser(f16487h);
                            }
                        }
                    }
                    return f16488i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16487h;
        }

        public Duration getIsMovingValidity() {
            Duration duration = this.f16489e;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getIsVisitPointObsolete() {
            Duration duration = this.f16490f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getNetworkLatencyMargin() {
            Duration duration = this.f16491g;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16489e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getIsMovingValidity());
            }
            if (this.f16490f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getIsVisitPointObsolete());
            }
            if (this.f16491g != null) {
                i2 += CodedOutputStream.computeMessageSize(3, getNetworkLatencyMargin());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasIsMovingValidity() {
            return this.f16489e != null;
        }

        public boolean hasIsVisitPointObsolete() {
            return this.f16490f != null;
        }

        public boolean hasNetworkLatencyMargin() {
            return this.f16491g != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16489e != null) {
                codedOutputStream.writeMessage(1, getIsMovingValidity());
            }
            if (this.f16490f != null) {
                codedOutputStream.writeMessage(2, getIsVisitPointObsolete());
            }
            if (this.f16491g != null) {
                codedOutputStream.writeMessage(3, getNetworkLatencyMargin());
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$p */
    public static final class C6799p extends GeneratedMessageLite<C6799p, C6800a> implements TracerOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final C6799p f16492h = new C6799p();

        /* renamed from: i */
        private static volatile Parser<C6799p> f16493i;

        /* renamed from: e */
        private Duration f16494e;

        /* renamed from: f */
        private Duration f16495f;

        /* renamed from: g */
        private int f16496g;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$p$a */
        public static final class C6800a extends Builder<C6799p, C6800a> implements TracerOrBuilder {
            /* synthetic */ C6800a(C7317g gVar) {
                this();
            }

            public int getFlushBufferSize() {
                return ((C6799p) this.instance).getFlushBufferSize();
            }

            public Duration getFlushTimeout() {
                return ((C6799p) this.instance).getFlushTimeout();
            }

            public Duration getSendTimeout() {
                return ((C6799p) this.instance).getSendTimeout();
            }

            public boolean hasFlushTimeout() {
                return ((C6799p) this.instance).hasFlushTimeout();
            }

            public boolean hasSendTimeout() {
                return ((C6799p) this.instance).hasSendTimeout();
            }

            private C6800a() {
                super(C6799p.f16492h);
            }
        }

        static {
            f16492h.makeImmutable();
        }

        private C6799p() {
        }

        public static C6799p getDefaultInstance() {
            return f16492h;
        }

        public static Parser<C6799p> parser() {
            return f16492h.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6799p();
                case 2:
                    return f16492h;
                case 3:
                    return null;
                case 4:
                    return new C6800a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6799p pVar = (C6799p) obj2;
                    this.f16494e = (Duration) visitor.visitMessage(this.f16494e, pVar.f16494e);
                    this.f16495f = (Duration) visitor.visitMessage(this.f16495f, pVar.f16495f);
                    boolean z2 = this.f16496g != 0;
                    int i = this.f16496g;
                    if (pVar.f16496g != 0) {
                        z = true;
                    }
                    this.f16496g = visitor.visitInt(z2, i, z, pVar.f16496g);
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
                                    Builder builder = this.f16494e != null ? (Duration.Builder) this.f16494e.toBuilder() : null;
                                    this.f16494e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16494e);
                                        this.f16494e = (Duration) builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    Builder builder2 = this.f16495f != null ? (Duration.Builder) this.f16495f.toBuilder() : null;
                                    this.f16495f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder2 != null) {
                                        builder2.mergeFrom(this.f16495f);
                                        this.f16495f = (Duration) builder2.buildPartial();
                                    }
                                } else if (readTag == 24) {
                                    this.f16496g = codedInputStream.readInt32();
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
                    if (f16493i == null) {
                        synchronized (C6799p.class) {
                            if (f16493i == null) {
                                f16493i = new DefaultInstanceBasedParser(f16492h);
                            }
                        }
                    }
                    return f16493i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16492h;
        }

        public int getFlushBufferSize() {
            return this.f16496g;
        }

        public Duration getFlushTimeout() {
            Duration duration = this.f16495f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public Duration getSendTimeout() {
            Duration duration = this.f16494e;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f16494e != null) {
                i2 = 0 + CodedOutputStream.computeMessageSize(1, getSendTimeout());
            }
            if (this.f16495f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getFlushTimeout());
            }
            int i3 = this.f16496g;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeInt32Size(3, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasFlushTimeout() {
            return this.f16495f != null;
        }

        public boolean hasSendTimeout() {
            return this.f16494e != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f16494e != null) {
                codedOutputStream.writeMessage(1, getSendTimeout());
            }
            if (this.f16495f != null) {
                codedOutputStream.writeMessage(2, getFlushTimeout());
            }
            int i = this.f16496g;
            if (i != 0) {
                codedOutputStream.writeInt32(3, i);
            }
        }
    }

    /* renamed from: co.znly.models.ConfigurationProto$Configuration$q */
    public static final class C6801q extends GeneratedMessageLite<C6801q, C6802a> implements WeatherOrBuilder {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static final C6801q f16497g = new C6801q();

        /* renamed from: h */
        private static volatile Parser<C6801q> f16498h;

        /* renamed from: e */
        private int f16499e;

        /* renamed from: f */
        private Duration f16500f;

        /* renamed from: co.znly.models.ConfigurationProto$Configuration$q$a */
        public static final class C6802a extends Builder<C6801q, C6802a> implements WeatherOrBuilder {
            /* synthetic */ C6802a(C7317g gVar) {
                this();
            }

            public int getCacheCellLevel() {
                return ((C6801q) this.instance).getCacheCellLevel();
            }

            public Duration getCacheTtl() {
                return ((C6801q) this.instance).getCacheTtl();
            }

            public boolean hasCacheTtl() {
                return ((C6801q) this.instance).hasCacheTtl();
            }

            private C6802a() {
                super(C6801q.f16497g);
            }
        }

        static {
            f16497g.makeImmutable();
        }

        private C6801q() {
        }

        public static C6801q getDefaultInstance() {
            return f16497g;
        }

        public static Parser<C6801q> parser() {
            return f16497g.getParserForType();
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6801q();
                case 2:
                    return f16497g;
                case 3:
                    return null;
                case 4:
                    return new C6802a(null);
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C6801q qVar = (C6801q) obj2;
                    boolean z2 = this.f16499e != 0;
                    int i = this.f16499e;
                    if (qVar.f16499e != 0) {
                        z = true;
                    }
                    this.f16499e = visitor.visitInt(z2, i, z, qVar.f16499e);
                    this.f16500f = (Duration) visitor.visitMessage(this.f16500f, qVar.f16500f);
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
                                    this.f16499e = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    Builder builder = this.f16500f != null ? (Duration.Builder) this.f16500f.toBuilder() : null;
                                    this.f16500f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom(this.f16500f);
                                        this.f16500f = (Duration) builder.buildPartial();
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
                    if (f16498h == null) {
                        synchronized (C6801q.class) {
                            if (f16498h == null) {
                                f16498h = new DefaultInstanceBasedParser(f16497g);
                            }
                        }
                    }
                    return f16498h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f16497g;
        }

        public int getCacheCellLevel() {
            return this.f16499e;
        }

        public Duration getCacheTtl() {
            Duration duration = this.f16500f;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.f16499e;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
            }
            if (this.f16500f != null) {
                i2 += CodedOutputStream.computeMessageSize(2, getCacheTtl());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public boolean hasCacheTtl() {
            return this.f16500f != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.f16499e;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            if (this.f16500f != null) {
                codedOutputStream.writeMessage(2, getCacheTtl());
            }
        }
    }

    static {
        f16305u.makeImmutable();
    }

    private ConfigurationProto$Configuration() {
    }

    public static ConfigurationProto$Configuration getDefaultInstance() {
        return f16305u;
    }

    public static Parser<ConfigurationProto$Configuration> parser() {
        return f16305u.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7317g.f18176a[methodToInvoke.ordinal()]) {
            case 1:
                return new ConfigurationProto$Configuration();
            case 2:
                return f16305u;
            case 3:
                return null;
            case 4:
                return new C6765b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                ConfigurationProto$Configuration configurationProto$Configuration = (ConfigurationProto$Configuration) obj2;
                this.f16307e = (C6785i) visitor.visitMessage(this.f16307e, configurationProto$Configuration.f16307e);
                this.f16308f = (C6789k) visitor.visitMessage(this.f16308f, configurationProto$Configuration.f16308f);
                this.f16309g = (C6791l) visitor.visitMessage(this.f16309g, configurationProto$Configuration.f16309g);
                this.f16310h = (C6766c) visitor.visitMessage(this.f16310h, configurationProto$Configuration.f16310h);
                this.f16311i = (C6795n) visitor.visitMessage(this.f16311i, configurationProto$Configuration.f16311i);
                this.f16312j = (C6799p) visitor.visitMessage(this.f16312j, configurationProto$Configuration.f16312j);
                this.f16313k = (C6779f) visitor.visitMessage(this.f16313k, configurationProto$Configuration.f16313k);
                this.f16314l = (C6793m) visitor.visitMessage(this.f16314l, configurationProto$Configuration.f16314l);
                this.f16315m = (C6781g) visitor.visitMessage(this.f16315m, configurationProto$Configuration.f16315m);
                this.f16316n = (C6797o) visitor.visitMessage(this.f16316n, configurationProto$Configuration.f16316n);
                this.f16317o = (C6801q) visitor.visitMessage(this.f16317o, configurationProto$Configuration.f16317o);
                this.f16318p = (C6787j) visitor.visitMessage(this.f16318p, configurationProto$Configuration.f16318p);
                this.f16319q = (C6763a) visitor.visitMessage(this.f16319q, configurationProto$Configuration.f16319q);
                this.f16320r = (C6783h) visitor.visitMessage(this.f16320r, configurationProto$Configuration.f16320r);
                this.f16321s = (C6768d) visitor.visitMessage(this.f16321s, configurationProto$Configuration.f16321s);
                this.f16322t = (C6770e) visitor.visitMessage(this.f16322t, configurationProto$Configuration.f16322t);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                Builder builder = this.f16307e != null ? (C6786a) this.f16307e.toBuilder() : null;
                                this.f16307e = (C6785i) codedInputStream.readMessage(C6785i.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f16307e);
                                    this.f16307e = (C6785i) builder.buildPartial();
                                    break;
                                }
                            case 18:
                                Builder builder2 = this.f16308f != null ? (C6790a) this.f16308f.toBuilder() : null;
                                this.f16308f = (C6789k) codedInputStream.readMessage(C6789k.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f16308f);
                                    this.f16308f = (C6789k) builder2.buildPartial();
                                    break;
                                }
                            case 26:
                                Builder builder3 = this.f16309g != null ? (C6792a) this.f16309g.toBuilder() : null;
                                this.f16309g = (C6791l) codedInputStream.readMessage(C6791l.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f16309g);
                                    this.f16309g = (C6791l) builder3.buildPartial();
                                    break;
                                }
                            case 34:
                                Builder builder4 = this.f16310h != null ? (C6767a) this.f16310h.toBuilder() : null;
                                this.f16310h = (C6766c) codedInputStream.readMessage(C6766c.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f16310h);
                                    this.f16310h = (C6766c) builder4.buildPartial();
                                    break;
                                }
                            case 42:
                                Builder builder5 = this.f16311i != null ? (C6796a) this.f16311i.toBuilder() : null;
                                this.f16311i = (C6795n) codedInputStream.readMessage(C6795n.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f16311i);
                                    this.f16311i = (C6795n) builder5.buildPartial();
                                    break;
                                }
                            case 50:
                                Builder builder6 = this.f16313k != null ? (C6780a) this.f16313k.toBuilder() : null;
                                this.f16313k = (C6779f) codedInputStream.readMessage(C6779f.parser(), extensionRegistryLite);
                                if (builder6 == null) {
                                    break;
                                } else {
                                    builder6.mergeFrom(this.f16313k);
                                    this.f16313k = (C6779f) builder6.buildPartial();
                                    break;
                                }
                            case 58:
                                Builder builder7 = this.f16312j != null ? (C6800a) this.f16312j.toBuilder() : null;
                                this.f16312j = (C6799p) codedInputStream.readMessage(C6799p.parser(), extensionRegistryLite);
                                if (builder7 == null) {
                                    break;
                                } else {
                                    builder7.mergeFrom(this.f16312j);
                                    this.f16312j = (C6799p) builder7.buildPartial();
                                    break;
                                }
                            case 66:
                                Builder builder8 = this.f16314l != null ? (C6794a) this.f16314l.toBuilder() : null;
                                this.f16314l = (C6793m) codedInputStream.readMessage(C6793m.parser(), extensionRegistryLite);
                                if (builder8 == null) {
                                    break;
                                } else {
                                    builder8.mergeFrom(this.f16314l);
                                    this.f16314l = (C6793m) builder8.buildPartial();
                                    break;
                                }
                            case 74:
                                Builder builder9 = this.f16315m != null ? (C6782a) this.f16315m.toBuilder() : null;
                                this.f16315m = (C6781g) codedInputStream.readMessage(C6781g.parser(), extensionRegistryLite);
                                if (builder9 == null) {
                                    break;
                                } else {
                                    builder9.mergeFrom(this.f16315m);
                                    this.f16315m = (C6781g) builder9.buildPartial();
                                    break;
                                }
                            case 82:
                                Builder builder10 = this.f16316n != null ? (C6798a) this.f16316n.toBuilder() : null;
                                this.f16316n = (C6797o) codedInputStream.readMessage(C6797o.parser(), extensionRegistryLite);
                                if (builder10 == null) {
                                    break;
                                } else {
                                    builder10.mergeFrom(this.f16316n);
                                    this.f16316n = (C6797o) builder10.buildPartial();
                                    break;
                                }
                            case 90:
                                Builder builder11 = this.f16317o != null ? (C6802a) this.f16317o.toBuilder() : null;
                                this.f16317o = (C6801q) codedInputStream.readMessage(C6801q.parser(), extensionRegistryLite);
                                if (builder11 == null) {
                                    break;
                                } else {
                                    builder11.mergeFrom(this.f16317o);
                                    this.f16317o = (C6801q) builder11.buildPartial();
                                    break;
                                }
                            case 98:
                                Builder builder12 = this.f16318p != null ? (C6788a) this.f16318p.toBuilder() : null;
                                this.f16318p = (C6787j) codedInputStream.readMessage(C6787j.parser(), extensionRegistryLite);
                                if (builder12 == null) {
                                    break;
                                } else {
                                    builder12.mergeFrom(this.f16318p);
                                    this.f16318p = (C6787j) builder12.buildPartial();
                                    break;
                                }
                            case 106:
                                Builder builder13 = this.f16319q != null ? (C6764a) this.f16319q.toBuilder() : null;
                                this.f16319q = (C6763a) codedInputStream.readMessage(C6763a.parser(), extensionRegistryLite);
                                if (builder13 == null) {
                                    break;
                                } else {
                                    builder13.mergeFrom(this.f16319q);
                                    this.f16319q = (C6763a) builder13.buildPartial();
                                    break;
                                }
                            case 114:
                                Builder builder14 = this.f16320r != null ? (C6784a) this.f16320r.toBuilder() : null;
                                this.f16320r = (C6783h) codedInputStream.readMessage(C6783h.parser(), extensionRegistryLite);
                                if (builder14 == null) {
                                    break;
                                } else {
                                    builder14.mergeFrom(this.f16320r);
                                    this.f16320r = (C6783h) builder14.buildPartial();
                                    break;
                                }
                            case 122:
                                Builder builder15 = this.f16321s != null ? (C6769a) this.f16321s.toBuilder() : null;
                                this.f16321s = (C6768d) codedInputStream.readMessage(C6768d.parser(), extensionRegistryLite);
                                if (builder15 == null) {
                                    break;
                                } else {
                                    builder15.mergeFrom(this.f16321s);
                                    this.f16321s = (C6768d) builder15.buildPartial();
                                    break;
                                }
                            case 130:
                                Builder builder16 = this.f16322t != null ? (C6772b) this.f16322t.toBuilder() : null;
                                this.f16322t = (C6770e) codedInputStream.readMessage(C6770e.parser(), extensionRegistryLite);
                                if (builder16 == null) {
                                    break;
                                } else {
                                    builder16.mergeFrom(this.f16322t);
                                    this.f16322t = (C6770e) builder16.buildPartial();
                                    break;
                                }
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
                if (f16306v == null) {
                    synchronized (ConfigurationProto$Configuration.class) {
                        if (f16306v == null) {
                            f16306v = new DefaultInstanceBasedParser(f16305u);
                        }
                    }
                }
                return f16306v;
            default:
                throw new UnsupportedOperationException();
        }
        return f16305u;
    }

    public C6763a getBrump() {
        C6763a aVar = this.f16319q;
        return aVar == null ? C6763a.getDefaultInstance() : aVar;
    }

    public C6766c getChat() {
        C6766c cVar = this.f16310h;
        return cVar == null ? C6766c.getDefaultInstance() : cVar;
    }

    public C6768d getDescendants() {
        C6768d dVar = this.f16321s;
        return dVar == null ? C6768d.getDefaultInstance() : dVar;
    }

    public C6770e getExperimentFlags() {
        C6770e eVar = this.f16322t;
        return eVar == null ? C6770e.getDefaultInstance() : eVar;
    }

    public C6779f getFacebook() {
        C6779f fVar = this.f16313k;
        return fVar == null ? C6779f.getDefaultInstance() : fVar;
    }

    public C6781g getFeatureFlags() {
        C6781g gVar = this.f16315m;
        return gVar == null ? C6781g.getDefaultInstance() : gVar;
    }

    public C6783h getFootsteps() {
        C6783h hVar = this.f16320r;
        return hVar == null ? C6783h.getDefaultInstance() : hVar;
    }

    public C6785i getGlobal() {
        C6785i iVar = this.f16307e;
        return iVar == null ? C6785i.getDefaultInstance() : iVar;
    }

    public C6787j getLocation() {
        C6787j jVar = this.f16318p;
        return jVar == null ? C6787j.getDefaultInstance() : jVar;
    }

    public C6789k getMap() {
        C6789k kVar = this.f16308f;
        return kVar == null ? C6789k.getDefaultInstance() : kVar;
    }

    public C6791l getNetwork() {
        C6791l lVar = this.f16309g;
        return lVar == null ? C6791l.getDefaultInstance() : lVar;
    }

    public C6793m getOnboarding() {
        C6793m mVar = this.f16314l;
        return mVar == null ? C6793m.getDefaultInstance() : mVar;
    }

    public C6795n getPipeline() {
        C6795n nVar = this.f16311i;
        return nVar == null ? C6795n.getDefaultInstance() : nVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f16307e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getGlobal());
        }
        if (this.f16308f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMap());
        }
        if (this.f16309g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getNetwork());
        }
        if (this.f16310h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getChat());
        }
        if (this.f16311i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getPipeline());
        }
        if (this.f16313k != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getFacebook());
        }
        if (this.f16312j != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getTracer());
        }
        if (this.f16314l != null) {
            i2 += CodedOutputStream.computeMessageSize(8, getOnboarding());
        }
        if (this.f16315m != null) {
            i2 += CodedOutputStream.computeMessageSize(9, getFeatureFlags());
        }
        if (this.f16316n != null) {
            i2 += CodedOutputStream.computeMessageSize(10, getTimeOnTheSpot());
        }
        if (this.f16317o != null) {
            i2 += CodedOutputStream.computeMessageSize(11, getWeather());
        }
        if (this.f16318p != null) {
            i2 += CodedOutputStream.computeMessageSize(12, getLocation());
        }
        if (this.f16319q != null) {
            i2 += CodedOutputStream.computeMessageSize(13, getBrump());
        }
        if (this.f16320r != null) {
            i2 += CodedOutputStream.computeMessageSize(14, getFootsteps());
        }
        if (this.f16321s != null) {
            i2 += CodedOutputStream.computeMessageSize(15, getDescendants());
        }
        if (this.f16322t != null) {
            i2 += CodedOutputStream.computeMessageSize(16, getExperimentFlags());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C6797o getTimeOnTheSpot() {
        C6797o oVar = this.f16316n;
        return oVar == null ? C6797o.getDefaultInstance() : oVar;
    }

    public C6799p getTracer() {
        C6799p pVar = this.f16312j;
        return pVar == null ? C6799p.getDefaultInstance() : pVar;
    }

    public C6801q getWeather() {
        C6801q qVar = this.f16317o;
        return qVar == null ? C6801q.getDefaultInstance() : qVar;
    }

    public boolean hasBrump() {
        return this.f16319q != null;
    }

    public boolean hasChat() {
        return this.f16310h != null;
    }

    public boolean hasDescendants() {
        return this.f16321s != null;
    }

    public boolean hasExperimentFlags() {
        return this.f16322t != null;
    }

    public boolean hasFacebook() {
        return this.f16313k != null;
    }

    public boolean hasFeatureFlags() {
        return this.f16315m != null;
    }

    public boolean hasFootsteps() {
        return this.f16320r != null;
    }

    public boolean hasGlobal() {
        return this.f16307e != null;
    }

    public boolean hasLocation() {
        return this.f16318p != null;
    }

    public boolean hasMap() {
        return this.f16308f != null;
    }

    public boolean hasNetwork() {
        return this.f16309g != null;
    }

    public boolean hasOnboarding() {
        return this.f16314l != null;
    }

    public boolean hasPipeline() {
        return this.f16311i != null;
    }

    public boolean hasTimeOnTheSpot() {
        return this.f16316n != null;
    }

    public boolean hasTracer() {
        return this.f16312j != null;
    }

    public boolean hasWeather() {
        return this.f16317o != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f16307e != null) {
            codedOutputStream.writeMessage(1, getGlobal());
        }
        if (this.f16308f != null) {
            codedOutputStream.writeMessage(2, getMap());
        }
        if (this.f16309g != null) {
            codedOutputStream.writeMessage(3, getNetwork());
        }
        if (this.f16310h != null) {
            codedOutputStream.writeMessage(4, getChat());
        }
        if (this.f16311i != null) {
            codedOutputStream.writeMessage(5, getPipeline());
        }
        if (this.f16313k != null) {
            codedOutputStream.writeMessage(6, getFacebook());
        }
        if (this.f16312j != null) {
            codedOutputStream.writeMessage(7, getTracer());
        }
        if (this.f16314l != null) {
            codedOutputStream.writeMessage(8, getOnboarding());
        }
        if (this.f16315m != null) {
            codedOutputStream.writeMessage(9, getFeatureFlags());
        }
        if (this.f16316n != null) {
            codedOutputStream.writeMessage(10, getTimeOnTheSpot());
        }
        if (this.f16317o != null) {
            codedOutputStream.writeMessage(11, getWeather());
        }
        if (this.f16318p != null) {
            codedOutputStream.writeMessage(12, getLocation());
        }
        if (this.f16319q != null) {
            codedOutputStream.writeMessage(13, getBrump());
        }
        if (this.f16320r != null) {
            codedOutputStream.writeMessage(14, getFootsteps());
        }
        if (this.f16321s != null) {
            codedOutputStream.writeMessage(15, getDescendants());
        }
        if (this.f16322t != null) {
            codedOutputStream.writeMessage(16, getExperimentFlags());
        }
    }
}
