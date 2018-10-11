public int teaParty(int tea, int ca) {
  if(tea<5||ca<5)
  return 0;
  if(tea>=2*ca||ca>=2*tea)
  return 2;
  return 1;
  
  
}
