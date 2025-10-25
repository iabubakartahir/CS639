# ABUBAKAR - AboutMe Android App

## Project Description
This Android application was created as part of an assignment to showcase personal information through a well-designed mobile interface. The app demonstrates navigation between fragments, Material Design principles, and proper string externalization.

## Developer Information
- **Name**: Abubakar
- **Email**: AT82755n@pace.edu
- **University**: Pace University - Seidenberg School
- **Program**: Master's in Computer Science
- **Location**: New York, NY
- **Background**: International student from Pakistan

## App Features

### 🏠 Biography Fragment (Main Screen)
- Personal biography highlighting academic journey from Pakistan to Pace University
- Two centered buttons: "Hobbies" and "Contact"
- Scrollable content with proper Material Design styling

### 🎯 Hobbies Fragment (Fragment 2)
- Detailed list of personal interests including:
  - Coding and programming languages
  - Reading tech blogs and research papers
  - Playing cricket (connection to Pakistani heritage)
  - Gaming and mobile games
  - Exploring New York City
  - Photography and tech meetups
- "Previous" button for navigation back to biography

### 📞 Contact Fragment (Fragment 3 - FragmentThird)
- Complete contact information display:
  - Email: AT82755n@pace.edu
  - Phone: +1 (555) 123-4567
  - University: Pace University - Seidenberg School
  - Location: New York, NY
- "Previous" button for navigation back to biography

### ⚡ Interactive Features
- **Floating Action Button**: Displays email contact information when clicked
- **Toast Message**: Shows "Going to Contact..." when Contact button is pressed
- **Custom Icon**: Pakistan-inspired design with "A" for Abubakar
- **Smooth Navigation**: Fragment-based navigation without complex dependencies

## Technical Implementation

### 📱 Android Configuration
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Latest Android)
- **Template**: Custom implementation with Material Design 3
- **Language**: Java
- **Build System**: Gradle 8.5 with Android Gradle Plugin 8.2.2

### 🎨 Design Elements
- **App Name**: ABUBAKAR (displays on device)
- **Custom Icon**: Vector drawable with Pakistan flag colors (blue/green)
- **Material Design 3**: Modern UI components and theming
- **Constraint Layouts**: Proper button alignment and centering with bias
- **String Externalization**: All text content in strings.xml (no hardcoded strings)

### 🧭 Navigation Architecture
- Fragment-based navigation using FragmentManager
- Simple and reliable navigation without complex dependencies
- Proper fragment lifecycle management
- Back navigation support

## Project Structure
```
AboutMe/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/aboutme/
│   │   │   ├── MainActivity.java
│   │   │   ├── BiographyFragment.java
│   │   │   ├── HobbiesFragment.java
│   │   │   └── FragmentThird.java
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_main.xml
│   │   │   │   ├── fragment_biography.xml
│   │   │   │   ├── fragment_hobbies.xml
│   │   │   │   └── fragment_third.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   ├── colors.xml
│   │   │   │   └── themes.xml
│   │   │   └── drawable/
│   │   │       └── ic_launcher.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── gradle.properties
├── settings.gradle
└── README.md
```

## Assignment Requirements Fulfilled ✅

- ✅ **Project Name**: AboutMe (appears in GitHub)
- ✅ **App Name**: ABUBAKAR (displays on screen)
- ✅ **Custom Icon**: Original design with Pakistan-inspired colors
- ✅ **Two Buttons**: "Hobbies" and "Contact" - properly aligned and centered
- ✅ **Biography**: Personal bio about Master's CS student from Pakistan
- ✅ **Fragment 2**: Hobbies fragment with detailed interests
- ✅ **Fragment 3**: Contact fragment (FragmentThird.java + fragment_third.xml)
- ✅ **String Externalization**: All strings in strings.xml, no hardcoded text
- ✅ **Navigation**: Java-based fragment navigation
- ✅ **Floating Button**: Shows email message on click
- ✅ **Toast Message**: "Going to Contact..." on Contact button press
- ✅ **Fake Contact Info**: University email and phone number

## How to Run
1. Clone the repository
2. Open in Android Studio
3. Sync project with Gradle files
4. Run on device or emulator (API 24+)

## Screenshots
Screenshots of the app will be included showing:
- Main Biography screen with buttons
- Hobbies screen with content
- Contact screen with full information
- Floating Action Button message
- Toast notification

## APK
The compiled APK file `aboutmeabubakar.apk` is included in the root directory for easy installation and testing.

---

**Developed by Abubakar**  
*Master's Student in Computer Science*  
*Pace University - Seidenberg School*  
*New York, NY*
