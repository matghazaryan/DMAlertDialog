package alertdialogexample.dm.com.dmalertdialogexample.models;

import alertdialog.dm.com.dmalertdialog.DMDialogAlertDialogItem;

public class User extends DMDialogAlertDialogItem {

    private String name;

    private int age;

    public User(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getItemText() {
        return "Name:" + name + " Age:" + age;
    }
}
