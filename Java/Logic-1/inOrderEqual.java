public boolean inOrderEqual(int a, int b, int c, boolean e) {
  return ((c>b&&b>a)||(e&&c>=b&&c>=a));
}
