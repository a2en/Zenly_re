package com.bumptech.glide.load.model;

import com.bumptech.glide.load.model.C9054d.C9055a;
import java.util.Collections;
import java.util.Map;

public interface Headers {

    /* renamed from: a */
    public static final Headers f23577a = new C9055a().mo24566a();

    /* renamed from: com.bumptech.glide.load.model.Headers$a */
    class C9044a implements Headers {
        C9044a() {
        }

        public Map<String, String> getHeaders() {
            return Collections.emptyMap();
        }
    }

    static {
        new C9044a();
    }

    Map<String, String> getHeaders();
}
