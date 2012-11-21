TEX=xelatex
TEXFLAGS= 

all:
	$(TEX) $(TEXFLAGS) Verzweigungen-Schleifen.tex
open:
	$(TEX) $(TEXFLAGS) Verzweigungen-Schleifen.tex && open Verzweigungen-Schleifen.pdf
all3:
	$(TEX) $(TEXFLAGS) Verzweigungen-Schleifen.tex && $(TEX) $(TEXFLAGS) Verzweigungen-Schleifen.tex && $(TEX) $(TEXFLAGS) Verzweigungen-Schleifen.tex
clean:
	rm Verzweigungen-Schleifen.{pdf,aux,log}
