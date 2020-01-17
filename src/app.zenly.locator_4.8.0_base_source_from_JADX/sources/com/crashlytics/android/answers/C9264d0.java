package com.crashlytics.android.answers;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p389io.fabric.sdk.android.services.events.EventTransform;

/* renamed from: com.crashlytics.android.answers.d0 */
class C9264d0 implements EventTransform<C9257b0> {
    C9264d0() {
    }

    @TargetApi(9)
    /* renamed from: a */
    public JSONObject mo24976a(C9257b0 b0Var) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            C9262c0 c0Var = b0Var.f24035a;
            jSONObject.put("appBundleId", c0Var.f24062a);
            jSONObject.put("executionId", c0Var.f24063b);
            jSONObject.put("installationId", c0Var.f24064c);
            jSONObject.put("limitAdTrackingEnabled", c0Var.f24065d);
            jSONObject.put("betaDeviceToken", c0Var.f24066e);
            jSONObject.put("buildId", c0Var.f24067f);
            jSONObject.put("osVersion", c0Var.f24068g);
            jSONObject.put("deviceModel", c0Var.f24069h);
            jSONObject.put("appVersionCode", c0Var.f24070i);
            jSONObject.put("appVersionName", c0Var.f24071j);
            jSONObject.put("timestamp", b0Var.f24036b);
            jSONObject.put("type", b0Var.f24037c.toString());
            if (b0Var.f24038d != null) {
                jSONObject.put("details", new JSONObject(b0Var.f24038d));
            }
            jSONObject.put("customType", b0Var.f24039e);
            if (b0Var.f24040f != null) {
                jSONObject.put("customAttributes", new JSONObject(b0Var.f24040f));
            }
            jSONObject.put("predefinedType", b0Var.f24041g);
            if (b0Var.f24042h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(b0Var.f24042h));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: b */
    public byte[] toBytes(C9257b0 b0Var) throws IOException {
        return mo24976a(b0Var).toString().getBytes("UTF-8");
    }
}
