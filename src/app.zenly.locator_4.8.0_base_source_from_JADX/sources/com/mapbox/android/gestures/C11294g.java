package com.mapbox.android.gestures;

import android.util.Pair;

/* renamed from: com.mapbox.android.gestures.g */
public class C11294g extends Pair<Integer, Integer> {
    public C11294g(Integer num, Integer num2) {
        super(num, num2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11294g) {
            C11294g gVar = (C11294g) obj;
            if ((((Integer) this.first).equals(gVar.first) && ((Integer) this.second).equals(gVar.second)) || (((Integer) this.first).equals(gVar.second) && ((Integer) this.second).equals(gVar.first))) {
                return true;
            }
        }
        return false;
    }
}
