package com.android.volley;

import android.content.Intent;

public class AuthFailureError extends VolleyError {

    /* renamed from: f */
    private Intent f22396f;

    public AuthFailureError() {
    }

    public String getMessage() {
        if (this.f22396f != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public AuthFailureError(C8715f fVar) {
        super(fVar);
    }
}
