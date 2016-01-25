# ViewFlowX
ViewFlow modified version to solve the problem of dislocation CircleIndicator smooth,forked from [<b>pakerfeldt/android-viewflow</b>](https://github.com/pakerfeldt/android-viewflow)

<img src="https://github.com/mvpleung/ViewFlow-X/blob/master/art/viewflow.gif" width="320" height="480" />

## Usage

### In your layout

		<org.taptwo.android.widget.ViewFlow
			android:id="@+id/viewflow"
			app:sidebuffer="5"
			/>
		
		<org.taptwo.android.widget.CircleIndicator
            android:id="@+id/viewflowindic"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal|bottom"
            android:layout_marginTop="5dp"
            android:padding="5dp"
            app:activeColor="#EA5300"
            app:activeType="fill"
            app:circleSeparation="10dip"
            app:inactiveColor="#CDCDCD"
            app:inactiveType="fill"
            app:radius="3dip" />

The use of `app:sidebuffer` is optional. It defines the number of Views to buffer on each side of the currently shown View. The default sidebuffer is 3, making up a grand total of 7 (3 * 2 + 1) Views loaded at a time (at max).
To be able to use the more convenient `app:sidebuffer` attribute, the application namespace must be included in the same manner as the android namespace is. Please refer to the layout main.xml in the example project for a full example. Again, note that it's the application namespace and *not* the viewflow namespace that must be referred like `xmlns:app="http://schemas.android.com/apk/res/your.application.package.here"`.

### In your activity

	ViewFlow viewFlow = (ViewFlow) findViewById(R.id.viewflow);
	CircleFlowIndicator indic = (CircleFlowIndicator) findViewById(R.id.viewflowindic);
	viewFlow.setFlowIndicator(indic);
	
    viewFlow.setAdapter(myAdapter);
	viewFlow.setFlowIndicator(indicator);

    
Setting a different initial position (0 being default) is as easy as:

    viewFlow.setAdapter(myAdapter, 8);
    
Although possible, you should not call `setSelection(...)` immediately after calling `setAdapter(myAdapter)` as that might load unnecessary views giving you a decrease in performance.

### Thanks

[pakerfeldt/android-viewflow](https://github.com/pakerfeldt/android-viewflow)
