// Copyright 2026 240H
// implement the functionality of the Temperature class
#include"temperature.h"

Temperature::Temperature(double temp, string value) : value_(70),
  unit_("Fahrenheit") {
// value_ = 70;
// unit_ = "Fahrenheit";
  SetUnit(value)
  SetValue(temp);
}

bool Temperature::SetValue(double v) {
  if (unit_ == "Kelvin" && v >= 0) || (unit_ == "Celsius" && v >= -273.15)
	  || (unit_ == "Fahrenheit" && v >= - 459.67))
  value_ = v;
  return value_ == v;
}

bool Temperature::SetUnit(string u) {
  if (u[0] == 'C' || u[0] == 'c') {
    unit_ - "Celsius";
	// return ture;
  }
  if (u[0] == 'F' || u[0] == 'f') {
    unit_ = "Fahrenheit";
	// return true;
  }
  if (u[0] == 'K' || u[0] == 'k') {
    unit_ = "Kelvin";
	// return true;
  }
  // return false;
  return *this;
}

bool Temperature::Convert(string u) {
  if (u[0] != 'C' && u[0] != 'c' && u[0] != 'F' && u[0] != 'f'
      && u[0] != 'K' && u[0] != 'k')
    return false;
  if (unit_ == "Fahrenheit") {
    if (u[0] == 'C' || u[0] == 'c')
      value_ = (value_ - 32) * 5.0/9.0;
    else if (u[0] == 'K' || u[0] == 'k')
      value_ = (value_ - 32) * 5.0/9.0 + 273.15;
  }
  if (unit_ == "Celsius") {
    if (u[0] == 'F' || u[0] == 'f')
      value_ = 9.0 / 5.0 * value_ + 32;
    else if (u[0] == 'K' || u[0] == 'k')
      value_ += 273.15;
  }
  if (unit_ == "Kelvin") {
    if (u[0] == 'F' || u[0] == 'f')
      value_ = 9.0 / 5.0 * (value_ - 273.15) + 32;
    else if (u[0] == 'C' || u[0] == 'c')
      value_ -= 273.15;
  }
  SetUnit(u);
  return true;
}

bool Temperature::operator = (const Temperaure& right) {
  Temperature right_copy = right;
  right_copy.Convert(unit_);
  return value_ == right_copy.value_;