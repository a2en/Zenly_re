package app.zenly.locator.core.manager.p070t5;

import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.locator.core.models.C2896p;
import java.util.ArrayList;

/* renamed from: app.zenly.locator.core.manager.t5.a */
public class C2831a {

    /* renamed from: a */
    private int f8070a;

    /* renamed from: b */
    private C2896p f8071b;

    public C2831a() {
    }

    /* renamed from: a */
    public static boolean m9302a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public void mo8855a(int i, C2896p pVar) {
        this.f8070a = i | this.f8070a;
        this.f8071b = pVar;
    }

    /* renamed from: b */
    public int mo8857b() {
        return this.f8070a;
    }

    /* renamed from: c */
    public C2896p mo8858c() {
        return this.f8071b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (m9302a(this.f8070a, 1)) {
            arrayList.add("EVENT_UPDATE_VALIDITY");
        }
        if (m9302a(this.f8070a, 2)) {
            arrayList.add("UPDATE_USER");
        }
        if (m9302a(this.f8070a, 4)) {
            arrayList.add("UPDATE_POSITION");
        }
        if (m9302a(this.f8070a, 8)) {
            arrayList.add("UPDATE_PRECISION");
        }
        if (m9302a(this.f8070a, 16)) {
            arrayList.add("EVENT_UPDATE_LOWPRECISION");
        }
        if (m9302a(this.f8070a, 32)) {
            arrayList.add("EVENT_UPDATE_SPEED");
        }
        if (m9302a(this.f8070a, 64)) {
            arrayList.add("UPDATE_BATTERY");
        }
        if (m9302a(this.f8070a, 128)) {
            arrayList.add("EVENT_UPDATE_CITY_MODE");
        }
        if (m9302a(this.f8070a, 256)) {
            arrayList.add("UPDATE_SCORE_RANK");
        }
        if (m9302a(this.f8070a, 512)) {
            arrayList.add("EVENT_UPDATE_PLACES");
        }
        if (m9302a(this.f8070a, 1024)) {
            arrayList.add("UPDATE_SPINNER");
        }
        if (m9302a(this.f8070a, (int) ItemAnimator.FLAG_MOVED)) {
            arrayList.add("EVENT_UPDATE_TIMEZONE");
        }
        if (m9302a(this.f8070a, 4096)) {
            arrayList.add("UPDATE_UNREAD_COUNTER");
        }
        if (m9302a(this.f8070a, 8192)) {
            arrayList.add("UPDATE_BUBBLE");
        }
        if (m9302a(this.f8070a, 16384)) {
            arrayList.add("UPDATE_IN_APP");
        }
        if (m9302a(this.f8070a, 32768)) {
            arrayList.add("EVENT_UPDATE_LIVE");
        }
        if (m9302a(this.f8070a, 65536)) {
            arrayList.add("UPDATE_YOUTHFULNESS");
        }
        if (m9302a(this.f8070a, 131072)) {
            arrayList.add("EVENT_UPDATE_VISITPOINT");
        }
        if (m9302a(this.f8070a, 262144)) {
            arrayList.add("EVENT_UPDATE_SIGNIFICANT_PLACE");
        }
        if (m9302a(this.f8070a, 524288)) {
            arrayList.add("EVENT_UPDATE_USER_ANNOTATIONS");
        }
        if (m9302a(this.f8070a, 1048576)) {
            arrayList.add("EVENT_UPDATE_HEADING");
        }
        if (m9302a(this.f8070a, 2097152)) {
            arrayList.add("EVENT_UPDATE_SLEEPING");
        }
        if (m9302a(this.f8070a, 4194304)) {
            arrayList.add("EVENT_UPDATE_LOCATION_ALWAYS_ALLOWED");
        }
        if (m9302a(this.f8070a, 8388608)) {
            arrayList.add("EVENT_UPDATE_IS_IN_SUBWAY");
        }
        return String.format("FriendEvent {user: %s, event: %s }", new Object[]{this.f8071b.f8197a, arrayList.toString()});
    }

    public C2831a(int i, C2896p pVar) {
        mo8855a(i, pVar);
    }

    /* renamed from: a */
    public void mo8856a(C2896p pVar) {
        this.f8071b = pVar;
    }

    /* renamed from: a */
    public int mo8854a() {
        return mo8857b();
    }
}
