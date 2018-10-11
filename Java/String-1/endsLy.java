public boolean endsLy(String str) {
   
   String s=str;
   int c=0,l=0;
   l=s.length();
   if(l>1)
   {
     if(s.charAt(l-1)=='y'&&s.charAt(l-2)=='l')
     c++;
     if(c==1)
     return true;
     else
     return false;
   }
   else if(l>0)
   return false;
   else 
   return false;
   
}