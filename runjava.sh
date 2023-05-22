#!/bin/sh

# reduces writing repeated lines for compilation.
# works in linux, dk abt windows :(

javac "$1" && java "${1%.java}" && rm "${1%.java}.class"
