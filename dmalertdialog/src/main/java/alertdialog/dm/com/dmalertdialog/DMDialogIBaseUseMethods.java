package alertdialog.dm.com.dmalertdialog;

interface DMDialogIBaseUseMethods {

    default <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showSuccessDialog(final DMDialogBaseConfigs<T> configs) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showConfirmDialog(final DMDialogBaseConfigs<T> configs) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showNeutralDialog(final DMDialogBaseConfigs<T> configs) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showWarningDialog(final DMDialogBaseConfigs<T> configs) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showErrorDialog(final DMDialogBaseConfigs<T> configs) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showCustomDialog(final DMDialogBaseConfigs<T> configs) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showListDialog(final DMDialogBaseConfigs<T> configs) {
        return null;
    }
}
