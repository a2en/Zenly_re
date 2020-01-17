package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.MotionProto$TrajectoriesOrBuilder */
public interface MotionProto$TrajectoriesOrBuilder extends MessageLiteOrBuilder {
    C7515z0 getTrajectories(int i);

    int getTrajectoriesCount();

    List<C7515z0> getTrajectoriesList();

    String getUserUuid();

    ByteString getUserUuidBytes();
}
