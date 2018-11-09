package alertdialog.dm.com.dmalertdialog.configs;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import alertdialog.dm.com.dmalertdialog.constants.DMAlertConstants;
import alertdialog.dm.com.dmalertdialog.listeners.DMBaseClickListener;


public final class DMBaseDialogConfigs {

    private Activity activity;

    private String title;
    private String content;
    private String positive;
    private String negative;
    private String neutral;

    private Drawable drawable;

    private Typeface regularFont;
    private Typeface mediumFont;

    private int titleColor;
    private int contentColor;
    private int positiveColor;
    private int negativeColor;
    private int neutralColor;

    private DMAlertConstants.DialogCancelable autoDismiss;
    private DMAlertConstants.DialogCancelable cancelable;

    private DMBaseClickListener listener;

    private DMAlertConstants.DialogType dialogType;


    public DMBaseDialogConfigs(final Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPositive() {
        return positive;
    }

    public String getNegative() {
        return negative;
    }

    public String getNeutral() {
        return neutral;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public Typeface getRegularFont() {
        return regularFont;
    }

    public Typeface getMediumFont() {
        return mediumFont;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public int getContentColor() {
        return contentColor;
    }

    public int getPositiveColor() {
        return positiveColor;
    }

    public int getNegativeColor() {
        return negativeColor;
    }

    public int getNeutralColor() {
        return neutralColor;
    }

    public DMAlertConstants.DialogCancelable isAutoDismiss() {
        return autoDismiss;
    }

    public DMAlertConstants.DialogCancelable isCancelable() {
        return cancelable;
    }

    public DMBaseClickListener getListener() {
        return listener;
    }

    public DMAlertConstants.DialogType getDialogType() {
        return dialogType;
    }

    public DMBaseDialogConfigs setActivity(final Activity activity) {
        this.activity = activity;
        return this;
    }

    public DMBaseDialogConfigs setTitleRes(final int titleRes) {
        this.title = activity.getString(titleRes);
        return this;
    }

    public DMBaseDialogConfigs setTitle(final String title) {
        this.title = title;
        return this;
    }

    public DMBaseDialogConfigs setContentRes(final int contentRes) {
        this.content = activity.getString(contentRes);
        return this;
    }

    public DMBaseDialogConfigs setContent(final String content) {
        this.content = content;
        return this;
    }

    public DMBaseDialogConfigs setPositiveRes(final int positiveRes) {
        this.positive = activity.getString(positiveRes);
        return this;
    }

    public DMBaseDialogConfigs setPositive(final String positive) {
        this.positive = positive;
        return this;
    }

    public DMBaseDialogConfigs setNegativeRes(final int negativeRes) {
        this.negative = activity.getString(negativeRes);
        return this;
    }

    public DMBaseDialogConfigs setNegative(final String negative) {
        this.negative = negative;
        return this;
    }

    public DMBaseDialogConfigs setNeutralRes(final int neutralRes) {
        this.neutral = activity.getString(neutralRes);
        return this;
    }

    public DMBaseDialogConfigs setNeutral(final String neutral) {
        this.neutral = neutral;
        return this;
    }

    public DMBaseDialogConfigs setImageRes(final int imageRes) {
        this.drawable = ContextCompat.getDrawable(activity, imageRes);
        return this;
    }

    public DMBaseDialogConfigs setBitmap(final Bitmap bitmap) {
        this.drawable = new BitmapDrawable(activity.getResources(), bitmap);
        return this;
    }

    public DMBaseDialogConfigs setDrawable(final Drawable drawable) {
        this.drawable = drawable;
        return this;
    }

    public DMBaseDialogConfigs setRegularFont(final Typeface regularFont) {
        this.regularFont = regularFont;
        return this;
    }

    public DMBaseDialogConfigs setMediumFont(final Typeface mediumFont) {
        this.mediumFont = mediumFont;
        return this;
    }

    public DMBaseDialogConfigs setTitleColor(final int titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public DMBaseDialogConfigs setContentColor(final int contentColor) {
        this.contentColor = contentColor;
        return this;
    }

    public DMBaseDialogConfigs setPositiveColor(final int positiveColor) {
        this.positiveColor = positiveColor;
        return this;
    }

    public DMBaseDialogConfigs setNegativeColor(final int negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public DMBaseDialogConfigs setNeutralColor(final int neutralColor) {
        this.neutralColor = neutralColor;
        return this;
    }

    public DMBaseDialogConfigs setAutoDismiss(final DMAlertConstants.DialogCancelable autoDismiss) {
        this.autoDismiss = autoDismiss;
        return this;
    }

    public DMBaseDialogConfigs setCancelable(final DMAlertConstants.DialogCancelable cancelable) {
        this.cancelable = cancelable;
        return this;
    }

    public DMBaseDialogConfigs setListener(final DMBaseClickListener listener) {
        this.listener = listener;
        return this;
    }

    public DMBaseDialogConfigs setDialogType(final DMAlertConstants.DialogType dialogType) {
        this.dialogType = dialogType;
        return this;
    }
}
