package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask.ResponseListener;
import com.appsflyer.ServerConfigHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkGenerator {

    /* renamed from: ʻ */
    private String f22805;

    /* renamed from: ʼ */
    private String f22806;

    /* renamed from: ʽ */
    private String f22807;

    /* renamed from: ˊ */
    private String f22808;

    /* renamed from: ˋ */
    private String f22809;

    /* renamed from: ˎ */
    private String f22810;

    /* renamed from: ˏ */
    String f22811;

    /* renamed from: ˏॱ */
    private Map<String, String> f22812 = new HashMap();

    /* renamed from: ͺ */
    private Map<String, String> f22813 = new HashMap();

    /* renamed from: ॱ */
    String f22814;

    /* renamed from: ॱˊ */
    private String f22815;

    /* renamed from: ॱॱ */
    private String f22816;

    /* renamed from: ᐝ */
    private String f22817;

    public LinkGenerator(String str) {
        this.f22810 = str;
    }

    /* renamed from: ˋ */
    private static String m20785(String str, String str2) {
        String str3 = "";
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException unused) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.afInfoLog(sb.toString());
            return str3;
        } catch (Throwable unused2) {
            return str3;
        }
    }

    /* renamed from: ॱ */
    private StringBuilder m20786() {
        StringBuilder sb = new StringBuilder();
        String str = this.f22811;
        if (str == null || !str.startsWith("http")) {
            sb.append(ServerConfigHandler.getUrl(Constants.BASE_URL_APP_APPSFLYER_COM));
        } else {
            sb.append(this.f22811);
        }
        if (this.f22814 != null) {
            sb.append('/');
            sb.append(this.f22814);
        }
        this.f22813.put(Constants.URL_MEDIA_SOURCE, this.f22810);
        sb.append('?');
        sb.append("pid=");
        sb.append(m20785(this.f22810, "media source"));
        String str2 = this.f22805;
        if (str2 != null) {
            this.f22813.put(Constants.URL_REFERRER_UID, str2);
            sb.append('&');
            sb.append("af_referrer_uid=");
            sb.append(m20785(this.f22805, "referrerUID"));
        }
        String str3 = this.f22809;
        if (str3 != null) {
            this.f22813.put("af_channel", str3);
            sb.append('&');
            sb.append("af_channel=");
            sb.append(m20785(this.f22809, AppsFlyerProperties.CHANNEL));
        }
        String str4 = this.f22816;
        if (str4 != null) {
            this.f22813.put(Constants.URL_REFERRER_CUSTOMER_ID, str4);
            sb.append('&');
            sb.append("af_referrer_customer_id=");
            sb.append(m20785(this.f22816, "referrerCustomerId"));
        }
        String str5 = this.f22808;
        if (str5 != null) {
            this.f22813.put(Constants.URL_CAMPAIGN, str5);
            sb.append('&');
            sb.append("c=");
            sb.append(m20785(this.f22808, "campaign"));
        }
        String str6 = this.f22806;
        if (str6 != null) {
            this.f22813.put(Constants.URL_REFERRER_NAME, str6);
            sb.append('&');
            sb.append("af_referrer_name=");
            sb.append(m20785(this.f22806, "referrerName"));
        }
        String str7 = this.f22807;
        if (str7 != null) {
            this.f22813.put(Constants.URL_REFERRER_IMAGE_URL, str7);
            sb.append('&');
            sb.append("af_referrer_image_url=");
            sb.append(m20785(this.f22807, "referrerImageURL"));
        }
        if (this.f22815 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f22815);
            String str8 = this.f22815;
            String str9 = Constants.URL_PATH_DELIMITER;
            String str10 = "";
            sb2.append(str8.endsWith(str9) ? str10 : str9);
            String str11 = this.f22817;
            if (str11 != null) {
                sb2.append(str11);
            }
            this.f22813.put(Constants.URL_BASE_DEEPLINK, sb2.toString());
            sb.append('&');
            sb.append("af_dp=");
            sb.append(m20785(this.f22815, "baseDeeplink"));
            if (this.f22817 != null) {
                if (!this.f22815.endsWith(str9)) {
                    str10 = "%2F";
                }
                sb.append(str10);
                sb.append(m20785(this.f22817, "deeplinkPath"));
            }
        }
        for (String str12 : this.f22812.keySet()) {
            String obj = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str12);
            sb3.append("=");
            sb3.append(m20785((String) this.f22812.get(str12), str12));
            if (!obj.contains(sb3.toString())) {
                sb.append('&');
                sb.append(str12);
                sb.append('=');
                sb.append(m20785((String) this.f22812.get(str12), str12));
            }
        }
        return sb;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f22812.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f22812.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        return m20786().toString();
    }

    public String getCampaign() {
        return this.f22808;
    }

    public String getChannel() {
        return this.f22809;
    }

    public String getMediaSource() {
        return this.f22810;
    }

    public Map<String, String> getParameters() {
        return this.f22812;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f22815 = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        String str4 = Constants.AF_BASE_URL_FORMAT;
        if (str == null || str.length() <= 0) {
            this.f22811 = String.format(str4, new Object[]{ServerConfigHandler.getUrl(Constants.APPSFLYER_DEFAULT_APP_DOMAIN), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = Constants.ONELINK_DEFAULT_DOMAIN;
            }
            this.f22811 = String.format(str4, new Object[]{str2, str});
        }
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.f22808 = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.f22809 = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f22817 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f22816 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f22807 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f22806 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f22805 = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.f22812.isEmpty()) {
            for (Entry entry : this.f22812.entrySet()) {
                this.f22813.put(entry.getKey(), entry.getValue());
            }
        }
        m20786();
        ShareInviteHelper.generateUserInviteLink(context, string, this.f22813, responseListener);
    }
}
