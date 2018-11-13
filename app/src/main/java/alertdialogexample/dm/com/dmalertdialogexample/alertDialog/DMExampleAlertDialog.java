package alertdialogexample.dm.com.dmalertdialogexample.alertDialog;

import android.content.Context;
import android.graphics.Color;

import alertdialog.dm.com.dmalertdialog.DMAlertDialogItem;
import alertdialog.dm.com.dmalertdialog.DMBaseAlertDialog;
import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialogexample.dm.com.dmalertdialogexample.R;

public class DMExampleAlertDialog extends DMBaseAlertDialog {

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setSuccessDialog(final Context context) {
        return new DMBaseDialogConfigs<T>(context)
                .setTitle("Success")
                .setContent("Success content")
                .setPositive("Yes")
                .setNegative("No")
                .setImageRes(R.drawable.ic_launcher_background)
                .setTitleColor(R.color.colorPrimaryDark)
                .setContentColor(R.color.colorPrimaryDark)
                .setPositiveColor(R.color.colorPrimaryDark)
                .setAutoDismiss(DialogActionStatus.ENABLE)
                .setCancelable(DialogActionStatus.DISABLE);
    }

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setErrorDialog(final Context context) {
        return new DMBaseDialogConfigs<T>(context)
                .setTitle("Error")
                .setContent("Error content")
                .setPositive("Yes")
                .setNegative("No");
    }

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setListDialog(final Context context) {
        return new DMBaseDialogConfigs<T>(context)
                .setPositiveColor(Color.parseColor("#654321"));
    }

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setConfirmDialog(final Context context) {
        return new DMBaseDialogConfigs<T>(context).setContent("");
    }
}
