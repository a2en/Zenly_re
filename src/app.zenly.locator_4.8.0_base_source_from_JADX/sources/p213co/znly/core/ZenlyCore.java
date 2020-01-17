package p213co.znly.core;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.appsflyer.share.Constants;
import com.evernote.android.job.C9447g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p213co.znly.core.RxProtoObservable.InputOutputCallable;
import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.core.location.LocationService;
import p213co.znly.core.location.NotificationProvider;
import p213co.znly.core.push.PushProvider;
import p213co.znly.core.sync_adapter.ZenlyCoreSyncAdapter;
import p213co.znly.core.sync_adapter.ZenlyCoreSyncPrefs;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7286e2;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7354j0.C7357c;
import p213co.znly.models.C7402n2;
import p213co.znly.models.C7458s;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6781g;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;
import p213co.znly.models.PingProto$Ping2.C6824b.C6825a;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.UserPreferencesProto$UserPreferences.C6915b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7052a2;
import p213co.znly.models.core.C7056b;
import p213co.znly.models.core.C7058b0;
import p213co.znly.models.core.C7060b1;
import p213co.znly.models.core.C7073d;
import p213co.znly.models.core.C7077d1;
import p213co.znly.models.core.C7077d1.C7079b;
import p213co.znly.models.core.C7082d3;
import p213co.znly.models.core.C7086e0;
import p213co.znly.models.core.C7088e1;
import p213co.znly.models.core.C7094f0;
import p213co.znly.models.core.C7097f2;
import p213co.znly.models.core.C7101g0;
import p213co.znly.models.core.C7105g2;
import p213co.znly.models.core.C7111h0;
import p213co.znly.models.core.C7117i;
import p213co.znly.models.core.C7123i2;
import p213co.znly.models.core.C7125j;
import p213co.znly.models.core.C7129j1;
import p213co.znly.models.core.C7135k0;
import p213co.znly.models.core.C7142l0;
import p213co.znly.models.core.C7144l1;
import p213co.znly.models.core.C7146l2;
import p213co.znly.models.core.C7156m;
import p213co.znly.models.core.C7159m1;
import p213co.znly.models.core.C7168n;
import p213co.znly.models.core.C7170n0;
import p213co.znly.models.core.C7172n1;
import p213co.znly.models.core.C7174n2;
import p213co.znly.models.core.C7176o;
import p213co.znly.models.core.C7178o0;
import p213co.znly.models.core.C7180o1;
import p213co.znly.models.core.C7184p;
import p213co.znly.models.core.C7186p0;
import p213co.znly.models.core.C7190p2;
import p213co.znly.models.core.C7192q;
import p213co.znly.models.core.C7196q0;
import p213co.znly.models.core.C7206r2;
import p213co.znly.models.core.C7206r2.C7207a;
import p213co.znly.models.core.C7215s2;
import p213co.znly.models.core.C7215s2.C7216a;
import p213co.znly.models.core.C7219t0;
import p213co.znly.models.core.C7222t2;
import p213co.znly.models.core.C7224u;
import p213co.znly.models.core.C7228u1;
import p213co.znly.models.core.C7236v0;
import p213co.znly.models.core.C7238v1;
import p213co.znly.models.core.C7243w0;
import p213co.znly.models.core.C7255y;
import p213co.znly.models.core.C7262z;
import p213co.znly.models.core.C7264z0;
import p213co.znly.models.core.ChatProto$ChatActivities;
import p213co.znly.models.core.GeoProto$RouteUserETAResponse;
import p213co.znly.models.core.StatesProto$ContactsAlreadyState;
import p213co.znly.models.core.StatesProto$ContactsSoonState;
import p213co.znly.models.core.StatesProto$ContactsSuggestionsState;
import p213co.znly.models.core.StatesProto$FriendRequestsState;
import p213co.znly.models.core.StatesProto$FriendsState;
import p213co.znly.models.core.StatesProto$FriendshipsState;
import p213co.znly.models.core.StatesProto$RecentsState;
import p213co.znly.models.core.StatesProto$TopFriendsState;
import p213co.znly.models.core.TypesProto$Gatherings;
import p213co.znly.models.core.UICacheProto$UiCacheEmojiPackUnlock;
import p213co.znly.models.core.logging.C7151b;
import p213co.znly.models.core.logging.C7151b.C7152a;
import p213co.znly.models.core.logging.C7151b.C7154c;
import p213co.znly.models.notifications.C7857w;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.reversegeocoder.C7921g;
import p213co.znly.models.services.C7973a0;
import p213co.znly.models.services.C7975a1;
import p213co.znly.models.services.C7977a2;
import p213co.znly.models.services.C7979a3;
import p213co.znly.models.services.C7983a5;
import p213co.znly.models.services.C7993b1;
import p213co.znly.models.services.C7995b2;
import p213co.znly.models.services.C7997b3;
import p213co.znly.models.services.C7999b4;
import p213co.znly.models.services.C8001b5;
import p213co.znly.models.services.C8003b6;
import p213co.znly.models.services.C8008c1;
import p213co.znly.models.services.C8010c2;
import p213co.znly.models.services.C8012c3;
import p213co.znly.models.services.C8014c4;
import p213co.znly.models.services.C8024d1;
import p213co.znly.models.services.C8030d3;
import p213co.znly.models.services.C8032d4;
import p213co.znly.models.services.C8034d5;
import p213co.znly.models.services.C8036d6;
import p213co.znly.models.services.C8040e0;
import p213co.znly.models.services.C8042e1;
import p213co.znly.models.services.C8044e2;
import p213co.znly.models.services.C8046e3;
import p213co.znly.models.services.C8048e4;
import p213co.znly.models.services.C8050e5;
import p213co.znly.models.services.C8052e6;
import p213co.znly.models.services.C8058f1;
import p213co.znly.models.services.C8058f1.C8059a;
import p213co.znly.models.services.C8060f2;
import p213co.znly.models.services.C8062f3;
import p213co.znly.models.services.C8062f3.C8063a;
import p213co.znly.models.services.C8064f4;
import p213co.znly.models.services.C8066f5;
import p213co.znly.models.services.C8072g0;
import p213co.znly.models.services.C8074g1;
import p213co.znly.models.services.C8076g2;
import p213co.znly.models.services.C8078g3;
import p213co.znly.models.services.C8080g4;
import p213co.znly.models.services.C8082g5;
import p213co.znly.models.services.C8090h1;
import p213co.znly.models.services.C8090h1.C8091a;
import p213co.znly.models.services.C8092h2;
import p213co.znly.models.services.C8094h3;
import p213co.znly.models.services.C8096h4;
import p213co.znly.models.services.C8098h5;
import p213co.znly.models.services.C8100h6;
import p213co.znly.models.services.C8100h6.C8101a;
import p213co.znly.models.services.C8105i1;
import p213co.znly.models.services.C8107i2;
import p213co.znly.models.services.C8109i3;
import p213co.znly.models.services.C8111i4;
import p213co.znly.models.services.C8121j1;
import p213co.znly.models.services.C8123j2;
import p213co.znly.models.services.C8135k0;
import p213co.znly.models.services.C8137k1;
import p213co.znly.models.services.C8139k2;
import p213co.znly.models.services.C8141k3;
import p213co.znly.models.services.C8143k4;
import p213co.znly.models.services.C8145k5;
import p213co.znly.models.services.C8149l0;
import p213co.znly.models.services.C8151l1;
import p213co.znly.models.services.C8153l2;
import p213co.znly.models.services.C8155l3;
import p213co.znly.models.services.C8157l4;
import p213co.znly.models.services.C8159l5;
import p213co.znly.models.services.C8163m0;
import p213co.znly.models.services.C8167m2;
import p213co.znly.models.services.C8169m3;
import p213co.znly.models.services.C8171m4;
import p213co.znly.models.services.C8175m5;
import p213co.znly.models.services.C8183n2;
import p213co.znly.models.services.C8185n3;
import p213co.znly.models.services.C8187n4;
import p213co.znly.models.services.C8189n5;
import p213co.znly.models.services.C8202o0;
import p213co.znly.models.services.C8206o2;
import p213co.znly.models.services.C8208o3;
import p213co.znly.models.services.C8214o5;
import p213co.znly.models.services.C8220p0;
import p213co.znly.models.services.C8222p1;
import p213co.znly.models.services.C8224p2;
import p213co.znly.models.services.C8226p3;
import p213co.znly.models.services.C8228p4;
import p213co.znly.models.services.C8230p5;
import p213co.znly.models.services.C8241q1;
import p213co.znly.models.services.C8243q2;
import p213co.znly.models.services.C8245q3;
import p213co.znly.models.services.C8247q4;
import p213co.znly.models.services.C8252r0;
import p213co.znly.models.services.C8256r2;
import p213co.znly.models.services.C8260r4;
import p213co.znly.models.services.C8262r5;
import p213co.znly.models.services.C8268s1;
import p213co.znly.models.services.C8271s2;
import p213co.znly.models.services.C8273s3;
import p213co.znly.models.services.C8279s5;
import p213co.znly.models.services.C8288t0;
import p213co.znly.models.services.C8290t1;
import p213co.znly.models.services.C8292t2;
import p213co.znly.models.services.C8294t3;
import p213co.znly.models.services.C8296t4;
import p213co.znly.models.services.C8298t5;
import p213co.znly.models.services.C8301u0;
import p213co.znly.models.services.C8305u2;
import p213co.znly.models.services.C8309u4;
import p213co.znly.models.services.C8332v0;
import p213co.znly.models.services.C8336v2;
import p213co.znly.models.services.C8338v3;
import p213co.znly.models.services.C8342v5;
import p213co.znly.models.services.C8345w0;
import p213co.znly.models.services.C8361w5;
import p213co.znly.models.services.C8365x0;
import p213co.znly.models.services.C8365x0.C8366a;
import p213co.znly.models.services.C8369x2;
import p213co.znly.models.services.C8375x4;
import p213co.znly.models.services.C8377x5;
import p213co.znly.models.services.C8381y0;
import p213co.znly.models.services.C8383y1;
import p213co.znly.models.services.C8385y2;
import p213co.znly.models.services.C8387y3;
import p213co.znly.models.services.C8389y4;
import p213co.znly.models.services.C8391y5;
import p213co.znly.models.services.C8393z;
import p213co.znly.models.services.C8395z0;
import p213co.znly.models.services.C8397z1;
import p213co.znly.models.services.C8399z2;
import p213co.znly.models.services.C8401z3;
import p213co.znly.models.services.C8403z4;
import p213co.znly.models.services.C8405z5;
import p213co.znly.models.services.ZenlyProto$BrumpCountersResponse;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest;
import p213co.znly.models.services.ZenlyProto$ChatSendMessageMultiRequest.C7943a;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser;
import p213co.znly.models.services.ZenlyProto$GetAnnouncementsResponse;
import p213co.znly.models.services.ZenlyProto$PushNotificationCreateResponse;
import p213co.znly.models.services.ZenlyProto$SessionCreateRequest;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest;
import p213co.znly.models.services.ZenlyProto$TrackingContextSubscribeStreamRequest.C7961a;
import p213co.znly.models.services.ZenlyProto$UserVisitPointResponse;
import p213co.znly.models.services.places.C8233b;
import p213co.znly.models.services.places.C8235c;
import p213co.znly.models.sleepdetection.C8408b;
import p213co.znly.models.tileserver.VectorTileProto$Tile;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;
import p213co.znly.zenlygocore.Zenlygocore;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: co.znly.core.ZenlyCore */
public final class ZenlyCore {
    private static final String TAG = "ZenlyCore";
    public static Looper looper;
    private final C12279e<UserProto$User> _userMeStream;
    private final Context context;
    private final Core gocore;
    private final HandlerThread handlerThread;
    private final C12286f scheduler;

