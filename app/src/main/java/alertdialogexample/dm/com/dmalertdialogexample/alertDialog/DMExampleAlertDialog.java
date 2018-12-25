package alertdialogexample.dm.com.dmalertdialogexample.alertDialog;

import android.content.Context;
import android.graphics.Color;

import alertdialog.dm.com.dmalertdialog.DMDialogAlertDialogItem;
import alertdialog.dm.com.dmalertdialog.DMDialogBaseAlertDialog;
import alertdialog.dm.com.dmalertdialog.DMDialogBaseConfigs;
import alertdialogexample.dm.com.dmalertdialogexample.R;

public class DMExampleAlertDialog extends DMDialogBaseAlertDialog {

    @Override
    public <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setSuccessDialog(final Context context) {
        return new DMDialogBaseConfigs<T>(context)
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
    public <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setErrorDialog(final Context context) {
        return new DMDialogBaseConfigs<T>(context)
                .setTitle("Error")
                .setContent("Error content")
                .setPositive("Yes")
                .setNegative("No");
    }

    @Override
    public <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setListDialog(final Context context) {
        return new DMDialogBaseConfigs<T>(context)
                .setPositiveColor(Color.parseColor("#654321"));
    }

    @Override
    public <T extends DMDialogAlertDialogItem> DMDialogBaseConfigs<T> setConfirmDialog(final Context context) {
        return new DMDialogBaseConfigs<T>(context).setContent("");
    }
}
