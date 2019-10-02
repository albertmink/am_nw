# Content 

* java latex slides, uebXY.tex
* java latex din A4 arbeitsblattXY.tex

* local KIT latex templates in texmf
* special exercise.sty for slides in templatesSlide/ dir

* latexmkrc defines relative path for latex templates

# Compile your latex slide

* latexmk -pdf ueb01.tex

# Compile your latex arbeitsblatt

* latexmk -pdf arbeitsblatt01.tex

# Details on latexmk

* The ouput of the latex compilation is written in directory __out/__

* Remove all tmp files from previous latex compilation
__latexmk -c__

* Compile all .tex files in current directory
__latexmk -pdf__
