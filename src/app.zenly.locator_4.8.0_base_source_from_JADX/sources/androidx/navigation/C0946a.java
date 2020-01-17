package androidx.navigation;

import android.os.Bundle;

/* renamed from: androidx.navigation.a */
public final class C0946a implements NavDirections {

    /* renamed from: a */
    private final int f3647a;

    public C0946a(int i) {
        this.f3647a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0946a.class != obj.getClass()) {
            return false;
        }
        return getActionId() == ((C0946a) obj).getActionId();
    }

    public int getActionId() {
        return this.f3647a;
    }

    public Bundle getArguments() {
        return new Bundle();
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionOnlyNavDirections(actionId=");
        sb.append(getActionId());
        sb.append(")");
        return sb.toString();
    }
}
