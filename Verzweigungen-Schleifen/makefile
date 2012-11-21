JAVAC=javac
JAVA=java
JCFLAGS= -cp src -d bin/
JRFLAGS= -cp bin 
all:
	$(JAVAC) $(JCFLAGS) $(JFLAGS) ./src/Zahlen.java
run:
	$(JAVAC) $(JCFLAGS) ./src/Zahlen.java
	$(JAVA) $(JRFLAGS) Test
doc:
	javadoc ./src/*.java -d ./doc
clean:
	rm ./bin/*
