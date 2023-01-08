
# QIndicators 

is a jetpack Compose library will help you showing indicators in your app within buttons, pagers everywhere. 





## Demo
<img src="https://user-images.githubusercontent.com/30949634/211209733-52460b9a-8076-43a7-80fe-5c2c8c96e2db.gif" width="30%" height="30%"/>

## Download

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.qamarelsafadi/qindicators/badge.svg)](https://central.sonatype.dev/artifact/io.github.qamarelsafadi/qindicators/1.0.0)

### Gradle
Add the dependency below to your module level `build.gradle` :

```groovy
dependencies { 

    implementation 'io.github.qamarelsafadi:qindicators:1.0.0'
 
 }
```

## Usage 
You can implement your indicators with composable function as seen in the below:

```kotlin

 var selectedPage by remember {  mutableStateOf(0) }

 Indicators(count = 7,
            size = 10,
            spacer = 5,
            selectedPage,
            indicatorSelectedLength = 60
            modifier = Modifier.align(Alignment.Center),
            selectedColor = Color.Red,
            unselectedColor = PurpleGrey40
            )
            
```







# Find this library useful? ❤️

Star it and Follow me for more content like this. 
