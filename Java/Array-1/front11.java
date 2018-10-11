public int[] front11(int[] a, int[] b) {
  int n=0,i=0;
  if(a.length>0)
  n++;
  if(b.length>0)
  n++;
  int c[]=new int[n];
   if(a.length>0){
  c[i]=a[0];i++;}
  if(b.length>0)
  c[i]=b[0];
return c;  
}


