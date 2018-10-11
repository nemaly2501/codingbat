public String alarmClock(int da, boolean va) {
  if(da>=1&&da<6&&va==true)
  return "10:00";
  if(da>=1&&da<6&&va==false)
  return "7:00";
  if (!va)
  return "10:00";
  return "off";
}
