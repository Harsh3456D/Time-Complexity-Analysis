# 🔐 Brute-Force Time Complexity Dashboard

A research initiative analyzing the performance, efficiency, and time complexity of brute-force algorithms across different programming languages. This project visualizes how Python, JavaScript, Java and C++ handle computational stress during password cracking scenarios.

## 🚀 Overview

Understanding the speed at which passwords can be cracked is vital for modern cybersecurity. This project implements identical linear brute-force algorithms in three major stacks to benchmark their raw processing power:

* **Python**: Interpreted, ease-of-use focus.
* **Node.js (JavaScript)**: V8 engine, JIT compiled.
* **C++**: Compiled, low-level optimization.

The project includes a **Matplotlib Dashboard** that visualizes the exponential growth of time complexity as password length increases ($O(10^n)$).

## 📊 Current Benchmarks
*Data based on 9-digit brute-force stress tests.*

| Language | Complexity Trend | Performance Tier |
| :--- | :--- | :--- |
| **C++** | Extremely Linear | ⚡ **Fastest** (Compiled machine code) |
| **Node.js** | Optimized V8 | 🚀 **High Performance** (Surprising efficiency) |
| **Python** | Exponential Lag | 🐢 **Slower** (Overhead of interpreter) |
| **Java** | Will be updated | pending |

## 🛠️ Tech Stack & Requirements

### Languages
* **Python 3.x** (Required for the Dashboard)
* **C++** (MinGW / G++ Compiler)
* **Node.js** (Runtime environment)

### Libraries
* `matplotlib` (Python)
* `numpy` (Python)
* `chrono` (C++)
* `perf_hooks` (Node.js)

## 📂 Project Structure

```bash
├── crack.cpp          # C++ Implementation (High Speed)
├── crack.js           # JavaScript Implementation (V8 Engine)
├── crack.py           # Python Implementation (Baseline)
├── Dashboard.py       # Data Visualization Tool (Matplotlib)
└── crack.exe          # Compiled C++ Executable
