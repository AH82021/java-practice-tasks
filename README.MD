```markdown
# Welcome to the Java Practice Tasks Repository

This repository contains practice tasks covering fundamental Java concepts:

- **Loops**  
- **Strings**  
- **Arrays**  
- **Classes & Objects**  
- **Inheritance**  
- **Polymorphism**  
- **Abstraction**  
- **Encapsulation**  

Each task is located in the `tasks/` folder as a separate Java file. Follow the instructions below to get started with Git, branch creation, and completing the tasks.

---

## 1. Cloning the Repository

1. Make sure you have [Git](https://git-scm.com/downloads) installed.  
2. Open your terminal (or command prompt).  
3. Navigate to the directory where you want to store the project.  
4. Run the following command to clone the repository:

   ```bash
   git clone https://github.com/AH82021/java-practice-tasks.git
   ```

5. Change into the cloned repository directory:

   ```bash
   cd java-practice-tasks
   ```

---

## 2. Creating a New Branch

1. Make sure you are on the `main` branch (use `git status` or `git branch`).
2. Create a new branch (use a descriptive name, e.g. `feature/john-doe-tasks` or `solution/task1`):

   ```bash
   git checkout -b feature/john-doe-tasks
   ```

   This command creates a new branch and switches you to it immediately.

---

## 3. Making Changes & Committing

1. Open the `tasks/` folder in your favorite IDE or text editor.
2. Complete one of the tasks by editing the corresponding Java file (e.g., `Task1_Loops.java`).
3. Return to your terminal and check what changed:

   ```bash
   git status
   ```

4. Add the changed files to staging:

   ```bash
   git add tasks/Task1_Loops.java
   ```
   *(Or `git add .` to add all changed files.)*

5. Commit your changes with a descriptive message:

   ```bash
   git commit -m "Implement loop solutions in Task1_Loops.java"
   ```

---

## 4. Pushing Your Branch to GitHub

1. Push the branch to the remote repository:

   ```bash
   git push origin feature/john-doe-tasks
   ```

2. If this is the first time you’re pushing this branch, Git may ask you to set the upstream:

   ```bash
   git push --set-upstream origin feature/john-doe-tasks
   ```

---

## 5. Creating a Pull Request (Optional but Recommended)

1. Go to the repository on GitHub.
2. You should see a prompt saying **“Compare & pull request”** for your branch. Click it.
3. Add a meaningful title and description.
4. Submit the pull request.
5. Wait for the repository owner or the instructor to review and merge your changes.

> **Note:** Because of branch protection, **you cannot push directly to `main`**. If you attempt to push to `main`, you will receive an error. Always work in **your own branch** and then open a pull request to merge your work.
```