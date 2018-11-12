package alertdialog.dm.com.dmalertdialog.configs;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;

import java.util.List;

import alertdialog.dm.com.dmalertdialog.constants.DMAlertConstants;
import alertdialog.dm.com.dmalertdialog.DMAlertDialogItem;
import alertdialog.dm.com.dmalertdialog.listeners.DMBaseClickListener;


public final class DMBaseDialogConfigs<T extends DMAlertDialogItem> {

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
    private int backgroundColor;
    private int dividerColor;

    private DMAlertConstants.DialogActionStatus autoDismiss;
    private DMAlertConstants.DialogActionStatus cancelable;

    private View customView;

    private List<T> list;

    private DMBaseClickListener<T> listener;

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

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getDividerColor() {
        return dividerColor;
    }

    public DMAlertConstants.DialogActionStatus isAutoDismiss() {
        return autoDismiss;
    }

    public DMAlertConstants.DialogActionStatus isCancelable() {
        return cancelable;
    }

    public View getCustomView() {
        return customView;
    }

    public List<T> getList() {
        return list;
    }

    public DMBaseClickListener<T> getListener() {
        return listener;
    }

    public DMAlertConstants.DialogType getDialogType() {
        return dialogType;
    }

    public DMBaseDialogConfigs<T> setActivity(final Activity activity) {
        this.activity = activity;
        return this;
    }

    public DMBaseDialogConfigs<T> setTitleRes(final int titleRes) {
        this.title = activity.getString(titleRes);
        return this;
    }

    public DMBaseDialogConfigs<T> setTitle(final String title) {
        this.title = title;
        return this;
    }

    public DMBaseDialogConfigs<T> setContentRes(final int contentRes) {
        this.content = activity.getString(contentRes);
        return this;
    }

    public DMBaseDialogConfigs<T> setContent(final String content) {
        this.content = content;
        return this;
    }

    public DMBaseDialogConfigs<T> setPositiveRes(final int positiveRes) {
        this.positive = activity.getString(positiveRes);
        return this;
    }

    public DMBaseDialogConfigs<T> setPositive(final String positive) {
        this.positive = positive;
        return this;
    }

    public DMBaseDialogConfigs<T> setNegativeRes(final int negativeRes) {
        this.negative = activity.getString(negativeRes);
        return this;
    }

    public DMBaseDialogConfigs<T> setNegative(final String negative) {
        this.negative = negative;
        return this;
    }

    public DMBaseDialogConfigs<T> setNeutralRes(final int neutralRes) {
        this.neutral = activity.getString(neutralRes);
        return this;
    }

    public DMBaseDialogConfigs<T> setNeutral(final String neutral) {
        this.neutral = neutral;
        return this;
    }

    public DMBaseDialogConfigs<T> setImageRes(final int imageRes) {
        this.drawable = ContextCompat.getDrawable(activity, imageRes);
        return this;
    }

    public DMBaseDialogConfigs<T> setBitmap(final Bitmap bitmap) {
        this.drawable = new BitmapDrawable(activity.getResources(), bitmap);
        return this;
    }

    public DMBaseDialogConfigs<T> setDrawable(final Drawable drawable) {
        this.drawable = drawable;
        return this;
    }

    public DMBaseDialogConfigs<T> setRegularFont(final Typeface regularFont) {
        this.regularFont = regularFont;
        return this;
    }

    public DMBaseDialogConfigs<T> setMediumFont(final Typeface mediumFont) {
        this.mediumFont = mediumFont;
        return this;
    }

    public DMBaseDialogConfigs<T> setTitleColor(final int titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public DMBaseDialogConfigs<T> setContentColor(final int contentColor) {
        this.contentColor = contentColor;
        return this;
    }

    public DMBaseDialogConfigs<T> setPositiveColor(final int positiveColor) {
        this.positiveColor = positiveColor;
        return this;
    }

    public DMBaseDialogConfigs<T> setNegativeColor(final int negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public DMBaseDialogConfigs<T> setNeutralColor(final int neutralColor) {
        this.neutralColor = neutralColor;
        return this;
    }

    public DMBaseDialogConfigs<T> setBackgroundColor(final int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public DMBaseDialogConfigs<T> setDividerColor(final int dividerColor) {
        this.dividerColor = dividerColor;
        return this;
    }

    public DMBaseDialogConfigs<T> setAutoDismiss(final DMAlertConstants.DialogActionStatus autoDismiss) {
        this.autoDismiss = autoDismiss;
        return this;
    }

    public DMBaseDialogConfigs<T> setCancelable(final DMAlertConstants.DialogActionStatus cancelable) {
        this.cancelable = cancelable;
        return this;
    }

    public DMBaseDialogConfigs<T> setCustomView(final View customView) {
        this.customView = customView;
        return this;
    }

    public DMBaseDialogConfigs<T> setList(final List<T> list) {
        this.list = list;
        return this;
    }

    public DMBaseDialogConfigs<T> setListener(final DMBaseClickListener<T> listener) {
        this.listener = listener;
        return this;
    }

    public DMBaseDialogConfigs<T> setDialogType(final DMAlertConstants.DialogType dialogType) {
        this.dialogType = dialogType;
        return this;
    }
}
