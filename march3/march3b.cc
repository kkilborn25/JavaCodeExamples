// Copyright 2026 240H
// test functionality of the Tempertature class 
#include<iostream>
using std::cout;
using std::cin;
using std::endl;
#include"temperature.h"

int main() {
  // instantiating an object, t, of the Temperature class
  // class - declaring with no arguments automatically
  // calls the default constructor
  {
    const Temperature t;
	cout << t.GetValue() << endl;
  } // destructor for t called
  Temperature t2;
  t2.SetValue(80);
  cout << t2.GetValue() << endl;
  Temperature t3(50);
  cout << t3.GetValue() << endl;
  return 0;
}