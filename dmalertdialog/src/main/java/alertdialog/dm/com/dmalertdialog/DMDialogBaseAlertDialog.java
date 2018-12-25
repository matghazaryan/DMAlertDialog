package alertdialog.dm.com.dmalertdialog;

public abstract class DMDialogBaseAlertDialog extends DMDialogBasePrepareAlertDialog {

    @Override
    public final <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showSuccessDialog(final DMDialogBaseConfigs<T> configs) {
        configs.setDialogType(DialogType.SUCCESSFUL);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showConfirmDialog(final DMDialogBaseConfigs<T> configs) {
        configs.setDialogType(DialogType.CONFIRM);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showNeutralDialog(final DMDialogBaseConfigs<T> configs) {
        configs.setDialogType(DialogType.NEUTRAL);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showWarningDialog(final DMDialogBaseConfigs<T> configs) {
        configs.setDialogType(DialogType.WARNING);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showErrorDialog(final DMDialogBaseConfigs<T> configs) {
        configs.setDialogType(DialogType.ERROR);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showCustomDialog(final DMDialogBaseConfigs<T> configs) {
        configs.setDialogType(DialogType.CUSTOM);
        return prepareConfigs(configs);
    }

    @Override
    public final <T extends DMDialogAlertDialogItem> DMDialogIAlertDialog showListDialog(final DMDialogBaseConfigs<T> configs) {
        configs.setDialogType(DialogType.LIST);
        return prepareConfigs(configs);
    }
}
