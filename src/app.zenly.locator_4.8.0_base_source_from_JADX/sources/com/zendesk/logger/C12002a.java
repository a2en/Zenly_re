package com.zendesk.logger;

import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zendesk.logger.a */
class C12002a {
    /* renamed from: a */
    static char m31617a(int i) {
        switch (i) {
            case 2:
                return 'V';
            case 3:
                return 'D';
            case 4:
                return 'I';
            case 5:
                return 'W';
            case 6:
                return 'E';
            case 7:
                return 'A';
            default:
                return 'I';
        }
    }

    /* renamed from: a */
    static List<String> m31619a(String str, int i) {
        int min;
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        if (i < 1) {
            if (!C12017g.m31658b(str)) {
                arrayList.add(str2);
                return arrayList;
            }
            arrayList.add(str);
            return arrayList;
        } else if (!C12017g.m31658b(str)) {
            arrayList.add(str2);
            return arrayList;
        } else if (str.length() < i) {
            arrayList.add(str);
            return arrayList;
        } else {
            int i2 = 0;
            int length = str.length();
            while (i2 < length) {
                int indexOf = str.indexOf(C12017g.f31298b, i2);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i2 + i);
                    arrayList.add(str.substring(i2, min));
                    if (min >= indexOf) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    static String m31618a(String str) {
        if (C12017g.m31659c(str)) {
            return "Zendesk";
        }
        if (str.length() > 23) {
            str = str.substring(0, 23);
        }
        return str;
    }
}
