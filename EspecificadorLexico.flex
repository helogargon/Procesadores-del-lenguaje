import java.io.*;
import java.util.*;

%%

%{
	private BufferedWriter bw;
%}
%init{
	try{
		bw = new BufferedWriter(new FileWriter("salida.html"));
	}catch(IOException ioe){
		System.out.println("File not exist");
	}
%init}

%eof{
	try{
		bw.close();
	}catch(IOException ioe){System.out.println("Error");}
%eof}


%standalone

%%
