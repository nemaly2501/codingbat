public int[] make2(int[] a, int[] b) {
   int c[]= new int[2],z=0,i;
   for (i=0;i<a.length;i++,z++)
   if(z<2)
   c[z]=a[i];
   for (i=0;i<b.length;i++,z++)
   if(z<2)
   c[z]=b[i];

   return c;
}
