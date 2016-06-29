# Examples
```
[thebeege@beegevm basic_programming_examples]$ git status
# On branch master
# Changes not staged for commit:
#   (use "git add <file>..." to update what will be committed)
#   (use "git checkout -- <file>..." to discard changes in working directory)
#
#	modified:   git/Examples.md
#
# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#
#	git/Reference.md
no changes added to commit (use "git add" and/or "git commit -a")
```
```
[thebeege@beegevm basic_programming_examples]$ git add -A
```
```
[thebeege@beegevm basic_programming_examples]$ git status
# On branch master
# Changes to be committed:
#   (use "git reset HEAD <file>..." to unstage)
#
#	modified:   git/Examples.md
#	renamed:    git/Examples.md -> git/Reference.md
#
```
```
[thebeege@beegevm basic_programming_examples]$ git commit -m "Moved examples into reference. Examples nao."
[master beb058c] Moved examples into reference. Examples nao.
 2 files changed, 15 insertions(+), 49 deletions(-)
 rewrite git/Examples.md (99%)
 rename git/{Examples.md => Reference.md} (80%)
```
```
[thebeege@beegevm basic_programming_examples]$ git push
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (5/5), 1.02 KiB | 0 bytes/s, done.
Total 5 (delta 2), reused 0 (delta 0)
To git@github.com:TheBeege/basic_programming_examples.git
   ae8818f..beb058c  master -> master
```
```
[thebeege@beegevm basic_programming_examples]$ git pull
Already up-to-date.
```
```
[thebeege@beegevm basic_programming_examples]$ git branch
  ko_KR
* master
```
```
[thebeege@beegevm basic_programming_examples]$ git checkout ko_KR
error: Your local changes to the following files would be overwritten by checkout:
	git/Examples.md
Please, commit your changes or stash them before you can switch branches.
Aborting
[thebeege@beegevm basic_programming_examples]$ git add -A
[thebeege@beegevm basic_programming_examples]$ git stash
Saved working directory and index state WIP on master: beb058c Moved examples into reference. Examples nao.
HEAD is now at beb058c Moved examples into reference. Examples nao.
```
```
[thebeege@beegevm basic_programming_examples]$ git checkout ko_KR
Switched to branch 'ko_KR'
```
```
[thebeege@beegevm basic_programming_examples]$ git remote
origin
```
```
[thebeege@beegevm basic_programming_examples]$ git branch -a
  ko_KR
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/ko_KR
  remotes/origin/master
```
