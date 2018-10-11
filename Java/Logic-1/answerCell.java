public boolean answerCell(boolean or, boolean om, boolean isAsleep) {
  if (!isAsleep)
  {if (om)
  return true;
  return (or==om);}
  return false;
}
