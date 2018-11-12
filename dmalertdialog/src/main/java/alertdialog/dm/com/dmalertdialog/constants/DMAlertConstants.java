package alertdialog.dm.com.dmalertdialog.constants;

public interface DMAlertConstants {

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
