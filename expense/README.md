# MAD Assignment 2 - Android Common Screens Application

## Student Information
* **Name:** Zuhair Umer
* **Roll Number:** 24108223
* **Program:** BS Artificial Intelligence (5th Semester)
* **University:** SZABIST Islamabad
* **Course:** Mobile Application Development (Java + XML)

---

## Project Overview
This application demonstrates standard mobile UI screens, input validation, explicit intent navigation, multi-layout architecture, and light/dark theme resource handling in native Android using Java and XML.

---

## Implemented Screens & Application Flow
1. **Splash Screen**: Displays app title branding and automatically navigates to the Login screen via a delayed Handler.
2. **Login Screen (`LinearLayout`)**: Accepts Email/Username and Password with input validation. Features simulated login (`admin@szabist.edu` / `123456`) and explicit intents to Register, Forgot Password, and Dashboard.
3. **Register Screen (`LinearLayout`)**: Collects Full Name, Email, Password, and Confirm Password with field validation and password matching logic.
4. **Forgot Password Screen (`LinearLayout`)**: Accepts a registered email address to initiate simulated account recovery.
5. **Reset Password Screen (`LinearLayout`)**: Validates and updates to a new password with confirm-password checks.
6. **Dashboard Screen (`GridLayout`)**: Organizes core application modules in a grid layout structure.
7. **Profile Screen**: Displays student profile information (Zuhair Umer, Roll No: 24108223) with a working Logout action that clears the backstack and returns to the Login screen.

---

## Technical Highlights
* **Alternative Resources**: Configured `strings.xml` and dark-mode color themes inside `res/values-night/colors.xml`.
* **Layout Implementations**: Features `LinearLayout`, `RelativeLayout`, and `GridLayout`.
* **Navigation**: All screen transitions use explicit Android `Intent` objects.
* **Input Validation**: `TextUtils.isEmpty()` and text comparison checks on form controls prior to navigation.

---

## How to Run
1. Clone or download this repository.
2. Open the project in **Android Studio**.
3. Sync Gradle files and press **Run (`Shift + F10`)** on an Android Emulator or connected physical device.
