#!/bin/bash

echo "Compiling Banking Application..."
javac *.java

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "Running Banking Application Demo..."
    java BankingApplicationDemo
else
    echo "Compilation failed. Please check for errors."
fi