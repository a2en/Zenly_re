

package com.mapbox.turf.models;

import android.support.annotation.Nullable;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LineIntersectsResult extends LineIntersectsResult {

  private final Double horizontalIntersection;

  private final Double verticalIntersection;

  private final boolean onLine1;

  private final boolean onLine2;

  private AutoValue_LineIntersectsResult(
      @Nullable Double horizontalIntersection,
      @Nullable Double verticalIntersection,
      boolean onLine1,
      boolean onLine2) {
    this.horizontalIntersection = horizontalIntersection;
    this.verticalIntersection = verticalIntersection;
    this.onLine1 = onLine1;
    this.onLine2 = onLine2;
  }

  @Nullable
  @Override
  public Double horizontalIntersection() {
    return horizontalIntersection;
  }

  @Nullable
  @Override
  public Double verticalIntersection() {
    return verticalIntersection;
  }

  @Override
  public boolean onLine1() {
    return onLine1;
  }

  @Override
  public boolean onLine2() {
    return onLine2;
  }

  @Override
  public String toString() {
    return "LineIntersectsResult{"
         + "horizontalIntersection=" + horizontalIntersection + ", "
         + "verticalIntersection=" + verticalIntersection + ", "
         + "onLine1=" + onLine1 + ", "
         + "onLine2=" + onLine2
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LineIntersectsResult) {
      LineIntersectsResult that = (LineIntersectsResult) o;
      return ((this.horizontalIntersection == null) ? (that.horizontalIntersection() == null) : this.horizontalIntersection.equals(that.horizontalIntersection()))
           && ((this.verticalIntersection == null) ? (that.verticalIntersection() == null) : this.verticalIntersection.equals(that.verticalIntersection()))
           && (this.onLine1 == that.onLine1())
           && (this.onLine2 == that.onLine2());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (horizontalIntersection == null) ? 0 : horizontalIntersection.hashCode();
    h$ *= 1000003;
    h$ ^= (verticalIntersection == null) ? 0 : verticalIntersection.hashCode();
    h$ *= 1000003;
    h$ ^= onLine1 ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= onLine2 ? 1231 : 1237;
    return h$;
  }

  @Override
  public LineIntersectsResult.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends LineIntersectsResult.Builder {
    private Double horizontalIntersection;
    private Double verticalIntersection;
    private Boolean onLine1;
    private Boolean onLine2;
    Builder() {
    }
    private Builder(LineIntersectsResult source) {
      this.horizontalIntersection = source.horizontalIntersection();
      this.verticalIntersection = source.verticalIntersection();
      this.onLine1 = source.onLine1();
      this.onLine2 = source.onLine2();
    }
    @Override
    public LineIntersectsResult.Builder horizontalIntersection(@Nullable Double horizontalIntersection) {
      this.horizontalIntersection = horizontalIntersection;
      return this;
    }
    @Override
    public LineIntersectsResult.Builder verticalIntersection(@Nullable Double verticalIntersection) {
      this.verticalIntersection = verticalIntersection;
      return this;
    }
    @Override
    public LineIntersectsResult.Builder onLine1(boolean onLine1) {
      this.onLine1 = onLine1;
      return this;
    }
    @Override
    public LineIntersectsResult.Builder onLine2(boolean onLine2) {
      this.onLine2 = onLine2;
      return this;
    }
    @Override
    public LineIntersectsResult build() {
      String missing = "";
      if (this.onLine1 == null) {
        missing += " onLine1";
      }
      if (this.onLine2 == null) {
        missing += " onLine2";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_LineIntersectsResult(
          this.horizontalIntersection,
          this.verticalIntersection,
          this.onLine1,
          this.onLine2);
    }
  }

}
