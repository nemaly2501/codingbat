public boolean unlucky1(int[] n) {
  return((n.length>1)&&((n[0]==1&&n[1]==3)||(n[1]==1&&n[2]==3)||n[n.length-2]==1&&n[n.length-1]==3));
}
