public boolean parrotTrouble(boolean talking, int hour) {
  if(talking==true&&(hour<7||hour>20))
  return true;
  else return false;
}

// return (talking && (hour < 7 || hour > 20));