# Reference

Installing git gives you the `git` command. You use this command to interact with the source control repository. We'll cover the various commands below. But first...

## Installing git
https://git-scm.com/downloads
Easy mode.

## Official documentation
https://git-scm.com/doc

## `git help`
The `help` command is by far the most useful. It allows provides instructions and context around git itself and all of its subcommands. If you learn nothing else, remember this. It is the gateway to all other git operations. Specifically, it's super useful to see the permitted flags for the various commands, which alter the behavior of the command and can make your life much easier.

## `git status`
The `status` command describes the current state of the repository to you. It shows you any changed files and files staged for commits. It's a good way to just check what's going on.

## `git init`
The `init` command initializes a git repository in the current directory. This creates the `.git` subdirectory, which contains the configuration file and your various commits. We'll cover what a commit is later. This command is basically how you get started.

## The .gitignore File
The `.gitignore` file is a special file you can create within the repository directory. Any files matching the patterns in this file will be ignored when performing various operations. Some examples include `*.class` for Java class files, `*.pyc` for compiled Python modules, and `bin/*` for compiled languages like C, C++, and Go. This generally just makes your life easier.

## `git add`
The `add` command adds files within the repository directory to the repository itself. Just placing a file within the directory doesn't cause git to traffic. Any new files or changed files need to be added before they can be committed. There's also the nifty `-A` flag you can add to this, which will add all changed, not ignored files.

## Okay, so what's a commit?
A commit is essentially a checkpoint. It's a snapshot in time of the state of your code. Make commits anytime you stop coding or hit a milestone, and make sure to add a meaningful message! Having a short summary of the purpose of code changes goes a long way when you're trying to track down when something was implemented. One of the most useful things about commits is that you can restore them at any giving moment, as if going back in time. You can also revert, or undo, commits in case something goes horribly wrong. Commits are what make SCM go. In git, commits are represented by a hash value, which you can use to reference a commit for all commands that take commits as arguments.

## `git commit`
The `commit` command is what creates a commit. This will store all added files into a new commit, making a snapshot of your code. The `-m` flag is super useful, as it takes a commit message as an argument. We strongly recommend this for the aforementioned reasons. There is also an `--amend` flag which allows you to alter commits if you made a typo in a commit message or forgot to tag it properly.

## `git log`
The `log` command shows you the history of your commits, indicating the commit hash, the commit message, and more. This is super useful if you've forgotten where you've left off or are just looking for more context.

## `git rm`
The `rm` command is short for "remove." This will delete files from both your filesystem and the git repository. To remove files only from the repository and not your filesystem, you can add ` -- ` after the `rm`. These will cause the files to be removed as part of the commit, when you make it.

## `git revert`
The `revert` command undoes the changes made by the commit hash you provide to it and creates a new commit to track this change. This is pretty much your "oops" button.

## `git checkout`
The `checkout` command takes in either a commit hash, a branch name, or both. It's a great way to see what the state of the source is at a different point in time. It basically takes the code at whatever commit and/or branch you specify and makes that the current state of your repository. You can also pass the `-b` flag to create a new branch, which we'll cover in a second. You can even check out remote copies of the repository; we'll cover remotes soon.

## What's a branch?
A branch is a way to separate commit paths, useful for experimentation or for implementing new features. They're an easy way to try things in a manner that takes little effort to abandon or adopt. Branches can be merged into one another, making it much easier to adopt changes from other code paths.

## `git branch`
This displays the branches on the repository and indicates your current branch. That's... pretty much it.

## `git merge`
The `merge` command merges the code from the branch you provide to it to your current commit. This is how you take your experimental or feature branches and bring them back into the main code path. Git will automatically merge any changes that have occurred in only one of the two branches. It will indicate to you changes that happened on both branches so that you can decide what version of the code you want going forward.

## `git remote`
The `remote` command lists out remote copies of the repository that your copy knows about. It features subcommands like `add`, which allow you to to manage remote copies. Remotes are useful when working on teams or using Github. You can `push` and `pull` from remote repositories to exchange commits among your copy and the desired remote.

## `git pull`
The `pull` command is actually a shortcut for the `fetch` and `merge` commands one after another. The `fetch` command grabs commits from another repository copy. By running `pull`, you're effectively merging code from a remote repository into your copy.

## `git push`
The `push` command is pretty much the opposite of `pull`. It takes your copy of the repository and updates the remote copy with your new commits. This only works when your copy is ahead of the remote, so you'll need to `pull` before `push` in case the remote has changed.
