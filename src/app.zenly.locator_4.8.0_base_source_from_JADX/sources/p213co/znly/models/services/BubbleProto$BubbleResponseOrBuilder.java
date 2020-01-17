package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.bubble.C6971b;

/* renamed from: co.znly.models.services.BubbleProto$BubbleResponseOrBuilder */
public interface BubbleProto$BubbleResponseOrBuilder extends MessageLiteOrBuilder {
    C6971b getBubbles(int i);

    int getBubblesCount();

    List<C6971b> getBubblesList();
}