    /* renamed from: co.znly.core.ZenlyCore$Builder */
    public static class Builder {
        private final Context context;
        private boolean devModeEnabled = false;
        private final String host;
        private final NotificationProvider notificationProvider;

        public Builder(Context context2, String str, NotificationProvider notificationProvider2) {
            this.context = context2;
            this.host = str;
            this.notificationProvider = notificationProvider2;
        }

        public ZenlyCore build() throws Exception {
            ZenlyCore zenlyCore = new ZenlyCore(this.context, this.host, this.notificationProvider, this.devModeEnabled);
            return zenlyCore;
        }

        public Builder enableDevMode() {
            this.devModeEnabled = true;
            return this;
        }
    }

    private C12279e<C7206r2> asProtoObservable(C12279e<String> eVar) {
        return eVar.mo36501i(new C6418d6(this));
    }

    /* access modifiers changed from: private */
    public C7206r2 asProtoValue(String str) {
        C7207a newBuilder = C7206r2.newBuilder();
        newBuilder.mo19186a(str);
        return (C7206r2) newBuilder.build();
    }

    private C12279e<String> fromProtoObservable(C12279e<C7206r2> eVar) {
        return eVar.mo36501i(C6472h6.f16051e);
    }

    private C12279e<Double> fromProtoObservableDouble(C12279e<C7206r2> eVar) {
        return eVar.mo36501i(C6444f6.f16023e);
    }

    private C12279e<Integer> fromProtoObservableInteger(C12279e<C7206r2> eVar) {
        return eVar.mo36501i(C6384b6.f15962e);
    }

    private C12279e<Long> fromProtoObservableLong(C12279e<C7206r2> eVar) {
        return eVar.mo36501i(C6757z5.f16299e);
    }

    private <T extends MessageLite, U extends p213co.znly.core.vendor.com.google.protobuf.MessageLite.Builder> T fromRawPayload(byte[] bArr, BuilderCreator<U> builderCreator) {
        if (bArr != null) {
            try {
                return ((p213co.znly.core.vendor.com.google.protobuf.MessageLite.Builder) builderCreator.create()).mergeFrom(bArr).build();
            } catch (InvalidProtocolBufferException unused) {
            }
        }
        return null;
    }

    public static C7402n2 lastSession(Context context2) {
        try {
            return C7402n2.parseFrom(new FileInputStream(new File(new File(context2.getFilesDir(), "co.znly.core"), "session.bin")));
        } catch (FileNotFoundException | Exception unused) {
            return null;
        }
    }

    private Date toDate(long j) {
        return new Date(j / 1000000);
    }

    private long toUnixNano(Date date) {
        return date.getTime() * 1000000;
    }

    private C7215s2 toValueTypes(String[] strArr) {
        C7216a newBuilder = C7215s2.newBuilder();
        C7207a newBuilder2 = C7206r2.newBuilder();
        for (String a : strArr) {
            newBuilder2.mo19186a(a);
            newBuilder.mo19189a(newBuilder2);
        }
        return (C7215s2) newBuilder.build();
    }

