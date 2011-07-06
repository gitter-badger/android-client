package org.xwiki.android.components;

import org.xwiki.android.components.login.LoginActivity;
import org.xwiki.android.components.navigator.XWikiNavigatorActivity;
import org.xwiki.android.components.objecteditor.ObjectEditorActivity;
import org.xwiki.android.components.objectnavigator.ObjectNavigatorActivity;
import org.xwiki.android.components.propertyeditor.PropertyEditorActivity;
import org.xwiki.android.resources.Objects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Main extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.main);

		// startActivity(new Intent(this, SampleListActivity.class));
		// startActivity(new Intent(this, PropertyEditorActivity.class));
		// startActivity(new Intent(this, ObjectEditorActivity.class));
		// startActivity(new Intent(this, ObjectNavigatorActivity.class));
		// startActivity(new Intent(this, LoginActivity.class));
		startActivityForResult(new Intent(this, LoginActivity.class), 0);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == 0) {
			Log.d("Activity", "returned");
			if (resultCode == Activity.RESULT_OK) {
				Log.d("Activity Result", "OK");
			}
		}

	}
}