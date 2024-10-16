# Workout Tracker Java Application

## Overview

This Java application functions as a workout tracker, allowing users to set and track exercise goals for Burpees, Push-ups, Sit-ups, and Squats. It prompts users to input the number of repetitions, tracks the remaining count, and provides feedback when a set target is reached or exceeded. The session concludes once all exercise goals are completed.

## Features

- **Custom Exercise Goals:** Users can set their own goals for each exercise at the start of the session.
- **Real-time Tracking:** The application tracks the number of exercises left and informs the user after each input.
- **Completion Feedback:** Users receive immediate feedback when they complete their goals or exceed the expected number of repetitions.

## How to Use

1. **Start the Application:** Run `Main.java`.
2. **Set Exercise Goals:** Input the desired number of repetitions for Burpees, Push-ups, Sit-ups, and Squats.
3. **Log Exercises:** During the workout, enter the type of exercise performed and the number of repetitions.
4. **Complete the Session:** The program will end once all set exercises are completed.

## Classes and Methods

### Main.java

- Initializes the program and handles user input.
- Manages the workout session using an instance of the `Idman` class.

### Idman.java

- **Methods:**
  - `public void hareketYap(String hareketTuru,int sayi)`: Logs each exercise and updates the count.
  - `public boolean idmanBittiMi()`: Checks if all exercise goals have been met.
  - Getters and Setters for each exercise count.

## Requirements

- Java Runtime Environment (JRE) to run the Java program.

## Author

- **Hekimcan Aktas**

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.
