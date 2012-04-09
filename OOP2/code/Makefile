SRCDIR := src
DESTDIR := bin
SRCFILES := $(shell find $(SRCDIR) -type f -name "*.scala")

all: bin/lt/astrauskas/oop2/Demo.class run

run:
	scala -cp bin lt.astrauskas.oop2.Demo

compile: ${SRCFILES}
	scalac -d $(DESTDIR) $(SRCFILES)

bin/lt/astrauskas/oop2/Demo.class: compile
