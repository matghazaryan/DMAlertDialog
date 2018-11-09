package alertdialog.dm.com.dmalertdialog;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;

import com.afollestad.materialdialogs.MaterialDialog;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialog.dm.com.dmalertdialog.constants.DMAlertConstants;
import alertdialog.dm.com.dmalertdialog.listeners.DMBaseClickListener;
import alertdialog.dm.com.dmalertdialog.methods.DMBasePrepareMethods;
import alertdialog.dm.com.dmalertdialog.methods.DMBaseUseMethods;

abstract class DMBasePrepareAlertDialog implements DMBaseUseMethods, DMBasePrepareMethods, DMAlertConstants {

    final void prepareConfigs(final DMBaseDialogConfigs configs) {
        try {
            if (configs == null) {
                throw new Exception("DMBaseDialogConfigs: Config cannot be null");
            } else if (configs.getActivity() == null) {
                throw new Exception("DMBaseDialogConfigs: Activity cannot be null");
            }
        } catch (final Exception e) {
            e.printStackTrace();
            return;
        }

        if (!configs.getActivity().isFinishing() && !configs.getActivity().isDestroyed()) {
            final DMBaseDialogConfigs mainConfigs;

            switch (configs.getDialogType()) {
                case SUCCESSFUL:
                    final DMBaseDialogConfigs successConfigs = setSuccessDialog(configs.getActivity());
                    mainConfigs = successConfigs != null ? successConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case CONFIRM:
                    final DMBaseDialogConfigs confirmConfigs = setConfirmDialog(configs.getActivity());
                    mainConfigs = confirmConfigs != null ? confirmConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case NEUTRAL:
                    final DMBaseDialogConfigs neutralConfigs = setNeutralDialog(configs.getActivity());
                    mainConfigs = neutralConfigs != null ? neutralConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case WARNING:
                    final DMBaseDialogConfigs warningConfigs = setWarningDialog(configs.getActivity());
                    mainConfigs = warningConfigs != null ? warningConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case ERROR:
                    final DMBaseDialogConfigs errorConfigs = setErrorDialog(configs.getActivity());
                    mainConfigs = errorConfigs != null ? errorConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                default:
                    final DMBaseDialogConfigs successConfigsDefault = setSuccessDialog(configs.getActivity());
                    mainConfigs = successConfigsDefault != null ? successConfigsDefault : new DMBaseDialogConfigs(configs.getActivity());
            }


            mainConfigs.setDialogType(configs.getDialogType());
            mainConfigs.setTitle(configs.getTitle() != null ? configs.getTitle() : mainConfigs.getTitle());
            mainConfigs.setContent(configs.getContent() != null ? configs.getContent() : mainConfigs.getContent());
            mainConfigs.setPositive(configs.getPositive() != null ? configs.getPositive() : mainConfigs.getPositive());
            mainConfigs.setDrawable(configs.getDrawable() != null ? configs.getDrawable() : mainConfigs.getDrawable());

            mainConfigs.setRegularFont(configs.getRegularFont() != null ? configs.getRegularFont() : mainConfigs.getRegularFont());
            mainConfigs.setMediumFont(configs.getMediumFont() != null ? configs.getMediumFont() : mainConfigs.getMediumFont());

            mainConfigs.setTitleColor(configs.getTitleColor() > 0 ? configs.getTitleColor() : mainConfigs.getTitleColor());
            mainConfigs.setContentColor(configs.getContentColor() > 0 ? configs.getContentColor() : mainConfigs.getContentColor());
            mainConfigs.setPositiveColor(configs.getPositiveColor() > 0 ? configs.getPositiveColor() : mainConfigs.getPositiveColor());

            mainConfigs.setAutoDismiss(configs.isAutoDismiss() != null ? configs.isAutoDismiss() : mainConfigs.isAutoDismiss());
            mainConfigs.setCancelable(configs.isCancelable() != null ? configs.isCancelable() : mainConfigs.isCancelable());

            mainConfigs.setListener(configs.getListener());


            final MaterialDialog.Builder builder = new MaterialDialog.Builder(mainConfigs.getActivity());


            final String title = mainConfigs.getTitle();
            if (!TextUtils.isEmpty(title)) {
                builder.title(title);
            }

            final String content = mainConfigs.getContent();
            if (!TextUtils.isEmpty(content)) {
                builder.content(content);
            }

            final String positiveText = mainConfigs.getPositive();
            if (!TextUtils.isEmpty(positiveText)) {
                builder.positiveText(positiveText);
                builder.onPositive((dialog, which) -> {
                    DMBaseClickListener listener = mainConfigs.getListener();
                    if (listener != null) {
                        listener.onPositive();
                    }
                });
            }

            if (mainConfigs.getDialogType() == DialogType.CONFIRM || mainConfigs.getDialogType() == DialogType.NEUTRAL) {
                final String negativeText = mainConfigs.getNegative();
                if (!TextUtils.isEmpty(negativeText)) {
                    builder.negativeText(negativeText);
                    builder.onNegative((dialog, which) -> {
                        final DMBaseClickListener listener = mainConfigs.getListener();
                        if (listener != null) {
                            listener.onNegative();
                        }
                    });
                }
            }

            if (mainConfigs.getDialogType() == DialogType.NEUTRAL) {
                final String neutralText = mainConfigs.getNeutral();
                if (!TextUtils.isEmpty(neutralText)) {
                    builder.neutralText(neutralText);
                    builder.onNeutral((dialog, which) -> {
                        final DMBaseClickListener listener = mainConfigs.getListener();
                        if (listener != null) {
                            listener.onNeutral();
                        }
                    });
                }
            }


            final DMAlertConstants.DialogCancelable cancelable = mainConfigs.isCancelable();
            builder.cancelable(cancelable == null || (cancelable == DMAlertConstants.DialogCancelable.ENABLE));

            final DMAlertConstants.DialogCancelable autoDismiss = mainConfigs.isAutoDismiss();
            builder.autoDismiss(autoDismiss == null || (autoDismiss == DMAlertConstants.DialogCancelable.ENABLE));

            if (mainConfigs.getRegularFont() != null && mainConfigs.getMediumFont() != null) {
                builder.typeface(mainConfigs.getMediumFont(), mainConfigs.getRegularFont());
            }

            final Drawable drawable = mainConfigs.getDrawable();
            if (drawable != null) {
                builder.icon(drawable);
            }

            if (mainConfigs.getTitleColor() > 0) {
                builder.titleColor(ContextCompat.getColor(mainConfigs.getActivity(), mainConfigs.getTitleColor()));
            }

            if (mainConfigs.getContentColor() > 0) {
                builder.contentColor(ContextCompat.getColor(mainConfigs.getActivity(), mainConfigs.getContentColor()));
            }

            if (mainConfigs.getPositiveColor() > 0) {
                builder.positiveColor(ContextCompat.getColor(mainConfigs.getActivity(), mainConfigs.getPositiveColor()));
            }

            if (mainConfigs.getNegativeColor() > 0) {
                builder.negativeColor(ContextCompat.getColor(mainConfigs.getActivity(), mainConfigs.getNegativeColor()));
            }

            if (mainConfigs.getNeutralColor() > 0) {
                builder.negativeColor(ContextCompat.getColor(mainConfigs.getActivity(), mainConfigs.getNeutralColor()));
            }

            builder.show();
        }
    }
}
