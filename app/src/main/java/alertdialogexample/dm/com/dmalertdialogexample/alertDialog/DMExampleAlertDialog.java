package alertdialogexample.dm.com.dmalertdialogexample.alertDialog;

import android.app.Activity;

import alertdialog.dm.com.dmalertdialog.constants.DMAlertConstants;
import alertdialog.dm.com.dmalertdialog.DMBaseAlertDialog;
import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialogexample.dm.com.dmalertdialogexample.R;

public class DMExampleAlertDialog extends DMBaseAlertDialog {

    @Override
    public DMBaseDialogConfigs setSuccessDialog(final Activity activity) {
        return new DMBaseDialogConfigs(activity)
                .setTitle("Success")
                .setContent("Success content")
                .setPositive("Yes")
                .setNegative("No")
                .setImageRes(R.drawable.ic_launcher_background)
                .setTitleColor(R.color.colorPrimaryDark)
                .setContentColor(R.color.colorPrimaryDark)
                .setPositiveColor(R.color.colorPrimaryDark)
                .setAutoDismiss(DMAlertConstants.DialogCancelable.ENABLE)
                .setCancelable(DMAlertConstants.DialogCancelable.DISABLE);
    }

    @Override
    public DMBaseDialogConfigs setErrorDialog(final Activity activity) {
        return new DMBaseDialogConfigs(activity)
                .setTitle("Error")
                .setContent("Error content")
                .setPositive("Yes")
                .setNegative("No");
    }
}
