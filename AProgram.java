/* 
	In an input string print each English Alphabet characters, the number of times 
given immediately next to the characters.

Example :
Input : d3h12
Output: dddhhhhhhhhhhhh
*/

package pattern;
class AProgram{
  int i=0;
  void printout(String in){
    AProgram ap=new AProgram();
    char a=' ';
    int len=in.length();
    char[] A= in.toCharArray();
    for (ap.i=0;ap.i<len;ap.i++){
      if ((int)A[ap.i]>64) System.out.print(a=A[ap.i]);
      else if ((int)A[ap.i]<64){
        int m=ap.append(0,ap,A);
        while(--m>0) System.out.print(a);
      }
    }
  }
  int append(int n,AProgram ap, char [] A){
    int m=(n*10)+((int)A[ap.i])-48;
    if (i+1<A.length && (int)A[ap.i+1]<64) {
      ap.i=ap.i+1;
      m=append(m,ap, A);
    }
    return m;
  }
}