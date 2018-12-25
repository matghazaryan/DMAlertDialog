package alertdialog.dm.com.dmalertdialog;

import android.support.annotation.NonNull;

public abstract class DMDialogAlertDialogItem {

    protected abstract String getItemText();

    @NonNull
    @Override
    public String toString() {
        return getItemText();
    }
}
