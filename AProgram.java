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
    char a=' ';
    int len=in.length();
    char[] A= in.toCharArray();
    for (i=0;i<len;i++){
      if ((int)A[i]>64) a=A[i];//System.out.print(a=A[i]);
      else if ((int)A[i]<64){
        int m=append(0,A);
        while(--m>=0) System.out.print(a);
      }
    }
  }
  int append(int n, char [] A){
    int m=(n*10)+((int)A[i])-48;
    if (i+1<A.length && (int)A[i+1]<64) {
      i=i+1;
      m=append(m, A);
    }
    return m;
  }
}