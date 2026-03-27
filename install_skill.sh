#!/bin/bash

# Script to install a new skill into the agent's skills directory

set -e

SKILL_DIR=".agent/skills"
SKILL_NAME=$1
SKILL_SOURCE=$2

if [ -z "$SKILL_NAME" ]; then
    echo "Usage: $0 <skill-name> [skill-source-path-or-url]"
    echo "Example 1 (Create from template): $0 my-new-skill"
    echo "Example 2 (Install from local dir): $0 my-new-skill /path/to/skill/folder"
    echo "Example 3 (Install from Git repo):  $0 my-new-skill https://github.com/user/repo.git"
    exit 1
fi

TARGET_DIR="$SKILL_DIR/$SKILL_NAME"

# Check if skill already exists
if [ -d "$TARGET_DIR" ]; then
    echo "Error: Skill '$SKILL_NAME' already exists in $TARGET_DIR."
    exit 1
fi

mkdir -p "$TARGET_DIR"

if [ -n "$SKILL_SOURCE" ]; then
    # If source is a URL (git clone)
    if [[ "$SKILL_SOURCE" == http* || "$SKILL_SOURCE" == git@* ]]; then
        echo "Installing skill '$SKILL_NAME' from repository $SKILL_SOURCE..."
        git clone "$SKILL_SOURCE" "$TARGET_DIR"
        # Removing the .git folder so it's just the skill files inside the main project
        rm -rf "$TARGET_DIR/.git"
    # If source is a local directory (copy)
    elif [ -d "$SKILL_SOURCE" ]; then
        echo "Installing skill '$SKILL_NAME' from local directory $SKILL_SOURCE..."
        cp -r "$SKILL_SOURCE/"* "$TARGET_DIR/"
    else
        echo "Error: Skill source '$SKILL_SOURCE' is not a valid directory or git URL."
        rm -rf "$TARGET_DIR"
        exit 1
    fi
else
    # Create a basic skill template if no source is provided
    echo "Creating empty skill template for '$SKILL_NAME'..."
    cat <<EOF > "$TARGET_DIR/SKILL.md"
---
name: $SKILL_NAME
description: Auto-generated template for $SKILL_NAME
---

# $SKILL_NAME Skill

This skill provides instructions for...

## Core Directives

1. Point 1
2. Point 2
EOF
fi

# Ensure SKILL.md exists
if [ ! -f "$TARGET_DIR/SKILL.md" ]; then
    echo "Warning: Installed skill does not contain a SKILL.md file! A skill requires this file."
fi

echo "Skill '$SKILL_NAME' has been installed to '$TARGET_DIR' successfully!"
