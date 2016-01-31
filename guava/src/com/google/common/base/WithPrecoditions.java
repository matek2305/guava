package com.google.common.base;

import javax.annotation.Nullable;

/**
 * @author Mateusz Urbański <matek2305@gmail.com>
 */
public interface WithPrecoditions {

    default void checkArgument(boolean expression) {
        Preconditions.checkArgument(expression);
    }

    default void checkArgument(boolean expression, @Nullable Object errorMessage) {
        Preconditions.checkArgument(expression, errorMessage);
    }

    default void checkArgument(boolean expression, @Nullable String errorMessageTemplate, @Nullable Object... errorMessageArgs) {
        Preconditions.checkArgument(expression, errorMessageTemplate, errorMessageArgs);
    }

    default void checkState(boolean expression) {
        Preconditions.checkState(expression);
    }

    default void checkState(boolean expression, @Nullable Object errorMessage) {
        Preconditions.checkState(expression, errorMessage);
    }

    default void checkState(boolean expression, @Nullable String errorMessageTemplate, @Nullable Object... errorMessageArgs) {
        Preconditions.checkState(expression, errorMessageTemplate, errorMessageArgs);
    }

    default <T> T checkNotNull(T reference) {
        return Preconditions.checkNotNull(reference);
    }

    default <T> T checkNotNull(T reference, @Nullable Object errorMessage) {
        return Preconditions.checkNotNull(reference, errorMessage);
    }

    default <T> T checkNotNull(T reference, @Nullable String errorMessageTemplate, @Nullable Object... errorMessageArgs) {
        return Preconditions.checkNotNull(reference, errorMessageTemplate, errorMessageArgs);
    }

    default int checkElementIndex(int index, int size) {
        return Preconditions.checkElementIndex(index, size);
    }

    default int checkElementIndex(int index, int size, @Nullable String desc) {
        return Preconditions.checkElementIndex(index, size, desc);
    }

    default int checkPositionIndex(int index, int size) {
        return Preconditions.checkPositionIndex(index, size);
    }

    default int checkPositionIndex(int index, int size, @Nullable String desc) {
        return Preconditions.checkPositionIndex(index, size, desc);
    }

    default void checkPositionIndexes(int start, int end, int size) {
        Preconditions.checkPositionIndexes(start, end, size);
    }
}
