# GIT
## Cleanup all from GIT and save the local 
### Remove the files from the index (not the actual files in the working copy)
$ git rm -r --cached .
### Add these removals to the Staging Area...
$ git add .
### ...and commit them!
$ git commit -m "Clean up ignored files"