# simple-projects

Here are the simple steps to push your code to Git:

1. Initialize Git (if not already done):
git init

2. Add Remote Repository (if not already added):
git remote add origin <repository-URL>
git remote add origin https://github.com/username/repository.git

3. Add Files to Staging Area:
git add .
This stages all the files in your project.

4. Commit Your Changes:
git commit -m "Your commit message"

5. Push to the Remote Repository:
git push -u origin <branch-name>
git push -u origin main

[                                                                       |]
[                        Remove-Item -Recurse -Force .git               |]
[                       git init                                        |]
[                       git add .                                       |]
[                       git commit -m "Initial commit"                  |]
[                       git branch -M main                              |]
[                       git status                                      |]
[                                                                       |]
