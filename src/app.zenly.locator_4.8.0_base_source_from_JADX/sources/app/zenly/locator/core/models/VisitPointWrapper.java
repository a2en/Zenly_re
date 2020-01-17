package app.zenly.locator.core.models;

import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2916z.C2918b;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

public interface VisitPointWrapper {

    public interface HeadingWrapper {
        long getArrivalTime();

        long getDepartureTime();

        C2916z getDestination();

        boolean getHasArrivalTime();

        boolean getHasDepartureTime();

        C2916z getOrigin();
    }

    HeadingWrapper getHeading();

    Timestamp getHereSince();

    C2911c getMovingState();

    C2918b getPlace();

    String getUserUuid();
}
