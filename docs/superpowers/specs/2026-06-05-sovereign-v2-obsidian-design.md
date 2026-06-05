# Design Spec: Hermes Sovereign V2 Obsidian Knowledge Base

## Overview
Transform the user's `HermesObsi` Obsidian vault into a comprehensive, modular knowledge base that acts as the "Second Brain" for the Hermes Sovereign V2 system. This system will combine high-level architectural documentation with raw, machine-readable `SKILL.md` formats.

## Architecture & Structure

The vault will be structured into four main interconnected markdown files located at `/storage/emulated/0/HermesObsi/` (linked locally via `~/storage/shared/HermesObsi/`).

### 1. `Sovereign_V2_Hub.md` (The Root Index)
- **Purpose:** The master dashboard and entry point.
- **Content:**
  - Frontmatter tags (e.g., `#hermes`, `#sovereign-v2`).
  - High-level system architecture (Mermaid diagram depicting PRoot -> Relay -> Android).
  - Critical Connection Data: Port `8766`, Manual Token requirement.
  - Emergency Restart Protocol (Nuclear kill bash script).
  - **Wikilinks:** Outbound links to the detailed workflow and skill nodes.

### 2. `Skill_Sovereign_Orchestrator.md` (The Machine Payload)
- **Purpose:** A direct mirror of a Superpowers `SKILL.md` file. It allows the user to point any AI agent to this file to instantly impart the ability to control the Android phone.
- **Content:**
  - Standard Superpowers frontmatter (`name`, `description`).
  - XML `<instructions>` block detailing the precise usage of `android_read_screen`, `android_tap`, and macro orchestrations.
  - Prerequisite checks (pinging the `8766` port).

### 3. `Workflow_Content_Empire.md` (The Macro Guide)
- **Purpose:** Documentation of the automated social media posting pipeline.
- **Content:**
  - Step-by-step logic of the "Mr. Beast" pipeline: Ideation (ChatGPT) -> Assembly -> Distribution (TikTok, IG, YT).
  - Required UI states and fallback mechanisms.

### 4. `Workflow_Multi_Brain.md` (The AI Routing Guide)
- **Purpose:** Documentation on how Hermes delegates sub-tasks to native Android AI apps.
- **Content:**
  - **NotebookLM:** Deep research instructions via browser.
  - **ChatGPT:** Creative copywriting instructions via the native app.
  - **Gemini:** System tasks and AppFunctions hand-offs.
  - Self-Healing protocols (Account switching for rate limits).

## Dependencies
- Obsidian installed on the host device.
- Write access to `~/storage/shared/HermesObsi/`.

## Error Handling
- Files will be overwritten cleanly if they already exist to ensure the latest V2 standards are applied.
- The termux storage symlink must be active.