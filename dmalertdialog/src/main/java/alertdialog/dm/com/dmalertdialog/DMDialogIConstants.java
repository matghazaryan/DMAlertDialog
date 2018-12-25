package alertdialog.dm.com.dmalertdialog;

public interface DMDialogIConstants {

    enum DialogActionStatus {
        ENABLE,
        DISABLE
    }

    enum DialogType {
        SUCCESSFUL,
        CONFIRM,
        NEUTRAL,
        ERROR,
        WARNING,
        LIST,
        CUSTOM,
    }
}
