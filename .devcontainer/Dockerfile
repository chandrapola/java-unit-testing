# See here for image contents: https://github.com/devcontainers/templates/tree/main/src/java
# [Choice] Java version (use -bullseye variants on local arm64/Apple Silicon): 11, 17, 11-bullseye, 17-bullseye, 11-buster, 17-buster
ARG VARIANT="25"
FROM mcr.microsoft.com/devcontainers/java:${VARIANT}-bookworm

# [Option] Install Maven
ARG INSTALL_MAVEN="true"
ARG MAVEN_VERSION=""
RUN if [ "${INSTALL_MAVEN}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install maven \"${MAVEN_VERSION}\""; fi