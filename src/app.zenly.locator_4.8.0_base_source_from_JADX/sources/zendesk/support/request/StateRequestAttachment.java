package zendesk.support.request;

import android.net.Uri;
import androidx.core.util.C0603e;
import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.belvedere.MediaResult;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;

class StateRequestAttachment implements Serializable, Comparable<StateRequestAttachment> {
    private final int height;

    /* renamed from: id */
    private final long f35241id;
    private final transient File localFile;
    private final String localUri;
    private final String mimeType;
    private final String name;
    private final long size;
    private final String thumbnailUrl;
    private final String token;
    private final String url;
    private final int width;

    static class Builder {
        /* access modifiers changed from: private */
        public int height;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public long f35242id;
        /* access modifiers changed from: private */
        public File localFile;
        /* access modifiers changed from: private */
        public String localUri;
        /* access modifiers changed from: private */
        public String mimeType;
        /* access modifiers changed from: private */
        public String name;
        /* access modifiers changed from: private */
        public long size;
        /* access modifiers changed from: private */
        public String thumbnailUrl;
        /* access modifiers changed from: private */
        public String token;
        /* access modifiers changed from: private */
        public String url;
        /* access modifiers changed from: private */
        public int width;

        /* access modifiers changed from: 0000 */
        public StateRequestAttachment build() {
            return new StateRequestAttachment(this);
        }

