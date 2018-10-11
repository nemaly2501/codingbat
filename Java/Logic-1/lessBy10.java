public boolean lessBy10(int a, int b, int c) {
  return (Math.abs(a-b)>9||Math.abs(c-b)>9||Math.abs(a-c)>9);
}
