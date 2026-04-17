// Copyright 2026
// define a Temperature class
#ifndef _TEMPERATURE_H_
#define _TEMPERATURE_H_

#include<iostream>
using std::cout;
using std::end;
#include<string>

class Temperature {
 public: // one space in front of public/protected/private
 
  // constructor: called to set up and object with initial
    // values
    // NO return type of return statement
    // can have parameters
  //any constructor that can be called with exactly one argument, 
  // we'll mark as explicit to prevent implicit casting of that
  // one parameter type to an object
  explicit Temperature(double value = 70, string unit = "Fahrenheit");
  
  // destructor
  /*~Temperature() {
     cout << "destructor called for " << value_ << endl;
   } */
  
  // Set function / mutator function - for modifyinng the 
  // value of a private/protected data members
  // returns true if data member is changed to arg value
  // false if it is not
  void SetValue(double value);
  // returns the object the function was called on
  Temperature& SetUnit(string unit);
  bool Convert(string newunit);
  
  // == operator
  //if our operator takes an object of our class as the left
  // our class  t1 == t2  t1.operator == (t2);
  bool operator == (const Temperature right) const;
  //Get function / accessor function - return a copy
  // of the value of a private/protected data members
  // const after the parameter list means that this 
  // is a constant member function - won't change any
  // of the data members
  
  double GetValue() const {return value_;}
  string GetUnit() const {return unit_;}
  
 private:
  double value_;  // Google Style - give data members names
                  // with trailing underscore
  string unit_; //composition = when you have object (s) of
                // one class as data member (s) in another class
};

#endif