        /* access modifiers changed from: 0000 */
        public Builder setLocalFile(File file) {
            this.localFile = file;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setLocalUri(String str) {
            this.localUri = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setToken(String str) {
            this.token = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        private Builder(StateRequestAttachment stateRequestAttachment) {
            this.f35242id = stateRequestAttachment.getId();
            this.localFile = stateRequestAttachment.getLocalFile();
            this.localUri = stateRequestAttachment.getLocalUri();
            this.url = stateRequestAttachment.getUrl();
            this.token = stateRequestAttachment.getToken();
            this.mimeType = stateRequestAttachment.getMimeType();
            this.name = stateRequestAttachment.getName();
            this.size = stateRequestAttachment.getSize();
            this.width = stateRequestAttachment.getWidth();
            this.height = stateRequestAttachment.getHeight();
            this.thumbnailUrl = stateRequestAttachment.getThumbnailUrl();
        }
    }

    public static C0603e<Map<Long, StateRequestAttachment>, StateIdMapper> convert(List<CommentResponse> list, Map<Long, MediaResult> map, StateIdMapper stateIdMapper) {
        ArrayList arrayList = new ArrayList();
        for (CommentResponse attachments : list) {
            arrayList.addAll(attachments.getAttachments());
        }
        return convert((List<Attachment>) arrayList, stateIdMapper, map);
    }

    /* access modifiers changed from: 0000 */
    public int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: 0000 */
    public long getId() {
        return this.f35241id;
    }

    /* access modifiers changed from: 0000 */
    public File getLocalFile() {
        return this.localFile;
    }

    /* access modifiers changed from: 0000 */
    public String getLocalUri() {
        return this.localUri;
    }

    /* access modifiers changed from: 0000 */
    public String getMimeType() {
        return C12017g.m31658b(this.mimeType) ? this.mimeType : "application/octet-stream";
    }

    /* access modifiers changed from: 0000 */
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: 0000 */
    public Uri getParsedLocalUri() {
        return Uri.parse(this.localUri);
    }

    /* access modifiers changed from: 0000 */
    public long getSize() {
        return this.size;
    }

    /* access modifiers changed from: 0000 */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* access modifiers changed from: 0000 */
    public String getToken() {
        return this.token;
    }

    /* access modifiers changed from: 0000 */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: 0000 */
    public int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: 0000 */
    public boolean isAvailableLocally() {
        return (this.localUri == null || getParsedLocalUri() == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RequestAttachment{id=");
        sb.append(this.f35241id);
        sb.append(", localUri='");
        sb.append(this.localUri);
        sb.append('\'');
        sb.append(", localFile=");
        sb.append(this.localFile);
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", token='");
        sb.append(this.token);
        sb.append('\'');
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", size='");
        sb.append(this.size);
        sb.append('\'');
        sb.append(", width='");
        sb.append(this.width);
        sb.append('\'');
        sb.append(", height='");
        sb.append(this.height);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    StateRequestAttachment(long j, String str, File file, String str2, String str3, String str4, String str5, long j2, int i, int i2, String str6) {
        this.f35241id = j;
        this.localUri = str;
        this.localFile = file;
        this.url = str2;
        this.token = str3;
        this.mimeType = str4;
        this.name = str5;
        this.size = j2;
        this.width = i;
        this.height = i2;
        this.thumbnailUrl = str6;
    }

    public int compareTo(StateRequestAttachment stateRequestAttachment) {
        return (int) (this.f35241id - stateRequestAttachment.f35241id);
    }

    static C0603e<Map<Long, StateRequestAttachment>, StateIdMapper> convert(List<Attachment> list, StateIdMapper stateIdMapper, Map<Long, MediaResult> map) {
        long j;
        File file;
        String str;
        StateIdMapper stateIdMapper2 = stateIdMapper;
        Map<Long, MediaResult> map2 = map;
        HashMap hashMap = new HashMap(list.size());
        for (Attachment attachment : list) {
            if (attachment.getId() != null) {
                if (stateIdMapper2.hasLocalId(attachment.getId())) {
                    j = stateIdMapper2.getLocalId(attachment.getId()).longValue();
                } else {
                    j = IdUtil.newLongId();
                    stateIdMapper2.addIdMapping(attachment.getId(), Long.valueOf(j));
                }
                long j2 = j;
                if (map2.containsKey(attachment.getId())) {
                    MediaResult mediaResult = (MediaResult) map2.get(attachment.getId());
                    File a = mediaResult.mo38840a();
                    str = mediaResult.mo38849g().toString();
                    file = a;
                } else {
                    str = null;
                    file = null;
                }
                long j3 = -1;
                long longValue = attachment.getSize() != null ? attachment.getSize().longValue() : -1;
                long longValue2 = attachment.getWidth() != null ? attachment.getWidth().longValue() : -1;
                if (attachment.getHeight() != null) {
                    j3 = attachment.getHeight().longValue();
                }
                StateRequestAttachment stateRequestAttachment = new StateRequestAttachment(j2, str, file, attachment.getContentUrl(), "", attachment.getContentType(), attachment.getFileName(), longValue, (int) longValue2, (int) j3, C12010a.m31639b((Collection<Type>) attachment.getThumbnails()) ? ((Attachment) attachment.getThumbnails().get(0)).getContentUrl() : "");
                hashMap.put(attachment.getId(), stateRequestAttachment);
            }
        }
        return C0603e.m2769a(hashMap, stateIdMapper2);
    }

    private StateRequestAttachment(Builder builder) {
        this.localFile = builder.localFile;
        this.localUri = builder.localUri;
        this.mimeType = builder.mimeType;
        this.name = builder.name;
        this.f35241id = builder.f35242id;
        this.url = builder.url;
        this.token = builder.token;
        this.size = builder.size;
        this.width = builder.width;
        this.height = builder.height;
        this.thumbnailUrl = builder.thumbnailUrl;
    }

    static StateRequestAttachment convert(MediaResult mediaResult) {
        StateRequestAttachment stateRequestAttachment = new StateRequestAttachment(IdUtil.newLongId(), mediaResult.mo38849g().toString(), mediaResult.mo38840a(), "", "", mediaResult.mo38842c(), mediaResult.mo38844d(), mediaResult.mo38848f(), (int) mediaResult.mo38850h(), (int) mediaResult.mo38841b(), "");
        return stateRequestAttachment;
    }

    static MediaResult convert(StateRequestAttachment stateRequestAttachment) {
        MediaResult mediaResult = new MediaResult(stateRequestAttachment.getLocalFile(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getName(), stateRequestAttachment.getMimeType(), stateRequestAttachment.getSize(), (long) stateRequestAttachment.getWidth(), (long) stateRequestAttachment.getHeight());
        return mediaResult;
    }
}
