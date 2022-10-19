#!/usr/bin/env bash
# close Android Studio
rm -rf .idea
rm -rf .gradle
find . | grep -e .iml$ | xargs rm
