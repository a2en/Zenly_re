package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.recommendations.C7890d;

/* renamed from: co.znly.models.services.ZenlyProto$RecoPotentialMatchesResponseOrBuilder */
public interface ZenlyProto$RecoPotentialMatchesResponseOrBuilder extends MessageLiteOrBuilder {
    C7890d getPotentialMatches(int i);

    int getPotentialMatchesCount();

    List<C7890d> getPotentialMatchesList();

    boolean getShouldMakeRecommendations();
}
