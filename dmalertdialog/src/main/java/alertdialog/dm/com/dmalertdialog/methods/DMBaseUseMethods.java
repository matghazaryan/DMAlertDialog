package alertdialog.dm.com.dmalertdialog.methods;

import android.content.Context;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;

public interface DMBaseUseMethods {

    default void showSuccessDialog(final DMBaseDialogConfigs configs) {

    }

    default void showConfirmDialog(final DMBaseDialogConfigs configs) {

    }

    default void showNeutralDialog(final DMBaseDialogConfigs configs) {

    }

    default void showWarningDialog(final DMBaseDialogConfigs configs) {

    }

    default void showErrorDialog(final DMBaseDialogConfigs configs) {

    }

    default void showToast(Context context, String content, int duration) {

    }
}
