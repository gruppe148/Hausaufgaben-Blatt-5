JAVAC=javac
JAVA=java
JCFLAGS= -cp ".:src" -d bin/
JRFLAGS= -cp ".:bin" 
all:
	$(JAVAC) $(JCFLAGS) $(JFLAGS) ./src/MediaPlayer.java
run:
	$(JAVAC) $(JCFLAGS) ./src/MediaPlayer.java
	$(JAVA) $(JRFLAGS) MediaPlayer
doc:
	javadoc *.java -d ./doc
clean:
	rm ./bin/*
