package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.CoreRecommendationsProto$RecoPotentialMatchesResponseOrBuilder */
public interface CoreRecommendationsProto$RecoPotentialMatchesResponseOrBuilder extends MessageLiteOrBuilder {
    C7127j0 getPotentialMatches(int i);

    int getPotentialMatchesCount();

    List<C7127j0> getPotentialMatchesList();

    boolean getShouldMakeRecommendations();
}
