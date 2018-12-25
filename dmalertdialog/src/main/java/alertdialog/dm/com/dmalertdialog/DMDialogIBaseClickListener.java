package alertdialog.dm.com.dmalertdialog;

public interface DMDialogIBaseClickListener<T extends DMDialogAlertDialogItem> {

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
