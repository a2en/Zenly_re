package com.android.volley.toolbox;

import com.android.volley.C8715f;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.volley.toolbox.k */
public class C8734k extends C8735l<JSONObject> {
    public C8734k(int i, String str, JSONObject jSONObject, Listener<JSONObject> listener, ErrorListener errorListener) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), listener, errorListener);
    }

    /* access modifiers changed from: protected */
    public Response<JSONObject> parseNetworkResponse(C8715f fVar) {
        try {
            return Response.m20483a(new JSONObject(new String(fVar.f22456b, C8730g.m20564a(fVar.f22457c, "utf-8"))), C8730g.m20562a(fVar));
        } catch (UnsupportedEncodingException e) {
            return Response.m20482a(new ParseError((Throwable) e));
        } catch (JSONException e2) {
            return Response.m20482a(new ParseError((Throwable) e2));
        }
    }

    public C8734k(String str, JSONObject jSONObject, Listener<JSONObject> listener, ErrorListener errorListener) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, listener, errorListener);
    }
}
