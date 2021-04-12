main: compile run

compile:
	javac -d bin/ Main.java
	jar cvfm Main.jar manifest.txt -C bin .

run: compile
	java Main 

clean: 
	find . -type f -name "*.class" | xargs rm -f
	find . -type f -name "*.jar" | xargs rm -f


