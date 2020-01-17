package zendesk.suas;

/* renamed from: zendesk.suas.a */
public class C13600a<E> {
    private final String actionType;
    private final E data;

    public C13600a(String str, E e) {
        this.actionType = str;
        this.data = e;
    }

    public String getActionType() {
        return this.actionType;
    }

    public <F> F getData(Class<F> cls) {
        if (cls.isInstance(this.data)) {
            return cls.cast(this.data);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Action{actionType='");
        sb.append(this.actionType);
        sb.append('\'');
        sb.append(", data=");
        sb.append(this.data);
        sb.append('}');
        return sb.toString();
    }

    public <F> F getData() {
        return this.data;
    }

    public C13600a(String str) {
        this.actionType = str;
        this.data = null;
    }
}
