# AnimaFelis Pet State Machine 🐱

A pixel-art-inspired virtual pet logic demo built in Android Studio (Java), simulating emotional state transitions based on player interaction. Part of the **AnimaFelis** project — an emotional well-being virtual pet game.

## Overview

This app models a simple but expressive pet state machine: three core stats (Hunger, Happiness, Energy) drive five possible emotional states, and four player actions shift those stats in real time. It's a logic/OOP prototype — the actual AnimaFelis game will be built in **Unity** for full pixel-art animation and expressiveness, but this project demonstrates the underlying state and stat system in plain Java.

## Features

- **5 Pet States** — HAPPY, SAD, HUNGRY, TIRED, NEGLECTED, each reflected with a cat emoji and label
- **3 Core Stats** — Hunger, Happiness, Energy (0–100), shown as live progress bars
- **4 Player Actions** — Feed, Play, Rest, Ignore, each with distinct effects on stats
- **Reactive UI** — stats and pet mood update instantly on every action
- **Dark purple theme** consistent with the AnimaFelis visual identity

## How It Works

| Action | Hunger | Happiness | Energy |
|--------|--------|-----------|--------|
| Feed   | +25    | —         | +5     |
| Play   | -10    | +25       | -15    |
| Rest   | -5     | —         | +30    |
| Ignore | -10    | -15       | -5     |

State is derived from current stats each time an action is taken:
- **Hungry** if Hunger ≤ 20
- **Tired** if Energy ≤ 20
- **Neglected** if Happiness ≤ 20
- **Happy** if all stats ≥ 60
- **Sad** otherwise

## Tech Stack

- **Language:** Java
- **Platform:** Android Studio
- **Min SDK:** 24
- **UI:** XML layout, ProgressBar + emoji-based state display

## Screenshots

| Happy | Sad | Hungry | Tired |
|-------|-----|--------|-------|
| ![Happy state](screenshots/happy.png) | ![Sad state](screenshots/sad.png) | ![Hungry state](screenshots/hungry.png) | ![Tired state](screenshots/tired.png) |

## Roadmap

This Android/Java version exists as a portfolio-friendly demonstration of the pet's underlying logic and OOP structure. The actual AnimaFelis game — with full pixel-art animation, expressive pet behavior, and polished interactions — is being developed in **Unity**. This project's state machine and stat system will carry over conceptually into that build.

## Related Projects

- [AnimaFelis Mood Logger](https://github.com/AzuMaooo/animafelis-mood-logger) — mood logging companion app

---
Built by [AzuMaooo](https://github.com/AzuMaooo) as part of the AnimaFelis portfolio series.