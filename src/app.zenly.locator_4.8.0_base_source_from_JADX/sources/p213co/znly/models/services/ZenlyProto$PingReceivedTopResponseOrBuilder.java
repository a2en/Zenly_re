package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$EmojiTop;

/* renamed from: co.znly.models.services.ZenlyProto$PingReceivedTopResponseOrBuilder */
public interface ZenlyProto$PingReceivedTopResponseOrBuilder extends MessageLiteOrBuilder {
    PingProto$EmojiTop getTop();

    long getTotal();

    boolean hasTop();
}
