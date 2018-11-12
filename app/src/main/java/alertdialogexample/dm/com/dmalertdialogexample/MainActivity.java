package alertdialogexample.dm.com.dmalertdialogexample;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import alertdialog.dm.com.dmalertdialog.DMAlertDialogItem;
import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialog.dm.com.dmalertdialog.constants.DMAlertConstants;
import alertdialog.dm.com.dmalertdialog.listeners.DMAlertDialog;
import alertdialog.dm.com.dmalertdialog.listeners.DMBaseClickListener;
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

//        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs<>(this));

//        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs(this).setListener(new DMBaseClickListener() {
//            @Override
//            public void onPositive() {
//
//            }
//        }));

//        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs(this).setTitleColor(R.color.colorAccent));
//        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs(this)
//                .setContent("bubu")
//                .setPositive("dfsfds")
//                .setCancelable(DMAlertConstants.DialogCancelable.DISABLE)
//                .setAutoDismiss(DMAlertConstants.DialogCancelable.DISABLE));

        initCustomView();

//        initList();
    }

    private void initCustomView() {
        @SuppressLint("InflateParams") final View view = getLayoutInflater().inflate(R.layout.custom_view, null, false);
        final DMAlertDialog dialog = new DMExampleAlertDialog()
                .showCustomDialog(new DMBaseDialogConfigs<>(this)
                .setCustomView(view)
                .setCancelable(DMAlertConstants.DialogActionStatus.ENABLE)
                .setListener(new DMBaseClickListener<DMAlertDialogItem>() {
                    @Override
                    public void onPositive() {

                    }
                }));

        new Handler().postDelayed(() -> {
//                dialog.dismiss();
            ((TextView) dialog.getCustomView().findViewById(R.id.tv_title)).setText("Title 3");
        }, 3000);
    }

    private void initList() {

        final List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userList.add(new User("name " + i, i + 10));
        }

//        final DMBaseDialogConfigs<User> configs = new DMBaseDialogConfigs<User>(this)
//                .setPositive("dasdas")
//                .setList(userList)
//                .setListener(new DMBaseClickListener<User>() {
//            @Override
//            public void onSelect(User user) {
//
//            }
//        });

        new DMExampleAlertDialog().showListDialog(new DMBaseDialogConfigs<User>(this)
                .setPositive("Yes")
                .setNegative("No")
                .setBackgroundColor(Color.parseColor("#123456"))
                .setNeutral("close")
                .setList(userList)
//                .setAutoDismiss(DMAlertConstants.DialogActionStatus.DISABLE)
                .setListener(new DMBaseClickListener<User>() {
                    @Override
                    public void onSelect(final User user) {

                    }

                    @Override
                    public void onPositive() {

                    }
                }));
    }
}
