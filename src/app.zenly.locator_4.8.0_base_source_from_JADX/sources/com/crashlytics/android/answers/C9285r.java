package com.crashlytics.android.answers;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: com.crashlytics.android.answers.r */
public class C9285r {

    /* renamed from: a */
    private static final Set<String> f24131a = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    /* renamed from: b */
    private Bundle m22376b(C9257b0 b0Var) {
        Bundle bundle = new Bundle();
        String str = "itemType";
        String str2 = "item_category";
        String str3 = "itemName";
        String str4 = "itemId";
        String str5 = "itemPrice";
        String str6 = "value";
        String str7 = "item_name";
        String str8 = "item_id";
        String str9 = "currency";
        if ("purchase".equals(b0Var.f24041g)) {
            m22374a(bundle, str8, (String) b0Var.f24042h.get(str4));
            m22374a(bundle, str7, (String) b0Var.f24042h.get(str3));
            m22374a(bundle, str2, (String) b0Var.f24042h.get(str));
            m22371a(bundle, str6, m22377b(b0Var.f24042h.get(str5)));
            m22374a(bundle, str9, (String) b0Var.f24042h.get(str9));
        } else {
            if ("addToCart".equals(b0Var.f24041g)) {
                m22374a(bundle, str8, (String) b0Var.f24042h.get(str4));
                m22374a(bundle, str7, (String) b0Var.f24042h.get(str3));
                m22374a(bundle, str2, (String) b0Var.f24042h.get(str));
                m22371a(bundle, "price", m22377b(b0Var.f24042h.get(str5)));
                m22371a(bundle, str6, m22377b(b0Var.f24042h.get(str5)));
                m22374a(bundle, str9, (String) b0Var.f24042h.get(str9));
                bundle.putLong("quantity", 1);
            } else {
                if ("startCheckout".equals(b0Var.f24041g)) {
                    m22373a(bundle, "quantity", Long.valueOf((long) ((Integer) b0Var.f24042h.get("itemCount")).intValue()));
                    m22371a(bundle, str6, m22377b(b0Var.f24042h.get("totalPrice")));
                    m22374a(bundle, str9, (String) b0Var.f24042h.get(str9));
                } else {
                    String str10 = "contentName";
                    String str11 = "contentId";
                    String str12 = "contentType";
                    String str13 = "content_type";
                    if ("contentView".equals(b0Var.f24041g)) {
                        m22374a(bundle, str13, (String) b0Var.f24042h.get(str12));
                        m22374a(bundle, str8, (String) b0Var.f24042h.get(str11));
                        m22374a(bundle, str7, (String) b0Var.f24042h.get(str10));
                    } else {
                        if ("search".equals(b0Var.f24041g)) {
                            m22374a(bundle, "search_term", (String) b0Var.f24042h.get("query"));
                        } else {
                            String str14 = "method";
                            if ("share".equals(b0Var.f24041g)) {
                                m22374a(bundle, str14, (String) b0Var.f24042h.get(str14));
                                m22374a(bundle, str13, (String) b0Var.f24042h.get(str12));
                                m22374a(bundle, str8, (String) b0Var.f24042h.get(str11));
                                m22374a(bundle, str7, (String) b0Var.f24042h.get(str10));
                            } else {
                                String str15 = "rating";
                                if (str15.equals(b0Var.f24041g)) {
                                    m22374a(bundle, str15, String.valueOf(b0Var.f24042h.get(str15)));
                                    m22374a(bundle, str13, (String) b0Var.f24042h.get(str12));
                                    m22374a(bundle, str8, (String) b0Var.f24042h.get(str11));
                                    m22374a(bundle, str7, (String) b0Var.f24042h.get(str10));
                                } else {
                                    if ("signUp".equals(b0Var.f24041g)) {
                                        m22374a(bundle, str14, (String) b0Var.f24042h.get(str14));
                                    } else {
                                        if ("login".equals(b0Var.f24041g)) {
                                            m22374a(bundle, str14, (String) b0Var.f24042h.get(str14));
                                        } else {
                                            if ("invite".equals(b0Var.f24041g)) {
                                                m22374a(bundle, str14, (String) b0Var.f24042h.get(str14));
                                            } else {
                                                if ("levelStart".equals(b0Var.f24041g)) {
                                                    m22374a(bundle, "level_name", (String) b0Var.f24042h.get("levelName"));
                                                } else {
                                                    if ("levelEnd".equals(b0Var.f24041g)) {
                                                        m22371a(bundle, "score", m22368a(b0Var.f24042h.get("score")));
                                                        m22374a(bundle, "level_name", (String) b0Var.f24042h.get("levelName"));
                                                        m22372a(bundle, "success", m22378b((String) b0Var.f24042h.get("success")));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        m22375a(bundle, b0Var.f24040f);
        return bundle;
    }

    /* renamed from: c */
    private String m22379c(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        String str2 = "fabric_";
        if (f24131a.contains(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(replaceAll);
            replaceAll = sb2.toString();
        }
        if (replaceAll.length() > 40) {
            replaceAll = replaceAll.substring(0, 40);
        }
        return replaceAll;
    }

    /* renamed from: a */
    public C9284q mo25020a(C9257b0 b0Var) {
        Bundle bundle;
        String str;
        boolean z = true;
        boolean z2 = C9260c.CUSTOM.equals(b0Var.f24037c) && b0Var.f24039e != null;
        boolean z3 = C9260c.PREDEFINED.equals(b0Var.f24037c) && b0Var.f24041g != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z3) {
            bundle = m22376b(b0Var);
        } else {
            bundle = new Bundle();
            Map<String, Object> map = b0Var.f24040f;
            if (map != null) {
                m22375a(bundle, map);
            }
        }
        if (z3) {
            String str2 = (String) b0Var.f24042h.get("success");
            if (str2 == null || Boolean.parseBoolean(str2)) {
                z = false;
            }
            str = m22370a(b0Var.f24041g, z);
        } else {
            str = m22379c(b0Var.f24039e);
        }
        C12154c.m32113f().mo35954d("Answers", "Logging event into firebase...");
        return new C9284q(str, bundle);
    }

    /* renamed from: a */
    private String m22369a(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            sb.append("fabric_");
            sb.append(replaceAll);
            replaceAll = sb.toString();
        }
        if (replaceAll.length() > 40) {
            replaceAll = replaceAll.substring(0, 40);
        }
        return replaceAll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r11.equals(r1) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m22370a(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "purchase"
            java.lang.String r2 = "signUp"
            r3 = -1
            r4 = 2
            r5 = 1
            java.lang.String r6 = "login"
            if (r12 == 0) goto L_0x0049
            int r12 = r11.hashCode()
            r7 = -902468296(0xffffffffca356d38, float:-2972494.0)
            if (r12 == r7) goto L_0x0030
            r7 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r12 == r7) goto L_0x0028
            r7 = 1743324417(0x67e90501, float:2.2008074E24)
            if (r12 == r7) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            boolean r12 = r11.equals(r1)
            if (r12 == 0) goto L_0x0038
            r12 = 0
            goto L_0x0039
        L_0x0028:
            boolean r12 = r11.equals(r6)
            if (r12 == 0) goto L_0x0038
            r12 = 2
            goto L_0x0039
        L_0x0030:
            boolean r12 = r11.equals(r2)
            if (r12 == 0) goto L_0x0038
            r12 = 1
            goto L_0x0039
        L_0x0038:
            r12 = -1
        L_0x0039:
            if (r12 == 0) goto L_0x0046
            if (r12 == r5) goto L_0x0043
            if (r12 == r4) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            java.lang.String r11 = "failed_login"
            return r11
        L_0x0043:
            java.lang.String r11 = "failed_sign_up"
            return r11
        L_0x0046:
            java.lang.String r11 = "failed_ecommerce_purchase"
            return r11
        L_0x0049:
            int r12 = r11.hashCode()
            java.lang.String r7 = "share"
            java.lang.String r8 = "search"
            java.lang.String r9 = "invite"
            switch(r12) {
                case -2131650889: goto L_0x00be;
                case -1183699191: goto L_0x00b5;
                case -938102371: goto L_0x00ab;
                case -906336856: goto L_0x00a3;
                case -902468296: goto L_0x009b;
                case -389087554: goto L_0x0091;
                case 23457852: goto L_0x0087;
                case 103149417: goto L_0x007e;
                case 109400031: goto L_0x0076;
                case 196004670: goto L_0x006b;
                case 1664021448: goto L_0x0060;
                case 1743324417: goto L_0x0058;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x00c9
        L_0x0058:
            boolean r12 = r11.equals(r1)
            if (r12 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x0060:
            java.lang.String r12 = "startCheckout"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 2
            goto L_0x00ca
        L_0x006b:
            java.lang.String r12 = "levelStart"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 10
            goto L_0x00ca
        L_0x0076:
            boolean r12 = r11.equals(r7)
            if (r12 == 0) goto L_0x00c9
            r0 = 5
            goto L_0x00ca
        L_0x007e:
            boolean r12 = r11.equals(r6)
            if (r12 == 0) goto L_0x00c9
            r0 = 8
            goto L_0x00ca
        L_0x0087:
            java.lang.String r12 = "addToCart"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x0091:
            java.lang.String r12 = "contentView"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 3
            goto L_0x00ca
        L_0x009b:
            boolean r12 = r11.equals(r2)
            if (r12 == 0) goto L_0x00c9
            r0 = 7
            goto L_0x00ca
        L_0x00a3:
            boolean r12 = r11.equals(r8)
            if (r12 == 0) goto L_0x00c9
            r0 = 4
            goto L_0x00ca
        L_0x00ab:
            java.lang.String r12 = "rating"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 6
            goto L_0x00ca
        L_0x00b5:
            boolean r12 = r11.equals(r9)
            if (r12 == 0) goto L_0x00c9
            r0 = 9
            goto L_0x00ca
        L_0x00be:
            java.lang.String r12 = "levelEnd"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 11
            goto L_0x00ca
        L_0x00c9:
            r0 = -1
        L_0x00ca:
            switch(r0) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00e5;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00da;
                case 8: goto L_0x00d9;
                case 9: goto L_0x00d8;
                case 10: goto L_0x00d5;
                case 11: goto L_0x00d2;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.String r11 = r10.m22379c(r11)
            return r11
        L_0x00d2:
            java.lang.String r11 = "level_end"
            return r11
        L_0x00d5:
            java.lang.String r11 = "level_start"
            return r11
        L_0x00d8:
            return r9
        L_0x00d9:
            return r6
        L_0x00da:
            java.lang.String r11 = "sign_up"
            return r11
        L_0x00dd:
            java.lang.String r11 = "rate_content"
            return r11
        L_0x00e0:
            return r7
        L_0x00e1:
            return r8
        L_0x00e2:
            java.lang.String r11 = "select_content"
            return r11
        L_0x00e5:
            java.lang.String r11 = "begin_checkout"
            return r11
        L_0x00e8:
            java.lang.String r11 = "add_to_cart"
            return r11
        L_0x00eb:
            java.lang.String r11 = "ecommerce_purchase"
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.answers.C9285r.m22370a(java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    private void m22373a(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    /* renamed from: a */
    private void m22372a(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* renamed from: a */
    private void m22374a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    private void m22371a(Bundle bundle, String str, Double d) {
        Double a = m22368a((Object) d);
        if (a != null) {
            bundle.putDouble(str, a.doubleValue());
        }
    }

    /* renamed from: a */
    private Double m22368a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    /* renamed from: a */
    private void m22375a(Bundle bundle, Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String a = m22369a((String) entry.getKey());
            if (value instanceof String) {
                bundle.putString(a, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(a, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(a, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(a, ((Integer) entry.getValue()).intValue());
            }
        }
    }

    /* renamed from: b */
    private Integer m22378b(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    /* renamed from: b */
    private Double m22377b(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(C9254a.f24032c).doubleValue());
    }
}
