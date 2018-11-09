package alertdialog.dm.com.dmalertdialog;

import android.content.Context;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;

public abstract class DMBaseAlertDialog extends DMBasePrepareAlertDialog {

    @Override
    public final void showSuccessDialog(final DMBaseDialogConfigs configs) {
        configs.setDialogType(DialogType.SUCCESSFUL);
        prepareConfigs(configs);
    }

    @Override
    public final void showConfirmDialog(final DMBaseDialogConfigs configs) {
        configs.setDialogType(DialogType.CONFIRM);
        prepareConfigs(configs);
    }

    @Override
    public final void showNeutralDialog(final DMBaseDialogConfigs configs) {
        configs.setDialogType(DialogType.NEUTRAL);
        prepareConfigs(configs);
    }

    @Override
    public final void showWarningDialog(final DMBaseDialogConfigs configs) {
        configs.setDialogType(DialogType.WARNING);
        prepareConfigs(configs);
    }

    @Override
    public final void showErrorDialog(final DMBaseDialogConfigs configs) {
        configs.setDialogType(DialogType.ERROR);
        prepareConfigs(configs);
    }

    @Override
    public final void showToast(Context context, String content, int duration) {

    }
}
