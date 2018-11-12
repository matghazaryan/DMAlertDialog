package alertdialog.dm.com.dmalertdialog;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.List;

import alertdialog.dm.com.dmalertdialog.configs.DMBaseDialogConfigs;
import alertdialog.dm.com.dmalertdialog.constants.DMAlertConstants;
import alertdialog.dm.com.dmalertdialog.listeners.DMAlertDialog;
import alertdialog.dm.com.dmalertdialog.listeners.DMBaseClickListener;
import alertdialog.dm.com.dmalertdialog.methods.DMBasePrepareMethods;
import alertdialog.dm.com.dmalertdialog.methods.DMBaseUseMethods;

abstract class DMBasePrepareAlertDialog implements DMBaseUseMethods, DMBasePrepareMethods, DMAlertConstants {

    final <T extends DMAlertDialogItem> DMAlertDialog prepareConfigs(final DMBaseDialogConfigs<T> configs) {
        try {
            if (configs == null) {
                throw new Exception("DMBaseDialogConfigs: Config cannot be null");
            } else if (configs.getActivity() == null) {
                throw new Exception("DMBaseDialogConfigs: Activity cannot be null");
            }
        } catch (final Exception e) {
            e.printStackTrace();
            return null;
        }

        if (!configs.getActivity().isFinishing() && !configs.getActivity().isDestroyed()) {
            final DMBaseDialogConfigs<T> mainConfigs;

            switch (configs.getDialogType()) {
                case SUCCESSFUL:
                    final DMBaseDialogConfigs<T> successConfigs = setSuccessDialog(configs.getActivity());
                    mainConfigs = successConfigs != null ? successConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case CONFIRM:
                    final DMBaseDialogConfigs<T> confirmConfigs = setConfirmDialog(configs.getActivity());
                    mainConfigs = confirmConfigs != null ? confirmConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case NEUTRAL:
                    final DMBaseDialogConfigs<T> neutralConfigs = setNeutralDialog(configs.getActivity());
                    mainConfigs = neutralConfigs != null ? neutralConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case WARNING:
                    final DMBaseDialogConfigs<T> warningConfigs = setWarningDialog(configs.getActivity());
                    mainConfigs = warningConfigs != null ? warningConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case ERROR:
                    final DMBaseDialogConfigs<T> errorConfigs = setErrorDialog(configs.getActivity());
                    mainConfigs = errorConfigs != null ? errorConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case LIST:
                    final DMBaseDialogConfigs<T> listConfigs = setListDialog(configs.getActivity());
                    mainConfigs = listConfigs != null ? listConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                case CUSTOM:
                    final DMBaseDialogConfigs<T> customConfigs = setCustomDialog(configs.getActivity());
                    mainConfigs = customConfigs != null ? customConfigs : new DMBaseDialogConfigs(configs.getActivity());
                    break;
                default:
                    final DMBaseDialogConfigs<T> successConfigsDefault = setSuccessDialog(configs.getActivity());
                    mainConfigs = successConfigsDefault != null ? successConfigsDefault : new DMBaseDialogConfigs(configs.getActivity());
            }


            mainConfigs.setDialogType(configs.getDialogType());
            mainConfigs.setTitle(configs.getTitle() != null ? configs.getTitle() : mainConfigs.getTitle());
            mainConfigs.setContent(configs.getContent() != null ? configs.getContent() : mainConfigs.getContent());
            mainConfigs.setPositive(configs.getPositive() != null ? configs.getPositive() : mainConfigs.getPositive());
            mainConfigs.setDrawable(configs.getDrawable() != null ? configs.getDrawable() : mainConfigs.getDrawable());

            mainConfigs.setRegularFont(configs.getRegularFont() != null ? configs.getRegularFont() : mainConfigs.getRegularFont());
            mainConfigs.setMediumFont(configs.getMediumFont() != null ? configs.getMediumFont() : mainConfigs.getMediumFont());

            mainConfigs.setTitleColor(configs.getTitleColor() != 0 ? configs.getTitleColor() : mainConfigs.getTitleColor());
            mainConfigs.setContentColor(configs.getContentColor() != 0 ? configs.getContentColor() : mainConfigs.getContentColor());
            mainConfigs.setPositiveColor(configs.getPositiveColor() != 0 ? configs.getPositiveColor() : mainConfigs.getPositiveColor());
            mainConfigs.setNegativeColor(configs.getNeutralColor() != 0 ? configs.getNegativeColor() : mainConfigs.getNegativeColor());
            mainConfigs.setNeutralColor(configs.getNeutralColor() != 0 ? configs.getNeutralColor() : mainConfigs.getNeutralColor());
            mainConfigs.setBackgroundColor(configs.getBackgroundColor() != 0 ? configs.getBackgroundColor() : mainConfigs.getBackgroundColor());
            mainConfigs.setDividerColor(configs.getDividerColor() != 0 ? configs.getDividerColor() : mainConfigs.getDividerColor());

            mainConfigs.setAutoDismiss(configs.isAutoDismiss() != null ? configs.isAutoDismiss() : mainConfigs.isAutoDismiss());
            mainConfigs.setCancelable(configs.isCancelable() != null ? configs.isCancelable() : mainConfigs.isCancelable());

            mainConfigs.setCustomView(configs.getCustomView() != null ? configs.getCustomView() : mainConfigs.getCustomView());

            mainConfigs.setList(configs.getList() != null ? configs.getList() : mainConfigs.getList());

            mainConfigs.setListener(configs.getListener());


            final MaterialDialog.Builder builder = new MaterialDialog.Builder(mainConfigs.getActivity());

            if (mainConfigs.getDialogType() == DialogType.CUSTOM) {
                builder.customView(mainConfigs.getCustomView(), true);
            } else {

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

                if (mainConfigs.getDialogType() == DialogType.CONFIRM || mainConfigs.getDialogType() == DialogType.NEUTRAL || mainConfigs.getDialogType() == DialogType.LIST) {
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

                if (mainConfigs.getDialogType() == DialogType.NEUTRAL || mainConfigs.getDialogType() == DialogType.LIST) {
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

                if (mainConfigs.getDialogType() == DialogType.LIST) {
                    final List<T> list = mainConfigs.getList();
                    if (list != null && list.size() > 0) {
                        builder.items(mainConfigs.getList());
                        builder.itemsCallback((dialog, itemView, position, text) -> {
                            final DMBaseClickListener<T> listener = mainConfigs.getListener();
                            if (listener != null) {
                                listener.onSelect(list.get(position));
                            }
                        });
                    }
                }

                if (mainConfigs.getRegularFont() != null && mainConfigs.getMediumFont() != null) {
                    builder.typeface(mainConfigs.getMediumFont(), mainConfigs.getRegularFont());
                }

                final Drawable drawable = mainConfigs.getDrawable();
                if (drawable != null) {
                    builder.icon(drawable);
                }

                if (mainConfigs.getTitleColor() != 0) {
                    builder.titleColor(mainConfigs.getTitleColor());
                }

                if (mainConfigs.getContentColor() != 0) {
                    builder.contentColor(mainConfigs.getContentColor());
                }

                if (mainConfigs.getPositiveColor() != 0) {
                    builder.positiveColor(mainConfigs.getPositiveColor());
                }

                if (mainConfigs.getNegativeColor() != 0) {
                    builder.negativeColor(mainConfigs.getNegativeColor());
                }

                if (mainConfigs.getNeutralColor() != 0) {
                    builder.negativeColor(mainConfigs.getNeutralColor());
                }

                if (mainConfigs.getBackgroundColor() != 0) {
                    builder.backgroundColor(mainConfigs.getBackgroundColor());
                }

                if (mainConfigs.getDividerColor() != 0) {
                    builder.dividerColor(mainConfigs.getDividerColor());
                }
            }

            final DialogActionStatus cancelable = mainConfigs.isCancelable();
            builder.cancelable(cancelable == null || cancelable == DialogActionStatus.ENABLE);

            final DialogActionStatus autoDismiss = mainConfigs.isAutoDismiss();
            builder.autoDismiss(autoDismiss == null || autoDismiss == DialogActionStatus.ENABLE);

            builder.dismissListener(dialog -> {
                final DMBaseClickListener listener = mainConfigs.getListener();
                if (listener != null) {
                    listener.onDismiss();
                }
            });

            final MaterialDialog materialDialog = builder.show();

            return prepareActions(materialDialog);
        }

        return null;
    }

    private DMAlertDialog prepareActions(final MaterialDialog dialog) {
        if (dialog != null) {
            return new DMAlertDialog() {
                @Override
                public void dismiss() {
                    dialog.dismiss();
                }

                @Override
                public View getCustomView() {
                    return dialog.getCustomView();
                }
            };
        }

        return null;
    }
}
