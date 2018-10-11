public int caughtSpeeding(int sp, boolean is) {
  if (sp<=60||(sp<=65&&is==true))
  return 0;
  if(sp>60&&sp<=81||(sp<=85&&is==true))
  return 1;
  return 2;
}
