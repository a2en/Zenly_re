package zendesk.support.request;

import zendesk.suas.C13621h;

class ReducerError extends C13621h<StateError> {
    ReducerError() {
    }

    public StateError getInitialState() {
        return new StateError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r2 != 5) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zendesk.support.request.StateError reduce(zendesk.support.request.StateError r10, zendesk.suas.C13600a<?> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof zendesk.support.request.ActionFactory.ErrorAction
            if (r0 == 0) goto L_0x0025
            r1 = r11
            zendesk.support.request.ActionFactory$ErrorAction r1 = (zendesk.support.request.ActionFactory.ErrorAction) r1
            com.zendesk.service.ErrorResponse r1 = r1.getErrorResponse()
            boolean r2 = r1.isHTTPError()
            if (r2 == 0) goto L_0x0025
            int r2 = r1.getStatus()
            r3 = 401(0x191, float:5.62E-43)
            if (r2 != r3) goto L_0x0025
            zendesk.support.request.StateError r10 = new zendesk.support.request.StateError
            zendesk.support.request.StateError$ErrorType r11 = zendesk.support.request.StateError.ErrorType.NoAccess
            java.lang.String r0 = r1.getReason()
            r10.<init>(r11, r0)
            return r10
        L_0x0025:
            java.lang.String r1 = r11.getActionType()
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r3) {
                case -1193398337: goto L_0x0069;
                case -1063298693: goto L_0x005f;
                case -292168757: goto L_0x0055;
                case -16010570: goto L_0x004b;
                case 1532422677: goto L_0x0041;
                case 1921186300: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0072
        L_0x0037:
            java.lang.String r3 = "CREATE_COMMENT"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            r2 = 5
            goto L_0x0072
        L_0x0041:
            java.lang.String r3 = "CREATE_REQUEST_ERROR"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            r2 = 4
            goto L_0x0072
        L_0x004b:
            java.lang.String r3 = "LOAD_COMMENTS_INITIAL_SUCCESS"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            r2 = 2
            goto L_0x0072
        L_0x0055:
            java.lang.String r3 = "LOAD_COMMENT_INITIAL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            r2 = 1
            goto L_0x0072
        L_0x005f:
            java.lang.String r3 = "LOAD_COMMENTS_INITIAL_ERROR"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            r2 = 0
            goto L_0x0072
        L_0x0069:
            java.lang.String r3 = "LOAD_COMMENTS_UPDATE_SUCCESS"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0072
            r2 = 3
        L_0x0072:
            if (r2 == 0) goto L_0x007f
            if (r2 == r8) goto L_0x0093
            if (r2 == r7) goto L_0x0093
            if (r2 == r6) goto L_0x0093
            if (r2 == r5) goto L_0x00a1
            if (r2 == r4) goto L_0x00b5
            goto L_0x00c3
        L_0x007f:
            if (r0 == 0) goto L_0x0093
            zendesk.support.request.ActionFactory$ErrorAction r11 = (zendesk.support.request.ActionFactory.ErrorAction) r11
            com.zendesk.service.ErrorResponse r10 = r11.getErrorResponse()
            zendesk.support.request.StateError r11 = new zendesk.support.request.StateError
            zendesk.support.request.StateError$ErrorType r0 = zendesk.support.request.StateError.ErrorType.InitialGetComments
            java.lang.String r10 = r10.getReason()
            r11.<init>(r0, r10)
            return r11
        L_0x0093:
            zendesk.support.request.StateError$ErrorType r1 = r10.getState()
            zendesk.support.request.StateError$ErrorType r2 = zendesk.support.request.StateError.ErrorType.InitialGetComments
            if (r1 != r2) goto L_0x00a1
            zendesk.support.request.StateError r10 = new zendesk.support.request.StateError
            r10.<init>()
            return r10
        L_0x00a1:
            if (r0 == 0) goto L_0x00b5
            zendesk.support.request.ActionFactory$ErrorAction r11 = (zendesk.support.request.ActionFactory.ErrorAction) r11
            com.zendesk.service.ErrorResponse r10 = r11.getErrorResponse()
            zendesk.support.request.StateError r11 = new zendesk.support.request.StateError
            zendesk.support.request.StateError$ErrorType r0 = zendesk.support.request.StateError.ErrorType.InputFormSubmission
            java.lang.String r10 = r10.getReason()
            r11.<init>(r0, r10)
            return r11
        L_0x00b5:
            zendesk.support.request.StateError$ErrorType r10 = r10.getState()
            zendesk.support.request.StateError$ErrorType r11 = zendesk.support.request.StateError.ErrorType.InputFormSubmission
            if (r10 != r11) goto L_0x00c3
            zendesk.support.request.StateError r10 = new zendesk.support.request.StateError
            r10.<init>()
            return r10
        L_0x00c3:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.ReducerError.reduce(zendesk.support.request.StateError, zendesk.suas.a):zendesk.support.request.StateError");
    }
}
