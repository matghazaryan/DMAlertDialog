package alertdialogexample.dm.com.dmalertdialogexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialog.dm.com.dmalertdialog.listeners.DMBaseClickListener;
import alertdialogexample.dm.com.dmalertdialogexample.alertDialog.DMExampleAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    private void init() {

//        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs(this));

        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs(this).setListener(new DMBaseClickListener() {
            @Override
            public void onPositive() {

            }
        }));

//        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs(this).setTitleColor(R.color.colorAccent));
//        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs(this).setContent("bubu"));


    }
}
