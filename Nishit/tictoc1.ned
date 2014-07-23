//
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
        n1: Txc1;
        n2: Txc1;
	n3: Txc1;
	n4: Txc1;
	n5: Txc1;
	n6: Txc1;
        n7: Txc1;
	n8: Txc1;
	n9: Txc1;
	n10: Txc1;
	
    connections:
        
	n1.out --> {  delay = 100ms; } --> n2.in;
	n2.out --> {  delay = 100ms; } --> n3.in;
	n3.out --> {  delay = 100ms; } --> n4.in;
	n4.out <--> {  delay = 100ms; } --> n5.in;
	n4.out <--> {  delay = 100ms; } --> n6.in;
	n5.out --> {  delay = 100ms; } --> n7.in;
	n6.out --> {  delay = 0ms; } --> n8.in;	
	n7.out --> {  delay = 100ms; } --> n9.in;
	n8.out --> {  delay = 100ms; } --> n9.in;
	n9.out --> {  delay = 100ms; } --> n10.in;
	n10.out --> {  delay = 100ms; } --> n1.in;
}