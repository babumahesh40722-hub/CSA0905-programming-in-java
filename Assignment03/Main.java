import java.io.*;
public class Main {public static void main(String[]a){try(BufferedReader r=new BufferedReader(new StringReader("first\nsecond\nthird"))){String line;int n=0;while((line=r.readLine())!=null){n++;System.out.println(n+": "+line);}}catch(IOException e){System.err.println("Read failed: "+e.getMessage());}}}
