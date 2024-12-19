# GIT
## Cleanup all from GIT and save the local 
### Remove the files from the index (not the actual files in the working copy)
$ git rm -r --cached .
### Add these removals to the Staging Area...
$ git add .
### ...and commit them!
$ git commit -m "Clean up ignored files"


# For MAC
ssh-keygen -t ed25519 -C “srinivasan.ramjee@gmail.com”
git remote set-url origin git@github.com:sramjee/_git