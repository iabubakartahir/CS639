# CircleApp - Circle Area Calculator

An Android application built with Kotlin that calculates the area of a circle given its radius.

## Features

- **Input Validation**: Prevents crashes by validating user input
- **Beautiful UI**: Modern Material Design with multiple colors
- **Circle Image**: Visual representation of a circle
- **Error Handling**: User-friendly error messages for invalid inputs
- **Formula Display**: Shows the formula (Area = π × r²) for reference

## Requirements

- Android Studio
- Minimum SDK: 24 (Android 7.0)
- Target SDK: 34 (Android 14)
- Kotlin

## Building the App

1. Open the project in Android Studio
2. **IMPORTANT - Configure Gradle Settings:**
   - Go to **File > Settings** (or **Android Studio > Preferences** on Mac)
   - Navigate to **Build, Execution, Deployment > Build Tools > Gradle**
   - Select **"Use Gradle from: 'gradle-wrapper.properties' file"** (NOT "Use default gradle wrapper")
   - Click OK
3. **Invalidate Caches:**
   - Go to **File > Invalidate Caches...**
   - Check all options and click **"Invalidate and Restart"**
   - Wait for Android Studio to restart
4. Sync Gradle files (click "Sync Now" or File > Sync Project with Gradle Files)
5. Build the project (Build > Make Project)
6. Run on an emulator or physical device

### Troubleshooting Java Version Issues

If you see "Unsupported class file major version 65" error:
1. The project uses Gradle 8.7 which supports Java 21
2. Make sure Android Studio is using the project's Gradle wrapper (see step 2 above)
3. Clear Gradle cache: Run in terminal from project root: `rm -rf ~/.gradle/caches/8.0`
4. Invalidate caches and restart Android Studio (see step 3 above)

## Generating APK

To generate a release APK:
1. Build > Generate Signed Bundle / APK
2. Select APK
3. Follow the signing process
4. The APK will be generated in `app/build/outputs/apk/release/`

## Project Structure

```
CircleApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/circleapp/
│   │       │   └── MainActivity.kt
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   ├── values/
│   │       │   │   ├── strings.xml
│   │       │   │   ├── colors.xml
│   │       │   │   └── themes.xml
│   │       │   └── drawable/
│   │       │       ├── circle_image.xml
│   │       │       └── result_background.xml
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## GitHub Deliverables

Please ensure the following are pushed to the root of your GitHub repository:

- ✅ Code (entire project)
- ⬜ 2-3 screenshots of the app (at root level)
- ⬜ APK file (at root level)
- ⬜ Video demo < 2 minutes (at root level)

## How It Works

1. User enters a radius value (must be a positive number)
2. App validates the input:
   - Checks if field is not empty
   - Validates it's a valid number
   - Ensures it's greater than zero
3. Calculates area using the formula: **Area = π × r²**
4. Displays the result in a formatted way

## Colors Used

- Primary Blue: #2196F3
- Dark Blue: #1976D2
- Accent Orange: #FF9800
- Success Green: #4CAF50
- Error Red: #F44336
- Background Light: #F5F5F5

## Variable Naming

All variables use descriptive names:
- `radiusInput` - User input string
- `radius` - Converted double value
- `area` - Calculated area result
- `formattedArea` - Formatted result for display

