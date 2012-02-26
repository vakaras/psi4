SRCDIR := src
DESTDIR := bin
SRCFILES := $(shell find $(SRCDIR) -type f -name "*.scala")

run: bin/lt/astrauskas/oop1/Demo.class
	scala -cp bin lt.astrauskas.oop1.Demo

compile: ${SRCFILES}
	scalac -d $(DESTDIR) $(SRCFILES)

bin/lt/astrauskas/oop1/Demo.class: compile
