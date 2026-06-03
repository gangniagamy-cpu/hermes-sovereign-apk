#!/bin/bash
TOKEN=$(gh auth token)
git remote set-url neworigin "https://gangniagamy-cpu:$TOKEN@github.com/gangniagamy-cpu/hermes-sovereign-apk.git"
git push neworigin main
