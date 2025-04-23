# Social Cooper Android

![Platform](https://img.shields.io/badge/Platform-Android-brightgreen)
![Language](https://img.shields.io/badge/Language-Kotlin-purple)
![UI](https://img.shields.io/badge/UI-Jetpack%20Compose-blue)
![License](https://img.shields.io/badge/License-CC0--1.0-lightgrey)

## Overview

Social Cooper is a modern Android social network application built with Jetpack Compose. The app allows users to create accounts, share posts, interact with other users' content through comments and likes, and engage in various social activities.

## Screenshots

<!-- Add screenshots here once available -->

## Features

- **User Authentication**
  - Register new accounts
  - Login with existing credentials
  - Secure authentication flow

- **Social Interactions**
  - Create and publish posts with text and images
  - Like and comment on posts
  - View activity feed
  - Profile management

- **Modern UI/UX**
  - Material Design 3 implementation
  - Dark/Light theme support
  - Responsive layouts for different screen sizes
  - Smooth animations and transitions

## Architecture

The application is built using modern Android development practices:

- **MVVM Architecture**: Clear separation of presentation logic from business logic
- **Clean Architecture**: Organized in modules with distinct responsibilities:
  - `app`: Main application module and entry point
  - `data`: Data sources, repositories implementations, and API services
  - `domain`: Business logic, use cases, and domain models
  - `ui`: Presentation layer with Jetpack Compose components

- **Dependency Injection**: Implemented with Hilt for better testability and modularity
- **Repository Pattern**: Abstraction over data sources for clean data access
- **Use Case Pattern**: Encapsulation of business logic in reusable components

## Tech Stack

- **Kotlin**: 100% Kotlin codebase
- **Jetpack Compose**: Modern declarative UI toolkit
- **Coroutines & Flow**: For asynchronous operations and reactive programming
- **Hilt**: Dependency injection
- **Retrofit & OkHttp**: For network operations
- **Coil**: Image loading and caching
- **Room**: Local data persistence (if applicable)
- **Material 3**: Modern UI components and design

## Backend

This application works with the SocialKtor backend, built with Kotlin and Ktor. The backend repository can be found at:
[https://github.com/bernatdelgado87/SocialKtor](https://github.com/bernatdelgado87/SocialKtor)

## Video Demo

### Register

https://github.com/bernatdelgado87/Social-Cooper-Android/assets/52576076/bbab8494-7d08-4d47-adb9-d7f63941b7fd

### Publish Post

https://github.com/bernatdelgado87/Social-Cooper-Android/assets/52576076/3e4b15a4-685b-4a8e-825d-4b6ad8713480

### Comments and Likes

https://github.com/bernatdelgado87/Social-Cooper-Android/assets/52576076/3d2efa65-a6e8-4e17-89b2-f1aea467da14

## Getting Started

### Prerequisites

- Android Studio Arctic Fox (2020.3.1) or newer
- JDK 11 or higher
- Android SDK 21+

### Installation

1. Clone the repository:
```bash
git clone https://github.com/bernatdelgado87/Android-Social-Network.git
```

2. Open the project in Android Studio.

3. Sync Gradle files and build the project.

4. Configure the backend endpoint in the app's configuration files.

5. Run the application on a device or emulator.

## Usage

### Registration

1. Launch the app and navigate to the registration screen
2. Enter your details and create an account
3. Verify your account (if required)

### Creating Posts

1. From the main feed, tap the compose button
2. Add text and optionally attach images
3. Publish your post to share with others

### Interacting with Content

- Like posts by tapping the heart icon
- Comment on posts using the comment button
- Share posts with the share functionality

## Contributing

Contributions are welcome! If you'd like to contribute:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/amazing-feature`
3. Commit your changes: `git commit -m 'Add some amazing feature'`
4. Push to the branch: `git push origin feature/amazing-feature`
5. Open a Pull Request

Please make sure to update tests as appropriate and adhere to the existing coding style.

## License

This project is licensed under the Creative Commons Zero v1.0 Universal License - see the [LICENSE](LICENSE) file for details.

## Contact

Bernat Delgado - [@bernatdelgado87](https://github.com/bernatdelgado87)

Project Link: [https://github.com/bernatdelgado87/Android-Social-Network](https://github.com/bernatdelgado87/Android-Social-Network)

License
This project is licensed under the Creative Commons License. See the LICENSE file for more details.

2024 SocialKtor. Developed by Bernat Delgado.
