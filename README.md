# InternLists
Assignment for internship interview using Android Studio. The task was to pass an array from one activity to another.
In the first activity, have a button which loads the second activity and displays a list of the array data passed from the first.

Here is how I approached this problem:

1. Create a string array called `interns` and populate it with data.
2. Create a new activity called `ListActivity` which will display the array data in a ListView.
3. Make a ListView in `activity_list.xml` and give it the id `internList`.
4. Pass array `interns` from `MainActivity` to `ListActivity` using an Intent `intentListActivity` and the `putExtra()` intent method.
5. Add attribute `android:onClick="openListActivity"` to ButtonView on `MainActivity` so that the method `openListActivity` runs
and opens `ListActivity` when tapped.
6. In `ListActivity`, collect `interns` array from `MainActivity` with `getIntent().getStringArrayExtra("interns")` and store in local
string array called `interns`.
7. Next, find a ListView to attach `interns` data to by using `findViewById()` method and setting to `internListView`.
8. Create array adapter `internsAdapter` to map array data to ListView.
9. Set `internsAdapter` to `internListView` with `setAdapter()` method.

## My Process
Originally, when I first made/committed this code, it did not display the array data in the `ListActivity`. In fact, the application crashed upon running it.
After submission, I found that this was because I used the incorrect method to extract the data passed from the `MainActivity`.
Instead of using `getStringArrayExtra("interns")`, I mistakenly used `getStringArrayListExtra("interns")`, which caused a null-object
error in Android Studio.

This was not compatible with the `putExtra()` method on the `intentListActivity` intent I created in `MainActivity`. Another option might
have been to use `putStringArrayListExtra()` on the intent instead to pass the data to `ListActivity`.
