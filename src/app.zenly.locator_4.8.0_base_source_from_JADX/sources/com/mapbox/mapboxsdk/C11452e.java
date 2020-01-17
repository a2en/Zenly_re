package com.mapbox.mapboxsdk;

import com.mapbox.mapboxsdk.http.HttpRequest;
import com.mapbox.mapboxsdk.maps.TelemetryDefinition;
import com.mapbox.mapboxsdk.module.telemetry.C11576a;
import com.mapbox.mapboxsdk.p320n.p321a.C11577a;
import com.mapbox.mapboxsdk.p320n.p322b.C11580a;

/* renamed from: com.mapbox.mapboxsdk.e */
public class C11452e implements ModuleProvider {
    public HttpRequest createHttpRequest() {
        return new C11577a();
    }

    public LibraryLoaderProvider createLibraryLoaderProvider() {
        return new C11580a();
    }

    public TelemetryDefinition obtainTelemetry() {
        return new C11576a();
    }
}
