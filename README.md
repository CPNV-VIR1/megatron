# MASTER-README 

Megatron Application

## Description

This project is design to return transformers products.

## Getting Started

### Prerequisites

List all dependencies and their version needed by the project as :

* Docker Engine
* Intellij Idea Ultimate

## Deployment

### On dev environment

```shell
git clone https://github.com/CPNV-VIR1/megatron.git
```

```shell
docker compose up --build
```

## Directory structure

* Tip: try the tree bash command

```shell
C:.
├───.idea
│   └───inspectionProfiles
├───.mvn
│   └───wrapper
├───db
├───docs
├───megatron.wiki
├───ms-api-gateway
├───ms-db
├───ms-delete
│   ├───.mvn
│   │   └───wrapper
│   └───src
│       ├───main
│       │   ├───java
│       │   │   └───ch
│       │   │       └───cpnves
│       │   │           └───megatron
│       │   │               ├───Controllers
│       │   │               ├───Entities
│       │   │               └───Repositories
│       │   └───resources
│       └───test
│           └───java
│               └───ch
│                   └───cpnves
│                       └───megatron
├───ms-get
│   ├───.mvn
│   │   └───wrapper
│   └───src
│       ├───main
│       │   ├───java
│       │   │   └───ch
│       │   │       └───cpnves
│       │   │           └───megatron
│       │   │               ├───Controllers
│       │   │               ├───Entities
│       │   │               └───Repositories
│       │   └───resources
│       └───test
│           └───java
│               └───ch
│                   └───cpnves
│                       └───megatron
├───ms-post
│   ├───.mvn
│   │   └───wrapper
│   └───src
│       ├───main
│       │   ├───java
│       │   │   └───ch
│       │   │       └───cpnves
│       │   │           └───megatron
│       │   │               ├───Controllers
│       │   │               ├───Entities
│       │   │               └───Repositories
│       │   └───resources
│       └───test
│           └───java
│               └───ch
│                   └───cpnves
│                       └───megatron
├───ms-put
│   ├───.mvn
│   │   └───wrapper
│   └───src
│       ├───main
│       │   ├───java
│       │   │   └───ch
│       │   │       └───cpnves
│       │   │           └───megatron
│       │   │               ├───Controllers
│       │   │               ├───Entities
│       │   │               └───Repositories
│       │   └───resources
│       └───test
│           └───java
│               └───ch
│                   └───cpnves
│                       └───megatron
├───src
│   ├───main
│   │   ├───java
│   │   │   └───ch
│   │   │       └───cpnves
│   │   │           └───megatron
│   │   │               ├───Controllers
│   │   │               ├───Entities
│   │   │               └───Repositories
│   │   └───resources
│   └───test
│       └───java
│           └───ch
│               └───cpnves
│                   └───megatron
└───target
    ├───classes
    │   └───ch
    │       └───cpnves
    │           └───payroll
    │               ├───Controllers
    │               ├───Entities
    │               └───Repositories
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       └───testCompile
    │           └───default-testCompile
    └───test-classes
        └───ch
            └───cpnves
```

## Collaborate

We encourage collaboration and welcome contributions from the community. Here’s how you can get involved:

### Propose a New Feature

If you have an idea for a new feature, please follow these steps:

1. **Open an Issue**: Describe the feature you would like to add. Include details about its functionality and how it will benefit the project.
2. **Pull Request**: Once the issue is discussed and approved, you can start working on it. Submit a pull request (PR) with your changes. Ensure your PR is linked to the issue.

### Commit Guidelines

To maintain a clear and meaningful commit history, please follow these commit message conventions:

- **chore**: Commit messages for routine tasks and maintenance (e.g., `chore: update dependencies`).
- **feat**: Commit messages for new features (e.g., `feat: add user login feature`).
- **fix**: Commit messages for bug fixes (e.g., `fix: resolve issue with user login`).
- **refactor**: Commit messages for code refactoring (e.g., `refactor: optimize login algorithm`).
- **docs**: Commit messages for documentation changes (e.g., `docs: update README with new feature`).

### Workflow

Our development workflow follows the guidelines outlined in the Gitbook. 
