VISUR: 
 - Inspired by vim, helix, tmux & screen, warp, intellij IDE, Notion, NeoVIM (Check these programs out to get more ideas)

Design Goals of Visur
 - Make a drop-in replacement for all of the above apps. Visur allows users to mix vim and a terminal emulator and a sophisticated IDE into one application. Only one set of hotkeys needed to memorize, and anyone familiar with VIM will be able to adjust quickly, with some major improvements on the VIM style. Using this keymap you'll be able to run all your normal VIM commands within a terminal, and so you can also run all your normal terminal commands. It will be built-in with a feature that allows decompiling binary files for reading and editing. You can bookmark your favorite directories and past terminal commands including their output. More than that, it will also allow users to ssh to servers and it will contain a history of all commands run, also it will let you easily copy and paste and edit files on the server without any rsync or scp commands required. If it appears in the viewport it will be eligible to edit and copy/paste between machines. Probably the most requested feature for VIM would be built-in syntax highlighting, compile-time debugging, class definitions/lookup, and many other IDE related features. NeoVIM tries to do this, but it requires heavy amounts of configuration and still requires Language servers installed on the local machine per programming language, and still leaves a lot to be desired compared to a standalone IDE like IntelliJ. Not only will visur have built-in support for all of this, but it also allows user-defined arbitrary and relationship-based definition lookup and links. There are many many other ideas and features that Visur will have which will be worth learning about after we have built the first prototype


Features inspired by:

IntelliJ IDE:
 - Class/Definition lookup
 - Project-wide refactor and rename variable/function/class and change signature
 - auto-complete based on programming language and pre-defined objects/variables

Helix:
 - auto-complete ':' commands inside editor
 - tutorial helper popup windows that show a list of possible commands
 - file picker which shows you contents of files you are browsing, and is very fast.
 - Revamped VIM keymap which optimizes and frees up more keys but still just as efficient.

Warp:
 - Ability to bookmark past terminal commands alongside their output and bookmark certain directories
 - Making blocks of commands

Notion:
 - Ability to seamlessly write to a document on one device and immediately be able to read changes and begin editing from a different device including tablets or smartphones.
 - Ability to preview .md files (tentative)

tmux & screen:
 - Ability to open multiple windows inside terminal within a remote machine (useful for viewing logs while debugging in a separate window)

New features:
 - Editing/navigation modes to switch between: character, word, sentence, paragraph, function, file, database
 - When Hyperbase is built: omnicient debugging, arbitrary graph-based relationships between files/text blocks/databases/directories
 - Viewport/command and output history. Capability of copying and pasting any text that appears in the viewport simply by highlighting, or clicking the block of text
 - Decompile and edit binary files

Other:
 - Syntax Highlighting
 - instant table format inside documents


Design:

 - Context: chracter, word, sentence, block/paragraph, document, database etc... 1-9 keys determine these
 - mapping: Make your own custom modes. Much easier to change keymaps than even vim is.
 - Macros: More powerful, with conditional logic. Create by doing. (What to do different in case there is a semi-colon or something)
 - client-server concept: Instead of how vim does it with a single application, having client-server means you can have multiple people editing the same file at once like google docs
 - Multiple clients: Browser client is first. In browser we'll use something like canvas, in the terminal we'll have a different client set up for that. Using canvas means we can actually have images and icons and things. 
   Browser client:
     - Views have to be stored on the server, but the client will keep track of what view it's currently assigned. 
     - At first just have one view per client, but over time we'll work to add windows and tabs and split views etc...
     - At first it asks who you are, then cookie is stored therafter every time you open a view.
 - Eventually we'll use hyperbase once lemon is done it will use that for it's database and file manager. For now we will just use system calls to open and edit files
 - You can make your own little game inside the editor while you're editing it.
 - It won't be as bloated as an ide, but not as small as vim. So around 1GB for normal usage. But you can go a lot higher if you do a lot of complex operations.
 - Live actions: Shell operations in the editor itself. The editor is your shell, and your shell is your editor. 
 - syntax parser, live syntax editing, and syntax inside of syntax: Manually define or automate defining multiple languages within languages, like MySQL within Java. If the ide is failing to support some syntax, you can manually switch to a view of the syntax editor itself, and you can edit that to tell visur what syntax to give something
 - IDE basics: 
   - Go to declaration, finding usages. Therafter we can work on refactor stuff like renaming objects and 
 - First we'll build the backend CRUD for documents. 
 - Second we'll design the frontend canvas which renders everything.

shift + v !ls
build
build.gradle.kts
goals.md
gradle
gradlew
gradlew.bat
LICENSE
README.adoc
settings.gradle.kts
src
