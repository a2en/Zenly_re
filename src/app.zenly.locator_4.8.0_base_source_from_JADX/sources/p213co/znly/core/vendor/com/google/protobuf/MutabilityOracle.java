package p213co.znly.core.vendor.com.google.protobuf;

/* renamed from: co.znly.core.vendor.com.google.protobuf.MutabilityOracle */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new MutabilityOracle() {
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
