package alertdialog.dm.com.dmalertdialog.methods;

import alertdialog.dm.com.dmalertdialog.DMAlertDialogItem;
import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialog.dm.com.dmalertdialog.listeners.DMAlertDialog;

public interface DMBaseUseMethods {

    default <T extends DMAlertDialogItem> DMAlertDialog showSuccessDialog(final DMBaseDialogConfigs<T> configs) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMAlertDialog showConfirmDialog(final DMBaseDialogConfigs<T> configs) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMAlertDialog showNeutralDialog(final DMBaseDialogConfigs<T> configs) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMAlertDialog showWarningDialog(final DMBaseDialogConfigs<T> configs) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMAlertDialog showErrorDialog(final DMBaseDialogConfigs<T> configs) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMAlertDialog showCustomDialog(final DMBaseDialogConfigs<T> configs) {
        return null;
    }

    default <T extends DMAlertDialogItem> DMAlertDialog showListDialog(final DMBaseDialogConfigs<T> configs) {
        return null;
    }
}
