package alertdialogexample.dm.com.dmalertdialogexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import alertdialog.dm.com.dmalertdialog.DMDialogAlertDialogItem;
import alertdialog.dm.com.dmalertdialog.DMDialogBaseConfigs;
import alertdialog.dm.com.dmalertdialog.DMDialogIAlertDialog;
import alertdialog.dm.com.dmalertdialog.DMDialogIBaseClickListener;
import alertdialog.dm.com.dmalertdialog.DMDialogIConstants;
import alertdialogexample.dm.com.dmalertdialogexample.alertDialog.DMExampleAlertDialog;
import alertdialogexample.dm.com.dmalertdialogexample.models.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        initSimple();
//        initWithListener();
//        initWithSomeParams();
//        initCustomView();
//        initList();
//        initError();
    }

    private void initSimple() {
        new DMExampleAlertDialog().showSuccessDialog(new DMDialogBaseConfigs<>(this));
    }

    private void initWithListener() {
        new DMExampleAlertDialog().showSuccessDialog(new DMDialogBaseConfigs<>(this).setListener(new DMDialogIBaseClickListener<DMDialogAlertDialogItem>() {
            @Override
            public void onPositive() {

            }
        }));
    }

    private void initWithSomeParams() {
        new DMExampleAlertDialog().showSuccessDialog(new DMDialogBaseConfigs<>(this)
                .setTitleColor(R.color.colorAccent)
                .setContent("Content")
                .setPositive("yes")
                .setCancelable(DMDialogIConstants.DialogActionStatus.ENABLE)
                .setAutoDismiss(DMDialogIConstants.DialogActionStatus.DISABLE));
    }

    @SuppressLint("SetTextI18n")
    private void initCustomView() {
        @SuppressLint("InflateParams") final View view = getLayoutInflater().inflate(R.layout.custom_view, null, false);
        final DMDialogIAlertDialog dialog = new DMExampleAlertDialog()
                .showCustomDialog(new DMDialogBaseConfigs<>(this)
                        .setCustomView(view)
                        .setCancelable(DMDialogIConstants.DialogActionStatus.ENABLE)
                        .setListener(new DMDialogIBaseClickListener<DMDialogAlertDialogItem>() {
                            @Override
                            public void onPositive() {

                            }
                        }));

        new Handler().postDelayed(() -> {
            dialog.dismiss();
            ((TextView) dialog.getCustomView().findViewById(R.id.tv_title)).setText("Title 3");
        }, 3000);
    }

    private void initList() {
        final List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userList.add(new User("name " + i, i + 10));
        }

        new DMExampleAlertDialog().showListDialog(new DMDialogBaseConfigs<User>(this)
                .setPositive("Yes")
                .setNegative("No")
                .setNeutral("close")
                .setList(userList)
                .setListener(new DMDialogIBaseClickListener<User>() {
                    @Override
                    public void onSelect(final User user) {

                    }

                    @Override
                    public void onPositive() {

                    }
                }));
    }

    private void initError() {
        new DMExampleAlertDialog().showErrorDialog(new DMDialogBaseConfigs<>(this)
                .setTitle("Title error")
                .setContent("error content")
                .setImageRes(R.drawable.icon_error));
    }
}
