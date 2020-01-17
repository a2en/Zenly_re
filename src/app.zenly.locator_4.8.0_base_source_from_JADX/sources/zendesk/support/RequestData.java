package zendesk.support;

final class RequestData {
    private final int commentCount;

    /* renamed from: id */
    private final String f35198id;
    private int readCommentCount;

    private RequestData(String str, int i, int i2) {
        this.commentCount = i;
        this.f35198id = str;
        this.readCommentCount = i2;
    }

    static RequestData create(Request request) {
        return new RequestData(request.getId(), request.getCommentCount().intValue(), 0);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestData.class != obj.getClass()) {
            return false;
        }
        RequestData requestData = (RequestData) obj;
        String str = this.f35198id;
        String str2 = requestData.f35198id;
        if (str != null) {
            z = str.equals(str2);
        } else if (str2 != null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public int getCommentCount() {
        return this.commentCount;
    }

    /* access modifiers changed from: 0000 */
    public String getId() {
        return this.f35198id;
    }

    /* access modifiers changed from: 0000 */
    public int getReadCommentCount() {
        return this.readCommentCount;
    }

    public int hashCode() {
        String str = this.f35198id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RequestData{commentCount=");
        sb.append(this.commentCount);
        sb.append("readCommentCount=");
        sb.append(this.readCommentCount);
        sb.append(", id='");
        sb.append(this.f35198id);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public int unreadComments() {
        return this.commentCount - this.readCommentCount;
    }

    static RequestData create(String str, int i, int i2) {
        return new RequestData(str, i, i2);
    }
}
