package com.mapbox.android.telemetry;

import android.os.Parcelable;
import java.util.EnumSet;

public abstract class Event implements Parcelable {

    /* renamed from: e */
    static EnumSet<C11300a> f29210e = EnumSet.of(C11300a.MAP_CLICK, C11300a.MAP_DRAGEND);

    @Deprecated
    /* renamed from: com.mapbox.android.telemetry.Event$a */
    public enum C11300a {
        TURNSTILE,
        MAP_LOAD,
        MAP_CLICK,
        MAP_DRAGEND,
        OFFLINE_DOWNLOAD_START,
        OFFLINE_DOWNLOAD_COMPLETE,
        LOCATION,
        NAV_DEPART,
        NAV_ARRIVE,
        NAV_CANCEL,
        NAV_REROUTE,
        NAV_FEEDBACK,
        NAV_FASTER_ROUTE,
        VIS_GENERAL,
        VIS_ATTACHMENT,
        VIS_OBJ_DETECTION,
        NO_OP
    }

    static {
        EnumSet.of(C11300a.NAV_DEPART, new C11300a[]{C11300a.NAV_ARRIVE, C11300a.NAV_CANCEL, C11300a.NAV_REROUTE, C11300a.NAV_FEEDBACK, C11300a.NAV_FASTER_ROUTE});
        EnumSet.of(C11300a.VIS_GENERAL, C11300a.VIS_ATTACHMENT, C11300a.VIS_OBJ_DETECTION);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.NO_OP;
    }
}
