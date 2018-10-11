public String fizzString(String s) {
  if(s.startsWith("f")&&s.endsWith("b"))
  return "FizzBuzz";
  if(s.startsWith("f"))
  return "Fizz";
  if(s.endsWith("b"))
  return "Buzz";
  return s;
}
