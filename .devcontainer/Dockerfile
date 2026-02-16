# See here for image contents: https://github.com/devcontainers/templates/tree/main/src/java
# [Choice] Java version (use -bullseye variants on local arm64/Apple Silicon): 11, 17, 11-bullseye, 17-bullseye, 11-buster, 17-buster
ARG VARIANT="25"
FROM mcr.microsoft.com/devcontainers/java:${VARIANT}-bookworm

RUN apt-get update && apt-get install -y maven