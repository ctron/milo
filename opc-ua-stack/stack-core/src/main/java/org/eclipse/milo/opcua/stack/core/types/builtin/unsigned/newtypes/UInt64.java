package org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.newtypes;

import java.math.BigInteger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;

public class UInt64 extends UnsignedNumber implements Comparable<UInt64> {

    public static final UInt64 ZERO = new UInt64(0);
    public static final UInt64 ONE = new UInt64(1);
    public static final UInt64 MIN_VALUE = ZERO;
    public static final UInt64 MAX_VALUE = new UInt64(-1L);

    private static final long UNSIGNED_MASK = 0x7FFFFFFFFFFFFFFFL;

    private final long value;

    private UInt64(long value) {
        this.value = value;
    }

    public UInt64 plus(@Nonnull UInt64 other) {
        Preconditions.checkNotNull(other);

        return fromLongBits(value + other.value);
    }

    public UInt64 minus(@Nonnull UInt64 other) {
        Preconditions.checkNotNull(other);

        return fromLongBits(value - other.value);
    }

    @Override
    public int intValue() {
        return (int) value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        float fv = (float) (value & UNSIGNED_MASK);

        return value < 0 ? (fv + 0x1.0p63f) : fv;
    }

    @Override
    public double doubleValue() {
        double dv = (double) (value & UNSIGNED_MASK);

        return value < 0 ? (dv + 0x1.0p63) : dv;
    }

    @Override
    public BigInteger bigIntegerValue() {
        BigInteger bigInteger = BigInteger.valueOf(value & UNSIGNED_MASK);

        return value < 0 ? bigInteger.setBit(Long.SIZE - 1) : bigInteger;
    }

    @Override
    public int compareTo(@Nonnull UInt64 o) {
        Preconditions.checkNotNull(o);

        return UnsignedLongs.compare(value, o.value);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return obj instanceof UInt64
            && value == ((UInt64) obj).value;
    }

    @Override
    public int hashCode() {
        return Longs.hashCode(value);
    }

    /**
     * @return a string representation of this {@code UInt64}.
     */
    @Override
    public String toString() {
        return UnsignedLongs.toString(value);
    }

    public static UInt64 fromLongBits(long bits) {
        return new UInt64(bits);
    }

    public static UInt64 valueOf(long value) {
        Preconditions.checkArgument(value >= 0,
            "value (%s) must be greater than 0", value);

        return fromLongBits(value);
    }

    public static UInt64 valueOf(@Nonnull BigInteger value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(
            value.signum() >= 0 && value.bitLength() <= Long.SIZE,
            "value (%s) must be greater than 0 and less than %s", value, MAX_VALUE);

        return fromLongBits(value.longValue());
    }

    public static UInt64 valueOf(@Nonnull String s) {
        return valueOf(s, 10);
    }

    public static UInt64 valueOf(@Nonnull String s, int radix) {
        long value = UnsignedLongs.parseUnsignedLong(s, radix);

        return fromLongBits(value);
    }

}
