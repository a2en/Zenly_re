package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8480i;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p289q.C8654d;

/* renamed from: com.airbnb.lottie.model.content.g */
public class C8565g implements ContentModel {

    /* renamed from: a */
    private final String f21927a;

    /* renamed from: b */
    private final C8566a f21928b;

    /* renamed from: c */
    private final boolean f21929c;

    /* renamed from: com.airbnb.lottie.model.content.g$a */
    public enum C8566a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: a */
        public static C8566a m19844a(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public C8565g(String str, C8566a aVar, boolean z) {
        this.f21927a = str;
        this.f21928b = aVar;
        this.f21929c = z;
    }

    /* renamed from: a */
    public C8566a mo23098a() {
        return this.f21928b;
    }

    /* renamed from: b */
    public String mo23099b() {
        return this.f21927a;
    }

    /* renamed from: c */
    public boolean mo23100c() {
        return this.f21929c;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        if (eVar.mo22978c()) {
            return new C8480i(this);
        }
        C8654d.m20155b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MergePaths{mode=");
        sb.append(this.f21928b);
        sb.append('}');
        return sb.toString();
    }
}
