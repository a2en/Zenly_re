package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;
import p213co.znly.models.bubble.C6971b;

/* renamed from: co.znly.models.services.ZenlyProto$BubbleStreamEventOrBuilder */
public interface ZenlyProto$BubbleStreamEventOrBuilder extends MessageLiteOrBuilder {
    C6971b getBubble();

    C7280e getOp();

    int getOpValue();

    boolean hasBubble();
}
