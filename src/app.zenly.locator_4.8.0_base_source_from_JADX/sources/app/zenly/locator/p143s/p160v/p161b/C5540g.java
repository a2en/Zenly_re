package app.zenly.locator.p143s.p160v.p161b;

import android.content.Context;
import app.zenly.locator.R;
import java.util.ArrayList;
import java.util.List;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p260i.C7687c;

/* renamed from: app.zenly.locator.s.v.b.g */
public final class C5540g {
    /* renamed from: a */
    public static String m15722a(Context context, List<UserProto$User> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        String quantityString = context.getResources().getQuantityString(R.plurals.newfriend_request_mutualfriends, size, new Object[]{Integer.valueOf(size)});
        List a = m15723a(list, Math.min(3, size));
        if (size > 3) {
            int i = size - 3;
            a.add(context.getResources().getQuantityString(R.plurals.commons_label_others, i, new Object[]{Integer.valueOf(i)}));
        }
        String a2 = C7687c.m18719a(context, a);
        StringBuilder sb = new StringBuilder();
        sb.append(quantityString);
        sb.append("\n");
        sb.append(a2);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m15724b(Context context, List<UserProto$User> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        String a = C7687c.m18719a(context, m15723a(list, Math.min(5, size)));
        if (size <= 5) {
            return context.getString(R.string.friendRequest_subtitle_mutualFriends_few, new Object[]{a});
        }
        return context.getResources().getQuantityString(R.plurals.friendRequest_subtitle_mutualFriends_many, size, new Object[]{Integer.valueOf(size), a});
    }

    /* renamed from: a */
    private static List<String> m15723a(List<UserProto$User> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        for (UserProto$User userProto$User : list) {
            if (i == 0) {
                break;
            }
            arrayList.add(userProto$User.getName());
            i--;
        }
        return arrayList;
    }
}
