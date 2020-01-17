package com.snapchat.kit.sdk.creative.media;

import android.net.Uri;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class SnapSticker {

    /* renamed from: a */
    private final File f30615a;

    /* renamed from: b */
    private float f30616b = 0.0f;

    /* renamed from: c */
    private float f30617c = 0.5f;

    /* renamed from: d */
    private float f30618d = 0.5f;

    /* renamed from: e */
    private float f30619e = 200.0f;

    /* renamed from: f */
    private float f30620f = 200.0f;

    /* renamed from: g */
    private boolean f30621g;

    SnapSticker(File file) {
        this.f30615a = file;
    }

    public JSONObject getJsonForm(Uri uri) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uri", uri);
            jSONObject.put("posX", (double) this.f30617c);
            jSONObject.put("posY", (double) this.f30618d);
            jSONObject.put("rotation", (double) this.f30616b);
            jSONObject.put("width", (double) this.f30619e);
            jSONObject.put("height", (double) this.f30620f);
            jSONObject.put("isAnimated", this.f30621g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public File getStickerFile() {
        return this.f30615a;
    }

    public void setHeight(float f) {
        this.f30620f = f;
    }

    public void setPosX(float f) {
        this.f30617c = f;
    }

    public void setPosY(float f) {
        this.f30618d = f;
    }

    public void setRotationDegreesClockwise(float f) {
        this.f30616b = f;
    }

    public void setWidth(float f) {
        this.f30619e = f;
    }
}
