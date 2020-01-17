package zendesk.support.request;

import android.annotation.SuppressLint;
import com.zendesk.util.C12010a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class StateIdMapper implements Serializable {
    private final Map<Long, Long> localToRemote;
    private final Map<Long, Long> remoteToLocal;

    private StateIdMapper(Map<Long, Long> map, Map<Long, Long> map2) {
        this.remoteToLocal = map;
        this.localToRemote = map2;
    }

    /* access modifiers changed from: 0000 */
    public StateIdMapper addIdMapping(Long l, Long l2) {
        this.remoteToLocal.put(l, l2);
        this.localToRemote.put(l2, l);
        return copy();
    }

    /* access modifiers changed from: 0000 */
    public StateIdMapper copy() {
        return new StateIdMapper(C12010a.m31634a(this.remoteToLocal), C12010a.m31634a(this.localToRemote));
    }

    /* access modifiers changed from: 0000 */
    public Long getLocalId(Long l) {
        return (Long) this.remoteToLocal.get(l);
    }

    /* access modifiers changed from: 0000 */
    public Long getRemoteId(Long l) {
        return (Long) this.localToRemote.get(l);
    }

    /* access modifiers changed from: 0000 */
    public Set<Long> getRemoteIds() {
        return this.remoteToLocal.keySet();
    }

    /* access modifiers changed from: 0000 */
    public boolean hasLocalId(Long l) {
        return this.remoteToLocal.containsKey(l) && this.localToRemote.containsValue(l);
    }

    /* access modifiers changed from: 0000 */
    public boolean hasRemoteId(Long l) {
        return this.localToRemote.containsKey(l) && this.remoteToLocal.containsValue(l);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdMapper{ remoteToLocal=");
        sb.append(this.remoteToLocal);
        sb.append(" localToRemote=");
        sb.append(this.localToRemote);
        sb.append('}');
        return sb.toString();
    }

    @SuppressLint({"UseSparseArrays"})
    StateIdMapper() {
        this.localToRemote = new HashMap();
        this.remoteToLocal = new HashMap();
    }
}
