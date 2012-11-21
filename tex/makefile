TEX=xelatex
TEXFLAGS=--shell-escape 

export openout_any=a

all:
	$(TEX) $(TEXFLAGS) PSE_2012_U_5_Sl_19_Grp_148.tex
open:
	$(TEX) $(TEXFLAGS) PSE_2012_U_5_Sl_19_Grp_148.tex && open PSE_2012_U_5_Sl_19_Grp_148.pdf
all3:
	$(TEX) $(TEXFLAGS) PSE_2012_U_5_Sl_19_Grp_148.tex && $(TEX) $(TEXFLAGS) PSE_2012_U_5_Sl_19_Grp_148.tex && $(TEX) $(TEXFLAGS) PSE_2012_U_5_Sl_19_Grp_148.tex
clean:
	rm PSE_2012_U_5_Sl_19_Grp_148.{pdf,aux,log}
