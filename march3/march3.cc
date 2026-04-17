// Copywrite 2026 kkilborn
#include<iostream>
using std::cout;
using std::cin;
using std::endl;
#include<fstream>
using std::ifstream;

// for user-defined types, style is to name with an 
// initial uppercase character
// class Point {
// public:
struct Point {
 public:
  double x;
  double y;
}; // semicolon required

int main() {
  Point p; 
  cout << "(" << p.x << "," << p.y << ")" << endl;
  Point * ptr = &p;
  (*ptr).x = 5;
  ptr->y = 8; //ptr->y is the same as (*ptr).y
  cout << "(" << p.x << "," << p.y << ")" << endl;
  return 0;
}
/*
                    // either char * [] or char **
int main(int argc, char * * argv[]) {
  if (argc < 2)
    cout << "Run this with a file name!" << endl;
  else {
    ifstream infile(argv[1]);
	char c;
	while (infile.good() ) {
      // infile >> c;
	  c = infile.get
	  cout << c;
    }
  cout << argc << endl;
  for (int i = 0; i < argc; ++i)
    cout << argv[i] << endl;
  return 0;
}
*/