    public C12291g<C8135k0> bestFriendsHidden() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(new C6590q0(core), C6426e1.f16005a));
    }

    public C12291g<C8163m0> bestFriendsHide(C8149l0 l0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(l0Var, (TransformCallable) new C6429e4(core), (BuilderCreator<V>) C6473h7.f16052a));
    }

    public C12279e<C7219t0> bestFriendsStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6553n3(core), C6730x2.f16272a);
    }

    public C12279e<C8220p0> blockedUsersSync(C8202o0 o0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(o0Var, (TransformCallable) new C6416d4(core), (BuilderCreator<V>) C6713w.f16256a);
    }

    public C12279e<ZenlyProto$BrumpCountersResponse> brumpCounters(C8252r0 r0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(r0Var, (TransformCallable) new C6488i9(core), (BuilderCreator<V>) C6606r3.f16191a);
    }

    public C12279e<C7056b> brumpStream() {
        return RxProtoObservable.from(new C6457g6(this), C6433e8.f16012a);
    }

    public C12279e<C8288t0> bubblesStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6727x(core), C6479i0.f16058a);
    }

    public C12279e<String> cache(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservable(RxProtoObservable.from(asProtoValue, (TransformCallable) new C6598q8(core), (BuilderCreator<V>) C6440f2.f16019a)).mo36501i(C6371a6.f15949e);
    }

    public C12279e<ChatProto$ChatActivities> chatActivityStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6510k5(core), (BuilderCreator<V>) C6627sa.f16212a);
    }

    public C12279e<C8345w0> chatConversationMute(C8332v0 v0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(v0Var, (TransformCallable) new C6649u1(core), (BuilderCreator<V>) C6385b7.f15963a);
    }

    public C12279e<C7117i> chatConversationSync(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6466h0(core), (BuilderCreator<V>) C6517l.f16100a);
    }

    public C12279e<C8395z0> chatConversationUnMute(C8381y0 y0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(y0Var, (TransformCallable) new C6626s9(core), (BuilderCreator<V>) C6399c2.f15976a);
    }

    public C12279e<C7993b1> chatConversationUpdatesStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6524l6(core), (BuilderCreator<V>) C6415d3.f15994a);
    }

    public C12279e<C7176o> chatConversationsSearch(C7975a1 a1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(a1Var, (TransformCallable) new C6661v1(core), (BuilderCreator<V>) C6648u0.f16228a);
    }

    public C12279e<C7156m> chatCreateGroup(String[] strArr) {
        C7215s2 valueTypes = toValueTypes(strArr);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(valueTypes, (TransformCallable) new C6659v(core), (BuilderCreator<V>) C6614rb.f16199a);
    }

    public C7117i chatCreateLazyGroup(String[] strArr) {
        return (C7117i) fromRawPayload(this.gocore.chatCreateLazyGroup(toValueTypes(strArr).toByteArray()), C6517l.f16100a);
    }

    public C12279e<C8008c1> chatCursorRealtimeStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6746y6(core), (BuilderCreator<V>) C6490ib.f16071a);
    }

    public C12279e<C8042e1> chatDeleteFailedMessage(C8024d1 d1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(d1Var, (TransformCallable) new C6604r1(core), (BuilderCreator<V>) C6417d5.f15996a);
    }

    public C12279e<C8042e1> chatDeleteMessage(C8024d1 d1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(d1Var, (TransformCallable) new C6658ua(core), (BuilderCreator<V>) C6417d5.f15996a);
    }

    public C7117i chatGetConversationCache(String str) {
        return (C7117i) fromRawPayload(this.gocore.chatGetConversationCache(str), C6517l.f16100a);
    }

    public C12279e<C8074g1> chatGroupConversationAdd(String str, String[] strArr) {
        C8059a newBuilder = C8058f1.newBuilder();
        newBuilder.mo22064a(str);
        newBuilder.mo22063a((Iterable<String>) Arrays.asList(strArr));
        C8058f1 f1Var = (C8058f1) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(f1Var, (TransformCallable) new C6720w6(core), (BuilderCreator<V>) C6469h3.f16047a);
    }

    public C12279e<C7117i> chatGroupConversationKick(String str, String[] strArr) {
        C8091a newBuilder = C8090h1.newBuilder();
        newBuilder.mo22142a(str);
        newBuilder.mo22141a((Iterable<String>) Arrays.asList(strArr));
        C8090h1 h1Var = (C8090h1) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(h1Var, (TransformCallable) new C6528la(core), (BuilderCreator<V>) C6517l.f16100a);
    }

    public C12279e<C8121j1> chatGroupConversationUpdate(C8105i1 i1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(i1Var, (TransformCallable) new C6369a4(core), (BuilderCreator<V>) C6616s.f16201a);
    }

    public C7073d chatMessagesCache(String str) {
        return (C7073d) fromRawPayload(this.gocore.chatMessagesCache(str), C6559n9.f16144a);
    }

    public C12279e<C7073d> chatMessagesRealtime(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6613ra(core), (BuilderCreator<V>) C6559n9.f16144a);
    }

    public C12279e<C7073d> chatMessagesStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6647u(core), (BuilderCreator<V>) C6559n9.f16144a);
    }

    public C12279e<C7073d> chatOldMessagesServer(String str, String str2) {
        C8366a newBuilder = C8365x0.newBuilder();
        newBuilder.mo22331a(str);
        newBuilder.mo22332b(str2);
        C8365x0 x0Var = (C8365x0) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(x0Var, (TransformCallable) new C6738xa(core), (BuilderCreator<V>) C6559n9.f16144a);
    }

    public C12279e<C8151l1> chatReportMessage(C8137k1 k1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(k1Var, (TransformCallable) new C6605r2(core), (BuilderCreator<V>) C6601qb.f16186a);
    }

    public C12279e<C7117i> chatResolveGroupConversation(String[] strArr) {
        C7215s2 valueTypes = toValueTypes(strArr);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(valueTypes, (TransformCallable) new C6569o6(core), (BuilderCreator<V>) C6517l.f16100a);
    }

    public void chatSendActivity(C8301u0 u0Var) {
        this.gocore.chatSendActivity(u0Var.toByteArray());
    }

    public C12279e<C7224u> chatSendMessage(ZenlyProto$ChatSendMessageMultiRequest zenlyProto$ChatSendMessageMultiRequest) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.context.getFilesDir().getAbsolutePath());
        sb.append("/co.znly.core/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        String str = "bridge/media";
        sb3.append(str);
        File file = new File(sb3.toString());
        file.mkdirs();
        C7943a aVar = (C7943a) zenlyProto$ChatSendMessageMultiRequest.toBuilder();
        C6823a aVar2 = (C6823a) zenlyProto$ChatSendMessageMultiRequest.getMessage().toBuilder();
        for (int i = 0; i < aVar2.getContentCount(); i++) {
            C6825a aVar3 = (C6825a) aVar2.getContent(i).toBuilder();
            if (aVar3.getType() == C6826b.MEDIA && !aVar3.getMedia().getUploadFilepath().startsWith(str)) {
                File file2 = new File(aVar3.getMedia().getUploadFilepath());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(System.currentTimeMillis());
                sb4.append(".media");
                File file3 = new File(file, sb4.toString());
                file2.renameTo(file3);
                C7357c cVar = (C7357c) aVar3.getMedia().toBuilder();
                cVar.mo19259b(file3.getAbsolutePath().replace(sb2, ""));
                aVar3.mo17343a(cVar);
                aVar2.mo17337a(i, aVar3);
            }
        }
        aVar.mo21043a(aVar2);
        ZenlyProto$ChatSendMessageMultiRequest zenlyProto$ChatSendMessageMultiRequest2 = (ZenlyProto$ChatSendMessageMultiRequest) aVar.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(zenlyProto$ChatSendMessageMultiRequest2, (TransformCallable) new C6438f0(core), (BuilderCreator<V>) C6475h9.f16054a);
    }

    public C12279e<C7073d> chatSyncMessagesServer(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6758z6(core), (BuilderCreator<V>) C6559n9.f16144a);
    }

    public C12279e<Long> chatUnreadConversations() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservableLong(RxProtoObservable.from(new C6715w1(core), C6440f2.f16019a));
    }

    public C12279e<C7255y> chatUnreadCounters() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6507k2(core), C6523l5.f16106a);
    }

    public C12279e<C8241q1> chatUpdateCursor(C8222p1 p1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(p1Var, (TransformCallable) new C6625s8(core), (BuilderCreator<V>) C6741y1.f16283a);
    }

    public C12279e<C7262z> chatUserUnreadCounters() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6749y9(core), C6525l7.f16108a);
    }

    public boolean configurationOnboardingAllowAgeGatingRetry() {
        return this.gocore.configurationOnboardingAllowAgeGatingRetry();
    }

    public C12279e<C7052a2> contactsAlreadyOnZenlySearchBatch(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6619s2(core), (BuilderCreator<V>) C6520l2.f16103a);
    }

    public C12279e<StatesProto$ContactsAlreadyState> contactsAlreadyOnZenlyStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6575p(core), C6628sb.f16213a);
    }

    public C12279e<C7339i> contactsByPhoneNumber(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6476ha(core), (BuilderCreator<V>) C6419d7.f15998a);
    }

    public int contactsCount() {
        return (int) this.gocore.contactsCount();
    }

    public C12279e<C7206r2> contactsInvalidationTracker() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6542m6(core), C6440f2.f16019a);
    }

    public C7144l1 contactsRange(int i, int i2) {
        return (C7144l1) fromRawPayload(this.gocore.contactsRange((long) i, (long) i2), C6406c9.f15983a);
    }

    public C12279e<C7052a2> contactsSearchBatch(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6744y4(core), (BuilderCreator<V>) C6520l2.f16103a);
    }

    public C12279e<C7339i> contactsSearchStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6650u2(core), (BuilderCreator<V>) C6419d7.f15998a);
    }

    public C12279e<StatesProto$ContactsSoonState> contactsSoonOnZenlyStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6570o7(core), C6560na.f16145a);
    }

    public C12279e<C7339i> contactsStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6543m7(core), C6419d7.f15998a);
    }

    public C12279e<C8375x4> contactsSuggestedDismissUser(C7058b0 b0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(b0Var, (TransformCallable) new C6735x7(core), (BuilderCreator<V>) C6622s5.f16207a);
    }

    public C12279e<StatesProto$ContactsSuggestionsState> contactsSuggestionsStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6521l3(core), C6549n.f16134a);
    }

    public C12279e<C8397z1> debugUser(C8383y1 y1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(y1Var, (TransformCallable) new C6596q6(core), (BuilderCreator<V>) C6557n7.f16142a);
    }

    public C12291g<C7236v0> descendantUsers() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(new C6654u6(core), C6558n8.f16143a));
    }

    public C12291g<C7995b2> descendantWorldRank(C7977a2 a2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(a2Var, (TransformCallable) new C6477hb(core), (BuilderCreator<V>) C6593q3.f16178a));
    }

    public C6915b descendantsPreferences() {
        return (C6915b) fromRawPayload(this.gocore.rawDescendantsPreferences(), C6722w8.f16265a);
    }

    public C12279e<Long> deviceCountryCode() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12279e.m32616a((Callable<? extends T>) new C6382b4<Object>(core));
    }

    public C12279e<String> devicePhoneNumber() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12279e.m32616a((Callable<? extends T>) new C6387b9<Object>(core));
    }

    public void deviceSetAppsflyerId(String str) {
        this.gocore.deviceSetAppsflyerId(str);
    }

    public void discoverV1Interest(C7264z0 z0Var) {
        this.gocore.discoverV1Interest(z0Var.toByteArray());
    }

    public C6770e experimentFlags() {
        byte[] experimentFlags = this.gocore.experimentFlags();
        if (experimentFlags == null) {
            return C6770e.getDefaultInstance();
        }
        return (C6770e) fromRawPayload(experimentFlags, C6640t5.f16221a);
    }

    public C6781g featureFlags() {
        byte[] featureFlags = this.gocore.featureFlags();
        if (featureFlags == null) {
            return C6781g.getDefaultInstance();
        }
        return (C6781g) fromRawPayload(featureFlags, C6423db.f16002a);
    }

    public void fogOfWarSetGridDepthMax(int i) {
        this.gocore.setFogOfWarGridDepthMax((long) i);
    }

    public void fogOfWarSetQueryLevelMax(int i) {
        this.gocore.setFogOfWarQueryLevelMax((long) i);
    }

    public VectorTileProto$Tile fogOfWarTile(C7228u1 u1Var) {
        return (VectorTileProto$Tile) fromRawPayload(this.gocore.getFogOfWarTile(u1Var.getX(), u1Var.getY(), u1Var.getZoom()), C6497j5.f16080a);
    }

    public VectorTileProto$Tile[] fogOfWarTiles(C7228u1[] u1VarArr) {
        VectorTileProto$Tile[] vectorTileProto$TileArr = new VectorTileProto$Tile[u1VarArr.length];
        for (int i = 0; i < u1VarArr.length; i++) {
            vectorTileProto$TileArr[i] = fogOfWarTile(u1VarArr[i]);
        }
        return vectorTileProto$TileArr;
    }

    public C12279e<C8060f2> footstepsContextualLabeling(C8044e2 e2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(e2Var, (TransformCallable) new C6527l9(core), (BuilderCreator<V>) C6760z8.f16302a);
    }

    public C12279e<C7238v1> footstepsFogOfWarUpdate() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6589q(core), C6576p0.f16161a);
    }

    public C12279e<C8092h2> footstepsLinkViewsStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6561nb(core), C6405c8.f15982a);
    }

    public C12279e<C8123j2> footstepsLocalitiesAt(C8107i2 i2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(i2Var, (TransformCallable) new C6600qa(core), (BuilderCreator<V>) C6454g3.f16033a);
    }

    public C12279e<Boolean> footstepsOnboardingDone() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12279e.m32616a((Callable<? extends T>) new C6378b0<Object>(core));
    }

    public C12279e<C8153l2> footstepsRecordCacheGet(C8139k2 k2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(k2Var, (TransformCallable) new C6516kb(core), (BuilderCreator<V>) C6612r9.f16197a);
    }

    public C12279e<C8153l2> footstepsRecordState(C8139k2 k2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(k2Var, (TransformCallable) new C6597q7(core), (BuilderCreator<V>) C6612r9.f16197a);
    }

    public C12279e<Boolean> footstepsStarted() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12279e.m32616a((Callable<? extends T>) new C6374a9<Object>(core));
    }

    public C12279e<C8076g2> footstepsUpdateHistorical() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6592q2(core), C6375aa.f15953a);
    }

    public C8206o2 footstepsVisitedLocalitiesCacheGet() {
        return (C8206o2) fromRawPayload(this.gocore.footstepsVisitedLocalitiesRawCacheGet(), C6468h2.f16046a);
    }

    public C12279e<C8206o2> footstepsVisitedLocalitiesState() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6396c(core), C6468h2.f16046a);
    }

    public C12279e<C8183n2> footstepsVisitedShapes(C8167m2 m2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(m2Var, (TransformCallable) new C6583p7(core), (BuilderCreator<V>) C6502ja.f16085a);
    }

    public C12279e<C8224p2> footstepsWebGet() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6450g(core), C6537m1.f16123a);
    }

    public C12279e<C8256r2> footstepsWebSet(C8243q2 q2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(q2Var, (TransformCallable) new C6503jb(core), (BuilderCreator<V>) C6499j7.f16082a);
    }

    public C12279e<C8292t2> friendDelete(C8271s2 s2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(s2Var, (TransformCallable) new C6493j1(core), (BuilderCreator<V>) C6653u5.f16233a);
    }

    public C12279e<C8336v2> friendGhost(C8305u2 u2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(u2Var, (TransformCallable) new C6425e0(core), (BuilderCreator<V>) C6437f.f16016a);
    }

    public C12279e<C8385y2> friendRequestCreate(C8369x2 x2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(x2Var, (TransformCallable) new C6458g7(core), (BuilderCreator<V>) C6643t8.f16224a);
    }

    public C12279e<C7979a3> friendRequestRespond(C8399z2 z2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(z2Var, (TransformCallable) new C6474h8(core), (BuilderCreator<V>) C6540m4.f16126a);
    }

    public C12279e<ZenlyProto$FriendRequestWithUser> friendRequestsSearchStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6536m0(core), (BuilderCreator<V>) C6481i2.f16060a);
    }

    public C12279e<StatesProto$FriendRequestsState> friendRequestsStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6639t4(core), C6398c1.f15975a);
    }

    public C12279e<C8030d3> friendSubscribe(C8012c3 c3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(c3Var, (TransformCallable) new C6436eb(core), (BuilderCreator<V>) C6729x1.f16271a);
    }

    public C12279e<UserProto$User> friendsSearchStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6750ya(core), (BuilderCreator<V>) C6736x8.f16278a);
    }

    public C12279e<StatesProto$FriendsState> friendsStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6526l8(core), C6480i1.f16059a);
    }

    public C12279e<StatesProto$FriendshipsState> friendshipsStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6754z2(core), C6453g2.f16032a);
    }

    public C12279e<TypesProto$Gatherings> gatheringsStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6509k4(core), C6365a0.f15943a);
    }

    public C12279e<C7911b> geoReverseGeocode(double d, double d2) {
        C6951a newBuilder = C6950b0.newBuilder();
        newBuilder.setLatitude(d);
        newBuilder.setLongitude(d2);
        C6950b0 b0Var = (C6950b0) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(b0Var, (TransformCallable) new C6435ea(core), (BuilderCreator<V>) C6621s4.f16206a);
    }

    public C12279e<C7911b> geoReverseGeocodeAdminAreas(double d, double d2) {
        C6951a newBuilder = C6950b0.newBuilder();
        newBuilder.setLatitude(d);
        newBuilder.setLongitude(d2);
        C6950b0 b0Var = (C6950b0) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(b0Var, (TransformCallable) new C6380b2(core), (BuilderCreator<V>) C6621s4.f16206a);
    }

    public C12279e<String> geoReverseGeocodeFormattedAddress(double d, double d2) {
        C6951a newBuilder = C6950b0.newBuilder();
        newBuilder.setLatitude(d);
        newBuilder.setLongitude(d2);
        C6950b0 b0Var = (C6950b0) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservable(RxProtoObservable.from(b0Var, (TransformCallable) new C6657u9(core), (BuilderCreator<V>) C6440f2.f16019a));
    }

    public C12279e<String> geoReverseGeocodeStreet(double d, double d2) {
        C6951a newBuilder = C6950b0.newBuilder();
        newBuilder.setLatitude(d);
        newBuilder.setLongitude(d2);
        C6950b0 b0Var = (C6950b0) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservable(RxProtoObservable.from(b0Var, (TransformCallable) new C6539m3(core), (BuilderCreator<V>) C6440f2.f16019a));
    }

    public C12279e<C7060b1> geoRouteETA(C6950b0 b0Var, C6950b0 b0Var2, int i) {
        C8101a newBuilder = C8100h6.newBuilder();
        newBuilder.mo22147b(b0Var);
        newBuilder.mo22145a(b0Var2);
        newBuilder.mo22146a(C7921g.m18962a(i));
        C8100h6 h6Var = (C8100h6) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(h6Var, (TransformCallable) new C6424e(core), (BuilderCreator<V>) C6460g9.f16039a);
    }

    public C12279e<C7088e1> geoRoutePolyline(C6950b0 b0Var, C6950b0 b0Var2, int i) {
        C8101a newBuilder = C8100h6.newBuilder();
        newBuilder.mo22147b(b0Var);
        newBuilder.mo22145a(b0Var2);
        newBuilder.mo22146a(C7921g.m18962a(i));
        C8100h6 h6Var = (C8100h6) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(h6Var, (TransformCallable) new C6471h5(core), (BuilderCreator<V>) C6587pb.f16172a);
    }

    public C12279e<GeoProto$RouteUserETAResponse> geoRouteUserETA(String[] strArr, int[] iArr, boolean z) {
        C7079b newBuilder = C7077d1.newBuilder();
        newBuilder.mo19118a((Iterable<String>) Arrays.asList(strArr));
        for (int a : iArr) {
            newBuilder.mo19117a(C7921g.m18962a(a));
        }
        newBuilder.mo19119a(z);
        C7077d1 d1Var = (C7077d1) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(d1Var, (TransformCallable) new C6634t(core), (BuilderCreator<V>) C6551n1.f16136a);
    }

    public C12279e<ZenlyProto$GetAnnouncementsResponse> getAnnouncements(C8046e3 e3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(e3Var, (TransformCallable) new C6545m9(core), (BuilderCreator<V>) C6511k6.f16094a);
    }

    public String getMapBoxKey() {
        return Zenlygocore.mapboxKey();
    }

    public C7168n inboxCache() {
        return (C7168n) fromRawPayload(this.gocore.inboxCache(), C6761z9.f16303a);
    }

    public C12279e<C8078g3> inboxHide(String str) {
        C8063a newBuilder = C8062f3.newBuilder();
        newBuilder.mo22065a(str);
        C8062f3 f3Var = (C8062f3) newBuilder.build();
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(f3Var, (TransformCallable) new C6407ca(core), (BuilderCreator<V>) C6381b3.f15959a);
    }

    public C12279e<C7125j> inboxNextPage() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6562o(core), C6663v3.f16243a);
    }

    public C12279e<C7192q> inboxStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6404c7(core), C6599q9.f16184a);
    }

    public C12279e<Boolean> isSyncTimeout() {
        return C12279e.m32616a((Callable<? extends T>) new C6665v5<Object>(this));
    }

    public void log(C7154c cVar, String str, Map<String, String> map) {
        C7152a newBuilder = C7151b.newBuilder();
        newBuilder.mo19141a(cVar);
        newBuilder.mo19142a(str);
        if (map != null) {
            newBuilder.mo19143a(map);
        }
        try {
            this.gocore.log(((C7151b) newBuilder.build()).toByteArray());
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
    }

    public void logDebug(String str) {
        logDebug(str, null);
    }

    public void logError(String str) {
        logError(str, null);
    }

    public void logFatal(String str) {
        logFatal(str, null);
    }

    public void logInfo(String str) {
        logInfo(str, null);
    }

    public void logPanic(String str) {
        logPanic(str, null);
    }

    public void logSetLevel(int i) {
        this.gocore.logSetLevel(i);
    }

    public void logWarn(String str) {
        logWarn(str, null);
    }

    public void mapSetViewport(C12279e<ZenlyProto$TrackingContextSubscribeStreamRequest> eVar) {
        C12279e a = eVar.mo36420a(200, TimeUnit.MILLISECONDS, this.scheduler);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        RxProtoObservable.subscribe(a, new C6538m2(core));
    }

    public C12279e<C7190p2> mapSpinnersStream(C12279e<C7272d0> eVar) {
        C12279e i = eVar.mo36420a(200, TimeUnit.MILLISECONDS, this.scheduler).mo36501i(C6431e6.f16010e);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(i, (InputOutputCallable) new C6494j2(core), (BuilderCreator<V>) C6376ab.f15954a);
    }

    public C12279e<C7222t2> mapViewportStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6367a2(core), C6383b5.f15961a);
    }

    public C12279e<C8109i3> markAnnouncementAsRead(C8094h3 h3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(h3Var, (TransformCallable) new C6411d(core), (BuilderCreator<V>) C6489ia.f16070a);
    }

    public C12279e<String> mustUpgradeStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservable(RxProtoObservable.from(new C6485i6(core), C6440f2.f16019a));
    }

    public C12279e<Integer> networkStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservableInteger(RxProtoObservable.from(new C6529lb(core), C6440f2.f16019a));
    }

    public C12291g<C8185n3> nightsHideLocation(C8169m3 m3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(m3Var, (TransformCallable) new C6556n6(core), (BuilderCreator<V>) C6422da.f16001a));
    }

    public C12291g<C8208o3> nightsLocation() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(new C6504k(core), C6370a5.f15948a));
    }

    public C12291g<C8245q3> nightsStay(C8226p3 p3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(p3Var, (TransformCallable) new C6645ta(core), (BuilderCreator<V>) C6544m8.f16130a));
    }

    public C12291g<Object> nightsTimeline() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(new C6420d8(core), C6595q5.f16180a));
    }

    public C12279e<StatesProto$ContactsAlreadyState> onboardingContactsAlready() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6541m5(core), C6628sb.f16213a);
    }

    public C12279e<StatesProto$ContactsSoonState> onboardingContactsSoon() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6447f9(core), C6560na.f16145a);
    }

    public C12279e<StatesProto$ContactsSuggestionsState> onboardingContactsSuggestions() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6492j0(core), C6549n.f16134a);
    }

    public C12291g<C8294t3> personalPlaces() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(new C6379b1(core), C6748y8.f16290a));
    }

    public C7123i2 phoneNumberGetRegion(String str) {
        return (C7123i2) fromRawPayload(this.gocore.phoneNumberGetRegion(str), C6580p4.f16165a);
    }

    public Boolean phoneNumberIsViable(String str) {
        return Boolean.valueOf(this.gocore.phoneNumberIsViable(str));
    }

    public String phoneNumberNormalizeE164(String str) {
        return this.gocore.phoneNumberNormalize(str, 0);
    }

    public String phoneNumberNormalizeInternational(String str) {
        return this.gocore.phoneNumberNormalize(str, 1);
    }

    public String phoneNumberNormalizeNational(String str) {
        return this.gocore.phoneNumberNormalize(str, 2);
    }

    public C12279e<C7123i2> phoneNumberSupportedRegions() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6651u3(core), C6580p4.f16165a);
    }

    public C12279e<C7129j1> pinContextStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6635t0(core), C6368a3.f15946a);
    }

    public C12279e<C8338v3> pingManifestStream() {
        C7206r2 asProtoValue = asProtoValue("");
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6567o4(core), (BuilderCreator<V>) C6364a.f15942a);
    }

    public C12279e<C8338v3> pingManifestStreamForTarget(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6567o4(core), (BuilderCreator<V>) C6364a.f15942a);
    }

    public C12279e<C7184p> pingMostSentEmoji(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6441f3(core), (BuilderCreator<V>) C6603r0.f16188a);
    }

    public C12279e<PingProto$Ping2> pingRead(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6546ma(core), (BuilderCreator<V>) C6366a1.f15944a);
    }

    public C12279e<C8401z3> pingSend(C8387y3 y3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(y3Var, (TransformCallable) new C6756z4(core), (BuilderCreator<V>) C6668v8.f16248a);
    }

    public C12279e<C7999b4> pingStatsStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6607r4(core), (BuilderCreator<V>) C6753z1.f16295a);
    }

    public C12279e<ZenlyProto$PushNotificationCreateResponse> pushNotificationCreate(C8014c4 c4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(c4Var, (TransformCallable) new C6550n0(core), (BuilderCreator<V>) C6452g1.f16031a);
    }

    public C12279e<C7857w> pushNotificationsStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6666v6(core), C6552n2.f16137a);
    }

    public void recentItemInteract(C7146l2 l2Var) {
        this.gocore.recentItemInteract(l2Var.toByteArray());
    }

    public C12279e<StatesProto$RecentsState> recentlySearchedStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6747y7(core), C6577p1.f16162a);
    }

    public C12279e<StatesProto$RecentsState> recentlyViewedStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6662v2(core), C6577p1.f16162a);
    }

    public C12291g<C8048e4> recoAcknowledgePotentialMatch(C8032d4 d4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(d4Var, (TransformCallable) new C6377b(core), (BuilderCreator<V>) C6644t9.f16225a));
    }

    public C12291g<C8080g4> recoAcknowledgeRecommendation(C8064f4 f4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(f4Var, (TransformCallable) new C6568o5(core), (BuilderCreator<V>) C6731x3.f16273a));
    }

    public C12291g<C7142l0> recoPotentialMatches(C7135k0 k0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(k0Var, (TransformCallable) new C6610r7(core), (BuilderCreator<V>) C6372a7.f15950a));
    }

    public C12291g<C8111i4> recoSendRecommendation(C8096h4 h4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(h4Var, (TransformCallable) new C6564o1(core), (BuilderCreator<V>) C6623s6.f16208a));
    }

    public String reportDump(String str) throws Exception {
        return Zenlygocore.reportDump(str);
    }

    public C12279e<C8157l4> requestMedia(C8143k4 k4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(k4Var, (TransformCallable) new C6723w9(core), (BuilderCreator<V>) C6591q1.f16176a);
    }

    public C12279e<Integer> requestMediaRead(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservableInteger(RxProtoObservable.from(asProtoValue, (TransformCallable) new C6637t2(core), (BuilderCreator<V>) C6440f2.f16019a));
    }

    public C12291g<C8034d5> resetMutualLove(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(asProtoValue, (TransformCallable) new C6397c0(core), (BuilderCreator<V>) C6565o2.f16150a));
    }

    public void resetSyncTimeout() {
        ZenlyCoreSyncPrefs.get(this.context).applySync();
    }

    public C12279e<C8003b6> resolveUserUsername(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6638t3(core), (BuilderCreator<V>) C6506k1.f16089a);
    }

    public C12279e<C8290t1> reverseGeoCodeViewports(C8268s1 s1Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(s1Var, (TransformCallable) new C6484i5(core), (BuilderCreator<V>) C6482i3.f16061a);
    }

    public C12279e<Integer> serverStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservableInteger(RxProtoObservable.from(new C6518l0(core), C6440f2.f16019a));
    }

    public C12279e<C7174n2> sessionCacheGet() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6667v7(core), C6402c5.f15979a);
    }

    public C12279e<C7174n2> sessionCacheSet(C7174n2 n2Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(n2Var, (TransformCallable) new C6611r8(core), (BuilderCreator<V>) C6402c5.f15979a);
    }

    public C12279e<C8228p4> sessionCreate(ZenlyProto$SessionCreateRequest zenlyProto$SessionCreateRequest) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(zenlyProto$SessionCreateRequest, (TransformCallable) new C6581p5(core), (BuilderCreator<V>) C6759z7.f16301a);
    }

    public C12279e<C7402n2> sessionGet() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6752z0(core), C6432e7.f16011a);
    }

    public void sessionLogout() {
        this.gocore.sessionLogout();
    }

    public C12279e<C8260r4> sessionRequestCall(C8247q4 q4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(q4Var, (TransformCallable) new C6514k9(core), (BuilderCreator<V>) C6547mb.f16133a);
    }

    public C12279e<C8309u4> sessionVerify(C8296t4 t4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(t4Var, (TransformCallable) new C6388ba(core), (BuilderCreator<V>) C6739y.f16281a);
    }

    public void setDescendantsPreferences(C6915b bVar) {
        this.gocore.setDescendantsPreferences(bVar.toByteArray());
    }

    public void setFootstepsOnboardingDone(boolean z) {
        this.gocore.setFootstepsOnboardingDone(z);
    }

    public void setFootstepsStarted(boolean z) {
        this.gocore.setFootstepsStarted(z);
    }

    public C12279e<C8408b> sleepingStateStream() {
        return RxProtoObservable.from(new C6403c6(this), C6505k0.f16088a);
    }

    public void startDebugServer() {
        this.gocore.startDebugServer();
    }

    public Date timeCorrect(Date date) {
        return toDate(this.gocore.timeCorrect(toUnixNano(date)));
    }

    public Date timeNow() {
        return new Date(this.gocore.timeNow() / 1000000);
    }

    public long timeSince(Date date) {
        return this.gocore.timeSince(toUnixNano(date)) / 1000000;
    }

    public C8001b5 timeTogetherCacheGet() {
        return (C8001b5) fromRawPayload(this.gocore.timeTogetherRawCacheGet(), C6456g5.f16035a);
    }

    public C12279e<TimeTogetherProto$Tst> timeTogetherFriendState(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6571o8(core), (BuilderCreator<V>) C6582p6.f16167a);
    }

    public C12291g<C8389y4> timeTogetherMutualLoveHidden() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(new C6573oa(core), C6442f4.f16021a));
    }

    public C12291g<C7983a5> timeTogetherMutualLoveHide(C8403z4 z4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(z4Var, (TransformCallable) new C6751z(core), (BuilderCreator<V>) C6660v0.f16240a));
    }

    public C12279e<C8001b5> timeTogetherState() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6743y3(core), C6456g5.f16035a);
    }

    public String timeZoneAtLocation(double d, double d2) {
        return this.gocore.timeZoneAtLocation(d, d2);
    }

    public C12279e<StatesProto$TopFriendsState> topFriendsStateStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6732x4(core), C6718w4.f16261a);
    }

    public C12279e<TrackingContextProto$TrackingContext> trackingContextStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6414d2(core), C6389bb.f15967a);
    }

    public C12279e<UICacheProto$UiCacheEmojiPackUnlock> uiCacheEmojiPackUnlockGet() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6594q4(core), C6513k8.f16096a);
    }

    public C12279e<UICacheProto$UiCacheEmojiPackUnlock> uiCacheEmojiPackUnlockSet(UICacheProto$UiCacheEmojiPackUnlock uICacheProto$UiCacheEmojiPackUnlock) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(uICacheProto$UiCacheEmojiPackUnlock, (TransformCallable) new C6445f7(core), (BuilderCreator<V>) C6513k8.f16096a);
    }

    public C12291g<C8066f5> universitiesCampaignsSignup(C8050e5 e5Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(e5Var, (TransformCallable) new C6762za(core), (BuilderCreator<V>) C6515ka.f16098a));
    }

    public C12279e<C8098h5> universitiesCampaignsSubscription(C8082g5 g5Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(g5Var, (TransformCallable) new C6579p3(core), (BuilderCreator<V>) C6737x9.f16279a);
    }

    public C12279e<C7086e0> userActionsFetchStream(C7094f0 f0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(f0Var, (TransformCallable) new C6462gb(core), (BuilderCreator<V>) C6554n4.f16139a);
    }

    public C12291g<C7111h0> userActionsUpdate(C7101g0 g0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(g0Var, (TransformCallable) new C6501j9(core), (BuilderCreator<V>) C6512k7.f16095a));
    }

    public C12279e<C8159l5> userAnnotationState(C8145k5 k5Var) {
        return RxProtoObservable.from(k5Var, (TransformCallable) new C6719w5(this), (BuilderCreator<V>) C6408cb.f15985a);
    }

    public C12279e<C8175m5> userAnnotationStream() {
        return RxProtoObservable.from(new C6733x5(this), C6669v9.f16249a);
    }

    public C12279e<C8214o5> userBlock(C8189n5 n5Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(n5Var, (TransformCallable) new C6574ob(core), (BuilderCreator<V>) C6584p8.f16169a);
    }

    public C12279e<C7458s> userDeviceStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6585p9(core), C6624s7.f16209a);
    }

    public C12279e<C8230p5> userEngagement() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6618s1(core), C6555n5.f16140a);
    }

    @Deprecated
    public C12279e<C8010c2> userFriendsDevicesStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6400c3(core), C6717w3.f16260a);
    }

    public C12279e<C7097f2> userHeadingStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6478i(core), C6636t1.f16217a);
    }

    public C12279e<C7105g2> userLocationStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6641t6(core), C6566o3.f16151a);
    }

    public UserProto$User userMeCache() {
        return (UserProto$User) fromRawPayload(this.gocore.rawUserMeCache(), C6736x8.f16278a);
    }

    public C12279e<UserProto$User> userMeStream() {
        return this._userMeStream;
    }

    public C12279e<C7243w0> userMeTraits() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6451g0(core), C6620s3.f16205a);
    }

    public C12291g<C7186p0> userMonitoringDelete(C7178o0 o0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(o0Var, (TransformCallable) new C6461ga(core), (BuilderCreator<V>) C6572o9.f16157a));
    }

    public C12291g<C7170n0> userMonitoringExist(C7178o0 o0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(o0Var, (TransformCallable) new C6535m(core), (BuilderCreator<V>) C6439f1.f16018a));
    }

    public C12291g<C7186p0> userMonitoringUpsert(C7196q0 q0Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return C12291g.m32759a((ObservableSource<? extends T>) RxProtoObservable.from(q0Var, (TransformCallable) new C6495j3(core), (BuilderCreator<V>) C6572o9.f16157a));
    }

    public C12279e<C8273s3> userNotificationsStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6724wa(core), C6427e2.f16006a);
    }

    public C12279e<C8235c> userPlace(C8233b bVar) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(bVar, (TransformCallable) new C6455g4(core), (BuilderCreator<V>) C6491j.f16072a);
    }

    public C12279e<C7172n1> userPlacesState() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6373a8(core), C6459g8.f16038a);
    }

    @Deprecated
    public C12279e<C7286e2> userPlacesStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6487i8(core), C6664v4.f16244a);
    }

    public C12279e<C7180o1> userPublicFriendsState(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6386b8(core), (BuilderCreator<V>) C6721w7.f16264a);
    }

    @Deprecated
    public C12279e<C7997b3> userPublicFriendsStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6401c4(core), (BuilderCreator<V>) C6586pa.f16171a);
    }

    public C12279e<C7159m1> userPublicMutualFriendsState(String str) {
        return RxProtoObservable.from(asProtoValue(str), (TransformCallable) new C6745y5(this), (BuilderCreator<V>) C6563o0.f16148a);
    }

    public C12279e<UserProto$User> userPublicStream(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6465h(core), (BuilderCreator<V>) C6736x8.f16278a);
    }

    public C12279e<C8279s5> userReport(C8262r5 r5Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(r5Var, (TransformCallable) new C6421d9(core), (BuilderCreator<V>) C6734x6.f16276a);
    }

    public C12279e<C8187n4> userRequest(C8171m4 m4Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(m4Var, (TransformCallable) new C6500j8(core), (BuilderCreator<V>) C6486i7.f16067a);
    }

    public C12279e<C8298t5> userShouldValidateToS() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6656u8(core), C6755z3.f16297a);
    }

    public C12279e<C8342v5> userStartDeletionProcess() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6578p2(core), C6608r5.f16193a);
    }

    public C12279e<C8361w5> userTodayWatchersStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6449fb(core), C6728x0.f16270a);
    }

    public C12279e<C8377x5> userUnblock(String str) {
        C7206r2 asProtoValue = asProtoValue(str);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(asProtoValue, (TransformCallable) new C6609r6(core), (BuilderCreator<V>) C6740y0.f16282a);
    }

    public C12279e<UserProto$User> userUpdate(C8141k3 k3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(k3Var, (TransformCallable) new C6716w2(core), (BuilderCreator<V>) C6736x8.f16278a);
    }

    public C12279e<Double> userUpdateAvatar(byte[] bArr) {
        C7206r2 asProtoValue = asProtoValue(bArr);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservableDouble(RxProtoObservable.from(asProtoValue, (TransformCallable) new C6602r(core), (BuilderCreator<V>) C6440f2.f16019a));
    }

    public C12279e<C8155l3> userUpdateWithErrors(C8141k3 k3Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(k3Var, (TransformCallable) new C6617s0(core), (BuilderCreator<V>) C6443f5.f16022a);
    }

    public C12279e<C8405z5> userVisitPointsRealtimeStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6652u4(core), C6413d1.f15992a);
    }

    public C12279e<ZenlyProto$UserVisitPointResponse> userVisitPointsState(C8391y5 y5Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(y5Var, (TransformCallable) new C6655u7(core), (BuilderCreator<V>) C6714w0.f16257a);
    }

    public C12279e<String> usernameGenerate() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return fromProtoObservable(RxProtoObservable.from(new C6742y2(core), C6440f2.f16019a));
    }

    public String version() {
        return this.gocore.version();
    }

    public C12279e<C8052e6> weather(C8036d6 d6Var) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(d6Var, (TransformCallable) new C6508k3(core), (BuilderCreator<V>) C6446f8.f16025a);
    }

    public C12279e<C8052e6> weatherStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6498j6(core), C6446f8.f16025a);
    }

    public C12279e<C7973a0> zendeskCreateTicket(C8393z zVar) {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(zVar, (TransformCallable) new C6412d0(core), (BuilderCreator<V>) C6642t7.f16223a);
    }

    public C12279e<C8040e0> zendeskGetFeedbackCategories() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6428e3(core), C6448fa.f16027a);
    }

    public String zendeskGetJWTToken() {
        return this.gocore.zendeskGetJWTToken();
    }

    public C12279e<C8072g0> zendeskGetProblemCategories() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6522l4(core), C6670va.f16250a);
    }

    public void zendeskSeenTickets() {
        this.gocore.zendeskSeenTickets();
    }

    public C12279e<C7082d3> zendeskUnseenStatusRealtimeStream() {
        Core core = this.gocore;
        Objects.requireNonNull(core);
        return RxProtoObservable.from(new C6467h1(core), C6519l1.f16102a);
    }

    private ZenlyCore(Context context2, String str, NotificationProvider notificationProvider, boolean z) throws Exception {
        try {
            ZenlyCoreSyncAdapter.createZenlyAccount(context2);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        C9447g.m22878a(context2);
        PushProvider.initialize(context2);
        LocationService.setNotificationProvider(notificationProvider);
        this.handlerThread = new HandlerThread("co.znly.core.thread", 0);
        this.handlerThread.start();
        looper = this.handlerThread.getLooper();
        this.scheduler = C12295a.m32803a(looper);
        this.context = context2;
        String str2 = "";
        this.gocore = Zenlygocore.newCore(str2, str2, str2, z, true);
        Core core = this.gocore;
        Objects.requireNonNull(core);
        this._userMeStream = RxProtoObservable.from(new C6430e5(core), C6736x8.f16278a).mo36475c(1).mo36947s();
    }

    /* renamed from: a */
    public /* synthetic */ RxContext mo14248a(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.gocore.userAnnotationState(bArr, rxProtoObserver);
    }

    /* renamed from: b */
    public /* synthetic */ RxContext mo14250b(RxProtoObserver rxProtoObserver) {
        return this.gocore.sleepingStateStream(rxProtoObserver);
    }

    /* renamed from: c */
    public /* synthetic */ RxContext mo14259c(RxProtoObserver rxProtoObserver) {
        return this.gocore.userAnnotationStream(rxProtoObserver);
    }

    public void logDebug(String str, Map<String, String> map) {
        log(C7154c.LEVEL_DEBUG, str, map);
    }

    public void logError(String str, Map<String, String> map) {
        log(C7154c.LEVEL_ERROR, str, map);
    }

    public void logFatal(String str, Map<String, String> map) {
        log(C7154c.LEVEL_FATAL, str, map);
    }

    public void logInfo(String str, Map<String, String> map) {
        log(C7154c.LEVEL_INFO, str, map);
    }

    public void logPanic(String str, Map<String, String> map) {
        log(C7154c.LEVEL_PANIC, str, map);
    }

    public void logWarn(String str, Map<String, String> map) {
        log(C7154c.LEVEL_WARN, str, map);
    }

    /* renamed from: a */
    public /* synthetic */ RxContext mo14247a(RxProtoObserver rxProtoObserver) {
        return this.gocore.brumpStream(rxProtoObserver);
    }

    /* renamed from: b */
    public /* synthetic */ RxContext mo14251b(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.gocore.userPublicMutualFriendsState(bArr, rxProtoObserver);
    }

    /* renamed from: a */
    static /* synthetic */ String m17494a(String str) throws Exception {
        if (!str.startsWith(Constants.URL_PATH_DELIMITER)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("file://");
        sb.append(str);
        return sb.toString();
    }

    private C7206r2 asProtoValue(long j) {
        C7207a newBuilder = C7206r2.newBuilder();
        newBuilder.mo19184a(j);
        return (C7206r2) newBuilder.build();
    }

    /* renamed from: a */
    static /* synthetic */ ZenlyProto$TrackingContextSubscribeStreamRequest m17492a(C7272d0 d0Var) throws Exception {
        C7961a newBuilder = ZenlyProto$TrackingContextSubscribeStreamRequest.newBuilder();
        newBuilder.mo21821a(d0Var);
        return (ZenlyProto$TrackingContextSubscribeStreamRequest) newBuilder.build();
    }

    private C7206r2 asProtoValue(int i) {
        C7207a newBuilder = C7206r2.newBuilder();
        newBuilder.mo19183a(i);
        return (C7206r2) newBuilder.build();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14249a() throws Exception {
        return Boolean.valueOf(ZenlyCoreSyncPrefs.get(this.context).isSyncTimeout());
    }

    private C7206r2 asProtoValue(boolean z) {
        C7207a newBuilder = C7206r2.newBuilder();
        newBuilder.mo19187a(z);
        return (C7206r2) newBuilder.build();
    }

    private C7206r2 asProtoValue(byte[] bArr) {
        C7207a newBuilder = C7206r2.newBuilder();
        newBuilder.mo19185a(ByteString.copyFrom(bArr));
        return (C7206r2) newBuilder.build();
    }
}
