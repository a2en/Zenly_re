package kotlin.contracts;

public interface SimpleEffect extends Effect {
    ConditionalEffect implies(boolean z);
}
