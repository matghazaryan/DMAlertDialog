package alertdialog.dm.com.dmalertdialog.listeners;

import alertdialog.dm.com.dmalertdialog.DMAlertDialogItem;

public interface DMBaseClickListener<T extends DMAlertDialogItem> {

    default void onPositive() {

    }

    default void onNegative() {

    }

    default void onNeutral() {

    }

    default void onDismiss() {

    }

    default void onSelect(final T t) {

    }
}
