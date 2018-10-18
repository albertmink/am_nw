Put those files in the following directory:
TEXMF/tex/latex/ianm

Path for ubuntu 16.04 lts with texlive installation:
/etc/texmf/tex/latex/ianm/

fedora 27

/usr/share/texlive/texmf-local/texmf-compat/texmf/tex/
----
Do not forget to add packages to global path
sudo texhash



alt. (fedora 28)
----
ask for location
kpsewhich -var-value=TEXMFHOME

place your styles there
cp -r tex/latex/ianm/ <destination>
