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
        input in1;
	  input in2;
        output out1;
	  output out2;
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
        n1.out1 --> {  delay = 100ms; } --> n2.in1;
	  n2.out1 --> {  delay = 100ms; } --> n3.in1;
	  n3.out1 --> {  delay = 100ms; } --> n4.in1;
	  n3.out2 --> {  delay = 0ms; } --> n5.in1;
        n4.out1 --> {  delay = 100ms; } --> n6.in1;
	  n5.out1 --> {  delay = 0ms; } --> n7.in1;
	  n6.out1 --> {  delay = 100ms; } --> n8.in1;
	  n7.out1 --> {  delay = 0ms; } --> n8.in2;
	  n8.out1 --> {  delay = 100ms; } --> n9.in1;
	  n9.out1 --> {  delay = 100ms; } --> n10.in1;
	 // n10.out1 --> {  delay = 100ms; } --> n1.in1;
	  
        //tic.in <-- {  delay = 100ms; } <-- toc.out;
}

