/
// This file is part of an OMNeT++/OMNEST simulation example.
//
// Copyright (C) 2003 Ahmet Sekercioglu
// Copyright (C) 2003-2008 Andras Varga
//
// This file is distributed WITHOUT ANY WARRANTY. See the file
// `license' for details on this and other legal matters.
//


simple Txc1
{
    gates:
        input in;
        output out;
}

//
// Two instances (tic and toc) of Txc1 connected both ways.
// Tic and toc will pass messages to one another.
//
network Tictoc1
{
    submodules:
        tic: Txc1;
        toc: Txc1;
	tac: Txc1;
    connections:
        tic.out --> {  delay = 100ms; } --> toc.in;
 	toc.out --> {  delay = 100ms; } --> tac.in;
        tic.in <-- {  delay = 100ms; } <-- tac.out;
}