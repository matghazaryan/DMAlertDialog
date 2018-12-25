package alertdialog.dm.com.dmalertdialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;

import java.util.List;


public final class DMDialogBaseConfigs<T extends DMDialogAlertDialogItem> {

    private Context context;

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

    private DMDialogIConstants.DialogActionStatus autoDismiss;
    private DMDialogIConstants.DialogActionStatus cancelable;

    private View customView;

    private List<T> list;

    private DMDialogIBaseClickListener<T> listener;

    private DMDialogIConstants.DialogType dialogType;


    public DMDialogBaseConfigs(final Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
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

    public DMDialogIConstants.DialogActionStatus isAutoDismiss() {
        return autoDismiss;
    }

    public DMDialogIConstants.DialogActionStatus isCancelable() {
        return cancelable;
    }

    public View getCustomView() {
        return customView;
    }

    public List<T> getList() {
        return list;
    }

    public DMDialogIBaseClickListener<T> getListener() {
        return listener;
    }

    public DMDialogIConstants.DialogType getDialogType() {
        return dialogType;
    }

    public DMDialogBaseConfigs<T> setContext(final Context context) {
        this.context = context;
        return this;
    }

    public DMDialogBaseConfigs<T> setTitleRes(final int titleRes) {
        this.title = context.getString(titleRes);
        return this;
    }

    public DMDialogBaseConfigs<T> setTitle(final String title) {
        this.title = title;
        return this;
    }

    public DMDialogBaseConfigs<T> setContentRes(final int contentRes) {
        this.content = context.getString(contentRes);
        return this;
    }

    public DMDialogBaseConfigs<T> setContent(final String content) {
        this.content = content;
        return this;
    }

    public DMDialogBaseConfigs<T> setPositiveRes(final int positiveRes) {
        this.positive = context.getString(positiveRes);
        return this;
    }

    public DMDialogBaseConfigs<T> setPositive(final String positive) {
        this.positive = positive;
        return this;
    }

    public DMDialogBaseConfigs<T> setNegativeRes(final int negativeRes) {
        this.negative = context.getString(negativeRes);
        return this;
    }

    public DMDialogBaseConfigs<T> setNegative(final String negative) {
        this.negative = negative;
        return this;
    }

    public DMDialogBaseConfigs<T> setNeutralRes(final int neutralRes) {
        this.neutral = context.getString(neutralRes);
        return this;
    }

    public DMDialogBaseConfigs<T> setNeutral(final String neutral) {
        this.neutral = neutral;
        return this;
    }

    public DMDialogBaseConfigs<T> setImageRes(final int imageRes) {
        this.drawable = ContextCompat.getDrawable(context, imageRes);
        return this;
    }

    public DMDialogBaseConfigs<T> setBitmap(final Bitmap bitmap) {
        this.drawable = new BitmapDrawable(context.getResources(), bitmap);
        return this;
    }

    public DMDialogBaseConfigs<T> setDrawable(final Drawable drawable) {
        this.drawable = drawable;
        return this;
    }

    public DMDialogBaseConfigs<T> setRegularFont(final Typeface regularFont) {
        this.regularFont = regularFont;
        return this;
    }

    public DMDialogBaseConfigs<T> setMediumFont(final Typeface mediumFont) {
        this.mediumFont = mediumFont;
        return this;
    }

    public DMDialogBaseConfigs<T> setTitleColor(final int titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public DMDialogBaseConfigs<T> setContentColor(final int contentColor) {
        this.contentColor = contentColor;
        return this;
    }

    public DMDialogBaseConfigs<T> setPositiveColor(final int positiveColor) {
        this.positiveColor = positiveColor;
        return this;
    }

    public DMDialogBaseConfigs<T> setNegativeColor(final int negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public DMDialogBaseConfigs<T> setNeutralColor(final int neutralColor) {
        this.neutralColor = neutralColor;
        return this;
    }

    public DMDialogBaseConfigs<T> setBackgroundColor(final int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public DMDialogBaseConfigs<T> setDividerColor(final int dividerColor) {
        this.dividerColor = dividerColor;
        return this;
    }

    public DMDialogBaseConfigs<T> setAutoDismiss(final DMDialogIConstants.DialogActionStatus autoDismiss) {
        this.autoDismiss = autoDismiss;
        return this;
    }

    public DMDialogBaseConfigs<T> setCancelable(final DMDialogIConstants.DialogActionStatus cancelable) {
        this.cancelable = cancelable;
        return this;
    }

    public DMDialogBaseConfigs<T> setCustomView(final View customView) {
        this.customView = customView;
        return this;
    }

    public DMDialogBaseConfigs<T> setList(final List<T> list) {
        this.list = list;
        return this;
    }

    public DMDialogBaseConfigs<T> setListener(final DMDialogIBaseClickListener<T> listener) {
        this.listener = listener;
        return this;
    }

    public DMDialogBaseConfigs<T> setDialogType(final DMDialogIConstants.DialogType dialogType) {
        this.dialogType = dialogType;
        return this;
    }
}
