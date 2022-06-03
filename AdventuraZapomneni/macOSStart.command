#!/bin/bash
#
# This script is meant as supportive start script for
# UNIX-like systems, e.g., Linux or macOS
#
# Tento pomocný spouštěcí skript je určen pro UNIXové systémy (např. Linux, macOS)
#
echo "Spouštění hry..."

relpath=$0
cd ${relpath%`basename $0`}
java -jar /out/artifacts/AdventuraZapomneni_jar/AdventuraZapomneni.jar