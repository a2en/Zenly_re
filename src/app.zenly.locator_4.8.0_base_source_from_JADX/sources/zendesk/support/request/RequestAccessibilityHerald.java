package zendesk.support.request;

import android.view.View;
import p333g.p384h.p385a.C12136f;
import zendesk.suas.C13600a;
import zendesk.suas.Listener;

class RequestAccessibilityHerald implements Listener<C13600a<?>> {
    private final View view;

    RequestAccessibilityHerald(View view2) {
        this.view = view2;
    }

    private void announce(int i, Object... objArr) {
        this.view.announceForAccessibility(this.view.getContext().getString(i, objArr));
    }

    static RequestAccessibilityHerald create(RequestActivity requestActivity) {
        return new RequestAccessibilityHerald(requestActivity.findViewById(C12136f.activity_request_root));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(zendesk.suas.C13600a<?> r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getActionType()
            int r1 = r0.hashCode()
            r2 = -1679314784(0xffffffff9be7b0a0, float:-3.8329886E-22)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002f
            r2 = -1319777819(0xffffffffb155c9e5, float:-3.1110343E-9)
            if (r1 == r2) goto L_0x0025
            r2 = -292168757(0xffffffffee95dbcb, float:-2.318949E28)
            if (r1 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r1 = "LOAD_COMMENT_INITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 2
            goto L_0x003a
        L_0x0025:
            java.lang.String r1 = "CREATE_COMMENT_ERROR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x002f:
            java.lang.String r1 = "CREATE_COMMENT_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = -1
        L_0x003a:
            if (r0 == 0) goto L_0x0075
            if (r0 == r5) goto L_0x0061
            if (r0 == r3) goto L_0x0041
            goto L_0x008c
        L_0x0041:
            java.lang.Object r7 = r7.getData()
            androidx.core.util.e r7 = (androidx.core.util.C0603e) r7
            if (r7 == 0) goto L_0x008c
            F r7 = r7.f2729a
            if (r7 == 0) goto L_0x008c
            zendesk.support.CommentsResponse r7 = (zendesk.support.CommentsResponse) r7
            java.util.List r7 = r7.getComments()
            boolean r7 = com.zendesk.util.C12010a.m31639b(r7)
            if (r7 == 0) goto L_0x008c
            int r7 = p333g.p384h.p385a.C12140j.zs_request_announce_comments_loaded_accessibility
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r6.announce(r7, r0)
            goto L_0x008c
        L_0x0061:
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.StateMessage r7 = (zendesk.support.request.StateMessage) r7
            int r0 = p333g.p384h.p385a.C12140j.zs_request_announce_comment_failed_accessibility
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r7 = r7.getPlainBody()
            r1[r4] = r7
            r6.announce(r0, r1)
            goto L_0x008c
        L_0x0075:
            java.lang.Object r7 = r7.getData()
            zendesk.support.request.ActionCreateComment$CreateCommentResult r7 = (zendesk.support.request.ActionCreateComment.CreateCommentResult) r7
            int r0 = p333g.p384h.p385a.C12140j.zs_request_announce_comment_created_accessibility
            java.lang.Object[] r1 = new java.lang.Object[r5]
            zendesk.support.request.StateMessage r7 = r7.getMessage()
            java.lang.String r7 = r7.getPlainBody()
            r1[r4] = r7
            r6.announce(r0, r1)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.RequestAccessibilityHerald.update(zendesk.suas.a):void");
    }
}
