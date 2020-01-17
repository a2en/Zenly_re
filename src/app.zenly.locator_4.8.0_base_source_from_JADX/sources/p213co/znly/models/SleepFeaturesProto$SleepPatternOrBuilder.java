package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.SleepFeaturesProto$SleepPattern.C6857b;

/* renamed from: co.znly.models.SleepFeaturesProto$SleepPatternOrBuilder */
public interface SleepFeaturesProto$SleepPatternOrBuilder extends MessageLiteOrBuilder {
    C6857b getContributions();

    int getDays(int i);

    int getDaysCount();

    List<Integer> getDaysList();

    int getNMembers();

    double getPattern(int i);

    int getPatternCount();

    List<Double> getPatternList();

    boolean hasContributions();
}
