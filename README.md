View Flipper blog content:
##Introduction
ViewFlipper forms part of the class ViewAnimator and its main function is to switch from one view to another. In other words, it is sort of a transition widget which helps coders in adding transition on the views inside the ViewFlipper and make a transition less from one screen to another less boring. This flipping feature can be used regardless of the types of the views selected. For example, we can use ViewFlipper to change from a TextView to an ImageView/Button/etc. It does not have to be TextView to TextView or ImageView to ImageView and so on. Furthermore, it can be set to automatically transition from one view to another by using an already available method.
##History 
We can say that ViewFlipper is pretty much ancient into the Android world as it was introduced with the first release of Android API level 1 which is also known as version code "BASE". However, it is still widely used and is currently compatible with the latest release of Android API level 29.
##Major Methods & Attributes
ViewFlipper makes use of a wide variety of methods and attributes which are both dedicated and inherited. There are mainly two dedicated XML attributes: 
android:autoStart	 
android:flipInterval

And way too many inherited XML attributes but they can be compressed into only 4 classes, namely:
class android.widget.ViewAnimator
class android.widget.FrameLayout
class android.view.ViewGroup
class android.view.View

As mentioned earlier, ViewFlipper also makes use of many methods and as for any other widget, these methods are both public and protected. Below, I have separated the public and protected methods into two different sections.
Public Methods:
CharSequence getAccessibilityClassName() -Return the class name of an object to be used for accessibility purposes.

int getFlipInterval() -Get the delay before flipping to the next view occurs.

Boolean isAutoStart() -Returns true if this view automatically calls startFlipping() when it becomes attached to a window.

Boolean isFlipping() -Returns true if the child views are flipping.

void setAutoStart(boolean autoStart) -Set if a view automatically calls startFlipping() when it becomes attached to a window.

void setFlipInterval(int milliseconds) -Sets wait time before flipping to the next view in milliseconds.

void startFlipping() -Start a timer to cycle through child views.

void stopFlipping() -Method to discontinue the flips

Protected Methods:
void onAttachedToWindow() -This is called to attach the view to a window.

void onDetachedFromWindow() -This is called when the view has been detached from a window.

void onWindowVisibilityChanged(int visibility) -Called when the window containing has change its visibility which can be of 3 states: GONE, INVISIBLE, and VISIBLE.

