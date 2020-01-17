package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.C0540a;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import p333g.p384h.p385a.C12140j;
import zendesk.belvedere.C13489a;
import zendesk.belvedere.MediaResult;
import zendesk.support.IdUtil;

class UtilsAttachment {
    private static final AttachmentNameComparator REQUEST_ATTACHMENT_COMPARATOR = new AttachmentNameComparator();
    private static final String REQUEST_BELVEDERE_PATH;
    private static final String SUPPORT_BELVEDERE_BASE_PATH;

    private static class AttachmentNameComparator implements Comparator<StateRequestAttachment> {
        private AttachmentNameComparator() {
        }

        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getName().compareTo(stateRequestAttachment2.getName());
        }
    }

    static {
        String str = "%s%s%s";
        SUPPORT_BELVEDERE_BASE_PATH = String.format(Locale.US, str, new Object[]{"zendesk", File.separator, "support"});
        REQUEST_BELVEDERE_PATH = String.format(Locale.US, str, new Object[]{SUPPORT_BELVEDERE_BASE_PATH, File.separator, "request"});
    }

    static Drawable getAppIcon(Context context, ResolveInfo resolveInfo) {
        Drawable loadIcon = resolveInfo != null ? resolveInfo.loadIcon(context.getPackageManager()) : null;
        if (loadIcon != null) {
            return loadIcon;
        }
        return C0540a.m2546c(context, 17301651);
    }

    static ResolveInfo getAppInfoForFile(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        MediaResult a = C13489a.m35734a(context).mo38864a("tmp", str);
        if (a == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(a.mo38849g());
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!C12010a.m31635a((Collection<Type>) queryIntentActivities)) {
            return (ResolveInfo) queryIntentActivities.get(0);
        }
        return null;
    }

    static CharSequence getAppName(Context context, ResolveInfo resolveInfo) {
        CharSequence loadLabel = resolveInfo != null ? resolveInfo.loadLabel(context.getPackageManager()) : "";
        if (!TextUtils.isEmpty(loadLabel)) {
            return loadLabel;
        }
        return context.getString(C12140j.request_attachment_generic_unknown_app);
    }

    static String getAttachmentSubDir(String str, long j) {
        return String.format(Locale.US, "%s%s%s", new Object[]{str, File.separator, Long.valueOf(j)});
    }

    static String getCacheDirForRequestId(String str) {
        return String.format(Locale.US, "%s%s%s", new Object[]{REQUEST_BELVEDERE_PATH, File.separator, str});
    }

    static String getContentDescriptionForAttachmentButton(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C12140j.request_menu_button_label_add_attachments));
        sb.append(". ");
        if (i == 0) {
            sb.append(context.getString(C12140j.f31561x5c772881));
        } else if (i == 1) {
            sb.append(context.getString(C12140j.f31562x73d0b8a8));
        } else {
            sb.append(context.getString(C12140j.f31560x38b7f720, new Object[]{Integer.valueOf(i)}));
        }
        return sb.toString();
    }

    static MediaResult getLocalFile(C13489a aVar, String str, long j, String str2) {
        return aVar.mo38864a(getAttachmentSubDir(getCacheDirForRequestId(str), j), str2);
    }

    static String getMessageBodyForAttachments(List<StateRequestAttachment> list) {
        List a = C12010a.m31632a(list);
        Collections.sort(a, REQUEST_ATTACHMENT_COMPARATOR);
        StringBuilder sb = new StringBuilder();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            sb.append(((StateRequestAttachment) a.get(i)).getName());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return String.format(Locale.US, "[%s]", new Object[]{sb.toString()});
    }

    static String getTemporaryRequestCacheDir() {
        return String.format(Locale.US, "%s%s%s", new Object[]{REQUEST_BELVEDERE_PATH, File.separator, IdUtil.newStringId()});
    }

    static boolean hasAttachmentBody(StateMessage stateMessage) {
        if (!C12010a.m31639b((Collection<Type>) stateMessage.getAttachments())) {
            return false;
        }
        return stateMessage.getBody().equals(getMessageBodyForAttachments(stateMessage.getAttachments()));
    }

    static boolean isImageAttachment(StateRequestAttachment stateRequestAttachment) {
        String mimeType = stateRequestAttachment.getMimeType();
        return C12017g.m31658b(mimeType) && mimeType.toLowerCase(Locale.US).startsWith("image");
    }
}
