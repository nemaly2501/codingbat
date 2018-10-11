public int[] fix23(int[] n) {
 for(int i=0;i<2;i++)
 if(n[i]==2&&n[i+1]==3)
 n[i+1]=0;
 return n;
}
