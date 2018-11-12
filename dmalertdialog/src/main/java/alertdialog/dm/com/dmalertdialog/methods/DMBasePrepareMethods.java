package alertdialog.dm.com.dmalertdialog.methods;

import android.app.Activity;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialog.dm.com.dmalertdialog.DMAlertDialogItem;

public interface DMBasePrepareMethods {

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setSuccessDialog(Activity activity) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setConfirmDialog(Activity activity) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setNeutralDialog(Activity activity) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setWarningDialog(Activity activity) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setErrorDialog(Activity activity) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setListDialog(Activity activity) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setCustomDialog(Activity activity) {
        return null;
    }
}
