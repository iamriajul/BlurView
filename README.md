[![](https://jitpack.io/v/iamriajul/BlurView.svg)](https://jitpack.io/#iamriajul/BlurView)

# BlurView

help you to implement Spinner view with Online Data support + Searchable + callback and more.

This Library was Inspired by the [Select2](https://select2.org) web library.

Usage:
---

layout:

Inside Normal Layouts
---
```xml
<io.github.iamriajul.blurview.BlurView
    android:id="@+id/blurView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

Inside Constraint Layout
---
```xml
<io.github.iamriajul.blurview.BlurView
    android:id="@+id/blurView"
    android:layout_width="0dp"
    android:layout_height="0dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" />
```

#####** Methods you can use(Kotlin): **
```kotlin
blurview.hide() // View.GONE
blurview.show() // View.VISIBLE
blurview.gone() // View.GONE
blurview.invisible() // View.INVISIBLE
blurview.visible() // View.VISIBLE()
```

Java
======
```java
BlurView blurview = (OnlineSpinner) findViewById(R.id.blurview);
blurview.hide() // View.GONE
blurview.show() // View.VISIBLE
blurview.gone() // View.GONE
blurview.invisible() // View.INVISIBLE
blurview.visible() // View.VISIBLE()
```
*** That's all...

dependency
---
Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
	// ...
	maven { url 'https://jitpack.io' }
    }
}
```
add dependency：

```groovy
dependencies {
    implementation 'com.github.iamriajul:BlurView:1.0'
}
```

Thanks...