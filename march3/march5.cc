// Copyright 2026 240h
#include<iostream>
using std::cout;
using std::cin;
using std::endl;
#include"temperature.h"

void IsItCold(Temperature t) {
  if (t.GetValue() < 32)
    cout << "BRRRRRRRRRRR" << endl;
  else
    cout << "Nah" << endl;
}

int main() {
  Temperature t1;
  Temperature t2(50, "envelopes");
  Temperature t3(100, "Celsius");
  t1.SetUnit("Kelvin").SetValue(5);
  cout << t1.GetValue() << "\n" << t1.GetValue() << endl;
  cout << t2.GetValue() << "\n" << t2.GetValue() << endl;
  cout << t3.GetValue() << "\n" << t3.GetValue() << endl;
  IsItCold(Temperature(80));
  t3.Convert("Fahrenheit");
  cout << t3.GetValue() << " " << t3.GetUnit() << endl;
  t3.Convert("Kelvin");
  cout << t3.GetValue() << " " << t3.GetUnit() << endl;
  t3.Convert("Celsius")
  cout << t3.GetValue() << " " << t3.GetUnit() << endl;
  return 0;
}