public boolean inOrder(int a, int b, int c, boolean bk) {
  return ((c>b&&b>a)||(bk&&c>b));
}
