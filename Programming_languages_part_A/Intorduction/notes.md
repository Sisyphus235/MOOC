# Overview  
* Programming thinking should alow one to code in any language freely and decently.  
需要学习fundamental concepts of programming，而不是某种programming language.  
* peer assessment很重要，相似能力的人是最容易碰撞出学习的激情共同提高的，不仅在我自己的教师生涯中有体会，极限编程（XP）也提倡结对coding。  
coding很重要的是要有intellectual curiosity，解决一个问题也许并没有那么困难，更重要的是想不通的解决方案，改变问题context如何解决。比如实现了在一个list中找到两个数，他们的和等于预期值之后，能不能实现三个数的和等于预期值，四个数、五个数呢？其中的pattern是什么？ 
* 这位教授传递的一个重要思想就是as neat as possible，我想这也是coding的一个好习惯。class，function等等概念都是为了复用代码，一个好的架构能够极大的减轻工作量，使得coding robust。   
> 好久不用全英文听课了，既可以学习programming，又可以保持英语的熟练度。  

# About the professor  
> 很多人也许会选择跳过这个部分，但我认为教学是互动过程，没有一个人是perfect的，了解授课人的特点，更能帮助我知道课程中他可能出问题的地方在哪，我应该在什么样的位置纠错，和其他人不同，我觉得这是提高我教学效率很重要的一个环节。  

# Initial Motivation  
* 课程的语言可能看起来很奇怪，但是作为学生需要一点信心，不仅是相信教授，而且相信前人经验。这些看起来奇怪的设置是为了更好的澄清概念和作用，以便后续可以更好的掌握coding。  
* 这门课的目的是为了建立“肌肉记忆”和基本技能。  
* Part A要用一个很传统的ML language，很少有人使用过。  

# Recommended Background  
* 针对于有编程经验的人，不是高级课程，适合想要了解不同语言背后的核心机制。  

# Why Three parts  
* Mainly reason is that it takes about 100 to 200 hours of amazing stuff. 虽然是三门课，但结构上是统一的，拆成三门课是一个痛苦的过程，如果想要对programming language有一个深入的了解，强烈建议全程参与三门课，可能会很辛苦，但收获也是成正比的。  

# Grades  
* 80%的threshold，但是可以多次提交，限额是每天一次。  
* peer assessment很重要，能够找出他人代码的问题是很重要的学习过程，同时也能学习到他人好的代码部分。  

"once you get beyond one or two homeworks, the course approach can feel much more comfortable and rewarding, though we hope you find all of it enjoyable."  

Standard ML (SML; "Standard Meta Language") is a general-purpose, modular, functional programming language with compile-time type checking and type inference. It is popular among compiler writers and programming language researchers, as well as in the development of theorem provers.  

推荐使用Emacs作为IDE，做自动缩进等工作，方便开发。
Mac版本下载地址：http://emacsformacosx.com/.  
Resources:  
- http://www.gnu.org/software/emacs/tour/  
- http://www.gnu.org/software/emacs/manual/html_node/emacs/index.html   
- http://www.emacswiki.org/  

安装SML/NJ：  
Mac版本方法： http://www.smlnj.org/dist/working/110.80/


# Emacs快捷键：  
The most important commands in Emacs:
C-x C-c: Quit Emacs
C-g: Cancel the current action
C-x C-f: Open a file (whether or not it already exists)
C-x C-s: Save a file
C-x C-w: Write a file (probably more familiar to you as Save as...)
Cut, copy, paste:

Highlight text with the mouse or by hitting C-Space to set a mark and then moving the cursor to highlight a region.
C-w: Cut a highlighted region
M-w: Copy a highlighted region
C-k: Cut (kill) from the cursor to the end of the line
C-y: Paste (yank)
Some other useful commands:

C-x 2: Split the window into 2 buffers, one above the other (Use the mouse or C-x o to switch between them)
C-x 0: Undo window-splitting so there is only 1 buffer
C-x b: Switch to another buffer by entering its name
C-x C-b: See a list of all current buffers
Getting help within Emacs: In addition to the help button/menu on the right...

C-h: Hitting this will display a short message in the minibuffer: \verb|C-h (Type ? for further options)|C-h(Type?forfurtheroptions).
C-h b: Key bindings. This lists all key bindings that are valid for the current mode. Note that key bindings change from mode to mode.
C-h a: Command apropos. After typing \verb|C-h|C-h a you can type a symbol and a buffer will appear that lists all symbols and functions that match that phrase.


