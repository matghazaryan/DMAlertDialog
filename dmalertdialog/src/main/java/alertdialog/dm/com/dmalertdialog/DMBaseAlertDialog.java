package alertdialog.dm.com.dmalertdialog;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialog.dm.com.dmalertdialog.listeners.DMAlertDialog;

public abstract class DMBaseAlertDialog extends DMBasePrepareAlertDialog {

    @Override
    public final <T extends DMAlertDialogItem> DMAlertDialog showSuccessDialog(final DMBaseDialogConfigs<T> configs) {
        configs.setDialogType(DialogType.SUCCESSFUL);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMAlertDialogItem> DMAlertDialog showConfirmDialog(final DMBaseDialogConfigs<T> configs) {
        configs.setDialogType(DialogType.CONFIRM);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMAlertDialogItem> DMAlertDialog showNeutralDialog(final DMBaseDialogConfigs<T> configs) {
        configs.setDialogType(DialogType.NEUTRAL);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMAlertDialogItem> DMAlertDialog showWarningDialog(final DMBaseDialogConfigs<T> configs) {
        configs.setDialogType(DialogType.WARNING);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMAlertDialogItem> DMAlertDialog showErrorDialog(final DMBaseDialogConfigs<T> configs) {
        configs.setDialogType(DialogType.ERROR);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMAlertDialogItem> DMAlertDialog showCustomDialog(final DMBaseDialogConfigs<T> configs) {
        configs.setDialogType(DialogType.CUSTOM);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMAlertDialogItem> DMAlertDialog showListDialog(final DMBaseDialogConfigs<T> configs) {
        configs.setDialogType(DialogType.LIST);
        return prepareConfigs(configs);
    }
}
