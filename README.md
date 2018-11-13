# DMAlertDialog

###About DMAlertDialog Library

DMNetworking Library is a powerful library for creating Material and custom dialog which is made on top of [this](https://github.com/afollestad/material-dialogs) library.
In DMAlertDialog you can describe your dialogs behaviour and start using it.

###How to integrate


Add it in your root build.gradle at the end of repositories:


	  allprojects {
	      repositories {
		...
		maven { url 'https://jitpack.io' }
	      }
	    }
    
    Add the dependency
    
    dependencies {
	        implementation 'com.github.pmbfish40:DMAlertDialog:1.0.0'
	  }


###Introduction

With DMAlertDialog you can create any type of dialog with Material style. You can also create your custom view. 

***DMAlertDialog has success, warning, error, confirm and custom type dialog***

###Usage

Create your DMExampleAlertDialog class which should be extended from **DMBaseAlertDialog** and describe your dialogs behaviour.

	public class DMExampleAlertDialog extends DMBaseAlertDialog {

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setSuccessDialog(final Activity activity) {
        return new DMBaseDialogConfigs<T>(activity)
                .setTitle("Success")
                .setContent("Success content")
                .setPositive("Yes")
                .setNegative("No")
                .setImageRes(R.drawable.ic_launcher_background)
                .setTitleColor(R.color.colorPrimaryDark)
                .setContentColor(R.color.colorPrimaryDark)
                .setPositiveColor(R.color.colorPrimaryDark)
                .setAutoDismiss(DialogActionStatus.ENABLE)
                .setCancelable(DialogActionStatus.DISABLE);
    }

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setErrorDialog(final Activity activity) {
        return new DMBaseDialogConfigs<T>(activity)
                .setTitle("Error")
                .setContent("Error content")
                .setPositive("Yes")
                .setNegative("No");
    }

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setListDialog(final Activity activity) {
        return new DMBaseDialogConfigs<T>(activity)
                .setPositiveColor(Color.parseColor("#654321"));
    }

    @Override
    public <T extends DMAlertDialogItem> DMBaseDialogConfigs<T> setConfirmDialog(Activity activity) {
        return new DMBaseDialogConfigs<T>(activity).setContent("");
    }
}

And then you can use it wherever you need to.

Here some example:

1. Simple dialog

		private void initSimple() {
		        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs<>(this));
		    }

2. With click listener

		private void initWithListener() {
		        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs<>(this).setListener(new DMBaseClickListener<DMAlertDialogItem>() {
		            @Override
		            public void onPositive() {
		
		            }
		        }));
		    }

3. With some params

		    private void initWithSomeParams() {
		        new DMExampleAlertDialog().showSuccessDialog(new DMBaseDialogConfigs<>(this)
		                .setTitleColor(R.color.colorAccent)
		                .setContent("Content")
		                .setPositive("yes")
		                .setCancelable(DMAlertConstants.DialogActionStatus.ENABLE)
		                .setAutoDismiss(DMAlertConstants.DialogActionStatus.DISABLE));
		    }

4. Custom view

		private void initCustomView() {
		        @SuppressLint("InflateParams") final View view = getLayoutInflater().inflate(R.layout.custom_view, null, false);
		        final DMAlertDialog dialog = new DMExampleAlertDialog()
		                .showCustomDialog(new DMBaseDialogConfigs<>(this)
		                        .setCustomView(view)
		                        .setCancelable(DMAlertConstants.DialogActionStatus.ENABLE)
		                        .setListener(new DMBaseClickListener<DMAlertDialogItem>() {
		                            @Override
		                            public void onPositive() {
		
		                            }
		                        }));
		
		        new Handler().postDelayed(() -> {
		            dialog.dismiss();
		            ((TextView) dialog.getCustomView().findViewById(R.id.tv_title)).setText("Title 3");
		        }, 3000);
		    }

5. You can create list dialog and get selected item's object

		private void initList() {
		        final List<User> userList = new ArrayList<>();
		        for (int i = 0; i < 10; i++) {
		            userList.add(new User("name " + i, i + 10));
		        }
		
		        new DMExampleAlertDialog().showListDialog(new DMBaseDialogConfigs<User>(this)
		                .setPositive("Yes")
		                .setNegative("No")
		                .setNeutral("close")
		                .setList(userList)
		                .setListener(new DMBaseClickListener<User>() {
		                    @Override
		                    public void onSelect(final User user) {
		
		                    }
		
		                    @Override
		                    public void onPositive() {
		
		                    }
		                }));
		    }
		    
6. Error dialog

		private void initError() {
		        new DMExampleAlertDialog().showErrorDialog(new DMBaseDialogConfigs<>(this)
		                .setTitle("Title error")
		                .setContent("error content")
		                .setImageRes(R.drawable.icon_error));
		    }
