package alertdialog.dm.com.dmalertdialog.methods;

import android.content.Context;

import alertdialog.dm.com.dmalertdialog.DMAlertDialogItem;
import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;

public interface DMBasePrepareMethods {

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setSuccessDialog(Context context) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setConfirmDialog(Context context) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setNeutralDialog(Context context) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setWarningDialog(Context context) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setErrorDialog(Context context) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setListDialog(Context context) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setCustomDialog(Context context) {
        return null;
    }
}
