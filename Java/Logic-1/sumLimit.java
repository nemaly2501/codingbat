public int sumLimit(int a, int b) {
  String s=String.valueOf(a),s1=String.valueOf(a+b);
  if (s.length()<s1.length())
  return a;
  return a+b;
}
