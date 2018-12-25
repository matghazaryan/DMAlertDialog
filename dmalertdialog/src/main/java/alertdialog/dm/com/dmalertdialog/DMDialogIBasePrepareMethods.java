package alertdialog.dm.com.dmalertdialog;

import android.content.Context;

interface DMDialogIBasePrepareMethods {

    default <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setSuccessDialog(Context context) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setConfirmDialog(Context context) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setNeutralDialog(Context context) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setWarningDialog(Context context) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setErrorDialog(Context context) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setListDialog(Context context) {
        return null;
    }

    default <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setCustomDialog(Context context) {
        return null;
    }
}
