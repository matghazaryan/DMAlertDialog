package alertdialog.dm.com.dmalertdialog.methods;

import android.app.Activity;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;

public interface DMBasePrepareMethods {

    default DMBaseDialogConfigs setSuccessDialog(Activity activity) {
        return null;
    }

    default DMBaseDialogConfigs setConfirmDialog(Activity activity) {
        return null;
    }

    default DMBaseDialogConfigs setNeutralDialog(Activity activity) {
        return null;
    }

    default DMBaseDialogConfigs setWarningDialog(Activity activity) {
        return null;
    }

    default DMBaseDialogConfigs setErrorDialog(Activity activity) {
        return null;
    }
}
