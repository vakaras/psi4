SRCDIR := src
DESTDIR := bin
SRCFILES := $(shell find $(SRCDIR) -type f -name "*.scala")

all: bin/lt/astrauskas/oop3/Demo.class run

run:
	scala -cp bin lt.astrauskas.oop3.Demo

compile: ${SRCFILES}
	scalac -d $(DESTDIR) $(SRCFILES)

bin/lt/astrauskas/oop3/Demo.class: compile
