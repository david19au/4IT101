#!/bin/bash
#
# This script is meant as supportive start script for macOS and UNIX systems.
#
# Tento pomocný spouštěcí skript je určen pro systémy s macOS nebo UNIX.
#
echo "Spouštění hry..."

install_dir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
java -jar "$install_dir/out/artifacts/AdventuraZapomneni_jar/AdventuraZapomneni.jar"